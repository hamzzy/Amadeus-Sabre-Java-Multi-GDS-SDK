
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchTravelerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchTravelerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://epowerv5.amadeus.com.tr/WS}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="CitizenCountryName" type="{http://epowerv5.amadeus.com.tr/WS}SearchTravelerTypeCitizenCountryName" minOccurs="0"/>
 *         &lt;element name="IndCoverageReqs" type="{http://epowerv5.amadeus.com.tr/WS}IndCoverageReqsType" minOccurs="0"/>
 *         &lt;element name="PassengerType" type="{http://epowerv5.amadeus.com.tr/WS}PassengerTypeQuantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchTravelerType", propOrder = {
    "address",
    "citizenCountryName",
    "indCoverageReqs",
    "passengerType"
})
public class SearchTravelerType {

    @XmlElement(name = "Address")
    protected AddressInfoType address;
    @XmlElement(name = "CitizenCountryName")
    protected SearchTravelerTypeCitizenCountryName citizenCountryName;
    @XmlElement(name = "IndCoverageReqs")
    protected IndCoverageReqsType indCoverageReqs;
    @XmlElement(name = "PassengerType")
    protected PassengerTypeQuantityType passengerType;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "Age")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger age;
    @XmlAttribute(name = "Relation")
    protected String relation;
    @XmlAttribute(name = "Gender")
    protected String gender;

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
     * Gets the value of the citizenCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTravelerTypeCitizenCountryName }
     *     
     */
    public SearchTravelerTypeCitizenCountryName getCitizenCountryName() {
        return citizenCountryName;
    }

    /**
     * Sets the value of the citizenCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTravelerTypeCitizenCountryName }
     *     
     */
    public void setCitizenCountryName(SearchTravelerTypeCitizenCountryName value) {
        this.citizenCountryName = value;
    }

    /**
     * Gets the value of the indCoverageReqs property.
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsType }
     *     
     */
    public IndCoverageReqsType getIndCoverageReqs() {
        return indCoverageReqs;
    }

    /**
     * Sets the value of the indCoverageReqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsType }
     *     
     */
    public void setIndCoverageReqs(IndCoverageReqsType value) {
        this.indCoverageReqs = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public PassengerTypeQuantityType getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public void setPassengerType(PassengerTypeQuantityType value) {
        this.passengerType = value;
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
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
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

}
