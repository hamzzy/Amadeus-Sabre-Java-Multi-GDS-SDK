package flight.converter.sabre

import java.text.SimpleDateFormat
import java.time.Duration

import dto.enums._
import flight.converter.Converter
import flight.dto.entity._
import flight.dto.entity.enums._
import flight.invoker.sabre.utils.{BfmConfig, LowFareSearchConfig, SabreSession, SabreXMLRequestUtils}

import scala.collection.mutable.ArrayBuffer
import scala.xml.{Elem, Node, NodeSeq}
import java.util.{List => JList}

import dto.entity.enums.PassengerCode
import flight.dto.utils.CabinGetter
import flight.invoker.sabre.client.SabreXMLLogger
import utils.StringUtil

import scala.collection.JavaConversions._
import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 5:58 PM.
  */

object SabreItinerarySearchConverter extends Converter[Elem, FlightSearchResponse] with SabreXMLLogger with LowFareSearchConfig with SabreSession with SabreXMLRequestUtils {

  val dtFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")

  override def toSupplier(baseDto: AnyRef): Elem = {
    val searchRequest = baseDto.asInstanceOf[FlightSearchRequest]
    val bfmConfig = bfmConfigOptions(false) //non-flexible date ticket
    val bfmXml = {
      <OTA_AirLowFareSearchRQ Version={bfmConfig.version} ResponseType={SERVICE_TYPE} ResponseVersion={bfmConfig.version} xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.opentravel.org/OTA/2003/05" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" Target="Production" AvailableFlightsOnly="true">
        <POS>
          <Source PseudoCityCode={SABRE_PCC}>
            <RequestorID ID="1" Type="1">
              <CompanyName Code="TN"/>
            </RequestorID>
          </Source>
        </POS>{toOriginDestinationNodes(searchRequest.originDestinationRequests, bfmConfig)}<TravelPreferences ValidInterlineTicket="true" MaxStopsQuantity="4" ETicketDesired="true">
        <CabinPref Cabin={searchRequest.preferredCabin.value()}/> <!--PreferLevel={searchRequest.cabinPrefLevel.value()}-->
        <TPA_Extensions>
          <NumTripsWithRouting Number="1"/>
          <OnlineIndicator Ind="true"/>
          <TripType Value={searchRequest.tripType.value()}/>
          <ExcludeCallDirectCarriers Enabled="true"/>{getFlexibleFaresNode}
        </TPA_Extensions>
      </TravelPreferences>
        <TravelerInfoSummary>
          <AirTravelerAvail>
            {toPassengerTypeQuantityNodes(searchRequest.passengerTypes)}
          </AirTravelerAvail>{getPricedInformationRequestNode}
        </TravelerInfoSummary>
        <TPA_Extensions>
          <IntelliSellTransaction>
            <RequestType Name={bfmConfig.requestType}/>
          </IntelliSellTransaction>
        </TPA_Extensions>
      </OTA_AirLowFareSearchRQ>
    }
    soapTemplateWithToken(session, bfmConfig.service, bfmConfig.action, bfmConfig.description, bfmXml)
  }

  private def toOriginDestinationNodes(originDestinations: JList[OriginDestinationRequest], bfmConfig: BfmConfig): ArrayBuffer[Node] = {
    val nodeBuffer = new ArrayBuffer[Node]()
    for (originDestination <- originDestinations) yield {
      <OriginDestinationInformation RPH={originDestination.RPH}>
        <DepartureDateTime>{originDestination.departureDateTime}</DepartureDateTime>
        <OriginLocation LocationCode={originDestination.origin.airCode}/>
        <DestinationLocation LocationCode={originDestination.destination.airCode}/>
        <TPA_Extensions>
          <SegmentType Code={bfmConfig.segmentType}/>
          <ConnectionTime Max={bfmConfig.connectTimeMax}/>
        </TPA_Extensions>
      </OriginDestinationInformation>
    }.foreach(nodeBuffer += _)
    nodeBuffer
  }

  private def getFlexibleFaresNode = {
    <FlexibleFares>
      <FareParameters>
        <PublicFare Ind="true"/>
      </FareParameters>
      <FareParameters>
        <PrivateFare Ind="true"/>
      </FareParameters>
    </FlexibleFares>
  }

