package wsimport.lib.amadeus.pnr.issue;


import wsimport.lib.amadeus.utils.BasePOSBuilder;

/**
 * Created by
 * Igbalajobi Jamiu O. on 01/06/2016 10:03 AM.
 */
public class POSBuilder {
    public static POS createInstance() {
        /**
         * Create Source and RequestorID Object
         */
        POS pos = new POS();
        TPAExtensions tpaExtensions = new TPAExtensions();

        Provider provider = new Provider();
        provider.setName(BasePOSBuilder.NAME());
        provider.setSystem(BasePOSBuilder.SYSTEM());
        provider.setPassword(BasePOSBuilder.PASSWORD());
        provider.setUserid(BasePOSBuilder.USERNAME());
        tpaExtensions.setProvider(provider);

        Source source = new Source();
        source.setPseudoCityCode(BasePOSBuilder.PCC());
        RequestorID requestor = new RequestorID();
        requestor.setType(BasePOSBuilder.REQUESTOR_TYPE());
        requestor.setID(BasePOSBuilder.REQUESTOR_ID());
        source.setRequestorID(requestor);

        pos.setSource(source);
        pos.setTPAExtensions(tpaExtensions);
        return pos;
    }

}
