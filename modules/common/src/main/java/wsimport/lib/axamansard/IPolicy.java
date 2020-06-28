
package wsimport.lib.axamansard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for iPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoverStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CoverEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CertificateUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iPolicy", propOrder = {
    "policyID",
    "policyNo",
    "policyKey",
    "customerNo",
    "coverStartDate",
    "coverEndDate",
    "certificateUrl"
})
public class IPolicy {

    @XmlElement(name = "PolicyID")
    protected String policyID;
    @XmlElement(name = "PolicyNo")
    protected String policyNo;
    @XmlElement(name = "PolicyKey")
    protected String policyKey;
    @XmlElement(name = "CustomerNo")
    protected String customerNo;
    @XmlElement(name = "CoverStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar coverStartDate;
    @XmlElement(name = "CoverEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar coverEndDate;
    @XmlElement(name = "CertificateUrl")
    protected String certificateUrl;

    /**
     * Gets the value of the policyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyID() {
        return policyID;
    }

    /**
     * Sets the value of the policyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyID(String value) {
        this.policyID = value;
    }

    /**
     * Gets the value of the policyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNo() {
        return policyNo;
    }

    /**
     * Sets the value of the policyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNo(String value) {
        this.policyNo = value;
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
     * Gets the value of the coverEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverEndDate() {
        return coverEndDate;
    }

    /**
     * Sets the value of the coverEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoverEndDate(XMLGregorianCalendar value) {
        this.coverEndDate = value;
    }

    /**
     * Gets the value of the certificateUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateUrl() {
        return certificateUrl;
    }

    /**
     * Sets the value of the certificateUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateUrl(String value) {
        this.certificateUrl = value;
    }

}
