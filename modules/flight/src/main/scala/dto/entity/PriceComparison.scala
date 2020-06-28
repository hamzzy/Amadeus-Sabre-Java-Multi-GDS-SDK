package flight.dto.entity

case class PriceComparison(amountSpecified: Double, amountReturned: Double) extends BaseDto {
  override def toString: String = "PriceComparison{amountSpecified=" + this.amountSpecified + ", amountReturned=" + this.amountReturned + '}'
}
