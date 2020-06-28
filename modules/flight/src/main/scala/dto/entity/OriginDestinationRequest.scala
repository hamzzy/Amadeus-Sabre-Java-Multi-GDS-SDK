package flight.dto.entity

case class OriginDestinationRequest(origin: Airports = Airports(),
                                    destination: Airports = Airports(),
                                    departureDateTime: String,
                                    multiAirportsInd: Boolean = false,
                                    originCity: List[String] = Nil,
                                    RPH: String = "") extends BaseDto