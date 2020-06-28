package flight.dto.entity

import java.util.Objects

case class BookingResponse(priceQuotes:List[PriceQuote],
                           priceComparison: PriceComparison,
                           reservationItems: List[ReservationItem] = Nil,
                           bookingRequest: BookingRequest = new BookingRequest()
                          ) extends BaseDto {
  override def toString: String = "BookingResponse{priceQuotes=" + this.priceQuotes + ", priceComparison=" + this.priceComparison + '}'

  override def hashCode: Int = Objects.hash(Array[AnyRef](this.priceQuotes, this.priceComparison, this.reservationItems))
}
