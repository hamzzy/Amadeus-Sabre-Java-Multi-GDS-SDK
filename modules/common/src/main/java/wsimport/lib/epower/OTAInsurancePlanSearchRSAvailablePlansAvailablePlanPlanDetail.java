
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequiredDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanDescription" type="{http://epowerv5.amadeus.com.tr/WS}FormattedTextType" minOccurs="0"/>
 *         &lt;element name="PlanRulesURL" type="{http://epowerv5.amadeus.com.tr/WS}URL_Type" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="QuoteDetailURL" type="{http://epowerv5.amadeus.com.tr/WS}URL_Type" minOccurs="0"/>
 *         &lt;element name="BookingDetailURL" type="{http://epowerv5.amadeus.com.tr/WS}URL_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ParentProductName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParentProductCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail", propOrder = {
    "requiredDocumentType",
    "planDescription",
    "planRulesURL",
    "startDate",
    "endDate",
    "quoteDetailURL",
    "bookingDetailURL"
})
public class OTAInsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail {

    @XmlElement(name = "RequiredDocumentType")
    protected String requiredDocumentType;
    @XmlElement(name = "PlanDescription")
    protected FormattedTextType planDescription;
    @XmlElement(name = "PlanRulesURL")
    protected URLType planRulesURL;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "QuoteDetailURL")
    protected URLType quoteDetailURL;
    @XmlElement(name = "BookingDetailURL")
    protected URLType bookingDetailURL;
    @XmlAttribute(name = "ParentProductName")
    protected String parentProductName;
    @XmlAttribute(name = "ParentProductCode")
    protected String parentProductCode;

    /**
     * Gets the value of the requiredDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredDocumentType() {
        return requiredDocumentType;
    }

    /**
     * Sets the value of the requiredDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredDocumentType(String value) {
        this.requiredDocumentType = value;
    }

    /**
     * Gets the value of the planDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextType }
     *     
     */
    public FormattedTextType getPlanDescription() {
        return planDescription;
    }

    /**
     * Sets the value of the planDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextType }
     *     
     */
    public void setPlanDescription(FormattedTextType value) {
        this.planDescription = value;
    }

    /**
     * Gets the value of the planRulesURL property.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getPlanRulesURL() {
        return planRulesURL;
    }

    /**
     * Sets the value of the planRulesURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setPlanRulesURL(URLType value) {
        this.planRulesURL = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the quoteDetailURL property.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getQuoteDetailURL() {
        return quoteDetailURL;
    }

    /**
     * Sets the value of the quoteDetailURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setQuoteDetailURL(URLType value) {
        this.quoteDetailURL = value;
    }

    /**
     * Gets the value of the bookingDetailURL property.
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getBookingDetailURL() {
        return bookingDetailURL;
    }

    /**
     * Sets the value of the bookingDetailURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setBookingDetailURL(URLType value) {
        this.bookingDetailURL = value;
    }

    /**
     * Gets the value of the parentProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProductName() {
        return parentProductName;
    }

    /**
     * Sets the value of the parentProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProductName(String value) {
        this.parentProductName = value;
    }

    /**
     * Gets the value of the parentProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProductCode() {
        return parentProductCode;
    }

    /**
     * Sets the value of the parentProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProductCode(String value) {
        this.parentProductCode = value;
    }

}
