
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
 *         &lt;element name="OTA_AirCheckETicketRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirCheckETicketRS" minOccurs="0"/>
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
    "otaAirCheckETicketRS"
})
@XmlRootElement(name = "CheckETicketResponse")
public class CheckETicketResponse {

    @XmlElement(name = "OTA_AirCheckETicketRS")
    protected OTAAirCheckETicketRS otaAirCheckETicketRS;

    /**
     * Gets the value of the otaAirCheckETicketRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirCheckETicketRS }
     *     
     */
    public OTAAirCheckETicketRS getOTAAirCheckETicketRS() {
        return otaAirCheckETicketRS;
    }

    /**
     * Sets the value of the otaAirCheckETicketRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirCheckETicketRS }
     *     
     */
    public void setOTAAirCheckETicketRS(OTAAirCheckETicketRS value) {
        this.otaAirCheckETicketRS = value;
    }

}
