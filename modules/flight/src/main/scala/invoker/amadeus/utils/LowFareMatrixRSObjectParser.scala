package flight.invoker.amadeus.utils

import java.text.SimpleDateFormat

import flight.dto.entity._
import flight.dto.entity.enums._
import wsimport.lib.amadeus.lowfarematrix.{FlightSegment, AirItinerary, AirItineraryPricingInfo,OriginDestinationOption}
import flight.dto.entity.BaseFare
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

import dto.entity.enums.PassengerCode
import flight.dto.utils.{AirlineGetter, AirportCityGetter}
import flight.dto.utils.AirlineGetter.Implicit._
import flight.dto.utils.AirportCityGetter.Implicit.File._
import javax.xml.bind.JAXBElement

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._

object LowFareMatrixRSObjectParser {

  def parseDate(date: String): String = {
    val from = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    val to = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    to.format(from.parse(date))
  }

  def createAirItineraryWSResponse(airItinerary: AirItinerary): AirItineraryWSResponse = {
    AirItineraryWSResponse(
      directionIndicator = airItinerary.getDirectionInd.value(),
      originDestinationWSResponses = airItinerary.getOriginDestinationOptions.getOriginDestinationOption.asScala.toList.map(createOriginDestinationWSResponse)
    )
  }

  def createPricingInfoWSResponse(airItineraryPricingInfo: AirItineraryPricingInfo): PricingInfoWSResponse = {
    val decimalPlaces: Int = airItineraryPricingInfo.getItinTotalFare.getTotalFare.getDecimalPlaces()
    val baseFare: Double = airItineraryPricingInfo.getItinTotalFare.getBaseFare.getAmount
    var tax: Double = .0
    airItineraryPricingInfo.getItinTotalFare.getTaxes.getTax.foreach(a => tax += a.getAmount)
//    tax /= 100
    val total: Double = airItineraryPricingInfo.getItinTotalFare.getTotalFare.getAmount

    val pricingInfoWSResponse = new PricingInfoWSResponse()
    pricingInfoWSResponse.setPricingSource(airItineraryPricingInfo.getPricingSource.value())
    pricingInfoWSResponse.setDecimalPlaces(decimalPlaces)
    pricingInfoWSResponse.setGdsBaseFare(baseFare)
    pricingInfoWSResponse.setGdsTaxFare(BigDecimal(tax))
    pricingInfoWSResponse.setGdsTotalFare(total)

    val currency = airItineraryPricingInfo.getItinTotalFare.getTotalFare.getCurrencyCode
    //set the pricing source to default GDS fare, although this will be later manipulated based on price rule table.
    pricingInfoWSResponse.setBaseFare(flight.dto.entity.BaseFare(baseFare, currency))
    pricingInfoWSResponse.setTotalTax(List(TaxFare(tax, currency)))
    pricingInfoWSResponse.setTotalFare(total)
    pricingInfoWSResponse.setCurrencyCode(currency)


    pricingInfoWSResponse.setPassengerFare(airItineraryPricingInfo.getPTCFareBreakdowns.getPTCFareBreakdown.map(ptcFareBreakDown => FareBreakDown(
      passengerType = PassengerType(quantity = ptcFareBreakDown.getPassengerTypeQuantity.getQuantity, code = PassengerCode.fromValue(ptcFareBreakDown.getPassengerTypeQuantity.getCode)),
      passengerFare = PassengerFare(baseFare = BigDecimal(ptcFareBreakDown.getPassengerFare.getBaseFare.getAmount), totalTax = BigDecimal(ptcFareBreakDown.getPassengerFare.getTaxes.getTax.map(_.getAmount.doubleValue()).sum / 100), totalFare = BigDecimal(ptcFareBreakDown.getPassengerFare.getTotalFare.getAmount / 100))
    )).toList)
    pricingInfoWSResponse
  }

  def createTicketingInfoWSResponse(flightSegment: FlightSegment): TicketingInfoWSResponse = {
    val eTicketEligible = flightSegment.getETicketEligibility.value()
    val dateTime = LocalDateTime.parse(flightSegment.getDepartureDateTime).plusDays(5)
    TicketingInfoWSResponse(
      ticketType = if (eTicketEligible.equals("Eligible")) flight.dto.entity.enums.TicketType.E_TICKET else null,
      eTicketEligibility = flightSegment.getETicketEligibility.value(),
      ticketTimeLimit = dateTime
    )
  }

