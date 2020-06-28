
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetCancelPolicyTextResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getCancelPolicyTextResult"
})
@XmlRootElement(name = "GetCancelPolicyTextResponse")
public class GetCancelPolicyTextResponse {

    @XmlElement(name = "GetCancelPolicyTextResult")
    protected String getCancelPolicyTextResult;

    /**
     * Gets the value of the getCancelPolicyTextResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCancelPolicyTextResult() {
        return getCancelPolicyTextResult;
    }

    /**
     * Sets the value of the getCancelPolicyTextResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCancelPolicyTextResult(String value) {
        this.getCancelPolicyTextResult = value;
    }

}
