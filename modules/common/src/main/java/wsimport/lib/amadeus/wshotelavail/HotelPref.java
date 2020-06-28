
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelPref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" type="{http://traveltalk.com/wsHotelAvail}LoyaltyPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://traveltalk.com/wsHotelAvail}PaymentFormPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelChainPref" type="{http://traveltalk.com/wsHotelAvail}HotelChainPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyNamePref" type="{http://traveltalk.com/wsHotelAvail}PropertyNamePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyLocationPref" type="{http://traveltalk.com/wsHotelAvail}PropertyLocationPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyTypePref" type="{http://traveltalk.com/wsHotelAvail}PropertyTypePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyClassPref" type="{http://traveltalk.com/wsHotelAvail}PropertyClassPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyAmenityPref" type="{http://traveltalk.com/wsHotelAvail}PropertyAmenityPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomAmenityPref" type="{http://traveltalk.com/wsHotelAvail}RoomAmenityPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomLocationPref" type="{http://traveltalk.com/wsHotelAvail}RoomLocationPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BedTypePref" type="{http://traveltalk.com/wsHotelAvail}BedTypePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FoodSrvcPref" type="{http://traveltalk.com/wsHotelAvail}FoodSrvcPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://traveltalk.com/wsHotelAvail}MediaEntertainPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://traveltalk.com/wsHotelAvail}PetInfoPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://traveltalk.com/wsHotelAvail}MealPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecreationSrvcPref" type="{http://traveltalk.com/wsHotelAvail}RecreationSrvcPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessSrvcPref" type="{http://traveltalk.com/wsHotelAvail}BusinessSrvcPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonalSrvcPref" type="{http://traveltalk.com/wsHotelAvail}PersonalSrvcPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecurityFeaturePref" type="{http://traveltalk.com/wsHotelAvail}SecurityFeaturePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysChallFeaturePref" type="{http://traveltalk.com/wsHotelAvail}PhysChallFeaturePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://traveltalk.com/wsHotelAvail}SpecRequestPref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}HotelPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}HotelPrefShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}HotelPrefShareMarketInd" />
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelGuestType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPref", propOrder = {
    "loyaltyPref",
    "paymentFormPref",
    "hotelChainPref",
    "propertyNamePref",
    "propertyLocationPref",
    "propertyTypePref",
    "propertyClassPref",
    "propertyAmenityPref",
    "roomAmenityPref",
    "roomLocationPref",
    "bedTypePref",
    "foodSrvcPref",
    "mediaEntertainPref",
    "petInfoPref",
    "mealPref",
    "recreationSrvcPref",
    "businessSrvcPref",
    "personalSrvcPref",
    "securityFeaturePref",
    "physChallFeaturePref",
    "specRequestPref"
})
public class HotelPref {

    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPref> loyaltyPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPref> paymentFormPref;
    @XmlElement(name = "HotelChainPref")
    protected List<HotelChainPref> hotelChainPref;
    @XmlElement(name = "PropertyNamePref")
    protected List<PropertyNamePref> propertyNamePref;
    @XmlElement(name = "PropertyLocationPref")
    protected List<PropertyLocationPref> propertyLocationPref;
    @XmlElement(name = "PropertyTypePref")
    protected List<PropertyTypePref> propertyTypePref;
    @XmlElement(name = "PropertyClassPref")
    protected List<PropertyClassPref> propertyClassPref;
    @XmlElement(name = "PropertyAmenityPref")
    protected List<PropertyAmenityPref> propertyAmenityPref;
    @XmlElement(name = "RoomAmenityPref")
    protected List<RoomAmenityPref> roomAmenityPref;
    @XmlElement(name = "RoomLocationPref")
    protected List<RoomLocationPref> roomLocationPref;
    @XmlElement(name = "BedTypePref")
    protected List<BedTypePref> bedTypePref;
    @XmlElement(name = "FoodSrvcPref")
    protected List<FoodSrvcPref> foodSrvcPref;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPref> mediaEntertainPref;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPref> petInfoPref;
    @XmlElement(name = "MealPref")
    protected List<MealPref> mealPref;
    @XmlElement(name = "RecreationSrvcPref")
    protected List<RecreationSrvcPref> recreationSrvcPref;
    @XmlElement(name = "BusinessSrvcPref")
    protected List<BusinessSrvcPref> businessSrvcPref;
    @XmlElement(name = "PersonalSrvcPref")
    protected List<PersonalSrvcPref> personalSrvcPref;
    @XmlElement(name = "SecurityFeaturePref")
    protected List<SecurityFeaturePref> securityFeaturePref;
    @XmlElement(name = "PhysChallFeaturePref")
    protected List<PhysChallFeaturePref> physChallFeaturePref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPref> specRequestPref;
    @XmlAttribute(name = "PreferLevel")
    protected HotelPrefPreferLevel preferLevel;
    @XmlAttribute(name = "ShareSynchInd")
    protected HotelPrefShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected HotelPrefShareMarketInd shareMarketInd;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "HotelGuestType")
    protected String hotelGuestType;

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPref }
     * 
     * 
     */
    public List<LoyaltyPref> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPref>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPref }
     * 
     * 
     */
    public List<PaymentFormPref> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPref>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the hotelChainPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelChainPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelChainPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelChainPref }
     * 
     * 
     */
    public List<HotelChainPref> getHotelChainPref() {
        if (hotelChainPref == null) {
            hotelChainPref = new ArrayList<HotelChainPref>();
        }
        return this.hotelChainPref;
    }

    /**
     * Gets the value of the propertyNamePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyNamePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyNamePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyNamePref }
     * 
     * 
     */
    public List<PropertyNamePref> getPropertyNamePref() {
        if (propertyNamePref == null) {
            propertyNamePref = new ArrayList<PropertyNamePref>();
        }
        return this.propertyNamePref;
    }

    /**
     * Gets the value of the propertyLocationPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyLocationPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyLocationPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyLocationPref }
     * 
     * 
     */
    public List<PropertyLocationPref> getPropertyLocationPref() {
        if (propertyLocationPref == null) {
            propertyLocationPref = new ArrayList<PropertyLocationPref>();
        }
        return this.propertyLocationPref;
    }

    /**
     * Gets the value of the propertyTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyTypePref }
     * 
     * 
     */
    public List<PropertyTypePref> getPropertyTypePref() {
        if (propertyTypePref == null) {
            propertyTypePref = new ArrayList<PropertyTypePref>();
        }
        return this.propertyTypePref;
    }

    /**
     * Gets the value of the propertyClassPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyClassPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyClassPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyClassPref }
     * 
     * 
     */
    public List<PropertyClassPref> getPropertyClassPref() {
        if (propertyClassPref == null) {
            propertyClassPref = new ArrayList<PropertyClassPref>();
        }
        return this.propertyClassPref;
    }

    /**
     * Gets the value of the propertyAmenityPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyAmenityPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyAmenityPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyAmenityPref }
     * 
     * 
     */
    public List<PropertyAmenityPref> getPropertyAmenityPref() {
        if (propertyAmenityPref == null) {
            propertyAmenityPref = new ArrayList<PropertyAmenityPref>();
        }
        return this.propertyAmenityPref;
    }

    /**
     * Gets the value of the roomAmenityPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAmenityPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomAmenityPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAmenityPref }
     * 
     * 
     */
    public List<RoomAmenityPref> getRoomAmenityPref() {
        if (roomAmenityPref == null) {
            roomAmenityPref = new ArrayList<RoomAmenityPref>();
        }
        return this.roomAmenityPref;
    }

    /**
     * Gets the value of the roomLocationPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomLocationPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomLocationPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomLocationPref }
     * 
     * 
     */
    public List<RoomLocationPref> getRoomLocationPref() {
        if (roomLocationPref == null) {
            roomLocationPref = new ArrayList<RoomLocationPref>();
        }
        return this.roomLocationPref;
    }

    /**
     * Gets the value of the bedTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BedTypePref }
     * 
     * 
     */
    public List<BedTypePref> getBedTypePref() {
        if (bedTypePref == null) {
            bedTypePref = new ArrayList<BedTypePref>();
        }
        return this.bedTypePref;
    }

    /**
     * Gets the value of the foodSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodSrvcPref }
     * 
     * 
     */
    public List<FoodSrvcPref> getFoodSrvcPref() {
        if (foodSrvcPref == null) {
            foodSrvcPref = new ArrayList<FoodSrvcPref>();
        }
        return this.foodSrvcPref;
    }

    /**
     * Gets the value of the mediaEntertainPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEntertainPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEntertainPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaEntertainPref }
     * 
     * 
     */
    public List<MediaEntertainPref> getMediaEntertainPref() {
        if (mediaEntertainPref == null) {
            mediaEntertainPref = new ArrayList<MediaEntertainPref>();
        }
        return this.mediaEntertainPref;
    }

    /**
     * Gets the value of the petInfoPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfoPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfoPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PetInfoPref }
     * 
     * 
     */
    public List<PetInfoPref> getPetInfoPref() {
        if (petInfoPref == null) {
            petInfoPref = new ArrayList<PetInfoPref>();
        }
        return this.petInfoPref;
    }

    /**
     * Gets the value of the mealPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MealPref }
     * 
     * 
     */
    public List<MealPref> getMealPref() {
        if (mealPref == null) {
            mealPref = new ArrayList<MealPref>();
        }
        return this.mealPref;
    }

    /**
     * Gets the value of the recreationSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recreationSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecreationSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecreationSrvcPref }
     * 
     * 
     */
    public List<RecreationSrvcPref> getRecreationSrvcPref() {
        if (recreationSrvcPref == null) {
            recreationSrvcPref = new ArrayList<RecreationSrvcPref>();
        }
        return this.recreationSrvcPref;
    }

    /**
     * Gets the value of the businessSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSrvcPref }
     * 
     * 
     */
    public List<BusinessSrvcPref> getBusinessSrvcPref() {
        if (businessSrvcPref == null) {
            businessSrvcPref = new ArrayList<BusinessSrvcPref>();
        }
        return this.businessSrvcPref;
    }

    /**
     * Gets the value of the personalSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalSrvcPref }
     * 
     * 
     */
    public List<PersonalSrvcPref> getPersonalSrvcPref() {
        if (personalSrvcPref == null) {
            personalSrvcPref = new ArrayList<PersonalSrvcPref>();
        }
        return this.personalSrvcPref;
    }

    /**
     * Gets the value of the securityFeaturePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityFeaturePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityFeaturePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityFeaturePref }
     * 
     * 
     */
    public List<SecurityFeaturePref> getSecurityFeaturePref() {
        if (securityFeaturePref == null) {
            securityFeaturePref = new ArrayList<SecurityFeaturePref>();
        }
        return this.securityFeaturePref;
    }

    /**
     * Gets the value of the physChallFeaturePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physChallFeaturePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysChallFeaturePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysChallFeaturePref }
     * 
     * 
     */
    public List<PhysChallFeaturePref> getPhysChallFeaturePref() {
        if (physChallFeaturePref == null) {
            physChallFeaturePref = new ArrayList<PhysChallFeaturePref>();
        }
        return this.physChallFeaturePref;
    }

    /**
     * Gets the value of the specRequestPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specRequestPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecRequestPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecRequestPref }
     * 
     * 
     */
    public List<SpecRequestPref> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPref>();
        }
        return this.specRequestPref;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPrefPreferLevel }
     *     
     */
    public HotelPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return HotelPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPrefPreferLevel }
     *     
     */
    public void setPreferLevel(HotelPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPrefShareSynchInd }
     *     
     */
    public HotelPrefShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPrefShareSynchInd }
     *     
     */
    public void setShareSynchInd(HotelPrefShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPrefShareMarketInd }
     *     
     */
    public HotelPrefShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPrefShareMarketInd }
     *     
     */
    public void setShareMarketInd(HotelPrefShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
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
     * Gets the value of the hotelGuestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelGuestType() {
        return hotelGuestType;
    }

    /**
     * Sets the value of the hotelGuestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelGuestType(String value) {
        this.hotelGuestType = value;
    }

}
