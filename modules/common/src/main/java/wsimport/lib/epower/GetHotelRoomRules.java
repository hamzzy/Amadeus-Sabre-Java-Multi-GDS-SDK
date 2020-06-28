
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
 *         &lt;element name="OTA_HotelRoomRuleRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_HotelRoomRuleRQ" minOccurs="0"/>
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
    "otaHotelRoomRuleRQ"
})
@XmlRootElement(name = "GetHotelRoomRules")
public class GetHotelRoomRules {

    @XmlElement(name = "OTA_HotelRoomRuleRQ")
    protected OTAHotelRoomRuleRQ otaHotelRoomRuleRQ;

    /**
     * Gets the value of the otaHotelRoomRuleRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelRoomRuleRQ }
     *     
     */
    public OTAHotelRoomRuleRQ getOTAHotelRoomRuleRQ() {
        return otaHotelRoomRuleRQ;
    }

    /**
     * Sets the value of the otaHotelRoomRuleRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelRoomRuleRQ }
     *     
     */
    public void setOTAHotelRoomRuleRQ(OTAHotelRoomRuleRQ value) {
        this.otaHotelRoomRuleRQ = value;
    }

}
