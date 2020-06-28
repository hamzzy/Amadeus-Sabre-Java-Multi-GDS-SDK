
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
 *         &lt;element name="OTA_VehAvailRateRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehAvailRateRS" minOccurs="0"/>
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
    "otaVehAvailRateRS"
})
@XmlRootElement(name = "SearchCarVendorResponse")
public class SearchCarVendorResponse {

    @XmlElement(name = "OTA_VehAvailRateRS")
    protected OTAVehAvailRateRS otaVehAvailRateRS;

    /**
     * Gets the value of the otaVehAvailRateRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehAvailRateRS }
     *     
     */
    public OTAVehAvailRateRS getOTAVehAvailRateRS() {
        return otaVehAvailRateRS;
    }

    /**
     * Sets the value of the otaVehAvailRateRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehAvailRateRS }
     *     
     */
    public void setOTAVehAvailRateRS(OTAVehAvailRateRS value) {
        this.otaVehAvailRateRS = value;
    }

}
