
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
import javax.xml.datatype.Duration;


/**
 * <p>Java class for RoomStayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomStayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypes" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfRoomTypeType" minOccurs="0"/>
 *         &lt;element name="RatePlans" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfRatePlanType" minOccurs="0"/>
 *         &lt;element name="RoomRates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomRate" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}RoomRateType">
 *                           &lt;sequence>
 *                             &lt;element name="AdvanceBookingRestriction" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                                     &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                                     &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Restrictions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfRoomStayTypeRoomRatesRoomRateRestriction" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="TotalAmountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="Notes1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Notes2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Notes3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IsGuarantee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="IsDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MoreRatesExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GuestCounts" type="{http://epowerv5.amadeus.com.tr/WS}GuestCountType" minOccurs="0"/>
 *         &lt;element name="TimeSpan" type="{http://epowerv5.amadeus.com.tr/WS}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="Guarantee" type="{http://epowerv5.amadeus.com.tr/WS}GuaranteeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepositPayments" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfRequiredPaymentsTypeGuaranteePayment" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://epowerv5.amadeus.com.tr/WS}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://epowerv5.amadeus.com.tr/WS}DiscountType" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://epowerv5.amadeus.com.tr/WS}TotalType" minOccurs="0"/>
 *         &lt;element name="BasicPropertyInfo" type="{http://epowerv5.amadeus.com.tr/WS}BasicPropertyInfoType" minOccurs="0"/>
 *         &lt;element name="ServiceFees" type="{http://epowerv5.amadeus.com.tr/WS}ServiceFeesType" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MarketCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionVendorCode">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RoomStayStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WarningRPH">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomStayType", propOrder = {
    "roomTypes",
    "ratePlans",
    "roomRates",
    "guestCounts",
    "timeSpan",
    "guarantee",
    "depositPayments",
    "cancelPenalties",
    "discount",
    "total",
    "basicPropertyInfo",
    "serviceFees",
    "tpaExtensions"
})
@XmlSeeAlso({
    wsimport.lib.epower.GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay.class,
    wsimport.lib.epower.SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays.RoomStay.class,
    wsimport.lib.epower.ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay.class
})
public class RoomStayType {

    @XmlElement(name = "RoomTypes")
    protected ArrayOfRoomTypeType roomTypes;
    @XmlElement(name = "RatePlans")
    protected ArrayOfRatePlanType ratePlans;
    @XmlElement(name = "RoomRates")
    protected RoomStayType.RoomRates roomRates;
    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "TimeSpan")
    protected DateTimeSpanType timeSpan;
    @XmlElement(name = "Guarantee")
    protected List<GuaranteeType> guarantee;
    @XmlElement(name = "DepositPayments")
    protected ArrayOfRequiredPaymentsTypeGuaranteePayment depositPayments;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "Discount")
    protected DiscountType discount;
    @XmlElement(name = "Total")
    protected TotalType total;
    @XmlElement(name = "BasicPropertyInfo")
    protected BasicPropertyInfoType basicPropertyInfo;
    @XmlElement(name = "ServiceFees")
    protected ServiceFeesType serviceFees;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "SourceOfBusiness")
    protected String sourceOfBusiness;
    @XmlAttribute(name = "DiscountCode")
    protected String discountCode;
    @XmlAttribute(name = "PromotionCode")
    protected String promotionCode;
    @XmlAttribute(name = "PromotionVendorCode")
    protected List<String> promotionVendorCode;
    @XmlAttribute(name = "RoomStayStatus")
    protected String roomStayStatus;
    @XmlAttribute(name = "WarningRPH")
    protected List<String> warningRPH;

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomTypeType }
     *     
     */
    public ArrayOfRoomTypeType getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomTypeType }
     *     
     */
    public void setRoomTypes(ArrayOfRoomTypeType value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the ratePlans property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatePlanType }
     *     
     */
    public ArrayOfRatePlanType getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatePlanType }
     *     
     */
    public void setRatePlans(ArrayOfRatePlanType value) {
        this.ratePlans = value;
    }

    /**
     * Gets the value of the roomRates property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStayType.RoomRates }
     *     
     */
    public RoomStayType.RoomRates getRoomRates() {
        return roomRates;
    }

    /**
     * Sets the value of the roomRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayType.RoomRates }
     *     
     */
    public void setRoomRates(RoomStayType.RoomRates value) {
        this.roomRates = value;
    }

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setTimeSpan(DateTimeSpanType value) {
        this.timeSpan = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuaranteeType }
     * 
     * 
     */
    public List<GuaranteeType> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<GuaranteeType>();
        }
        return this.guarantee;
    }

    /**
     * Gets the value of the depositPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment getDepositPayments() {
        return depositPayments;
    }

    /**
     * Sets the value of the depositPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     *     
     */
    public void setDepositPayments(ArrayOfRequiredPaymentsTypeGuaranteePayment value) {
        this.depositPayments = value;
    }

    /**
     * Gets the value of the cancelPenalties property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * Sets the value of the cancelPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setDiscount(DiscountType value) {
        this.discount = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }

    /**
     * Gets the value of the basicPropertyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfoType }
     *     
     */
    public BasicPropertyInfoType getBasicPropertyInfo() {
        return basicPropertyInfo;
    }

    /**
     * Sets the value of the basicPropertyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfoType }
     *     
     */
    public void setBasicPropertyInfo(BasicPropertyInfoType value) {
        this.basicPropertyInfo = value;
    }

    /**
     * Gets the value of the serviceFees property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeesType }
     *     
     */
    public ServiceFeesType getServiceFees() {
        return serviceFees;
    }

    /**
     * Sets the value of the serviceFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeesType }
     *     
     */
    public void setServiceFees(ServiceFeesType value) {
        this.serviceFees = value;
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
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * Gets the value of the sourceOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfBusiness() {
        return sourceOfBusiness;
    }

    /**
     * Sets the value of the sourceOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfBusiness(String value) {
        this.sourceOfBusiness = value;
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

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the promotionVendorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionVendorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPromotionVendorCode() {
        if (promotionVendorCode == null) {
            promotionVendorCode = new ArrayList<String>();
        }
        return this.promotionVendorCode;
    }

    /**
     * Gets the value of the roomStayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomStayStatus() {
        return roomStayStatus;
    }

    /**
     * Sets the value of the roomStayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomStayStatus(String value) {
        this.roomStayStatus = value;
    }

    /**
     * Gets the value of the warningRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWarningRPH() {
        if (warningRPH == null) {
            warningRPH = new ArrayList<String>();
        }
        return this.warningRPH;
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
     *         &lt;element name="RoomRate" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}RoomRateType">
     *                 &lt;sequence>
     *                   &lt;element name="AdvanceBookingRestriction" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *                           &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *                           &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Restrictions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfRoomStayTypeRoomRatesRoomRateRestriction" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="TotalAmountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="Notes1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Notes2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Notes3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IsGuarantee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="IsDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *       &lt;attribute name="MoreRatesExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomRate",
        "totalAmount",
        "totalAmountSpecified",
        "notes1",
        "notes2",
        "notes3",
        "isGuarantee",
        "isDeposit"
    })
    public static class RoomRates {

        @XmlElement(name = "RoomRate")
        protected List<RoomStayType.RoomRates.RoomRate> roomRate;
        @XmlElement(name = "TotalAmount")
        protected BigDecimal totalAmount;
        @XmlElement(name = "TotalAmountSpecified")
        protected boolean totalAmountSpecified;
        @XmlElement(name = "Notes1")
        protected String notes1;
        @XmlElement(name = "Notes2")
        protected String notes2;
        @XmlElement(name = "Notes3")
        protected String notes3;
        @XmlElement(name = "IsGuarantee")
        protected boolean isGuarantee;
        @XmlElement(name = "IsDeposit")
        protected boolean isDeposit;
        @XmlAttribute(name = "MoreRatesExistInd")
        protected Boolean moreRatesExistInd;

        /**
         * Gets the value of the roomRate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomRate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomStayType.RoomRates.RoomRate }
         * 
         * 
         */
        public List<RoomStayType.RoomRates.RoomRate> getRoomRate() {
            if (roomRate == null) {
                roomRate = new ArrayList<RoomStayType.RoomRates.RoomRate>();
            }
            return this.roomRate;
        }

        /**
         * Gets the value of the totalAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalAmount() {
            return totalAmount;
        }

        /**
         * Sets the value of the totalAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalAmount(BigDecimal value) {
            this.totalAmount = value;
        }

        /**
         * Gets the value of the totalAmountSpecified property.
         * 
         */
        public boolean isTotalAmountSpecified() {
            return totalAmountSpecified;
        }

        /**
         * Sets the value of the totalAmountSpecified property.
         * 
         */
        public void setTotalAmountSpecified(boolean value) {
            this.totalAmountSpecified = value;
        }

        /**
         * Gets the value of the notes1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotes1() {
            return notes1;
        }

        /**
         * Sets the value of the notes1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotes1(String value) {
            this.notes1 = value;
        }

        /**
         * Gets the value of the notes2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotes2() {
            return notes2;
        }

        /**
         * Sets the value of the notes2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotes2(String value) {
            this.notes2 = value;
        }

        /**
         * Gets the value of the notes3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotes3() {
            return notes3;
        }

        /**
         * Sets the value of the notes3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotes3(String value) {
            this.notes3 = value;
        }

        /**
         * Gets the value of the isGuarantee property.
         * 
         */
        public boolean isIsGuarantee() {
            return isGuarantee;
        }

        /**
         * Sets the value of the isGuarantee property.
         * 
         */
        public void setIsGuarantee(boolean value) {
            this.isGuarantee = value;
        }

        /**
         * Gets the value of the isDeposit property.
         * 
         */
        public boolean isIsDeposit() {
            return isDeposit;
        }

        /**
         * Sets the value of the isDeposit property.
         * 
         */
        public void setIsDeposit(boolean value) {
            this.isDeposit = value;
        }

        /**
         * Gets the value of the moreRatesExistInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMoreRatesExistInd() {
            return moreRatesExistInd;
        }

        /**
         * Sets the value of the moreRatesExistInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMoreRatesExistInd(Boolean value) {
            this.moreRatesExistInd = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}RoomRateType">
         *       &lt;sequence>
         *         &lt;element name="AdvanceBookingRestriction" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
         *                 &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
         *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Restrictions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfRoomStayTypeRoomRatesRoomRateRestriction" minOccurs="0"/>
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
            "advanceBookingRestriction",
            "restrictions"
        })
        public static class RoomRate
            extends RoomRateType
        {

            @XmlElement(name = "AdvanceBookingRestriction")
            protected RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction advanceBookingRestriction;
            @XmlElement(name = "Restrictions")
            protected ArrayOfRoomStayTypeRoomRatesRoomRateRestriction restrictions;

            /**
             * Gets the value of the advanceBookingRestriction property.
             * 
             * @return
             *     possible object is
             *     {@link RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction }
             *     
             */
            public RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction getAdvanceBookingRestriction() {
                return advanceBookingRestriction;
            }

            /**
             * Sets the value of the advanceBookingRestriction property.
             * 
             * @param value
             *     allowed object is
             *     {@link RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction }
             *     
             */
            public void setAdvanceBookingRestriction(RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction value) {
                this.advanceBookingRestriction = value;
            }

            /**
             * Gets the value of the restrictions property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction }
             *     
             */
            public ArrayOfRoomStayTypeRoomRatesRoomRateRestriction getRestrictions() {
                return restrictions;
            }

            /**
             * Sets the value of the restrictions property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction }
             *     
             */
            public void setRestrictions(ArrayOfRoomStayTypeRoomRatesRoomRateRestriction value) {
                this.restrictions = value;
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
             *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="MinAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
             *       &lt;attribute name="MaxAdvanceBookingOffset" type="{http://www.w3.org/2001/XMLSchema}duration" />
             *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AdvanceBookingRestriction {

                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;
                @XmlAttribute(name = "MinAdvanceBookingOffset")
                protected Duration minAdvanceBookingOffset;
                @XmlAttribute(name = "MaxAdvanceBookingOffset")
                protected Duration maxAdvanceBookingOffset;
                @XmlAttribute(name = "Mon")
                protected Boolean mon;
                @XmlAttribute(name = "Tue")
                protected Boolean tue;
                @XmlAttribute(name = "Weds")
                protected Boolean weds;
                @XmlAttribute(name = "Thur")
                protected Boolean thur;
                @XmlAttribute(name = "Fri")
                protected Boolean fri;
                @XmlAttribute(name = "Sat")
                protected Boolean sat;
                @XmlAttribute(name = "Sun")
                protected Boolean sun;

                /**
                 * Gets the value of the start property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStart() {
                    return start;
                }

                /**
                 * Sets the value of the start property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStart(String value) {
                    this.start = value;
                }

                /**
                 * Gets the value of the duration property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDuration() {
                    return duration;
                }

                /**
                 * Sets the value of the duration property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDuration(String value) {
                    this.duration = value;
                }

                /**
                 * Gets the value of the end property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnd() {
                    return end;
                }

                /**
                 * Sets the value of the end property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnd(String value) {
                    this.end = value;
                }

                /**
                 * Gets the value of the minAdvanceBookingOffset property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Duration }
                 *     
                 */
                public Duration getMinAdvanceBookingOffset() {
                    return minAdvanceBookingOffset;
                }

                /**
                 * Sets the value of the minAdvanceBookingOffset property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Duration }
                 *     
                 */
                public void setMinAdvanceBookingOffset(Duration value) {
                    this.minAdvanceBookingOffset = value;
                }

                /**
                 * Gets the value of the maxAdvanceBookingOffset property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Duration }
                 *     
                 */
                public Duration getMaxAdvanceBookingOffset() {
                    return maxAdvanceBookingOffset;
                }

                /**
                 * Sets the value of the maxAdvanceBookingOffset property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Duration }
                 *     
                 */
                public void setMaxAdvanceBookingOffset(Duration value) {
                    this.maxAdvanceBookingOffset = value;
                }

                /**
                 * Gets the value of the mon property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isMon() {
                    return mon;
                }

                /**
                 * Sets the value of the mon property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setMon(Boolean value) {
                    this.mon = value;
                }

                /**
                 * Gets the value of the tue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isTue() {
                    return tue;
                }

                /**
                 * Sets the value of the tue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setTue(Boolean value) {
                    this.tue = value;
                }

                /**
                 * Gets the value of the weds property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isWeds() {
                    return weds;
                }

                /**
                 * Sets the value of the weds property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setWeds(Boolean value) {
                    this.weds = value;
                }

                /**
                 * Gets the value of the thur property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isThur() {
                    return thur;
                }

                /**
                 * Sets the value of the thur property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setThur(Boolean value) {
                    this.thur = value;
                }

                /**
                 * Gets the value of the fri property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isFri() {
                    return fri;
                }

                /**
                 * Sets the value of the fri property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setFri(Boolean value) {
                    this.fri = value;
                }

                /**
                 * Gets the value of the sat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSat() {
                    return sat;
                }

                /**
                 * Sets the value of the sat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSat(Boolean value) {
                    this.sat = value;
                }

                /**
                 * Gets the value of the sun property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSun() {
                    return sun;
                }

                /**
                 * Sets the value of the sun property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSun(Boolean value) {
                    this.sun = value;
                }

            }

        }

    }

}
