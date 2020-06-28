
package wsimport.lib.amadeus.pnr.issue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ticketing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ticketing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherPrinter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StockRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notification" type="{http://traveltalk.com/wsIssueTicket}Notification" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingPCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketingPrinter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="TravelerRefNumberRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InfantOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TicketType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IssueMCO" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IssueInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OmitInfant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IssueItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Exchange" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RemoteLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SpecialInstruction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IssueJointInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ticketing", propOrder = {
    "otherPrinter",
    "stockRange",
    "fareNumber",
    "notification",
    "orderNumber",
    "bookingPCC",
    "ticketingPrinter"
})
public class Ticketing {

    @XmlElement(name = "OtherPrinter")
    protected String otherPrinter;
    @XmlElement(name = "StockRange")
    protected String stockRange;
    @XmlElement(name = "FareNumber", type = Integer.class)
    protected List<Integer> fareNumber;
    @XmlElement(name = "Notification")
    protected Notification notification;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "BookingPCC")
    protected String bookingPCC;
    @XmlElement(name = "TicketingPrinter")
    protected String ticketingPrinter;
    @XmlAttribute(name = "BoardingPass")
    protected Boolean boardingPass;
    @XmlAttribute(name = "TravelerRefNumberRPHList")
    protected String travelerRefNumberRPHList;
    @XmlAttribute(name = "FlightRefNumberRPHList")
    protected String flightRefNumberRPHList;
    @XmlAttribute(name = "InfantOnly")
    protected Boolean infantOnly;
    @XmlAttribute(name = "TicketType")
    protected String ticketType;
    @XmlAttribute(name = "IssueMCO")
    protected Boolean issueMCO;
    @XmlAttribute(name = "IssueInvoice")
    protected Boolean issueInvoice;
    @XmlAttribute(name = "OmitInfant")
    protected Boolean omitInfant;
    @XmlAttribute(name = "IssueItinerary")
    protected Boolean issueItinerary;
    @XmlAttribute(name = "Exchange")
    protected Boolean exchange;
    @XmlAttribute(name = "RemoteLocation")
    protected String remoteLocation;
    @XmlAttribute(name = "SpecialInstruction")
    protected String specialInstruction;
    @XmlAttribute(name = "IssueJointInvoice")
    protected Boolean issueJointInvoice;

    /**
     * Gets the value of the otherPrinter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPrinter() {
        return otherPrinter;
    }

    /**
     * Sets the value of the otherPrinter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPrinter(String value) {
        this.otherPrinter = value;
    }

    /**
     * Gets the value of the stockRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockRange() {
        return stockRange;
    }

    /**
     * Sets the value of the stockRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockRange(String value) {
        this.stockRange = value;
    }

    /**
     * Gets the value of the fareNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFareNumber() {
        if (fareNumber == null) {
            fareNumber = new ArrayList<Integer>();
        }
        return this.fareNumber;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link Notification }
     *     
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notification }
     *     
     */
    public void setNotification(Notification value) {
        this.notification = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the bookingPCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingPCC() {
        return bookingPCC;
    }

    /**
     * Sets the value of the bookingPCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingPCC(String value) {
        this.bookingPCC = value;
    }

    /**
     * Gets the value of the ticketingPrinter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingPrinter() {
        return ticketingPrinter;
    }

    /**
     * Sets the value of the ticketingPrinter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingPrinter(String value) {
        this.ticketingPrinter = value;
    }

    /**
     * Gets the value of the boardingPass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBoardingPass() {
        if (boardingPass == null) {
            return false;
        } else {
            return boardingPass;
        }
    }

    /**
     * Sets the value of the boardingPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoardingPass(Boolean value) {
        this.boardingPass = value;
    }

    /**
     * Gets the value of the travelerRefNumberRPHList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerRefNumberRPHList() {
        return travelerRefNumberRPHList;
    }

    /**
     * Sets the value of the travelerRefNumberRPHList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerRefNumberRPHList(String value) {
        this.travelerRefNumberRPHList = value;
    }

    /**
     * Gets the value of the flightRefNumberRPHList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightRefNumberRPHList() {
        return flightRefNumberRPHList;
    }

    /**
     * Sets the value of the flightRefNumberRPHList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightRefNumberRPHList(String value) {
        this.flightRefNumberRPHList = value;
    }

    /**
     * Gets the value of the infantOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInfantOnly() {
        return infantOnly;
    }

    /**
     * Sets the value of the infantOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInfantOnly(Boolean value) {
        this.infantOnly = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketType(String value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the issueMCO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssueMCO() {
        return issueMCO;
    }

    /**
     * Sets the value of the issueMCO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIssueMCO(Boolean value) {
        this.issueMCO = value;
    }

    /**
     * Gets the value of the issueInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssueInvoice() {
        return issueInvoice;
    }

    /**
     * Sets the value of the issueInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIssueInvoice(Boolean value) {
        this.issueInvoice = value;
    }

    /**
     * Gets the value of the omitInfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmitInfant() {
        return omitInfant;
    }

    /**
     * Sets the value of the omitInfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmitInfant(Boolean value) {
        this.omitInfant = value;
    }

    /**
     * Gets the value of the issueItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssueItinerary() {
        return issueItinerary;
    }

    /**
     * Sets the value of the issueItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIssueItinerary(Boolean value) {
        this.issueItinerary = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchange(Boolean value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the remoteLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteLocation() {
        return remoteLocation;
    }

    /**
     * Sets the value of the remoteLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteLocation(String value) {
        this.remoteLocation = value;
    }

    /**
     * Gets the value of the specialInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstruction() {
        return specialInstruction;
    }

    /**
     * Sets the value of the specialInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstruction(String value) {
        this.specialInstruction = value;
    }

    /**
     * Gets the value of the issueJointInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssueJointInvoice() {
        return issueJointInvoice;
    }

    /**
     * Sets the value of the issueJointInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIssueJointInvoice(Boolean value) {
        this.issueJointInvoice = value;
    }

}
