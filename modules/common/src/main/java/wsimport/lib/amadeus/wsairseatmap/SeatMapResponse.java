
package wsimport.lib.amadeus.wsairseatmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatMapResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegmentInfo" type="{http://traveltalk.com/wsAirSeatMap}FlightSegmentInfo" minOccurs="0"/>
 *         &lt;element name="SeatMapDetails" type="{http://traveltalk.com/wsAirSeatMap}SeatMapDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BookingReferenceID" type="{http://traveltalk.com/wsAirSeatMap}BookingReferenceID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SeatUpgradeApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapResponse", propOrder = {
    "flightSegmentInfo",
    "seatMapDetails",
    "bookingReferenceID"
})
public class SeatMapResponse {

    @XmlElement(name = "FlightSegmentInfo")
    protected FlightSegmentInfo flightSegmentInfo;
    @XmlElement(name = "SeatMapDetails")
    protected List<SeatMapDetails> seatMapDetails;
    @XmlElement(name = "BookingReferenceID")
    protected List<BookingReferenceID> bookingReferenceID;
    @XmlAttribute(name = "SeatUpgradeApplied")
    protected Boolean seatUpgradeApplied;

    /**
     * Gets the value of the flightSegmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentInfo }
     *     
     */
    public FlightSegmentInfo getFlightSegmentInfo() {
        return flightSegmentInfo;
    }

    /**
     * Sets the value of the flightSegmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentInfo }
     *     
     */
    public void setFlightSegmentInfo(FlightSegmentInfo value) {
        this.flightSegmentInfo = value;
    }

    /**
     * Gets the value of the seatMapDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatMapDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatMapDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMapDetails }
     * 
     * 
     */
    public List<SeatMapDetails> getSeatMapDetails() {
        if (seatMapDetails == null) {
            seatMapDetails = new ArrayList<SeatMapDetails>();
        }
        return this.seatMapDetails;
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
     * Gets the value of the seatUpgradeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSeatUpgradeApplied() {
        if (seatUpgradeApplied == null) {
            return false;
        } else {
            return seatUpgradeApplied;
        }
    }

    /**
     * Sets the value of the seatUpgradeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeatUpgradeApplied(Boolean value) {
        this.seatUpgradeApplied = value;
    }

}
