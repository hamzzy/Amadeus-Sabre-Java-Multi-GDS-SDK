
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AncillaryEticketInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryEticketInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuanceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfIssuance" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PlaceOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalIndicatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndorsableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endorsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AncillaryTicketRemark" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryTicketRemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AncillaryTicketCoupon" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryTicketCouponType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AncillaryTicketFareInfo" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryTicketFareInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AncillaryTicketFOP" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryTicketFOPType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryEticketInfoType", propOrder = {
    "documentNumber",
    "issuanceTypeCode",
    "issuanceType",
    "dateOfIssuance",
    "placeOfIssue",
    "internationalIndicatorCode",
    "internationalIndicator",
    "iataNumber",
    "endorsableCode",
    "endorsable",
    "ancillaryTicketRemark",
    "ancillaryTicketCoupon",
    "ancillaryTicketFareInfo",
    "ancillaryTicketFOP"
})
public class AncillaryEticketInfoType {

    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "IssuanceTypeCode")
    protected String issuanceTypeCode;
    @XmlElement(name = "IssuanceType")
    protected String issuanceType;
    @XmlElement(name = "DateOfIssuance", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfIssuance;
    @XmlElement(name = "PlaceOfIssue")
    protected String placeOfIssue;
    @XmlElement(name = "InternationalIndicatorCode")
    protected String internationalIndicatorCode;
    @XmlElement(name = "InternationalIndicator")
    protected String internationalIndicator;
    @XmlElement(name = "IATANumber")
    protected String iataNumber;
    @XmlElement(name = "EndorsableCode")
    protected String endorsableCode;
    @XmlElement(name = "Endorsable")
    protected String endorsable;
    @XmlElement(name = "AncillaryTicketRemark")
    protected List<AncillaryTicketRemarkType> ancillaryTicketRemark;
    @XmlElement(name = "AncillaryTicketCoupon")
    protected List<AncillaryTicketCouponType> ancillaryTicketCoupon;
    @XmlElement(name = "AncillaryTicketFareInfo")
    protected List<AncillaryTicketFareInfoType> ancillaryTicketFareInfo;
    @XmlElement(name = "AncillaryTicketFOP")
    protected AncillaryTicketFOPType ancillaryTicketFOP;

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the issuanceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceTypeCode() {
        return issuanceTypeCode;
    }

    /**
     * Sets the value of the issuanceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuanceTypeCode(String value) {
        this.issuanceTypeCode = value;
    }

    /**
     * Gets the value of the issuanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceType() {
        return issuanceType;
    }

    /**
     * Sets the value of the issuanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuanceType(String value) {
        this.issuanceType = value;
    }

    /**
     * Gets the value of the dateOfIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfIssuance() {
        return dateOfIssuance;
    }

    /**
     * Sets the value of the dateOfIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfIssuance(XMLGregorianCalendar value) {
        this.dateOfIssuance = value;
    }

    /**
     * Gets the value of the placeOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    /**
     * Sets the value of the placeOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfIssue(String value) {
        this.placeOfIssue = value;
    }

    /**
     * Gets the value of the internationalIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalIndicatorCode() {
        return internationalIndicatorCode;
    }

    /**
     * Sets the value of the internationalIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalIndicatorCode(String value) {
        this.internationalIndicatorCode = value;
    }

    /**
     * Gets the value of the internationalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalIndicator() {
        return internationalIndicator;
    }

    /**
     * Sets the value of the internationalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalIndicator(String value) {
        this.internationalIndicator = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
    }

    /**
     * Gets the value of the endorsableCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsableCode() {
        return endorsableCode;
    }

    /**
     * Sets the value of the endorsableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsableCode(String value) {
        this.endorsableCode = value;
    }

    /**
     * Gets the value of the endorsable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsable() {
        return endorsable;
    }

    /**
     * Sets the value of the endorsable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsable(String value) {
        this.endorsable = value;
    }

    /**
     * Gets the value of the ancillaryTicketRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryTicketRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryTicketRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryTicketRemarkType }
     * 
     * 
     */
    public List<AncillaryTicketRemarkType> getAncillaryTicketRemark() {
        if (ancillaryTicketRemark == null) {
            ancillaryTicketRemark = new ArrayList<AncillaryTicketRemarkType>();
        }
        return this.ancillaryTicketRemark;
    }

    /**
     * Gets the value of the ancillaryTicketCoupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryTicketCoupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryTicketCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryTicketCouponType }
     * 
     * 
     */
    public List<AncillaryTicketCouponType> getAncillaryTicketCoupon() {
        if (ancillaryTicketCoupon == null) {
            ancillaryTicketCoupon = new ArrayList<AncillaryTicketCouponType>();
        }
        return this.ancillaryTicketCoupon;
    }

    /**
     * Gets the value of the ancillaryTicketFareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryTicketFareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryTicketFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryTicketFareInfoType }
     * 
     * 
     */
    public List<AncillaryTicketFareInfoType> getAncillaryTicketFareInfo() {
        if (ancillaryTicketFareInfo == null) {
            ancillaryTicketFareInfo = new ArrayList<AncillaryTicketFareInfoType>();
        }
        return this.ancillaryTicketFareInfo;
    }

    /**
     * Gets the value of the ancillaryTicketFOP property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryTicketFOPType }
     *     
     */
    public AncillaryTicketFOPType getAncillaryTicketFOP() {
        return ancillaryTicketFOP;
    }

    /**
     * Sets the value of the ancillaryTicketFOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryTicketFOPType }
     *     
     */
    public void setAncillaryTicketFOP(AncillaryTicketFOPType value) {
        this.ancillaryTicketFOP = value;
    }

}
