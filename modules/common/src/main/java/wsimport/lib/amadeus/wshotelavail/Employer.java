
package wsimport.lib.amadeus.wshotelavail;

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
 * <p>Java class for Employer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://traveltalk.com/wsHotelAvail}CompanyName" minOccurs="0"/>
 *         &lt;element name="RelatedEmployer" type="{http://traveltalk.com/wsHotelAvail}RelatedEmployer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmployeeInfo" type="{http://traveltalk.com/wsHotelAvail}EmployeeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InternalRefNmbr" type="{http://traveltalk.com/wsHotelAvail}InternalRefNmbr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelArranger" type="{http://traveltalk.com/wsHotelAvail}TravelArranger" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyProgram" type="{http://traveltalk.com/wsHotelAvail}LoyaltyProgram" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OfficeType" type="{http://traveltalk.com/wsHotelAvail}EmployerOfficeType" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employer", propOrder = {
    "companyName",
    "relatedEmployer",
    "employeeInfo",
    "internalRefNmbr",
    "travelArranger",
    "loyaltyProgram"
})
public class Employer {

    @XmlElement(name = "CompanyName")
    protected CompanyName companyName;
    @XmlElement(name = "RelatedEmployer")
    protected List<RelatedEmployer> relatedEmployer;
    @XmlElement(name = "EmployeeInfo")
    protected List<EmployeeInfo> employeeInfo;
    @XmlElement(name = "InternalRefNmbr")
    protected List<InternalRefNmbr> internalRefNmbr;
    @XmlElement(name = "TravelArranger")
    protected List<TravelArranger> travelArranger;
    @XmlElement(name = "LoyaltyProgram")
    protected List<LoyaltyProgram> loyaltyProgram;
    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;
    @XmlAttribute(name = "OfficeType")
    protected EmployerOfficeType officeType;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyName }
     *     
     */
    public CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyName }
     *     
     */
    public void setCompanyName(CompanyName value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the relatedEmployer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedEmployer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedEmployer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedEmployer }
     * 
     * 
     */
    public List<RelatedEmployer> getRelatedEmployer() {
        if (relatedEmployer == null) {
            relatedEmployer = new ArrayList<RelatedEmployer>();
        }
        return this.relatedEmployer;
    }

    /**
     * Gets the value of the employeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeInfo }
     * 
     * 
     */
    public List<EmployeeInfo> getEmployeeInfo() {
        if (employeeInfo == null) {
            employeeInfo = new ArrayList<EmployeeInfo>();
        }
        return this.employeeInfo;
    }

    /**
     * Gets the value of the internalRefNmbr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalRefNmbr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalRefNmbr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalRefNmbr }
     * 
     * 
     */
    public List<InternalRefNmbr> getInternalRefNmbr() {
        if (internalRefNmbr == null) {
            internalRefNmbr = new ArrayList<InternalRefNmbr>();
        }
        return this.internalRefNmbr;
    }

    /**
     * Gets the value of the travelArranger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelArranger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelArranger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelArranger }
     * 
     * 
     */
    public List<TravelArranger> getTravelArranger() {
        if (travelArranger == null) {
            travelArranger = new ArrayList<TravelArranger>();
        }
        return this.travelArranger;
    }

    /**
     * Gets the value of the loyaltyProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgram }
     * 
     * 
     */
    public List<LoyaltyProgram> getLoyaltyProgram() {
        if (loyaltyProgram == null) {
            loyaltyProgram = new ArrayList<LoyaltyProgram>();
        }
        return this.loyaltyProgram;
    }

    /**
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDefaultInd() {
        if (defaultInd == null) {
            return false;
        } else {
            return defaultInd;
        }
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultInd(Boolean value) {
        this.defaultInd = value;
    }

    /**
     * Gets the value of the officeType property.
     * 
     * @return
     *     possible object is
     *     {@link EmployerOfficeType }
     *     
     */
    public EmployerOfficeType getOfficeType() {
        return officeType;
    }

    /**
     * Sets the value of the officeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployerOfficeType }
     *     
     */
    public void setOfficeType(EmployerOfficeType value) {
        this.officeType = value;
    }

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

}
