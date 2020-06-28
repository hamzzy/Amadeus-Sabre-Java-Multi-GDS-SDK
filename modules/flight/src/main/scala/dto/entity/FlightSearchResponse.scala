package flight.dto.entity

import dto.SearchRequestHeader

case class FlightSearchResponse(flightSearchRequest: FlightSearchRequest = FlightSearchRequest(),
                                pricedItineraryWSResponses: List[ItineraryWSResponse] = Nil,
                                connectionItineraryResponses: List[ConnectionFlightItineraryResponse] = Nil,
                                sessionId: String = "",
                                requestLog: String = "",
                                responseLog: String = ""
                               ) extends BaseDto

case class ConnectionFlightItineraryResponse(departure: Airports,
                                             arrival: Airports,
                                             itineraryWSResponse: List[ItineraryWSResponse] = Nil,
                                             selectedItinerary: List[ItineraryWSResponse] = Nil) extends BaseDto