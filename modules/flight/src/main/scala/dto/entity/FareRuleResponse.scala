package flight.dto.entity

import flight.dto.entity.FareRule

case class FareRuleResponse(flightInfoRequest: FlightInfoRequest = FlightInfoRequest(),
                            fareRules: List[FareRule] = Nil,
                            pricedMessageInfo: List[PricedMessageInfo] = Nil)