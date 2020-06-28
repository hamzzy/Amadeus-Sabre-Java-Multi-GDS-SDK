package flight.converter.amadeus.tripxml

import java.text.SimpleDateFormat
import java.util

import flight.converter.Converter
import flight.dto.entity._
import flight.dto.entity.enums._
import flight.dto.utils.AirlineGetter
import flight.invoker.amadeus.utils.LowFarePlusRSObjectParser
import utils.StringUtil
import wsimport.lib.amadeus.lowfareplus._

import scala.collection.JavaConverters._
import scala.collection.JavaConversions._
import flight.dto.utils.AirlineGetter.Implicit.airlineXML
/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 5:58 PM.
  */
object AmadeusItinerarySearchConverter extends Converter[OTAAirLowFareSearchPlusRQ, FlightSearchResponse] {

  override def toSupplier(baseDto: AnyRef): OTAAirLowFareSearchPlusRQ = {
    val flight = baseDto.asInstanceOf[FlightSearchRequest]
    val otaAirLowFareSearchPlusRQ = new OTAAirLowFareSearchPlusRQ
    otaAirLowFareSearchPlusRQ.setPOS(POSBuilder.createInstance)
    val originDestinations = flight.originDestinationRequests.map { originDestinationRequest =>
      val originDestinationInformation = new OriginDestinationInformation
      originDestinationInformation.setDepartureDateTime(createDepartureDateTime(originDestinationRequest.departureDateTime))
      originDestinationInformation.setOriginLocation(createOriginLocation(originDestinationRequest.origin.airCode))
      originDestinationInformation.setDestinationLocation(createDestinationLocation(originDestinationRequest.destination.airCode))
      originDestinationInformation.setConnectionLocations(createArrayOfConnection)
      originDestinationInformation
    }
    otaAirLowFareSearchPlusRQ.setOriginDestinationInformation(originDestinations.asJava)
    otaAirLowFareSearchPlusRQ.setSpecificFlightInfo(createSpecificFlightInfo)
    otaAirLowFareSearchPlusRQ.setTravelPreferences(createTravelPreferences(createCabinPref(flight.preferredCabin), flight.flightType, flight.preferredAirline, flight.isDirectFlight))
    otaAirLowFareSearchPlusRQ.setTravelerInfoSummary(createTravelerInfoSummary(createAirTravelerAvail(flight.passengerTypes), flight.seatCount, flight.priceSource)) /*flight.dealCodes*/
    println(StringUtil.classToXmlString(otaAirLowFareSearchPlusRQ))
    otaAirLowFareSearchPlusRQ
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): FlightSearchResponse = {
    val searchPlusRS = response.asInstanceOf[OTAAirLowFareSearchPlusRS]
    val dateTimeFormatter = new SimpleDateFormat("yyyyy-MM-dd HH:mm:ss")
    println(StringUtil.classToXmlString(response))
    val searchRequest = request.asInstanceOf[FlightSearchRequest]
    var index = 0
    val airlines = AirlineGetter.allAirlines
    val itineraryWsResponse: List[ItineraryWSResponse] = if (searchPlusRS != null && searchPlusRS.getPricedItineraries != null) {
      searchPlusRS.getPricedItineraries.getPricedItinerary.asScala.toList.map { itinerary =>
        val item = new ItineraryWSResponse()
        item.setCacheIndex(index)
        item.setSupplier(searchRequest.supplier)
        item.setAirItineraryWSResponse(LowFarePlusRSObjectParser.createAirItineraryWSResponse(itinerary.getAirItinerary))
        item.setPricingInfoWSResponse(LowFarePlusRSObjectParser.createPricingInfoWSResponse(itinerary.getAirItineraryPricingInfo))
        item.setTicketingInfoWSResponse(LowFarePlusRSObjectParser.createTicketingInfoWSResponse(itinerary.getAirItinerary.getOriginDestinationOptions.getOriginDestinationOption.get(0).getFlightSegment.get(0)))
        item.setSearchRequest(searchRequest)
        item.setTicketLocale(searchRequest.ticketLocale)
        item.setSalesCategory(searchRequest.salesCategory)
        item.setTicketPolicy(searchRequest.ticketPolicy)
        val _airline = airlines.find(_.airlineCode.equalsIgnoreCase(itinerary.getAirItinerary.getOriginDestinationOptions.getOriginDestinationOption.get(0).getFlightSegment.get(0).getMarketingAirline.getCode))
        val mkAirline = itinerary.getAirItinerary.getOriginDestinationOptions.getOriginDestinationOption.get(0).getFlightSegment.get(0).getMarketingAirline
        item.setAirline(_airline.getOrElse(Airlines(name = mkAirline.getValue, airlineCode = mkAirline.getCode)))
        item.setAirlineCode(mkAirline.getCode)
        index += 1
        item
      }
    } else Nil
    FlightSearchResponse(pricedItineraryWSResponses = if(searchRequest.isDirectFlight) itineraryWsResponse.filter(_.airItineraryWSResponse.originDestinationWSResponses.map(_.numberOfStops).filter(_ == 0).nonEmpty) else itineraryWsResponse, flightSearchRequest = searchRequest)
  }