  private def toPassengerTypeQuantityNodes(passengerTypes: JList[PassengerType]): ArrayBuffer[Node] = {
    val nodeBuffer = new ArrayBuffer[Node]()
    for (passengerType <- passengerTypes) yield {
        <PassengerTypeQuantity Code={passengerType.code.value()} Quantity={passengerType.quantity.toString}/>
    }.foreach(nodeBuffer += _)
    nodeBuffer
  }

  private def getPricedInformationRequestNode = {
    <PriceRequestInformation CurrencyCode={CURRENCY}>
      <TPA_Extensions>
        <PublicFare Ind="false"/>
        <PrivateFare Ind="false"/>
        <Priority>
          <Price Priority="1"/>
          <DirectFlights Priority="2"/>
          <Time Priority="3"/>
          <Vendor Priority="4"/>
        </Priority>
      </TPA_Extensions>
    </PriceRequestInformation>
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): FlightSearchResponse = {
    val fromSupplierResp = response.asInstanceOf[Node]
    val flightSearchRequest = request.asInstanceOf[FlightSearchRequest]
    val itineraryWsResp = (fromSupplierResp \\ "PricedItinerary").map { pricedItinerary =>
      toPricingItineraryWSResponse(pricedItinerary, flightSearchRequest)
    }
    FlightSearchResponse(pricedItineraryWSResponses = itineraryWsResp.toList, flightSearchRequest = flightSearchRequest)
  }

  def toPricingItineraryWSResponse(pricedItinerary: NodeSeq, flightSearchRequest: FlightSearchRequest) = {
    val airItineraryWSResponse = toAirItineraryWSResponse(pricedItinerary \ "AirItinerary", pricedItinerary \ "TicketingInfo" \@ "TicketType")
    val pricingInfoWSResponse = toPricingInfoWSResponse(pricedItinerary \ "AirItineraryPricingInfo", flightSearchRequest)
    val ticketingInfoWSResponse = toTicketingInfoWSResponse(pricedItinerary \ "TicketingInfo")
    val itineraryWSResponse = new ItineraryWSResponse()
    itineraryWSResponse.setSequenceNumber(pricedItinerary \@ "SequenceNumber")
    itineraryWSResponse.setAirItineraryWSResponse(airItineraryWSResponse)
    itineraryWSResponse.setPricingInfoWSResponse(pricingInfoWSResponse)
    itineraryWSResponse.setTicketingInfoWSResponse(ticketingInfoWSResponse)
    itineraryWSResponse.setAirline(airItineraryWSResponse.originDestinationWSResponses.head.getMarketingAirline)
    itineraryWSResponse.setAirlineCode(airItineraryWSResponse.originDestinationWSResponses.head.getMarketingAirlineCode)
    itineraryWSResponse.setSupplier(flightSearchRequest.supplier)
    itineraryWSResponse.setTicketLocale(flightSearchRequest.ticketLocale)
    itineraryWSResponse.setSalesCategory(flightSearchRequest.salesCategory)
    itineraryWSResponse.setTicketPolicy(flightSearchRequest.ticketPolicy)
    itineraryWSResponse.setSearchRequest(flightSearchRequest)
    itineraryWSResponse
  }

  def toAirItineraryWSResponse(airItinerary: NodeSeq, ticketInfo: String) = {
    val originDestinationOptionsNode = airItinerary \ "OriginDestinationOptions" \\ "OriginDestinationOption"
    AirItineraryWSResponse(
      directionIndicator = airItinerary \@ "DirectionInd",
      originDestinationWSResponses = originDestinationOptionsNode.map(a => toOriginDestinationWSResponse(a, ticketInfo)).toList
    )
  }

