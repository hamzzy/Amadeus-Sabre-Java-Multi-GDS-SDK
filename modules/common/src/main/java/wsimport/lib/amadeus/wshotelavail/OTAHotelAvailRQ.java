
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OTA_HotelAvailRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_HotelAvailRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://traveltalk.com/wsHotelAvail}POS" minOccurs="0"/>
 *         &lt;element name="AvailRequestSegments" type="{http://traveltalk.com/wsHotelAvail}ArrayOfAvailRequestSegment" minOccurs="0"/>
 *         &lt;element name="HotelReservationIDs" type="{http://traveltalk.com/wsHotelAvail}ArrayOfHotelReservationID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://traveltalk.com/wsHotelAvail}OTA_HotelAvailRQTarget" default="Production" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://traveltalk.com/wsHotelAvail}OTA_HotelAvailRQTransactionStatusCode" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SummaryOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SortOrder" type="{http://traveltalk.com/wsHotelAvail}OTA_HotelAvailRQSortOrder" default="A" />
 *       &lt;attribute name="AvailRatesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BestOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateRangeOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ExactMatchOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AllowPartialAvail" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RequestedCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsModify" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "OTA_HotelAvailRQ", propOrder = {
    "pos",
    "availRequestSegments",
    "hotelReservationIDs"
})
public class OTAHotelAvailRQ {

    @XmlElement(name = "POS")
    protected POS pos;
    @XmlElement(name = "AvailRequestSegments")
    protected ArrayOfAvailRequestSegment availRequestSegments;
    @XmlElement(name = "HotelReservationIDs")
    protected ArrayOfHotelReservationID hotelReservationIDs;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTAHotelAvailRQTarget target;
    @XmlAttribute(name = "Version")
    protected Double version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    protected Integer sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected OTAHotelAvailRQTransactionStatusCode transactionStatusCode;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    protected String altLangID;
    @XmlAttribute(name = "SummaryOnly")
    protected Boolean summaryOnly;
    @XmlAttribute(name = "SortOrder")
    protected OTAHotelAvailRQSortOrder sortOrder;
    @XmlAttribute(name = "AvailRatesOnly")
    protected Boolean availRatesOnly;
    @XmlAttribute(name = "BestOnly")
    protected Boolean bestOnly;
    @XmlAttribute(name = "RateRangeOnly")
    protected Boolean rateRangeOnly;
    @XmlAttribute(name = "ExactMatchOnly")
    protected Boolean exactMatchOnly;
    @XmlAttribute(name = "AllowPartialAvail")
    protected Boolean allowPartialAvail;
    @XmlAttribute(name = "RequestedCurrency")
    protected String requestedCurrency;
    @XmlAttribute(name = "IsModify")
    protected Boolean isModify;
    @XmlAttribute(name = "MaxResponses")
    protected Integer maxResponses;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link POS }
     *     
     */
    public POS getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POS }
     *     
     */
    public void setPOS(POS value) {
        this.pos = value;
    }

    /**
     * Gets the value of the availRequestSegments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailRequestSegment }
     *     
     */
    public ArrayOfAvailRequestSegment getAvailRequestSegments() {
        return availRequestSegments;
    }

    /**
     * Sets the value of the availRequestSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailRequestSegment }
     *     
     */
    public void setAvailRequestSegments(ArrayOfAvailRequestSegment value) {
        this.availRequestSegments = value;
    }

    /**
     * Gets the value of the hotelReservationIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelReservationID }
     *     
     */
    public ArrayOfHotelReservationID getHotelReservationIDs() {
        return hotelReservationIDs;
    }

    /**
     * Sets the value of the hotelReservationIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelReservationID }
     *     
     */
    public void setHotelReservationIDs(ArrayOfHotelReservationID value) {
        this.hotelReservationIDs = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRQTarget }
     *     
     */
    public OTAHotelAvailRQTarget getTarget() {
        if (target == null) {
            return OTAHotelAvailRQTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRQTarget }
     *     
     */
    public void setTarget(OTAHotelAvailRQTarget value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVersion(Double value) {
        this.version = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNmbr(Integer value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRQTransactionStatusCode }
     *     
     */
    public OTAHotelAvailRQTransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRQTransactionStatusCode }
     *     
     */
    public void setTransactionStatusCode(OTAHotelAvailRQTransactionStatusCode value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

    /**
     * Gets the value of the summaryOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSummaryOnly() {
        return summaryOnly;
    }

    /**
     * Sets the value of the summaryOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummaryOnly(Boolean value) {
        this.summaryOnly = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailRQSortOrder }
     *     
     */
    public OTAHotelAvailRQSortOrder getSortOrder() {
        if (sortOrder == null) {
            return OTAHotelAvailRQSortOrder.A;
        } else {
            return sortOrder;
        }
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailRQSortOrder }
     *     
     */
    public void setSortOrder(OTAHotelAvailRQSortOrder value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the availRatesOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailRatesOnly() {
        return availRatesOnly;
    }

    /**
     * Sets the value of the availRatesOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailRatesOnly(Boolean value) {
        this.availRatesOnly = value;
    }

    /**
     * Gets the value of the bestOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOnly() {
        return bestOnly;
    }

    /**
     * Sets the value of the bestOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOnly(Boolean value) {
        this.bestOnly = value;
    }

    /**
     * Gets the value of the rateRangeOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateRangeOnly() {
        return rateRangeOnly;
    }

    /**
     * Sets the value of the rateRangeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateRangeOnly(Boolean value) {
        this.rateRangeOnly = value;
    }

    /**
     * Gets the value of the exactMatchOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExactMatchOnly() {
        return exactMatchOnly;
    }

    /**
     * Sets the value of the exactMatchOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExactMatchOnly(Boolean value) {
        this.exactMatchOnly = value;
    }

    /**
     * Gets the value of the allowPartialAvail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPartialAvail() {
        return allowPartialAvail;
    }

    /**
     * Sets the value of the allowPartialAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPartialAvail(Boolean value) {
        this.allowPartialAvail = value;
    }

    /**
     * Gets the value of the requestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedCurrency() {
        return requestedCurrency;
    }

    /**
     * Sets the value of the requestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedCurrency(String value) {
        this.requestedCurrency = value;
    }

    /**
     * Gets the value of the isModify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsModify() {
        if (isModify == null) {
            return false;
        } else {
            return isModify;
        }
    }

    /**
     * Sets the value of the isModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsModify(Boolean value) {
        this.isModify = value;
    }

    /**
     * Gets the value of the maxResponses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResponses() {
        return maxResponses;
    }

    /**
     * Sets the value of the maxResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResponses(Integer value) {
        this.maxResponses = value;
    }

}
