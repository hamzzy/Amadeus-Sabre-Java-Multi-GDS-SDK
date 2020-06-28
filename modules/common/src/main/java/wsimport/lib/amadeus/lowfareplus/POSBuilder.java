package wsimport.lib.amadeus.lowfareplus;

import wsimport.lib.amadeus.utils.BasePOSBuilder;

public final class POSBuilder {


    public static POS createInstance() {
        POS pos = new POS();
        /**
         * Create Source and RequestorID Object
         */
        RequestorID requestorID = new RequestorID();
        requestorID.setID(BasePOSBuilder.REQUESTOR_ID());
        requestorID.setType(BasePOSBuilder.REQUESTOR_TYPE());
        Source source = new Source();
        source.setPseudoCityCode(BasePOSBuilder.PCC());
        source.setISOCountry(BasePOSBuilder.DEFAULT_CURRENCY());
        source.setRequestorID(requestorID);
        Name name = createName("Amadeus", BasePOSBuilder.PCC());
        Provider provider = createProvider(name, BasePOSBuilder.SYSTEM(), BasePOSBuilder.USERNAME(), BasePOSBuilder.PASSWORD());
        TPAExtensions tpaExtensions = createTPAExtensions(provider);
        pos.setTPAExtensions(tpaExtensions);
        pos.setSource(source);
        return pos;
    }

    private static Name createName(String value, String pseudoCityCode) {
        Name name = new Name();
        name.setValue(value);
        name.setPseudoCityCode(pseudoCityCode);
        return name;
    }

    private static Provider createProvider(Name name, String system, String userId, String password) {
        Provider provider = new Provider();
        provider.getName().add(name);
        provider.setSystem(system);
        provider.setUserid(userId);
        provider.setPassword(password);
        return provider;
    }

    private static TPAExtensions createTPAExtensions(Provider provider) {
        TPAExtensions tpaExtensions = new TPAExtensions();
        tpaExtensions.setProvider(provider);
        return tpaExtensions;
    }
}