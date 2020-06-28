
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
 *         &lt;element name="OTA_HotelSearchRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_HotelSearchRS" minOccurs="0"/>
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
    "otaHotelSearchRS"
})
@XmlRootElement(name = "SearchHotelResponse")
public class SearchHotelResponse {

    @XmlElement(name = "OTA_HotelSearchRS")
    protected OTAHotelSearchRS otaHotelSearchRS;

    /**
     * Gets the value of the otaHotelSearchRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelSearchRS }
     *     
     */
    public OTAHotelSearchRS getOTAHotelSearchRS() {
        return otaHotelSearchRS;
    }

    /**
     * Sets the value of the otaHotelSearchRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelSearchRS }
     *     
     */
    public void setOTAHotelSearchRS(OTAHotelSearchRS value) {
        this.otaHotelSearchRS = value;
    }

}
