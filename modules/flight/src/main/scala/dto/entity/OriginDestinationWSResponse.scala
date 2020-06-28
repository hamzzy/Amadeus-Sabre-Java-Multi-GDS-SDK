package flight.dto.entity

import java.text.{ParseException, SimpleDateFormat}

import org.joda.time.Interval
import org.joda.time.format.DateTimeFormat

import scala.beans._

class OriginDestinationWSResponse extends BaseDto {
  @BeanProperty var flightSegmentWSResponses: List[FlightSegmentWSResponse] = Nil
  @BeanProperty var originAirport: String = EMPTY_STRING
  @BeanProperty var originAirportCode: String = EMPTY_STRING
  @BeanProperty var destinationAirport: String = EMPTY_STRING
  @BeanProperty var destinationAirportCode: String = EMPTY_STRING
  @BeanProperty var departureDateTime: String = EMPTY_STRING
  @BeanProperty var arrivalDateTime: String = EMPTY_STRING
  @BeanProperty var duration: String = EMPTY_STRING
  //Crane specific for now.
  @BeanProperty var flightNote: String = EMPTY_STRING
  @BeanProperty var flightNumber: String = EMPTY_STRING
  @BeanProperty var equipmentName: String = EMPTY_STRING
  @BeanProperty var segmentsXml: String = EMPTY_STRING
  @BeanProperty var isNextDayArrival: Boolean = false
  @BeanProperty var marketingAirline: Airlines = Airlines()
  @BeanProperty var marketingAirlineCode: String = EMPTY_STRING
  @BeanProperty var operatingAirline: Airlines = Airlines()
  @BeanProperty var operatingAirlineCode: String = EMPTY_STRING
  @BeanProperty var cabin: String = EMPTY_STRING
  @BeanProperty var seatAvailable: String = EMPTY_STRING
  @BeanProperty var resBookDesigCode: String = EMPTY_STRING
  @BeanProperty var resBookDesigCabinCode: String = EMPTY_STRING
  @BeanProperty var baggageAllowance: List[Baggage] = List()
  @BeanProperty var isMultiAirline = false
  @BeanProperty var numberOfStops = 0
  @BeanProperty var terminal: String = EMPTY_STRING
  @BeanProperty var directionId: Int = -1
  @BeanProperty var refNumber: Int = -1
  @BeanProperty var tripCode: String = EMPTY_STRING //for dana air
  @BeanProperty var originAirportTbl: Airports = Airports()
  @BeanProperty var destinationAirportTbl: Airports = Airports()


  def isOvernightFlight = {
    var dateFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
    try {
      val departure = dateFormat.parseDateTime(getDepartureDateTime)
      val arrival = dateFormat.parseDateTime(getArrivalDateTime)
      arrival.getDayOfMonth - departure.getDayOfMonth
    } catch {
      case _: Throwable => {
        dateFormat = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss")
        val departure = dateFormat.parseDateTime(getDepartureDateTime)
        val arrival = dateFormat.parseDateTime(getArrivalDateTime)
        arrival.getDayOfMonth - departure.getDayOfMonth
      }
    }

  }

  def getLayOver: List[String] = {
    var layovers: List[String] = Nil
    try {
      val dtFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
      for (i <- 1 to getNumberOfStops) {
        i match {
          case 1 =>
            val arrivalSecs = dtFormat.parse(flightSegmentWSResponses.head.getArrivalDateTime).getTime
            val departureSecs = dtFormat.parse(flightSegmentWSResponses(1).getDepartureDateTime).getTime
            val interval = new Interval(arrivalSecs, departureSecs)
            val layoverTime = interval.toDuration.toStandardMinutes.getMinutes
            layovers ::= (layoverTime / 60 + "H:") + (layoverTime % 60) + "M"
          case 2 =>
            val secondLayoverDep = dtFormat.parse(flightSegmentWSResponses(2).getDepartureDateTime).getTime
            val secondLayoverArr = dtFormat.parse(flightSegmentWSResponses(1).getArrivalDateTime).getTime
            val interval = new Interval(secondLayoverArr, secondLayoverDep)
            val secondLayoverSec = interval.toDuration.toStandardMinutes.getMinutes
            layovers ::= (secondLayoverSec / 60 + "h:") + (secondLayoverSec % 60) + "m"
          case 3 =>
            val thirdLayoverDep = dtFormat.parse(flightSegmentWSResponses(3).getDepartureDateTime).getTime
            val thirdLayoverArr = dtFormat.parse(flightSegmentWSResponses(2).getArrivalDateTime).getTime
            val interval = new Interval(thirdLayoverArr, thirdLayoverDep)
            val thirdLayoverSec = interval.toDuration.toStandardMinutes.getMinutes
            layovers ::= (thirdLayoverSec / 60 + "h:") + (thirdLayoverSec % 60) + "m"
        }
      }
    } catch {
      case _: Throwable => {
        val dtFormatAlt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        for (i <- 1 to getNumberOfStops) {
          i match {
            case 1 =>
              val arrivalSecs = dtFormatAlt.parse(flightSegmentWSResponses.head.getArrivalDateTime).getTime
              val departureSecs = dtFormatAlt.parse(flightSegmentWSResponses(1).getDepartureDateTime).getTime
              val interval = new Interval(arrivalSecs, departureSecs)
              val layoverTime = interval.toDuration.toStandardMinutes.getMinutes
              layovers ::= (layoverTime / 60 + "H:") + (layoverTime % 60) + "M"
            case 2 =>
              val secondLayoverDep = dtFormatAlt.parse(flightSegmentWSResponses(2).getDepartureDateTime).getTime
              val secondLayoverArr = dtFormatAlt.parse(flightSegmentWSResponses(1).getArrivalDateTime).getTime
              val interval = new Interval(secondLayoverArr, secondLayoverDep)
              val secondLayoverSec = interval.toDuration.toStandardMinutes.getMinutes
              layovers ::= (secondLayoverSec / 60 + "h:") + (secondLayoverSec % 60) + "m"
            case 3 =>
              val thirdLayoverDep = dtFormatAlt.parse(flightSegmentWSResponses(3).getDepartureDateTime).getTime
              val thirdLayoverArr = dtFormatAlt.parse(flightSegmentWSResponses(2).getArrivalDateTime).getTime
              val interval = new Interval(thirdLayoverArr, thirdLayoverDep)
              val thirdLayoverSec = interval.toDuration.toStandardMinutes.getMinutes
              layovers ::= (thirdLayoverSec / 60 + "h:") + (thirdLayoverSec % 60) + "m"
          }
        }
      }
    }
    layovers
  }

}
