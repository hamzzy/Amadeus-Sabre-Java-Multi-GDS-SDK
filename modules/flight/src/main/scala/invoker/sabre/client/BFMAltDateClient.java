package flight.invoker.sabre.client;


import flight.dto.entity.FlightSearchRequest;
import flight.dto.entity.OriginDestinationRequest;
import flight.dto.entity.PassengerType;
import scala.collection.convert.WrapAsJava;
import wsimport.lib.sabre.bfm.altdate.*;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import scala.collection.convert.*;

public class BFMAltDateClient extends flight.invoker.sabre.client.SabreClient {

    private static final String VERSION = config.getString("sabre.bfmAd.version");

    protected OTAAirLowFareSearchRQ getOTAAirLowFareSearchRQ(FlightSearchRequest flightRequest) {
        OTAAirLowFareSearchRQ lowFareSearchRQ = new OTAAirLowFareSearchRQ();
        lowFareSearchRQ.setResponseType(SERVICE_TYPE);
        lowFareSearchRQ.setResponseVersion(VERSION);
        lowFareSearchRQ.setAvailableFlightsOnly(Boolean.TRUE);
        lowFareSearchRQ.setDirectFlightsOnly(Boolean.FALSE);
        lowFareSearchRQ.setPOS(getPOSType());
        List<PassengerType> passengerTypes = flight.invoker.sabre.client.ListWrapper.seqAsJavaList(flightRequest.passengerTypes());
        flight.invoker.sabre.client.ListWrapper.seqAsJavaList(flightRequest.originDestinationRequests()).forEach(originDestinationRequest -> lowFareSearchRQ.getOriginDestinationInformation().add(getOriginDestinationInformation(originDestinationRequest)));
        lowFareSearchRQ.setTravelPreferences(getAirSearchPrefsType(flightRequest));
        lowFareSearchRQ.setTravelerInfoSummary(getTravelerInfoSummaryType(passengerTypes, flightRequest.seatCount()));
        lowFareSearchRQ.setTPAExtensions(getAirLowFareSearchRQTPAExtensions());
        lowFareSearchRQ.setVersion(VERSION);

        return lowFareSearchRQ;
    }

    protected BargainFinderMaxPortType getConfiguredPort() {
        BargainFinderMaxService service = new BargainFinderMaxService();
        BargainFinderMaxPortType portType = service.getBargainFinderMaxPortType();
        setEndpointFromConfiguration(portType);

        return portType;
    }

