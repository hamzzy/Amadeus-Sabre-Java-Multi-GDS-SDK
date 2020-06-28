package wsimport.lib.sabre

import flight.invoker.Invoker

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:28 PM.
  */
object SabreReadItineraryInvoker extends Invoker[String] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[String] = ???

  override def invoke(value: AnyRef): String = ???
}
