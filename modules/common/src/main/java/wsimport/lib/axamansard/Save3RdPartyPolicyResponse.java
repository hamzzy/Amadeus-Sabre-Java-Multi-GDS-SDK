
package wsimport.lib.axamansard;

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
 *         &lt;element name="Save3rdPartyPolicyResult" type="{http://tempuri.org/}Result" minOccurs="0"/>
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
    "save3RdPartyPolicyResult"
})
@XmlRootElement(name = "Save3rdPartyPolicyResponse")
public class Save3RdPartyPolicyResponse {

    @XmlElement(name = "Save3rdPartyPolicyResult")
    protected Result save3RdPartyPolicyResult;

    /**
     * Gets the value of the save3RdPartyPolicyResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getSave3RdPartyPolicyResult() {
        return save3RdPartyPolicyResult;
    }

    /**
     * Sets the value of the save3RdPartyPolicyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setSave3RdPartyPolicyResult(Result value) {
        this.save3RdPartyPolicyResult = value;
    }

}
