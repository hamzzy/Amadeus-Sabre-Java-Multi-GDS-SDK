package flight.dto.entity

import dto.entity.enums.PassengerCode

case class PassengerType(quantity: Int = 1, code: PassengerCode = PassengerCode.ADULT) extends BaseDto