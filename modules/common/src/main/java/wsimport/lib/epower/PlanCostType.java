
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanCostType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanCostType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasePremium" type="{http://epowerv5.amadeus.com.tr/WS}PlanCostTypeBasePremium" minOccurs="0"/>
 *         &lt;element name="Charges" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFeeType1" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MarkupAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanCostType", propOrder = {
    "basePremium",
    "charges"
})
public class PlanCostType {

    @XmlElement(name = "BasePremium")
    protected PlanCostTypeBasePremium basePremium;
    @XmlElement(name = "Charges")
    protected ArrayOfFeeType1 charges;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "MarkupAmount")
    protected BigDecimal markupAmount;

    /**
     * Gets the value of the basePremium property.
     * 
     * @return
     *     possible object is
     *     {@link PlanCostTypeBasePremium }
     *     
     */
    public PlanCostTypeBasePremium getBasePremium() {
        return basePremium;
    }

    /**
     * Sets the value of the basePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanCostTypeBasePremium }
     *     
     */
    public void setBasePremium(PlanCostTypeBasePremium value) {
        this.basePremium = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeType1 }
     *     
     */
    public ArrayOfFeeType1 getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeType1 }
     *     
     */
    public void setCharges(ArrayOfFeeType1 value) {
        this.charges = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the markupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkupAmount() {
        return markupAmount;
    }

    /**
     * Sets the value of the markupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkupAmount(BigDecimal value) {
        this.markupAmount = value;
    }

}
