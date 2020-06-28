package flight.converter.sabre

import flight.converter.Converter
import flight.dto.entity._
import flight.invoker.sabre.client.SabreSoapService
import flight.invoker.sabre.utils.{BookingResponses, EnhancedAirBookSOAPUtil}
import org.apache.commons.lang3.text.WordUtils

import scala.collection.JavaConverters._
import scala.xml.Elem

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 8:35 PM.
  */

object SabreBookItineraryConverter extends EnhancedAirBookSOAPUtil with SabreSoapService with BookingResponses with Converter[BookingRequest, PNRDetails]  {

  protected var bookingRequest:BookingRequest = _

  override def toSupplier(baseDto: AnyRef): BookingRequest = {
    bookingRequest = baseDto.asInstanceOf[BookingRequest]
    bookingRequest.setNumberInParty(bookingRequest.itineraryWSResponse.sequenceNumber.toInt)
    bookingRequest
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRDetails = {
    val (bookingResponse, pNRDetails) = response.asInstanceOf[(BookingResponse, PNRDetails)]
//    toBookingResponse(response.asInstanceOf[])
    ???
  }

}
