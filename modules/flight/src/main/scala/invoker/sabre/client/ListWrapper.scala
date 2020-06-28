package flight.invoker.sabre.client

import java.{util => jl}
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._

object ListWrapper {

  def seqAsJavaList[A](immutableList: List[A]): jl.List[A] = immutableList.asJava

}
