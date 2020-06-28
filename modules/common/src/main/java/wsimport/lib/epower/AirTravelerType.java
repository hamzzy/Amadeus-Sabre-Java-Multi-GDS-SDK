
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AirTravelerType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AirTravelerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfBaggages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfBaggages1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HandLuggages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HandLuggages1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LCCParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="IsSpeedyBoarding" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="IsOnlineCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CheckInOption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CheckInOption1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProfileRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PersonName" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AreaCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PhoneType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}PhoneTypeEnum" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>EmailType">
 *                 &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AddressType">
 *                 &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VendorCode">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Document" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}DocumentType">
 *                 &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerTypeQuantity" type="{http://epowerv5.amadeus.com.tr/WS}PassengerTypeQuantityType" minOccurs="0"/>
 *         &lt;element name="TravelerRefNumber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SurnameRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightSegmentRPHs" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfString3" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Gender">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Male"/>
 *             &lt;enumeration value="Female"/>
 *             &lt;enumeration value="Unknown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccompaniedByInfant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirTravelerType", propOrder = {
//    "numberOfBaggages",
//    "numberOfBaggages1",
//    "handLuggages",
//    "handLuggages1",
    "lccParameters",
    "profileRef",
    "personName",
    "telephone",
    "email",
    "address",
    "custLoyalty",
    "document",
    "passengerTypeQuantity",
    "travelerRefNumber",
    "flightSegmentRPHs",
    "birthDate"
})
@XmlSeeAlso({
    wsimport.lib.epower.TravelerInfoType.AirTraveler.class
})
public class AirTravelerType {

