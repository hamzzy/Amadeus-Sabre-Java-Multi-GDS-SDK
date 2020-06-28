package flight.invoker.amadeus.epower

import java.io.{ByteArrayInputStream, InputStream}

import flight.converter.amadeus.epower.EPowerHeader
import flight.dto.entity.ExchangeRateResponse
import flight.invoker.Invoker
import flight.invoker.amadeus.epower.EPowerBookItineraryInvoker.supplierConfigs
import utils.StringUtil
import javax.xml.bind.{JAXBContext, Unmarshaller}
import javax.xml.soap._
import wsimport.lib.epower.{BookFlightResponse, CurrencyConversion, CurrencyConversionResponse}

import scala.concurrent.{ExecutionContext, Future}

object EPowerAmadeusCurrencyInvoker extends Invoker[CurrencyConversionResponse] with EPowerHeader {


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

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[CurrencyConversionResponse] = Future {
    invoke(value)
  }

  override def invoke(value: AnyRef): CurrencyConversionResponse = {
    val bookFlight = value.asInstanceOf[CurrencyConversion]
    val soapConnectionFactory: SOAPConnectionFactory = SOAPConnectionFactory.newInstance
    val connection: SOAPConnection = soapConnectionFactory.createConnection()

    var request: SOAPMessage = null
    val requestXml = s"""<?xml version="1.0" encoding="UTF-8" standalone="yes"?>${createSOAP(StringUtil.classToXmlString(bookFlight).replaceAllLiterally("""<?xml version="1.0" encoding="UTF-8" standalone="yes"?>""", ""))}"""

    val is: InputStream = new ByteArrayInputStream(requestXml.getBytes)
    request = MessageFactory.newInstance.createMessage(null, is)

    val endpoint: java.net.URL = new java.net.URL(supplierConfigs(ConstKey.E_WSDL_URL).configValue)
    val soapResponse: SOAPMessage = connection.call(request, endpoint)
    connection.close()
    val responseBody: SOAPBody = soapResponse.getSOAPBody

    val unMarshaller: Unmarshaller = JAXBContext.newInstance(classOf[CurrencyConversionResponse]).createUnmarshaller
    unMarshaller.unmarshal(responseBody.extractContentAsDocument).asInstanceOf[CurrencyConversionResponse]
  }
}
