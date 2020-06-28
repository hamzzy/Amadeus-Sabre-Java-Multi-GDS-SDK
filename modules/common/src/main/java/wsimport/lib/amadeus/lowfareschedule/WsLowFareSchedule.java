
package wsimport.lib.amadeus.lowfareschedule;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * A TripXML Web Service to Process Low Fare Schedule Messages Request.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsLowFareSchedule", targetNamespace = "http://traveltalk.com/wsLowFareSchedule", wsdlLocation = "http://amadeusws.tripxml.com/TripXML/wsLowFareSchedule.asmx?WSDL")
public class WsLowFareSchedule
    extends Service
{

    private final static URL WSLOWFARESCHEDULE_WSDL_LOCATION;
    private final static WebServiceException WSLOWFARESCHEDULE_EXCEPTION;
    private final static QName WSLOWFARESCHEDULE_QNAME = new QName("http://traveltalk.com/wsLowFareSchedule", "wsLowFareSchedule");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://amadeusws.tripxml.com/TripXML/wsLowFareSchedule.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSLOWFARESCHEDULE_WSDL_LOCATION = url;
        WSLOWFARESCHEDULE_EXCEPTION = e;
    }

    public WsLowFareSchedule() {
        super(__getWsdlLocation(), WSLOWFARESCHEDULE_QNAME);
    }

    public WsLowFareSchedule(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSLOWFARESCHEDULE_QNAME, features);
    }

    public WsLowFareSchedule(URL wsdlLocation) {
        super(wsdlLocation, WSLOWFARESCHEDULE_QNAME);
    }

    public WsLowFareSchedule(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSLOWFARESCHEDULE_QNAME, features);
    }

    public WsLowFareSchedule(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsLowFareSchedule(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsLowFareScheduleSoap
     */
    @WebEndpoint(name = "wsLowFareScheduleSoap")
    public WsLowFareScheduleSoap getWsLowFareScheduleSoap() {
        return super.getPort(new QName("http://traveltalk.com/wsLowFareSchedule", "wsLowFareScheduleSoap"), WsLowFareScheduleSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <itemTypes>features</itemTypes> parameter will have their default values.
     * @return
     *     returns WsLowFareScheduleSoap
     */
    @WebEndpoint(name = "wsLowFareScheduleSoap")
    public WsLowFareScheduleSoap getWsLowFareScheduleSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://traveltalk.com/wsLowFareSchedule", "wsLowFareScheduleSoap"), WsLowFareScheduleSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSLOWFARESCHEDULE_EXCEPTION!= null) {
            throw WSLOWFARESCHEDULE_EXCEPTION;
        }
        return WSLOWFARESCHEDULE_WSDL_LOCATION;
    }

}
