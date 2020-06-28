package flight.invoker.amadeus.tripxml

import flight.invoker.Invoker
import wsimport.lib.amadeus.lowfareplus.{OTAAirLowFareSearchPlusRQ, OTAAirLowFareSearchPlusRS, WsLowFarePlus}

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 5:07 PM.
  */
object AmadeusItinerarySearchInvoker extends Invoker[OTAAirLowFareSearchPlusRS] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[OTAAirLowFareSearchPlusRS] = Future {
    invoke(value)
  }

  override def invoke(value: AnyRef): OTAAirLowFareSearchPlusRS = {
    val otaAirLowFareSearchPlusRQ = value.asInstanceOf[OTAAirLowFareSearchPlusRQ]
    /*
     * Invoke the API SOAP HTTP Request
     */
    try {
      val wmLowFarePlus: OTAAirLowFareSearchPlusRS = new WsLowFarePlus().getWsLowFarePlusSoap().wmLowFarePlus(otaAirLowFareSearchPlusRQ)
      wmLowFarePlus
    } catch {
      case e: Exception =>
        //        println("Execption while searching amadeus flight")
        e.printStackTrace()
        new OTAAirLowFareSearchPlusRS
    }
  }
}
