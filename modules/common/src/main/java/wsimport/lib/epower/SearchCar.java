
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
 *         &lt;element name="OTA_VehAvailRateRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehAvailRateRQ" minOccurs="0"/>
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
    "otaVehAvailRateRQ"
})
@XmlRootElement(name = "SearchCar")
public class SearchCar {

    @XmlElement(name = "OTA_VehAvailRateRQ")
    protected OTAVehAvailRateRQ otaVehAvailRateRQ;

    /**
     * Gets the value of the otaVehAvailRateRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehAvailRateRQ }
     *     
     */
    public OTAVehAvailRateRQ getOTAVehAvailRateRQ() {
        return otaVehAvailRateRQ;
    }

    /**
     * Sets the value of the otaVehAvailRateRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehAvailRateRQ }
     *     
     */
    public void setOTAVehAvailRateRQ(OTAVehAvailRateRQ value) {
        this.otaVehAvailRateRQ = value;
    }

}
