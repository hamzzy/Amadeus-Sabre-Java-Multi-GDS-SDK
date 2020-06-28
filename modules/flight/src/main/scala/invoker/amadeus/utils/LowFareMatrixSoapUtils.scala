/**
  * Created by Igbalajobi Jamiu O. on 4/5/2016.
  */

package flight.invoker.amadeus.utils

import java.io.ByteArrayInputStream

import javax.xml.soap.{MessageFactory, SOAPConnectionFactory, SOAPMessage}
import flight.dto.entity.FlightSearchRequest
import services.{ConfigLoad, ConfigLoadObject}
import wsimport.lib.amadeus.utils.BasePOSBuilder

import scala.collection.JavaConversions._
import scala.xml.Elem
object LowFareMatrixSoapUtils {

  lazy val config = BasePOSBuilder.config

  def getLowFareMatrixRSSoapMessage(flightRequest: FlightSearchRequest): SOAPMessage = {
    val xmlString = soapTemplate(lowFareMatrixSoapMessage(flightRequest))
    //    println(xmlString)
    soapRequest2(xmlString, BasePOSBuilder.MATRIX_ENDPOINT_URL)
  }

  private def soapTemplate(body: Elem) = {
    s"""<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                   xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
        <soap:Body>
        <wmLowFareMatrixXml xmlns="http://traveltalk.com/wsLowFareMatrix">
        <xmlRequest>
        <![CDATA[
          ${body.toString()}
        ]]>
        </xmlRequest>
        </wmLowFareMatrixXml>
        </soap:Body>
      </soap:Envelope>""".stripMargin
  }

  def lowFareMatrixSoapMessage(flightRequest: FlightSearchRequest) = {
    val departure = flightRequest.originDestinationRequests.get(0)
    val arrival = flightRequest.originDestinationRequests.get(1)
    //    val passenger = flightRequest.getPassengerTypes.get(0)

    <OTA_AirLowFareSearchMatrixRQ>
      { posXML }
      <OriginDestinationInformation>
        <DepartureDateTime>{ departure.departureDateTime }</DepartureDateTime>
        <OriginLocation LocationCode={ departure.origin.airCode }/>
        <DestinationLocation LocationCode={ departure.destination.airCode }/>
      </OriginDestinationInformation>
      <OriginDestinationInformation>
        <DepartureDateTime>{ arrival.departureDateTime }</DepartureDateTime>
        <OriginLocation LocationCode={ arrival.origin.airCode }/>
        <DestinationLocation LocationCode={ arrival.destination.airCode }/>
      </OriginDestinationInformation>
      <TravelerInfoSummary>
        <SeatsRequested>{ flightRequest.seatCount }</SeatsRequested>
        <AirTravelerAvail>
          {
            flightRequest.passengerTypes.sortBy(_.code.value()).map { passenger =>
                <PassengerTypeQuantity Code={ passenger.code.value() } Quantity={ passenger.quantity.toString }/>
            }
          }
        </AirTravelerAvail>
        <PriceRequestInformation PricingSource="Both" />
      </TravelerInfoSummary>
    </OTA_AirLowFareSearchMatrixRQ>
  }

  private def posXML = {
    <POS>
      <Source PseudoCityCode={ BasePOSBuilder.PCC }>
        <RequestorID Type={ BasePOSBuilder.REQUESTOR_TYPE } ID={ BasePOSBuilder.USERNAME }/>
      </Source>
      <TPA_Extensions>
        <Provider>
          <Name>{BasePOSBuilder.NAME }</Name>
          <System>{ BasePOSBuilder.SYSTEM }</System>
          <Userid>{ BasePOSBuilder.USERNAME }</Userid>
          <Password>{ BasePOSBuilder.PASSWORD }</Password>
        </Provider>
      </TPA_Extensions>
    </POS>
  }

  private def soapRequest2(soapMessage: String, endpointUrl: String): SOAPMessage = try {
    val soapConnectionFactory = SOAPConnectionFactory.newInstance()
    val connection = soapConnectionFactory.createConnection()
    val inputStream = new ByteArrayInputStream(soapMessage.getBytes)
    val request: SOAPMessage = MessageFactory.newInstance.createMessage(null, inputStream)
    request.getMimeHeaders.setHeader("SOAPAction", config("lowfarematrix.soapAction").configValue)
    val endpoint = new java.net.URL(endpointUrl)

    val soapResponse = connection.call(request, endpoint)
    connection.close()
    soapResponse
  } catch {
    case ex: Exception => throw new RuntimeException(ex)
  }

}