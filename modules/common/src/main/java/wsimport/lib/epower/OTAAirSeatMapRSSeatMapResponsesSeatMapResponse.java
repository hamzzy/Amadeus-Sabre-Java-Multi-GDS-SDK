
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirSeatMapRSSeatMapResponsesSeatMapResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirSeatMapRSSeatMapResponsesSeatMapResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegmentInfo" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo" minOccurs="0"/>
 *         &lt;element name="SeatMapDetails" type="{http://epowerv5.amadeus.com.tr/WS}SeatMapDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OTA_AirSeatMapRSSeatMapResponsesSeatMapResponse", propOrder = {
    "flightSegmentInfo",
    "seatMapDetails",
    "bookingReferenceID"
})
public class OTAAirSeatMapRSSeatMapResponsesSeatMapResponse {

    @XmlElement(name = "FlightSegmentInfo")
    protected OTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo flightSegmentInfo;
    @XmlElement(name = "SeatMapDetails")
    protected List<SeatMapDetailsType> seatMapDetails;
    @XmlElement(name = "BookingReferenceID")
    protected List<UniqueIDType> bookingReferenceID;
    @XmlAttribute(name = "SeatUpgradeApplied")
    protected Boolean seatUpgradeApplied;

    /**
     * Gets the value of the flightSegmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo }
     *     
     */
    public OTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo getFlightSegmentInfo() {
        return flightSegmentInfo;
    }

    /**
     * Sets the value of the flightSegmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo }
     *     
     */
    public void setFlightSegmentInfo(OTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo value) {
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
     * {@link SeatMapDetailsType }
     * 
     * 
     */
    public List<SeatMapDetailsType> getSeatMapDetails() {
        if (seatMapDetails == null) {
            seatMapDetails = new ArrayList<SeatMapDetailsType>();
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
