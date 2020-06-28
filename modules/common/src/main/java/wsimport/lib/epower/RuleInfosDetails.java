
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleInfosDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInfosDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RuleTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RuleText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RuleDataList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInfosDetails")
public class RuleInfosDetails {

    @XmlAttribute(name = "RuleTitle")
    protected String ruleTitle;
    @XmlAttribute(name = "RuleText")
    protected String ruleText;
    @XmlAttribute(name = "RuleDataList")
    protected String ruleDataList;

    /**
     * Gets the value of the ruleTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleTitle() {
        return ruleTitle;
    }

    /**
     * Sets the value of the ruleTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleTitle(String value) {
        this.ruleTitle = value;
    }

    /**
     * Gets the value of the ruleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleText() {
        return ruleText;
    }

    /**
     * Sets the value of the ruleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleText(String value) {
        this.ruleText = value;
    }

    /**
     * Gets the value of the ruleDataList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDataList() {
        return ruleDataList;
    }

    /**
     * Sets the value of the ruleDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDataList(String value) {
        this.ruleDataList = value;
    }

}
