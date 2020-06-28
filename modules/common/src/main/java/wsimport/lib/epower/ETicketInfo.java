
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ETicketInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ETicketInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
 *         &lt;element name="AgencyTelNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IATAID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PassengerName_Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequentFlyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingAirline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareCalculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endorsements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirFare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AirFareCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquivalentFare" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ServiceFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EquivalentFareCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalFare" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalFareCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfTaxInfo" minOccurs="0"/>
 *         &lt;element name="ControlNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Itineraries" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfETicketItineraryInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ETicketInfo", propOrder = {
    "agencyTitle",
    "agencyAddress",
    "agencyTelNo",
    "agentID",
    "iataid",
    "ticketingDate",
    "passengerNameSurname",
    "frequentFlyer",
    "issuingAirline",
    "bookingRef",
    "fareCalculation",
    "endorsements",
    "exchangeRate",
    "paymentType",
    "airFare",
    "airFareCurrency",
    "equivalentFare",
    "serviceFee",
    "equivalentFareCurrency",
    "totalFare",
    "totalFareCurrency",
    "ticketCurrency",
    "taxes",
    "controlNumbers",
    "itineraries"
})
public class ETicketInfo {

    @XmlElement(name = "AgencyTitle")
    protected String agencyTitle;
    @XmlElement(name = "AgencyAddress")
    protected AddressType agencyAddress;
    @XmlElement(name = "AgencyTelNo")
    protected String agencyTelNo;
    @XmlElement(name = "AgentID")
    protected String agentID;
    @XmlElement(name = "IATAID")
    protected String iataid;
    @XmlElementRef(name = "TicketingDate", namespace = "http://epowerv5.amadeus.com.tr/WS", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> ticketingDate;
    @XmlElement(name = "PassengerName_Surname")
    protected String passengerNameSurname;
    @XmlElement(name = "FrequentFlyer")
    protected String frequentFlyer;
    @XmlElement(name = "IssuingAirline")
    protected String issuingAirline;
    @XmlElement(name = "BookingRef")
    protected String bookingRef;
    @XmlElement(name = "FareCalculation")
    protected String fareCalculation;
    @XmlElement(name = "Endorsements")
    protected String endorsements;
    @XmlElement(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "AirFare")
    protected BigDecimal airFare;
    @XmlElement(name = "AirFareCurrency")
    protected String airFareCurrency;
    @XmlElement(name = "EquivalentFare", required = true)
    protected BigDecimal equivalentFare;
    @XmlElement(name = "ServiceFee")
    protected BigDecimal serviceFee;
    @XmlElement(name = "EquivalentFareCurrency")
    protected String equivalentFareCurrency;
    @XmlElement(name = "TotalFare", required = true)
    protected BigDecimal totalFare;
    @XmlElement(name = "TotalFareCurrency")
    protected String totalFareCurrency;
    @XmlElement(name = "TicketCurrency")
    protected String ticketCurrency;
    @XmlElement(name = "Taxes")
    protected ArrayOfTaxInfo taxes;
    @XmlElement(name = "ControlNumbers")
    protected String controlNumbers;
    @XmlElement(name = "Itineraries")
    protected ArrayOfETicketItineraryInfo itineraries;
    @XmlAttribute(name = "TicketNumber")
    protected String ticketNumber;

    /**
     * Gets the value of the agencyTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyTitle() {
        return agencyTitle;
    }

    /**
     * Sets the value of the agencyTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyTitle(String value) {
        this.agencyTitle = value;
    }

    /**
     * Gets the value of the agencyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAgencyAddress() {
        return agencyAddress;
    }

    /**
     * Sets the value of the agencyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAgencyAddress(AddressType value) {
        this.agencyAddress = value;
    }

    /**
     * Gets the value of the agencyTelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyTelNo() {
        return agencyTelNo;
    }

    /**
     * Sets the value of the agencyTelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyTelNo(String value) {
        this.agencyTelNo = value;
    }

    /**
     * Gets the value of the agentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * Sets the value of the agentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

    /**
     * Gets the value of the iataid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATAID() {
        return iataid;
    }

    /**
     * Sets the value of the iataid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATAID(String value) {
        this.iataid = value;
    }

    /**
     * Gets the value of the ticketingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTicketingDate() {
        return ticketingDate;
    }

    /**
     * Sets the value of the ticketingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTicketingDate(JAXBElement<XMLGregorianCalendar> value) {
        this.ticketingDate = value;
    }

    /**
     * Gets the value of the passengerNameSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerNameSurname() {
        return passengerNameSurname;
    }

    /**
     * Sets the value of the passengerNameSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerNameSurname(String value) {
        this.passengerNameSurname = value;
    }

    /**
     * Gets the value of the frequentFlyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentFlyer() {
        return frequentFlyer;
    }

    /**
     * Sets the value of the frequentFlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentFlyer(String value) {
        this.frequentFlyer = value;
    }

    /**
     * Gets the value of the issuingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingAirline() {
        return issuingAirline;
    }

    /**
     * Sets the value of the issuingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingAirline(String value) {
        this.issuingAirline = value;
    }

    /**
     * Gets the value of the bookingRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingRef() {
        return bookingRef;
    }

    /**
     * Sets the value of the bookingRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingRef(String value) {
        this.bookingRef = value;
    }

    /**
     * Gets the value of the fareCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalculation() {
        return fareCalculation;
    }

    /**
     * Sets the value of the fareCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCalculation(String value) {
        this.fareCalculation = value;
    }

    /**
     * Gets the value of the endorsements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsements() {
        return endorsements;
    }

    /**
     * Sets the value of the endorsements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsements(String value) {
        this.endorsements = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the airFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAirFare() {
        return airFare;
    }

    /**
     * Sets the value of the airFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAirFare(BigDecimal value) {
        this.airFare = value;
    }

    /**
     * Gets the value of the airFareCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirFareCurrency() {
        return airFareCurrency;
    }

    /**
     * Sets the value of the airFareCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirFareCurrency(String value) {
        this.airFareCurrency = value;
    }

    /**
     * Gets the value of the equivalentFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquivalentFare() {
        return equivalentFare;
    }

    /**
     * Sets the value of the equivalentFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquivalentFare(BigDecimal value) {
        this.equivalentFare = value;
    }

    /**
     * Gets the value of the serviceFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    /**
     * Sets the value of the serviceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceFee(BigDecimal value) {
        this.serviceFee = value;
    }

    /**
     * Gets the value of the equivalentFareCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentFareCurrency() {
        return equivalentFareCurrency;
    }

    /**
     * Sets the value of the equivalentFareCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentFareCurrency(String value) {
        this.equivalentFareCurrency = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFare(BigDecimal value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the totalFareCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFareCurrency() {
        return totalFareCurrency;
    }

    /**
     * Sets the value of the totalFareCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFareCurrency(String value) {
        this.totalFareCurrency = value;
    }

    /**
     * Gets the value of the ticketCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketCurrency() {
        return ticketCurrency;
    }

    /**
     * Sets the value of the ticketCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketCurrency(String value) {
        this.ticketCurrency = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaxInfo }
     *     
     */
    public ArrayOfTaxInfo getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaxInfo }
     *     
     */
    public void setTaxes(ArrayOfTaxInfo value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the controlNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlNumbers() {
        return controlNumbers;
    }

    /**
     * Sets the value of the controlNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlNumbers(String value) {
        this.controlNumbers = value;
    }

    /**
     * Gets the value of the itineraries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfETicketItineraryInfo }
     *     
     */
    public ArrayOfETicketItineraryInfo getItineraries() {
        return itineraries;
    }

    /**
     * Sets the value of the itineraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfETicketItineraryInfo }
     *     
     */
    public void setItineraries(ArrayOfETicketItineraryInfo value) {
        this.itineraries = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

}
