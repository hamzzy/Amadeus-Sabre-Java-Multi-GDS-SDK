
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
 *         &lt;element name="SaveTravelPolicyResult" type="{http://tempuri.org/}Result" minOccurs="0"/>
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
    "saveTravelPolicyResult"
})
@XmlRootElement(name = "SaveTravelPolicyResponse")
public class SaveTravelPolicyResponse {

    @XmlElement(name = "SaveTravelPolicyResult")
    protected Result saveTravelPolicyResult;

    /**
     * Gets the value of the saveTravelPolicyResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getSaveTravelPolicyResult() {
        return saveTravelPolicyResult;
    }

    /**
     * Sets the value of the saveTravelPolicyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setSaveTravelPolicyResult(Result value) {
        this.saveTravelPolicyResult = value;
    }

}
