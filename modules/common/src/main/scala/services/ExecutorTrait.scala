package services

import javax.inject.Singleton
import com.google.inject.ImplementedBy

import scala.concurrent.{ExecutionContext, ExecutionContextExecutor}
import scala.concurrent.forkjoin.ForkJoinPool

/**
  * Created by Igbalajobi Jamiu O. on 10/15/17.
  */
trait ExecutorTrait {
  /**
    * Get Available processor by the system
    */
  lazy val availableProcessors = Runtime.getRuntime.availableProcessors()
  implicit val myExecutionContext: ExecutionContextExecutor = ExecutionContext.fromExecutor(new ForkJoinPool(availableProcessors))
}