
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RatePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Guarantee" type="{http://traveltalk.com/wsHotelAvail}Guarantee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://traveltalk.com/wsHotelAvail}ArrayOfCancelPenalty" minOccurs="0"/>
 *         &lt;element name="RatePlanDescription" type="{http://traveltalk.com/wsHotelAvail}RatePlanDescription" minOccurs="0"/>
 *         &lt;element name="RatePlanInclusions" type="{http://traveltalk.com/wsHotelAvail}RatePlanInclusions" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://traveltalk.com/wsHotelAvail}Commission" minOccurs="0"/>
 *         &lt;element name="MealsIncluded" type="{http://traveltalk.com/wsHotelAvail}MealsIncluded" minOccurs="0"/>
 *         &lt;element name="RestrictionStatus" type="{http://traveltalk.com/wsHotelAvail}RestrictionStatus" minOccurs="0"/>
 *         &lt;element name="AdditionalDetails" type="{http://traveltalk.com/wsHotelAvail}ArrayOfAdditionalDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="RateIndicator" type="{http://traveltalk.com/wsHotelAvail}RatePlanRateIndicator" />
 *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlan", propOrder = {
    "guarantee",
    "cancelPenalties",
    "ratePlanDescription",
    "ratePlanInclusions",
    "commission",
    "mealsIncluded",
    "restrictionStatus",
    "additionalDetails"
})
public class RatePlan {

    @XmlElement(name = "Guarantee")
    protected List<Guarantee> guarantee;
    @XmlElement(name = "CancelPenalties")
    protected ArrayOfCancelPenalty cancelPenalties;
    @XmlElement(name = "RatePlanDescription")
    protected RatePlanDescription ratePlanDescription;
    @XmlElement(name = "RatePlanInclusions")
    protected RatePlanInclusions ratePlanInclusions;
    @XmlElement(name = "Commission")
    protected Commission commission;
    @XmlElement(name = "MealsIncluded")
    protected MealsIncluded mealsIncluded;
    @XmlElement(name = "RestrictionStatus")
    protected RestrictionStatus restrictionStatus;
    @XmlElement(name = "AdditionalDetails")
    protected ArrayOfAdditionalDetail additionalDetails;
    @XmlAttribute(name = "BookingCode")
    protected String bookingCode;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "RateIndicator")
    protected RatePlanRateIndicator rateIndicator;
    @XmlAttribute(name = "RatePlanType")
    protected String ratePlanType;
    @XmlAttribute(name = "RatePlanID")
    protected String ratePlanID;

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
     * Gets the value of the ratePlanDescription property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanDescription }
     *     
     */
    public RatePlanDescription getRatePlanDescription() {
        return ratePlanDescription;
    }

    /**
     * Sets the value of the ratePlanDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanDescription }
     *     
     */
    public void setRatePlanDescription(RatePlanDescription value) {
        this.ratePlanDescription = value;
    }

    /**
     * Gets the value of the ratePlanInclusions property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanInclusions }
     *     
     */
    public RatePlanInclusions getRatePlanInclusions() {
        return ratePlanInclusions;
    }

    /**
     * Sets the value of the ratePlanInclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanInclusions }
     *     
     */
    public void setRatePlanInclusions(RatePlanInclusions value) {
        this.ratePlanInclusions = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     */
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the mealsIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link MealsIncluded }
     *     
     */
    public MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * Sets the value of the mealsIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealsIncluded }
     *     
     */
    public void setMealsIncluded(MealsIncluded value) {
        this.mealsIncluded = value;
    }

    /**
     * Gets the value of the restrictionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionStatus }
     *     
     */
    public RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    /**
     * Sets the value of the restrictionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionStatus }
     *     
     */
    public void setRestrictionStatus(RestrictionStatus value) {
        this.restrictionStatus = value;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditionalDetail }
     *     
     */
    public ArrayOfAdditionalDetail getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditionalDetail }
     *     
     */
    public void setAdditionalDetails(ArrayOfAdditionalDetail value) {
        this.additionalDetails = value;
    }

    /**
     * Gets the value of the bookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the rateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanRateIndicator }
     *     
     */
    public RatePlanRateIndicator getRateIndicator() {
        return rateIndicator;
    }

    /**
     * Sets the value of the rateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanRateIndicator }
     *     
     */
    public void setRateIndicator(RatePlanRateIndicator value) {
        this.rateIndicator = value;
    }

    /**
     * Gets the value of the ratePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * Sets the value of the ratePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * Gets the value of the ratePlanID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanID() {
        return ratePlanID;
    }

    /**
     * Sets the value of the ratePlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanID(String value) {
        this.ratePlanID = value;
    }

}
