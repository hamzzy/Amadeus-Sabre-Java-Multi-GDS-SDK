
package wsimport.lib.sabre.bfm.sapt;

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
@WebServiceClient(name = "BargainFinderMaxService", targetNamespace = "https://webservices.sabre.com/websvc", wsdlLocation = "http://files.developer.sabre.com/wsdl/sabreXML1.0.00/shopping/BargainFinderMax_SAPTRQ_v1-9-4.wsdl")
public class BargainFinderMaxService
    extends Service
{

    private final static URL BARGAINFINDERMAXSERVICE_WSDL_LOCATION;
    private final static WebServiceException BARGAINFINDERMAXSERVICE_EXCEPTION;
    private final static QName BARGAINFINDERMAXSERVICE_QNAME = new QName("https://webservices.sabre.com/websvc", "BargainFinderMaxService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://files.developer.sabre.com/wsdl/sabreXML1.0.00/shopping/BargainFinderMax_SAPTRQ_v1-9-4.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BARGAINFINDERMAXSERVICE_WSDL_LOCATION = url;
        BARGAINFINDERMAXSERVICE_EXCEPTION = e;
    }

    public BargainFinderMaxService() {
        super(__getWsdlLocation(), BARGAINFINDERMAXSERVICE_QNAME);
    }

    public BargainFinderMaxService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BARGAINFINDERMAXSERVICE_QNAME, features);
    }

    public BargainFinderMaxService(URL wsdlLocation) {
        super(wsdlLocation, BARGAINFINDERMAXSERVICE_QNAME);
    }

    public BargainFinderMaxService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BARGAINFINDERMAXSERVICE_QNAME, features);
    }

    public BargainFinderMaxService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BargainFinderMaxService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BargainFinderMaxPortType
     */
    @WebEndpoint(name = "BargainFinderMaxPortType")
    public BargainFinderMaxPortType getBargainFinderMaxPortType() {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "BargainFinderMaxPortType"), BargainFinderMaxPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <itemTypes>features</itemTypes> parameter will have their default values.
     * @return
     *     returns BargainFinderMaxPortType
     */
    @WebEndpoint(name = "BargainFinderMaxPortType")
    public BargainFinderMaxPortType getBargainFinderMaxPortType(WebServiceFeature... features) {
        return super.getPort(new QName("https://webservices.sabre.com/websvc", "BargainFinderMaxPortType"), BargainFinderMaxPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BARGAINFINDERMAXSERVICE_EXCEPTION!= null) {
            throw BARGAINFINDERMAXSERVICE_EXCEPTION;
        }
        return BARGAINFINDERMAXSERVICE_WSDL_LOCATION;
    }

}
