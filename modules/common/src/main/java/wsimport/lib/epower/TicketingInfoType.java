
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TicketingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketAdvisory" type="{http://epowerv5.amadeus.com.tr/WS}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TicketTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="OldTicketTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="TicketType" type="{http://epowerv5.amadeus.com.tr/WS}TicketType" />
 *       &lt;attribute name="TicketingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightSegmentRefNumber">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TravelerRefNumber">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ReverseTktgSegmentsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RequestedTicketingDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeLimitMinutes" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingInfoType", propOrder = {
    "ticketAdvisory"
})
@XmlSeeAlso({
    wsimport.lib.epower.CreateTicket.OTAAirBookRQ.Ticketing.class,
    wsimport.lib.epower.BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.class,
    wsimport.lib.epower.BookFlight.OTAAirBookRQ.Ticketing.class,
    TicketingInfoRSType.class
})
public class TicketingInfoType {

    @XmlElement(name = "TicketAdvisory")
    protected List<FreeTextType> ticketAdvisory;
    @XmlAttribute(name = "TicketTimeLimit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketTimeLimit;
    @XmlAttribute(name = "OldTicketTimeLimit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oldTicketTimeLimit;
    @XmlAttribute(name = "TicketType")
    protected TicketType ticketType;
    @XmlAttribute(name = "TicketingStatus")
    protected String ticketingStatus;
    @XmlAttribute(name = "FlightSegmentRefNumber")
    protected List<String> flightSegmentRefNumber;
    @XmlAttribute(name = "TravelerRefNumber")
    protected List<String> travelerRefNumber;
    @XmlAttribute(name = "ReverseTktgSegmentsInd")
    protected Boolean reverseTktgSegmentsInd;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "RequestedTicketingDate")
    protected String requestedTicketingDate;
    @XmlAttribute(name = "TimeLimitMinutes")
    protected BigInteger timeLimitMinutes;

    /**
     * Gets the value of the ticketAdvisory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketAdvisory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketAdvisory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getTicketAdvisory() {
        if (ticketAdvisory == null) {
            ticketAdvisory = new ArrayList<FreeTextType>();
        }
        return this.ticketAdvisory;
    }

    /**
     * Gets the value of the ticketTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketTimeLimit() {
        return ticketTimeLimit;
    }

    /**
     * Sets the value of the ticketTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketTimeLimit(XMLGregorianCalendar value) {
        this.ticketTimeLimit = value;
    }

    /**
     * Gets the value of the oldTicketTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOldTicketTimeLimit() {
        return oldTicketTimeLimit;
    }

    /**
     * Sets the value of the oldTicketTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOldTicketTimeLimit(XMLGregorianCalendar value) {
        this.oldTicketTimeLimit = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType }
     *     
     */
    public TicketType getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType }
     *     
     */
    public void setTicketType(TicketType value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the ticketingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingStatus() {
        return ticketingStatus;
    }

    /**
     * Sets the value of the ticketingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingStatus(String value) {
        this.ticketingStatus = value;
    }

    /**
     * Gets the value of the flightSegmentRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlightSegmentRefNumber() {
        if (flightSegmentRefNumber == null) {
            flightSegmentRefNumber = new ArrayList<String>();
        }
        return this.flightSegmentRefNumber;
    }

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTravelerRefNumber() {
        if (travelerRefNumber == null) {
            travelerRefNumber = new ArrayList<String>();
        }
        return this.travelerRefNumber;
    }

    /**
     * Gets the value of the reverseTktgSegmentsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseTktgSegmentsInd() {
        return reverseTktgSegmentsInd;
    }

    /**
     * Sets the value of the reverseTktgSegmentsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseTktgSegmentsInd(Boolean value) {
        this.reverseTktgSegmentsInd = value;
    }

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the requestedTicketingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedTicketingDate() {
        return requestedTicketingDate;
    }

    /**
     * Sets the value of the requestedTicketingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedTicketingDate(String value) {
        this.requestedTicketingDate = value;
    }

    /**
     * Gets the value of the timeLimitMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeLimitMinutes() {
        return timeLimitMinutes;
    }

    /**
     * Sets the value of the timeLimitMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeLimitMinutes(BigInteger value) {
        this.timeLimitMinutes = value;
    }

}
