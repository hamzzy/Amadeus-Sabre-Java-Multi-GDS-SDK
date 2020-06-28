
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
 *         &lt;element name="APISRulesRQ" type="{http://epowerv5.amadeus.com.tr/WS}APISRulesRQ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "apisRulesRQ"
})
@XmlRootElement(name = "GetAPISRules")
public class GetAPISRules {

    @XmlTransient
    protected String sessionId;

    @XmlElement(name = "APISRulesRQ")
    protected APISRulesRQ apisRulesRQ;

    /**
     * Gets the value of the apisRulesRQ property.
     *
     * @return possible object is
     * {@link APISRulesRQ }
     */
    public APISRulesRQ getAPISRulesRQ() {
        return apisRulesRQ;
    }

    /**
     * Sets the value of the apisRulesRQ property.
     *
     * @param value allowed object is
     *              {@link APISRulesRQ }
     */
    public void setAPISRulesRQ(APISRulesRQ value) {
        this.apisRulesRQ = value;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
