
package wsimport.lib.amadeus.lowfarematrix;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "wsLowFareMatrixSoap", targetNamespace = "http://traveltalk.com/wsLowFareMatrix")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsLowFareMatrixSoap {


    /**
     * Process Low Fare Matrix Messages Request.
     * 
     * @param otaAirLowFareSearchMatrixRQ
     * @return
     *     returns soap.client.lowfarematrix.OTAAirLowFareSearchMatrixRS
     */
    @WebMethod(action = "http://traveltalk.com/wsLowFareMatrix/wmLowFareMatrix")
    @WebResult(name = "OTA_AirLowFareSearchMatrixRS", targetNamespace = "http://traveltalk.com/wsLowFareMatrix")
    @RequestWrapper(localName = "wmLowFareMatrix", targetNamespace = "http://traveltalk.com/wsLowFareMatrix", className = "soap.client.lowfarematrix.WmLowFareMatrix")
    @ResponseWrapper(localName = "wmLowFareMatrixResponse", targetNamespace = "http://traveltalk.com/wsLowFareMatrix", className = "soap.client.lowfarematrix.WmLowFareMatrixResponse")
    public OTAAirLowFareSearchMatrixRS wmLowFareMatrix(
            @WebParam(name = "OTA_AirLowFareSearchMatrixRQ", targetNamespace = "http://traveltalk.com/wsLowFareMatrix")
                    OTAAirLowFareSearchMatrixRQ otaAirLowFareSearchMatrixRQ);

    /**
     * Process Low Fare Matrix Xml Messages Request.
     * 
     * @param xmlRequest
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://traveltalk.com/wsLowFareMatrix/wmLowFareMatrixXml")
    @WebResult(name = "wmLowFareMatrixXmlResult", targetNamespace = "http://traveltalk.com/wsLowFareMatrix")
    @RequestWrapper(localName = "wmLowFareMatrixXml", targetNamespace = "http://traveltalk.com/wsLowFareMatrix", className = "soap.client.lowfarematrix.WmLowFareMatrixXml")
    @ResponseWrapper(localName = "wmLowFareMatrixXmlResponse", targetNamespace = "http://traveltalk.com/wsLowFareMatrix", className = "soap.client.lowfarematrix.WmLowFareMatrixXmlResponse")
    public String wmLowFareMatrixXml(
            @WebParam(name = "xmlRequest", targetNamespace = "http://traveltalk.com/wsLowFareMatrix")
                    String xmlRequest);

}