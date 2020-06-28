package flight.invoker.amadeus.tripxml

import flight.invoker.Invoker

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:28 PM.
  */
object AmadeusVoidTicketInvoker extends Invoker[String] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[String] = Future(invoke(value))
  override def invoke(value: AnyRef): String = ???

}
