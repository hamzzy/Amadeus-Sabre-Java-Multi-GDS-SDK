
package wsimport.lib.amadeus.wsairrules;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * A TripXML Web Service to Process Air Rules Messages Request.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsAirRules", targetNamespace = "http://traveltalk.com/wsAirRules", wsdlLocation = "http://amadeusws.tripxml.com/TripXML/wsAirRules.asmx?WSDL")
public class WsAirRules
    extends Service
{

    private final static URL WSAIRRULES_WSDL_LOCATION;
    private final static WebServiceException WSAIRRULES_EXCEPTION;
    private final static QName WSAIRRULES_QNAME = new QName("http://traveltalk.com/wsAirRules", "wsAirRules");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://amadeusws.tripxml.com/TripXML/wsAirRules.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSAIRRULES_WSDL_LOCATION = url;
        WSAIRRULES_EXCEPTION = e;
    }

    public WsAirRules() {
        super(__getWsdlLocation(), WSAIRRULES_QNAME);
    }

    public WsAirRules(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSAIRRULES_QNAME, features);
    }

    public WsAirRules(URL wsdlLocation) {
        super(wsdlLocation, WSAIRRULES_QNAME);
    }

    public WsAirRules(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSAIRRULES_QNAME, features);
    }

    public WsAirRules(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsAirRules(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsAirRulesSoap
     */
    @WebEndpoint(name = "wsAirRulesSoap")
    public WsAirRulesSoap getWsAirRulesSoap() {
        return super.getPort(new QName("http://traveltalk.com/wsAirRules", "wsAirRulesSoap"), WsAirRulesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsAirRulesSoap
     */
    @WebEndpoint(name = "wsAirRulesSoap")
    public WsAirRulesSoap getWsAirRulesSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://traveltalk.com/wsAirRules", "wsAirRulesSoap"), WsAirRulesSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSAIRRULES_EXCEPTION!= null) {
            throw WSAIRRULES_EXCEPTION;
        }
        return WSAIRRULES_WSDL_LOCATION;
    }

}
