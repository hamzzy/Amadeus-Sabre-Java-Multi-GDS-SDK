package wsimport.lib.sabre

import java.util.{List => JList}

import flight.converter.sabre.SabreBookItineraryConverter.enhancedAirBook
import flight.dto.entity.{BookingRequest, BookingResponse, PNRDetails, PriceQuote}
import flight.invoker.Invoker
import flight.invoker.sabre.client.SabreSoapService
import flight.invoker.sabre.utils.{BookingResponses, PassengerDetailsSOAPUtil}

import scala.collection.JavaConverters._
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 8:32 PM.
  */
object SabreBookItineraryInvoker extends Invoker[(BookingResponse, PNRDetails)] with SabreSoapService with BookingResponses with PassengerDetailsSOAPUtil{


  private[this] def passengerDetails(binaryToken: String, bookingRequest: BookingRequest, priceQuotes: JList[PriceQuote]) = Future {
    val request = passengerDetailsRequest(binaryToken, bookingRequest, priceQuotes)
    val response = callService(request)
    println(request)
    println(response)
    toPNRDetails(parsePassengerDetailsRS(response) \ "ItineraryRef")
  }

  private[this] def enhancedAirBookRQ(bookingRequest: BookingRequest) = Future {
    val request = enhancedAirBook(session, bookingRequest)
    val response = callService(request)
    toBookingResponse(response \ "Body" \ "EnhancedAirBookRS" head)
  }

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[(BookingResponse, PNRDetails)] = for {
    bookingResponse <- enhancedAirBookRQ(value.asInstanceOf[BookingRequest])
    pnrDetails <- passengerDetails(session, value.asInstanceOf[BookingRequest], bookingResponse.priceQuotes.asJava)
  } yield (bookingResponse, pnrDetails)

  import scala.concurrent.duration._
  override def invoke(value: AnyRef): (BookingResponse, PNRDetails) = Await.result(invokeAsync(value), 60 seconds)

}