
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareRuleResponseInfoTypeFareRuleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRuleResponseInfoTypeFareRuleInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}FareInfoType">
 *       &lt;sequence>
 *         &lt;element name="FareRules" type="{http://epowerv5.amadeus.com.tr/WS}FormattedTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LanguageRequested" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LanguageReturned" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRuleResponseInfoTypeFareRuleInfo", propOrder = {
    "fareRules"
})
public class FareRuleResponseInfoTypeFareRuleInfo
    extends FareInfoType
{

    @XmlElement(name = "FareRules")
    protected FormattedTextType fareRules;
    @XmlAttribute(name = "LanguageRequested")
    protected String languageRequested;
    @XmlAttribute(name = "LanguageReturned")
    protected String languageReturned;

    /**
     * Gets the value of the fareRules property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextType }
     *     
     */
    public FormattedTextType getFareRules() {
        return fareRules;
    }

    /**
     * Sets the value of the fareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextType }
     *     
     */
    public void setFareRules(FormattedTextType value) {
        this.fareRules = value;
    }

    /**
     * Gets the value of the languageRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageRequested() {
        return languageRequested;
    }

    /**
     * Sets the value of the languageRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageRequested(String value) {
        this.languageRequested = value;
    }

    /**
     * Gets the value of the languageReturned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageReturned() {
        return languageReturned;
    }

    /**
     * Sets the value of the languageReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageReturned(String value) {
        this.languageReturned = value;
    }

}
