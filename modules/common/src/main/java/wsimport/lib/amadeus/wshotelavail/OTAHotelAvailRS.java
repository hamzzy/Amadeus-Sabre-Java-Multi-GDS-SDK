
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OTA_HotelAvailRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_HotelAvailRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Success" type="{http://traveltalk.com/wsHotelAvail}Success" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{http://traveltalk.com/wsHotelAvail}ArrayOfWarning" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://traveltalk.com/wsHotelAvail}ArrayOfProfileInfo" minOccurs="0"/>
 *         &lt;element name="RoomStays" type="{http://traveltalk.com/wsHotelAvail}RoomStays" minOccurs="0"/>
 *         &lt;element name="Areas" type="{http://traveltalk.com/wsHotelAvail}ArrayOfArea" minOccurs="0"/>
 *         &lt;element name="Criteria" type="{http://traveltalk.com/wsHotelAvail}ArrayOfCriterion" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://traveltalk.com/wsHotelAvail}ArrayOfError" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://traveltalk.com/wsHotelAvail}OTA_HotelAvailRSTarget" default="Production" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://traveltalk.com/wsHotelAvail}OTA_HotelAvailRSTransactionStatusCode" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "OTA_HotelAvailRS", propOrder = {
    "success",
    "warnings",
    "profiles",
    "roomStays",
    "areas",
    "criteria",
    "errors"
})
public class OTAHotelAvailRS {

    @XmlElement(name = "Success")
    protected Success success;
    @XmlElement(name = "Warnings")
    protected ArrayOfWarning warnings;
    @XmlElement(name = "Profiles")
    protected ArrayOfProfileInfo profiles;
    @XmlElement(name = "RoomStays")
    protected RoomStays roomStays;
    @XmlElement(name = "Areas")
    protected ArrayOfArea areas;
    @XmlElement(name = "Criteria")
    protected ArrayOfCriterion criteria;
    @XmlElement(name = "Errors")
    protected ArrayOfError errors;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTAHotelAvailRSTarget target;
    @XmlAttribute(name = "Version", required = true)
    protected double version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    protected Integer sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected OTAHotelAvailRSTransactionStatusCode transactionStatusCode;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    protected String altLangID;

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link Success }
     *     
     */
    public Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link Success }
     *     
     */
    public void setSuccess(Success value) {
        this.success = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileInfo }
     *     
     */
    public ArrayOfProfileInfo getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileInfo }
     *     
     */
    public void setProfiles(ArrayOfProfileInfo value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the roomStays property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStays }
     *     
     */
    public RoomStays getRoomStays() {
        return roomStays;
    }

    /**
     * Sets the value of the roomStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStays }
     *     
     */
    public void setRoomStays(RoomStays value) {
        this.roomStays = value;
    }

    /**
     * Gets the value of the areas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArea }
     *     
     */
    public ArrayOfArea getAreas() {
        return areas;
    }

    /**
     * Sets the value of the areas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArea }
     *     
     */
    public void setAreas(ArrayOfArea value) {
        this.areas = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCriterion }
     *     
     */
    public ArrayOfCriterion getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCriterion }
     *     
     */
    public void setCriteria(ArrayOfCriterion value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfError }
     *     
     */
    public ArrayOfError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfError }
     *     
     */
    public void setErrors(ArrayOfError value) {
        this.errors = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRSTarget }
     *     
     */
    public OTAHotelAvailRSTarget getTarget() {
        if (target == null) {
            return OTAHotelAvailRSTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRSTarget }
     *     
     */
    public void setTarget(OTAHotelAvailRSTarget value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public double getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(double value) {
        this.version = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNmbr(Integer value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRSTransactionStatusCode }
     *     
     */
    public OTAHotelAvailRSTransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRSTransactionStatusCode }
     *     
     */
    public void setTransactionStatusCode(OTAHotelAvailRSTransactionStatusCode value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

}
