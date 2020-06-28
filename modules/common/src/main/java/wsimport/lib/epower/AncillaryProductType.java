
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PricedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PricedAmountInTicketCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentReference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EticketInfo" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryEticketInfoType" minOccurs="0"/>
 *         &lt;element name="PNRPassengerOrderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PNRSegmentOrderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AncillaryProductLineNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryProductType", propOrder = {
    "ssrCode",
    "airlineCode",
    "amount",
    "pricedAmount",
    "pricedAmountInTicketCurrency",
    "tax",
    "currency",
    "segmentReference",
    "description",
    "status",
    "uniqueReference",
    "confirmationNumber",
    "eticketInfo",
    "pnrPassengerOrderID",
    "pnrSegmentOrderID",
    "ancillaryProductLineNumber"
})
public class AncillaryProductType {

    @XmlElement(name = "SSRCode")
    protected String ssrCode;
    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "Amount", required = true, nillable = true)
    protected BigDecimal amount;
    @XmlElement(name = "PricedAmount", required = true, nillable = true)
    protected BigDecimal pricedAmount;
    @XmlElement(name = "PricedAmountInTicketCurrency", required = true)
    protected BigDecimal pricedAmountInTicketCurrency;
    @XmlElement(name = "Tax", required = true, nillable = true)
    protected BigDecimal tax;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "SegmentReference", required = true, type = Integer.class, nillable = true)
    protected Integer segmentReference;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "UniqueReference")
    protected String uniqueReference;
    @XmlElement(name = "ConfirmationNumber")
    protected String confirmationNumber;
    @XmlElement(name = "EticketInfo")
    protected AncillaryEticketInfoType eticketInfo;
    @XmlElement(name = "PNRPassengerOrderID", required = true, type = Integer.class, nillable = true)
    protected Integer pnrPassengerOrderID;
    @XmlElement(name = "PNRSegmentOrderID", required = true, type = Integer.class, nillable = true)
    protected Integer pnrSegmentOrderID;
    @XmlElement(name = "AncillaryProductLineNumber", required = true, type = Integer.class, nillable = true)
    protected Integer ancillaryProductLineNumber;

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the pricedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricedAmount() {
        return pricedAmount;
    }

    /**
     * Sets the value of the pricedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricedAmount(BigDecimal value) {
        this.pricedAmount = value;
    }

    /**
     * Gets the value of the pricedAmountInTicketCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricedAmountInTicketCurrency() {
        return pricedAmountInTicketCurrency;
    }

    /**
     * Sets the value of the pricedAmountInTicketCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricedAmountInTicketCurrency(BigDecimal value) {
        this.pricedAmountInTicketCurrency = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the segmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentReference(Integer value) {
        this.segmentReference = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the uniqueReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueReference() {
        return uniqueReference;
    }

    /**
     * Sets the value of the uniqueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueReference(String value) {
        this.uniqueReference = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the eticketInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryEticketInfoType }
     *     
     */
    public AncillaryEticketInfoType getEticketInfo() {
        return eticketInfo;
    }

    /**
     * Sets the value of the eticketInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryEticketInfoType }
     *     
     */
    public void setEticketInfo(AncillaryEticketInfoType value) {
        this.eticketInfo = value;
    }

    /**
     * Gets the value of the pnrPassengerOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPNRPassengerOrderID() {
        return pnrPassengerOrderID;
    }

    /**
     * Sets the value of the pnrPassengerOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPNRPassengerOrderID(Integer value) {
        this.pnrPassengerOrderID = value;
    }

    /**
     * Gets the value of the pnrSegmentOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPNRSegmentOrderID() {
        return pnrSegmentOrderID;
    }

    /**
     * Sets the value of the pnrSegmentOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPNRSegmentOrderID(Integer value) {
        this.pnrSegmentOrderID = value;
    }

    /**
     * Gets the value of the ancillaryProductLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAncillaryProductLineNumber() {
        return ancillaryProductLineNumber;
    }

    /**
     * Sets the value of the ancillaryProductLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAncillaryProductLineNumber(Integer value) {
        this.ancillaryProductLineNumber = value;
    }

}