  def toPricingInfoWSResponse(airItineraryPricingInfo: NodeSeq, flightSearchRequest: FlightSearchRequest) = {
    val pricingInfoWSResponse = new PricingInfoWSResponse
    val itineraryTotalFare = airItineraryPricingInfo \ "ItinTotalFare"
    val totalFare = itineraryTotalFare \ "TotalFare"
    val ptcFareBreakdowns = airItineraryPricingInfo \\ "PTC_FareBreakdown"
    val fareInfos = airItineraryPricingInfo \\ "FareInfos"

    pricingInfoWSResponse.setPricingSource(airItineraryPricingInfo \@ "PricingSource")
    if ((itineraryTotalFare \ "EquivFare" \@ "Amount").nonEmpty) pricingInfoWSResponse.setBaseFare(BaseFare((itineraryTotalFare \ "EquivFare" \@ "Amount").toDouble, totalFare \@ "CurrencyCode"))
    pricingInfoWSResponse.setTotalTax((itineraryTotalFare \ "Taxes" \\ "Tax").map(taxTotal => TaxFare((taxTotal \@ "Amount").toDouble, taxTotal \@ "CurrencyCode", taxCode =  taxTotal \@ "TaxCode")).toList)
    pricingInfoWSResponse.setTotalFare((totalFare \@ "Amount").toDouble)
    pricingInfoWSResponse.setCurrencyCode(totalFare \@ "CurrencyCode")
    pricingInfoWSResponse.setPassengerFare(ptcFareBreakdowns.map(toFareBreakDown).toList)
    pricingInfoWSResponse.setFareBasisCode((ptcFareBreakdowns \ "FareBasisCodes" \\ "FareBasisCode" head) text)
    pricingInfoWSResponse.setResBookDesigQuantity((fareInfos \\ "FareInfo" head) \ "SeatsRemaining" \@ "Number")
    pricingInfoWSResponse.setCabinClassCode((fareInfos \\ "FareInfo" head) \ "Cabin" \@ "Cabin")
    pricingInfoWSResponse.setFareReferenceCode((fareInfos \\ "FareInfo" head) \ "FareReference" text)

    var childBase: Double = 0
    var childTax: Double = 0
    var infantBase: Double = 0
    var infantTax: Double = 0
    var adultBase: Double = 0
    var adultTax: Double = 0
    for (fareBreakDown <- pricingInfoWSResponse.getPassengerFare) {
      var numberOfAdult: Int = 1
      if (fareBreakDown.passengerType.code == PassengerCode.ADULT) {
        numberOfAdult = fareBreakDown.passengerType.quantity
      }
      if (fareBreakDown.passengerType.code == PassengerCode.SABRE_CHILD) {
        childBase = fareBreakDown.passengerFare.baseFare.doubleValue() / numberOfAdult * 70 / 100 * fareBreakDown.passengerType.quantity
        childTax = fareBreakDown.passengerFare.totalTax.doubleValue() / numberOfAdult * 70 / 100 * fareBreakDown.passengerType.quantity
        //        pricingInfoWSResponse.setChildrenBaseFair(childBase)
        //        pricingInfoWSResponse.setChildrenTaxFair(childTax)
        //        pricingInfoWSResponse.setChildrenTotal(childBase + childTax)
      }
      if (fareBreakDown.passengerType.code == PassengerCode.INFANT) {
        infantBase = fareBreakDown.passengerFare.baseFare.doubleValue() / numberOfAdult * 10 / 100 * fareBreakDown.passengerType.quantity
        infantTax = fareBreakDown.passengerFare.totalTax.doubleValue() / numberOfAdult * 10 / 100 * fareBreakDown.passengerType.quantity
        //        pricingInfoWSResponse.setInfantBaseFair(infantBase)
        //        pricingInfoWSResponse.setInfantTaxFair(infantTax)
        //        pricingInfoWSResponse.setInfantTotal(infantBase + infantTax)
      }
      if (fareBreakDown.passengerType.code == PassengerCode.ADULT) {
        adultTax = fareBreakDown.passengerFare.totalTax.doubleValue() - (childTax + infantTax)
        adultBase = fareBreakDown.passengerFare.baseFare.doubleValue() - (childBase + infantBase)
        //        pricingInfoWSResponse.setAdultBaseFair(adultBase)
        //        pricingInfoWSResponse.setAdultTaxFair(adultTax)
        //        pricingInfoWSResponse.setAdultTotal(adultBase + adultTax)
      }
    }
    pricingInfoWSResponse
  }

  def toTicketingInfoWSResponse(ticketingInfo: NodeSeq) = TicketingInfoWSResponse(ticketType = TicketType.fromValue(ticketingInfo \@ "TicketType"))

