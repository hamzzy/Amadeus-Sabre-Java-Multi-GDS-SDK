
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuleText" type="{http://epowerv5.amadeus.com.tr/WS}RuleInfosDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInfos", propOrder = {
    "categoryType",
    "ruleText"
})
public class RuleInfos {

    @XmlElement(name = "CategoryType")
    protected String categoryType;
    @XmlElement(name = "RuleText")
    protected List<RuleInfosDetails> ruleText;

    /**
     * Gets the value of the categoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * Sets the value of the categoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryType(String value) {
        this.categoryType = value;
    }

    /**
     * Gets the value of the ruleText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleInfosDetails }
     * 
     * 
     */
    public List<RuleInfosDetails> getRuleText() {
        if (ruleText == null) {
            ruleText = new ArrayList<RuleInfosDetails>();
        }
        return this.ruleText;
    }

}
