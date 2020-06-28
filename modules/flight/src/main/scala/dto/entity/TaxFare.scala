package flight.dto.entity

case class TaxFare(amount: Double, currency: String, taxCode: String = "", taxDescription:String = "") extends BaseDto {

}
