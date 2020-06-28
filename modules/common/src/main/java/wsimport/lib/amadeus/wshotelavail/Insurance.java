
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Insurance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Insurance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuredName" type="{http://traveltalk.com/wsHotelAvail}InsuredName" minOccurs="0"/>
 *         &lt;element name="InsuranceCompany" type="{http://traveltalk.com/wsHotelAvail}InsuranceCompany" minOccurs="0"/>
 *         &lt;element name="Underwriter" type="{http://traveltalk.com/wsHotelAvail}Underwriter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}InsuranceShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}InsuranceShareMarketInd" />
 *       &lt;attribute name="InsuranceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Insurance", propOrder = {
    "insuredName",
    "insuranceCompany",
    "underwriter"
})
public class Insurance {

    @XmlElement(name = "InsuredName")
    protected InsuredName insuredName;
    @XmlElement(name = "InsuranceCompany")
    protected InsuranceCompany insuranceCompany;
    @XmlElement(name = "Underwriter")
    protected Underwriter underwriter;
    @XmlAttribute(name = "ShareSynchInd")
    protected InsuranceShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected InsuranceShareMarketInd shareMarketInd;
    @XmlAttribute(name = "InsuranceType")
    protected String insuranceType;
    @XmlAttribute(name = "PolicyNumber")
    protected String policyNumber;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link InsuredName }
     *     
     */
    public InsuredName getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuredName }
     *     
     */
    public void setInsuredName(InsuredName value) {
        this.insuredName = value;
    }

    /**
     * Gets the value of the insuranceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCompany }
     *     
     */
    public InsuranceCompany getInsuranceCompany() {
        return insuranceCompany;
    }

    /**
     * Sets the value of the insuranceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCompany }
     *     
     */
    public void setInsuranceCompany(InsuranceCompany value) {
        this.insuranceCompany = value;
    }

    /**
     * Gets the value of the underwriter property.
     * 
     * @return
     *     possible object is
     *     {@link Underwriter }
     *     
     */
    public Underwriter getUnderwriter() {
        return underwriter;
    }

    /**
     * Sets the value of the underwriter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Underwriter }
     *     
     */
    public void setUnderwriter(Underwriter value) {
        this.underwriter = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceShareSynchInd }
     *     
     */
    public InsuranceShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceShareSynchInd }
     *     
     */
    public void setShareSynchInd(InsuranceShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceShareMarketInd }
     *     
     */
    public InsuranceShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceShareMarketInd }
     *     
     */
    public void setShareMarketInd(InsuranceShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the insuranceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * Sets the value of the insuranceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceType(String value) {
        this.insuranceType = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
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

}
