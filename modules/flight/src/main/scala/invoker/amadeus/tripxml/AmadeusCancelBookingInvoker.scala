package flight.invoker.amadeus.tripxml

import flight.invoker.Invoker
import wsimport.lib.amadeus.pnr.cancel.{OTACancelRQ, OTACancelRS, WsPNRCancel}

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:28 PM.
  */
object AmadeusCancelBookingInvoker extends Invoker[OTACancelRS] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[OTACancelRS] = Future {
    invoke(value)
  }

  override def invoke(value: AnyRef): OTACancelRS = {
    val wsPnrCancel = new WsPNRCancel()
    wsPnrCancel.getWsPNRCancelSoap.wmPNRCancel(value.asInstanceOf[OTACancelRQ])
  }
}
