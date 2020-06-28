
package wsimport.lib.amadeus.wshotelavail;

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
 *         &lt;element name="OTA_HotelAvailRS" type="{http://traveltalk.com/wsHotelAvail}OTA_HotelAvailRS" minOccurs="0"/>
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
    "otaHotelAvailRS"
})
@XmlRootElement(name = "wmHotelAvailResponse")
public class WmHotelAvailResponse {

    @XmlElement(name = "OTA_HotelAvailRS")
    protected OTAHotelAvailRS otaHotelAvailRS;

    /**
     * Gets the value of the otaHotelAvailRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRS }
     *     
     */
    public OTAHotelAvailRS getOTAHotelAvailRS() {
        return otaHotelAvailRS;
    }

    /**
     * Sets the value of the otaHotelAvailRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRS }
     *     
     */
    public void setOTAHotelAvailRS(OTAHotelAvailRS value) {
        this.otaHotelAvailRS = value;
    }

}
