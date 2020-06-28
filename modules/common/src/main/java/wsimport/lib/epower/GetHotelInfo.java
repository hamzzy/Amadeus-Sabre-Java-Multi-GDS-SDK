
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
 *         &lt;element name="OTA_HotelInfoRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_HotelInfoRQ" minOccurs="0"/>
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
    "otaHotelInfoRQ"
})
@XmlRootElement(name = "GetHotelInfo")
public class GetHotelInfo {

    @XmlElement(name = "OTA_HotelInfoRQ")
    protected OTAHotelInfoRQ otaHotelInfoRQ;

    /**
     * Gets the value of the otaHotelInfoRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelInfoRQ }
     *     
     */
    public OTAHotelInfoRQ getOTAHotelInfoRQ() {
        return otaHotelInfoRQ;
    }

    /**
     * Sets the value of the otaHotelInfoRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelInfoRQ }
     *     
     */
    public void setOTAHotelInfoRQ(OTAHotelInfoRQ value) {
        this.otaHotelInfoRQ = value;
    }

}
