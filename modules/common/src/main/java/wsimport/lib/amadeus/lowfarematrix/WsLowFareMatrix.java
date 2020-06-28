
package wsimport.lib.amadeus.lowfarematrix;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * A TripXML Web Service to Process Low Fare Matrix Messages Request.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsLowFareMatrix", targetNamespace = "http://traveltalk.com/wsLowFareMatrix", wsdlLocation = "http://amadeusws.tripxml.com/TripXML/wsLowFareMatrix.asmx?WSDL")
public class WsLowFareMatrix
    extends Service
{

    private final static URL WSLOWFAREMATRIX_WSDL_LOCATION;
    private final static WebServiceException WSLOWFAREMATRIX_EXCEPTION;
    private final static QName WSLOWFAREMATRIX_QNAME = new QName("http://traveltalk.com/wsLowFareMatrix", "wsLowFareMatrix");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://amadeusws.tripxml.com/TripXML/wsLowFareMatrix.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSLOWFAREMATRIX_WSDL_LOCATION = url;
        WSLOWFAREMATRIX_EXCEPTION = e;
    }

    public WsLowFareMatrix() {
        super(__getWsdlLocation(), WSLOWFAREMATRIX_QNAME);
    }

    public WsLowFareMatrix(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSLOWFAREMATRIX_QNAME, features);
    }

    public WsLowFareMatrix(URL wsdlLocation) {
        super(wsdlLocation, WSLOWFAREMATRIX_QNAME);
    }

    public WsLowFareMatrix(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSLOWFAREMATRIX_QNAME, features);
    }

    public WsLowFareMatrix(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsLowFareMatrix(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsLowFareMatrixSoap
     */
    @WebEndpoint(name = "wsLowFareMatrixSoap")
    public WsLowFareMatrixSoap getWsLowFareMatrixSoap() {
        return super.getPort(new QName("http://traveltalk.com/wsLowFareMatrix", "wsLowFareMatrixSoap"), WsLowFareMatrixSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <itemTypes>features</itemTypes> parameter will have their default values.
     * @return
     *     returns WsLowFareMatrixSoap
     */
    @WebEndpoint(name = "wsLowFareMatrixSoap")
    public WsLowFareMatrixSoap getWsLowFareMatrixSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://traveltalk.com/wsLowFareMatrix", "wsLowFareMatrixSoap"), WsLowFareMatrixSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSLOWFAREMATRIX_EXCEPTION!= null) {
            throw WSLOWFAREMATRIX_EXCEPTION;
        }
        return WSLOWFAREMATRIX_WSDL_LOCATION;
    }

}
