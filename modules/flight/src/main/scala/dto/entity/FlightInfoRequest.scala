package flight.dto.entity

case class FlightInfoRequest(itineraryWSResponse: ItineraryWSResponse = new ItineraryWSResponse(), minimumRule: Boolean = true) extends BaseDto