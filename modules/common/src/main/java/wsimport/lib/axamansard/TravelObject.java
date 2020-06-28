
package wsimport.lib.axamansard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TravelObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SourceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Religion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LGA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExistingCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GeographicalCoverage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NoOfPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SelectedOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PurposeOfTrip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CoverStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PolicyKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportDataPage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="DataPageExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupMembers" type="{http://tempuri.org/}ArrayOfTravelGroupMembers" minOccurs="0"/>
 *         &lt;element name="TransactionReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeneratedCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelObject", propOrder = {
    "title",
    "sourceID",
    "surname",
    "firstname",
    "otherNames",
    "birthDate",
    "occupation",
    "countryOfResidence",
    "nationality",
    "maritalStatus",
    "religion",
    "sex",
    "mobileNo",
    "email",
    "passportNo",
    "address",
    "state",
    "lga",
    "existingCustomer",
    "customerNo",
    "insuranceType",
    "geographicalCoverage",
    "plan",
    "policyType",
    "noOfPersons",
    "selectedOptions",
    "duration",
    "amount",
    "destination",
    "purposeOfTrip",
    "coverStartDate",
    "policyKey",
    "passportDataPage",
    "dataPageExtension",
    "groupMembers",
    "transactionReference",
    "generatedCertificate"
})
public class TravelObject {

