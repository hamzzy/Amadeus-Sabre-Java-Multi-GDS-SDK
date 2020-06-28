
package wsimport.lib.amadeus.wstransferownership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wmTransferOwnershipXmlResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wmTransferOwnershipXmlResult"
})
@XmlRootElement(name = "wmTransferOwnershipXmlResponse")
public class WmTransferOwnershipXmlResponse {

    protected String wmTransferOwnershipXmlResult;

    /**
     * Gets the value of the wmTransferOwnershipXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmTransferOwnershipXmlResult() {
        return wmTransferOwnershipXmlResult;
    }

    /**
     * Sets the value of the wmTransferOwnershipXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmTransferOwnershipXmlResult(String value) {
        this.wmTransferOwnershipXmlResult = value;
    }

}
