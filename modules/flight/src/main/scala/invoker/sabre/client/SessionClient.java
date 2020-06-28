package flight.invoker.sabre.client;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.time.LocalDateTime;
import java.util.UUID;
import wsimport.lib.sabre.sessioncreate.*;

public class SessionClient extends flight.invoker.sabre.client.SabreClient {

  public static String getSessionToken() {
    SessionCreateRQService sessionCreateRQService = new SessionCreateRQService();
    SessionCreatePortType portType = sessionCreateRQService.getSessionCreatePortType();
    SessionCreateRQ.POS.Source source = new SessionCreateRQ.POS.Source();

    source.setPseudoCityCode(SABRE_PCC);
    SessionCreateRQ.POS pos = new SessionCreateRQ.POS();
    pos.setSource(source);
    SessionCreateRQ sessionCreateRQ = new SessionCreateRQ();
    sessionCreateRQ.setPOS(pos);
    sessionCreateRQ.setReturnContextID(true);

    Holder<MessageHeader> messageHeaderHolder = new Holder<>(createMessageHeader());
    Holder<Security> securityHolder = new Holder<>(createSecurity());
    ((BindingProvider) portType).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL);
    portType.sessionCreateRQ(messageHeaderHolder, securityHolder, sessionCreateRQ);
    System.out.println("Binary Security Token: " + securityHolder.value.getBinarySecurityToken());
    return securityHolder.value.getBinarySecurityToken();
  }

  private static MessageHeader createMessageHeader() {
    MessageHeader messageHeader = new MessageHeader();
    From from = new From();
    PartyId fromPartyId = new PartyId();
    fromPartyId.setType("urn:x12.org:IO5:01");
    fromPartyId.setValue(PARTY_ID_FROM);
    from.getPartyId().add(fromPartyId);
    To to = new To();
    PartyId toPartyId = new PartyId();
    toPartyId.setType("urn:x12.org:IO5:01");
    toPartyId.setValue("webservices.sabre.com");
    to.getPartyId().add(toPartyId);
    Service service = new Service();
    service.setType(SERVICE_TYPE);
    service.setValue("SessionCreateRQ");

    MessageData messageData = new MessageData();
    messageData.setMessageId(UUID.randomUUID().toString() + "@" + PARTY_ID_DOMAIN);
    messageData.setTimestamp(LocalDateTime.now().toString() + "Z");

    messageHeader.setConversationId(CONVERSATION_ID);
    messageHeader.setFrom(from);
    messageHeader.setTo(to);
    messageHeader.setCPAId(SABRE_PCC);
    messageHeader.setService(service);
    messageHeader.setAction("SessionCreateRQ");
    messageHeader.setMessageData(messageData);

    return  messageHeader;
  }

  private static Security createSecurity() {
    Security security = new Security();
    Security.UsernameToken usernameToken = new Security.UsernameToken();
    usernameToken.setUsername(USERNAME);
    usernameToken.setPassword(PASSWORD);
    usernameToken.setOrganization(SABRE_PCC);
    usernameToken.setDomain(DOMAIN);

    security.setUsernameToken(usernameToken);
    return security;
  }
}