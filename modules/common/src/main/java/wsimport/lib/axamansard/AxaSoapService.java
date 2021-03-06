
package wsimport.lib.axamansard;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "axamdemo", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://www.axamansard.com/eSalesTest/webservice/axamdemo.asmx?WSDL")
public class AxaSoapService extends Service {

    private final static URL AXAMDEMO_WSDL_LOCATION;
    private final static WebServiceException AXAMDEMO_EXCEPTION;
    private final static QName AXAMDEMO_QNAME = new QName("http://tempuri.org/", "axamdemo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.axamansard.com/eSalesTest/webservice/axamdemo.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AXAMDEMO_WSDL_LOCATION = url;
        AXAMDEMO_EXCEPTION = e;
    }

    public AxaSoapService() {
        super(__getWsdlLocation(), AXAMDEMO_QNAME);
    }

    public AxaSoapService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AXAMDEMO_QNAME, features);
    }

    public AxaSoapService(URL wsdlLocation) {
        super(wsdlLocation, AXAMDEMO_QNAME);
    }

    public AxaSoapService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AXAMDEMO_QNAME, features);
    }

    public AxaSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AxaSoapService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AxamdemoSoap
     */
    @WebEndpoint(name = "axamdemoSoap")
    public AxamdemoSoap getAxamdemoSoap() {
        return super.getPort(new QName("http://tempuri.org/", "axamdemoSoap"), AxamdemoSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AxamdemoSoap
     */
    @WebEndpoint(name = "axamdemoSoap")
    public AxamdemoSoap getAxamdemoSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "axamdemoSoap"), AxamdemoSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AXAMDEMO_EXCEPTION!= null) {
            throw AXAMDEMO_EXCEPTION;
        }
        return AXAMDEMO_WSDL_LOCATION;
    }

}
