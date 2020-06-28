package flight.invoker.amadeus.epower
import java.io.{ByteArrayInputStream, InputStream}

import javax.xml.bind.{JAXBContext, Unmarshaller}
import javax.xml.soap._
import flight.converter.amadeus.epower.EPowerHeader
import flight.invoker.Invoker
import utils._
import utils.StringUtil
import wsimport.lib.epower._

import scala.concurrent.{ExecutionContext, Future}
/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:28 PM.
  */
object EPowerAmadeusIssueTicketInvoker extends Invoker[CreateTicketResponse] with EPowerHeader {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[CreateTicketResponse] = Future {
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

  override def invoke(value: AnyRef): CreateTicketResponse = {
    val createTicketRequest = value.asInstanceOf[CreateTicket]
    val soapConnectionFactory: SOAPConnectionFactory = SOAPConnectionFactory.newInstance
    val connection: SOAPConnection = soapConnectionFactory.createConnection()

    var request: SOAPMessage = null
    var createTicketResponse: CreateTicketResponse = null
    val requestXml = s"""<?xml version="1.0" encoding="UTF-8" standalone="yes"?>${createSOAP(StringUtil.classToXmlString(createTicketRequest).replaceAllLiterally("""<?xml version="1.0" encoding="UTF-8" standalone="yes"?>""", ""))}"""

    val is: InputStream = new ByteArrayInputStream(requestXml.getBytes)
    request = MessageFactory.newInstance.createMessage(null, is)

    if (createTicketRequest.getSessionId != null && createTicketRequest.getSessionId != "") {
      request.getMimeHeaders.setHeader("Cookie", createTicketRequest.getSessionId)
    }

    val endpoint: java.net.URL = new java.net.URL(supplierConfigs(ConstKey.E_WSDL_URL).configValue)
    val soapResponse: SOAPMessage = connection.call(request, endpoint)
    connection.close()
    val responseBody: SOAPBody = soapResponse.getSOAPBody
    val unMarshaller: Unmarshaller = JAXBContext.newInstance(classOf[BookFlightResponse]).createUnmarshaller
    createTicketResponse = unMarshaller.unmarshal(responseBody.extractContentAsDocument).asInstanceOf[CreateTicketResponse]

    if(createTicketRequest.getSessionId != null && createTicketRequest.getSessionId != "") {
      createTicketResponse.setSessionId(createTicketRequest.getSessionId)
    } else {
      createTicketResponse.setSessionId(soapResponse.getMimeHeaders.getHeader("Set-Cookie").head)
    }
    println(createTicketResponse.getSessionId)
    println(utils.StringUtil.classToXmlString(createTicketRequest))
    println(utils.StringUtil.classToXmlString(createTicketResponse))
    createTicketResponse

  }
}
