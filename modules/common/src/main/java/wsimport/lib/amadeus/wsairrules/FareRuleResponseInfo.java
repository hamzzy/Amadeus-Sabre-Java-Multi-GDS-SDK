
package wsimport.lib.amadeus.wsairrules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareRuleResponseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRuleResponseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareRuleInfo" type="{http://traveltalk.com/wsAirRules}FareRuleInfo" minOccurs="0"/>
 *         &lt;element name="FareRules" type="{http://traveltalk.com/wsAirRules}FareRules" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRuleResponseInfo", propOrder = {
    "fareRuleInfo",
    "fareRules"
})
public class FareRuleResponseInfo {

    @XmlElement(name = "FareRuleInfo")
    protected FareRuleInfo fareRuleInfo;
    @XmlElement(name = "FareRules")
    protected FareRules fareRules;

    /**
     * Gets the value of the fareRuleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareRuleInfo }
     *     
     */
    public FareRuleInfo getFareRuleInfo() {
        return fareRuleInfo;
    }

    /**
     * Sets the value of the fareRuleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRuleInfo }
     *     
     */
    public void setFareRuleInfo(FareRuleInfo value) {
        this.fareRuleInfo = value;
    }

    /**
     * Gets the value of the fareRules property.
     * 
     * @return
     *     possible object is
     *     {@link FareRules }
     *     
     */
    public FareRules getFareRules() {
        return fareRules;
    }

    /**
     * Sets the value of the fareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRules }
     *     
     */
    public void setFareRules(FareRules value) {
        this.fareRules = value;
    }

}
