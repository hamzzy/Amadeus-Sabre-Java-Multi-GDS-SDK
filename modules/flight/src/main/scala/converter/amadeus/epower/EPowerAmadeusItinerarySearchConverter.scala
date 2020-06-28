package flight.converter.amadeus.epower

import java.text.{DecimalFormat, SimpleDateFormat}
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util
import java.util.{Calendar, GregorianCalendar, Locale, TimeZone}

import dto.entity.enums.PassengerCode
import javax.xml.datatype.{DatatypeConstants, DatatypeFactory, XMLGregorianCalendar}
import flight.converter.Converter
import flight.dto.entity.{Airlines, Airports, Baggage, _}
import flight.dto.entity.enums._
import flight.dto.utils._
import utils.StringUtil
import wsimport.lib.epower.AirSearchPrefsType.CabinPref
import wsimport.lib.epower.OriginDestinationInformationType.{DestinationLocation, OriginLocation}
import wsimport.lib.epower._
import wsimport.lib.epower.SearchFlight
import wsimport.lib.epower.SearchFlight._
import wsimport.lib.epower.SearchFlight.OTAAirLowFareSearchRQ._

import scala.collection.JavaConversions._

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object EPowerAmadeusItinerarySearchConverter extends Converter[SearchFlight, FlightSearchResponse] with EPowerHeader {

  override def toSupplier(baseDto: AnyRef): SearchFlight = {
    val flight = baseDto.asInstanceOf[FlightSearchRequest]

    val searchFlight = new SearchFlight
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
      originDestinationInformation.setOriginLocation(originLocation)

      /**
        * Arriving Airport Implementation
        */
      val destinationLocation = new DestinationLocation
      destinationLocation.setLocationCode(destinationAirportCode)
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
    val pricingInformation = new PriceRequestInformationType
    pricingInformation.setNegotiatedFaresOnly(false)
    //    val negotiatedFareCodes = airlineFareCodes.map { x =>
    //      val code = new NegotiatedFareCode()
    //      code.setValue(x.fareCode)
    //      code
    //    }
    //    pricingInformation.getNegotiatedFareCode.addAll(negotiatedFareCodes)
    //    travelerInfoSummary.setPriceRequestInformation(pricingInformation)

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

    /*
    * Excluded airlines from displaying
    */
    if (flight.excludedAirlines.nonEmpty) {
      flight.excludedAirlines.foreach { excludedAirline =>
        val companyType = new CompanyNameType
        companyType.setCode(excludedAirline)
        //        specificFlightInfoType.getExcludedAirline.add(companyType)
      }
    }
    val advanceSearchInfo = new AdvanceSearchInfo
    advanceSearchInfo.setCurrency(supplierConfigs(ConstKey.E_CURRENCY).configValue)
    //    advanceSearchInfo.setReturnMoreOvernightFlights(true)
    advanceSearchInfo.setNumberOfRecommendation(supplierConfigs(ConstKey.E_RESULT_PER_QUERY).configValue.toInt)
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

  /**
    * Use Akka Stream API to parse the record to the format of POJO
    *
    * @param response
    * @param request
    * @tparam T
    * @tparam A
    * @return
    */
  override def fromSupplier(response: AnyRef, request: AnyRef): FlightSearchResponse = {
    //    val from = System.currentTimeMillis()
    val searchRS = response.asInstanceOf[SearchFlightResponse]
    val searchRequest = request.asInstanceOf[FlightSearchRequest]


    val itineraries = searchRS.getOTAAirLowFareSearchRS.getSuccessOrErrorsOrPricedItineraries.flatMap {
      case pricedItinerariesType: PricedItinerariesType => {
        val results = ResultUngroupJava.getPricedItinerary(pricedItinerariesType.getPricedItinerary).toList //::: ResultUngroupJava.getPricedItineraryOWC(pricedItinerariesType.getPricedItineraryForOWC).toList
        results.map { itinerary =>
          val itineraryWSResponse = new ItineraryWSResponse
          itineraryWSResponse.setSequenceNumber(itinerary.getSequenceNumber.intValue().toString)
          val airItineraryWsResponse = createAirItineraryWSResponse(itinerary.getAirItinerary, pricedItinerariesType.getFreeBaggages.getBaggage.toList)
          val indexList = airItineraryWsResponse.originDestinationWSResponses.map(a => a.refNumber + ";").mkString
          itineraryWSResponse.setAirItineraryWSResponse(airItineraryWsResponse)
          itineraryWSResponse.setPricingInfoWSResponse(createPricingInfoWSResponse(itinerary.getAirItineraryPricingInfo, itinerary.getCurrency))
          itineraryWSResponse.setTicketingInfoWSResponse(createTicketingInfoWSResponse(itinerary.getAirItinerary.getOriginDestinationOptions.getOriginDestinationOption.head.getFlightSegment.head))
          itineraryWSResponse.setAirline(airItineraryWsResponse.originDestinationWSResponses.head.getMarketingAirline)
          itineraryWSResponse.setAirlineCode(airItineraryWsResponse.originDestinationWSResponses.head.getMarketingAirlineCode)
          itineraryWSResponse.setSupplier(searchRequest.supplier)
          itineraryWSResponse.setTicketLocale(searchRequest.ticketLocale)
          itineraryWSResponse.setSalesCategory(searchRequest.salesCategory)
          itineraryWSResponse.setTicketPolicy(searchRequest.ticketPolicy)
          itineraryWSResponse.setOneWayCombinable(itinerary.isOWCF)
          itineraryWSResponse.setSearchRequest(searchRequest)
          itineraryWSResponse.setSessionId(searchRS.getSessionId)
          itineraryWSResponse.setSelectedCombinationId(airItineraryWsResponse.originDestinationCombinations.find(_.indexList == indexList.substring(0, indexList.length - 1)) match {
            case item@Some(_) => item.get.combinationId
            case _ => ""
          })
          itineraryWSResponse
        }
      }
      case successType: SuccessType => Nil
      case errorType: ErrorsType => Nil
      case warningType: WarningsType => Nil
    }.toList

//    println(StringUtil.classToXmlString(searchRS))
    //    val to = System.currentTimeMillis()
    FlightSearchResponse(
      flightSearchRequest = searchRequest.copy(searchRequestHeader = searchRequest.searchRequestHeader.copy(searchTo = System.currentTimeMillis(), httpCookieID = Some(searchRS.getSessionId), httpRequest = Some(searchRS.getRequestXML), httpResponse = None)), //StringUtil.classToXmlString(searchRS)
      sessionId = searchRS.getSessionId,
      responseLog = "//N/A", //StringUtil.classToXmlString(searchRS)
      requestLog = searchRS.getRequestXML,
      pricedItineraryWSResponses = itineraries
    )
  }

//  private[this] def isSameItinerary(itinerary: ItineraryWSResponse, itineraries: Seq[ItineraryWSResponse]): Boolean = itineraries.exists(item => item.pricingInfoWSResponse.totalFare == itinerary.pricingInfoWSResponse.totalFare && item.selectedCombinationId.equals(itinerary.selectedCombinationId) && item.airlineCode == itinerary.airlineCode)

  def createTicketingInfoWSResponse(flightSegment: OriginDestinationOptionType.FlightSegment): TicketingInfoWSResponse = {
    val fdp = flightSegment.getDepartureDateTime
    val flightDateTime = LocalDateTime.of(fdp.getYear, fdp.getMonth, fdp.getDay, fdp.getHour, fdp.getMinute).plusDays(5)
    TicketingInfoWSResponse(
      ticketTimeLimit = flightDateTime,
      ticketType = flight.dto.entity.enums.TicketType.E_TICKET,
      eTicketEligibility = flightSegment.getETicketEligibility
    )
  }

  def createAirItineraryWSResponse(airItineraryType: AirItineraryType, baggages: List[ArrayOfFreeBaggageLegendItem.Baggage]): AirItineraryWSResponse = {
    val itineraries = airItineraryType.getOriginDestinationOptions.getOriginDestinationOption.map { originDestinationOption =>
      val originDestinationWSResponse = new OriginDestinationWSResponse
      val elapseTime = originDestinationOption.getElapsedTime
      originDestinationWSResponse.setDuration(elapseTime)
      originDestinationWSResponse.setDirectionId(originDestinationOption.getDirectionId)
      val flightSegments = originDestinationOption.getFlightSegment.map { segmentType =>
        val flightSegmentWSResponse = new FlightSegmentWSResponse
        var baggageList: List[Baggage] = List()
        if (Option(segmentType.getBaggages).isDefined) {
          segmentType.getBaggages.getBaggage.foreach { baggage =>
            baggages.find(_.getIndex equals baggage.getIndex) match {
              case Some(x) => baggageList ::= Baggage(x.getQuantity, x.getUnit, baggage.getType)
              case _ =>
            }

          }
        }
        flightSegmentWSResponse.setBaggage(baggageList)
        flightSegmentWSResponse.setRPH(segmentType.getRPH)
        flightSegmentWSResponse.setMarketingAirlineCode(segmentType.getMarketingAirline.getCode)
        flightSegmentWSResponse.setOperatingAirlineCode(segmentType.getOperatingAirline.getCode)
        flightSegmentWSResponse.setArrivalTerminal(segmentType.getArrivalAirport.getTerminal)
        flightSegmentWSResponse.setDepartureTerminal(segmentType.getDepartureAirport.getTerminal)
        if (segmentType.getStopQuantity != null) flightSegmentWSResponse.setStopQuantity(segmentType.getStopQuantity.intValue()) else flightSegmentWSResponse.setStopQuantity(0)
        flightSegmentWSResponse.setResBookDesigCode(segmentType.getResBookDesigCode)
        flightSegmentWSResponse.setResBookDesigCabinCode(segmentType.getBookingClassAvails.getBookingClassAvail.head.getResBookDesigCabinCode)
        flightSegmentWSResponse.setCabin(CabinGetter.getCabinClassOnly(segmentType.getBookingClassAvails.getBookingClassAvail.head.getResBookDesigCabinCode))
        flightSegmentWSResponse.setFlightNumber(segmentType.getFlightNumber)
        flightSegmentWSResponse.setRPH(segmentType.getBookingClassAvails.getBookingClassAvail.head.getRPH)
        if (segmentType.getFlightDuration != null) flightSegmentWSResponse.setDuration(parseDate("HH:mm", segmentType.getFlightDuration))
        flightSegmentWSResponse.setDepartureAirportCode(segmentType.getDepartureAirport.getLocationCode)
        flightSegmentWSResponse.setDepartureAirport(segmentType.getDepartureAirport.getLocationCode)
        flightSegmentWSResponse.setArrivalAirportCode(segmentType.getArrivalAirport.getLocationCode)
        flightSegmentWSResponse.setArrivalAirport(segmentType.getArrivalAirport.getLocationCode)
        flightSegmentWSResponse.setDepartureDateTime(parseDate("yyyy-MM-dd HH:mm:ss", segmentType.getDepartureDateTime))
        flightSegmentWSResponse.setArrivalDateTime(parseDate("yyyy-MM-dd HH:mm:ss", segmentType.getArrivalDateTime))
        flightSegmentWSResponse.setMealCode(segmentType.getMealCode)
        flightSegmentWSResponse.setFlightNumber(segmentType.getFlightNumber)
        if (segmentType.getEquipment.headOption.nonEmpty)
          flightSegmentWSResponse.setAirEquipType(segmentType.getEquipment.head.getAirEquipType)
        val isEticketEligible = if (segmentType.getETicketEligibility != null && segmentType.getETicketEligibility.equalsIgnoreCase("Eligible")) true else false
        flightSegmentWSResponse.setETicketEligible(isEticketEligible)
        flightSegmentWSResponse
      }
      originDestinationWSResponse.setFlightSegmentWSResponses(flightSegments.toList)
      originDestinationWSResponse.setBaggageAllowance(flightSegments.head.getBaggage)

      originDestinationWSResponse.setOriginAirportCode(flightSegments.head.getDepartureAirportCode)
      originDestinationWSResponse.setOriginAirport(flightSegments.head.getDepartureAirport)

      originDestinationWSResponse.setDestinationAirportCode(flightSegments.last.getArrivalAirportCode)
      originDestinationWSResponse.setDestinationAirport(flightSegments.last.getArrivalAirportCode)

      originDestinationWSResponse.setFlightNumber(flightSegments.head.getFlightNumber)
      originDestinationWSResponse.setFlightNote(flightSegments.head.getFlightEquipment.mkString(";"))

      originDestinationWSResponse.setResBookDesigCode(flightSegments.head.getResBookDesigCode)
      originDestinationWSResponse.setResBookDesigCabinCode(flightSegments.head.getResBookDesigCabinCode)

      val isNextDayArrival = false
      val isMultiAirline = flightSegments.map(a => a.getOperatingAirlineCode).toSet.size > 1
      originDestinationWSResponse.setIsNextDayArrival(isNextDayArrival)
      originDestinationWSResponse.setIsMultiAirline(isMultiAirline)
      originDestinationWSResponse.setNumberOfStops(if (flightSegments.size <= 1) 0 else flightSegments.size - 1)
      originDestinationWSResponse.setMarketingAirline(flightSegments.head.getMarketingAirline)
      originDestinationWSResponse.setDepartureDateTime(flightSegments.head.getDepartureDateTime)
      originDestinationWSResponse.setArrivalDateTime(flightSegments.last.getArrivalDateTime)
      originDestinationWSResponse.setOperatingAirlineCode(flightSegments.head.getOperatingAirlineCode)
      originDestinationWSResponse.setMarketingAirlineCode(flightSegments.head.getMarketingAirlineCode)
      originDestinationWSResponse.setOperatingAirline(flightSegments.head.getOperatingAirline)
      originDestinationWSResponse.setTerminal("Terminal " + flightSegments.head.getDepartureTerminal)
      originDestinationWSResponse.setCabin(flightSegments.head.getCabin)
      originDestinationWSResponse.setRefNumber(originDestinationOption.getRefNumber.intValue())
      originDestinationWSResponse
    }
    val originDestinationCombinations = if (Option(airItineraryType.getOriginDestinationCombinations).isDefined) {
      airItineraryType.getOriginDestinationCombinations.getOriginDestinationCombination.map(item => OriginDestinationCombinations(
        combinationId = String.valueOf(item.getCombinationID),
        eTicketEligible = item.getETicketEligibility,
        forceEticketing = item.isForceETicket,
        indexList = item.getIndexList,
        serviceFeeAmount = item.getServiceFeeAmount,
        validatingAirlineCode = item.getValidatingAirlineCode
      ))
    } else Nil
    AirItineraryWSResponse(originDestinationWSResponses = itineraries.toList, originDestinationCombinations = originDestinationCombinations.toList, directionIndicator = if (airItineraryType.getDirectionInd != null) airItineraryType.getDirectionInd.value() else "")
  }

  def createPricingInfoWSResponse(airItineraryPricingInfoType: AirItineraryPricingInfoType, currency: String): PricingInfoWSResponse = {
    val pricingInfoWSResponse = new PricingInfoWSResponse
    val baseFare = airItineraryPricingInfoType.getItinTotalFare.getBaseFare.getAmount.doubleValue()
    val totalFare = airItineraryPricingInfoType.getItinTotalFare.getTotalFare.getAmount.doubleValue()
    val tax: Double = totalFare - baseFare
    pricingInfoWSResponse.setBaseFare(BaseFare(baseFare, currency))
    pricingInfoWSResponse.setCurrencyCode(currency)
    pricingInfoWSResponse.setTotalTax(List(TaxFare(tax, currency)))
    pricingInfoWSResponse.setGdsBaseFare(baseFare)
    pricingInfoWSResponse.setGdsTotalFare(totalFare)
    pricingInfoWSResponse.setGdsEquivBaseFare(baseFare)
    pricingInfoWSResponse.setGdsEquivCurrency(currency)
    pricingInfoWSResponse.setTotalFare(totalFare)
    pricingInfoWSResponse.setGdsTaxFare(tax)
    val fareBreakdown = airItineraryPricingInfoType.getPTCFareBreakdowns.getPTCFareBreakdown.map(ptcFareBreakDown => FareBreakDown(
      passengerType = PassengerType(code = PassengerCode.fromValue(ptcFareBreakDown.getPassengerTypeQuantity.getCode), quantity = ptcFareBreakDown.getPassengerTypeQuantity.getQuantity),
      passengerFare = PassengerFare(baseFare = ptcFareBreakDown.getPassengerFare.getBaseFare.getAmount,
        totalFare = ptcFareBreakDown.getPassengerFare.getTotalFare.getAmount,
        totalTax = BigDecimal(ptcFareBreakDown.getPassengerFare.getTaxes.getTax.map(_.getAmount.doubleValue()).sum)
      ),
      quantity = ptcFareBreakDown.getPassengerTypeQuantity.getQuantity,
      ptcFareBreakDown.getTicketDesignators.getTicketDesignator.map(
        ticketingDesignator => TicketingRule(code = ticketingDesignator.getTicketDesignatorCode, description = ticketingDesignator.getTicketDesignatorExtension)
      ).toList
    ))
    pricingInfoWSResponse.setPassengerFare(fareBreakdown.toList)
    pricingInfoWSResponse.setGdsEquivCurrency(currency)
    pricingInfoWSResponse
  }

  import java.text.DateFormat
  import java.text.SimpleDateFormat

  def parseDate(format: String, xMLdate: XMLGregorianCalendar): String = {
    val date = xMLdate.toGregorianCalendar.getTime
    val formatter = new SimpleDateFormat(format)
    val formattedDate = formatter.format(date)
    formattedDate
  }

  def getDuration(dateStart: String, dateStop: String) = {
    import java.text.SimpleDateFormat
    val format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val d1 = format.parse(dateStart)
    val d2 = format.parse(dateStop)

    val diff = d2.getTime - d1.getTime

    val seconds = diff / 1000
    val hours = seconds / (60 * 60)
    val minutes = seconds % 60 * 60

    s"${hours}H:${minutes}M"
  }

}
