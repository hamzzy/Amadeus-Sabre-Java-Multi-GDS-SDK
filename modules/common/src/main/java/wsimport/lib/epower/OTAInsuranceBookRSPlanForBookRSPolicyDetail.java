
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
 * <p>Java class for OTA_InsuranceBookRSPlanForBookRSPolicyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsuranceBookRSPlanForBookRSPolicyDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyNumber" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="RefNumber" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PlanRestrictions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPlanRestrictionTypePlanRestriction" minOccurs="0"/>
 *         &lt;element name="PolicyDetailURL" type="{http://epowerv5.amadeus.com.tr/WS}URL_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
@XmlType(name = "OTA_InsuranceBookRSPlanForBookRSPolicyDetail", propOrder = {
    "policyNumber",
    "refNumber",
    "planRestrictions",
    "policyDetailURL"
})
public class OTAInsuranceBookRSPlanForBookRSPolicyDetail {

    @XmlElement(name = "PolicyNumber")
    protected UniqueIDType policyNumber;
    @XmlElement(name = "RefNumber")
    protected List<UniqueIDType> refNumber;
    @XmlElement(name = "PlanRestrictions")
    protected ArrayOfPlanRestrictionTypePlanRestriction planRestrictions;
    @XmlElement(name = "PolicyDetailURL")
    protected URLType policyDetailURL;
    @XmlAttribute(name = "OrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setPolicyNumber(UniqueIDType value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getRefNumber() {
        if (refNumber == null) {
            refNumber = new ArrayList<UniqueIDType>();
        }
        return this.refNumber;
    }

    /**
     * Gets the value of the planRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPlanRestrictionTypePlanRestriction }
     *     
     */
    public ArrayOfPlanRestrictionTypePlanRestriction getPlanRestrictions() {
        return planRestrictions;
    }

    /**
     * Sets the value of the planRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPlanRestrictionTypePlanRestriction }
     *     
     */
    public void setPlanRestrictions(ArrayOfPlanRestrictionTypePlanRestriction value) {
        this.planRestrictions = value;
    }

    /**
     * Gets the value of the policyDetailURL property.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getPolicyDetailURL() {
        return policyDetailURL;
    }

    /**
     * Sets the value of the policyDetailURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setPolicyDetailURL(URLType value) {
        this.policyDetailURL = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
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
