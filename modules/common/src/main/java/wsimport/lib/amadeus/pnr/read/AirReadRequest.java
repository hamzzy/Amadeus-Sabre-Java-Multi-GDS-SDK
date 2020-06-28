
package wsimport.lib.amadeus.pnr.read;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AirReadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirReadRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://traveltalk.com/wsPNRRead}POS" minOccurs="0"/>
 *         &lt;element name="Airline" type="{http://traveltalk.com/wsPNRRead}AirlineRQ" minOccurs="0"/>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureAirport" type="{http://traveltalk.com/wsPNRRead}DepartureAirport" minOccurs="0"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://traveltalk.com/wsPNRRead}Telephone" minOccurs="0"/>
 *         &lt;element name="CustLoyalty" type="{http://traveltalk.com/wsPNRRead}CustLoyalty" minOccurs="0"/>
 *         &lt;element name="CreditCardInfo" type="{http://traveltalk.com/wsPNRRead}CreditCardInfo" minOccurs="0"/>
 *         &lt;element name="TicketNumber" type="{http://traveltalk.com/wsPNRRead}TicketNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IncludeFF_EquivPartnerLev" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ReturnFF_Number" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ReturnDownlineSeg" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="InfoToReturn" type="{http://traveltalk.com/wsPNRRead}AirReadRequestInfoToReturn" />
 *       &lt;attribute name="FF_RequestCriteria" type="{http://traveltalk.com/wsPNRRead}AirReadRequestFF_RequestCriteria" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirReadRequest", propOrder = {
    "pos",
    "airline",
    "flightNumber",
    "departureAirport",
    "departureDate",
    "name",
    "telephone",
    "custLoyalty",
    "creditCardInfo",
    "ticketNumber"
})
public class AirReadRequest {

    @XmlElement(name = "POS")
    protected POS pos;
    @XmlElement(name = "Airline")
    protected AirlineRQ airline;
    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "DepartureAirport")
    protected DepartureAirport departureAirport;
    @XmlElement(name = "DepartureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Telephone")
    protected Telephone telephone;
    @XmlElement(name = "CustLoyalty")
    protected CustLoyalty custLoyalty;
    @XmlElement(name = "CreditCardInfo")
    protected CreditCardInfo creditCardInfo;
    @XmlElement(name = "TicketNumber")
    protected TicketNumber ticketNumber;
    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "IncludeFF_EquivPartnerLev")
    protected Boolean includeFFEquivPartnerLev;
    @XmlAttribute(name = "ReturnFF_Number")
    protected Boolean returnFFNumber;
    @XmlAttribute(name = "ReturnDownlineSeg")
    protected Boolean returnDownlineSeg;
    @XmlAttribute(name = "InfoToReturn")
    protected AirReadRequestInfoToReturn infoToReturn;
    @XmlAttribute(name = "FF_RequestCriteria")
    protected AirReadRequestFFRequestCriteria ffRequestCriteria;

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
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineRQ }
     *     
     */
    public AirlineRQ getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineRQ }
     *     
     */
    public void setAirline(AirlineRQ value) {
        this.airline = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureAirport }
     *     
     */
    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureAirport }
     *     
     */
    public void setDepartureAirport(DepartureAirport value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link Telephone }
     *     
     */
    public Telephone getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telephone }
     *     
     */
    public void setTelephone(Telephone value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * @return
     *     possible object is
     *     {@link CustLoyalty }
     *     
     */
    public CustLoyalty getCustLoyalty() {
        return custLoyalty;
    }

    /**
     * Sets the value of the custLoyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustLoyalty }
     *     
     */
    public void setCustLoyalty(CustLoyalty value) {
        this.custLoyalty = value;
    }

    /**
     * Gets the value of the creditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInfo }
     *     
     */
    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * Sets the value of the creditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInfo }
     *     
     */
    public void setCreditCardInfo(CreditCardInfo value) {
        this.creditCardInfo = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TicketNumber }
     *     
     */
    public TicketNumber getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketNumber }
     *     
     */
    public void setTicketNumber(TicketNumber value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the includeFFEquivPartnerLev property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFFEquivPartnerLev() {
        return includeFFEquivPartnerLev;
    }

    /**
     * Sets the value of the includeFFEquivPartnerLev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFFEquivPartnerLev(Boolean value) {
        this.includeFFEquivPartnerLev = value;
    }

    /**
     * Gets the value of the returnFFNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnFFNumber() {
        return returnFFNumber;
    }

    /**
     * Sets the value of the returnFFNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnFFNumber(Boolean value) {
        this.returnFFNumber = value;
    }

    /**
     * Gets the value of the returnDownlineSeg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnDownlineSeg() {
        return returnDownlineSeg;
    }

    /**
     * Sets the value of the returnDownlineSeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnDownlineSeg(Boolean value) {
        this.returnDownlineSeg = value;
    }

    /**
     * Gets the value of the infoToReturn property.
     * 
     * @return
     *     possible object is
     *     {@link AirReadRequestInfoToReturn }
     *     
     */
    public AirReadRequestInfoToReturn getInfoToReturn() {
        return infoToReturn;
    }

    /**
     * Sets the value of the infoToReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReadRequestInfoToReturn }
     *     
     */
    public void setInfoToReturn(AirReadRequestInfoToReturn value) {
        this.infoToReturn = value;
    }

    /**
     * Gets the value of the ffRequestCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AirReadRequestFFRequestCriteria }
     *     
     */
    public AirReadRequestFFRequestCriteria getFFRequestCriteria() {
        return ffRequestCriteria;
    }

    /**
     * Sets the value of the ffRequestCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReadRequestFFRequestCriteria }
     *     
     */
    public void setFFRequestCriteria(AirReadRequestFFRequestCriteria value) {
        this.ffRequestCriteria = value;
    }

}
