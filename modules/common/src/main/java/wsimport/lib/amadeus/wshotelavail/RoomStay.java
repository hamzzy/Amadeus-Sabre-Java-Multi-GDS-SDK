
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomStay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomStay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypes" type="{http://traveltalk.com/wsHotelAvail}ArrayOfRoomType" minOccurs="0"/>
 *         &lt;element name="RatePlans" type="{http://traveltalk.com/wsHotelAvail}ArrayOfRatePlan" minOccurs="0"/>
 *         &lt;element name="RoomRates" type="{http://traveltalk.com/wsHotelAvail}ArrayOfRoomRate" minOccurs="0"/>
 *         &lt;element name="GuestCounts" type="{http://traveltalk.com/wsHotelAvail}GuestCounts" minOccurs="0"/>
 *         &lt;element name="TimeSpan" type="{http://traveltalk.com/wsHotelAvail}TimeSpan" minOccurs="0"/>
 *         &lt;element name="Guarantee" type="{http://traveltalk.com/wsHotelAvail}Guarantee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepositPayments" type="{http://traveltalk.com/wsHotelAvail}ArrayOfRequiredPayment" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://traveltalk.com/wsHotelAvail}ArrayOfCancelPenalty" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://traveltalk.com/wsHotelAvail}Discount" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://traveltalk.com/wsHotelAvail}Total" minOccurs="0"/>
 *         &lt;element name="BasicPropertyInfo" type="{http://traveltalk.com/wsHotelAvail}BasicPropertyInfo" minOccurs="0"/>
 *         &lt;element name="AlternateInfo" type="{http://traveltalk.com/wsHotelAvail}AlternateInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MarketCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AvailabilityStatus" use="required" type="{http://traveltalk.com/wsHotelAvail}RateIndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomStay", propOrder = {
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
    "alternateInfo"
})
public class RoomStay {

    @XmlElement(name = "RoomTypes")
    protected ArrayOfRoomType roomTypes;
    @XmlElement(name = "RatePlans")
    protected ArrayOfRatePlan ratePlans;
    @XmlElement(name = "RoomRates")
    protected ArrayOfRoomRate roomRates;
    @XmlElement(name = "GuestCounts")
    protected GuestCounts guestCounts;
    @XmlElement(name = "TimeSpan")
    protected TimeSpan timeSpan;
    @XmlElement(name = "Guarantee")
    protected List<Guarantee> guarantee;
    @XmlElement(name = "DepositPayments")
    protected ArrayOfRequiredPayment depositPayments;
    @XmlElement(name = "CancelPenalties")
    protected ArrayOfCancelPenalty cancelPenalties;
    @XmlElement(name = "Discount")
    protected Discount discount;
    @XmlElement(name = "Total")
    protected Total total;
    @XmlElement(name = "BasicPropertyInfo")
    protected BasicPropertyInfo basicPropertyInfo;
    @XmlElement(name = "AlternateInfo")
    protected AlternateInfo alternateInfo;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "SourceOfBusiness")
    protected String sourceOfBusiness;
    @XmlAttribute(name = "DiscountCode")
    protected String discountCode;
    @XmlAttribute(name = "PromotionCode")
    protected String promotionCode;
    @XmlAttribute(name = "IsAlternate")
    protected Boolean isAlternate;
    @XmlAttribute(name = "AvailabilityStatus", required = true)
    protected RateIndicatorType availabilityStatus;

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public ArrayOfRoomType getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public void setRoomTypes(ArrayOfRoomType value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the ratePlans property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatePlan }
     *     
     */
    public ArrayOfRatePlan getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatePlan }
     *     
     */
    public void setRatePlans(ArrayOfRatePlan value) {
        this.ratePlans = value;
    }

    /**
     * Gets the value of the roomRates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomRate }
     *     
     */
    public ArrayOfRoomRate getRoomRates() {
        return roomRates;
    }

    /**
     * Sets the value of the roomRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomRate }
     *     
     */
    public void setRoomRates(ArrayOfRoomRate value) {
        this.roomRates = value;
    }

    /**
     * Gets the value of the guestCounts property.
     * 
     * @return
     *     possible object is
     *     {@link GuestCounts }
     *     
     */
    public GuestCounts getGuestCounts() {
        return guestCounts;
    }

    /**
     * Sets the value of the guestCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCounts }
     *     
     */
    public void setGuestCounts(GuestCounts value) {
        this.guestCounts = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setTimeSpan(TimeSpan value) {
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
     * {@link Guarantee }
     * 
     * 
     */
    public List<Guarantee> getGuarantee() {
        if (guarantee == null) {
            guarantee = new ArrayList<Guarantee>();
        }
        return this.guarantee;
    }

    /**
     * Gets the value of the depositPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredPayment }
     *     
     */
    public ArrayOfRequiredPayment getDepositPayments() {
        return depositPayments;
    }

    /**
     * Sets the value of the depositPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredPayment }
     *     
     */
    public void setDepositPayments(ArrayOfRequiredPayment value) {
        this.depositPayments = value;
    }

    /**
     * Gets the value of the cancelPenalties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelPenalty }
     *     
     */
    public ArrayOfCancelPenalty getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * Sets the value of the cancelPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelPenalty }
     *     
     */
    public void setCancelPenalties(ArrayOfCancelPenalty value) {
        this.cancelPenalties = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setDiscount(Discount value) {
        this.discount = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Total }
     *     
     */
    public Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Total }
     *     
     */
    public void setTotal(Total value) {
        this.total = value;
    }

    /**
     * Gets the value of the basicPropertyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfo }
     *     
     */
    public BasicPropertyInfo getBasicPropertyInfo() {
        return basicPropertyInfo;
    }

    /**
     * Sets the value of the basicPropertyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfo }
     *     
     */
    public void setBasicPropertyInfo(BasicPropertyInfo value) {
        this.basicPropertyInfo = value;
    }

    /**
     * Gets the value of the alternateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateInfo }
     *     
     */
    public AlternateInfo getAlternateInfo() {
        return alternateInfo;
    }

    /**
     * Sets the value of the alternateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateInfo }
     *     
     */
    public void setAlternateInfo(AlternateInfo value) {
        this.alternateInfo = value;
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
     * Gets the value of the isAlternate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsAlternate() {
        if (isAlternate == null) {
            return false;
        } else {
            return isAlternate;
        }
    }

    /**
     * Sets the value of the isAlternate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlternate(Boolean value) {
        this.isAlternate = value;
    }

    /**
     * Gets the value of the availabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RateIndicatorType }
     *     
     */
    public RateIndicatorType getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * Sets the value of the availabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorType }
     *     
     */
    public void setAvailabilityStatus(RateIndicatorType value) {
        this.availabilityStatus = value;
    }

}
