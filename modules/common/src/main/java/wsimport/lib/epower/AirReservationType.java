
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
 * <p>Java class for AirReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OSIElements" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOSIelement" minOccurs="0"/>
 *         &lt;element name="AirItinerary" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryType" minOccurs="0"/>
 *         &lt;element name="PriceInfo" type="{http://epowerv5.amadeus.com.tr/WS}BookingPriceInfoType" minOccurs="0"/>
 *         &lt;element name="TravelerInfo" type="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoType" minOccurs="0"/>
 *         &lt;element name="Fulfillment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPaymentDetailType" minOccurs="0"/>
 *                   &lt;element name="DeliveryAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ticketing" type="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Queues" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAirReservationTypeQueue" minOccurs="0"/>
 *         &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightRulePenalties" type="{http://epowerv5.amadeus.com.tr/WS}FareRuleResponseInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightMiniRules" type="{http://epowerv5.amadeus.com.tr/WS}MiniRuleResponseInfoType" minOccurs="0"/>
 *         &lt;element name="PriceMessageInfo" type="{http://epowerv5.amadeus.com.tr/WS}PriceMessageInfoType" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://epowerv5.amadeus.com.tr/WS}FormattedTextTextType" minOccurs="0"/>
 *         &lt;element name="PricingOverview" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PricingIndicator" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="BaseFareOnly"/>
 *                                 &lt;enumeration value="SpecifiedClass"/>
 *                                 &lt;enumeration value="TaxExempt"/>
 *                                 &lt;enumeration value="SecuratePricing"/>
 *                                 &lt;enumeration value="CodeOnlyFares"/>
 *                                 &lt;enumeration value="LowerFareFound"/>
 *                                 &lt;enumeration value="PenaltyApplies"/>
 *                                 &lt;enumeration value="DiscountApplies"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ExcludeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Account" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Comment" type="{http://epowerv5.amadeus.com.tr/WS}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="StatisticalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ValidatingAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="NUC_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PNRRemarks" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPNRRemarkInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirReservationType", propOrder = {
    "osiElements",
    "airItinerary",
    "priceInfo",
    "travelerInfo",
    "fulfillment",
    "ticketing",
    "queues",
    "bookingReferenceID",
    "flightRulePenalties",
    "flightMiniRules",
    "priceMessageInfo",
    "comment",
    "pricingOverview",
    "pnrRemarks"
})
@XmlSeeAlso({
    wsimport.lib.epower.CancelResponse.OTACancelRS.OTAAirBookRS.AirReservation.class,
    wsimport.lib.epower.BookFlightWithRecommendationResponse.OTAAirBookRS.AirReservation.class,
    wsimport.lib.epower.GetPNRPriceResponse.OTAAirBookRS.AirReservation.class,
    wsimport.lib.epower.EditPNRResponse.EditPnrRS.AirReservation.class,
    wsimport.lib.epower.BookFlightResponse.OTAAirBookRS.AirReservation.class,
    wsimport.lib.epower.GetBasketPNRResponse.OTAAirBookRS.AirReservation.class,
    wsimport.lib.epower.GetPNRResponse.OTAAirBookRS.AirReservation.class,
    wsimport.lib.epower.CreateTicketResponse.OTAAirBookRS.AirReservation.class,
    wsimport.lib.epower.BookResponse.BookBasketRS.AirReservation.class
})
public class AirReservationType {

    @XmlElement(name = "OSIElements")
    protected ArrayOfOSIelement osiElements;
    @XmlElement(name = "AirItinerary")
    protected AirItineraryType airItinerary;
    @XmlElement(name = "PriceInfo")
    protected BookingPriceInfoType priceInfo;
    @XmlElement(name = "TravelerInfo")
    protected TravelerInfoType travelerInfo;
    @XmlElement(name = "Fulfillment")
    protected AirReservationType.Fulfillment fulfillment;
    @XmlElement(name = "Ticketing")
    protected List<TicketingInfoType> ticketing;
    @XmlElement(name = "Queues")
    protected ArrayOfAirReservationTypeQueue queues;
    @XmlElement(name = "BookingReferenceID")
    protected List<UniqueIDType> bookingReferenceID;
    @XmlElement(name = "FlightRulePenalties")
    protected List<FareRuleResponseInfoType> flightRulePenalties;
    @XmlElement(name = "FlightMiniRules")
    protected MiniRuleResponseInfoType flightMiniRules;
    @XmlElement(name = "PriceMessageInfo")
    protected PriceMessageInfoType priceMessageInfo;
    @XmlElement(name = "Comment")
    protected FormattedTextTextType comment;
    @XmlElement(name = "PricingOverview")
    protected AirReservationType.PricingOverview pricingOverview;
    @XmlElement(name = "PNRRemarks")
    protected ArrayOfPNRRemarkInfo pnrRemarks;
    @XmlAttribute(name = "LastModified")
    protected String lastModified;

    /**
     * Gets the value of the osiElements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOSIelement }
     *     
     */
    public ArrayOfOSIelement getOSIElements() {
        return osiElements;
    }

