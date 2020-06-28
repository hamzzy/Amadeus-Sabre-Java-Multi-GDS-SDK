package flight.invoker.crane

import java.io.{ByteArrayInputStream, InputStream}

import flight.converter.crane.pojo.{CraneHeader, CraneSearchFlight}
import javax.xml.bind.{JAXBContext, Unmarshaller}
import javax.xml.soap._
import flight.converter.amadeus.epower.EPowerHeader
import flight.invoker.Invoker
import utils.HttpPost
import wsimport.lib.epower.{ErrorsType, RefundableTypesEnum, SearchFlight, SearchFlightResponse}

import scala.collection.JavaConversions._
import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 10/25/19.
  */
object CraneItinerarySearchInvoker extends Invoker[String] {



  override def invoke(value: AnyRef): String =  {
    val searchRequest = value.asInstanceOf[CraneSearchFlight]
    val requestXml = createSOAP(searchRequest).toString
    HttpPost.reqDataPost(searchRequest.craneHeader.endpointUrl, requestXml, Map(
      "Content-Type" -> "text/xml"
    )).httpBodyContent
  }

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[String] = Future {
    invoke(value)
  }

  private def createSOAP(craneSearchFlight: CraneSearchFlight) = {
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:impl="http://impl.soap.ws.crane.hititcs.com/">
      <soapenv:Header/>
      <soapenv:Body>
        <impl:GetAvailability>
          <AirAvailabilityRequest>
            <clientInformation>
              <clientIP>{craneSearchFlight.craneHeader.clientIp}</clientIP>
              <password>{craneSearchFlight.craneHeader.password}</password>
              <userName>{craneSearchFlight.craneHeader.username}</userName>
              <member>false</member>
              <preferredCurrency>{craneSearchFlight.craneHeader.preferredCurrency}</preferredCurrency>
              <preferredLanguage>{craneSearchFlight.craneHeader.language}</preferredLanguage>
            </clientInformation>
            {
              craneSearchFlight.originDestinations.map { originDestinations =>
                <originDestinationInformationList>
                  <dateOffset>7</dateOffset>
                  <departureDateTime>{originDestinations.departingDate}</departureDateTime>
                  <destinationLocation>
                    <locationCode>{originDestinations.destination}</locationCode>
                  </destinationLocation>
                  <flexibleFaresOnly>false</flexibleFaresOnly>
                  <includeInterlineFlights>true</includeInterlineFlights>
                  <openFlight>false</openFlight>
                  <originLocation>
                    <locationCode>{originDestinations.origin}</locationCode>
                  </originLocation>
                  <prefferedCabinClass/>
                </originDestinationInformationList>
              }
            }
            <travelerInformation>
              <passengerTypeQuantityList>
                <passengerType>
                  <code>ADLT</code>
                </passengerType>
                <quantity>{craneSearchFlight.travellers.adultCount}</quantity>
              </passengerTypeQuantityList>
              {
                if(craneSearchFlight.travellers.childCount > 0) {
                  <passengerTypeQuantityList>
                    <passengerType>
                      <code>CHLD</code>
                    </passengerType>
                    <quantity>{craneSearchFlight.travellers.childCount}</quantity>
                  </passengerTypeQuantityList>
                }
              }
              {
                if(craneSearchFlight.travellers.infantCount > 0) {
                  <passengerTypeQuantityList>
                    <passengerType>
                      <code>INFT</code>
                    </passengerType>
                    <quantity>{craneSearchFlight.travellers.infantCount}</quantity>
                  </passengerTypeQuantityList>
                }
              }
            </travelerInformation>
            <tripType>{craneSearchFlight.tripType}</tripType>
          </AirAvailabilityRequest>
        </impl:GetAvailability>
      </soapenv:Body>
    </soapenv:Envelope>
  }

}