  def createOriginDestinationWSResponse(originDestinationOption: OriginDestinationOption): OriginDestinationWSResponse = {
    val originDestinationWSResponse = new OriginDestinationWSResponse()
    implicit val airlines: Map[String, Airlines] = AirlineGetter.allAirlinesMap
    implicit val airports: Map[String, Airports] = AirportCityGetter.allAirportsMap

    val flightSegments = originDestinationOption.getFlightSegment.asScala.toList.map { flightSegment =>
      createFlightSegmentWSResponse(flightSegment)
    }
    originDestinationWSResponse.setFlightSegmentWSResponses(flightSegments)
    originDestinationWSResponse.setDirectionId(originDestinationOption.getSectorSequence.toInt)
    originDestinationWSResponse.setFlightSegmentWSResponses(flightSegments)
    originDestinationWSResponse.setDuration(flightSegments.head.getDuration)
    val departureAirport = airports.getOrElse(flightSegments.head.getDepartureAirportCode, Airports())
    val arrivingAirport = airports.getOrElse(flightSegments.last.getArrivalAirportCode, Airports())
    originDestinationWSResponse.setOriginAirportTbl(departureAirport)
    originDestinationWSResponse.setDestinationAirportTbl(arrivingAirport)
    originDestinationWSResponse.setBaggageAllowance(flightSegments.head.getBaggage)
    originDestinationWSResponse.setOriginAirportCode(flightSegments.head.getDepartureAirportCode)
    originDestinationWSResponse.setDestinationAirportCode(flightSegments.last.getArrivalAirportCode)
    val isNextDayArrival = false
    val isMultiAirline = flightSegments.map(a => a.getOperatingAirlineCode).toSet.size > 1
    originDestinationWSResponse.setIsNextDayArrival(isNextDayArrival)
    originDestinationWSResponse.setIsMultiAirline(isMultiAirline)
    originDestinationWSResponse.setNumberOfStops(if (flightSegments.size <= 1) 0 else flightSegments.size - 1)
    if (departureAirport != null) originDestinationWSResponse.setOriginAirport(flightSegments.head.getDepartureAirport)
    if (arrivingAirport != null) originDestinationWSResponse.setDestinationAirport(flightSegments.last.getArrivalAirport)
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

  def createFlightSegmentWSResponse(flightSegment: FlightSegment)(implicit airlines: Map[String, Airlines], airports: Map[String, Airports]): FlightSegmentWSResponse = {
    val flightSegmentWSResponse = new FlightSegmentWSResponse()
    flightSegmentWSResponse.setFlightNumber(flightSegment.getFlightNumber)
    flightSegmentWSResponse.setFlightEquipment(flightSegment.getEquipment.map(_.getValue).toList)
    flightSegmentWSResponse.setDepartureAirport(flightSegment.getDepartureAirport.getValue)
    val departureAirport = airports.get(flightSegment.getDepartureAirport.getLocationCode).orNull
    val arrivingAirport = airports.get(flightSegment.getArrivalAirport.getLocationCode).orNull
    flightSegmentWSResponse.setDepartureAirportTbl(departureAirport)
    flightSegmentWSResponse.setArrivalAirportTbl(arrivingAirport)
    flightSegmentWSResponse.setArrivalAirport(flightSegment.getArrivalAirport.getValue)
    flightSegmentWSResponse.setDepartureAirportCode(flightSegment.getDepartureAirport.getLocationCode)
    flightSegmentWSResponse.setArrivalAirportCode(flightSegment.getArrivalAirport.getLocationCode)
    flightSegmentWSResponse.setDepartureDateTime(parseDate(flightSegment.getDepartureDateTime))
    flightSegmentWSResponse.setArrivalDateTime(parseDate(flightSegment.getArrivalDateTime))

    val cabinContent = flightSegment.getTPAExtensions.getCabinType
    val cabinType = cabinContent.getCabin.value()
    flightSegmentWSResponse.setCabin(cabinType)

    val durationContent = flightSegment.getTPAExtensions.getJourneyDuration
//    val duration = durationContent.split(":")

    val fromDateTime = LocalDateTime.parse(flightSegment.getDepartureDateTime)
    val toDateTime = LocalDateTime.parse(flightSegment.getArrivalDateTime)

    var minutes = ChronoUnit.MINUTES.between(fromDateTime, toDateTime)
    val hours = minutes / 60
    minutes -= (hours * 60)

    flightSegmentWSResponse.setDuration(hours + ":" + minutes)

    flightSegmentWSResponse.setMarketingAirline(airlines.getOrElse(flightSegment.getMarketingAirline.getCode, Airlines(flightSegment.getMarketingAirline.getValue, flightSegment.getMarketingAirline.getCode)))
    flightSegmentWSResponse.setMarketingAirlineCode(flightSegment.getMarketingAirline.getCode)
    //    if(Option(flightSegment.getOperatingAirline).isDefined){
    flightSegmentWSResponse.setOperatingAirline(Airlines(name = flightSegment.getOperatingAirline.getValue, airlineCode = flightSegment.getOperatingAirline.getCode))
    flightSegmentWSResponse.setOperatingAirlineCode(flightSegment.getOperatingAirline.getCode)
    //    }
    flightSegmentWSResponse.setRPH(flightSegment.getRPH)
    flightSegmentWSResponse.setResBookDesigCode(flightSegment.getResBookDesigCode)
    flightSegmentWSResponse.setMarriageGrp(flightSegment.getMarriageGrp)
    flightSegmentWSResponse.setAirEquipType(flightSegment.getEquipment.asScala.head.getAirEquipType)
    flightSegmentWSResponse.setNumberInParty(flightSegment.getNumberInParty())

    if (flightSegment.getETicketEligibility.value().equals("Eligible")) {
      flightSegmentWSResponse.setETicketEligible(true)
    }
    flightSegmentWSResponse.setStopQuantity(flightSegment.getStopQuantity())
    flightSegmentWSResponse
  }

}
