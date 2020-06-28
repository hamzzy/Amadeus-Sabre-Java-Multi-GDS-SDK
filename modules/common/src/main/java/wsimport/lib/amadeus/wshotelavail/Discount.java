
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Discount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Taxes" type="{http://traveltalk.com/wsHotelAvail}Taxes" minOccurs="0"/>
 *         &lt;element name="DiscountReason" type="{http://traveltalk.com/wsHotelAvail}DiscountReason" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AmountBeforeTax" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="AmountAfterTax" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discount", propOrder = {
    "taxes",
    "discountReason"
})
public class Discount {

    @XmlElement(name = "Taxes")
    protected Taxes taxes;
    @XmlElement(name = "DiscountReason")
    protected DiscountReason discountReason;
    @XmlAttribute(name = "AmountBeforeTax")
    protected Double amountBeforeTax;
    @XmlAttribute(name = "AmountAfterTax")
    protected Double amountAfterTax;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    protected Integer decimalPlaces;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "Percent")
    protected Double percent;
    @XmlAttribute(name = "DiscountCode")
    protected String discountCode;

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link Taxes }
     *     
     */
    public Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxes }
     *     
     */
    public void setTaxes(Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the discountReason property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountReason }
     *     
     */
    public DiscountReason getDiscountReason() {
        return discountReason;
    }

    /**
     * Sets the value of the discountReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountReason }
     *     
     */
    public void setDiscountReason(DiscountReason value) {
        this.discountReason = value;
    }

    /**
     * Gets the value of the amountBeforeTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountBeforeTax() {
        return amountBeforeTax;
    }

    /**
     * Sets the value of the amountBeforeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountBeforeTax(Double value) {
        this.amountBeforeTax = value;
    }

    /**
     * Gets the value of the amountAfterTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountAfterTax() {
        return amountAfterTax;
    }

    /**
     * Sets the value of the amountAfterTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountAfterTax(Double value) {
        this.amountAfterTax = value;
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
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimalPlaces(Integer value) {
        this.decimalPlaces = value;
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
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent(Double value) {
        this.percent = value;
    }

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

}
