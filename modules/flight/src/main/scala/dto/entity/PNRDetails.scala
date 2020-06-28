package flight.dto.entity

import scala.beans.BeanProperty

class PNRDetails extends BaseDto {
  @BeanProperty var status: String = EMPTY_STRING
  @BeanProperty var response = EMPTY_STRING
  @BeanProperty var bookingRequest: BookingRequest = new BookingRequest()
  @BeanProperty var gdsPlainResponse: AnyRef = NULL
  @BeanProperty var errors: List[String] = List()
  @BeanProperty var pnrRemarks: List[PnrRemark] = Nil
  @BeanProperty var itineraryRef: String = EMPTY_STRING
  @BeanProperty var airlineRef: String = EMPTY_STRING
  @BeanProperty var ticketTimeLimit: String = EMPTY_STRING
  @BeanProperty var requestXml: String = EMPTY_STRING
  @BeanProperty var responseXml: String = EMPTY_STRING
  @BeanProperty var setAPILog: String = EMPTY_STRING
  @BeanProperty var ticketAmount: BigDecimal = BigDecimal(.0)
  @BeanProperty var failBackItineraryInfo: ItineraryWSResponse = new ItineraryWSResponse()
}
