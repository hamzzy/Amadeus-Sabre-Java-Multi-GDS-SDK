/**
 * Created by Igbalajobi Jamiu O. on 2/27/2016.
 */
package flight.invoker.sabre.utils

import java.time.LocalDateTime
import java.util.UUID

import services.ConfigLoad

import scala.xml.Node

object SabreXMLRequestUtils extends SabreXMLRequestUtils

trait SabreXMLRequestUtils extends ConfigLoad {
  val ENDPOINT_URL = configuration.getString("sabre.endpoint")
  val SERVICE_TYPE = configuration.getString("sabre.serviceType")
  val DOMAIN = configuration.getString("sabre.domain")
  val SABRE_PCC = configuration.getString("sabre.pcc")
  val USERNAME = configuration.getString("sabre.username")
  val PASSWORD = configuration.getString("sabre.password")
  val CONVERSATION_ID = configuration.getString("sabre.conversationId")
  val PARTY_ID_TYPE = configuration.getString("sabre.partyIdType")
  val PARTY_ID_TO = configuration.getString("sabre.partyIdTo")
  val PARTY_ID_FROM = configuration.getString("sabre.partyIdFrom")
  val PARTY_ID_DOMAIN = configuration.getString("sabre.partyIdDomain")
  val CURRENCY = configuration.getString("sabre.currency")
  val AGENCY_NAME = configuration.getString("sabre.agency.name")

  protected def getMessageId: String = UUID.randomUUID.toString + "@" + PARTY_ID_DOMAIN
  protected def getMessageTimeStamp: String = LocalDateTime.now.toString + "Z"

  def sessionCreateXmlRequest = {
    val service = "SessionCreateRQ"
    val action = "SessionCreateRQ"
    val description = "Session Creation Service"
    val sessionCreate = {
      <SessionCreateRQ returnContextID="true">
        <POS>
          <Source PseudoCityCode={ SABRE_PCC }/>
        </POS>
      </SessionCreateRQ>
    }
    soapTemplate(service, action, description, sessionCreate)
  }

  def soapTemplate(service: String, action: String, description: String, body: Node) = {
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sec="http://schemas.xmlsoap.org/ws/2002/12/secext" xmlns:mes="http://www.ebxml.org/namespaces/messageHeader" xmlns:ns="http://www.opentravel.org/OTA/2003/05">
      <soapenv:Header>
        <sec:Security>
          <sec:UsernameToken>
            <sec:Username>{ USERNAME }</sec:Username>
            <sec:Password>{ PASSWORD }</sec:Password>
            <Organization>{ SABRE_PCC }</Organization>
            <Domain>{ DOMAIN }</Domain>
          </sec:UsernameToken>
        </sec:Security>
        <mes:MessageHeader mes:id={ getMessageId } mes:version="2.0">
          <mes:From>
            <mes:PartyId mes:type={ PARTY_ID_TYPE }>{ PARTY_ID_FROM }</mes:PartyId>
          </mes:From>
          <mes:To>
            <mes:PartyId mes:type={ PARTY_ID_TYPE }>{ PARTY_ID_TO }</mes:PartyId>
          </mes:To>
          <mes:CPAId>{ SABRE_PCC }</mes:CPAId>
          <mes:ConversationId>{ CONVERSATION_ID }</mes:ConversationId>
          <mes:Service mes:type={ SERVICE_TYPE }>{ service }</mes:Service>
          <mes:Action>{ action }</mes:Action>
          <mes:MessageData>
            <mes:MessageId>{ getMessageId }</mes:MessageId>
            <mes:Timestamp>{ getMessageTimeStamp }</mes:Timestamp>
          </mes:MessageData>
          <mes:Description xml:lang="en">{ description }</mes:Description>
        </mes:MessageHeader>
      </soapenv:Header>
      <soapenv:Body>
        { body }
      </soapenv:Body>
    </soapenv:Envelope>
  }

  def soapTemplateWithToken(binarySecurityToken: String, service: String, action: String, description: String, body: Node) = {
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sec="http://schemas.xmlsoap.org/ws/2002/12/secext" xmlns:mes="http://www.ebxml.org/namespaces/messageHeader" xmlns:ns="http://www.opentravel.org/OTA/2003/05">
      <soapenv:Header>
        <sec:Security>
          <sec:UsernameToken>
            <sec:Username>{ USERNAME }</sec:Username>
            <sec:Password>{ PASSWORD }</sec:Password>
            <Organization>{ SABRE_PCC }</Organization>
            <Domain>{ DOMAIN }</Domain>
          </sec:UsernameToken>
          <sec:BinarySecurityToken>{ binarySecurityToken }</sec:BinarySecurityToken>
        </sec:Security>
        <mes:MessageHeader mes:id={ getMessageId } mes:version="2.0">
          <mes:From>
            <mes:PartyId mes:type={ PARTY_ID_TYPE }>{ PARTY_ID_FROM }</mes:PartyId>
          </mes:From>
          <mes:To>
            <mes:PartyId mes:type={ PARTY_ID_TYPE }>{ PARTY_ID_TO }</mes:PartyId>
          </mes:To>
          <mes:CPAId>{ SABRE_PCC }</mes:CPAId>
          <mes:ConversationId>{ CONVERSATION_ID }</mes:ConversationId>
          <mes:Service mes:type={ SERVICE_TYPE }>{ service }</mes:Service>
          <mes:Action>{ action }</mes:Action>
          <mes:MessageData>
            <mes:MessageId>{ getMessageId }</mes:MessageId>
            <mes:Timestamp>{ getMessageTimeStamp }</mes:Timestamp>
          </mes:MessageData>
          <mes:Description xml:lang="en">{ description }</mes:Description>
        </mes:MessageHeader>
      </soapenv:Header>
      <soapenv:Body>
        { body }
      </soapenv:Body>
    </soapenv:Envelope>
  }
}
