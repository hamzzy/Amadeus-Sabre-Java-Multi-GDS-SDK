package flight.converter.amadeus.tripxml

import java.time.LocalDateTime
import java.util.GregorianCalendar

import dto.BookingStatus
import dto.entity.enums.PassengerCode
import flight.converter.Converter
import flight.dto.entity._
import javax.xml.datatype.{DatatypeConfigurationException, DatatypeFactory, XMLGregorianCalendar}
import org.apache.commons.lang3.text.WordUtils
import wsimport.lib.amadeus.travelbuild._

import scala.collection.JavaConverters._
import scala.collection.JavaConversions._
/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 8:35 PM.
  */

object AmadeusBookItineraryConverter extends Converter[OTATravelItineraryRQ, PNRDetails] {

  override def toSupplier(baseDto: AnyRef): OTATravelItineraryRQ = {
    val bookingRequest = baseDto.asInstanceOf[BookingRequest]
    val pricedItineraryWSResponseInterface = bookingRequest.getItineraryWSResponse
    val wsTravelBuildV03: WsTravelBuildV03 = new WsTravelBuildV03
    wsTravelBuildV03.getWsTravelBuildV03Soap
    val otaTravelItineraryRQ: OTATravelItineraryRQ = new OTATravelItineraryRQ
    val pos: POS = POSBuilder.createInstance
    val otaAirBookRQ: OTAAirBookRQ = new OTAAirBookRQ
    val airItinerary: AirItinerary = new AirItinerary
    val originDestinationOption: ArrayOfArrayOfFlightSegment = new ArrayOfArrayOfFlightSegment

    val airItineraryRS: AirItineraryWSResponse = pricedItineraryWSResponseInterface.getAirItineraryWSResponse
    val originDestinationRS = airItineraryRS.originDestinationWSResponses

    var index = 1
    val originDestinationOptions = originDestinationRS.map { originDS =>
      val (arrayOfFlightSegment, lastRPH) = createArrayOfFlightSegment(originDS.getFlightSegmentWSResponses, index)
      index = lastRPH
      arrayOfFlightSegment
    }
    originDestinationOption.getOriginDestinationOption.addAll(originDestinationOptions.asJava)

    val directionIndicator: String = pricedItineraryWSResponseInterface.getAirItineraryWSResponse.directionIndicator

    airItinerary.setDirectionInd(AirItineraryDirectionInd.fromValue(directionIndicator))

    airItinerary.setOriginDestinationOptions(originDestinationOption)

    otaAirBookRQ.setAirItinerary(airItinerary)

    val travelers: List[Traveler] = bookingRequest.getPassengers.toList.map(passenger => createTraveler(passenger = passenger))

    val telephones: wsimport.lib.amadeus.travelbuild.Telephone = createTelephone(bookingRequest.getPassengers.head)

    val ticketing: Ticketing = createTicketing(pricedItineraryWSResponseInterface.getTicketingInfoWSResponse)

    val pnrData: PNRData = createPNRData(travelers, telephones, ticketing, bookingRequest.getPassengers.head.contactEmail)

    val price: String = WordUtils.capitalize(pricedItineraryWSResponseInterface.getPricingInfoWSResponse.getPricingSource)
    val priceData: PriceData = createPriceData(price, pricedItineraryWSResponseInterface.getAirlineCode)

    val publishedFares: PublishedFares = new PublishedFares
    val fareRestrict: FareRestrictPref = new FareRestrictPref
    val advResTicketing: AdvResTicketing = new AdvResTicketing
    val minimumStay: MinimumStay = new MinimumStay
    val maximumStay: MaximumStay = new MaximumStay
    val voluntaryChanges: VoluntaryChanges = new VoluntaryChanges

    advResTicketing.setAdvReservation(new AdvReservation)
    voluntaryChanges.setPenalty(new Penalty)

    fareRestrict.setAdvResTicketing(advResTicketing)
    fareRestrict.setVoluntaryChanges(voluntaryChanges)
    fareRestrict.setMinimumStay(minimumStay)
    fareRestrict.setMaximumStay(maximumStay)

    publishedFares.setFareRestrictPref(fareRestrict)

    priceData.setPublishedFares(publishedFares)

    val tpaExtensions: TPAExtensions = createTPAExtensions(pnrData, priceData)

    otaTravelItineraryRQ.setPOS(pos)
    otaTravelItineraryRQ.setOTAAirBookRQ(otaAirBookRQ)
    otaTravelItineraryRQ.setTPAExtensions(tpaExtensions)
    otaTravelItineraryRQ
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRDetails = {
    val bookingRequest = request.asInstanceOf[BookingRequest]
    val pnrDetail = new PNRDetails()
    val bookingResponseTuple = response.asInstanceOf[(String, String, OTATravelItineraryRS)]
    try {
      val otaTravelItineraryRS = bookingResponseTuple._3
      pnrDetail.setBookingRequest(bookingRequest)
      pnrDetail.setRequestXml(bookingResponseTuple._1)
      pnrDetail.setItineraryRef(otaTravelItineraryRS.getTravelItinerary.getItineraryRef.getID)
      pnrDetail.setItineraryRef(otaTravelItineraryRS.getTravelItinerary.getItineraryRef.getID)
      pnrDetail.setRequestXml(bookingResponseTuple._1)
      pnrDetail.setResponseXml(bookingResponseTuple._2)
      pnrDetail.setStatus(BookingStatus.SUCCESS)
//      pnrDetail.setGdsPlainResponse(bookingResponseTuple.)
    } catch {
      case e: Exception => {
        pnrDetail.setStatus(BookingStatus.FAILED)
        bookingResponseTuple._3.getErrors.getError.map(_.getMessage)
        pnrDetail.setErrors(Nil)
      }
    }
    pnrDetail
  }

  private def createTraveler(passenger: Passenger): Traveler = {
    val personName: PersonName = new PersonName
    if (passenger.namePrefix != null) {
      personName.setNamePrefix(passenger.namePrefix.toUpperCase)
    }
    personName.setGivenName(passenger.givenName.toUpperCase)
    personName.setSurname(passenger.surname.toUpperCase)
    personName.setMiddleName(passenger.middleName.orNull)
    val traveler = new Traveler
    traveler.setPersonName(personName)
    val travelerRefNumber: TravelerRefNumber = new TravelerRefNumber
    travelerRefNumber.setRPH(passenger.rph)
    traveler.setTravelerRefNumber(travelerRefNumber)
    if (!passenger.code.eq(PassengerCode.ADULT)) {
      traveler.setPassengerTypeCode(passenger.code.value)
      traveler.setBirthDate(toXMLGregorianCalendar(passenger.birthDate))
    }
    traveler
  }

  private def createTelephone(passenger: Passenger): wsimport.lib.amadeus.travelbuild.Telephone = {
    val telephone: wsimport.lib.amadeus.travelbuild.Telephone = new wsimport.lib.amadeus.travelbuild.Telephone
    new wsimport.lib.amadeus.travelbuild.Telephone().setPhoneLocationType(passenger.phoneLocationType)
    telephone.setCountryAccessCode(passenger.countryAccessCode)
    telephone.setPhoneNumber(passenger.contactPhone)
    telephone.setFormattedInd(false)
    telephone
  }

  private def createTicketing(ticketingInfo: TicketingInfoWSResponse): Ticketing = {
    val ticketing: Ticketing = new Ticketing
    ticketing.setTicketTimeLimit(toXMLGregorianCalendar(ticketingInfo.ticketTimeLimit))
    ticketing
  }

  private def createArrayOfFlightSegment(flightSegmentWSResponses: List[FlightSegmentWSResponse], rph: Int): (ArrayOfFlightSegment, Int) = {
    val arrayOfFlightSegment: ArrayOfFlightSegment = new ArrayOfFlightSegment
    var i = rph
    flightSegmentWSResponses.foreach { flightSegmentWSResponse =>
      flightSegmentWSResponse.setRPH(i.toString)
      arrayOfFlightSegment.getFlightSegment.add(createFlightSegment(flightSegmentWSResponse))
      i += 1
    }
    (arrayOfFlightSegment, i)
  }

  private def createFlightSegment(flightSegmentWSResponse: FlightSegmentWSResponse): FlightSegment = {
    val flightSegment: FlightSegment = new FlightSegment
    val departureAirport: DepartureAirport = new DepartureAirport
    val arrivalAirport: ArrivalAirport = new ArrivalAirport
    val marketingAirline: MarketingAirline = new MarketingAirline
    departureAirport.setValue(flightSegmentWSResponse.getDepartureAirport)
    departureAirport.setLocationCode(flightSegmentWSResponse.getDepartureAirportCode)
    arrivalAirport.setValue(flightSegmentWSResponse.getArrivalAirport)
    arrivalAirport.setLocationCode(flightSegmentWSResponse.getArrivalAirportCode)
    marketingAirline.setCode(flightSegmentWSResponse.getMarketingAirlineCode)
    flightSegment.setDepartureDateTime(flightSegmentWSResponse.getDepartureDateTime)
    flightSegment.setArrivalDateTime(flightSegmentWSResponse.getArrivalDateTime)
    flightSegment.setRPH(flightSegmentWSResponse.getRPH)
    flightSegment.setFlightNumber(flightSegmentWSResponse.getFlightNumber)
    flightSegment.setResBookDesigCode(flightSegmentWSResponse.getResBookDesigCode)
    flightSegment.setNumberInParty(flightSegmentWSResponse.getNumberInParty)
    flightSegment.setArrivalAirport(arrivalAirport)
    flightSegment.setDepartureAirport(departureAirport)
    flightSegment.setMarketingAirline(marketingAirline)
    flightSegment
  }

  private def toXMLGregorianCalendar(dateTime: LocalDateTime): XMLGregorianCalendar = {
    var calendar: XMLGregorianCalendar = null
    try {
      val gregorianCalendar = new GregorianCalendar(dateTime.getYear, dateTime.getMonthValue, dateTime.getDayOfMonth)
      calendar = DatatypeFactory.newInstance.newXMLGregorianCalendar(gregorianCalendar)
      calendar
    } catch {
      case e: DatatypeConfigurationException => throw new RuntimeException(e)
    }
  }

  private def createPriceData(priceDataPriceType: String, airlineCode: String): PriceData = {
    val priceData = new PriceData
    priceData.setPriceType(PriceDataPriceType.fromValue(priceDataPriceType))
    priceData.setValidatingAirlineCode(airlineCode)
    priceData
  }

  private def createPNRData(travelers: List[Traveler], telephones: wsimport.lib.amadeus.travelbuild.Telephone, ticketing: Ticketing, contactEmail: String): PNRData = {
    val pnrData: PNRData = new PNRData
    pnrData.setTicketing(ticketing)
    travelers.map(traveler => pnrData.getTraveler.add(traveler))
    pnrData.getTelephone.add(telephones)
    val email = new Email
    email.setValue(contactEmail)
    pnrData.getEmail.add(email)
    pnrData
  }

  private def createTPAExtensions(pnrData: PNRData, priceData: PriceData): TPAExtensions = {
    val extensions: TPAExtensions = new TPAExtensions
    extensions.setPNRData(pnrData)
    extensions.setPriceData(priceData)
    extensions
  }

}
