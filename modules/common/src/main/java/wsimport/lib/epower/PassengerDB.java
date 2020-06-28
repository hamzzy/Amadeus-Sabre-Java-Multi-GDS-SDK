
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PassengerDB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerDB">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}Person">
 *       &lt;sequence>
 *         &lt;element name="PassengerDetails" type="{http://epowerv5.amadeus.com.tr/WS}PassengerDetails" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="FormOfIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormOfIdentificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormOfIdentificationCreditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormOfIdentificationExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FormOfIdentificationIssueLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentityNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerDB", propOrder = {
    "passengerDetails",
    "typeCode",
    "userID",
    "formOfIdentification",
    "formOfIdentificationType",
    "formOfIdentificationCreditCardType",
    "formOfIdentificationExpirationDate",
    "formOfIdentificationIssueLocation",
    "identityNo"
})
@XmlSeeAlso({
    User.class
})
public class PassengerDB
    extends Person
{

    @XmlElement(name = "PassengerDetails")
    protected PassengerDetails passengerDetails;
    @XmlElement(name = "TypeCode")
    protected String typeCode;
    @XmlElement(name = "UserID", required = true, nillable = true)
    protected String userID;
    @XmlElement(name = "FormOfIdentification")
    protected String formOfIdentification;
    @XmlElement(name = "FormOfIdentificationType")
    protected String formOfIdentificationType;
    @XmlElement(name = "FormOfIdentificationCreditCardType")
    protected String formOfIdentificationCreditCardType;
    @XmlElement(name = "FormOfIdentificationExpirationDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar formOfIdentificationExpirationDate;
    @XmlElement(name = "FormOfIdentificationIssueLocation")
    protected String formOfIdentificationIssueLocation;
    @XmlElement(name = "IdentityNo")
    protected String identityNo;

    /**
     * Gets the value of the passengerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerDetails }
     *     
     */
    public PassengerDetails getPassengerDetails() {
        return passengerDetails;
    }

    /**
     * Sets the value of the passengerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerDetails }
     *     
     */
    public void setPassengerDetails(PassengerDetails value) {
        this.passengerDetails = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the formOfIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfIdentification() {
        return formOfIdentification;
    }

    /**
     * Sets the value of the formOfIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfIdentification(String value) {
        this.formOfIdentification = value;
    }

    /**
     * Gets the value of the formOfIdentificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfIdentificationType() {
        return formOfIdentificationType;
    }

    /**
     * Sets the value of the formOfIdentificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfIdentificationType(String value) {
        this.formOfIdentificationType = value;
    }

    /**
     * Gets the value of the formOfIdentificationCreditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfIdentificationCreditCardType() {
        return formOfIdentificationCreditCardType;
    }

    /**
     * Sets the value of the formOfIdentificationCreditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfIdentificationCreditCardType(String value) {
        this.formOfIdentificationCreditCardType = value;
    }

    /**
     * Gets the value of the formOfIdentificationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFormOfIdentificationExpirationDate() {
        return formOfIdentificationExpirationDate;
    }

    /**
     * Sets the value of the formOfIdentificationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFormOfIdentificationExpirationDate(XMLGregorianCalendar value) {
        this.formOfIdentificationExpirationDate = value;
    }

    /**
     * Gets the value of the formOfIdentificationIssueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfIdentificationIssueLocation() {
        return formOfIdentificationIssueLocation;
    }

    /**
     * Sets the value of the formOfIdentificationIssueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfIdentificationIssueLocation(String value) {
        this.formOfIdentificationIssueLocation = value;
    }

    /**
     * Gets the value of the identityNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * Sets the value of the identityNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityNo(String value) {
        this.identityNo = value;
    }

}
