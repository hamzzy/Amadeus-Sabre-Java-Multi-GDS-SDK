
package wsimport.lib.sabre.sessioncreate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SessionCreatePortType", targetNamespace = "https://webservices.service.sabre.com/websvc")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SessionCreatePortType {


    /**
     * 
     * @param header2
     * @param header
     * @param body
     * @return
     *     returns client.SessionCreateRS
     */
    @WebMethod(operationName = "SessionCreateRQ", action = "OTA")
    @WebResult(name = "SessionCreateRS", targetNamespace = "http://www.opentravel.org/OTA/2002/11", partName = "body")
    public SessionCreateRS sessionCreateRQ(
            @WebParam(name = "MessageHeader", targetNamespace = "http://www.ebxml.org/namespaces/messageHeader", header = true, mode = WebParam.Mode.INOUT, partName = "header")
                    Holder<MessageHeader> header,
            @WebParam(name = "Security", targetNamespace = "http://schemas.xmlsoap.org/ws/2002/12/secext", header = true, mode = WebParam.Mode.INOUT, partName = "header2")
                    Holder<Security> header2,
            @WebParam(name = "SessionCreateRQ", targetNamespace = "http://www.opentravel.org/OTA/2002/11", partName = "body")
                    SessionCreateRQ body);

}
