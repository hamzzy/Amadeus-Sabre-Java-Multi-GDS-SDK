
package wsimport.lib.epower;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="OTA_AirCheckETicketRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirCheckETicketRQ" minOccurs="0"/>
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
    "otaAirCheckETicketRQ"
})
@XmlRootElement(name = "CheckETicket")
public class CheckETicket {

    @XmlElement(name = "OTA_AirCheckETicketRQ")
    protected OTAAirCheckETicketRQ otaAirCheckETicketRQ;

    @XmlTransient
    protected String sessionId;

    /**
     * Gets the value of the otaAirCheckETicketRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirCheckETicketRQ }
     *     
     */
    public OTAAirCheckETicketRQ getOTAAirCheckETicketRQ() {
        return otaAirCheckETicketRQ;
    }

    /**
     * Sets the value of the otaAirCheckETicketRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirCheckETicketRQ }
     *     
     */
    public void setOTAAirCheckETicketRQ(OTAAirCheckETicketRQ value) {
        this.otaAirCheckETicketRQ = value;
    }


    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

}
