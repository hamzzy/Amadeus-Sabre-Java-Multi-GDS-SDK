package flight.dto.entity

import scala.beans.BeanProperty

class BookingRequest extends BaseDto {
  @BeanProperty var passengers: List[Passenger] = List()
  @BeanProperty var otaRequestXML: String = EMPTY_STRING
  @BeanProperty var paymentMethod: String = EMPTY_STRING
  @BeanProperty var agentMarkup: Double = .0
  @BeanProperty var itineraryWSResponse: ItineraryWSResponse = new ItineraryWSResponse()
  @BeanProperty var owcItinerary: List[ItineraryWSResponse] = Nil
  @BeanProperty var supplier: String = EMPTY_STRING
  @BeanProperty var sessionId: String = EMPTY_STRING
  @BeanProperty var numberInParty: Int = 0
  @BeanProperty var isPricedBooking: Boolean = false
  @BeanProperty var isScheduleChanged: Boolean = false
  @BeanProperty var rePriceReferenceNo: String = EMPTY_STRING
}
