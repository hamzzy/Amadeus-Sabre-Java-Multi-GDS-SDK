
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTCFareBreakdownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTCFareBreakdownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeQuantity" type="{http://epowerv5.amadeus.com.tr/WS}PassengerTypeQuantityType" minOccurs="0"/>
 *         &lt;element name="FareBasisCodes" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfString2" minOccurs="0"/>
 *         &lt;element name="PassengerFare" type="{http://epowerv5.amadeus.com.tr/WS}FareType" minOccurs="0"/>
 *         &lt;element name="TravelerRefNumber" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SurnameRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketDesignators" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPTCFareBreakdownTypeTicketDesignator" minOccurs="0"/>
 *         &lt;element name="Endorsements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Endorsement" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FreeTextType">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonEndorsableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}FareInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerFare" type="{http://epowerv5.amadeus.com.tr/WS}FareType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PricingUnit" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareComponent" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightLeg" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BookFlightSegmentType">
 *                                     &lt;attribute name="SurchargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="UnitNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://epowerv5.amadeus.com.tr/WS}PricingSourceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTCFareBreakdownType", propOrder = {
    "passengerTypeQuantity",
    "fareBasisCodes",
    "passengerFare",
    "travelerRefNumber",
    "ticketDesignators",
    "endorsements",
    "fareInfo",
    "pricingUnit"
})
public class PTCFareBreakdownType {

    @XmlElement(name = "PassengerTypeQuantity")
    protected PassengerTypeQuantityType passengerTypeQuantity;
    @XmlElement(name = "FareBasisCodes")
    protected ArrayOfString2 fareBasisCodes;
    @XmlElement(name = "PassengerFare")
    protected FareType passengerFare;
    @XmlElement(name = "TravelerRefNumber")
    protected List<PTCFareBreakdownType.TravelerRefNumber> travelerRefNumber;
    @XmlElement(name = "TicketDesignators")
    protected ArrayOfPTCFareBreakdownTypeTicketDesignator ticketDesignators;
    @XmlElement(name = "Endorsements")
    protected PTCFareBreakdownType.Endorsements endorsements;
    @XmlElement(name = "FareInfo")
    protected List<PTCFareBreakdownType.FareInfo> fareInfo;
    @XmlElement(name = "PricingUnit")
    protected List<PTCFareBreakdownType.PricingUnit> pricingUnit;
    @XmlAttribute(name = "PricingSource")
    protected PricingSourceType pricingSource;

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public PassengerTypeQuantityType getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /**
     * Sets the value of the passengerTypeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public void setPassengerTypeQuantity(PassengerTypeQuantityType value) {
        this.passengerTypeQuantity = value;
    }

    /**
     * Gets the value of the fareBasisCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getFareBasisCodes() {
        return fareBasisCodes;
    }

    /**
     * Sets the value of the fareBasisCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setFareBasisCodes(ArrayOfString2 value) {
        this.fareBasisCodes = value;
    }

    /**
     * Gets the value of the passengerFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getPassengerFare() {
        return passengerFare;
    }

    /**
     * Sets the value of the passengerFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setPassengerFare(FareType value) {
        this.passengerFare = value;
    }

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCFareBreakdownType.TravelerRefNumber }
     * 
     * 
     */
    public List<PTCFareBreakdownType.TravelerRefNumber> getTravelerRefNumber() {
        if (travelerRefNumber == null) {
            travelerRefNumber = new ArrayList<PTCFareBreakdownType.TravelerRefNumber>();
        }
        return this.travelerRefNumber;
    }

    /**
     * Gets the value of the ticketDesignators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPTCFareBreakdownTypeTicketDesignator }
     *     
     */
    public ArrayOfPTCFareBreakdownTypeTicketDesignator getTicketDesignators() {
        return ticketDesignators;
    }

    /**
     * Sets the value of the ticketDesignators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPTCFareBreakdownTypeTicketDesignator }
     *     
     */
    public void setTicketDesignators(ArrayOfPTCFareBreakdownTypeTicketDesignator value) {
        this.ticketDesignators = value;
    }

    /**
     * Gets the value of the endorsements property.
     * 
     * @return
     *     possible object is
     *     {@link PTCFareBreakdownType.Endorsements }
     *     
     */
    public PTCFareBreakdownType.Endorsements getEndorsements() {
        return endorsements;
    }

    /**
     * Sets the value of the endorsements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCFareBreakdownType.Endorsements }
     *     
     */
    public void setEndorsements(PTCFareBreakdownType.Endorsements value) {
        this.endorsements = value;
    }

    /**
     * Gets the value of the fareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCFareBreakdownType.FareInfo }
     * 
     * 
     */
    public List<PTCFareBreakdownType.FareInfo> getFareInfo() {
        if (fareInfo == null) {
            fareInfo = new ArrayList<PTCFareBreakdownType.FareInfo>();
        }
        return this.fareInfo;
    }

