
package wsimport.lib.axamansard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LifeObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifeObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SourceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TransactionReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGA" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proposedMonthlyContribution" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Premium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sumAssured" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="noOfYears" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdentificationType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdentificationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistingCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeneratedCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Beneficiaries" type="{http://tempuri.org/}ArrayOfLifeBenObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeObject", propOrder = {
    "title",
    "sourceID",
    "transactionReference",
    "surname",
    "firstname",
    "otherNames",
    "dob",
    "mobileNo",
    "email",
    "gender",
    "address",
    "state",
    "lga",
    "maritalStatus",
    "policyCode",
    "proposedMonthlyContribution",
    "premium",
    "sumAssured",
    "noOfYears",
    "identificationType",
    "identificationNo",
    "existingCustomer",
    "customerNo",
    "policyKey",
    "generatedCertificate",
    "beneficiaries"
})
public class LifeObject {

    @XmlElement(name = "Title")
    protected int title;
    @XmlElement(name = "SourceID")
    protected int sourceID;
    @XmlElement(name = "TransactionReference")
    protected String transactionReference;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "Firstname")
    protected String firstname;
    @XmlElement(name = "OtherNames")
    protected String otherNames;
    @XmlElement(name = "DOB", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "MobileNo")
    protected String mobileNo;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "LGA")
    protected long lga;
    @XmlElement(name = "MaritalStatus")
    protected int maritalStatus;
    @XmlElement(name = "PolicyCode")
    protected String policyCode;
    @XmlElement(required = true)
    protected BigDecimal proposedMonthlyContribution;
    @XmlElement(name = "Premium", required = true)
    protected BigDecimal premium;
    @XmlElement(required = true)
    protected BigDecimal sumAssured;
    protected int noOfYears;
    @XmlElement(name = "IdentificationType")
    protected long identificationType;
    @XmlElement(name = "IdentificationNo")
    protected String identificationNo;
    @XmlElement(name = "ExistingCustomer")
    protected boolean existingCustomer;
    @XmlElement(name = "CustomerNo")
    protected String customerNo;
    @XmlElement(name = "PolicyKey")
    protected String policyKey;
    @XmlElement(name = "GeneratedCertificate")
    protected String generatedCertificate;
    @XmlElement(name = "Beneficiaries")
    protected ArrayOfLifeBenObject beneficiaries;

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
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the lga property.
     * 
     */
    public long getLGA() {
        return lga;
    }

    /**
     * Sets the value of the lga property.
     * 
     */
    public void setLGA(long value) {
        this.lga = value;
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
     * Gets the value of the policyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyCode() {
        return policyCode;
    }

    /**
     * Sets the value of the policyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyCode(String value) {
        this.policyCode = value;
    }

    /**
     * Gets the value of the proposedMonthlyContribution property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProposedMonthlyContribution() {
        return proposedMonthlyContribution;
    }

    /**
     * Sets the value of the proposedMonthlyContribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProposedMonthlyContribution(BigDecimal value) {
        this.proposedMonthlyContribution = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremium(BigDecimal value) {
        this.premium = value;
    }

    /**
     * Gets the value of the sumAssured property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumAssured() {
        return sumAssured;
    }

    /**
     * Sets the value of the sumAssured property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumAssured(BigDecimal value) {
        this.sumAssured = value;
    }

    /**
     * Gets the value of the noOfYears property.
     * 
     */
    public int getNoOfYears() {
        return noOfYears;
    }

    /**
     * Sets the value of the noOfYears property.
     * 
     */
    public void setNoOfYears(int value) {
        this.noOfYears = value;
    }

    /**
     * Gets the value of the identificationType property.
     * 
     */
    public long getIdentificationType() {
        return identificationType;
    }

    /**
     * Sets the value of the identificationType property.
     * 
     */
    public void setIdentificationType(long value) {
        this.identificationType = value;
    }

    /**
     * Gets the value of the identificationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNo() {
        return identificationNo;
    }

    /**
     * Sets the value of the identificationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNo(String value) {
        this.identificationNo = value;
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

    /**
     * Gets the value of the beneficiaries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLifeBenObject }
     *     
     */
    public ArrayOfLifeBenObject getBeneficiaries() {
        return beneficiaries;
    }

    /**
     * Sets the value of the beneficiaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLifeBenObject }
     *     
     */
    public void setBeneficiaries(ArrayOfLifeBenObject value) {
        this.beneficiaries = value;
    }

}
