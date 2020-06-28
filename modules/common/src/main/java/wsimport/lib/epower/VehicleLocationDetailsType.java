
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleLocationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationOpeningHours" type="{http://epowerv5.amadeus.com.tr/WS}LocationOpeningHour" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://epowerv5.amadeus.com.tr/WS}AddressInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://epowerv5.amadeus.com.tr/WS}VehicleLocationDetailsTypeTelephone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalInfo" type="{http://epowerv5.amadeus.com.tr/WS}VehicleLocationAdditionalDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AtAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LocationAgency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AssocAirportLocList">
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
@XmlType(name = "VehicleLocationDetailsType", propOrder = {
    "locationOpeningHours",
    "address",
    "telephone",
    "additionalInfo"
})
@XmlSeeAlso({
    OTAVehRateRuleRSLocationDetails.class
})
public class VehicleLocationDetailsType {

    @XmlElement(name = "LocationOpeningHours")
    protected List<LocationOpeningHour> locationOpeningHours;
    @XmlElement(name = "Address")
    protected List<AddressInfoType> address;
    @XmlElement(name = "Telephone")
    protected List<VehicleLocationDetailsTypeTelephone> telephone;
    @XmlElement(name = "AdditionalInfo")
    protected VehicleLocationAdditionalDetailsType additionalInfo;
    @XmlAttribute(name = "AtAirport")
    protected Boolean atAirport;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "LocationAgency")
    protected String locationAgency;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "ExtendedLocationCode")
    protected String extendedLocationCode;
    @XmlAttribute(name = "AssocAirportLocList")
    protected List<String> assocAirportLocList;

    /**
     * Gets the value of the locationOpeningHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationOpeningHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationOpeningHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationOpeningHour }
     * 
     * 
     */
    public List<LocationOpeningHour> getLocationOpeningHours() {
        if (locationOpeningHours == null) {
            locationOpeningHours = new ArrayList<LocationOpeningHour>();
        }
        return this.locationOpeningHours;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressInfoType }
     * 
     * 
     */
    public List<AddressInfoType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressInfoType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationDetailsTypeTelephone }
     * 
     * 
     */
    public List<VehicleLocationDetailsTypeTelephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<VehicleLocationDetailsTypeTelephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsType }
     *     
     */
    public VehicleLocationAdditionalDetailsType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsType }
     *     
     */
    public void setAdditionalInfo(VehicleLocationAdditionalDetailsType value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the atAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtAirport() {
        return atAirport;
    }

    /**
     * Sets the value of the atAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtAirport(Boolean value) {
        this.atAirport = value;
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
     * Gets the value of the locationAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAgency() {
        return locationAgency;
    }

    /**
     * Sets the value of the locationAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAgency(String value) {
        this.locationAgency = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * Gets the value of the extendedLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedLocationCode() {
        return extendedLocationCode;
    }

    /**
     * Sets the value of the extendedLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedLocationCode(String value) {
        this.extendedLocationCode = value;
    }

    /**
     * Gets the value of the assocAirportLocList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assocAirportLocList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssocAirportLocList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssocAirportLocList() {
        if (assocAirportLocList == null) {
            assocAirportLocList = new ArrayList<String>();
        }
        return this.assocAirportLocList;
    }

}
