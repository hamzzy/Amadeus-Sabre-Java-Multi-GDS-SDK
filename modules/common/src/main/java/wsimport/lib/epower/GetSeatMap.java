
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
 *         &lt;element name="OTA_AirSeatMapRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirSeatMapRQ" minOccurs="0"/>
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
    "otaAirSeatMapRQ"
})
@XmlRootElement(name = "GetSeatMap")
public class GetSeatMap {

    @XmlElement(name = "OTA_AirSeatMapRQ")
    protected OTAAirSeatMapRQ otaAirSeatMapRQ;

    /**
     * Gets the value of the otaAirSeatMapRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirSeatMapRQ }
     *     
     */
    public OTAAirSeatMapRQ getOTAAirSeatMapRQ() {
        return otaAirSeatMapRQ;
    }

    /**
     * Sets the value of the otaAirSeatMapRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirSeatMapRQ }
     *     
     */
    public void setOTAAirSeatMapRQ(OTAAirSeatMapRQ value) {
        this.otaAirSeatMapRQ = value;
    }

}
