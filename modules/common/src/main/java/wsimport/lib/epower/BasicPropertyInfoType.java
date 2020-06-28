
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicPropertyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicPropertyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Guarentee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Deposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Safety" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FireSafety" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transportation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Images" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ExtraCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BestTransportationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddRoomOccupant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbnailImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://epowerv5.amadeus.com.tr/WS}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="ContactNumbers" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfBasicPropertyInfoTypeContactNumber" minOccurs="0"/>
 *         &lt;element name="Award" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Introduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelativePosition" type="{http://epowerv5.amadeus.com.tr/WS}RelativePositionType" minOccurs="0"/>
 *         &lt;element name="HotelAmenity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recreation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Policy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelSegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicPropertyInfoType", propOrder = {
    "guarentee",
    "stay",
    "deposit",
    "safety",
    "fireSafety",
    "transportation",
    "tax",
    "meals",
    "images",
    "extraCharges",
    "bestTransportationType",
    "addRoomOccupant",
    "thumbnailImage",
    "position",
    "address",
    "contactNumbers",
    "award",
    "introduction",
    "relativePosition",
    "hotelAmenity",
    "recreation",
    "service",
    "policy"
})
@XmlSeeAlso({
    PropertyValueMatchType.class
})
public class BasicPropertyInfoType {

    @XmlElement(name = "Guarentee")
    protected String guarentee;
    @XmlElement(name = "Stay")
    protected String stay;
    @XmlElement(name = "Deposit")
    protected String deposit;
    @XmlElement(name = "Safety")
    protected String safety;
    @XmlElement(name = "FireSafety")
    protected String fireSafety;
    @XmlElement(name = "Transportation")
    protected String transportation;
    @XmlElement(name = "Tax")
    protected String tax;
    @XmlElement(name = "Meals")
    protected String meals;
    @XmlElement(name = "Images")
    protected ArrayOfString images;
    @XmlElement(name = "ExtraCharges")
    protected String extraCharges;
    @XmlElement(name = "BestTransportationType")
    protected String bestTransportationType;
    @XmlElement(name = "AddRoomOccupant")
    protected String addRoomOccupant;
    @XmlElement(name = "ThumbnailImage")
    protected String thumbnailImage;
    @XmlElement(name = "Position")
    protected BasicPropertyInfoType.Position position;
    @XmlElement(name = "Address")
    protected AddressInfoType address;
    @XmlElement(name = "ContactNumbers")
    protected ArrayOfBasicPropertyInfoTypeContactNumber contactNumbers;
    @XmlElement(name = "Award")
    protected List<BasicPropertyInfoType.Award> award;
    @XmlElement(name = "Introduction")
    protected String introduction;
    @XmlElement(name = "RelativePosition")
    protected RelativePositionType relativePosition;
    @XmlElement(name = "HotelAmenity")
    protected List<BasicPropertyInfoType.HotelAmenity> hotelAmenity;
    @XmlElement(name = "Recreation")
    protected List<BasicPropertyInfoType.Recreation> recreation;
    @XmlElement(name = "Service")
    protected List<BasicPropertyInfoType.Service> service;
    @XmlElement(name = "Policy")
    protected String policy;
    @XmlAttribute(name = "HotelID", required = true)
    protected int hotelID;
    @XmlAttribute(name = "ChainCode")
    protected String chainCode;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelCityCode")
    protected String hotelCityCode;
    @XmlAttribute(name = "HotelName")
    protected String hotelName;
    @XmlAttribute(name = "HotelCodeContext")
    protected String hotelCodeContext;
    @XmlAttribute(name = "ChainName")
    protected String chainName;
    @XmlAttribute(name = "BrandName")
    protected String brandName;
    @XmlAttribute(name = "HotelSegmentCategoryCode")
    protected String hotelSegmentCategoryCode;
    @XmlAttribute(name = "SupplierIntegrationLevel")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger supplierIntegrationLevel;

