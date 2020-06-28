
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirRulesRQRuleReqInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirRulesRQRuleReqInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}FareInfoType">
 *       &lt;sequence>
 *         &lt;element name="SubSection" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirRulesRQRuleReqInfoSubSection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LanguageRequested" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirRulesRQRuleReqInfo", propOrder = {
    "subSection"
})
public class OTAAirRulesRQRuleReqInfo
    extends FareInfoType
{

    @XmlElement(name = "SubSection")
    protected List<OTAAirRulesRQRuleReqInfoSubSection> subSection;
    @XmlAttribute(name = "LanguageRequested")
    protected String languageRequested;

    /**
     * Gets the value of the subSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAAirRulesRQRuleReqInfoSubSection }
     * 
     * 
     */
    public List<OTAAirRulesRQRuleReqInfoSubSection> getSubSection() {
        if (subSection == null) {
            subSection = new ArrayList<OTAAirRulesRQRuleReqInfoSubSection>();
        }
        return this.subSection;
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

}