    @XmlElement(name = "Title")
    protected int title;
    @XmlElement(name = "SourceID")
    protected int sourceID;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "Firstname")
    protected String firstname;
    @XmlElement(name = "OtherNames")
    protected String otherNames;
    @XmlElement(name = "BirthDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "Occupation")
    protected int occupation;
    @XmlElement(name = "CountryOfResidence")
    protected int countryOfResidence;
    @XmlElement(name = "Nationality")
    protected int nationality;
    @XmlElement(name = "MaritalStatus")
    protected int maritalStatus;
    @XmlElement(name = "Religion")
    protected int religion;
    @XmlElement(name = "Sex")
    protected int sex;
    @XmlElement(name = "MobileNo")
    protected String mobileNo;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "PassportNo")
    protected String passportNo;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "LGA")
    protected int lga;
    @XmlElement(name = "ExistingCustomer")
    protected boolean existingCustomer;
    @XmlElement(name = "CustomerNo")
    protected String customerNo;
    @XmlElement(name = "InsuranceType")
    protected int insuranceType;
    @XmlElement(name = "GeographicalCoverage")
    protected int geographicalCoverage;
    @XmlElement(name = "Plan")
    protected String plan;
    @XmlElement(name = "PolicyType")
    protected int policyType;
    @XmlElement(name = "NoOfPersons")
    protected int noOfPersons;
    @XmlElement(name = "SelectedOptions")
    protected String selectedOptions;
    @XmlElement(name = "Duration")
    protected int duration;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Destination")
    protected int destination;
    @XmlElement(name = "PurposeOfTrip")
    protected int purposeOfTrip;
    @XmlElement(name = "CoverStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar coverStartDate;
    @XmlElement(name = "PolicyKey")
    protected String policyKey;
    @XmlElement(name = "PassportDataPage")
    protected byte[] passportDataPage;
    @XmlElement(name = "DataPageExtension")
    protected String dataPageExtension;
    @XmlElement(name = "GroupMembers")
    protected ArrayOfTravelGroupMembers groupMembers;
    @XmlElement(name = "TransactionReference")
    protected String transactionReference;
    @XmlElement(name = "GeneratedCertificate")
    protected String generatedCertificate;

    /**
     * Gets the value of the title property.
     * 
     */
    public int getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     */
    public void setTitle(int value) {
        this.title = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     */
    public int getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     */
    public void setSourceID(int value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the otherNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNames() {
        return otherNames;
    }

    /**
     * Sets the value of the otherNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNames(String value) {
        this.otherNames = value;
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
     * Gets the value of the occupation property.
     * 
     */
    public int getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     */
    public void setOccupation(int value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the countryOfResidence property.
     * 
     */
    public int getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     */
    public void setCountryOfResidence(int value) {
        this.countryOfResidence = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     */
    public int getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     */
    public void setNationality(int value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     */
    public int getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     */
    public void setMaritalStatus(int value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the religion property.
     * 
     */
    public int getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     */
    public void setReligion(int value) {
        this.religion = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     */
    public int getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     */
    public void setSex(int value) {
        this.sex = value;
    }

    /**
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
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
     * Gets the value of the passportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * Sets the value of the passportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNo(String value) {
        this.passportNo = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the state property.
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * Gets the value of the lga property.
     * 
     */
    public int getLGA() {
        return lga;
    }

    /**
     * Sets the value of the lga property.
     * 
     */
    public void setLGA(int value) {
        this.lga = value;
    }

    /**
     * Gets the value of the existingCustomer property.
     * 
     */
    public boolean isExistingCustomer() {
        return existingCustomer;
    }

    /**
     * Sets the value of the existingCustomer property.
     * 
     */
    public void setExistingCustomer(boolean value) {
        this.existingCustomer = value;
    }

    /**
     * Gets the value of the customerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNo(String value) {
        this.customerNo = value;
    }

    /**
     * Gets the value of the insuranceType property.
     * 
     */
    public int getInsuranceType() {
        return insuranceType;
    }

    /**
     * Sets the value of the insuranceType property.
     * 
     */
    public void setInsuranceType(int value) {
        this.insuranceType = value;
    }

    /**
     * Gets the value of the geographicalCoverage property.
     * 
     */
    public int getGeographicalCoverage() {
        return geographicalCoverage;
    }

    /**
     * Sets the value of the geographicalCoverage property.
     * 
     */
    public void setGeographicalCoverage(int value) {
        this.geographicalCoverage = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlan(String value) {
        this.plan = value;
    }

    /**
     * Gets the value of the policyType property.
     * 
     */
    public int getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     */
    public void setPolicyType(int value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the noOfPersons property.
     * 
     */
    public int getNoOfPersons() {
        return noOfPersons;
    }

    /**
     * Sets the value of the noOfPersons property.
     * 
     */
    public void setNoOfPersons(int value) {
        this.noOfPersons = value;
    }

    /**
     * Gets the value of the selectedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedOptions() {
        return selectedOptions;
    }

    /**
     * Sets the value of the selectedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedOptions(String value) {
        this.selectedOptions = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(int value) {
        this.duration = value;
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
     * Gets the value of the destination property.
     * 
     */
    public int getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     */
    public void setDestination(int value) {
        this.destination = value;
    }

    /**
     * Gets the value of the purposeOfTrip property.
     * 
     */
    public int getPurposeOfTrip() {
        return purposeOfTrip;
    }

    /**
     * Sets the value of the purposeOfTrip property.
     * 
     */
    public void setPurposeOfTrip(int value) {
        this.purposeOfTrip = value;
    }

    /**
     * Gets the value of the coverStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverStartDate() {
        return coverStartDate;
    }

    /**
     * Sets the value of the coverStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoverStartDate(XMLGregorianCalendar value) {
        this.coverStartDate = value;
    }

    /**
     * Gets the value of the policyKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyKey() {
        return policyKey;
    }

    /**
     * Sets the value of the policyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyKey(String value) {
        this.policyKey = value;
    }

    /**
     * Gets the value of the passportDataPage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPassportDataPage() {
        return passportDataPage;
    }

    /**
     * Sets the value of the passportDataPage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPassportDataPage(byte[] value) {
        this.passportDataPage = value;
    }

    /**
     * Gets the value of the dataPageExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPageExtension() {
        return dataPageExtension;
    }

    /**
     * Sets the value of the dataPageExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPageExtension(String value) {
        this.dataPageExtension = value;
    }

    /**
     * Gets the value of the groupMembers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTravelGroupMembers }
     *     
     */
    public ArrayOfTravelGroupMembers getGroupMembers() {
        return groupMembers;
    }

    /**
     * Sets the value of the groupMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTravelGroupMembers }
     *     
     */
    public void setGroupMembers(ArrayOfTravelGroupMembers value) {
        this.groupMembers = value;
    }

    /**
     * Gets the value of the transactionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReference(String value) {
        this.transactionReference = value;
    }

    /**
     * Gets the value of the generatedCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratedCertificate() {
        return generatedCertificate;
    }

    /**
     * Sets the value of the generatedCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratedCertificate(String value) {
        this.generatedCertificate = value;
    }

}
