package flight.dto.entity

case class PassengerFare(baseFare: BigDecimal = BigDecimal(.0), totalTax: BigDecimal = BigDecimal(.0), totalFare: BigDecimal = BigDecimal(.0))