    /**
     * Gets the value of the pricingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCFareBreakdownType.PricingUnit }
     * 
     * 
     */
    public List<PTCFareBreakdownType.PricingUnit> getPricingUnit() {
        if (pricingUnit == null) {
            pricingUnit = new ArrayList<PTCFareBreakdownType.PricingUnit>();
        }
        return this.pricingUnit;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Endorsement" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FreeTextType">
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonEndorsableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "endorsement"
    })
    public static class Endorsements {

        @XmlElement(name = "Endorsement")
        protected List<PTCFareBreakdownType.Endorsements.Endorsement> endorsement;
        @XmlAttribute(name = "NonRefundableIndicator")
        protected Boolean nonRefundableIndicator;
        @XmlAttribute(name = "NonEndorsableIndicator")
        protected Boolean nonEndorsableIndicator;

        /**
         * Gets the value of the endorsement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endorsement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEndorsement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType.Endorsements.Endorsement }
         * 
         * 
         */
        public List<PTCFareBreakdownType.Endorsements.Endorsement> getEndorsement() {
            if (endorsement == null) {
                endorsement = new ArrayList<PTCFareBreakdownType.Endorsements.Endorsement>();
            }
            return this.endorsement;
        }

        /**
         * Gets the value of the nonRefundableIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundableIndicator() {
            return nonRefundableIndicator;
        }

        /**
         * Sets the value of the nonRefundableIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonRefundableIndicator(Boolean value) {
            this.nonRefundableIndicator = value;
        }

        /**
         * Gets the value of the nonEndorsableIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonEndorsableIndicator() {
            return nonEndorsableIndicator;
        }

        /**
         * Sets the value of the nonEndorsableIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonEndorsableIndicator(Boolean value) {
            this.nonEndorsableIndicator = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FreeTextType">
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Endorsement
            extends FreeTextType
        {


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
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}FareInfoType">
     *       &lt;sequence>
     *         &lt;element name="PassengerFare" type="{http://epowerv5.amadeus.com.tr/WS}FareType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passengerFare"
    })
    public static class FareInfo
        extends FareInfoType
    {

        @XmlElement(name = "PassengerFare")
        protected FareType passengerFare;

        /**
         * Gets the value of the passengerFare property.
         * 
         * @return
         *     possible object is
         *     {@link FareType }
         *     
         */
        public FareType getPassengerFare() {
            return passengerFare;
        }

        /**
         * Sets the value of the passengerFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareType }
         *     
         */
        public void setPassengerFare(FareType value) {
            this.passengerFare = value;
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
     *         &lt;element name="FareComponent" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightLeg" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BookFlightSegmentType">
     *                           &lt;attribute name="SurchargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="UnitNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareComponent"
    })
    public static class PricingUnit {

        @XmlElement(name = "FareComponent")
        protected List<PTCFareBreakdownType.PricingUnit.FareComponent> fareComponent;
        @XmlAttribute(name = "UnitNumber")
        protected BigInteger unitNumber;

        /**
         * Gets the value of the fareComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType.PricingUnit.FareComponent }
         * 
         * 
         */
        public List<PTCFareBreakdownType.PricingUnit.FareComponent> getFareComponent() {
            if (fareComponent == null) {
                fareComponent = new ArrayList<PTCFareBreakdownType.PricingUnit.FareComponent>();
            }
            return this.fareComponent;
        }

        /**
         * Gets the value of the unitNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitNumber() {
            return unitNumber;
        }

        /**
         * Sets the value of the unitNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitNumber(BigInteger value) {
            this.unitNumber = value;
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
         *         &lt;element name="FlightLeg" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BookFlightSegmentType">
         *                 &lt;attribute name="SurchargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flightLeg"
        })
        public static class FareComponent {

            @XmlElement(name = "FlightLeg")
            protected List<PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg> flightLeg;
            @XmlAttribute(name = "Number")
            protected BigInteger number;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;

            /**
             * Gets the value of the flightLeg property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightLeg property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightLeg().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg }
             * 
             * 
             */
            public List<PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg> getFlightLeg() {
                if (flightLeg == null) {
                    flightLeg = new ArrayList<PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg>();
                }
                return this.flightLeg;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumber(BigInteger value) {
                this.number = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BookFlightSegmentType">
             *       &lt;attribute name="SurchargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FlightLeg
                extends BookFlightSegmentType
            {

                @XmlAttribute(name = "SurchargeInd")
                protected Boolean surchargeInd;
                @XmlAttribute(name = "FareBasisCode")
                protected String fareBasisCode;
                @XmlAttribute(name = "UnitOfMeasureQuantity")
                protected BigDecimal unitOfMeasureQuantity;
                @XmlAttribute(name = "UnitOfMeasure")
                protected String unitOfMeasure;
                @XmlAttribute(name = "UnitOfMeasureCode")
                protected String unitOfMeasureCode;

                /**
                 * Gets the value of the surchargeInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSurchargeInd() {
                    return surchargeInd;
                }

                /**
                 * Sets the value of the surchargeInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSurchargeInd(Boolean value) {
                    this.surchargeInd = value;
                }

                /**
                 * Gets the value of the fareBasisCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFareBasisCode() {
                    return fareBasisCode;
                }

                /**
                 * Sets the value of the fareBasisCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFareBasisCode(String value) {
                    this.fareBasisCode = value;
                }

                /**
                 * Gets the value of the unitOfMeasureQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUnitOfMeasureQuantity() {
                    return unitOfMeasureQuantity;
                }

                /**
                 * Sets the value of the unitOfMeasureQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUnitOfMeasureQuantity(BigDecimal value) {
                    this.unitOfMeasureQuantity = value;
                }

                /**
                 * Gets the value of the unitOfMeasure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasure() {
                    return unitOfMeasure;
                }

                /**
                 * Sets the value of the unitOfMeasure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasure(String value) {
                    this.unitOfMeasure = value;
                }

                /**
                 * Gets the value of the unitOfMeasureCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasureCode() {
                    return unitOfMeasureCode;
                }

                /**
                 * Sets the value of the unitOfMeasureCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasureCode(String value) {
                    this.unitOfMeasureCode = value;
                }

            }

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
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SurnameRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerRefNumber {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "SurnameRefNumber")
        protected String surnameRefNumber;

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the surnameRefNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurnameRefNumber() {
            return surnameRefNumber;
        }

        /**
         * Sets the value of the surnameRefNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurnameRefNumber(String value) {
            this.surnameRefNumber = value;
        }

    }

}
