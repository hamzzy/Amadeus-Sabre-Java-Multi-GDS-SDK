package flight.dto.entity

case class FareBreakDown(passengerType: PassengerType = PassengerType(),
                         passengerFare: PassengerFare = PassengerFare(),
                         quantity: Int = 0,
                         ticktingRules: List[TicketingRule] = Nil) extends BaseDto