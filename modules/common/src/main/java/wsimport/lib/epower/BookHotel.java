
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
 *         &lt;element name="OTA_HotelResRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_HotelResRQ" minOccurs="0"/>
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
    "otaHotelResRQ"
})
@XmlRootElement(name = "BookHotel")
public class BookHotel {

    @XmlElement(name = "OTA_HotelResRQ")
    protected OTAHotelResRQ otaHotelResRQ;

    /**
     * Gets the value of the otaHotelResRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelResRQ }
     *     
     */
    public OTAHotelResRQ getOTAHotelResRQ() {
        return otaHotelResRQ;
    }

    /**
     * Sets the value of the otaHotelResRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRQ }
     *     
     */
    public void setOTAHotelResRQ(OTAHotelResRQ value) {
        this.otaHotelResRQ = value;
    }

}
