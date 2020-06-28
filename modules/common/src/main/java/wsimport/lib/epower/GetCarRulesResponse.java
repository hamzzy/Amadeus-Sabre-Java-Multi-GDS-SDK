
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
 *         &lt;element name="OTA_VehRateRuleRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRS" minOccurs="0"/>
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
    "otaVehRateRuleRS"
})
@XmlRootElement(name = "GetCarRulesResponse")
public class GetCarRulesResponse {

    @XmlElement(name = "OTA_VehRateRuleRS")
    protected OTAVehRateRuleRS otaVehRateRuleRS;

    /**
     * Gets the value of the otaVehRateRuleRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRS }
     *     
     */
    public OTAVehRateRuleRS getOTAVehRateRuleRS() {
        return otaVehRateRuleRS;
    }

    /**
     * Sets the value of the otaVehRateRuleRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRS }
     *     
     */
    public void setOTAVehRateRuleRS(OTAVehRateRuleRS value) {
        this.otaVehRateRuleRS = value;
    }

}
