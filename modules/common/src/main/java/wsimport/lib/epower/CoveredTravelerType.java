
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CoveredTravelerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoveredTravelerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoveredPerson" type="{http://epowerv5.amadeus.com.tr/WS}CoveredTravelerTypeCoveredPerson" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://epowerv5.amadeus.com.tr/WS}EmailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://epowerv5.amadeus.com.tr/WS}AddressInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AreaCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CitizenCountryName" type="{http://epowerv5.amadeus.com.tr/WS}CoveredTravelerTypeCitizenCountryName" minOccurs="0"/>
 *         &lt;element name="Document" type="{http://epowerv5.amadeus.com.tr/WS}DocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmergencyContact" type="{http://epowerv5.amadeus.com.tr/WS}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Beneficiary" type="{http://epowerv5.amadeus.com.tr/WS}CoveredTravelerTypeBeneficiary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndCoverageReqs" type="{http://epowerv5.amadeus.com.tr/WS}IndCoverageReqsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoveredTravelerType", propOrder = {
    "coveredPerson",
    "email",
    "address",
    "telephone",
    "citizenCountryName",
    "document",
    "emergencyContact",
    "beneficiary",
    "indCoverageReqs"
})
public class CoveredTravelerType {

    @XmlElement(name = "CoveredPerson")
    protected CoveredTravelerTypeCoveredPerson coveredPerson;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlElement(name = "Address")
    protected List<AddressInfoType> address;
    @XmlElement(name = "Telephone")
    protected List<CoveredTravelerType.Telephone> telephone;
    @XmlElement(name = "CitizenCountryName")
    protected CoveredTravelerTypeCitizenCountryName citizenCountryName;
    @XmlElement(name = "Document")
    protected List<DocumentType> document;
    @XmlElement(name = "EmergencyContact")
    protected List<ContactPersonType> emergencyContact;
    @XmlElement(name = "Beneficiary")
    protected List<CoveredTravelerTypeBeneficiary> beneficiary;
    @XmlElement(name = "IndCoverageReqs")
    protected IndCoverageReqsType indCoverageReqs;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the coveredPerson property.
     * 
     * @return
     *     possible object is
     *     {@link CoveredTravelerTypeCoveredPerson }
     *     
     */
    public CoveredTravelerTypeCoveredPerson getCoveredPerson() {
        return coveredPerson;
    }

    /**
     * Sets the value of the coveredPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredTravelerTypeCoveredPerson }
     *     
     */
    public void setCoveredPerson(CoveredTravelerTypeCoveredPerson value) {
        this.coveredPerson = value;
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
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
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
     * {@link CoveredTravelerType.Telephone }
     * 
     * 
     */
    public List<CoveredTravelerType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<CoveredTravelerType.Telephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the citizenCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link CoveredTravelerTypeCitizenCountryName }
     *     
     */
    public CoveredTravelerTypeCitizenCountryName getCitizenCountryName() {
        return citizenCountryName;
    }

    /**
     * Sets the value of the citizenCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredTravelerTypeCitizenCountryName }
     *     
     */
    public void setCitizenCountryName(CoveredTravelerTypeCitizenCountryName value) {
        this.citizenCountryName = value;
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
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return this.document;
    }

    /**
     * Gets the value of the emergencyContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType }
     * 
     * 
     */
    public List<ContactPersonType> getEmergencyContact() {
        if (emergencyContact == null) {
            emergencyContact = new ArrayList<ContactPersonType>();
        }
        return this.emergencyContact;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoveredTravelerTypeBeneficiary }
     * 
     * 
     */
    public List<CoveredTravelerTypeBeneficiary> getBeneficiary() {
        if (beneficiary == null) {
            beneficiary = new ArrayList<CoveredTravelerTypeBeneficiary>();
        }
        return this.beneficiary;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AreaCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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

        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "PhoneNumber")
        protected String phoneNumber;
        @XmlAttribute(name = "AreaCityCode")
        protected String areaCityCode;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
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

    }

}
