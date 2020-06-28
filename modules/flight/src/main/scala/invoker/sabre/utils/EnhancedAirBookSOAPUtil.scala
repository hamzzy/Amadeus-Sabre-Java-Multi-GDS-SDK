/**
 * Created by Igbalajobi Jamiu O. on 4/19/2016.
 */

package flight.invoker.sabre.utils

import java.util.{List => JList}

import dto.entity.enums.PassengerCode
import flight.dto.entity._

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.xml.{Node, NodeSeq}

class EnhancedAirBookSOAPUtil extends SabreXMLRequestUtils {
  val SERVICE = configuration.getString("sabre.enhancedAirBook.service")
  val ACTION = configuration.getString("sabre.enhancedAirBook.action")
  val DESCRIPTION = configuration.getString("sabre.enhancedAirBook.description")

  def enhancedAirBook(binarySecurityToken: String, bookingRequest: BookingRequest) = {
    val requestXml = {
      <EnhancedAirBookRQ version="3.2.0" xmlns="http://services.sabre.com/sp/eab/v3_2" IgnoreOnError="true" HaltOnError="true">
        <OTA_AirBookRQ>
          { getHaltOnStatusNodes }
          <OriginDestinationInformation>
            { toFlightSegmentNodes(bookingRequest.getItineraryWSResponse.getAirItineraryWSResponse.originDestinationWSResponses.head.flightSegmentWSResponses, bookingRequest.numberInParty) }
          </OriginDestinationInformation>
        </OTA_AirBookRQ>
        <OTA_AirPriceRQ>
          <PriceComparison AmountSpecified={ bookingRequest.getItineraryWSResponse.getPricingInfoWSResponse.getTotalFare.toString }/>
          { getPriceRequestInformationNode(bookingRequest.getPassengers.asJava)  }
        </OTA_AirPriceRQ>
        { getPostProcessingNodes }
        <PreProcessing IgnoreBefore="true"/>
      </EnhancedAirBookRQ>
    }
    soapTemplateWithToken(binarySecurityToken, SERVICE, ACTION, DESCRIPTION, requestXml)
  }

  private def toFlightSegmentNodes(flightSegments: JList[FlightSegmentWSResponse], numberInParty: Int): ArrayBuffer[Node] = {
    val nodeBuffer = new ArrayBuffer[Node]()
    for ((flightSegment, index) <- flightSegments.zipWithIndex) yield {
      <FlightSegment ResBookDesigCode={ flightSegment.getResBookDesigCode } FlightNumber={ flightSegment.getFlightNumber } DepartureDateTime={ flightSegment.getDepartureDateTime } ArrivalDateTime={ flightSegment.getArrivalDateTime } NumberInParty={ numberInParty.toString } Status="NN">
        <DestinationLocation LocationCode={ flightSegment.getArrivalAirportCode }/>
        <Equipment AirEquipType={ flightSegment.getAirEquipType }/>
        <MarketingAirline FlightNumber={ flightSegment.getFlightNumber } Code={ flightSegment.getMarketingAirlineCode }/>
        <MarriageGrp Ind={ if (flightSegment.getMarriageGrp.equals("I")) "true" else "false" }/>
        <OperatingAirline Code={ flightSegment.getMarketingAirlineCode }/>
        <OriginLocation LocationCode={ flightSegment.getDepartureAirportCode }/>
      </FlightSegment>
    }.foreach(nodeBuffer += _)
    nodeBuffer
  }

  private def toPassengerTypeNodes(passengerTypes: JList[Passenger]): ArrayBuffer[Node] = {
    val nodeBuffer = new ArrayBuffer[Node]()
    for (passengerType <- passengerTypes.distinct) yield {
      <PassengerType Code={ passengerType.code.value() } Quantity={ passengerTypes.count(_.code.equals(passengerType.code)).toString }/>
    }.foreach(nodeBuffer += _)
    nodeBuffer
  }

  private def getHaltOnStatusNodes = {
    <HaltOnStatus Code="NO"/>
    <HaltOnStatus Code="NN"/>
    <HaltOnStatus Code="UC"/>
    <HaltOnStatus Code="US"/>
  }

  private def getPostProcessingNodes = {
    <PostProcessing IgnoreAfter="false">
      <RedisplayReservation WaitInterval="5000"/>
    </PostProcessing>
  }

  private def getPriceRequestInformationNode(passengerTypes: JList[Passenger]) = {
    <PriceRequestInformation Retain="true">
      <OptionalQualifiers>
        <PricingQualifiers CurrencyCode={ CURRENCY }>
          <BargainFinder Rebook="true"/>
          { toPassengerTypeNodes(passengerTypes) }
        </PricingQualifiers>
      </OptionalQualifiers>
    </PriceRequestInformation>
  }
}

