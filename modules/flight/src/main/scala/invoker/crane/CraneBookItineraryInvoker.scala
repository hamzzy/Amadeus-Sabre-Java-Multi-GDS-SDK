package flight.invoker.crane

import java.io.{ByteArrayInputStream, InputStream}

import flight.converter.crane.pojo.{CraneBookFlight, CraneSearchFlight}
import flight.invoker.Invoker
import flight.invoker.crane.CraneItinerarySearchInvoker.createSOAP
import utils.HttpPost
import javax.xml.soap.{Node => _, _}

import scala.collection.JavaConversions._
import scala.concurrent.{ExecutionContext, Future}
import scala.xml._

object CraneBookItineraryInvoker extends Invoker[String]{

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[String] = Future{
    invoke(value)
  }

  override def invoke(value: AnyRef): String = {
    val searchRequest = value.asInstanceOf[CraneBookFlight]
    val requestXml = createSOAP(searchRequest).toString
    HttpPost.reqDataPost(searchRequest.craneHeader.endpointUrl, requestXml, Map(
      "Content-Type" -> "text/xml"
    )).httpBodyContent
  }


  def addNode(to: Node, newNode: Node) = to match {
    case Elem(prefix, label, attributes, scope, child@_*) => Elem(prefix, label, attributes, scope, child ++ newNode: _*)
    case _ => println(""); to
  }

  private def createSOAP(craneSearchFlight: CraneBookFlight) = {
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:impl="http://impl.soap.ws.crane.hititcs.com/">
      <soapenv:Header/>
      <soapenv:Body>
        <impl:CreateBooking>
          <AirBookingRequest>
            <clientInformation>
              <clientIP>{craneSearchFlight.craneHeader.clientIp}</clientIP>
              <password>{craneSearchFlight.craneHeader.password}</password>
              <userName>{craneSearchFlight.craneHeader.username}</userName>
              <member>false</member>
              <preferredCurrency>{craneSearchFlight.craneHeader.preferredCurrency}</preferredCurrency>
              <preferredLanguage>{craneSearchFlight.craneHeader.language}</preferredLanguage>
            </clientInformation>
            <airItinerary>
              <bookOriginDestinationOptions>
                {
                  craneSearchFlight.segments.map { segment =>
                    <bookOriginDestinationOptionList>
                      <bookFlightSegmentList>
                        <actionCode>NN</actionCode>
                        <bookingClass>
                          <cabin>{segment.cabin}</cabin>
                          <resBookDesigCode>{segment.resBookDesigCode}</resBookDesigCode>
                          <resBookDesigQuantity>{segment.resBookDesigQuantity}</resBookDesigQuantity>
                        </bookingClass>
                        <!--DISPLAY FARE INFO-->
                        <fareInfo>
                          <cabinClassCode>{segment.craneFareInfo.cabinClassCode}</cabinClassCode>
                          <fareGroupName>{segment.craneFareInfo.fareGroupName}</fareGroupName>
                          <fareReferenceCode>{segment.craneFareInfo.fareReferenceCode}</fareReferenceCode>
                          <fareReferenceID>{segment.craneFareInfo.fareReferenceID}</fareReferenceID>
                          <fareReferenceName>{segment.craneFareInfo.fareReferenceName}</fareReferenceName>
                          <flightSegmentSequence>{segment.craneFareInfo.flightSegmentSequence}</flightSegmentSequence>
                          <resBookDesigCode>{segment.craneFareInfo.resBookDesigCode}</resBookDesigCode>
                        </fareInfo>
                        {
                        XML.loadString(segment.flightSegmentXML
                          .replaceAll("xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\"", "")
                          .replaceAll("xmlns:ns2=\"http://impl.soap.ws.crane.hititcs.com/\"", ""))
                        }
                        <sequenceNumber/>
                      </bookFlightSegmentList>
                    </bookOriginDestinationOptionList>
                  }
                }
              </bookOriginDestinationOptions>
            </airItinerary>
            {
              craneSearchFlight.travellers.map { traveller =>
                <airTravelerList>
                  <accompaniedByInfant>{traveller.attacheInfant}</accompaniedByInfant>
                  <birthDate>{traveller.dob}</birthDate>
                  <gender>{traveller.gender.substring(0,1)}</gender>
                  <passengerTypeCode>{traveller.ageCategory}</passengerTypeCode>
                  <personName>
                    <givenName>{traveller.firstName}</givenName>
                    <nameTitle>{traveller.title}</nameTitle>
                    <surname>{traveller.lastName}</surname>
                  </personName>
                  <requestedSeatCount>{traveller.seatCount}</requestedSeatCount>
                  <unaccompaniedMinor>false</unaccompaniedMinor>
                </airTravelerList>
              }
            }
            <contactInfoList>
              <email>
                <email>{craneSearchFlight.contactInfo.email}</email>
              </email>
              <personName>
                <givenName>{craneSearchFlight.contactInfo.firstName}</givenName>
                <nameTitle>{craneSearchFlight.contactInfo.title}</nameTitle>
                <surname>{craneSearchFlight.contactInfo.lastName}</surname>
              </personName>
              <phoneNumber>
                <countryCode>{craneSearchFlight.contactInfo.countryCode}</countryCode>
                <subscriberNumber>{craneSearchFlight.contactInfo.phone}</subscriberNumber>
              </phoneNumber>
            </contactInfoList>
            <requestPurpose>MODIFY_PERMANENTLY_AND_CALC</requestPurpose>

            <specialRequestDetails>
              <otherServiceInformationList>
                <otherServiceInformationList>
                  <airTravelerSequence/>
                  <code>OSI</code>
                  <explanation>CTCB {craneSearchFlight.contactInfo.phone}</explanation>
                  <flightSegmentSequence/>
                </otherServiceInformationList>
                <otherServiceInformationList>
                  <airTravelerSequence/>
                  <code>OSI</code>
                  <explanation>CTCE {craneSearchFlight.contactInfo.email.toUpperCase}</explanation>
                  <flightSegmentSequence/>
                </otherServiceInformationList>
              </otherServiceInformationList>
              {
                if (craneSearchFlight.infantTraveller.nonEmpty) {
                  craneSearchFlight.infantTraveller.get.zipWithIndex.map { inf =>
                    <specialServiceRequestList>
                      <airTravelerSequence>{inf._2}</airTravelerSequence>
                      <flightSegmentSequence>{inf._2}</flightSegmentSequence>
                      <SSR>
                        <code>INFT</code>
                        <explanation>{inf._1.firstName}/{inf._1.lastName} {inf._1.dob}</explanation>
                      </SSR>
                      <serviceQuantity>1</serviceQuantity>
                      <status>NN</status>
                    </specialServiceRequestList>
                  }
                }
              }
            </specialRequestDetails>

          </AirBookingRequest>
        </impl:CreateBooking>
      </soapenv:Body>
    </soapenv:Envelope>
  }

}
