package flight.invoker.sabre.client;

import com.typesafe.config.Config;
import services.ConfigLoad;
import services.ConfigLoadObject;

import java.time.LocalDateTime;
import java.util.UUID;

public class SabreClient {
    protected static Config config = ConfigLoadObject.apply();
    protected static String ENDPOINT_URL = config.getString("sabre.endpoint");
    protected static String SERVICE_TYPE = config.getString("sabre.serviceType");
    protected static String DOMAIN = config.getString("sabre.domain");
    protected static String SABRE_PCC = config.getString("sabre.pcc");
    protected static String USERNAME = config.getString("sabre.username");
    protected static String PASSWORD = config.getString("sabre.password");
    protected static String CONVERSATION_ID = config.getString("sabre.conversationId");
    protected static String PARTY_ID_TYPE = config.getString("sabre.partyIdType");
    protected static String PARTY_ID_TO = config.getString("sabre.partyIdTo");
    protected static String PARTY_ID_FROM = config.getString("sabre.partyIdFrom");
    protected static String PARTY_ID_DOMAIN = config.getString("sabre.partyIdDomain");
    protected static String CURRENCY = config.getString("sabre.currency");
    protected static String AGENCY_NAME = config.getString("sabre.agency.name");

    protected static String getMessageId() {
        return UUID.randomUUID().toString() + "@" + PARTY_ID_DOMAIN;
    }

    protected static String getMessageTimeStamp() {
        return LocalDateTime.now().toString() + "Z";
    }
}
