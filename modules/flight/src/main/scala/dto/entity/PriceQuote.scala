package flight.dto.entity

case class PriceQuote(RPH: String = "",
                      baseFare: Double = .0,
                      totalTax: Double = .0,
                      totalFare: Double = .0,
                      passengerType: PassengerType = PassengerType()) {
  override def toString: String = "PriceQuote{RPH='" + this.RPH + '\'' + ", baseFare=" + this.baseFare + ", totalTax=" + this.totalTax + ", totalFare=" + this.totalFare + ", passengerType=" + this.passengerType + '}'
}
