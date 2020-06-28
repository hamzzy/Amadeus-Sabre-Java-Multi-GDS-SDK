
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
 *         &lt;element name="OTA_HotelResRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_HotelResRS" minOccurs="0"/>
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
    "otaHotelResRS"
})
@XmlRootElement(name = "BookHotelResponse")
public class BookHotelResponse {

    @XmlElement(name = "OTA_HotelResRS")
    protected OTAHotelResRS otaHotelResRS;

    /**
     * Gets the value of the otaHotelResRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelResRS }
     *     
     */
    public OTAHotelResRS getOTAHotelResRS() {
        return otaHotelResRS;
    }

    /**
     * Sets the value of the otaHotelResRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRS }
     *     
     */
    public void setOTAHotelResRS(OTAHotelResRS value) {
        this.otaHotelResRS = value;
    }

}
