
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}PassengerDB">
 *       &lt;sequence>
 *         &lt;element name="ExtraProperties" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfNameValueTypeItem" minOccurs="0"/>
 *         &lt;element name="IsEticketAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsEticketRequestAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExtraSettings" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfNameValueTypeItem" minOccurs="0"/>
 *         &lt;element name="CorporateUserGroupID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="GuestUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HashedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasswordAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HashedPasswordAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasswordQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemberDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsApprovedMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PortalID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCallMeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Passengers" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPassengerDB" minOccurs="0"/>
 *         &lt;element name="UserCulture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCreditCardAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CurrentAccountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ACurrentAccountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AccountAmountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tolerance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorporateID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="VirtualCorporateID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Registration1" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Registration2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ContactPerson" type="{http://epowerv5.amadeus.com.tr/WS}Person" minOccurs="0"/>
 *         &lt;element name="UserCorporate" type="{http://epowerv5.amadeus.com.tr/WS}Corporate" minOccurs="0"/>
 *         &lt;element name="TravelApprovers" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="TravelArrangers" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="IsTravelApprover" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsTravelArranger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ApproverNotRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ModifyProfile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BookingAllow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowToAccessCorpReports" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PRDADMIN" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UICustRights" type="{http://epowerv5.amadeus.com.tr/WS}UICustomizationsRights"/>
 *         &lt;element name="UIMigrationUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "extraProperties",
    "isEticketAllowed",
    "isEticketRequestAllowed",
    "extraSettings",
    "corporateUserGroupID",
    "guestUserId",
    "userName",
    "password",
    "hashedPassword",
    "salt",
    "passwordAnswer",
    "hashedPasswordAnswer",
    "passwordQuestion",
    "memberDate",
    "isApprovedMember",
    "portalID",
    "email",
    "isCallMeAllowed",
    "passengers",
    "userCulture",
    "isCreditCardAllowed",
    "currentAccountAmount",
    "aCurrentAccountAmount",
    "accountAmountCurrency",
    "tolerance",
    "corporateID",
    "virtualCorporateID",
    "registration1",
    "registration2",
    "contactPerson",
    "userCorporate",
    "travelApprovers",
    "travelArrangers",
    "isTravelApprover",
    "isTravelArranger",
    "approverNotRequired",
    "modifyProfile",
    "bookingAllow",
    "isLocked",
    "allowToAccessCorpReports",
    "prdadmin",
    "uiCustRights",
    "uiMigrationUser"
})
public class User
    extends PassengerDB
{

    @XmlElement(name = "ExtraProperties")
    protected ArrayOfNameValueTypeItem extraProperties;
    @XmlElement(name = "IsEticketAllowed", required = true, type = Boolean.class, nillable = true)
    protected Boolean isEticketAllowed;
    @XmlElement(name = "IsEticketRequestAllowed", required = true, type = Boolean.class, nillable = true)
    protected Boolean isEticketRequestAllowed;
    @XmlElement(name = "ExtraSettings")
    protected ArrayOfNameValueTypeItem extraSettings;
    @XmlElement(name = "CorporateUserGroupID", required = true, nillable = true)
    protected String corporateUserGroupID;
    @XmlElement(name = "GuestUserId")
    protected String guestUserId;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "HashedPassword")
    protected String hashedPassword;
    @XmlElement(name = "Salt")
    protected String salt;
    @XmlElement(name = "PasswordAnswer")
    protected String passwordAnswer;
    @XmlElement(name = "HashedPasswordAnswer")
    protected String hashedPasswordAnswer;
    @XmlElement(name = "PasswordQuestion")
    protected String passwordQuestion;
    @XmlElement(name = "MemberDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar memberDate;
    @XmlElement(name = "IsApprovedMember", required = true, type = Boolean.class, nillable = true)
    protected Boolean isApprovedMember;
    @XmlElement(name = "PortalID", required = true, nillable = true)
    protected String portalID;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "IsCallMeAllowed", required = true, type = Boolean.class, nillable = true)
    protected Boolean isCallMeAllowed;
    @XmlElement(name = "Passengers")
    protected ArrayOfPassengerDB passengers;
    @XmlElement(name = "UserCulture")
    protected String userCulture;
    @XmlElement(name = "IsCreditCardAllowed", required = true, type = Boolean.class, nillable = true)
    protected Boolean isCreditCardAllowed;
    @XmlElement(name = "CurrentAccountAmount", required = true, nillable = true)
    protected BigDecimal currentAccountAmount;
    @XmlElement(name = "ACurrentAccountAmount", required = true, nillable = true)
    protected BigDecimal aCurrentAccountAmount;
    @XmlElement(name = "AccountAmountCurrency")
    protected String accountAmountCurrency;
    @XmlElement(name = "Tolerance")
    protected String tolerance;
    @XmlElement(name = "CorporateID", required = true, nillable = true)
    protected String corporateID;
    @XmlElement(name = "VirtualCorporateID", required = true, nillable = true)
    protected String virtualCorporateID;
    @XmlElement(name = "Registration1", required = true, type = Boolean.class, nillable = true)
    protected Boolean registration1;
    @XmlElement(name = "Registration2", required = true, type = Boolean.class, nillable = true)
    protected Boolean registration2;
    @XmlElement(name = "ContactPerson")
    protected Person contactPerson;
    @XmlElement(name = "UserCorporate")
    protected Corporate userCorporate;
    @XmlElement(name = "TravelApprovers")
    protected ArrayOfUser travelApprovers;
    @XmlElement(name = "TravelArrangers")
    protected ArrayOfUser travelArrangers;
    @XmlElement(name = "IsTravelApprover", required = true, type = Boolean.class, nillable = true)
    protected Boolean isTravelApprover;
    @XmlElement(name = "IsTravelArranger", required = true, type = Boolean.class, nillable = true)
    protected Boolean isTravelArranger;
    @XmlElement(name = "ApproverNotRequired", required = true, type = Boolean.class, nillable = true)
    protected Boolean approverNotRequired;
    @XmlElement(name = "ModifyProfile", required = true, type = Boolean.class, nillable = true)
    protected Boolean modifyProfile;
    @XmlElement(name = "BookingAllow")
    protected String bookingAllow;
    @XmlElement(name = "IsLocked", required = true, type = Boolean.class, nillable = true)
    protected Boolean isLocked;
    @XmlElement(name = "AllowToAccessCorpReports", required = true, type = Boolean.class, nillable = true)
    protected Boolean allowToAccessCorpReports;
    @XmlElement(name = "PRDADMIN", required = true, type = Boolean.class, nillable = true)
    protected Boolean prdadmin;
    @XmlList
    @XmlElement(name = "UICustRights", required = true, nillable = true)
    protected List<String> uiCustRights;
    @XmlElement(name = "UIMigrationUser", required = true, type = Boolean.class, nillable = true)
    protected Boolean uiMigrationUser;

    /**
     * Gets the value of the extraProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNameValueTypeItem }
     *     
     */
    public ArrayOfNameValueTypeItem getExtraProperties() {
        return extraProperties;
    }

    /**
     * Sets the value of the extraProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNameValueTypeItem }
     *     
     */
    public void setExtraProperties(ArrayOfNameValueTypeItem value) {
        this.extraProperties = value;
    }

    /**
     * Gets the value of the isEticketAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEticketAllowed() {
        return isEticketAllowed;
    }

    /**
     * Sets the value of the isEticketAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEticketAllowed(Boolean value) {
        this.isEticketAllowed = value;
    }

    /**
     * Gets the value of the isEticketRequestAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEticketRequestAllowed() {
        return isEticketRequestAllowed;
    }

    /**
     * Sets the value of the isEticketRequestAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEticketRequestAllowed(Boolean value) {
        this.isEticketRequestAllowed = value;
    }

    /**
     * Gets the value of the extraSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNameValueTypeItem }
     *     
     */
    public ArrayOfNameValueTypeItem getExtraSettings() {
        return extraSettings;
    }

    /**
     * Sets the value of the extraSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNameValueTypeItem }
     *     
     */
    public void setExtraSettings(ArrayOfNameValueTypeItem value) {
        this.extraSettings = value;
    }

    /**
     * Gets the value of the corporateUserGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateUserGroupID() {
        return corporateUserGroupID;
    }

    /**
     * Sets the value of the corporateUserGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateUserGroupID(String value) {
        this.corporateUserGroupID = value;
    }

    /**
     * Gets the value of the guestUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestUserId() {
        return guestUserId;
    }

    /**
     * Sets the value of the guestUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestUserId(String value) {
        this.guestUserId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the hashedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedPassword() {
        return hashedPassword;
    }

    /**
     * Sets the value of the hashedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedPassword(String value) {
        this.hashedPassword = value;
    }

    /**
     * Gets the value of the salt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Sets the value of the salt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalt(String value) {
        this.salt = value;
    }

    /**
     * Gets the value of the passwordAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordAnswer() {
        return passwordAnswer;
    }

    /**
     * Sets the value of the passwordAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordAnswer(String value) {
        this.passwordAnswer = value;
    }

    /**
     * Gets the value of the hashedPasswordAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedPasswordAnswer() {
        return hashedPasswordAnswer;
    }

    /**
     * Sets the value of the hashedPasswordAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedPasswordAnswer(String value) {
        this.hashedPasswordAnswer = value;
    }

    /**
     * Gets the value of the passwordQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordQuestion() {
        return passwordQuestion;
    }

    /**
     * Sets the value of the passwordQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordQuestion(String value) {
        this.passwordQuestion = value;
    }

    /**
     * Gets the value of the memberDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMemberDate() {
        return memberDate;
    }

    /**
     * Sets the value of the memberDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMemberDate(XMLGregorianCalendar value) {
        this.memberDate = value;
    }

    /**
     * Gets the value of the isApprovedMember property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsApprovedMember() {
        return isApprovedMember;
    }

    /**
     * Sets the value of the isApprovedMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsApprovedMember(Boolean value) {
        this.isApprovedMember = value;
    }

    /**
     * Gets the value of the portalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalID() {
        return portalID;
    }

    /**
     * Sets the value of the portalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalID(String value) {
        this.portalID = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the isCallMeAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCallMeAllowed() {
        return isCallMeAllowed;
    }

    /**
     * Sets the value of the isCallMeAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallMeAllowed(Boolean value) {
        this.isCallMeAllowed = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPassengerDB }
     *     
     */
    public ArrayOfPassengerDB getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPassengerDB }
     *     
     */
    public void setPassengers(ArrayOfPassengerDB value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the userCulture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCulture() {
        return userCulture;
    }

    /**
     * Sets the value of the userCulture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCulture(String value) {
        this.userCulture = value;
    }

    /**
     * Gets the value of the isCreditCardAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreditCardAllowed() {
        return isCreditCardAllowed;
    }

    /**
     * Sets the value of the isCreditCardAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCreditCardAllowed(Boolean value) {
        this.isCreditCardAllowed = value;
    }

    /**
     * Gets the value of the currentAccountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentAccountAmount() {
        return currentAccountAmount;
    }

    /**
     * Sets the value of the currentAccountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentAccountAmount(BigDecimal value) {
        this.currentAccountAmount = value;
    }

    /**
     * Gets the value of the aCurrentAccountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACurrentAccountAmount() {
        return aCurrentAccountAmount;
    }

    /**
     * Sets the value of the aCurrentAccountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACurrentAccountAmount(BigDecimal value) {
        this.aCurrentAccountAmount = value;
    }

    /**
     * Gets the value of the accountAmountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAmountCurrency() {
        return accountAmountCurrency;
    }

    /**
     * Sets the value of the accountAmountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAmountCurrency(String value) {
        this.accountAmountCurrency = value;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTolerance(String value) {
        this.tolerance = value;
    }

    /**
     * Gets the value of the corporateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateID() {
        return corporateID;
    }

    /**
     * Sets the value of the corporateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateID(String value) {
        this.corporateID = value;
    }

    /**
     * Gets the value of the virtualCorporateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualCorporateID() {
        return virtualCorporateID;
    }

    /**
     * Sets the value of the virtualCorporateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualCorporateID(String value) {
        this.virtualCorporateID = value;
    }

    /**
     * Gets the value of the registration1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistration1() {
        return registration1;
    }

    /**
     * Sets the value of the registration1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistration1(Boolean value) {
        this.registration1 = value;
    }

    /**
     * Gets the value of the registration2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistration2() {
        return registration2;
    }

    /**
     * Sets the value of the registration2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistration2(Boolean value) {
        this.registration2 = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setContactPerson(Person value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the userCorporate property.
     * 
     * @return
     *     possible object is
     *     {@link Corporate }
     *     
     */
    public Corporate getUserCorporate() {
        return userCorporate;
    }

    /**
     * Sets the value of the userCorporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Corporate }
     *     
     */
    public void setUserCorporate(Corporate value) {
        this.userCorporate = value;
    }

    /**
     * Gets the value of the travelApprovers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getTravelApprovers() {
        return travelApprovers;
    }

    /**
     * Sets the value of the travelApprovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setTravelApprovers(ArrayOfUser value) {
        this.travelApprovers = value;
    }

    /**
     * Gets the value of the travelArrangers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getTravelArrangers() {
        return travelArrangers;
    }

    /**
     * Sets the value of the travelArrangers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setTravelArrangers(ArrayOfUser value) {
        this.travelArrangers = value;
    }

    /**
     * Gets the value of the isTravelApprover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTravelApprover() {
        return isTravelApprover;
    }

    /**
     * Sets the value of the isTravelApprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTravelApprover(Boolean value) {
        this.isTravelApprover = value;
    }

    /**
     * Gets the value of the isTravelArranger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTravelArranger() {
        return isTravelArranger;
    }

    /**
     * Sets the value of the isTravelArranger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTravelArranger(Boolean value) {
        this.isTravelArranger = value;
    }

    /**
     * Gets the value of the approverNotRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproverNotRequired() {
        return approverNotRequired;
    }

    /**
     * Sets the value of the approverNotRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproverNotRequired(Boolean value) {
        this.approverNotRequired = value;
    }

    /**
     * Gets the value of the modifyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifyProfile() {
        return modifyProfile;
    }

    /**
     * Sets the value of the modifyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifyProfile(Boolean value) {
        this.modifyProfile = value;
    }

    /**
     * Gets the value of the bookingAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingAllow() {
        return bookingAllow;
    }

    /**
     * Sets the value of the bookingAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingAllow(String value) {
        this.bookingAllow = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }

    /**
     * Gets the value of the allowToAccessCorpReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowToAccessCorpReports() {
        return allowToAccessCorpReports;
    }

    /**
     * Sets the value of the allowToAccessCorpReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowToAccessCorpReports(Boolean value) {
        this.allowToAccessCorpReports = value;
    }

    /**
     * Gets the value of the prdadmin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPRDADMIN() {
        return prdadmin;
    }

    /**
     * Sets the value of the prdadmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPRDADMIN(Boolean value) {
        this.prdadmin = value;
    }

    /**
     * Gets the value of the uiCustRights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uiCustRights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUICustRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUICustRights() {
        if (uiCustRights == null) {
            uiCustRights = new ArrayList<String>();
        }
        return this.uiCustRights;
    }

    /**
     * Gets the value of the uiMigrationUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUIMigrationUser() {
        return uiMigrationUser;
    }

    /**
     * Sets the value of the uiMigrationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUIMigrationUser(Boolean value) {
        this.uiMigrationUser = value;
    }

}
