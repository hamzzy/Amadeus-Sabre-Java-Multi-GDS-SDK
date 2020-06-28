
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureAirport" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
 *         &lt;element name="ArrivalAirport" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatPrice" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatPriceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatPreference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ItineraryID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequestType", propOrder = {
    "departureAirport",
    "arrivalAirport"
})
@XmlSeeAlso({
    wsimport.lib.epower.ArrayOfSpecialReqDetailsTypeSeatRequest.SeatRequest.class
})
public class SeatRequestType {

    @XmlElement(name = "DepartureAirport")
    protected LocationType departureAirport;
    @XmlElement(name = "ArrivalAirport")
    protected LocationType arrivalAirport;
    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "SeatPrice")
    protected String seatPrice;
    @XmlAttribute(name = "SeatPriceCurrency")
    protected String seatPriceCurrency;
    @XmlAttribute(name = "SeatPreference")
    protected String seatPreference;
    @XmlAttribute(name = "DepartureDate")
    protected String departureDate;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "ItineraryID")
    protected String itineraryID;
    @XmlAttribute(name = "SegmentID")
    protected String segmentID;

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDepartureAirport(LocationType value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalAirport(LocationType value) {
        this.arrivalAirport = value;
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
     * Gets the value of the seatPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPrice() {
        return seatPrice;
    }

    /**
     * Sets the value of the seatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPrice(String value) {
        this.seatPrice = value;
    }

    /**
     * Gets the value of the seatPriceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPriceCurrency() {
        return seatPriceCurrency;
    }

    /**
     * Sets the value of the seatPriceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPriceCurrency(String value) {
        this.seatPriceCurrency = value;
    }

    /**
     * Gets the value of the seatPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPreference() {
        return seatPreference;
    }

    /**
     * Sets the value of the seatPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPreference(String value) {
        this.seatPreference = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
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
     * Gets the value of the itineraryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryID() {
        return itineraryID;
    }

    /**
     * Sets the value of the itineraryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryID(String value) {
        this.itineraryID = value;
    }

    /**
     * Gets the value of the segmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentID() {
        return segmentID;
    }

    /**
     * Sets the value of the segmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentID(String value) {
        this.segmentID = value;
    }

}
