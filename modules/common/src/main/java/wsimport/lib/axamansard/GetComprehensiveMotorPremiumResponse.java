
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
 *         &lt;element name="GetComprehensiveMotorPremiumResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getComprehensiveMotorPremiumResult"
})
@XmlRootElement(name = "GetComprehensiveMotorPremiumResponse")
public class GetComprehensiveMotorPremiumResponse {

    @XmlElement(name = "GetComprehensiveMotorPremiumResult")
    protected String getComprehensiveMotorPremiumResult;

    /**
     * Gets the value of the getComprehensiveMotorPremiumResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetComprehensiveMotorPremiumResult() {
        return getComprehensiveMotorPremiumResult;
    }

    /**
     * Sets the value of the getComprehensiveMotorPremiumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetComprehensiveMotorPremiumResult(String value) {
        this.getComprehensiveMotorPremiumResult = value;
    }

}
