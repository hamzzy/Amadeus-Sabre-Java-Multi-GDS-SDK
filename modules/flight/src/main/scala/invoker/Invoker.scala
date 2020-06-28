package flight.invoker

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 25/11/2016 12:44 AM.
  */
trait Invoker[T] {

  @Deprecated
  def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[T]

  def invoke(value: AnyRef): T

}