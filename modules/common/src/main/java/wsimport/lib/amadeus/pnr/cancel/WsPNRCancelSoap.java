
package wsimport.lib.amadeus.pnr.cancel;

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
@WebService(name = "wsPNRCancelSoap", targetNamespace = "http://traveltalk.com/wsPNRCancel")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsPNRCancelSoap {


    /**
     * Process PNR Cancel Messages Request.
     * 
     * @param otaCancelRQ
     * @return
     *     returns flight.services.amadeus.pnr.pnrcancel.OTACancelRS
     */
    @WebMethod(action = "http://traveltalk.com/wsPNRCancel/wmPNRCancel")
    @WebResult(name = "OTA_CancelRS", targetNamespace = "http://traveltalk.com/wsPNRCancel")
    @RequestWrapper(localName = "wmPNRCancel", targetNamespace = "http://traveltalk.com/wsPNRCancel", className = "flight.services.amadeus.pnr.pnrcancel.WmPNRCancel")
    @ResponseWrapper(localName = "wmPNRCancelResponse", targetNamespace = "http://traveltalk.com/wsPNRCancel", className = "flight.services.amadeus.pnr.pnrcancel.WmPNRCancelResponse")
    public OTACancelRS wmPNRCancel(
            @WebParam(name = "OTA_CancelRQ", targetNamespace = "http://traveltalk.com/wsPNRCancel")
                    OTACancelRQ otaCancelRQ);

    /**
     * Process PNR Cancel Xml Messages Request.
     * 
     * @param xmlRequest
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://traveltalk.com/wsPNRCancel/wmPNRCancelXml")
    @WebResult(name = "wmPNRCancelXmlResult", targetNamespace = "http://traveltalk.com/wsPNRCancel")
    @RequestWrapper(localName = "wmPNRCancelXml", targetNamespace = "http://traveltalk.com/wsPNRCancel", className = "flight.services.amadeus.pnr.pnrcancel.WmPNRCancelXml")
    @ResponseWrapper(localName = "wmPNRCancelXmlResponse", targetNamespace = "http://traveltalk.com/wsPNRCancel", className = "flight.services.amadeus.pnr.pnrcancel.WmPNRCancelXmlResponse")
    public String wmPNRCancelXml(
            @WebParam(name = "xmlRequest", targetNamespace = "http://traveltalk.com/wsPNRCancel")
                    String xmlRequest);

}
