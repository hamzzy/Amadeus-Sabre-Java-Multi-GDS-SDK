
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TT_IssueTicketRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TT_IssueTicketRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://traveltalk.com/wsIssueTicket}POS" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://traveltalk.com/wsIssueTicket}UniqueID" minOccurs="0"/>
 *         &lt;element name="Fulfillment" type="{http://traveltalk.com/wsIssueTicket}Fulfillment" minOccurs="0"/>
 *         &lt;element name="Ticketing" type="{http://traveltalk.com/wsIssueTicket}Ticketing" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://traveltalk.com/wsIssueTicket}TT_IssueTicketRQTarget" default="Production" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://traveltalk.com/wsIssueTicket}TT_IssueTicketRQTransactionStatusCode" />
 *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DirectFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NumberStops" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "TT_IssueTicketRQ", propOrder = {
    "pos",
    "uniqueID",
    "fulfillment",
    "ticketing"
})
public class TTIssueTicketRQ {

    @XmlElement(name = "POS")
    protected POS pos;
    @XmlElement(name = "UniqueID")
    protected UniqueID uniqueID;
    @XmlElement(name = "Fulfillment")
    protected Fulfillment fulfillment;
    @XmlElement(name = "Ticketing")
    protected Ticketing ticketing;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected TTIssueTicketRQTarget target;
    @XmlAttribute(name = "Version")
    protected Double version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    protected Integer sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected TTIssueTicketRQTransactionStatusCode transactionStatusCode;
    @XmlAttribute(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    protected String altLangID;
    @XmlAttribute(name = "MaxResponses")
    protected Integer maxResponses;
    @XmlAttribute(name = "DirectFlightsOnly")
    protected Boolean directFlightsOnly;
    @XmlAttribute(name = "NumberStops")
    protected Integer numberStops;

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
     * Gets the value of the fulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link Fulfillment }
     *     
     */
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    /**
     * Sets the value of the fulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fulfillment }
     *     
     */
    public void setFulfillment(Fulfillment value) {
        this.fulfillment = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * @return
     *     possible object is
     *     {@link Ticketing }
     *     
     */
    public Ticketing getTicketing() {
        return ticketing;
    }

    /**
     * Sets the value of the ticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticketing }
     *     
     */
    public void setTicketing(Ticketing value) {
        this.ticketing = value;
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
     *     {@link TTIssueTicketRQTarget }
     *     
     */
    public TTIssueTicketRQTarget getTarget() {
        if (target == null) {
            return TTIssueTicketRQTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTIssueTicketRQTarget }
     *     
     */
    public void setTarget(TTIssueTicketRQTarget value) {
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
     *     {@link TTIssueTicketRQTransactionStatusCode }
     *     
     */
    public TTIssueTicketRQTransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTIssueTicketRQTransactionStatusCode }
     *     
     */
    public void setTransactionStatusCode(TTIssueTicketRQTransactionStatusCode value) {
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

    /**
     * Gets the value of the directFlightsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDirectFlightsOnly() {
        if (directFlightsOnly == null) {
            return false;
        } else {
            return directFlightsOnly;
        }
    }

    /**
     * Sets the value of the directFlightsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectFlightsOnly(Boolean value) {
        this.directFlightsOnly = value;
    }

    /**
     * Gets the value of the numberStops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberStops() {
        return numberStops;
    }

    /**
     * Sets the value of the numberStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberStops(Integer value) {
        this.numberStops = value;
    }

}
