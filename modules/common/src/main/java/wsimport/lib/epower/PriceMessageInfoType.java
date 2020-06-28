
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceMessageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceMessageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceMessageInfo" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfMiniRulesPriceMessages" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceMessageInfoType", propOrder = {
    "priceMessageInfo"
})
public class PriceMessageInfoType {

    @XmlElement(name = "PriceMessageInfo")
    protected ArrayOfMiniRulesPriceMessages priceMessageInfo;

    /**
     * Gets the value of the priceMessageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMiniRulesPriceMessages }
     *     
     */
    public ArrayOfMiniRulesPriceMessages getPriceMessageInfo() {
        return priceMessageInfo;
    }

    /**
     * Sets the value of the priceMessageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMiniRulesPriceMessages }
     *     
     */
    public void setPriceMessageInfo(ArrayOfMiniRulesPriceMessages value) {
        this.priceMessageInfo = value;
    }

}
