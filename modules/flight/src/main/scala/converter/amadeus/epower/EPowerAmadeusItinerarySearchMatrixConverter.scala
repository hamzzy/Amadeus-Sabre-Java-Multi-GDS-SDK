package flight.converter.amadeus.epower

import java.text.SimpleDateFormat
import java.util.GregorianCalendar

import javax.xml.datatype.{DatatypeFactory, XMLGregorianCalendar}
import flight.converter.Converter
import flight.converter.amadeus.epower.EPowerAmadeusItinerarySearchConverter.createAirItineraryWSResponse
import flight.dto.entity._
import flight.dto.entity.enums.CabinClass
import flight.dto.utils.{AirlineGetter, AirportCityGetter}
import flight.dto.utils.AirlineGetter.Implicit._
import utils.StringUtil
import org.joda.time.DateTime
import wsimport.lib.epower.AirSearchPrefsType.CabinPref
import wsimport.lib.epower.OriginDestinationInformationType.{DestinationLocation, OriginLocation}
import wsimport.lib.epower.SearchFlightResponse.OTAAirLowFareSearchRS
import wsimport.lib.epower._
import wsimport.lib.epower.SearchFlightCalendar
import wsimport.lib.epower.SearchFlightCalendar._
import wsimport.lib.epower.SearchFlightCalendar.OTAAirLowFareSearchRQ._

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object EPowerAmadeusItinerarySearchMatrixConverter extends Converter[SearchFlightCalendar, FlightSearchResponse] with EPowerHeader {

  override def toSupplier(baseDto: AnyRef): SearchFlightCalendar = {
    val flight = baseDto.asInstanceOf[FlightSearchRequest]
    val searchFlight = new SearchFlightCalendar
    val oTAAirLowFareSearchRQ = new OTAAirLowFareSearchRQ
    val dateFormat = "yyyy-MM-dd'T'HH:mm:ss"
    val dtFormat = new SimpleDateFormat(dateFormat)

    if (flight.sessionId != null) searchFlight.setSessionId(flight.sessionId)
    /**
      * Set the Origin/Destination Trip Type Information.
      * Origin and Destination possible object is {@link OriginDestinationRequest } lumps arrays of destination.
      * 1-Record for One-Way
      * 2-Record for Return
      * Greater than 2-Record for Multi-Cities
      */
    val originDestinationInformations = flight.originDestinationRequests.map { item =>
      val originDestinationInformation = new OriginDestinationInformation
      val (originAirportCode, destinationAirportCode) = (item.origin.airCode, item.destination.airCode)


      /**
        * Origin Airport Implementation
        */
      val originLocation = new OriginLocation
      originLocation.setLocationCode(originAirportCode)
//      val oIsCity = EPowerAmadeusItinerarySearchConverter.getIsCity(originAirportCode)
//      if (oIsCity) {
//        val arrayOfOrigins = new wsimport.lib.epower.ArrayOfOriginDestinationInformationTypeOriginLocation
//        val firstOrigin = new wsimport.lib.epower.ArrayOfOriginDestinationInformationTypeOriginLocation.OriginLocation
//        firstOrigin.setLocationCode(originLocation.getLocationCode)
//        arrayOfOrigins.getOriginLocation.add(firstOrigin)
//        originDestinationInformation.setOriginLocationList(arrayOfOrigins)
//      }
      //      if (flight.originDestinationRequests.length > 2)
//      originLocation.setMultiAirportCityInd(oIsCity)
      originDestinationInformation.setOriginLocation(originLocation)

      /**
        * Arriving Airport Implementation
        */
      val destinationLocation = new DestinationLocation
      destinationLocation.setLocationCode(destinationAirportCode)
      //      val disCity = EPowerAmadeusItinerarySearchConverter.getIsCity(destinationAirportCode)
//      if (disCity) {
//        val arrayOfDestinations = new wsimport.lib.epower.ArrayOfOriginDestinationInformationTypeDestinationLocation
//        val firstArriving = new wsimport.lib.epower.ArrayOfOriginDestinationInformationTypeDestinationLocation.DestinationLocation
//        firstArriving.setLocationCode(destinationLocation.getLocationCode)
//        arrayOfDestinations.getDestinationLocation.add(firstArriving)
//        originDestinationInformation.setDestinationLocationList(arrayOfDestinations)
//      }
//      destinationLocation.setMultiAirportCityInd(disCity)
      originDestinationInformation.setDestinationLocation(destinationLocation)

      val cal = new GregorianCalendar
      cal.setTime(dtFormat.parse(item.departureDateTime))
      val departureDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(item.departureDateTime)
      originDestinationInformation.setDepartureDateTime(departureDate)
      originDestinationInformation
    }

    /**
      * Set passenger travelling.
      * Each passenger category in a single unit of the array.
      * Type of passenges codes are ADT, CHD and INF
      */
    val travelerInfoSummary = new TravelerInfoSummary
    val airTravelerType = new AirTravelerType
    val passengerTypeQuantities = flight.passengerTypes.map { passenger =>
      val passengerTypeQuantity = new PassengerTypeQuantityType
      passengerTypeQuantity.setCode(passenger.code.value())
      passengerTypeQuantity.setQuantity(passenger.quantity)
      passengerTypeQuantity
    }
    val travelerInformationType = new TravelerInformationType
    travelerInformationType.getPassengerTypeQuantity.addAll(passengerTypeQuantities)
    travelerInformationType.setAirTraveler(airTravelerType)
    travelerInfoSummary.getAirTravelerAvail.add(travelerInformationType)

    /**
      * Set Airline Cabin preference
      * e.g. are Economy, Premium, First etc.
      */
    val cabinPreference = new TravelPreferences
    val cabinPref = new CabinPref
    if (flight.preferredCabin != null && !flight.preferredCabin.value().equalsIgnoreCase("Economy")) {
      if (flight.preferredCabin.name().equals(CabinClass.PREMIUM_ECONOMY.name)) {
        cabinPref.setCabin(CabinType.PREMIUM)
      } else {
        cabinPref.setCabin(CabinType.fromValue(flight.preferredCabin.value()))
      }
      cabinPref.setMajorityCabin(true)
      cabinPref.setMandatoryCabin(false)
      cabinPreference.getCabinPref.add(cabinPref)
    }

    /**
      * Set travel preferences.
      */
    val travelPreferences = List[TravelPreferences](cabinPreference)

    /**
      * If user filter by Airline. Return only selected airline
      */
    val specificFlightInfoType = new SpecificFlightInfoType
    flight.preferredAirline.foreach { airline =>
      val companyType = new CompanyNameType
      companyType.setCode(airline)
      specificFlightInfoType.getAirline.add(companyType)
    }
    oTAAirLowFareSearchRQ.setSpecificFlightInfo(specificFlightInfoType)

    val advanceSearchInfo = new AdvanceSearchInfo
    advanceSearchInfo.setCurrency(supplierConfigs(ConstKey.E_CURRENCY).configValue)
    //    advanceSearchInfo.setMaxLayoverPerConnection()
    //    advanceSearchInfo.setReturnMoreOvernightFlights(true)
    //    advanceSearchInfo.setNumberOfRecommendation(supplierConfigs(ConstKey.E_RESULT_PER_QUERY).configValue.toInt)
    oTAAirLowFareSearchRQ.setAdvanceSearchInfo(advanceSearchInfo)

    oTAAirLowFareSearchRQ.getOriginDestinationInformation.addAll(originDestinationInformations)
    oTAAirLowFareSearchRQ.setTravelerInfoSummary(travelerInfoSummary)
    oTAAirLowFareSearchRQ.getTravelPreferences.addAll(travelPreferences)

    searchFlight.setOTAAirLowFareSearchRQ(oTAAirLowFareSearchRQ)
    if (flight.refundable) {
      searchFlight.getOTAAirLowFareSearchRQ.setRefundableType(RefundableTypesEnum.ONLY_REFUNDABLE)
    }
    if (flight.isDirectFlight) searchFlight.getOTAAirLowFareSearchRQ.setDirectFlightsOnly(flight.isDirectFlight)
    searchFlight.getOTAAirLowFareSearchRQ.setProviderType(SearchTypeByProviderEnum.AMADEUS_AND_EXT_PROVIDERS)

    searchFlight
  }


  override def fromSupplier(response: AnyRef, request: AnyRef): FlightSearchResponse = {
    val searchRS = response.asInstanceOf[SearchFlightCalendarResponse]
    val searchRequest = request.asInstanceOf[FlightSearchRequest]

    import AirportCityGetter.Implicit.File._
//    implicit val allAirports: Map[String, Airports] = AirportCityGetter.allAirportsMap
//    implicit val allAirlines: Map[String, Airlines] = AirlineGetter.allAirlinesMap

    val itineraries = searchRS.getOTAAirLowFareSearchRS.getSuccessOrErrorsOrPricedItineraries.flatMap {
      case pricedItinerariesType: PricedItinerariesType => ResultUngroupJava.getPricedItinerary(pricedItinerariesType.getPricedItinerary).toList.map { itinerary =>
          val itineraryWSResponse = new ItineraryWSResponse
          itineraryWSResponse.setSequenceNumber(itinerary.getSequenceNumber.intValue().toString)
          val airItineraryWsResponse = createAirItineraryWSResponse(itinerary.getAirItinerary, pricedItinerariesType.getFreeBaggages.getBaggage.toList)
          val indexList = airItineraryWsResponse.originDestinationWSResponses.map(a => a.refNumber + ";").mkString
          itineraryWSResponse.setAirItineraryWSResponse(airItineraryWsResponse)
          itineraryWSResponse.setPricingInfoWSResponse(EPowerAmadeusItinerarySearchConverter.createPricingInfoWSResponse(itinerary.getAirItineraryPricingInfo, itinerary.getCurrency))
          itineraryWSResponse.setTicketingInfoWSResponse(EPowerAmadeusItinerarySearchConverter.createTicketingInfoWSResponse(itinerary.getAirItinerary.getOriginDestinationOptions.getOriginDestinationOption.head.getFlightSegment.head))
          itineraryWSResponse.setAirline(airItineraryWsResponse.originDestinationWSResponses.head.getMarketingAirline)
          itineraryWSResponse.setAirlineCode(airItineraryWsResponse.originDestinationWSResponses.head.getMarketingAirlineCode)
          itineraryWSResponse.setSupplier(searchRequest.supplier)
          itineraryWSResponse.setTicketLocale(searchRequest.ticketLocale)
          itineraryWSResponse.setSalesCategory(searchRequest.salesCategory)
          itineraryWSResponse.setTicketPolicy(searchRequest.ticketPolicy)
          itineraryWSResponse.setSearchRequest(searchRequest)
          itineraryWSResponse.setSessionId(searchRS.getSessionId)
          itineraryWSResponse.setOneWayCombinable(itinerary.isOWCF)
          itineraryWSResponse.setSelectedCombinationId(airItineraryWsResponse.originDestinationCombinations.find(_.indexList == indexList.substring(0, indexList.length - 1)) match {
            case item@Some(_) => item.get.combinationId
            case _ => ""
          })
          itineraryWSResponse
        }
      case successType: SuccessType => Nil
      case errorType: ErrorsType => Nil
      case warningType: WarningsType => Nil
    }.toList

    FlightSearchResponse(
      flightSearchRequest = searchRequest.copy(searchRequestHeader = searchRequest.searchRequestHeader.copy(searchTo = System.currentTimeMillis(), httpCookieID = Some(searchRS.getSessionId), httpRequest = Some(searchRS.getRequestXML), httpResponse = None)), //Some(StringUtil.classToXmlString(searchRS))
      sessionId = searchRS.getSessionId,
      responseLog = "N/A",
      requestLog = searchRS.getRequestXML,
      pricedItineraryWSResponses = itineraries
    )
  }
}
