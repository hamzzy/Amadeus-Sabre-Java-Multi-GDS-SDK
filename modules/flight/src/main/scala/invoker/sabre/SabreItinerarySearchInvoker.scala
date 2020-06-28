package flight.invoker.sabre

import flight.invoker.Invoker
import flight.invoker.sabre.client.SoapUtils
import flight.invoker.sabre.utils.SabreXMLRequestUtils

import scala.concurrent.{ExecutionContext, Future}
import scala.xml.Elem
import scala.xml.Node

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 5:07 PM.
  */
object SabreItinerarySearchInvoker extends Invoker[Node] with SoapUtils with SabreXMLRequestUtils {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[Node] =  Future{
    invoke(value)
  }

  override def invoke(value: AnyRef): Node = {
    val request = value.asInstanceOf[Node]
    val response = toNode(soapRequest(request.toString(), ENDPOINT_URL))
    println(response)
    response
  }
}