    @XmlTransient
//    @XmlElement(name = "NumberOfBaggages")
    protected int numberOfBaggages;
    @XmlTransient
//    @XmlElement(name = "NumberOfBaggages1")
    protected int numberOfBaggages1;
    @XmlTransient
//    @XmlElement(name = "HandLuggages")
    protected int handLuggages;
    @XmlTransient
//    @XmlElement(name = "HandLuggages1")
    protected int handLuggages1;
    @XmlElement(name = "LCCParameters")
    protected AirTravelerType.LCCParameters lccParameters;
    @XmlElement(name = "ProfileRef")
    protected AirTravelerType.ProfileRef profileRef;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "Telephone")
    protected List<AirTravelerType.Telephone> telephone;
    @XmlElement(name = "Email")
    protected List<AirTravelerType.Email> email;
    @XmlElement(name = "Address")
    protected List<AirTravelerType.Address> address;
    @XmlElement(name = "CustLoyalty")
    protected List<AirTravelerType.CustLoyalty> custLoyalty;
    @XmlElement(name = "Document")
    protected List<AirTravelerType.Document> document;
    @XmlElement(name = "PassengerTypeQuantity")
    protected PassengerTypeQuantityType passengerTypeQuantity;
    @XmlElement(name = "TravelerRefNumber")
    protected AirTravelerType.TravelerRefNumber travelerRefNumber;
    @XmlElement(name = "FlightSegmentRPHs")
    protected ArrayOfString3 flightSegmentRPHs;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "AccompaniedByInfant")
    protected Boolean accompaniedByInfant;

    /**
     * Gets the value of the numberOfBaggages property.
     *
     */
    public int getNumberOfBaggages() {
        return numberOfBaggages;
    }

    /**
     * Sets the value of the numberOfBaggages property.
     *
     */
    public void setNumberOfBaggages(int value) {
        this.numberOfBaggages = value;
    }

    /**
     * Gets the value of the numberOfBaggages1 property.
     *
     */
    public int getNumberOfBaggages1() {
        return numberOfBaggages1;
    }

    /**
     * Sets the value of the numberOfBaggages1 property.
     *
     */
    public void setNumberOfBaggages1(int value) {
        this.numberOfBaggages1 = value;
    }

    /**
     * Gets the value of the handLuggages property.
     *
     */
    public int getHandLuggages() {
        return handLuggages;
    }

    /**
     * Sets the value of the handLuggages property.
     *
     */
    public void setHandLuggages(int value) {
        this.handLuggages = value;
    }

    /**
     * Gets the value of the handLuggages1 property.
     *
     */
    public int getHandLuggages1() {
        return handLuggages1;
    }

    /**
     * Sets the value of the handLuggages1 property.
     *
     */
    public void setHandLuggages1(int value) {
        this.handLuggages1 = value;
    }

    /**
     * Gets the value of the lccParameters property.
     *
     * @return
     *     possible object is
     *     {@link AirTravelerType.LCCParameters }
     *
     */
    public AirTravelerType.LCCParameters getLCCParameters() {
        return lccParameters;
    }

    /**
     * Sets the value of the lccParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link AirTravelerType.LCCParameters }
     *
     */
    public void setLCCParameters(AirTravelerType.LCCParameters value) {
        this.lccParameters = value;
    }

    /**
     * Gets the value of the profileRef property.
     *
     * @return
     *     possible object is
     *     {@link AirTravelerType.ProfileRef }
     *
     */
    public AirTravelerType.ProfileRef getProfileRef() {
        return profileRef;
    }

    /**
     * Sets the value of the profileRef property.
     *
     * @param value
     *     allowed object is
     *     {@link AirTravelerType.ProfileRef }
     *
     */
    public void setProfileRef(AirTravelerType.ProfileRef value) {
        this.profileRef = value;
    }

    /**
     * Gets the value of the personName property.
     *
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     *
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
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
     * {@link AirTravelerType.Telephone }
     *
     *
     */
    public List<AirTravelerType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<AirTravelerType.Telephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the email property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTravelerType.Email }
     *
     *
     */
    public List<AirTravelerType.Email> getEmail() {
        if (email == null) {
            email = new ArrayList<AirTravelerType.Email>();
        }
        return this.email;
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
     * {@link AirTravelerType.Address }
     *
     *
     */
    public List<AirTravelerType.Address> getAddress() {
        if (address == null) {
            address = new ArrayList<AirTravelerType.Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the custLoyalty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTravelerType.CustLoyalty }
     *
     *
     */
    public List<AirTravelerType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<AirTravelerType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the document property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTravelerType.Document }
     *
     *
     */
    public List<AirTravelerType.Document> getDocument() {
        if (document == null) {
            document = new ArrayList<AirTravelerType.Document>();
        }
        return this.document;
    }

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
     * Gets the value of the travelerRefNumber property.
     *
     * @return
     *     possible object is
     *     {@link AirTravelerType.TravelerRefNumber }
     *
     */
    public AirTravelerType.TravelerRefNumber getTravelerRefNumber() {
        return travelerRefNumber;
    }

    /**
     * Sets the value of the travelerRefNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link AirTravelerType.TravelerRefNumber }
     *
     */
    public void setTravelerRefNumber(AirTravelerType.TravelerRefNumber value) {
        this.travelerRefNumber = value;
    }

    /**
     * Gets the value of the flightSegmentRPHs property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfString3 }
     *
     */
    public ArrayOfString3 getFlightSegmentRPHs() {
        return flightSegmentRPHs;
    }

    /**
     * Sets the value of the flightSegmentRPHs property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfString3 }
     *
     */
    public void setFlightSegmentRPHs(ArrayOfString3 value) {
        this.flightSegmentRPHs = value;
    }

    /**
     * Gets the value of the birthDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the currencyCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Gets the value of the accompaniedByInfant property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAccompaniedByInfant() {
        return accompaniedByInfant;
    }

    /**
     * Sets the value of the accompaniedByInfant property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAccompaniedByInfant(Boolean value) {
        this.accompaniedByInfant = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AddressType">
     *       &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
        extends AddressType
    {

        @XmlAttribute(name = "Operation")
        protected ActionType operation;

        /**
         * Gets the value of the operation property.
         *
         * @return
         *     possible object is
         *     {@link ActionType }
         *
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         *
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *
         */
        public void setOperation(ActionType value) {
            this.operation = value;
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
     *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VendorCode">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CustLoyalty {

        @XmlAttribute(name = "ProgramID")
        protected String programID;
        @XmlAttribute(name = "MembershipID")
        protected String membershipID;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "VendorCode")
        protected List<String> vendorCode;
        @XmlAttribute(name = "Operation")
        protected ActionType operation;

        /**
         * Gets the value of the programID property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * Sets the value of the programID property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * Gets the value of the membershipID property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * Sets the value of the membershipID property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
        }

        /**
         * Gets the value of the travelSector property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Sets the value of the travelSector property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

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
         * Gets the value of the vendorCode property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         *
         *
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * Gets the value of the operation property.
         *
         * @return
         *     possible object is
         *     {@link ActionType }
         *
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         *
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *
         */
        public void setOperation(ActionType value) {
            this.operation = value;
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
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}DocumentType">
     *       &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Document
        extends DocumentType
    {

        @XmlAttribute(name = "Operation")
        protected ActionType operation;

        /**
         * Gets the value of the operation property.
         *
         * @return
         *     possible object is
         *     {@link ActionType }
         *
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         *
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *
         */
        public void setOperation(ActionType value) {
            this.operation = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>EmailType">
     *       &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Email
        extends EmailType
    {

        @XmlAttribute(name = "Operation")
        protected ActionType operation;

        /**
         * Gets the value of the operation property.
         *
         * @return
         *     possible object is
         *     {@link ActionType }
         *
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         *
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *
         */
        public void setOperation(ActionType value) {
            this.operation = value;
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
     *       &lt;attribute name="IsSpeedyBoarding" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="IsOnlineCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CheckInOption" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CheckInOption1" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LCCParameters {

        @XmlAttribute(name = "IsSpeedyBoarding")
        protected Boolean isSpeedyBoarding;
        @XmlAttribute(name = "IsOnlineCheckIn")
        protected Boolean isOnlineCheckIn;
        @XmlAttribute(name = "CheckInOption")
        protected String checkInOption;
        @XmlAttribute(name = "CheckInOption1")
        protected String checkInOption1;

        /**
         * Gets the value of the isSpeedyBoarding property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isIsSpeedyBoarding() {
            return isSpeedyBoarding;
        }

        /**
         * Sets the value of the isSpeedyBoarding property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setIsSpeedyBoarding(Boolean value) {
            this.isSpeedyBoarding = value;
        }

        /**
         * Gets the value of the isOnlineCheckIn property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isIsOnlineCheckIn() {
            return isOnlineCheckIn;
        }

        /**
         * Sets the value of the isOnlineCheckIn property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setIsOnlineCheckIn(Boolean value) {
            this.isOnlineCheckIn = value;
        }

        /**
         * Gets the value of the checkInOption property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCheckInOption() {
            return checkInOption;
        }

        /**
         * Sets the value of the checkInOption property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCheckInOption(String value) {
            this.checkInOption = value;
        }

        /**
         * Gets the value of the checkInOption1 property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCheckInOption1() {
            return checkInOption1;
        }

        /**
         * Sets the value of the checkInOption1 property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCheckInOption1(String value) {
            this.checkInOption1 = value;
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
     *         &lt;element name="UniqueID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
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
        "uniqueID"
    })
    public static class ProfileRef {

        @XmlElement(name = "UniqueID")
        protected UniqueIDType uniqueID;

        /**
         * Gets the value of the uniqueID property.
         *
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *
         */
        public UniqueIDType getUniqueID() {
            return uniqueID;
        }

        /**
         * Sets the value of the uniqueID property.
         *
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *
         */
        public void setUniqueID(UniqueIDType value) {
            this.uniqueID = value;
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
     *       &lt;attribute name="AreaCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PhoneType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}PhoneTypeEnum" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Operation" type="{http://epowerv5.amadeus.com.tr/WS}ActionType" />
     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {

        @XmlAttribute(name = "AreaCityCode")
        protected String areaCityCode;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "PhoneNumber")
        protected String phoneNumber;
        @XmlAttribute(name = "PhoneType", required = true)
        protected PhoneTypeEnum phoneType;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Operation")
        protected ActionType operation;
        @XmlAttribute(name = "LocationCode")
        protected String locationCode;

        /**
         * Gets the value of the areaCityCode property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAreaCityCode() {
            return areaCityCode;
        }

        /**
         * Sets the value of the areaCityCode property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAreaCityCode(String value) {
            this.areaCityCode = value;
        }

        /**
         * Gets the value of the countryCode property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the phoneType property.
         *
         * @return
         *     possible object is
         *     {@link PhoneTypeEnum }
         *
         */
        public PhoneTypeEnum getPhoneType() {
            return phoneType;
        }

        /**
         * Sets the value of the phoneType property.
         *
         * @param value
         *     allowed object is
         *     {@link PhoneTypeEnum }
         *
         */
        public void setPhoneType(PhoneTypeEnum value) {
            this.phoneType = value;
        }

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
         * Gets the value of the operation property.
         *
         * @return
         *     possible object is
         *     {@link ActionType }
         *
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         *
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *
         */
        public void setOperation(ActionType value) {
            this.operation = value;
        }

        /**
         * Gets the value of the locationCode property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * Sets the value of the locationCode property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
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
