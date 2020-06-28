
package wsimport.lib.sabre.bfm.sapt;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryPriceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryPriceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFare" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType"/>
 *         &lt;element name="EquivFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
 *                 &lt;attribute name="EffectivePriceDeviation" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalFare" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType"/>
 *         &lt;element name="TotalMileage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LegIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="FlightIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryPriceInformation", propOrder = {
    "baseFare",
    "equivFare",
    "taxes",
    "totalFare",
    "totalMileage",
    "segment"
})
@XmlSeeAlso({
    FareType.TPAExtensions.Legs.Leg.class,
    FareType.TPAExtensions.FareComponents.FareComponent.class
})
public class SummaryPriceInformation {

    @XmlElement(name = "BaseFare", required = true)
    protected CurrencyAmountType baseFare;
    @XmlElement(name = "EquivFare")
    protected EquivFare equivFare;
    @XmlElement(name = "Taxes")
    protected Taxes taxes;
    @XmlElement(name = "TotalFare", required = true)
    protected CurrencyAmountType totalFare;
    @XmlElement(name = "TotalMileage")
    protected TotalMileage totalMileage;
    @XmlElement(name = "Segment")
    protected List<Segment> segment;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setBaseFare(CurrencyAmountType value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the equivFare property.
     * 
     * @return
     *     possible object is
     *     {@link EquivFare }
     *     
     */
    public EquivFare getEquivFare() {
        return equivFare;
    }

    /**
     * Sets the value of the equivFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivFare }
     *     
     */
    public void setEquivFare(EquivFare value) {
        this.equivFare = value;
    }

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
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotalFare(CurrencyAmountType value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the totalMileage property.
     * 
     * @return
     *     possible object is
     *     {@link TotalMileage }
     *     
     */
    public TotalMileage getTotalMileage() {
        return totalMileage;
    }

    /**
     * Sets the value of the totalMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalMileage }
     *     
     */
    public void setTotalMileage(TotalMileage value) {
        this.totalMileage = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segment }
     * 
     * 
     */
    public List<Segment> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment>();
        }
        return this.segment;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
     *       &lt;attribute name="EffectivePriceDeviation" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EquivFare
        extends CurrencyAmountType
    {

        @XmlAttribute(name = "EffectivePriceDeviation")
        protected BigDecimal effectivePriceDeviation;

        /**
         * Gets the value of the effectivePriceDeviation property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEffectivePriceDeviation() {
            return effectivePriceDeviation;
        }

        /**
         * Sets the value of the effectivePriceDeviation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEffectivePriceDeviation(BigDecimal value) {
            this.effectivePriceDeviation = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="LegIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="FlightIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Segment {

        @XmlAttribute(name = "LegIndex", required = true)
        protected int legIndex;
        @XmlAttribute(name = "FlightIndex", required = true)
        protected int flightIndex;

        /**
         * Gets the value of the legIndex property.
         * 
         */
        public int getLegIndex() {
            return legIndex;
        }

        /**
         * Sets the value of the legIndex property.
         * 
         */
        public void setLegIndex(int value) {
            this.legIndex = value;
        }

        /**
         * Gets the value of the flightIndex property.
         * 
         */
        public int getFlightIndex() {
            return flightIndex;
        }

        /**
         * Sets the value of the flightIndex property.
         * 
         */
        public void setFlightIndex(int value) {
            this.flightIndex = value;
        }

    }


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
     *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tax"
    })
    public static class Taxes {

        @XmlElement(name = "Tax", required = true)
        protected AirTaxType tax;

        /**
         * Gets the value of the tax property.
         * 
         * @return
         *     possible object is
         *     {@link AirTaxType }
         *     
         */
        public AirTaxType getTax() {
            return tax;
        }

        /**
         * Sets the value of the tax property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirTaxType }
         *     
         */
        public void setTax(AirTaxType value) {
            this.tax = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalMileage {

        @XmlAttribute(name = "Amount", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String amount;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
            this.amount = value;
        }

    }

}
