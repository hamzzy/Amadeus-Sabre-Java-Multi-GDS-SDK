
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
 *         &lt;element name="OTA_AirRulesRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirRulesRQ" minOccurs="0"/>
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
    "otaAirRulesRQ"
})
@XmlRootElement(name = "GetFlightRules")
public class GetFlightRules {

    @XmlTransient
    protected String sessionId;

    @XmlElement(name = "OTA_AirRulesRQ")
    protected OTAAirRulesRQ otaAirRulesRQ;

    /**
     * Gets the value of the otaAirRulesRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirRulesRQ }
     *     
     */
    public OTAAirRulesRQ getOTAAirRulesRQ() {
        return otaAirRulesRQ;
    }

    /**
     * Sets the value of the otaAirRulesRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirRulesRQ }
     *     
     */
    public void setOTAAirRulesRQ(OTAAirRulesRQ value) {
        this.otaAirRulesRQ = value;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId () {
        return sessionId;
    }

}
