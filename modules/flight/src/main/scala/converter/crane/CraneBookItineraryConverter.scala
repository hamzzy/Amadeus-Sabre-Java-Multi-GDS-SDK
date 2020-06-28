package flight.converter.crane

import java.math.BigInteger
import java.time.{LocalDate, LocalDateTime, LocalTime, ZoneId}

import flight.converter.Converter
import flight.dto.entity.{Airlines, _}
import wsimport.lib.epower.BookFlight.OTAAirBookRQ
import wsimport.lib.epower.TravelerInfoType.AirTraveler
import wsimport.lib.epower._

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import wsimport.lib.epower.TicketType
import dto.BookingStatus
import dto.entity.enums.{Gender, PassengerCode}
import flight.converter.crane.pojo._

import scala.xml.XML

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object CraneBookItineraryConverter extends Converter[CraneBookFlight, PNRDetails] {

  @throws[Exception]
  def encrypt(x: String): Array[Byte] = {
    val d = java.security.MessageDigest.getInstance("SHA-1")
    d.reset()
    d.update(x.getBytes)
    d.digest()
  }

  override def toSupplier(baseDto: AnyRef): CraneBookFlight = {
    val bookingRequest = baseDto.asInstanceOf[BookingRequest]
    val craneHeader: CraneHeader = CraneHeaderBuilder.createInstance
    CraneBookFlight(
      craneHeader = craneHeader,
      segments = createOriginDestination(bookingRequest),
      travellers = createTravellerInfo(bookingRequest)._1,
      infantTraveller = createTravellerInfo(bookingRequest)._3,
      contactInfo = createTravellerInfo(bookingRequest)._2
    )
  }

  private[this] def createOriginDestination(bookingRequest: BookingRequest): List[CraneSegment] = bookingRequest.getOwcItinerary.map(segment => CraneSegment(
    cabin = segment.cabin,
    resBookDesigCode = segment.resBookDesigCode,
    resBookDesigQuantity = segment.resBookDesigQuantity,
    craneFareInfo = CraneFareInfo(
      cabinClassCode = segment.pricingInfoWSResponse.cabinClassCode,
      fareGroupName = segment.pricingInfoWSResponse.fareGroupName,
      fareReferenceCode = segment.pricingInfoWSResponse.fareReferenceCode,
      fareReferenceID = segment.pricingInfoWSResponse.fareReferenceID,
      fareReferenceName = segment.pricingInfoWSResponse.fareReferenceName,
      flightSegmentSequence = segment.pricingInfoWSResponse.flightSegmentSequence,
      resBookDesigCode = segment.resBookDesigCode
    ),
    flightSegmentXML = segment.airItineraryWSResponse.originDestinationWSResponses.head.segmentsXml
  ))

  private[this] def convertPassCode(code: PassengerCode) = code match {
    case PassengerCode.ADULT => "ADLT"
    case PassengerCode.CHILD => "CHLD"
    case PassengerCode.INFANT => "INFT"
  }

  private def createTravellerInfo(bookingRequest: BookingRequest): (List[CraneTravellerPNR], CraneContactInfo, Option[List[CraneTravellerInfantPNR]]) = {
    val passengers: List[Passenger] = bookingRequest.passengers
    val infantTravelers = passengers.count(_.code.equals(PassengerCode.INFANT))
    val airTravelers = passengers.filterNot(_.code.equals(PassengerCode.INFANT)).zipWithIndex.map { x =>
      val (item, index) = x
      val dob = LocalDateTime.of(item.birthDate.toLocalDate, LocalTime.now)
      val month = if(dob.getMonthValue < 10){s"0${dob.getMonthValue}"}else dob.getMonthValue.toString
      val day = if(dob.getDayOfMonth < 10){s"0${dob.getDayOfMonth}"}else dob.getDayOfMonth
      CraneTravellerPNR(
        title = item.namePrefix,
        firstName = item.givenName,
        middleName = item.middleName,
        lastName = item.surname,
        dob = s"${dob.getYear}-$month-$day",
        gender = item.gender.value(),
        ageCategory = convertPassCode(item.code),
        attacheInfant = item.code.equals(PassengerCode.ADULT) && infantTravelers > index
      )
    }
    (airTravelers, CraneContactInfo(email = bookingRequest.passengers.head.contactEmail,
      firstName = airTravelers.head.firstName,
      title = airTravelers.head.title,
      lastName = airTravelers.head.lastName,
      countryCode = bookingRequest.passengers.head.countryAccessCode,
      phone = bookingRequest.passengers.head.contactPhone), None)
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRDetails = {
    val otaBookRS = response.asInstanceOf[String]
    val xml = XML.loadString(otaBookRS)


    val bookingRequest = request.asInstanceOf[BookingRequest]
    val pnrDetails = new PNRDetails()
    pnrDetails.setResponseXml(otaBookRS)
    val pricingInfoWSResponse = bookingRequest.itineraryWSResponse.pricingInfoWSResponse
    bookingRequest.itineraryWSResponse.setPricingInfoWSResponse(pricingInfoWSResponse)
    pnrDetails.setBookingRequest(bookingRequest)
    pnrDetails.setGdsPlainResponse(otaBookRS)
    pnrDetails.setTicketAmount(BigDecimal(xml \ "Body" \ "CreateBookingResponse" \ "AirBookingResponse" \ "airBookingList" \ "ticketInfo" \ "totalAmount" \ "value" text))
    pnrDetails.setItineraryRef(xml \ "Body" \ "CreateBookingResponse" \ "AirBookingResponse" \ "airBookingList" \ "airReservation" \ "bookingReferenceIDList" \ "ID" text)
    pnrDetails.setAirlineRef(xml \ "Body" \ "CreateBookingResponse" \ "AirBookingResponse" \ "airBookingList" \ "airReservation" \ "bookingReferenceIDList" \ "referenceID" text)
    pnrDetails.setTicketTimeLimit(xml \ "Body" \ "CreateBookingResponse" \ "AirBookingResponse" \ "airBookingList" \ "airReservation" \ "ticketTimeLimit" text)
    pnrDetails.setStatus(Option(xml \ "Body" \ "CreateBookingResponse" \ "AirBookingResponse" \ "airBookingList" \ "airReservation" \ "bookingReferenceIDList" \ "ID" text) match {
      case _ @Some(_) => BookingStatus.SUCCESS
      case _ => BookingStatus.FAILED
    })
    pnrDetails
  }

  private def calculatePercentage(amount: Double, percentage: Double) = (amount / 100.0D) * percentage

}
