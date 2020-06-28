package wsimport.lib.amadeus.airfliforq;

import wsimport.lib.amadeus.utils.BasePOSBuilder;

/**
 * |
 * | Created by Igbalajobi Jamiu O..
 * | On 28/02/2016 8:12 AM
 * |
 **/
public class POSBuilder {

    public static POS createInstance() {
        POS pos = new POS();
        Provider provider = createProvider("Amadeus", BasePOSBuilder.SYSTEM(), BasePOSBuilder.USERNAME(), BasePOSBuilder.PASSWORD());
        TPAExtensions tpaExtensions = createTPAExtensions(provider);
        RequestorID requestorID = createRequestorID(BasePOSBuilder.REQUESTOR_ID(), BasePOSBuilder.REQUESTOR_TYPE());
        Source source = createSource(BasePOSBuilder.PCC(),requestorID);
        pos.setSource(source);
        pos.setTPAExtensions(tpaExtensions);
        return pos;
    }

    private static Source createSource(String pseudoCityCode, RequestorID requestorID) {
        Source source = new Source();
        source.setPseudoCityCode(pseudoCityCode);
        source.setRequestorID(requestorID);
        return source;
    }

    private static TPAExtensions createTPAExtensions(Provider provider) {
        TPAExtensions tpaExtensions = new TPAExtensions();
        tpaExtensions.setProvider(provider);
        return tpaExtensions;
    }

    private static RequestorID createRequestorID(String requestorId, String requestorType) {
        RequestorID requestorID = new RequestorID();
        requestorID.setID(requestorId);
        requestorID.setType(requestorType);
        return requestorID;
    }

    private static Provider createProvider(String name, String system, String userId, String password) {
        Provider provider = new Provider();
        provider.setName(name);
        provider.setSystem(system);
        provider.setUserid(userId);
        provider.setPassword(password);
        return provider;
    }

}