
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Base" type="{http://traveltalk.com/wsHotelAvail}Base" minOccurs="0"/>
 *         &lt;element name="AdditionalGuestAmounts" type="{http://traveltalk.com/wsHotelAvail}ArrayOfAdditionalGuestAmount" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://traveltalk.com/wsHotelAvail}ArrayOfFee" minOccurs="0"/>
 *         &lt;element name="CancelPolicies" type="{http://traveltalk.com/wsHotelAvail}ArrayOfCancelPenalty" minOccurs="0"/>
 *         &lt;element name="PaymentPolicies" type="{http://traveltalk.com/wsHotelAvail}ArrayOfRequiredPayment" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://traveltalk.com/wsHotelAvail}Discount" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://traveltalk.com/wsHotelAvail}Total" minOccurs="0"/>
 *         &lt;element name="RateDescription" type="{http://traveltalk.com/wsHotelAvail}RateDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="AgeTimeUnit" type="{http://traveltalk.com/wsHotelAvail}RateAgeTimeUnit" />
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RateTimeUnit" type="{http://traveltalk.com/wsHotelAvail}RateRateTimeUnit" />
 *       &lt;attribute name="UnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MinGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MaxGuestApplicable" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MaxLOS" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="StayOverDate" type="{http://traveltalk.com/wsHotelAvail}RateStayOverDate" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate", propOrder = {
    "base",
    "additionalGuestAmounts",
    "fees",
    "cancelPolicies",
    "paymentPolicies",
    "discount",
    "total",
    "rateDescription"
})
public class Rate {

    @XmlElement(name = "Base")
    protected Base base;
    @XmlElement(name = "AdditionalGuestAmounts")
    protected ArrayOfAdditionalGuestAmount additionalGuestAmounts;
    @XmlElement(name = "Fees")
    protected ArrayOfFee fees;
    @XmlElement(name = "CancelPolicies")
    protected ArrayOfCancelPenalty cancelPolicies;
    @XmlElement(name = "PaymentPolicies")
    protected ArrayOfRequiredPayment paymentPolicies;
    @XmlElement(name = "Discount")
    protected Discount discount;
    @XmlElement(name = "Total")
    protected Total total;
    @XmlElement(name = "RateDescription")
    protected RateDescription rateDescription;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "AgeQualifyingCode")
    protected String ageQualifyingCode;
    @XmlAttribute(name = "MinAge")
    protected Integer minAge;
    @XmlAttribute(name = "MaxAge")
    protected Integer maxAge;
    @XmlAttribute(name = "AgeTimeUnit")
    protected RateAgeTimeUnit ageTimeUnit;
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "NumberOfUnits")
    protected Integer numberOfUnits;
    @XmlAttribute(name = "RateTimeUnit")
    protected RateRateTimeUnit rateTimeUnit;
    @XmlAttribute(name = "UnitMultiplier")
    protected Integer unitMultiplier;
    @XmlAttribute(name = "MinGuestApplicable")
    protected Integer minGuestApplicable;
    @XmlAttribute(name = "MaxGuestApplicable")
    protected Integer maxGuestApplicable;
    @XmlAttribute(name = "MinLOS")
    protected Integer minLOS;
    @XmlAttribute(name = "MaxLOS")
    protected Integer maxLOS;
    @XmlAttribute(name = "StayOverDate")
    protected RateStayOverDate stayOverDate;
    @XmlAttribute(name = "Duration")
    protected String duration;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link Base }
     *     
     */
    public Base getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base }
     *     
     */
    public void setBase(Base value) {
        this.base = value;
    }

    /**
     * Gets the value of the additionalGuestAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditionalGuestAmount }
     *     
     */
    public ArrayOfAdditionalGuestAmount getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    /**
     * Sets the value of the additionalGuestAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditionalGuestAmount }
     *     
     */
    public void setAdditionalGuestAmounts(ArrayOfAdditionalGuestAmount value) {
        this.additionalGuestAmounts = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFee }
     *     
     */
    public ArrayOfFee getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFee }
     *     
     */
    public void setFees(ArrayOfFee value) {
        this.fees = value;
    }

    /**
     * Gets the value of the cancelPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelPenalty }
     *     
     */
    public ArrayOfCancelPenalty getCancelPolicies() {
        return cancelPolicies;
    }

    /**
     * Sets the value of the cancelPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelPenalty }
     *     
     */
    public void setCancelPolicies(ArrayOfCancelPenalty value) {
        this.cancelPolicies = value;
    }

    /**
     * Gets the value of the paymentPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequiredPayment }
     *     
     */
    public ArrayOfRequiredPayment getPaymentPolicies() {
        return paymentPolicies;
    }

    /**
     * Sets the value of the paymentPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequiredPayment }
     *     
     */
    public void setPaymentPolicies(ArrayOfRequiredPayment value) {
        this.paymentPolicies = value;
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
     * Gets the value of the rateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link RateDescription }
     *     
     */
    public RateDescription getRateDescription() {
        return rateDescription;
    }

    /**
     * Sets the value of the rateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDescription }
     *     
     */
    public void setRateDescription(RateDescription value) {
        this.rateDescription = value;
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
     * Gets the value of the ageQualifyingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * Sets the value of the ageQualifyingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    /**
     * Gets the value of the minAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAge() {
        return minAge;
    }

    /**
     * Sets the value of the minAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAge(Integer value) {
        this.minAge = value;
    }

    /**
     * Gets the value of the maxAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAge() {
        return maxAge;
    }

    /**
     * Sets the value of the maxAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAge(Integer value) {
        this.maxAge = value;
    }

    /**
     * Gets the value of the ageTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RateAgeTimeUnit }
     *     
     */
    public RateAgeTimeUnit getAgeTimeUnit() {
        return ageTimeUnit;
    }

    /**
     * Sets the value of the ageTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAgeTimeUnit }
     *     
     */
    public void setAgeTimeUnit(RateAgeTimeUnit value) {
        this.ageTimeUnit = value;
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
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfUnits(Integer value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the rateTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RateRateTimeUnit }
     *     
     */
    public RateRateTimeUnit getRateTimeUnit() {
        return rateTimeUnit;
    }

    /**
     * Sets the value of the rateTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRateTimeUnit }
     *     
     */
    public void setRateTimeUnit(RateRateTimeUnit value) {
        this.rateTimeUnit = value;
    }

    /**
     * Gets the value of the unitMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * Sets the value of the unitMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitMultiplier(Integer value) {
        this.unitMultiplier = value;
    }

    /**
     * Gets the value of the minGuestApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinGuestApplicable() {
        return minGuestApplicable;
    }

    /**
     * Sets the value of the minGuestApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinGuestApplicable(Integer value) {
        this.minGuestApplicable = value;
    }

    /**
     * Gets the value of the maxGuestApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxGuestApplicable() {
        return maxGuestApplicable;
    }

    /**
     * Sets the value of the maxGuestApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxGuestApplicable(Integer value) {
        this.maxGuestApplicable = value;
    }

    /**
     * Gets the value of the minLOS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinLOS() {
        return minLOS;
    }

    /**
     * Sets the value of the minLOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinLOS(Integer value) {
        this.minLOS = value;
    }

    /**
     * Gets the value of the maxLOS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLOS() {
        return maxLOS;
    }

    /**
     * Sets the value of the maxLOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLOS(Integer value) {
        this.maxLOS = value;
    }

    /**
     * Gets the value of the stayOverDate property.
     * 
     * @return
     *     possible object is
     *     {@link RateStayOverDate }
     *     
     */
    public RateStayOverDate getStayOverDate() {
        return stayOverDate;
    }

    /**
     * Sets the value of the stayOverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateStayOverDate }
     *     
     */
    public void setStayOverDate(RateStayOverDate value) {
        this.stayOverDate = value;
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

}
