
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Commission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Commission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://traveltalk.com/wsHotelAvail}UniqueID" minOccurs="0"/>
 *         &lt;element name="CommissionableAmount" type="{http://traveltalk.com/wsHotelAvail}CommissionableAmount" minOccurs="0"/>
 *         &lt;element name="PrepaidAmount" type="{http://traveltalk.com/wsHotelAvail}PrepaidAmount" minOccurs="0"/>
 *         &lt;element name="FlatCommission" type="{http://traveltalk.com/wsHotelAvail}FlatCommission" minOccurs="0"/>
 *         &lt;element name="CommissionPayableAmount" type="{http://traveltalk.com/wsHotelAvail}CommissionPayableAmount" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://traveltalk.com/wsHotelAvail}Comment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StatusType" type="{http://traveltalk.com/wsHotelAvail}CommissionStatusType" />
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commission", propOrder = {
    "uniqueID",
    "commissionableAmount",
    "prepaidAmount",
    "flatCommission",
    "commissionPayableAmount",
    "comment"
})
public class Commission {

    @XmlElement(name = "UniqueID")
    protected UniqueID uniqueID;
    @XmlElement(name = "CommissionableAmount")
    protected CommissionableAmount commissionableAmount;
    @XmlElement(name = "PrepaidAmount")
    protected PrepaidAmount prepaidAmount;
    @XmlElement(name = "FlatCommission")
    protected FlatCommission flatCommission;
    @XmlElement(name = "CommissionPayableAmount")
    protected CommissionPayableAmount commissionPayableAmount;
    @XmlElement(name = "Comment")
    protected Comment comment;
    @XmlAttribute(name = "StatusType")
    protected CommissionStatusType statusType;
    @XmlAttribute(name = "Percent")
    protected Double percent;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    protected Integer decimalPlaces;
    @XmlAttribute(name = "ReasonCode")
    protected String reasonCode;
    @XmlAttribute(name = "BillToID")
    protected String billToID;

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setUniqueID(UniqueID value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the commissionableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionableAmount }
     *     
     */
    public CommissionableAmount getCommissionableAmount() {
        return commissionableAmount;
    }

    /**
     * Sets the value of the commissionableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionableAmount }
     *     
     */
    public void setCommissionableAmount(CommissionableAmount value) {
        this.commissionableAmount = value;
    }

    /**
     * Gets the value of the prepaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidAmount }
     *     
     */
    public PrepaidAmount getPrepaidAmount() {
        return prepaidAmount;
    }

    /**
     * Sets the value of the prepaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidAmount }
     *     
     */
    public void setPrepaidAmount(PrepaidAmount value) {
        this.prepaidAmount = value;
    }

    /**
     * Gets the value of the flatCommission property.
     * 
     * @return
     *     possible object is
     *     {@link FlatCommission }
     *     
     */
    public FlatCommission getFlatCommission() {
        return flatCommission;
    }

    /**
     * Sets the value of the flatCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatCommission }
     *     
     */
    public void setFlatCommission(FlatCommission value) {
        this.flatCommission = value;
    }

    /**
     * Gets the value of the commissionPayableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionPayableAmount }
     *     
     */
    public CommissionPayableAmount getCommissionPayableAmount() {
        return commissionPayableAmount;
    }

    /**
     * Sets the value of the commissionPayableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionPayableAmount }
     *     
     */
    public void setCommissionPayableAmount(CommissionPayableAmount value) {
        this.commissionPayableAmount = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

    /**
     * Gets the value of the statusType property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionStatusType }
     *     
     */
    public CommissionStatusType getStatusType() {
        return statusType;
    }

    /**
     * Sets the value of the statusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionStatusType }
     *     
     */
    public void setStatusType(CommissionStatusType value) {
        this.statusType = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent(Double value) {
        this.percent = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimalPlaces(Integer value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the billToID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToID() {
        return billToID;
    }

    /**
     * Sets the value of the billToID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToID(String value) {
        this.billToID = value;
    }

}
