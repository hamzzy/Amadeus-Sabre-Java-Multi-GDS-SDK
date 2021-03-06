
package wsimport.lib.amadeus.wstransferownership;

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
@WebService(name = "wsTransferOwnershipSoap", targetNamespace = "http://traveltalk.com/wsTransferOwnership")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsTransferOwnershipSoap {


    /**
     * Process Air Flight Info Messages Request.
     * 
     * @param otaTransferOwnershipRQ
     * @return
     *     returns wsimport.lib.amadeus.wstransferownership.OTATransferOwnershipRS
     */
    @WebMethod(action = "http://traveltalk.com/wsTransferOwnership/wmTransferOwnership")
    @WebResult(name = "OTA_TransferOwnershipRS", targetNamespace = "http://traveltalk.com/wsTransferOwnership")
    @RequestWrapper(localName = "wmTransferOwnership", targetNamespace = "http://traveltalk.com/wsTransferOwnership", className = "wsimport.lib.amadeus.wstransferownership.WmTransferOwnership")
    @ResponseWrapper(localName = "wmTransferOwnershipResponse", targetNamespace = "http://traveltalk.com/wsTransferOwnership", className = "wsimport.lib.amadeus.wstransferownership.WmTransferOwnershipResponse")
    public OTATransferOwnershipRS wmTransferOwnership(
        @WebParam(name = "OTA_TransferOwnershipRQ", targetNamespace = "http://traveltalk.com/wsTransferOwnership")
        OTATransferOwnershipRQ otaTransferOwnershipRQ);

    /**
     * Process Air Flight Info Xml Messages Request.
     * 
     * @param xmlRequest
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://traveltalk.com/wsTransferOwnership/wmTransferOwnershipXml")
    @WebResult(name = "wmTransferOwnershipXmlResult", targetNamespace = "http://traveltalk.com/wsTransferOwnership")
    @RequestWrapper(localName = "wmTransferOwnershipXml", targetNamespace = "http://traveltalk.com/wsTransferOwnership", className = "wsimport.lib.amadeus.wstransferownership.WmTransferOwnershipXml")
    @ResponseWrapper(localName = "wmTransferOwnershipXmlResponse", targetNamespace = "http://traveltalk.com/wsTransferOwnership", className = "wsimport.lib.amadeus.wstransferownership.WmTransferOwnershipXmlResponse")
    public String wmTransferOwnershipXml(
        @WebParam(name = "xmlRequest", targetNamespace = "http://traveltalk.com/wsTransferOwnership")
        String xmlRequest);

}
