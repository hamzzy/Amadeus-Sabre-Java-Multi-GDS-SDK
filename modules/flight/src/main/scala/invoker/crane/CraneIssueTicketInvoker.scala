package flight.invoker.crane

import java.io.{ByteArrayInputStream, InputStream}

import flight.converter.crane.pojo.{CraneBookFlight, CraneIssueTicket}
import flight.invoker.Invoker
import flight.invoker.crane.CraneItinerarySearchInvoker.createSOAP
import utils.HttpPost
import javax.xml.soap.{Node => _, _}

import scala.collection.JavaConversions._
import scala.concurrent.{ExecutionContext, Future}
import scala.xml._

object CraneIssueTicketInvoker extends Invoker[String]{

  override def invoke(value: AnyRef): String = {
    val searchRequest = value.asInstanceOf[CraneIssueTicket]
    val requestXml = createSOAP(searchRequest).toString
    HttpPost.reqDataPost(searchRequest.craneHeader.endpointUrl, requestXml, Map(
      "Content-Type" -> "text/xml"
    )).httpBodyContent
  }

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[String] = Future {
    invoke(value)
  }


  def addNode(to: Node, newNode: Node) = to match {
    case Elem(prefix, label, attributes, scope, child@_*) => Elem(prefix, label, attributes, scope, child ++ newNode: _*)
    case _ => to
  }

  private def createSOAP(craneIssueTicket: CraneIssueTicket) = {
    <soapenv:Envelope xmlns:impl="http://impl.soap.ws.crane.hititcs.com/" xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
      <soapenv:Header/>
      <soapenv:Body>
        <impl:TicketReservation>
          <AirTicketReservationRequest>
            <clientInformation>
              <clientIP>{craneIssueTicket.craneHeader.clientIp}</clientIP>
              <password>{craneIssueTicket.craneHeader.password}</password>
              <userName>{craneIssueTicket.craneHeader.username}</userName>
              <member>false</member>
              <preferredCurrency>{craneIssueTicket.craneHeader.preferredCurrency}</preferredCurrency>
              <preferredLanguage>{craneIssueTicket.craneHeader.language}</preferredLanguage>
            </clientInformation>
            <bookingReferenceID>
              <ID>{craneIssueTicket.pnrRef}</ID>
            </bookingReferenceID>
            <fullfillment>
              <paymentDetails>
                <paymentDetailList>
                  <miscChargeOrder>
                    <capturePaymentToolNumber>false</capturePaymentToolNumber>
                    <paymentCode>INV</paymentCode>
                    <threeDomainSecurityEligible>false</threeDomainSecurityEligible>
                    <transactionFeeApplies>false</transactionFeeApplies>
                    <MCONumber>{craneIssueTicket.craneHeader.mcoNumber.orNull}</MCONumber>
                  </miscChargeOrder>
                  <paymentAmount>
                    <currency>
                      <code>{craneIssueTicket.currency}</code>
                    </currency>
                    <value>{craneIssueTicket.amount.doubleValue()}</value>
                  </paymentAmount>
                  <paymentType>MISC_CHARGE_ORDER</paymentType>
                  <primaryPayment>true</primaryPayment>
                </paymentDetailList>
              </paymentDetails>
            </fullfillment>
            <requestPurpose>COMMIT</requestPurpose>
          </AirTicketReservationRequest>
        </impl:TicketReservation>
      </soapenv:Body>
    </soapenv:Envelope>
  }
//  private def createSOAP2(craneIssueTicket: CraneIssueTicket) = {
//      <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:impl="http://impl.soap.ws.crane.hititcs.com/">
//        <soapenv:Header/>
//        <soapenv:Body>
//          <impl:TicketReservation>
//            <AirTicketReservationRequest>
//              <clientInformation>
//                <clientIP>{craneIssueTicket.craneHeader.clientIp}</clientIP>
//                <password>{craneIssueTicket.craneHeader.password}</password>
//                <userName>{craneIssueTicket.craneHeader.username}</userName>
//                <member>false</member>
//                <preferredCurrency>{craneIssueTicket.craneHeader.preferredCurrency}</preferredCurrency>
//              </clientInformation>
//              <bookingReferenceID>
//                <ID>{craneIssueTicket.pnrRef}</ID>
//              </bookingReferenceID>
//              <fullfillment>
//                <paymentDetails>
//                  <paymentDetailList>
//                    <miscChargeOrder>
//                      <capturePaymentToolNumber>false</capturePaymentToolNumber>
//                      <paymentCode>INV</paymentCode>
//                      <threeDomainSecurityEligible>false</threeDomainSecurityEligible>
//                      <transactionFeeApplies>false</transactionFeeApplies>
//                      <MCONumber>{craneIssueTicket.craneHeader.mcoNumber.orNull}</MCONumber>
//                    </miscChargeOrder>
//                    <paymentAmount>
//                      <currency>
//                        <code>{craneIssueTicket.currency}</code>
//                      </currency>
//                      <value>{craneIssueTicket.amount.doubleValue()}</value>
//                    </paymentAmount>
//                    <paymentType>MISC_CHARGE_ORDER</paymentType>
//                    <primaryPayment>true</primaryPayment>
//                  </paymentDetailList>
//                </paymentDetails>
//              </fullfillment>
//              <requestPurpose>COMMIT</requestPurpose>
//            </AirTicketReservationRequest>
//          </impl:TicketReservation>
//        </soapenv:Body>
//      </soapenv:Envelope>
//  }

}
