package flight.dto.entity

import org.joda.time.format.DateTimeFormat

import scala.beans.BeanProperty

class FlightSegmentWSResponse extends BaseDto {
  @BeanProperty var departureAirport: String = EMPTY_STRING
  @BeanProperty var departureAirportTbl: Airports = Airports()
  @BeanProperty var arrivalAirport: String = EMPTY_STRING
  @BeanProperty var arrivalAirportTbl: Airports = Airports()
  @BeanProperty var departureAirportCode: String = EMPTY_STRING
  @BeanProperty var departureTerminal: String = EMPTY_STRING
  @BeanProperty var arrivalAirportCode: String = EMPTY_STRING
  @BeanProperty var arrivalTerminal: String = EMPTY_STRING
  @BeanProperty var airportCodeContext: String = EMPTY_STRING
  @BeanProperty var departureTimeZone: String = EMPTY_STRING
  @BeanProperty var arrivalTimeZone: String = EMPTY_STRING
  @BeanProperty var departureDateTime: String = EMPTY_STRING
  @BeanProperty var arrivalDateTime: String = EMPTY_STRING
  @BeanProperty var durationTripXML: String = EMPTY_STRING
  @BeanProperty var duration: String = EMPTY_STRING
  @BeanProperty var sector: String = EMPTY_STRING
  @BeanProperty var flightSegmentId: String = EMPTY_STRING
  @BeanProperty var marketingAirline: Airlines = Airlines()
  @BeanProperty var marketingAirlineCode: String = EMPTY_STRING
  @BeanProperty var operatingAirline: Airlines = Airlines()
  @BeanProperty var operatingAirlineCode: String = EMPTY_STRING
  @BeanProperty var cabin: String = EMPTY_STRING
  @BeanProperty var RPH: String = EMPTY_STRING
  @BeanProperty var baggage: List[Baggage] = List()
  @BeanProperty var flightNumber: String = EMPTY_STRING
  @BeanProperty var flightEquipment: List[String] = Nil
  @BeanProperty var resBookDesigCode: String = EMPTY_STRING
  @BeanProperty var resBookDesigCabinCode: String = EMPTY_STRING
  @BeanProperty var airEquipType: String = EMPTY_STRING
  @BeanProperty var numberInParty = 0
  @BeanProperty var eTicketEligible = false
  @BeanProperty var mealCode: String = EMPTY_STRING
  @BeanProperty var stopQuantity = 0
  @BeanProperty var elapseTime: String = EMPTY_STRING
  @BeanProperty var originDestinationType: String = EMPTY_STRING
  @BeanProperty var marriageGrp: String = EMPTY_STRING
}
