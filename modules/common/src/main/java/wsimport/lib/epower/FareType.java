
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarkupFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EquivFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAirTaxType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAirFeeType" minOccurs="0"/>
 *         &lt;element name="TotalFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalAmountInTicketingCurrency" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareConstruction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FormattedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                 &lt;attribute name="OriginCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OriginCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DestinationCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DestinationCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnstructuredFareCalc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="FareCalcMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NegotiatedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NegotiatedFareCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TicketDesignatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TotalNbrTrips" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="TotalNbrPTC" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareType", propOrder = {
    "baseFare",
    "markupFare",
    "equivFare",
    "taxes",
    "fees",
    "totalFare",
    "totalAmountInTicketingCurrency",
    "fareConstruction",
    "unstructuredFareCalc",
    "tpaExtensions"
})
public class FareType {

    @XmlElement(name = "BaseFare")
    protected FareType.BaseFare baseFare;
    @XmlElement(name = "MarkupFare")
    protected FareType.MarkupFare markupFare;
    @XmlElement(name = "EquivFare")
    protected FareType.EquivFare equivFare;
    @XmlElement(name = "Taxes")
    protected ArrayOfAirTaxType taxes;
    @XmlElement(name = "Fees")
    protected ArrayOfAirFeeType fees;
    @XmlElement(name = "TotalFare")
    protected FareType.TotalFare totalFare;
    @XmlElement(name = "TotalAmountInTicketingCurrency")
    protected FareType.TotalAmountInTicketingCurrency totalAmountInTicketingCurrency;
    @XmlElement(name = "FareConstruction")
    protected FareType.FareConstruction fareConstruction;
    @XmlElement(name = "UnstructuredFareCalc")
    protected FareType.UnstructuredFareCalc unstructuredFareCalc;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;
    @XmlAttribute(name = "TicketDesignatorCode")
    protected String ticketDesignatorCode;
    @XmlAttribute(name = "TotalNbrTrips")
    protected BigInteger totalNbrTrips;
    @XmlAttribute(name = "TotalNbrPTC")
    protected BigInteger totalNbrPTC;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.BaseFare }
     *     
     */
    public FareType.BaseFare getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.BaseFare }
     *     
     */
    public void setBaseFare(FareType.BaseFare value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the markupFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.MarkupFare }
     *     
     */
    public FareType.MarkupFare getMarkupFare() {
        return markupFare;
    }

    /**
     * Sets the value of the markupFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.MarkupFare }
     *     
     */
    public void setMarkupFare(FareType.MarkupFare value) {
        this.markupFare = value;
    }

    /**
     * Gets the value of the equivFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.EquivFare }
     *     
     */
    public FareType.EquivFare getEquivFare() {
        return equivFare;
    }

    /**
     * Sets the value of the equivFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.EquivFare }
     *     
     */
    public void setEquivFare(FareType.EquivFare value) {
        this.equivFare = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirTaxType }
     *     
     */
    public ArrayOfAirTaxType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirTaxType }
     *     
     */
    public void setTaxes(ArrayOfAirTaxType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirFeeType }
     *     
     */
    public ArrayOfAirFeeType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirFeeType }
     *     
     */
    public void setFees(ArrayOfAirFeeType value) {
        this.fees = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.TotalFare }
     *     
     */
    public FareType.TotalFare getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.TotalFare }
     *     
     */
    public void setTotalFare(FareType.TotalFare value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the totalAmountInTicketingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.TotalAmountInTicketingCurrency }
     *     
     */
    public FareType.TotalAmountInTicketingCurrency getTotalAmountInTicketingCurrency() {
        return totalAmountInTicketingCurrency;
    }

    /**
     * Sets the value of the totalAmountInTicketingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.TotalAmountInTicketingCurrency }
     *     
     */
    public void setTotalAmountInTicketingCurrency(FareType.TotalAmountInTicketingCurrency value) {
        this.totalAmountInTicketingCurrency = value;
    }

    /**
     * Gets the value of the fareConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.FareConstruction }
     *     
     */
    public FareType.FareConstruction getFareConstruction() {
        return fareConstruction;
    }

    /**
     * Sets the value of the fareConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.FareConstruction }
     *     
     */
    public void setFareConstruction(FareType.FareConstruction value) {
        this.fareConstruction = value;
    }

    /**
     * Gets the value of the unstructuredFareCalc property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.UnstructuredFareCalc }
     *     
     */
    public FareType.UnstructuredFareCalc getUnstructuredFareCalc() {
        return unstructuredFareCalc;
    }

    /**
     * Sets the value of the unstructuredFareCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.UnstructuredFareCalc }
     *     
     */
    public void setUnstructuredFareCalc(FareType.UnstructuredFareCalc value) {
        this.unstructuredFareCalc = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the negotiatedFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegotiatedFare() {
        if (negotiatedFare == null) {
            return false;
        } else {
            return negotiatedFare;
        }
    }

    /**
     * Sets the value of the negotiatedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
    }

    /**
     * Gets the value of the negotiatedFareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }

    /**
     * Sets the value of the negotiatedFareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedFareCode(String value) {
        this.negotiatedFareCode = value;
    }

    /**
     * Gets the value of the ticketDesignatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignatorCode() {
        return ticketDesignatorCode;
    }

    /**
     * Sets the value of the ticketDesignatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDesignatorCode(String value) {
        this.ticketDesignatorCode = value;
    }

    /**
     * Gets the value of the totalNbrTrips property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNbrTrips() {
        return totalNbrTrips;
    }

    /**
     * Sets the value of the totalNbrTrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNbrTrips(BigInteger value) {
        this.totalNbrTrips = value;
    }

    /**
     * Gets the value of the totalNbrPTC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNbrPTC() {
        return totalNbrPTC;
    }

    /**
     * Sets the value of the totalNbrPTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNbrPTC(BigInteger value) {
        this.totalNbrPTC = value;
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
     *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BaseFare {

        @XmlAttribute(name = "Currency")
        protected String currency;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "Rate")
        protected BigDecimal rate;
        @XmlAttribute(name = "Date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
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
         * Gets the value of the rate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRate() {
            return rate;
        }

        /**
         * Sets the value of the rate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRate(BigDecimal value) {
            this.rate = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EquivFare {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

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
     *       &lt;attribute name="FormattedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *       &lt;attribute name="OriginCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DestinationCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DestinationCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareConstruction {

        @XmlAttribute(name = "FormattedIndicator")
        protected Boolean formattedIndicator;
        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "OriginCityCode")
        protected String originCityCode;
        @XmlAttribute(name = "OriginCodeContext")
        protected String originCodeContext;
        @XmlAttribute(name = "DestinationCityCode")
        protected String destinationCityCode;
        @XmlAttribute(name = "DestinationCodeContext")
        protected String destinationCodeContext;

        /**
         * Gets the value of the formattedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFormattedIndicator() {
            return formattedIndicator;
        }

        /**
         * Sets the value of the formattedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFormattedIndicator(Boolean value) {
            this.formattedIndicator = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the originCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginCityCode() {
            return originCityCode;
        }

        /**
         * Sets the value of the originCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginCityCode(String value) {
            this.originCityCode = value;
        }

        /**
         * Gets the value of the originCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginCodeContext() {
            return originCodeContext;
        }

        /**
         * Sets the value of the originCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginCodeContext(String value) {
            this.originCodeContext = value;
        }

        /**
         * Gets the value of the destinationCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationCityCode() {
            return destinationCityCode;
        }

        /**
         * Sets the value of the destinationCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationCityCode(String value) {
            this.destinationCityCode = value;
        }

        /**
         * Gets the value of the destinationCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationCodeContext() {
            return destinationCodeContext;
        }

        /**
         * Sets the value of the destinationCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationCodeContext(String value) {
            this.destinationCodeContext = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MarkupFare {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalAmountInTicketingCurrency {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "Currency")
        protected String currency;

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
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalFare {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "Currency")
        protected String currency;

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
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="FareCalcMode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class UnstructuredFareCalc {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "FareCalcMode")
        protected String fareCalcMode;

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

        /**
         * Gets the value of the fareCalcMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCalcMode() {
            return fareCalcMode;
        }

        /**
         * Sets the value of the fareCalcMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCalcMode(String value) {
            this.fareCalcMode = value;
        }

    }

}
