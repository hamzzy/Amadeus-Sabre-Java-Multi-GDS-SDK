/**
  * Created by Igbalajobi Jamiu O. on 2/27/2016.
  */

package flight.invoker.sabre.client

import flight.invoker.sabre.utils.{SabreXMLRequestUtils, UCSegStatusNotAllowedException}

import scala.collection.mutable.ArrayBuffer
import scala.concurrent.Future
import scala.xml.{Node, PrettyPrinter}
import scala.concurrent.ExecutionContext.Implicits.global

trait SabreSoapService extends SoapUtils with SabreXMLLogger with SabreServiceResponseParser {
  val endpoint = SabreXMLRequestUtils.ENDPOINT_URL

  def session = {
    val response = callService(SabreXMLRequestUtils.sessionCreateXmlRequest)
    Future {
      logXml(response, SESSION_RS_LOGFILE)
    }
    (response \\ "BinarySecurityToken").text
  }

  protected def callService(request: Node): Node = {
    toNode(soapRequest(request.toString(), endpoint))
  }
}

trait SabreServiceResponseParser {
  def parseEnhancedAirBookRS(response: Node) = {
    val exceptions = Map("NO COMBINABLE FARES" -> new Exception, "UC SEG STATUS NOT ALLOWED" -> new UCSegStatusNotAllowedException)
    val enhancedAirBookNode = response \\ "EnhancedAirBookRS"
    if ((enhancedAirBookNode \ "OTA_AirPriceRS").isEmpty) {
      val message = enhancedAirBookNode \ "Application" \ "Error" \\ "Message"
      val optionalKey = exceptions.keys.find(key => message.head.text.toLowerCase.contains(key.toLowerCase))
      optionalKey match {
        case Some(key) => throw exceptions.get(key).get
        case None => throw new RuntimeException("booking error")
      }
    }
    val enhancedAirBookNodeSeq = ArrayBuffer(enhancedAirBookNode \ "OTA_AirBookRS", enhancedAirBookNode \ "OTA_AirPriceRS", enhancedAirBookNode \ "TravelItineraryReadRS")
    <EnhancedAirBookRS>
      { enhancedAirBookNodeSeq }
    </EnhancedAirBookRS>
  }

  def parsePassengerDetailsRS(response: Node) = {
    val passengerDetailsRSNode = response \\ "PassengerDetailsRS"
    val passengerDetailsRSNodeSeq = ArrayBuffer(passengerDetailsRSNode \ "ItineraryRef", passengerDetailsRSNode \ "TravelItineraryReadRS")
    <PassengerDetailsRS>
      { passengerDetailsRSNodeSeq }
    </PassengerDetailsRS>
  }
}