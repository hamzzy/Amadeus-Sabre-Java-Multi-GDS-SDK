
package wsimport.lib.amadeus.wsairseatmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OTA_AirSeatMapRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirSeatMapRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://traveltalk.com/wsAirSeatMap}POS" minOccurs="0"/>
 *         &lt;element name="SeatMapRequests" type="{http://traveltalk.com/wsAirSeatMap}ArrayOfSeatMapRequest" minOccurs="0"/>
 *         &lt;element name="AirTravelers" type="{http://traveltalk.com/wsAirSeatMap}ArrayOfAirTraveler" minOccurs="0"/>
 *         &lt;element name="BookingReferenceID" type="{http://traveltalk.com/wsAirSeatMap}BookingReferenceID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RewardProgram" type="{http://traveltalk.com/wsAirSeatMap}RewardProgram" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://traveltalk.com/wsAirSeatMap}OTA_AirSeatMapRQTarget" default="Production" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://traveltalk.com/wsAirSeatMap}OTA_AirSeatMapRQTransactionStatusCode" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OTA_AirSeatMapRQ")
@XmlType(name = "OTA_AirSeatMapRQ", propOrder = {
    "pos",
    "seatMapRequests",
    "airTravelers",
    "bookingReferenceID",
    "rewardProgram"
})
public class OTAAirSeatMapRQ {

    @XmlElement(name = "POS")
    protected POS pos;
    @XmlElement(name = "SeatMapRequests")
    protected ArrayOfSeatMapRequest seatMapRequests;
    @XmlElement(name = "AirTravelers")
    protected ArrayOfAirTraveler airTravelers;
    @XmlElement(name = "BookingReferenceID")
    protected List<BookingReferenceID> bookingReferenceID;
    @XmlElement(name = "RewardProgram")
    protected RewardProgram rewardProgram;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTAAirSeatMapRQTarget target;
    @XmlAttribute(name = "Version")
    protected Double version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    protected Integer sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected OTAAirSeatMapRQTransactionStatusCode transactionStatusCode;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    protected String altLangID;

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
     * Gets the value of the seatMapRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSeatMapRequest }
     *     
     */
    public ArrayOfSeatMapRequest getSeatMapRequests() {
        return seatMapRequests;
    }

    /**
     * Sets the value of the seatMapRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSeatMapRequest }
     *     
     */
    public void setSeatMapRequests(ArrayOfSeatMapRequest value) {
        this.seatMapRequests = value;
    }

    /**
     * Gets the value of the airTravelers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirTraveler }
     *     
     */
    public ArrayOfAirTraveler getAirTravelers() {
        return airTravelers;
    }

    /**
     * Sets the value of the airTravelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirTraveler }
     *     
     */
    public void setAirTravelers(ArrayOfAirTraveler value) {
        this.airTravelers = value;
    }

    /**
     * Gets the value of the bookingReferenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingReferenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingReferenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingReferenceID }
     * 
     * 
     */
    public List<BookingReferenceID> getBookingReferenceID() {
        if (bookingReferenceID == null) {
            bookingReferenceID = new ArrayList<BookingReferenceID>();
        }
        return this.bookingReferenceID;
    }

    /**
     * Gets the value of the rewardProgram property.
     * 
     * @return
     *     possible object is
     *     {@link RewardProgram }
     *     
     */
    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }

    /**
     * Sets the value of the rewardProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link RewardProgram }
     *     
     */
    public void setRewardProgram(RewardProgram value) {
        this.rewardProgram = value;
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
     *     {@link OTAAirSeatMapRQTarget }
     *     
     */
    public OTAAirSeatMapRQTarget getTarget() {
        if (target == null) {
            return OTAAirSeatMapRQTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirSeatMapRQTarget }
     *     
     */
    public void setTarget(OTAAirSeatMapRQTarget value) {
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
     *     {@link OTAAirSeatMapRQTransactionStatusCode }
     *     
     */
    public OTAAirSeatMapRQTransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirSeatMapRQTransactionStatusCode }
     *     
     */
    public void setTransactionStatusCode(OTAAirSeatMapRQTransactionStatusCode value) {
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

}