    private void setEndpointFromConfiguration(BargainFinderMaxPortType port) {
        BindingProvider bindingProvider = (BindingProvider) port;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL);
    }

    private OTAAirLowFareSearchRQ.TPAExtensions getAirLowFareSearchRQTPAExtensions() {
        OTAAirLowFareSearchRQ.TPAExtensions tpaExt = new OTAAirLowFareSearchRQ.TPAExtensions();
        tpaExt.setIntelliSellTransaction(getTransactionType());

        return tpaExt;
    }

    private TransactionType getTransactionType() {
        TransactionType transactionType = new TransactionType();
        TransactionType.RequestType requestType = new TransactionType.RequestType();

        requestType.setName(config.getString("sabre.bfmAd.requestType"));
        transactionType.setRequestType(requestType);

        return transactionType;
    }

    private POSType getPOSType() {
        POSType pos = new POSType();
        SourceType source = new SourceType();
        CompanyNameType companyName = new CompanyNameType();
        UniqueIDType uniqueIDType = new UniqueIDType();
        companyName.setCode("TN");
        uniqueIDType.setCompanyName(companyName);
        uniqueIDType.setID("1");
        uniqueIDType.setType("1");
        source.setPseudoCityCode(SABRE_PCC);
        source.setRequestorID(uniqueIDType);
        pos.getSource().add(source);
        return pos;
    }

    private OTAAirLowFareSearchRQ.OriginDestinationInformation getOriginDestinationInformation(OriginDestinationRequest originDestinationRequest) {
        OTAAirLowFareSearchRQ.OriginDestinationInformation departure = new OTAAirLowFareSearchRQ.OriginDestinationInformation();
        OriginDestinationInformationType.OriginLocation departureOrigin = new OriginDestinationInformationType.OriginLocation();
        OriginDestinationInformationType.DestinationLocation departureDestination = new OriginDestinationInformationType.DestinationLocation();
        OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SegmentType segmentType = new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions.SegmentType();
        OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions tpaExtensions = new OTAAirLowFareSearchRQ.OriginDestinationInformation.TPAExtensions();

        segmentType.setCode("O");
        tpaExtensions.setSegmentType(segmentType);
        departureOrigin.setLocationCode(originDestinationRequest.origin().airCode());
        departureDestination.setLocationCode(originDestinationRequest.destination().airCode());
        departure.setRPH(originDestinationRequest.RPH());

        departure.setDepartureDateTime(originDestinationRequest.departureDateTime());
        departure.setOriginLocation(departureOrigin);
        departure.setDestinationLocation(departureDestination);
        departure.setTPAExtensions(tpaExtensions);

        return departure;
    }

    private TravelerInfoSummaryType getTravelerInfoSummaryType(List<PassengerType> passengerTypes, int seatCount) {
        PriceRequestInformationType priceRequestInformationType = new PriceRequestInformationType();
        TravelerInfoSummaryType travelerInfoSummary = new TravelerInfoSummaryType();
        PriceRequestInformationType.TPAExtensions priceTPA = new PriceRequestInformationType.TPAExtensions();
        PriceRequestInformationType.TPAExtensions.Priority priority = new PriceRequestInformationType.TPAExtensions.Priority();
        PriceRequestInformationType.TPAExtensions.Priority.Price price = new PriceRequestInformationType.TPAExtensions.Priority.Price();
        PriceRequestInformationType.TPAExtensions.Priority.DirectFlights directFlights = new PriceRequestInformationType.TPAExtensions.Priority.DirectFlights();
        PriceRequestInformationType.TPAExtensions.Priority.Time time = new PriceRequestInformationType.TPAExtensions.Priority.Time();
        PriceRequestInformationType.TPAExtensions.Priority.Vendor vendor = new PriceRequestInformationType.TPAExtensions.Priority.Vendor();

        price.setPriority(1);
        directFlights.setPriority(2);
        time.setPriority(3);
        vendor.setPriority(4);
        priority.setPrice(price);
        priority.setDirectFlights(directFlights);
        priority.setTime(time);
        priority.setVendor(vendor);
        priceTPA.setPriority(priority);
        priceRequestInformationType.setCurrencyCode(CURRENCY);
        priceRequestInformationType.setNegotiatedFaresOnly(Boolean.FALSE);
        priceRequestInformationType.setProcessThruFaresOnly(Boolean.FALSE);
        priceRequestInformationType.setTPAExtensions(priceTPA);
        travelerInfoSummary.getSeatsRequested().add(BigInteger.valueOf(seatCount));
        travelerInfoSummary.getAirTravelerAvail().add(getTravelerInformationType(passengerTypes));
        travelerInfoSummary.setPriceRequestInformation(priceRequestInformationType);

        return travelerInfoSummary;
    }

    private TravelerInformationType getTravelerInformationType(List<PassengerType> passengerTypes) {
        TravelerInformationType traveler = new TravelerInformationType();

        passengerTypes.forEach(passengerType -> {
            PassengerTypeQuantityType passenger = new PassengerTypeQuantityType();
            passenger.setCode(passengerType.code().value());
            passenger.setQuantity(passengerType.quantity());
            traveler.getPassengerTypeQuantity().add(passenger);
        });

        return traveler;
    }

    private AirSearchPrefsType getAirSearchPrefsType(FlightSearchRequest flightRequest) {
        CabinPrefType cabinPrefType = new CabinPrefType();
        AirSearchPrefsType airSearchPrefsType = new AirSearchPrefsType();
        AirSearchPrefsType.TPAExtensions tpa = new AirSearchPrefsType.TPAExtensions();
        AirSearchPrefsType.TPAExtensions.TripType tripType = new AirSearchPrefsType.TPAExtensions.TripType();
        AirSearchPrefsType.TPAExtensions.LongConnectTime longConnectTime = new AirSearchPrefsType.TPAExtensions.LongConnectTime();

        cabinPrefType.setCabin(CabinType.fromValue(flightRequest.preferredCabin().value()));
//        cabinPrefType.setPreferLevel(PreferLevelType.fromValue(flightRequest.cabinPrefLevel().value()));
        tripType.setValue(AirTripType.fromValue(flightRequest.tripType().value()));
        longConnectTime.setEnable(Boolean.TRUE);
        longConnectTime.setMin(Short.valueOf(config.getString("sabre.bfmAd.longConnectTime.min")));
        tpa.setTripType(tripType);
        tpa.setLongConnectTime(longConnectTime);
        airSearchPrefsType.getCabinPref().add(cabinPrefType);
        airSearchPrefsType.setETicketDesired(Boolean.FALSE);
        airSearchPrefsType.setValidInterlineTicket(Boolean.FALSE);
        airSearchPrefsType.setETicketDesired(Boolean.TRUE);
        airSearchPrefsType.setTPAExtensions(tpa);

        return airSearchPrefsType;
    }

    protected MessageHeader createMessageHeader() {
        MessageHeader messageHeader = new MessageHeader();
        From from = new From();
        PartyId fromPartyId = new PartyId();
        fromPartyId.setType(PARTY_ID_TYPE);
        fromPartyId.setValue(PARTY_ID_FROM);
        from.getPartyId().add(fromPartyId);
        To to = new To();
        PartyId toPartyId = new PartyId();
        toPartyId.setType(PARTY_ID_TYPE);
        toPartyId.setValue(PARTY_ID_TO);
        to.getPartyId().add(toPartyId);
        Service service = new Service();
        service.setType(SERVICE_TYPE);
        service.setValue(config.getString("sabre.bfmAd.service"));

        MessageData messageData = new MessageData();
        messageData.setMessageId(getMessageId());
        messageData.setTimestamp(getMessageTimeStamp());

        messageHeader.setConversationId(CONVERSATION_ID);
        messageHeader.setFrom(from);
        messageHeader.setTo(to);
        messageHeader.setCPAId(SABRE_PCC);
        messageHeader.setService(service);
        messageHeader.setMessageData(messageData);
        messageHeader.setAction(config.getString("sabre.bfmAd.action"));

        return messageHeader;
    }

    protected Security createSecurity(String binarySecurityToken) {
        Security security = new Security();
        Security.UsernameToken usernameToken = new Security.UsernameToken();
        usernameToken.setUsername(USERNAME);
        usernameToken.setPassword(PASSWORD);
        usernameToken.setOrganization(SABRE_PCC);
        usernameToken.setDomain(DOMAIN);

        security.setUsernameToken(usernameToken);
        security.setBinarySecurityToken(binarySecurityToken);
        return security;
    }

}
