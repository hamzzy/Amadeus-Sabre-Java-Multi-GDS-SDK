
package wsimport.lib.amadeus.pnr.cancel;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * A TripXML Web Service to Process PNR Cancel Request.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsPNRCancel", targetNamespace = "http://traveltalk.com/wsPNRCancel", wsdlLocation = "http://amadeusws.tripxml.com/TripXML/wsPNRCancel.asmx?WSDL")
public class WsPNRCancel
    extends Service
{

    private final static URL WSPNRCANCEL_WSDL_LOCATION;
    private final static WebServiceException WSPNRCANCEL_EXCEPTION;
    private final static QName WSPNRCANCEL_QNAME = new QName("http://traveltalk.com/wsPNRCancel", "wsPNRCancel");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://amadeusws.tripxml.com/TripXML/wsPNRCancel.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSPNRCANCEL_WSDL_LOCATION = url;
        WSPNRCANCEL_EXCEPTION = e;
    }

    public WsPNRCancel() {
        super(__getWsdlLocation(), WSPNRCANCEL_QNAME);
    }

    public WsPNRCancel(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSPNRCANCEL_QNAME, features);
    }

    public WsPNRCancel(URL wsdlLocation) {
        super(wsdlLocation, WSPNRCANCEL_QNAME);
    }

    public WsPNRCancel(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSPNRCANCEL_QNAME, features);
    }

    public WsPNRCancel(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsPNRCancel(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsPNRCancelSoap
     */
    @WebEndpoint(name = "wsPNRCancelSoap")
    public WsPNRCancelSoap getWsPNRCancelSoap() {
        return super.getPort(new QName("http://traveltalk.com/wsPNRCancel", "wsPNRCancelSoap"), WsPNRCancelSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <itemTypes>features</itemTypes> parameter will have their default values.
     * @return
     *     returns WsPNRCancelSoap
     */
    @WebEndpoint(name = "wsPNRCancelSoap")
    public WsPNRCancelSoap getWsPNRCancelSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://traveltalk.com/wsPNRCancel", "wsPNRCancelSoap"), WsPNRCancelSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSPNRCANCEL_EXCEPTION!= null) {
            throw WSPNRCANCEL_EXCEPTION;
        }
        return WSPNRCANCEL_WSDL_LOCATION;
    }

}
