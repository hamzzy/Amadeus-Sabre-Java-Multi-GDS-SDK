
package wsimport.lib.axamansard;

import java.math.BigDecimal;
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
 *         &lt;element name="GetThridPartyPremiumResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "getThridPartyPremiumResult"
})
@XmlRootElement(name = "GetThridPartyPremiumResponse")
public class GetThridPartyPremiumResponse {

    @XmlElement(name = "GetThridPartyPremiumResult", required = true)
    protected BigDecimal getThridPartyPremiumResult;

    /**
     * Gets the value of the getThridPartyPremiumResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGetThridPartyPremiumResult() {
        return getThridPartyPremiumResult;
    }

    /**
     * Sets the value of the getThridPartyPremiumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGetThridPartyPremiumResult(BigDecimal value) {
        this.getThridPartyPremiumResult = value;
    }

}
