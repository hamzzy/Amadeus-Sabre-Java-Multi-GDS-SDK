package flight.invoker.sabre.client

import java.io.{File, PrintWriter}

import services.ConfigLoad

import scala.concurrent.{ExecutionContext, Future}
import scala.xml.{Node, PrettyPrinter}


/**
  * Created by Igbalajobi Jamiu O. on 26/02/2017 2:00 AM.
  */
trait SabreXMLLogger extends ConfigLoad{
  val prettyPrinter = new PrettyPrinter(80, 2)
  val absolutePath = configuration.getString("sabre.log.path")
  val SESSION_RS_LOGFILE = "session_response.xml"
  val BFM_RQ_LOGFILE = "flight_request.xml"
  val BFM_RS_LOGFILE = "flight_response.xml"
  val ENHANCED_AIRBOOK_RS_LOGFILE = "enhanced_response.xml"
  val PASSENGER_RS_LOGFILE = "passengerdetails_rs.xml"

  def logXml(content: Node, fileName: String)(implicit executionContext: ExecutionContext) = Future {
    val _fileName = s"$absolutePath${File.separator}tmp${File.separator}sabre_log${File.separator}$fileName"
    println(_fileName)
    new PrintWriter(_fileName) {
      write(prettyPrinter.format(content))
      close()
    }
  }
}
