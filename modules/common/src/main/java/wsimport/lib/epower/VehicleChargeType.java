
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleChargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxAmounts" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleChargeTypeTaxAmount1" minOccurs="0"/>
 *         &lt;element name="MinMax" type="{http://epowerv5.amadeus.com.tr/WS}VehicleChargeTypeMinMax" minOccurs="0"/>
 *         &lt;element name="Calculation" type="{http://epowerv5.amadeus.com.tr/WS}VehicleChargeTypeCalculation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MarkupAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IncludedInRate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IncludedInEstTotalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleChargeType", propOrder = {
    "taxAmounts",
    "minMax",
    "calculation"
})
@XmlSeeAlso({
    VehicleChargePurposeType.class
})
public class VehicleChargeType {

    @XmlElement(name = "TaxAmounts")
    protected ArrayOfVehicleChargeTypeTaxAmount1 taxAmounts;
    @XmlElement(name = "MinMax")
    protected VehicleChargeTypeMinMax minMax;
    @XmlElement(name = "Calculation")
    protected List<VehicleChargeTypeCalculation> calculation;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "FareType")
    protected String fareType;
    @XmlAttribute(name = "FareCategory")
    protected String fareCategory;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "MarkupAmount")
    protected BigDecimal markupAmount;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "IncludedInRate")
    protected Boolean includedInRate;
    @XmlAttribute(name = "IncludedInEstTotalInd")
    protected Boolean includedInEstTotalInd;

    /**
     * Gets the value of the taxAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleChargeTypeTaxAmount1 }
     *     
     */
    public ArrayOfVehicleChargeTypeTaxAmount1 getTaxAmounts() {
        return taxAmounts;
    }

    /**
     * Sets the value of the taxAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleChargeTypeTaxAmount1 }
     *     
     */
    public void setTaxAmounts(ArrayOfVehicleChargeTypeTaxAmount1 value) {
        this.taxAmounts = value;
    }

    /**
     * Gets the value of the minMax property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargeTypeMinMax }
     *     
     */
    public VehicleChargeTypeMinMax getMinMax() {
        return minMax;
    }

    /**
     * Sets the value of the minMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargeTypeMinMax }
     *     
     */
    public void setMinMax(VehicleChargeTypeMinMax value) {
        this.minMax = value;
    }

    /**
     * Gets the value of the calculation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleChargeTypeCalculation }
     * 
     * 
     */
    public List<VehicleChargeTypeCalculation> getCalculation() {
        if (calculation == null) {
            calculation = new ArrayList<VehicleChargeTypeCalculation>();
        }
        return this.calculation;
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
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

    /**
     * Gets the value of the fareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCategory() {
        return fareCategory;
    }

    /**
     * Sets the value of the fareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCategory(String value) {
        this.fareCategory = value;
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

    /**
     * Gets the value of the taxInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInclusive() {
        return taxInclusive;
    }

    /**
     * Sets the value of the taxInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInclusive(Boolean value) {
        this.taxInclusive = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the guaranteedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * Sets the value of the guaranteedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
    }

    /**
     * Gets the value of the includedInRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludedInRate() {
        if (includedInRate == null) {
            return false;
        } else {
            return includedInRate;
        }
    }

    /**
     * Sets the value of the includedInRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludedInRate(Boolean value) {
        this.includedInRate = value;
    }

    /**
     * Gets the value of the includedInEstTotalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludedInEstTotalInd() {
        return includedInEstTotalInd;
    }

    /**
     * Sets the value of the includedInEstTotalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludedInEstTotalInd(Boolean value) {
        this.includedInEstTotalInd = value;
    }

}
