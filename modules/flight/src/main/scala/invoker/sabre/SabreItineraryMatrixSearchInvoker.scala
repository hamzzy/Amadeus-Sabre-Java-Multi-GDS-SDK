package wsimport.lib.sabre

import flight.invoker.Invoker
import flight.invoker.sabre.client.BFMAltDateClient
import javax.xml.ws.Holder
import wsimport.lib.sabre.bfm.altdate._

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 5:07 PM.
  */
object SabreItineraryMatrixSearchInvoker extends BFMAltDateClient with Invoker[OTAAirLowFareSearchRS] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[OTAAirLowFareSearchRS] = Future(invoke(value))

  override def invoke(value: AnyRef): OTAAirLowFareSearchRS = {
    val lowFareSearchRQ = value.asInstanceOf[OTAAirLowFareSearchRQ]
    val port = getConfiguredPort
    val messageHeaderHolder = new Holder[MessageHeader](createMessageHeader)
    val security = createSecurity(flight.invoker.sabre.client.SessionClient.getSessionToken)
    val securityHolder = new Holder[Security](security)
    port.bargainFinderMaxADRQ(messageHeaderHolder, securityHolder, lowFareSearchRQ)
  }

}
