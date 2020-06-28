
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
 *         &lt;element name="OTA_AirRulesRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirRulesRS" minOccurs="0"/>
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
    "otaAirRulesRS"
})
@XmlRootElement(name = "GetFlightRulesResponse")
public class GetFlightRulesResponse {

    @XmlElement(name = "OTA_AirRulesRS")
    protected OTAAirRulesRS otaAirRulesRS;

    /**
     * Gets the value of the otaAirRulesRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirRulesRS }
     *     
     */
    public OTAAirRulesRS getOTAAirRulesRS() {
        return otaAirRulesRS;
    }

    /**
     * Sets the value of the otaAirRulesRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirRulesRS }
     *     
     */
    public void setOTAAirRulesRS(OTAAirRulesRS value) {
        this.otaAirRulesRS = value;
    }

}