  private def createTravelerInfoSummary(airTravelerAvail: AirTravelerAvail, numberOfSeatRequested: Int, pricingSource: String/*, dealCodes: List[(String, String)]*/): TravelerInfoSummary = {
    val travelerInfoSummary = new TravelerInfoSummary()
    travelerInfoSummary.getAirTravelerAvail.add(airTravelerAvail)
    val priceRequestInformation = new PriceRequestInformation
    priceRequestInformation.setPricingSource(PriceRequestInformationPricingSource.fromValue(pricingSource))
//    if (dealCodes.nonEmpty) {
////      priceRequestInformation.setNegotiatedFaresOnly(true)
//      val deals = dealCodes.map { tuple =>
//        val negotiatedFareCode = new NegotiatedFareCode
//        negotiatedFareCode.setSupplierCode(tuple._1)
//        negotiatedFareCode.setValue(tuple._2)
//        negotiatedFareCode.setCode(tuple._2)
//        negotiatedFareCode
//      }
//      priceRequestInformation.getNegotiatedFareCode.addAll(deals)
//    }

    travelerInfoSummary.setPriceRequestInformation(priceRequestInformation)
    travelerInfoSummary.getSeatsRequested.add(numberOfSeatRequested)
    travelerInfoSummary
  }

  private def createAirTravelerAvail(passengerTypes: util.List[PassengerType]): AirTravelerAvail = {
    val airTravelerAvail = new AirTravelerAvail()
    val passengerTypeQuantities = passengerTypes.asScala.map { passengerType =>
      val passengerTypeQuantity = new PassengerTypeQuantity()
      passengerTypeQuantity.setCode(passengerType.code.value())
      passengerTypeQuantity.setQuantity(passengerType.quantity)
      passengerTypeQuantity
    }.asJava
    airTravelerAvail.setPassengerTypeQuantity(passengerTypeQuantities)
    airTravelerAvail
  }

  private def createDepartureDateTime(value: String) = {
    val departureDateTime = new DepartureDateTime()
    departureDateTime.setValue(value)
    departureDateTime
  }

  private def createOriginLocation(locationCode: String) = {
    val originLocation = new OriginLocation
    originLocation.setLocationCode(locationCode)
    originLocation
  }

  private def createDestinationLocation(locationCode: String) = {
    val destinationLocation = new DestinationLocation
    destinationLocation.setLocationCode(locationCode)
    destinationLocation
  }

  private def createArrayOfConnection = new ArrayOfConnectionLocation

  private def createSpecificFlightInfo: SpecificFlightInfo = new SpecificFlightInfo

  private def createTravelPreferences(cabinPref: CabinPref, flightType: FlightType, vendorPrefCode: List[String], isDirectFlight: Boolean = false) = {
    val travelPreferences = new TravelPreferences
    vendorPrefCode.foreach { airline =>
      val vendorPref = new VendorPref
      vendorPref.setCode(airline)
      travelPreferences.getVendorPref.add(vendorPref)
    }

    if (flightType != null) {
      val flightTypePref = new FlightTypePref
      flightTypePref.setFlightType(FlightTypePrefFlightType.fromValue(flightType.value()))
      travelPreferences.getFlightTypePref.add(flightTypePref)
    }

    travelPreferences.getCabinPref.add(cabinPref)
    if (isDirectFlight) {
      println("---here---")
      travelPreferences.setMaxStopsQuantity(0)
    }
    travelPreferences
  }

  private def createCabinPref(cabinClass: CabinClass): CabinPref = {
    val cabinPrefCabin = CabinPrefCabin.fromValue(cabinClass.value())
    val cabinPref = new CabinPref
    cabinPref.setCabin(cabinPrefCabin)
    cabinPref
  }

}