    /**
     * Sets the value of the osiElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOSIelement }
     *     
     */
    public void setOSIElements(ArrayOfOSIelement value) {
        this.osiElements = value;
    }

    /**
     * Gets the value of the airItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType }
     *     
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType }
     *     
     */
    public void setAirItinerary(AirItineraryType value) {
        this.airItinerary = value;
    }

    /**
     * Gets the value of the priceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BookingPriceInfoType }
     *     
     */
    public BookingPriceInfoType getPriceInfo() {
        return priceInfo;
    }

    /**
     * Sets the value of the priceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingPriceInfoType }
     *     
     */
    public void setPriceInfo(BookingPriceInfoType value) {
        this.priceInfo = value;
    }

    /**
     * Gets the value of the travelerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoType }
     *     
     */
    public TravelerInfoType getTravelerInfo() {
        return travelerInfo;
    }

    /**
     * Sets the value of the travelerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoType }
     *     
     */
    public void setTravelerInfo(TravelerInfoType value) {
        this.travelerInfo = value;
    }

    /**
     * Gets the value of the fulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationType.Fulfillment }
     *     
     */
    public AirReservationType.Fulfillment getFulfillment() {
        return fulfillment;
    }

    /**
     * Sets the value of the fulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationType.Fulfillment }
     *     
     */
    public void setFulfillment(AirReservationType.Fulfillment value) {
        this.fulfillment = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingInfoType }
     * 
     * 
     */
    public List<TicketingInfoType> getTicketing() {
        if (ticketing == null) {
            ticketing = new ArrayList<TicketingInfoType>();
        }
        return this.ticketing;
    }

    /**
     * Gets the value of the queues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirReservationTypeQueue }
     *     
     */
    public ArrayOfAirReservationTypeQueue getQueues() {
        return queues;
    }

    /**
     * Sets the value of the queues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirReservationTypeQueue }
     *     
     */
    public void setQueues(ArrayOfAirReservationTypeQueue value) {
        this.queues = value;
    }

    /**
     * Gets the value of the bookingReferenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingReferenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingReferenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getBookingReferenceID() {
        if (bookingReferenceID == null) {
            bookingReferenceID = new ArrayList<UniqueIDType>();
        }
        return this.bookingReferenceID;
    }

    /**
     * Gets the value of the flightRulePenalties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightRulePenalties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightRulePenalties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleResponseInfoType }
     * 
     * 
     */
    public List<FareRuleResponseInfoType> getFlightRulePenalties() {
        if (flightRulePenalties == null) {
            flightRulePenalties = new ArrayList<FareRuleResponseInfoType>();
        }
        return this.flightRulePenalties;
    }

    /**
     * Gets the value of the flightMiniRules property.
     * 
     * @return
     *     possible object is
     *     {@link MiniRuleResponseInfoType }
     *     
     */
    public MiniRuleResponseInfoType getFlightMiniRules() {
        return flightMiniRules;
    }

    /**
     * Sets the value of the flightMiniRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiniRuleResponseInfoType }
     *     
     */
    public void setFlightMiniRules(MiniRuleResponseInfoType value) {
        this.flightMiniRules = value;
    }

    /**
     * Gets the value of the priceMessageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMessageInfoType }
     *     
     */
    public PriceMessageInfoType getPriceMessageInfo() {
        return priceMessageInfo;
    }

