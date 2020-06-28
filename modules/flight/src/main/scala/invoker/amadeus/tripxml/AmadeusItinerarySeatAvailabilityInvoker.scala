package flight.invoker.amadeus.tripxml

import java.io.{IOException, StringWriter}

import flight.invoker.Invoker
import javax.xml.bind.{JAXBContext, JAXBException}
import wsimport.lib.amadeus.wsairseatmap.{OTAAirSeatMapRQ, OTAAirSeatMapRS, WsAirSeatMap}

import scala.concurrent.{ExecutionContext, Future}

object AmadeusItinerarySeatAvailabilityInvoker extends Invoker[OTAAirSeatMapRS] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[OTAAirSeatMapRS] = Future{
    invoke(value)
  }

  def classToXmlString(`object`: Any): String = {
    var request = ""
    try {
      val context = JAXBContext.newInstance(`object`.getClass)
      val marshaller = context.createMarshaller
      val writer = new StringWriter
      marshaller.marshal(`object`, writer)
      //            marshaller.marshal(bj,System.out);
      val str = writer.toString
      request = str
      writer.flush()
      writer.close()
      //			System.out.println(str);
    } catch {
      case e: JAXBException =>
        e.printStackTrace()
      case ie: IOException =>
        ie.printStackTrace()
    }
    request
  }

  override def invoke(value: AnyRef): OTAAirSeatMapRS = {
    val oTAAirRulesRQ = value.asInstanceOf[OTAAirSeatMapRQ]
    val respose = new WsAirSeatMap()
      .getWsAirSeatMapSoap
      .wmAirSeatMap(oTAAirRulesRQ)
    println(classToXmlString(respose))
    respose
  }
}
