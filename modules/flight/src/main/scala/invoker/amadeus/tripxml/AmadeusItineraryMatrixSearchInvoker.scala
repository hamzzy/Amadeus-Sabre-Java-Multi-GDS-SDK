package flight.invoker.amadeus.tripxml

import java.io.StringReader

import flight.invoker.Invoker
import javax.xml.bind.JAXBContext
import javax.xml.transform.stream.StreamSource
import wsimport.lib.amadeus.lowfarematrix.{OTAAirLowFareSearchMatrixRS, WmLowFareMatrixXmlResponse}

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 5:07 PM.
  */
object AmadeusItineraryMatrixSearchInvoker extends Invoker[OTAAirLowFareSearchMatrixRS] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[OTAAirLowFareSearchMatrixRS] = Future {
    invoke(value)
  }

  override def invoke(value: AnyRef): OTAAirLowFareSearchMatrixRS = {
    val otaAirLowFareSearchPlusRQ = value.asInstanceOf[WmLowFareMatrixXmlResponse]
    /*
     * Invoke the API SOAP HTTP Request
     */
    val unMarshaller = JAXBContext.newInstance(classOf[OTAAirLowFareSearchMatrixRS]).createUnmarshaller
    try {
      //new WsLowFareMatrix().getWsLowFareMatrixSoap().wmLowFareMatrixXml(otaAirLowFareSearchPlusRQ)
      val reader =  new StringReader(otaAirLowFareSearchPlusRQ.getWmLowFareMatrixXmlResult)
      val root = unMarshaller.unmarshal(new StreamSource(reader), classOf[OTAAirLowFareSearchMatrixRS])
      root.getValue
    } catch {
      case e: Exception => e.printStackTrace(); new OTAAirLowFareSearchMatrixRS
    }
  }
}