  def toOriginDestinationWSResponse(originDestinationOption: NodeSeq, ticketInfo: String) = {
    val originDestinationWSResponse = new OriginDestinationWSResponse
    val flightSegmentNodes = originDestinationOption \\ "FlightSegment"
    val flightSegments = flightSegmentNodes.map(flightSegmentNodes => toFlightSegmentWSResponse(flightSegmentNodes, ticketInfo)).toList
    originDestinationWSResponse.setFlightSegmentWSResponses(flightSegments)
    originDestinationWSResponse.setDepartureDateTime(flightSegments.head.getDepartureDateTime)
    originDestinationWSResponse.setArrivalDateTime(flightSegments.last.getArrivalDateTime)

    val interval = Duration.between(dtFormat.parse(flightSegments.head.getDepartureDateTime).toInstant, dtFormat.parse(flightSegments.last.getArrivalDateTime).toInstant)
    originDestinationWSResponse.setDuration(s"${interval.toHours}${interval.toMinutes}")

    originDestinationWSResponse.setOriginAirportCode(flightSegments.head.getDepartureAirportCode)
    originDestinationWSResponse.setOriginAirport(flightSegments.head.getDepartureAirport)

    originDestinationWSResponse.setDestinationAirportCode(flightSegments.last.getArrivalAirportCode)
    originDestinationWSResponse.setDestinationAirport(flightSegments.last.getArrivalAirportCode)

    originDestinationWSResponse.setFlightNumber(flightSegments.head.getFlightNumber)
    originDestinationWSResponse.setFlightNote(flightSegments.head.getFlightEquipment.mkString(";"))

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
    originDestinationWSResponse
  }


  def toFlightSegmentWSResponse(flightSegment: NodeSeq, ticketInfo: String) = {
    val departingTime = flightSegment \@ "DepartureDateTime"
    val arrivalTime = flightSegment \@ "ArrivalDateTime"
    val duration = Duration.between(dtFormat.parse(departingTime).toInstant, dtFormat.parse(arrivalTime).toInstant)

    val elapsedTime = s"${duration.toHours}:${duration.toMinutes}"

    val flightSegmentWSResponse = new FlightSegmentWSResponse()
    flightSegmentWSResponse.setAirEquipType(flightSegment \ "Equipment" \@ "AirEquipType")
    flightSegmentWSResponse.setArrivalAirportCode(flightSegment \ "ArrivalAirport" \@ "LocationCode")
    flightSegmentWSResponse.setArrivalDateTime(arrivalTime)
    flightSegmentWSResponse.setDepartureAirportCode(flightSegment \ "DepartureAirport" \@ "LocationCode")
    flightSegmentWSResponse.setDepartureDateTime(departingTime)
    flightSegmentWSResponse.setMarketingAirlineCode(flightSegment \ "MarketingAirline" \@ "Code")
    flightSegmentWSResponse.setOperatingAirlineCode(flightSegment \ "OperatingAirline" \@ "Code")
    flightSegmentWSResponse.setFlightNumber(flightSegment \ "OperatingAirline" \@ "FlightNumber")
    flightSegmentWSResponse.setETicketEligible(ticketInfo equalsIgnoreCase "eTicket")
    flightSegmentWSResponse.setDuration(elapsedTime)
    flightSegmentWSResponse.setStopQuantity(Integer.parseInt(flightSegment \@ "StopQuantity"))
    flightSegmentWSResponse.setResBookDesigCode(flightSegment \@ "ResBookDesigCode")
    flightSegmentWSResponse.setMarriageGrp((flightSegment \ "MarriageGrp").text)
    flightSegmentWSResponse.setCabin(CabinGetter.getCabinClass((flightSegment \ "MarriageGrp").text, flightSegment \ "OperatingAirline" \@ "Code"))
//    flightSegmentWSResponse.setNumberInParty(Integer.parseInt(flightSegment \@ "NumberInParty"))
//    flightSegmentWSResponse.setRPH()
    flightSegmentWSResponse
  }

  def toFareBreakDown(ptcFareBreakdown: NodeSeq) = FareBreakDown(
    passengerType = toPassengerType(ptcFareBreakdown \ "PassengerTypeQuantity"),
    passengerFare = toPassengerFare(ptcFareBreakdown \ "PassengerFare")
  )


  def toPassengerType(passengerTypeQuantity: NodeSeq) = {
    val passengerCode = passengerTypeQuantity \@ "Code"
    val quantity = passengerTypeQuantity \@ "Quantity"
    val passengerType = PassengerType(code = PassengerCode.fromValue(passengerCode), quantity = quantity.toInt)
    passengerType
  }

  def toPassengerFare(passengerFareNode: NodeSeq) = {
    val totalTax = (passengerFareNode \ "Taxes" \\ "Tax").map(x => x \@ "Amount" toDouble).sum
    PassengerFare(
      baseFare = (passengerFareNode \ "EquivFare" \@ "Amount").toDouble,
      totalTax = totalTax,
      totalFare = (passengerFareNode \ "TotalFare" \@ "Amount").toDouble
    )
  }

}
