
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
 *         &lt;element name="OTA_VehResRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehResRS" minOccurs="0"/>
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
    "otaVehResRS"
})
@XmlRootElement(name = "GetCarPNRResponse")
public class GetCarPNRResponse {

    @XmlElement(name = "OTA_VehResRS")
    protected OTAVehResRS otaVehResRS;

    /**
     * Gets the value of the otaVehResRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehResRS }
     *     
     */
    public OTAVehResRS getOTAVehResRS() {
        return otaVehResRS;
    }

    /**
     * Sets the value of the otaVehResRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehResRS }
     *     
     */
    public void setOTAVehResRS(OTAVehResRS value) {
        this.otaVehResRS = value;
    }

}
