
package wsimport.lib.axamansard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MotorObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotorObject">
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
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LGA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExistingCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentificationType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdentificationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarMake" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CarModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueOfCar" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="VehicleEngineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleChassisNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearOfManufacture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleRegistrationPlace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VehicleInspectionState" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VehicleInspectionCity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VehicleInspectionAddress" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Premium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InsStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BodyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "MotorObject", propOrder = {
    "title",
    "sourceID",
    "transactionReference",
    "surname",
    "firstname",
    "otherNames",
    "dob",
    "mobileNo",
    "email",
    "address",
    "state",
    "lga",
    "existingCustomer",
    "customerNo",
    "identificationType",
    "identificationNo",
    "carMake",
    "carModel",
    "valueOfCar",
    "vehicleEngineNo",
    "vehicleChassisNo",
    "regNo",
    "yearOfManufacture",
    "vehicleRegistrationPlace",
    "vehicleInspectionState",
    "vehicleInspectionCity",
    "vehicleInspectionAddress",
    "premium",
    "insStartDate",
    "policyCode",
    "policyName",
    "bodyType",
    "policyKey",
    "generatedCertificate"
})
public class MotorObject {

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
    @XmlElement(name = "IdentificationType")
    protected long identificationType;
    @XmlElement(name = "IdentificationNo")
    protected String identificationNo;
    @XmlElement(name = "CarMake")
    protected long carMake;
    @XmlElement(name = "CarModel")
    protected String carModel;
    @XmlElement(name = "ValueOfCar", required = true)
    protected BigDecimal valueOfCar;
    @XmlElement(name = "VehicleEngineNo")
    protected String vehicleEngineNo;
    @XmlElement(name = "VehicleChassisNo")
    protected String vehicleChassisNo;
    @XmlElement(name = "RegNo")
    protected String regNo;
    @XmlElement(name = "YearOfManufacture")
    protected String yearOfManufacture;
    @XmlElement(name = "VehicleRegistrationPlace")
    protected long vehicleRegistrationPlace;
    @XmlElement(name = "VehicleInspectionState")
    protected long vehicleInspectionState;
    @XmlElement(name = "VehicleInspectionCity")
    protected long vehicleInspectionCity;
    @XmlElement(name = "VehicleInspectionAddress")
    protected long vehicleInspectionAddress;
    @XmlElement(name = "Premium", required = true)
    protected BigDecimal premium;
    @XmlElement(name = "InsStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insStartDate;
    @XmlElement(name = "PolicyCode")
    protected String policyCode;
    @XmlElement(name = "PolicyName")
    protected String policyName;
    @XmlElement(name = "BodyType")
    protected String bodyType;
    @XmlElement(name = "PolicyKey")
    protected String policyKey;
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
     * Gets the value of the carMake property.
     * 
     */
    public long getCarMake() {
        return carMake;
    }

    /**
     * Sets the value of the carMake property.
     * 
     */
    public void setCarMake(long value) {
        this.carMake = value;
    }

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
    }

    /**
     * Gets the value of the valueOfCar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValueOfCar() {
        return valueOfCar;
    }

    /**
     * Sets the value of the valueOfCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValueOfCar(BigDecimal value) {
        this.valueOfCar = value;
    }

    /**
     * Gets the value of the vehicleEngineNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleEngineNo() {
        return vehicleEngineNo;
    }

    /**
     * Sets the value of the vehicleEngineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleEngineNo(String value) {
        this.vehicleEngineNo = value;
    }

    /**
     * Gets the value of the vehicleChassisNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleChassisNo() {
        return vehicleChassisNo;
    }

    /**
     * Sets the value of the vehicleChassisNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleChassisNo(String value) {
        this.vehicleChassisNo = value;
    }

    /**
     * Gets the value of the regNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * Sets the value of the regNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNo(String value) {
        this.regNo = value;
    }

    /**
     * Gets the value of the yearOfManufacture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     * Sets the value of the yearOfManufacture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearOfManufacture(String value) {
        this.yearOfManufacture = value;
    }

    /**
     * Gets the value of the vehicleRegistrationPlace property.
     * 
     */
    public long getVehicleRegistrationPlace() {
        return vehicleRegistrationPlace;
    }

    /**
     * Sets the value of the vehicleRegistrationPlace property.
     * 
     */
    public void setVehicleRegistrationPlace(long value) {
        this.vehicleRegistrationPlace = value;
    }

    /**
     * Gets the value of the vehicleInspectionState property.
     * 
     */
    public long getVehicleInspectionState() {
        return vehicleInspectionState;
    }

    /**
     * Sets the value of the vehicleInspectionState property.
     * 
     */
    public void setVehicleInspectionState(long value) {
        this.vehicleInspectionState = value;
    }

    /**
     * Gets the value of the vehicleInspectionCity property.
     * 
     */
    public long getVehicleInspectionCity() {
        return vehicleInspectionCity;
    }

    /**
     * Sets the value of the vehicleInspectionCity property.
     * 
     */
    public void setVehicleInspectionCity(long value) {
        this.vehicleInspectionCity = value;
    }

    /**
     * Gets the value of the vehicleInspectionAddress property.
     * 
     */
    public long getVehicleInspectionAddress() {
        return vehicleInspectionAddress;
    }

    /**
     * Sets the value of the vehicleInspectionAddress property.
     * 
     */
    public void setVehicleInspectionAddress(long value) {
        this.vehicleInspectionAddress = value;
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
     * Gets the value of the insStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsStartDate() {
        return insStartDate;
    }

    /**
     * Sets the value of the insStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsStartDate(XMLGregorianCalendar value) {
        this.insStartDate = value;
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
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Gets the value of the bodyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * Sets the value of the bodyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyType(String value) {
        this.bodyType = value;
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

}
