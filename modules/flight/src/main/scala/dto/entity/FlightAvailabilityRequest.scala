package flight.dto.entity

case class FlightAvailabilityRequest(bookingRequest: BookingRequest = new BookingRequest()) extends BaseDto {
  lazy val numberInParty: Int = bookingRequest.getPassengers.size
}
