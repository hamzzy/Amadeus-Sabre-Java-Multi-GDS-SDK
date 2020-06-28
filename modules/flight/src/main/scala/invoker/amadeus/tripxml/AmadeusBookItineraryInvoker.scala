package flight.invoker.amadeus.tripxml

import java.io.{ByteArrayInputStream, InputStream, StringReader, StringWriter}

import flight.invoker.Invoker
import utils.StringUtil
import javax.xml.bind._
import javax.xml.namespace.QName
import javax.xml.soap._
import javax.xml.transform.stream.StreamSource
import wsimport.lib.amadeus.travelbuild._

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 8:32 PM.
  */
object AmadeusBookItineraryInvoker extends Invoker[(String, String, OTATravelItineraryRS)] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[(String, String, OTATravelItineraryRS)] = Future {
   invoke(value)
  }

  private def soapRequest(otaTravelItineraryRQ: OTATravelItineraryRQ): (String, String) = {
    val travelBuildXML: TravelBuildXML = new TravelBuildXML
    val xmlRequest: XMLRequest = new XMLRequest
    xmlRequest.setOtaTravelItineraryRQ(otaTravelItineraryRQ)
    travelBuildXML.setXmlRequest(xmlRequest)
    var response = "EMPTY"
    var requestXml = "EMPTY"
    try {
      val soapConnectionFactory: SOAPConnectionFactory = SOAPConnectionFactory.newInstance
      val connection: SOAPConnection = soapConnectionFactory.createConnection
      val qName: QName = new QName("http://traveltalk.com/wsTravelBuild", "wmTravelBuildXml")
      val writer: StringWriter = new StringWriter
      var request: SOAPMessage = null
      var travelBuildXMLResponse: WmTravelBuildXmlResponse = null
      val context: JAXBContext = JAXBContext.newInstance(classOf[TravelBuildXML])
      val marshaller: Marshaller = context.createMarshaller
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
      val root: JAXBElement[TravelBuildXML] = new JAXBElement[TravelBuildXML](qName, classOf[TravelBuildXML], travelBuildXML)
      marshaller.marshal(root, writer)
      requestXml = createStringSoapMessage(StringUtil.removeXMLTag(writer.toString, 3))
      val is: InputStream = new ByteArrayInputStream(requestXml.getBytes)
      request = MessageFactory.newInstance.createMessage(null, is)

      val endpoint: java.net.URL = new java.net.URL("http://amadeusws.tripxml.com/TripXML/wsTravelBuild_v03.asmx?WSDL")
      val soapResponse: SOAPMessage = connection.call(request, endpoint)
      connection.close()
      val responseBody: SOAPBody = soapResponse.getSOAPBody
      val unMarshaller: Unmarshaller = JAXBContext.newInstance(classOf[WmTravelBuildXmlResponse]).createUnmarshaller
      travelBuildXMLResponse = unMarshaller.unmarshal(responseBody.extractContentAsDocument).asInstanceOf[WmTravelBuildXmlResponse]
      response = travelBuildXMLResponse.getWmTravelBuildXmlResult
    } catch {
      case ex: Exception => ex.printStackTrace()
    }
    (requestXml, response) //XML  ->  Request, Response
  }

  private def createStringSoapMessage(message: String): String = {
    "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
      "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" +
      " xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" +
      " xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"" +
      " xmlns:tf=\"http://traveltalk.com/wsTravelBuild\">\n" +
      "      <soap:Header/>\n" +
      "      <soap:Body>\n" +
      "        <tf:wmTravelBuildXml>\n" +
      "          <tf:xmlRequest>\n" +
      "          <![CDATA[\n" +
      message + "\n" +
      "          ]]>\n" +
      "          </tf:xmlRequest>\n" +
      "       </tf:wmTravelBuildXml>\n" +
      "     </soap:Body>\n" +
      "</soap:Envelope>"
  }

  override def invoke(value: AnyRef): (String, String, OTATravelItineraryRS) = {
    val otaTravelItineraryRQ = value.asInstanceOf[OTATravelItineraryRQ]
    var requestXml: String = ""
    var responseXml: String = ""
    try {
      val unMarshaller: Unmarshaller = JAXBContext.newInstance(classOf[OTATravelItineraryRS]).createUnmarshaller
      val resp = soapRequest(otaTravelItineraryRQ)
      requestXml = resp._1
      responseXml = resp._2
      val reader: StringReader = new StringReader(responseXml)
      val root: JAXBElement[OTATravelItineraryRS] = unMarshaller.unmarshal(new StreamSource(reader), classOf[OTATravelItineraryRS])
      println(requestXml)
      println(responseXml)
      (requestXml, responseXml, root.getValue)
    } catch {
      case jaxbEx: JAXBException => jaxbEx.printStackTrace()
        (requestXml, "", null)
    }
  }
}
