package flight.invoker.amadeus.epower

import java.io.{ByteArrayInputStream, InputStream}

import javax.xml.bind.{JAXBContext, Unmarshaller}
import javax.xml.soap._
import flight.converter.amadeus.epower.{EPowerAmadeusItinerarySearchConverter, EPowerHeader}
import flight.invoker.Invoker
import flight.invoker.amadeus.epower.EPowerItinerarySearchInvoker.getIsCity
import utils.StringUtil
import wsimport.lib.epower._

import scala.concurrent.{ExecutionContext, Future}
import scala.collection.JavaConverters._
import scala.collection.JavaConversions._
import scala.xml.Elem

/**
  * Created by Igbalajobi Jamiu O. on 10/25/17.
  */
object EPowerItinerarySearchMatrixInvoker extends Invoker[SearchFlightCalendarResponse] with EPowerHeader {

  override def invoke(value: AnyRef) = {
    val from = System.currentTimeMillis()
    val searchRequest = value.asInstanceOf[SearchFlightCalendar]
    val soapConnectionFactory: SOAPConnectionFactory = SOAPConnectionFactory.newInstance
    val connection: SOAPConnection = soapConnectionFactory.createConnection
    var request: SOAPMessage = null
    var searchFlightResponse: SearchFlightCalendarResponse = null
//    val requestXml = createSOAP(StringUtil.classToXmlString(searchRequest)
//      .replaceAllLiterally("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "")
//      .replaceAllLiterally("<IgnoreAvailability>false</IgnoreAvailability>", ""))
//      .replaceAllLiterally("ForMetaBook=\"false\"", "")
//      .replaceAllLiterally("<NumberOfRecommendation>0</NumberOfRecommendation>", "")
//      .replaceAllLiterally("<SpecificFlightInfo/>", "")
//      .replaceAllLiterally("<MaxEFTPercentage>0</MaxEFTPercentage>", "")

    val requestXml = createSOAP2(searchRequest).toString


    val is: InputStream = new ByteArrayInputStream(requestXml.getBytes)
    request = MessageFactory.newInstance.createMessage(null, is)

    if (searchRequest.getSessionId != null)
      request.getMimeHeaders.setHeader("Cookie", searchRequest.getSessionId)

    val endpoint: java.net.URL = new java.net.URL(supplierConfigs(ConstKey.E_WSDL_URL).configValue)
    val soapResponse: SOAPMessage = connection.call(request, endpoint)
    connection.close()
    val responseBody: SOAPBody = soapResponse.getSOAPBody

    val unMarshaller: Unmarshaller = JAXBContext.newInstance(classOf[SearchFlightCalendarResponse]).createUnmarshaller
    searchFlightResponse = unMarshaller.unmarshal(responseBody.extractContentAsDocument).asInstanceOf[SearchFlightCalendarResponse]
    searchFlightResponse.setRequestXML(requestXml)
    searchFlightResponse.setSessionId(soapResponse.getMimeHeaders.getHeader("Set-Cookie").head)
    val to = System.currentTimeMillis()
    println(s"ePower Elapse: ${(to - from) / 1000}")

    println(requestXml)
    println(StringUtil.classToXmlString(searchFlightResponse))
    searchFlightResponse
  }
  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[SearchFlightCalendarResponse] = Future(invoke(value))


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


  private def createSOAP2(searchFlight: SearchFlightCalendar): Elem = {
    <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
      <soap:Header>
        <AuthenticationSoapHeader xmlns="http://epowerv5.amadeus.com.tr/WS">
          <WSUserName>{supplierConfigs(ConstKey.E_USERNAME).configValue}</WSUserName>
          <WSPassword>{supplierConfigs(ConstKey.E_PASSWORD).configValue}</WSPassword>
        </AuthenticationSoapHeader>
      </soap:Header>
      <soap:Body>
        <SearchFlightCalendar xmlns="http://epowerv5.amadeus.com.tr/WS">
          <OTA_AirLowFareSearchRQ  ProviderType={searchFlight.getOTAAirLowFareSearchRQ.getProviderType.value()} DirectFlightsOnly={searchFlight.getOTAAirLowFareSearchRQ.isDirectFlightsOnly.toString}>
            {
              searchFlight.getOTAAirLowFareSearchRQ.getOriginDestinationInformation.map { originDestinationInformation =>
                <OriginDestinationInformation>
                  <DepartureDateTime>{EPowerAmadeusItinerarySearchConverter.parseDate("yyyy-MM-dd", originDestinationInformation.getDepartureDateTime)}T00:01:00</DepartureDateTime>
                  <OriginLocation MultiAirportCityInd={getIsCity(originDestinationInformation.getOriginLocation.getLocationCode).toString} LocationCode={originDestinationInformation.getOriginLocation.getLocationCode}/>
                  <DestinationLocation MultiAirportCityInd={getIsCity(originDestinationInformation.getDestinationLocation.getLocationCode).toString} LocationCode={originDestinationInformation.getDestinationLocation.getLocationCode}/>
                </OriginDestinationInformation>
              }
            }
            {
              if(searchFlight.getOTAAirLowFareSearchRQ.getTravelPreferences.nonEmpty) {
                searchFlight.getOTAAirLowFareSearchRQ.getTravelPreferences.flatMap(_.getCabinPref).map { cabinPref =>
                  if(!cabinPref.getCabin.equals(CabinType.ECONOMY)) {
                    <TravelPreferences>
                      <CabinPref Cabin={cabinPref.getCabin.value()} MajorityCabin={cabinPref.isMajorityCabin.toString} MandatoryCabin={cabinPref.isMandatoryCabin.toString}/>
                    </TravelPreferences>
                  }
                }
              }
            }
            {
              if (searchFlight.getOTAAirLowFareSearchRQ.getSpecificFlightInfo.getAirline.nonEmpty) {
                <SpecificFlightInfo>
                  {
                    searchFlight.getOTAAirLowFareSearchRQ.getSpecificFlightInfo.getAirline.map { airline =>
                        <Airline Code={airline.getCode}/>
                    }
                  }
                </SpecificFlightInfo>
              }
            }
            {
              <TravelerInfoSummary>
                <AirTravelerAvail>
                  {
                    searchFlight.getOTAAirLowFareSearchRQ.getTravelerInfoSummary.getAirTravelerAvail.map { airTravelerAvail =>
                      {
                        airTravelerAvail.getPassengerTypeQuantity.map { passengerTypeQuantity =>
                            <PassengerTypeQuantity Code={passengerTypeQuantity.getCode} Quantity={passengerTypeQuantity.getQuantity.toString}/>
                        }
                      }
                    }
                  }
                </AirTravelerAvail>
              </TravelerInfoSummary>
            }
            <AdvanceSearchInfo>
              <IgnoreAvailability>{searchFlight.getOTAAirLowFareSearchRQ.getAdvanceSearchInfo.isIgnoreAvailability}</IgnoreAvailability>
              <Currency>{searchFlight.getOTAAirLowFareSearchRQ.getAdvanceSearchInfo.getCurrency}</Currency>
            </AdvanceSearchInfo>
          </OTA_AirLowFareSearchRQ>
        </SearchFlightCalendar>
      </soap:Body>
    </soap:Envelope>
  }

}
