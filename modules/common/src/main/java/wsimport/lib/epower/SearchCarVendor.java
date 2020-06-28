
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
 *         &lt;element name="OTA_VehAvailVendorRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehAvailVendorRQ" minOccurs="0"/>
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
    "otaVehAvailVendorRQ"
})
@XmlRootElement(name = "SearchCarVendor")
public class SearchCarVendor {

    @XmlElement(name = "OTA_VehAvailVendorRQ")
    protected OTAVehAvailVendorRQ otaVehAvailVendorRQ;

    /**
     * Gets the value of the otaVehAvailVendorRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehAvailVendorRQ }
     *     
     */
    public OTAVehAvailVendorRQ getOTAVehAvailVendorRQ() {
        return otaVehAvailVendorRQ;
    }

    /**
     * Sets the value of the otaVehAvailVendorRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehAvailVendorRQ }
     *     
     */
    public void setOTAVehAvailVendorRQ(OTAVehAvailVendorRQ value) {
        this.otaVehAvailVendorRQ = value;
    }

}
