
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
 *         &lt;element name="OTA_HotelAvailRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_HotelAvailRQ" minOccurs="0"/>
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
    "otaHotelAvailRQ"
})
@XmlRootElement(name = "SearchHotelRooms")
public class SearchHotelRooms {

    @XmlElement(name = "OTA_HotelAvailRQ")
    protected OTAHotelAvailRQ otaHotelAvailRQ;

    /**
     * Gets the value of the otaHotelAvailRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRQ }
     *     
     */
    public OTAHotelAvailRQ getOTAHotelAvailRQ() {
        return otaHotelAvailRQ;
    }

    /**
     * Sets the value of the otaHotelAvailRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRQ }
     *     
     */
    public void setOTAHotelAvailRQ(OTAHotelAvailRQ value) {
        this.otaHotelAvailRQ = value;
    }

}
