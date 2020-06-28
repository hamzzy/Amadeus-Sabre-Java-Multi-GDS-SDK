package flight.invoker.amadeus.epower

import java.io.{ByteArrayInputStream, InputStream}

import javax.xml.bind.{JAXBContext, Unmarshaller}
import javax.xml.soap._
import flight.converter.amadeus.epower.EPowerHeader
import flight.invoker.Invoker
import utils.StringUtil
import wsimport.lib.epower._

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 10/25/17.
  */
object EPowerItineraryAvailabilityInvoker extends Invoker[CheckETicketResponse] with EPowerHeader {

  override def invoke(value: AnyRef): CheckETicketResponse = {
    val checkETicket = value.asInstanceOf[CheckETicket]
    val soapConnectionFactory: SOAPConnectionFactory = SOAPConnectionFactory.newInstance
    val connection: SOAPConnection = soapConnectionFactory.createConnection()

    var request: SOAPMessage = null
    var checkETicketResponse: CheckETicketResponse = null
    val requestXml = s"""<?xml version="1.0" encoding="UTF-8" standalone="yes"?>${createSOAP(StringUtil.classToXmlString(checkETicket).replaceAllLiterally("""<?xml version="1.0" encoding="UTF-8" standalone="yes"?>""", ""))}"""

    //    println(requestXml)
    val is: InputStream = new ByteArrayInputStream(requestXml.getBytes)
    request = MessageFactory.newInstance.createMessage(null, is)

    request.getMimeHeaders.setHeader("Cookie", checkETicket.getSessionId)

    val endpoint: java.net.URL = new java.net.URL(supplierConfigs(ConstKey.E_WSDL_URL).configValue)
    val soapResponse: SOAPMessage = connection.call(request, endpoint)
    connection.close()
    val responseBody: SOAPBody = soapResponse.getSOAPBody

    val unMarshaller: Unmarshaller = JAXBContext.newInstance(classOf[CheckETicketResponse]).createUnmarshaller
    checkETicketResponse = unMarshaller.unmarshal(responseBody.extractContentAsDocument).asInstanceOf[CheckETicketResponse]
    checkETicketResponse
  }

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[CheckETicketResponse] = Future {
    invoke(value)
  }

  private def createSOAP(msg: String): String = {
    s"""<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
      <soap:Header>
        <AuthenticationSoapHeader xmlns="http://epowerv5.amadeus.com.tr/WS">
          <WSUserName>${supplierConfigs(ConstKey.E_USERNAME).configValue}</WSUserName>
          <WSPassword>${supplierConfigs(ConstKey.E_PASSWORD).configValue}</WSPassword>
        </AuthenticationSoapHeader>
      </soap:Header>
      <soap:Body>
      $msg
      </soap:Body>
    </soap:Envelope>"""
  }


}
