
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_VehRateRuleRSRateRulesPickupReturnRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehRateRuleRSRateRulesPickupReturnRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarliestPickup" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesPickupReturnRulesEarliestPickup" minOccurs="0"/>
 *         &lt;element name="LatestPickup" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesPickupReturnRulesLatestPickup" minOccurs="0"/>
 *         &lt;element name="LatestReturn" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesPickupReturnRulesLatestReturn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehRateRuleRSRateRulesPickupReturnRules", propOrder = {
    "earliestPickup",
    "latestPickup",
    "latestReturn"
})
public class OTAVehRateRuleRSRateRulesPickupReturnRules {

    @XmlElement(name = "EarliestPickup")
    protected OTAVehRateRuleRSRateRulesPickupReturnRulesEarliestPickup earliestPickup;
    @XmlElement(name = "LatestPickup")
    protected OTAVehRateRuleRSRateRulesPickupReturnRulesLatestPickup latestPickup;
    @XmlElement(name = "LatestReturn")
    protected OTAVehRateRuleRSRateRulesPickupReturnRulesLatestReturn latestReturn;

    /**
     * Gets the value of the earliestPickup property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRSRateRulesPickupReturnRulesEarliestPickup }
     *     
     */
    public OTAVehRateRuleRSRateRulesPickupReturnRulesEarliestPickup getEarliestPickup() {
        return earliestPickup;
    }

    /**
     * Sets the value of the earliestPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSRateRulesPickupReturnRulesEarliestPickup }
     *     
     */
    public void setEarliestPickup(OTAVehRateRuleRSRateRulesPickupReturnRulesEarliestPickup value) {
        this.earliestPickup = value;
    }

    /**
     * Gets the value of the latestPickup property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRSRateRulesPickupReturnRulesLatestPickup }
     *     
     */
    public OTAVehRateRuleRSRateRulesPickupReturnRulesLatestPickup getLatestPickup() {
        return latestPickup;
    }

    /**
     * Sets the value of the latestPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSRateRulesPickupReturnRulesLatestPickup }
     *     
     */
    public void setLatestPickup(OTAVehRateRuleRSRateRulesPickupReturnRulesLatestPickup value) {
        this.latestPickup = value;
    }

    /**
     * Gets the value of the latestReturn property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRSRateRulesPickupReturnRulesLatestReturn }
     *     
     */
    public OTAVehRateRuleRSRateRulesPickupReturnRulesLatestReturn getLatestReturn() {
        return latestReturn;
    }

    /**
     * Sets the value of the latestReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSRateRulesPickupReturnRulesLatestReturn }
     *     
     */
    public void setLatestReturn(OTAVehRateRuleRSRateRulesPickupReturnRulesLatestReturn value) {
        this.latestReturn = value;
    }

}
