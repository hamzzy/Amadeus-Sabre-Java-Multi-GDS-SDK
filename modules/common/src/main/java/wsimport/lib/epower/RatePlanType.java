
package wsimport.lib.epower;

import java.math.BigDecimal;
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
 * <p>Java class for RatePlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Guarantee" type="{http://epowerv5.amadeus.com.tr/WS}GuaranteeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://epowerv5.amadeus.com.tr/WS}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="RatePlanDescription" type="{http://epowerv5.amadeus.com.tr/WS}ParagraphType" minOccurs="0"/>
 *         &lt;element name="RatePlanInclusion" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RatePlanInclusionDesciption" type="{http://epowerv5.amadeus.com.tr/WS}ParagraphType" minOccurs="0"/>
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CategoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IsDaily" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="IsPackage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="IsPerPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="IsPerPerson" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="IsPerRoom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="IsTaxIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commission" type="{http://epowerv5.amadeus.com.tr/WS}CommissionType" minOccurs="0"/>
 *         &lt;element name="MealsIncluded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MealPlanCodes">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RestrictionStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Restriction">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Master"/>
 *                       &lt;enumeration value="Arrival"/>
 *                       &lt;enumeration value="Departure"/>
 *                       &lt;enumeration value="NonGuarantee"/>
 *                       &lt;enumeration value="TravelAgent"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Status" type="{http://epowerv5.amadeus.com.tr/WS}AvailabilityStatusType" />
 *                 &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAdditionalDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="RateIndicator" type="{http://epowerv5.amadeus.com.tr/WS}RateIndicatorType" />
 *       &lt;attribute name="RatePlanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MarketCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AvailabilityStatus" type="{http://epowerv5.amadeus.com.tr/WS}RateIndicatorType" />
 *       &lt;attribute name="ID_RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PriceViewableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="QualificationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanType", propOrder = {
    "guarantee",
    "cancelPenalties",
    "ratePlanDescription",
    "ratePlanInclusion",
    "commission",
    "mealsIncluded",
    "restrictionStatus",
    "additionalDetails"
})
public class RatePlanType {

    @XmlElement(name = "Guarantee")
    protected List<GuaranteeType> guarantee;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "RatePlanDescription")
    protected ParagraphType ratePlanDescription;
    @XmlElement(name = "RatePlanInclusion")
    protected List<RatePlanType.RatePlanInclusion> ratePlanInclusion;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "MealsIncluded")
    protected RatePlanType.MealsIncluded mealsIncluded;
    @XmlElement(name = "RestrictionStatus")
    protected RatePlanType.RestrictionStatus restrictionStatus;
    @XmlElement(name = "AdditionalDetails")
    protected ArrayOfAdditionalDetailType additionalDetails;
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
    protected RateIndicatorType rateIndicator;
    @XmlAttribute(name = "RatePlanType")
    protected String ratePlanType;
    @XmlAttribute(name = "RatePlanID")
    protected String ratePlanID;
    @XmlAttribute(name = "RatePlanName")
    protected String ratePlanName;
    @XmlAttribute(name = "MarketCode")
    protected String marketCode;
    @XmlAttribute(name = "AvailabilityStatus")
    protected RateIndicatorType availabilityStatus;
    @XmlAttribute(name = "ID_RequiredInd")
    protected Boolean idRequiredInd;
    @XmlAttribute(name = "PriceViewableInd")
    protected Boolean priceViewableInd;
    @XmlAttribute(name = "QualificationType")
    protected String qualificationType;

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
     * Gets the value of the ratePlanDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getRatePlanDescription() {
        return ratePlanDescription;
    }

    /**
     * Sets the value of the ratePlanDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setRatePlanDescription(ParagraphType value) {
        this.ratePlanDescription = value;
    }

    /**
     * Gets the value of the ratePlanInclusion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanInclusion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanInclusion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePlanType.RatePlanInclusion }
     * 
     * 
     */
    public List<RatePlanType.RatePlanInclusion> getRatePlanInclusion() {
        if (ratePlanInclusion == null) {
            ratePlanInclusion = new ArrayList<RatePlanType.RatePlanInclusion>();
        }
        return this.ratePlanInclusion;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the mealsIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.MealsIncluded }
     *     
     */
    public RatePlanType.MealsIncluded getMealsIncluded() {
        return mealsIncluded;
    }

    /**
     * Sets the value of the mealsIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.MealsIncluded }
     *     
     */
    public void setMealsIncluded(RatePlanType.MealsIncluded value) {
        this.mealsIncluded = value;
    }

    /**
     * Gets the value of the restrictionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType.RestrictionStatus }
     *     
     */
    public RatePlanType.RestrictionStatus getRestrictionStatus() {
        return restrictionStatus;
    }

    /**
     * Sets the value of the restrictionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType.RestrictionStatus }
     *     
     */
    public void setRestrictionStatus(RatePlanType.RestrictionStatus value) {
        this.restrictionStatus = value;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditionalDetailType }
     *     
     */
    public ArrayOfAdditionalDetailType getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditionalDetailType }
     *     
     */
    public void setAdditionalDetails(ArrayOfAdditionalDetailType value) {
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
     *     {@link RateIndicatorType }
     *     
     */
    public RateIndicatorType getRateIndicator() {
        return rateIndicator;
    }

    /**
     * Sets the value of the rateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorType }
     *     
     */
    public void setRateIndicator(RateIndicatorType value) {
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

    /**
     * Gets the value of the ratePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanName() {
        return ratePlanName;
    }

    /**
     * Sets the value of the ratePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanName(String value) {
        this.ratePlanName = value;
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

    /**
     * Gets the value of the idRequiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIDRequiredInd() {
        return idRequiredInd;
    }

    /**
     * Sets the value of the idRequiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIDRequiredInd(Boolean value) {
        this.idRequiredInd = value;
    }

    /**
     * Gets the value of the priceViewableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceViewableInd() {
        return priceViewableInd;
    }

    /**
     * Sets the value of the priceViewableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceViewableInd(Boolean value) {
        this.priceViewableInd = value;
    }

    /**
     * Gets the value of the qualificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationType() {
        return qualificationType;
    }

    /**
     * Sets the value of the qualificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationType(String value) {
        this.qualificationType = value;
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
     *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MealPlanIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MealPlanCodes">
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
    @XmlType(name = "")
    public static class MealsIncluded {

        @XmlAttribute(name = "Breakfast")
        protected Boolean breakfast;
        @XmlAttribute(name = "Lunch")
        protected Boolean lunch;
        @XmlAttribute(name = "Dinner")
        protected Boolean dinner;
        @XmlAttribute(name = "MealPlanIndicator")
        protected Boolean mealPlanIndicator;
        @XmlAttribute(name = "MealPlanCodes")
        protected List<String> mealPlanCodes;

        /**
         * Gets the value of the breakfast property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBreakfast() {
            return breakfast;
        }

        /**
         * Sets the value of the breakfast property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBreakfast(Boolean value) {
            this.breakfast = value;
        }

        /**
         * Gets the value of the lunch property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLunch() {
            return lunch;
        }

        /**
         * Sets the value of the lunch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLunch(Boolean value) {
            this.lunch = value;
        }

        /**
         * Gets the value of the dinner property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDinner() {
            return dinner;
        }

        /**
         * Sets the value of the dinner property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDinner(Boolean value) {
            this.dinner = value;
        }

        /**
         * Gets the value of the mealPlanIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMealPlanIndicator() {
            return mealPlanIndicator;
        }

        /**
         * Sets the value of the mealPlanIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMealPlanIndicator(Boolean value) {
            this.mealPlanIndicator = value;
        }

        /**
         * Gets the value of the mealPlanCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mealPlanCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMealPlanCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMealPlanCodes() {
            if (mealPlanCodes == null) {
                mealPlanCodes = new ArrayList<String>();
            }
            return this.mealPlanCodes;
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
     *         &lt;element name="RatePlanInclusionDesciption" type="{http://epowerv5.amadeus.com.tr/WS}ParagraphType" minOccurs="0"/>
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CategoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IsDaily" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="IsPackage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="IsPerPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="IsPerPerson" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="IsPerRoom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="IsTaxIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ServiceFeeInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ratePlanInclusionDesciption",
        "amount",
        "categoryType",
        "code",
        "currency",
        "isDaily",
        "isPackage",
        "isPerPeriod",
        "isPerPerson",
        "isPerRoom",
        "isTaxIncluded",
        "percentage"
    })
    public static class RatePlanInclusion {

        @XmlElement(name = "RatePlanInclusionDesciption")
        protected ParagraphType ratePlanInclusionDesciption;
        @XmlElement(name = "Amount")
        protected BigDecimal amount;
        @XmlElement(name = "CategoryType")
        protected String categoryType;
        @XmlElement(name = "Code")
        protected String code;
        @XmlElement(name = "Currency")
        protected String currency;
        @XmlElement(name = "IsDaily")
        protected boolean isDaily;
        @XmlElement(name = "IsPackage")
        protected boolean isPackage;
        @XmlElement(name = "IsPerPeriod")
        protected boolean isPerPeriod;
        @XmlElement(name = "IsPerPerson")
        protected boolean isPerPerson;
        @XmlElement(name = "IsPerRoom")
        protected boolean isPerRoom;
        @XmlElement(name = "IsTaxIncluded")
        protected boolean isTaxIncluded;
        @XmlElement(name = "Percentage")
        protected BigDecimal percentage;
        @XmlAttribute(name = "TaxInclusive")
        protected Boolean taxInclusive;
        @XmlAttribute(name = "ServiceFeeInclusive")
        protected Boolean serviceFeeInclusive;

        /**
         * Gets the value of the ratePlanInclusionDesciption property.
         * 
         * @return
         *     possible object is
         *     {@link ParagraphType }
         *     
         */
        public ParagraphType getRatePlanInclusionDesciption() {
            return ratePlanInclusionDesciption;
        }

        /**
         * Sets the value of the ratePlanInclusionDesciption property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParagraphType }
         *     
         */
        public void setRatePlanInclusionDesciption(ParagraphType value) {
            this.ratePlanInclusionDesciption = value;
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
         * Gets the value of the categoryType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryType() {
            return categoryType;
        }

        /**
         * Sets the value of the categoryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryType(String value) {
            this.categoryType = value;
        }

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
         * Gets the value of the isDaily property.
         * 
         */
        public boolean isIsDaily() {
            return isDaily;
        }

        /**
         * Sets the value of the isDaily property.
         * 
         */
        public void setIsDaily(boolean value) {
            this.isDaily = value;
        }

        /**
         * Gets the value of the isPackage property.
         * 
         */
        public boolean isIsPackage() {
            return isPackage;
        }

        /**
         * Sets the value of the isPackage property.
         * 
         */
        public void setIsPackage(boolean value) {
            this.isPackage = value;
        }

        /**
         * Gets the value of the isPerPeriod property.
         * 
         */
        public boolean isIsPerPeriod() {
            return isPerPeriod;
        }

        /**
         * Sets the value of the isPerPeriod property.
         * 
         */
        public void setIsPerPeriod(boolean value) {
            this.isPerPeriod = value;
        }

        /**
         * Gets the value of the isPerPerson property.
         * 
         */
        public boolean isIsPerPerson() {
            return isPerPerson;
        }

        /**
         * Sets the value of the isPerPerson property.
         * 
         */
        public void setIsPerPerson(boolean value) {
            this.isPerPerson = value;
        }

        /**
         * Gets the value of the isPerRoom property.
         * 
         */
        public boolean isIsPerRoom() {
            return isPerRoom;
        }

        /**
         * Sets the value of the isPerRoom property.
         * 
         */
        public void setIsPerRoom(boolean value) {
            this.isPerRoom = value;
        }

        /**
         * Gets the value of the isTaxIncluded property.
         * 
         */
        public boolean isIsTaxIncluded() {
            return isTaxIncluded;
        }

        /**
         * Sets the value of the isTaxIncluded property.
         * 
         */
        public void setIsTaxIncluded(boolean value) {
            this.isTaxIncluded = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercentage(BigDecimal value) {
            this.percentage = value;
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
         * Gets the value of the serviceFeeInclusive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isServiceFeeInclusive() {
            return serviceFeeInclusive;
        }

        /**
         * Sets the value of the serviceFeeInclusive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setServiceFeeInclusive(Boolean value) {
            this.serviceFeeInclusive = value;
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
     *       &lt;attribute name="Restriction">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Master"/>
     *             &lt;enumeration value="Arrival"/>
     *             &lt;enumeration value="Departure"/>
     *             &lt;enumeration value="NonGuarantee"/>
     *             &lt;enumeration value="TravelAgent"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Status" type="{http://epowerv5.amadeus.com.tr/WS}AvailabilityStatusType" />
     *       &lt;attribute name="SellThroughOpenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RestrictionStatus {

        @XmlAttribute(name = "Restriction")
        protected String restriction;
        @XmlAttribute(name = "Status")
        protected AvailabilityStatusType status;
        @XmlAttribute(name = "SellThroughOpenIndicator")
        protected Boolean sellThroughOpenIndicator;

        /**
         * Gets the value of the restriction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestriction() {
            return restriction;
        }

        /**
         * Sets the value of the restriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestriction(String value) {
            this.restriction = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityStatusType }
         *     
         */
        public AvailabilityStatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityStatusType }
         *     
         */
        public void setStatus(AvailabilityStatusType value) {
            this.status = value;
        }

        /**
         * Gets the value of the sellThroughOpenIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSellThroughOpenIndicator() {
            return sellThroughOpenIndicator;
        }

        /**
         * Sets the value of the sellThroughOpenIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSellThroughOpenIndicator(Boolean value) {
            this.sellThroughOpenIndicator = value;
        }

    }

}