trait BookingResponses {
  def toBookingResponse(enhancedAirBookRSNode: Node) = {
    val otaAirPriceRSNode = enhancedAirBookRSNode \ "OTA_AirPriceRS"
    val priceComparisonNode = otaAirPriceRSNode \ "PriceComparison"
    val travelItineraryReadRSNode = enhancedAirBookRSNode \ "TravelItineraryReadRS"
    val itineraryInfoNode = travelItineraryReadRSNode \ "TravelItinerary" \ "ItineraryInfo"
    val itineraryPricingNode = itineraryInfoNode \ "ItineraryPricing"
    val reservationItems = itineraryInfoNode \ "ReservationItems" \ "Item"
    BookingResponse(
      priceComparison = toPriceComparison(priceComparisonNode),
      priceQuotes =  (itineraryPricingNode \ "PriceQuote").toList.map(priceQuoteNode => toPriceQuote(priceQuoteNode)),
      reservationItems =  reservationItems.toList.map(priceQuoteNode => toReservationItem(priceQuoteNode))
    )
  }

  private def toPriceComparison(priceComparisonNode: NodeSeq) = {
    PriceComparison(amountSpecified = (priceComparisonNode \@ "AmountSpecified").toDouble, amountReturned = (priceComparisonNode \@ "AmountReturned").toDouble)
  }

  private def toPriceQuote(priceQuoteNode: NodeSeq) = {
    val totals = priceQuoteNode \\ "Totals"
    val passengerTypeQty = priceQuoteNode \\ "PassengerTypeQuantity"
    PriceQuote(RPH = priceQuoteNode \@ "RPH",
      baseFare = (totals \ "EquivFare" \@ "Amount").toDouble,
      totalTax = (totals \ "Taxes" \ "Tax" \@ "Amount").toDouble,
      totalFare = (totals \ "TotalFare" \@ "Amount").toDouble,
      passengerType = PassengerType(code = PassengerCode.fromValue(passengerTypeQty \@ "Code"), quantity = (passengerTypeQty \@ "Quantity").toInt)
    )
  }

  private def toReservationItem(item: NodeSeq) = {
    val reservationItem = new ReservationItem
    val flightSegment = item \ "FlightSegment"

    reservationItem.setRPH(item \@ "RPH")
    reservationItem.setETicketType((flightSegment \@ "eTicket").toBoolean)
    reservationItem.setStopQuantity((flightSegment \@ "StopQuantity").toInt)
    reservationItem.setStatus(flightSegment \@ "Status")
    reservationItem.setSpecialMeal((flightSegment \@ "SpecialMeal").toBoolean)
    reservationItem.setSmokingAllowed((flightSegment \@ "SmokingAllowed").toBoolean)
    reservationItem.setSegmentNumber((flightSegment \@ "SegmentNumber").toInt)
    reservationItem.setResBookingCode(flightSegment \@ "ResBookDesigCode")
    reservationItem.setNumberInParty((flightSegment \@ "NumberInParty").toInt)
    reservationItem.setFlightNumber((flightSegment \@ "FlightNumber").toInt)
    reservationItem.setElapsedTime(flightSegment \@ "ElapsedTime")
    reservationItem.setDepartureDateTime(flightSegment \@ "DepartureDateTime")
    reservationItem.setDayOfWeekInd(flightSegment \@ "DayOfWeekInd")
    reservationItem.setArrivalDateTime(flightSegment \@ "ArrivalDateTime")
    reservationItem.setAirMilesFlown((flightSegment \@ "AirMilesFlown").toInt)
    reservationItem.setDestinationLocationCode(flightSegment \ "DestinationLocation" \@ "LocationCode")
    reservationItem.setAirEquipType(flightSegment \ "Equipment" \@ "AirEquipType")
    reservationItem.setAirline(flightSegment \ "MarketingAirline" \@ "Code")
    reservationItem.setMarriageGrp(flightSegment \ "MarriageGrp" \@ "Ind")
    reservationItem.setMealCode(flightSegment \ "Meal" \@ "Code")
    reservationItem.setOriginLocationCode(flightSegment \ "OriginLocation" \@ "LocationCode")
    reservationItem.setUpdatedArrivalTime((flightSegment \ "UpdatedArrivalTime").text)
    reservationItem.setUpdatedDepartureTime((flightSegment \ "UpdatedDepartureTime").text)
    reservationItem
  }
}
