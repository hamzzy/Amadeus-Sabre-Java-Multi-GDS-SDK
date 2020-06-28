import java.io.File

import akka.NotUsed
import akka.stream.scaladsl.{Flow, Sink, Source}
import com.datastax.driver.core.{BoundStatement, Cluster, PreparedStatement, Session}
import com.google.inject.{AbstractModule, Guice, Injector}
import utils.StringUtil
import org.junit.{Before, Test}
import org.scalatest.junit.AssertionsForJUnit
import services.{AkkaExecutorTrait, ConfigLoad}
import services.persistence.cassandra.CassandraSession

import scala.xml.XML

class ApplicationTestSpec extends AssertionsForJUnit with AkkaExecutorTrait {
  this: AkkaExecutorTrait

  var connectionHandler: CassandraSession = _
  var injector: Injector = _
  implicit val akkaExecutorTrait: AkkaExecutorTrait = this
  val keyspace = "otawsintegrate_flight"


  @Before def init() {
    Guice.createInjector(new AbstractModule {
      override def configure(): Unit = {
//        connectionHandler = new ConnectionHandler()
      }
    })
  }


  @Test def testCassandra() = {
//    connectionHandler.insertAirlines
    println(s"")
  }
}
