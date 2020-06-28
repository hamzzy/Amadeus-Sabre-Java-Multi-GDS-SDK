package flight.converter.amadeus.epower

import java.math.BigInteger
import java.text.SimpleDateFormat
import java.time.ZoneId
import java.util.Date

import flight.converter.Converter
import flight.dto.entity.{Airlines, _}
import flight.dto.utils.AirlineGetter
import wsimport.lib.epower.ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption
import wsimport.lib.epower.CreateTicket.OTAAirBookRQ
import wsimport.lib.epower.BookResponse.BookBasketRS.FullFilment
import wsimport.lib.epower.Cancel.OTACancelRQ
import wsimport.lib.epower.TravelerInfoType.AirTraveler
import wsimport.lib.epower._
import org.apache.commons.lang3.text.WordUtils

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import wsimport.lib.epower.TicketType
import dto.BookingStatus
import dto.entity.enums.{Gender, PassengerCode}
import dto.enums.Supplier
import flight.converter.amadeus.epower.EPowerAmadeusBookItineraryConverter.supplierConfigs
import flight.invoker.amadeus.epower.EPowerBookItineraryInvoker.supplierConfigs
import javax.xml.datatype.{DatatypeFactory, XMLGregorianCalendar}
import org.apache.commons.codec.digest.DigestUtils

import scala.collection.immutable

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object EPowerAmadeusIssueTicketConverter extends Converter[CreateTicket, PNRIssueTicketResponse] with EPowerHeader {

  override def toSupplier(baseDto: AnyRef): CreateTicket = {
    val bookingRequest = baseDto.asInstanceOf[PNRIssueTicketRequest]
    val createTicket = new CreateTicket
    val otaAirBookRQ = new OTAAirBookRQ
    val uniqueIDType = new UniqueIDType
    uniqueIDType.setIDContext(bookingRequest.pnrRef)
    otaAirBookRQ.setBookingReferenceID(uniqueIDType)
    otaAirBookRQ.setTravelerInfo(createTravellerInfo(bookingRequest.travellers))
    bookingRequest.supplierFallbackRef match {
      case Some(fallbackRef) => {
        val wsSecurityNo = supplierConfigs(ConstKey.E_CLIENTID).configValue
        otaAirBookRQ.setReferenceNumber(s"$fallbackRef")
        otaAirBookRQ.setControlNumber(DigestUtils.sha1Hex(s"$fallbackRef$wsSecurityNo"))
        createTicket.setSessionId(bookingRequest.supplierSessionId.get)
      }
      case None =>
    }
    createTicket.setOTAAirBookRQ(otaAirBookRQ)
    createTicket
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRIssueTicketResponse = {
    val createTicketResponse = response.asInstanceOf[CreateTicketResponse]
    createTicketResponse.getOTAAirBookRS.getErrorsOrSuccessOrWarnings.map {
      case errorType: ErrorsType => PNRIssueTicketResponse(
        sessionId = createTicketResponse.getSessionId,
        errors = errorType.getError.toVector.map(error => Error(code = error.getCode, message = error.getShortText)),
        priceChargeRequired = errorType.getError.toVector.exists(_.getNodeList.equals("BOOK_WITH_PRICECHARGE")),
        priceChargeFallback = Option(createTicketResponse.getOTAAirBookRS.getReferenceNumber)
      )
      case successType: SuccessType => PNRIssueTicketResponse(
        status = "somestatus",
        sessionId = createTicketResponse.getSessionId,
        originDestinationWSResponses = createTicketResponse.getOTAAirBookRS.getAirReservation.getAirItinerary.getOriginDestinationOptions.getOriginDestinationOption.toVector.map { originDestination =>
          val originDestinationResponse = new OriginDestinationWSResponse()

          originDestinationResponse
        },
        passengers = createTicketResponse.getOTAAirBookRS.getAirReservation.getTravelerInfo.getAirTraveler.toVector.map(traveller => Passenger(

        )),
        pnrRef = createTicketResponse.getOTAAirBookRS.getAirReservation.getBookingReferenceID.head.getIDContext
      )
      case warningType: WarningsType => PNRIssueTicketResponse(sessionId = createTicketResponse.getSessionId)
    } head
  }

  private def createTravellerInfo(passengers: Seq[Passenger]): TravelerInfoType = {
    val travelerInfoType = new TravelerInfoType
    val airTravelers = passengers.map { item =>
      val airTraveler = new AirTraveler
      airTraveler.setPassengerTypeCode(item.code.value())
      val personName = new PersonNameType
      personName.getNamePrefix.add(item.namePrefix)
      if (item.middleName.isDefined) personName.getMiddleName.add(item.middleName.orNull) //"'orNull' for null exception saftey"
      personName.getGivenName.add(item.givenName)
      personName.setSurname(item.surname)
      airTraveler.setPersonName(personName)
      item.docInfo match {
        case Some(doc) => {
          val docType = new AirTravelerType.Document
          docType.setDocType("Passport")
          docType.setDocID(doc.passportNo)
          docType.setDocIssueCountry(doc.issueCountryCode)
          docType.setExpireDate(EPowerAmadeusBookItineraryConverter.xmlDate(new SimpleDateFormat("yyyy-MM-dd").parse(doc.passportExpDate)))
          airTraveler.getDocument.add(docType)
        }
        case _ =>
      }
      val phoneType = new AirTravelerType.Telephone
      phoneType.setRPH(item.rph)
      phoneType.setPhoneNumber(item.contactPhone)
      val emailType = new AirTravelerType.Email
      emailType.setEmailType("1")
      emailType.setValue(item.contactEmail)
      airTraveler.getEmail.add(emailType)
      airTraveler.getTelephone.add(phoneType)
      val dob = Date.from(item.birthDate.atZone(ZoneId.systemDefault()).toInstant)
      airTraveler.setBirthDate(EPowerAmadeusBookItineraryConverter.xmlDate(dob))
      airTraveler
    }
    travelerInfoType.getAirTraveler.addAll(airTravelers)
    travelerInfoType
  }

}
