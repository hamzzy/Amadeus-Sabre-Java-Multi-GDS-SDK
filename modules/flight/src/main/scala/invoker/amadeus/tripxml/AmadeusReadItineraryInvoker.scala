package flight.invoker.amadeus.tripxml

import flight.invoker.Invoker
import wsimport.lib.amadeus.pnr.read.{OTAReadRQ, OTATravelItineraryRS, WsPNRRead}

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:28 PM.
  */
object AmadeusReadItineraryInvoker extends Invoker[OTATravelItineraryRS] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[OTATravelItineraryRS] = Future {
    invoke(value)
  }

  override def invoke(value: AnyRef): OTATravelItineraryRS = {
    val wsPnrRead = new WsPNRRead()
    wsPnrRead.getWsPNRReadSoap.wmPNRRead(value.asInstanceOf[OTAReadRQ])
  }
}