    /**
     * Sets the value of the priceMessageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMessageInfoType }
     *     
     */
    public void setPriceMessageInfo(PriceMessageInfoType value) {
        this.priceMessageInfo = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextTextType }
     *     
     */
    public FormattedTextTextType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextTextType }
     *     
     */
    public void setComment(FormattedTextTextType value) {
        this.comment = value;
    }

    /**
     * Gets the value of the pricingOverview property.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationType.PricingOverview }
     *     
     */
    public AirReservationType.PricingOverview getPricingOverview() {
        return pricingOverview;
    }

    /**
     * Sets the value of the pricingOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationType.PricingOverview }
     *     
     */
    public void setPricingOverview(AirReservationType.PricingOverview value) {
        this.pricingOverview = value;
    }

    /**
     * Gets the value of the pnrRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPNRRemarkInfo }
     *     
     */
    public ArrayOfPNRRemarkInfo getPNRRemarks() {
        return pnrRemarks;
    }

    /**
     * Sets the value of the pnrRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPNRRemarkInfo }
     *     
     */
    public void setPNRRemarks(ArrayOfPNRRemarkInfo value) {
        this.pnrRemarks = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModified(String value) {
        this.lastModified = value;
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
     *         &lt;element name="PaymentDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPaymentDetailType" minOccurs="0"/>
     *         &lt;element name="DeliveryAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
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
        "paymentDetails",
        "deliveryAddress"
    })
    public static class Fulfillment {

        @XmlElement(name = "PaymentDetails")
        protected ArrayOfPaymentDetailType paymentDetails;
        @XmlElement(name = "DeliveryAddress")
        protected AddressType deliveryAddress;

        /**
         * Gets the value of the paymentDetails property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPaymentDetailType }
         *     
         */
        public ArrayOfPaymentDetailType getPaymentDetails() {
            return paymentDetails;
        }

        /**
         * Sets the value of the paymentDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPaymentDetailType }
         *     
         */
        public void setPaymentDetails(ArrayOfPaymentDetailType value) {
            this.paymentDetails = value;
        }

        /**
         * Gets the value of the deliveryAddress property.
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getDeliveryAddress() {
            return deliveryAddress;
        }

        /**
         * Sets the value of the deliveryAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         */
        public void setDeliveryAddress(AddressType value) {
            this.deliveryAddress = value;
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
     *         &lt;element name="PricingIndicator" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="BaseFareOnly"/>
     *                       &lt;enumeration value="SpecifiedClass"/>
     *                       &lt;enumeration value="TaxExempt"/>
     *                       &lt;enumeration value="SecuratePricing"/>
     *                       &lt;enumeration value="CodeOnlyFares"/>
     *                       &lt;enumeration value="LowerFareFound"/>
     *                       &lt;enumeration value="PenaltyApplies"/>
     *                       &lt;enumeration value="DiscountApplies"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ExcludeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Account" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Comment" type="{http://epowerv5.amadeus.com.tr/WS}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="StatisticalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ValidatingAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="NUC_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pricingIndicator",
        "account",
        "comment"
    })
    public static class PricingOverview {

        @XmlElement(name = "PricingIndicator")
        protected List<AirReservationType.PricingOverview.PricingIndicator> pricingIndicator;
        @XmlElement(name = "Account")
        protected List<AirReservationType.PricingOverview.Account> account;
        @XmlElement(name = "Comment")
        protected List<FreeTextType> comment;
        @XmlAttribute(name = "StatisticalCode")
        protected String statisticalCode;
        @XmlAttribute(name = "ValidatingAirlineCode")
        protected String validatingAirlineCode;
        @XmlAttribute(name = "DepartureDate")
        protected String departureDate;
        @XmlAttribute(name = "PriceType")
        protected String priceType;
        @XmlAttribute(name = "NUC_Rate")
        protected BigDecimal nucRate;
        @XmlAttribute(name = "ExchangeRate")
        protected BigDecimal exchangeRate;

        /**
         * Gets the value of the pricingIndicator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricingIndicator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricingIndicator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirReservationType.PricingOverview.PricingIndicator }
         * 
         * 
         */
        public List<AirReservationType.PricingOverview.PricingIndicator> getPricingIndicator() {
            if (pricingIndicator == null) {
                pricingIndicator = new ArrayList<AirReservationType.PricingOverview.PricingIndicator>();
            }
            return this.pricingIndicator;
        }

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirReservationType.PricingOverview.Account }
         * 
         * 
         */
        public List<AirReservationType.PricingOverview.Account> getAccount() {
            if (account == null) {
                account = new ArrayList<AirReservationType.PricingOverview.Account>();
            }
            return this.account;
        }

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeTextType }
         * 
         * 
         */
        public List<FreeTextType> getComment() {
            if (comment == null) {
                comment = new ArrayList<FreeTextType>();
            }
            return this.comment;
        }

        /**
         * Gets the value of the statisticalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatisticalCode() {
            return statisticalCode;
        }

        /**
         * Sets the value of the statisticalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatisticalCode(String value) {
            this.statisticalCode = value;
        }

        /**
         * Gets the value of the validatingAirlineCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidatingAirlineCode() {
            return validatingAirlineCode;
        }

        /**
         * Sets the value of the validatingAirlineCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidatingAirlineCode(String value) {
            this.validatingAirlineCode = value;
        }

        /**
         * Gets the value of the departureDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureDate() {
            return departureDate;
        }

        /**
         * Sets the value of the departureDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureDate(String value) {
            this.departureDate = value;
        }

        /**
         * Gets the value of the priceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceType() {
            return priceType;
        }

        /**
         * Sets the value of the priceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceType(String value) {
            this.priceType = value;
        }

        /**
         * Gets the value of the nucRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNUCRate() {
            return nucRate;
        }

        /**
         * Sets the value of the nucRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNUCRate(BigDecimal value) {
            this.nucRate = value;
        }

        /**
         * Gets the value of the exchangeRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getExchangeRate() {
            return exchangeRate;
        }

        /**
         * Sets the value of the exchangeRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setExchangeRate(BigDecimal value) {
            this.exchangeRate = value;
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
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Account {

            @XmlAttribute(name = "Code")
            protected String code;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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
         *       &lt;attribute name="Type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="BaseFareOnly"/>
         *             &lt;enumeration value="SpecifiedClass"/>
         *             &lt;enumeration value="TaxExempt"/>
         *             &lt;enumeration value="SecuratePricing"/>
         *             &lt;enumeration value="CodeOnlyFares"/>
         *             &lt;enumeration value="LowerFareFound"/>
         *             &lt;enumeration value="PenaltyApplies"/>
         *             &lt;enumeration value="DiscountApplies"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="ExcludeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PricingIndicator {

            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "ExcludeInd")
            protected Boolean excludeInd;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the excludeInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExcludeInd() {
                return excludeInd;
            }

            /**
             * Sets the value of the excludeInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setExcludeInd(Boolean value) {
                this.excludeInd = value;
            }

        }

    }

}
