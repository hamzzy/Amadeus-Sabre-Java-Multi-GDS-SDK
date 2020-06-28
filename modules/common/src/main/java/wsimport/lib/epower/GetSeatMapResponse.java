
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
 *         &lt;element name="OTA_AirSeatMapRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirSeatMapRS" minOccurs="0"/>
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
    "otaAirSeatMapRS"
})
@XmlRootElement(name = "GetSeatMapResponse")
public class GetSeatMapResponse {

    @XmlElement(name = "OTA_AirSeatMapRS")
    protected OTAAirSeatMapRS otaAirSeatMapRS;

    /**
     * Gets the value of the otaAirSeatMapRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirSeatMapRS }
     *     
     */
    public OTAAirSeatMapRS getOTAAirSeatMapRS() {
        return otaAirSeatMapRS;
    }

    /**
     * Sets the value of the otaAirSeatMapRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirSeatMapRS }
     *     
     */
    public void setOTAAirSeatMapRS(OTAAirSeatMapRS value) {
        this.otaAirSeatMapRS = value;
    }

}