    /**
     * Gets the value of the guarentee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarentee() {
        return guarentee;
    }

    /**
     * Sets the value of the guarentee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarentee(String value) {
        this.guarentee = value;
    }

    /**
     * Gets the value of the stay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStay() {
        return stay;
    }

    /**
     * Sets the value of the stay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStay(String value) {
        this.stay = value;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeposit(String value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the safety property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafety() {
        return safety;
    }

    /**
     * Sets the value of the safety property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafety(String value) {
        this.safety = value;
    }

    /**
     * Gets the value of the fireSafety property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFireSafety() {
        return fireSafety;
    }

    /**
     * Sets the value of the fireSafety property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFireSafety(String value) {
        this.fireSafety = value;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportation() {
        return transportation;
    }

    /**
     * Sets the value of the transportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportation(String value) {
        this.transportation = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax(String value) {
        this.tax = value;
    }

    /**
     * Gets the value of the meals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeals() {
        return meals;
    }

    /**
     * Sets the value of the meals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeals(String value) {
        this.meals = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setImages(ArrayOfString value) {
        this.images = value;
    }

    /**
     * Gets the value of the extraCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraCharges() {
        return extraCharges;
    }

    /**
     * Sets the value of the extraCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraCharges(String value) {
        this.extraCharges = value;
    }

    /**
     * Gets the value of the bestTransportationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestTransportationType() {
        return bestTransportationType;
    }

    /**
     * Sets the value of the bestTransportationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestTransportationType(String value) {
        this.bestTransportationType = value;
    }

    /**
     * Gets the value of the addRoomOccupant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddRoomOccupant() {
        return addRoomOccupant;
    }

    /**
     * Sets the value of the addRoomOccupant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddRoomOccupant(String value) {
        this.addRoomOccupant = value;
    }

    /**
     * Gets the value of the thumbnailImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     * Sets the value of the thumbnailImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailImage(String value) {
        this.thumbnailImage = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfoType.Position }
     *     
     */
    public BasicPropertyInfoType.Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfoType.Position }
     *     
     */
    public void setPosition(BasicPropertyInfoType.Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddress(AddressInfoType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBasicPropertyInfoTypeContactNumber }
     *     
     */
    public ArrayOfBasicPropertyInfoTypeContactNumber getContactNumbers() {
        return contactNumbers;
    }

    /**
     * Sets the value of the contactNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBasicPropertyInfoTypeContactNumber }
     *     
     */
    public void setContactNumbers(ArrayOfBasicPropertyInfoTypeContactNumber value) {
        this.contactNumbers = value;
    }

    /**
     * Gets the value of the award property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.Award }
     * 
     * 
     */
    public List<BasicPropertyInfoType.Award> getAward() {
        if (award == null) {
            award = new ArrayList<BasicPropertyInfoType.Award>();
        }
        return this.award;
    }

    /**
     * Gets the value of the introduction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * Sets the value of the introduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroduction(String value) {
        this.introduction = value;
    }

    /**
     * Gets the value of the relativePosition property.
     * 
     * @return
     *     possible object is
     *     {@link RelativePositionType }
     *     
     */
    public RelativePositionType getRelativePosition() {
        return relativePosition;
    }

    /**
     * Sets the value of the relativePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativePositionType }
     *     
     */
    public void setRelativePosition(RelativePositionType value) {
        this.relativePosition = value;
    }

    /**
     * Gets the value of the hotelAmenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelAmenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.HotelAmenity }
     * 
     * 
     */
    public List<BasicPropertyInfoType.HotelAmenity> getHotelAmenity() {
        if (hotelAmenity == null) {
            hotelAmenity = new ArrayList<BasicPropertyInfoType.HotelAmenity>();
        }
        return this.hotelAmenity;
    }

    /**
     * Gets the value of the recreation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recreation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecreation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.Recreation }
     * 
     * 
     */
    public List<BasicPropertyInfoType.Recreation> getRecreation() {
        if (recreation == null) {
            recreation = new ArrayList<BasicPropertyInfoType.Recreation>();
        }
        return this.recreation;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicPropertyInfoType.Service }
     * 
     * 
     */
    public List<BasicPropertyInfoType.Service> getService() {
        if (service == null) {
            service = new ArrayList<BasicPropertyInfoType.Service>();
        }
        return this.service;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicy(String value) {
        this.policy = value;
    }

    /**
     * Gets the value of the hotelID property.
     * 
     */
    public int getHotelID() {
        return hotelID;
    }

    /**
     * Sets the value of the hotelID property.
     * 
     */
    public void setHotelID(int value) {
        this.hotelID = value;
    }

    /**
     * Gets the value of the chainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * Sets the value of the chainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the hotelCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCityCode() {
        return hotelCityCode;
    }

    /**
     * Sets the value of the hotelCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCityCode(String value) {
        this.hotelCityCode = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the hotelCodeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCodeContext() {
        return hotelCodeContext;
    }

    /**
     * Sets the value of the hotelCodeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCodeContext(String value) {
        this.hotelCodeContext = value;
    }

    /**
     * Gets the value of the chainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * Sets the value of the chainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the hotelSegmentCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelSegmentCategoryCode() {
        return hotelSegmentCategoryCode;
    }

    /**
     * Sets the value of the hotelSegmentCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelSegmentCategoryCode(String value) {
        this.hotelSegmentCategoryCode = value;
    }

    /**
     * Gets the value of the supplierIntegrationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupplierIntegrationLevel() {
        return supplierIntegrationLevel;
    }

    /**
     * Sets the value of the supplierIntegrationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupplierIntegrationLevel(BigInteger value) {
        this.supplierIntegrationLevel = value;
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
     *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Award {

        @XmlAttribute(name = "Provider")
        protected String provider;
        @XmlAttribute(name = "Rating")
        protected String rating;

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvider() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * Gets the value of the rating property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRating() {
            return rating;
        }

        /**
         * Sets the value of the rating property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRating(String value) {
            this.rating = value;
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
    public static class HotelAmenity {

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
     *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Position {

        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the altitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * Sets the value of the altitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * Gets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * Sets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
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
    public static class Recreation {

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
     *       &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Service {

        @XmlAttribute(name = "BusinessServiceCode")
        protected String businessServiceCode;

        /**
         * Gets the value of the businessServiceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessServiceCode() {
            return businessServiceCode;
        }

        /**
         * Sets the value of the businessServiceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessServiceCode(String value) {
            this.businessServiceCode = value;
        }

    }

}
