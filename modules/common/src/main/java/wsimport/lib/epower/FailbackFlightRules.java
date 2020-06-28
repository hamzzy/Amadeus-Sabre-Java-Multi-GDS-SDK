
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailbackFlightRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailbackFlightRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceMessageInfo" type="{http://epowerv5.amadeus.com.tr/WS}PriceMessageInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailbackFlightRules", propOrder = {
    "priceMessageInfo"
})
public class FailbackFlightRules {

    @XmlElement(name = "PriceMessageInfo")
    protected PriceMessageInfoType priceMessageInfo;

    /**
     * Gets the value of the priceMessageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMessageInfoType }
     *     
     */
    public PriceMessageInfoType getPriceMessageInfo() {
        return priceMessageInfo;
    }

    /**
     * Sets the value of the priceMessageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMessageInfoType }
     *     
     */
    public void setPriceMessageInfo(PriceMessageInfoType value) {
        this.priceMessageInfo = value;
    }

}
