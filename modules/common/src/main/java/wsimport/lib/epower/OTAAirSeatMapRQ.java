
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * <p>Java class for OTA_AirSeatMapRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirSeatMapRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FFCForSeatMap" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFrequentFlyerCardsWithPassengerForSeatMap" minOccurs="0"/>
 *         &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
 *         &lt;element name="SeatMapRequests" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOTA_AirSeatMapRQSeatMapRequest" minOccurs="0"/>
 *         &lt;element name="AirTravelers" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOTA_AirSeatMapRQAirTraveler" minOccurs="0"/>
 *         &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RecommendationID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CombinationID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IsOneWayCombinable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ItineraryID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SegmentID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirSeatMapRQTarget" default="Production" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirSeatMapRQTransactionStatusCode" />
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirSeatMapRQ", propOrder = {
    "ffcForSeatMap",
    "pos",
    "seatMapRequests",
    "airTravelers",
    "bookingReferenceID"
})
public class OTAAirSeatMapRQ {

    @XmlElement(name = "FFCForSeatMap")
    protected ArrayOfFrequentFlyerCardsWithPassengerForSeatMap ffcForSeatMap;
    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElement(name = "SeatMapRequests")
    protected ArrayOfOTAAirSeatMapRQSeatMapRequest seatMapRequests;
    @XmlElement(name = "AirTravelers")
    protected ArrayOfOTAAirSeatMapRQAirTraveler airTravelers;
    @XmlElement(name = "BookingReferenceID")
    protected List<UniqueIDType> bookingReferenceID;
    @XmlAttribute(name = "RecommendationID", required = true)
    protected int recommendationID;
    @XmlAttribute(name = "CombinationID", required = true)
    protected int combinationID;
    @XmlAttribute(name = "IsOneWayCombinable")
    protected Boolean isOneWayCombinable;
    @XmlAttribute(name = "ItineraryID", required = true)
    protected int itineraryID;
    @XmlAttribute(name = "SegmentID", required = true)
    protected int segmentID;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTAAirSeatMapRQTarget target;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected OTAAirSeatMapRQTransactionStatusCode transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;

    /**
     * Gets the value of the ffcForSeatMap property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFrequentFlyerCardsWithPassengerForSeatMap }
     *     
     */
    public ArrayOfFrequentFlyerCardsWithPassengerForSeatMap getFFCForSeatMap() {
        return ffcForSeatMap;
    }

    /**
     * Sets the value of the ffcForSeatMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFrequentFlyerCardsWithPassengerForSeatMap }
     *     
     */
    public void setFFCForSeatMap(ArrayOfFrequentFlyerCardsWithPassengerForSeatMap value) {
        this.ffcForSeatMap = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public ArrayOfSourceType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public void setPOS(ArrayOfSourceType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the seatMapRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOTAAirSeatMapRQSeatMapRequest }
     *     
     */
    public ArrayOfOTAAirSeatMapRQSeatMapRequest getSeatMapRequests() {
        return seatMapRequests;
    }

    /**
     * Sets the value of the seatMapRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOTAAirSeatMapRQSeatMapRequest }
     *     
     */
    public void setSeatMapRequests(ArrayOfOTAAirSeatMapRQSeatMapRequest value) {
        this.seatMapRequests = value;
    }

    /**
     * Gets the value of the airTravelers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOTAAirSeatMapRQAirTraveler }
     *     
     */
    public ArrayOfOTAAirSeatMapRQAirTraveler getAirTravelers() {
        return airTravelers;
    }

    /**
     * Sets the value of the airTravelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOTAAirSeatMapRQAirTraveler }
     *     
     */
    public void setAirTravelers(ArrayOfOTAAirSeatMapRQAirTraveler value) {
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
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getBookingReferenceID() {
        if (bookingReferenceID == null) {
            bookingReferenceID = new ArrayList<UniqueIDType>();
        }
        return this.bookingReferenceID;
    }

    /**
     * Gets the value of the recommendationID property.
     * 
     */
    public int getRecommendationID() {
        return recommendationID;
    }

    /**
     * Sets the value of the recommendationID property.
     * 
     */
    public void setRecommendationID(int value) {
        this.recommendationID = value;
    }

    /**
     * Gets the value of the combinationID property.
     * 
     */
    public int getCombinationID() {
        return combinationID;
    }

    /**
     * Sets the value of the combinationID property.
     * 
     */
    public void setCombinationID(int value) {
        this.combinationID = value;
    }

    /**
     * Gets the value of the isOneWayCombinable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOneWayCombinable() {
        return isOneWayCombinable;
    }

    /**
     * Sets the value of the isOneWayCombinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOneWayCombinable(Boolean value) {
        this.isOneWayCombinable = value;
    }

    /**
     * Gets the value of the itineraryID property.
     * 
     */
    public int getItineraryID() {
        return itineraryID;
    }

    /**
     * Sets the value of the itineraryID property.
     * 
     */
    public void setItineraryID(int value) {
        this.itineraryID = value;
    }

    /**
     * Gets the value of the segmentID property.
     * 
     */
    public int getSegmentID() {
        return segmentID;
    }

    /**
     * Sets the value of the segmentID property.
     * 
     */
    public void setSegmentID(int value) {
        this.segmentID = value;
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
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
     * Gets the value of the retransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * Sets the value of the retransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

}
