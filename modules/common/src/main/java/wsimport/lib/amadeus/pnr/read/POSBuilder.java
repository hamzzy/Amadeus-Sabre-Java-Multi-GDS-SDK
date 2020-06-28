package wsimport.lib.amadeus.pnr.read;


import wsimport.lib.amadeus.utils.BasePOSBuilder;

/**
 * Created by
 * Igbalajobi Jamiu O. on 09/09/2016 2:07 AM.
 */
public class POSBuilder  {

    public static wsimport.lib.amadeus.pnr.read.POS createInstance() {
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

        pos.getSource().add(source);
        pos.setTPAExtensions(tpaExtensions);

        return pos;
    }

}
