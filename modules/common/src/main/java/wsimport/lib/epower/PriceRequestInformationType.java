
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceRequestInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceRequestInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NegotiatedFareCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SecondaryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RebookOption" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="FareQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NegotiatedFaresOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PricingSource" type="{http://epowerv5.amadeus.com.tr/WS}PricingSourceType" />
 *       &lt;attribute name="Reprice" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CabinType" type="{http://epowerv5.amadeus.com.tr/WS}CabinType" />
 *       &lt;attribute name="TicketingCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRequestInformationType", propOrder = {
    "negotiatedFareCode",
    "rebookOption"
})
public class PriceRequestInformationType {

    @XmlElement(name = "NegotiatedFareCode")
    protected List<PriceRequestInformationType.NegotiatedFareCode> negotiatedFareCode;
    @XmlElement(name = "RebookOption")
    protected List<PriceRequestInformationType.RebookOption> rebookOption;
    @XmlAttribute(name = "FareQualifier")
    protected String fareQualifier;
    @XmlAttribute(name = "NegotiatedFaresOnly")
    protected Boolean negotiatedFaresOnly;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "PricingSource")
    protected PricingSourceType pricingSource;
    @XmlAttribute(name = "Reprice")
    protected Boolean reprice;
    @XmlAttribute(name = "CabinType")
    protected CabinType cabinType;
    @XmlAttribute(name = "TicketingCountry")
    protected String ticketingCountry;

    /**
     * Gets the value of the negotiatedFareCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negotiatedFareCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegotiatedFareCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRequestInformationType.NegotiatedFareCode }
     * 
     * 
     */
    public List<PriceRequestInformationType.NegotiatedFareCode> getNegotiatedFareCode() {
        if (negotiatedFareCode == null) {
            negotiatedFareCode = new ArrayList<PriceRequestInformationType.NegotiatedFareCode>();
        }
        return this.negotiatedFareCode;
    }

    /**
     * Gets the value of the rebookOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rebookOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRebookOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRequestInformationType.RebookOption }
     * 
     * 
     */
    public List<PriceRequestInformationType.RebookOption> getRebookOption() {
        if (rebookOption == null) {
            rebookOption = new ArrayList<PriceRequestInformationType.RebookOption>();
        }
        return this.rebookOption;
    }

    /**
     * Gets the value of the fareQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareQualifier() {
        return fareQualifier;
    }

    /**
     * Sets the value of the fareQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareQualifier(String value) {
        this.fareQualifier = value;
    }

    /**
     * Gets the value of the negotiatedFaresOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiatedFaresOnly() {
        return negotiatedFaresOnly;
    }

    /**
     * Sets the value of the negotiatedFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFaresOnly(Boolean value) {
        this.negotiatedFaresOnly = value;
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
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link PricingSourceType }
     *     
     */
    public PricingSourceType getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSourceType }
     *     
     */
    public void setPricingSource(PricingSourceType value) {
        this.pricingSource = value;
    }

    /**
     * Gets the value of the reprice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReprice() {
        return reprice;
    }

    /**
     * Sets the value of the reprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReprice(Boolean value) {
        this.reprice = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinType(CabinType value) {
        this.cabinType = value;
    }

    /**
     * Gets the value of the ticketingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingCountry() {
        return ticketingCountry;
    }

    /**
     * Sets the value of the ticketingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingCountry(String value) {
        this.ticketingCountry = value;
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
     *       &lt;attribute name="SecondaryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NegotiatedFareCode {

        @XmlAttribute(name = "SecondaryCode")
        protected String secondaryCode;
        @XmlAttribute(name = "SupplierCode")
        protected String supplierCode;
        @XmlAttribute(name = "Value")
        protected String value;

        /**
         * Gets the value of the secondaryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondaryCode() {
            return secondaryCode;
        }

        /**
         * Sets the value of the secondaryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondaryCode(String value) {
            this.secondaryCode = value;
        }

        /**
         * Gets the value of the supplierCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierCode() {
            return supplierCode;
        }

        /**
         * Sets the value of the supplierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierCode(String value) {
            this.supplierCode = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
     *       &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RebookOption {

        @XmlAttribute(name = "FlightSegmentRPH")
        protected String flightSegmentRPH;
        @XmlAttribute(name = "ResBookDesigCode")
        protected String resBookDesigCode;

        /**
         * Gets the value of the flightSegmentRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightSegmentRPH() {
            return flightSegmentRPH;
        }

        /**
         * Sets the value of the flightSegmentRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightSegmentRPH(String value) {
            this.flightSegmentRPH = value;
        }

        /**
         * Gets the value of the resBookDesigCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCode() {
            return resBookDesigCode;
        }

        /**
         * Sets the value of the resBookDesigCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCode(String value) {
            this.resBookDesigCode = value;
        }

    }

}
