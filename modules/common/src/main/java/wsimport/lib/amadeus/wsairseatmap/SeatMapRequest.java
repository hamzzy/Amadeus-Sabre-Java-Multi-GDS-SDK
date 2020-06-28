
package wsimport.lib.amadeus.wsairseatmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatMapRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegmentInfo" type="{http://traveltalk.com/wsAirSeatMap}FlightSegmentInfo" minOccurs="0"/>
 *         &lt;element name="SeatDetails" type="{http://traveltalk.com/wsAirSeatMap}SeatDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TravelerRefNumberRPHs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapRequest", propOrder = {
    "flightSegmentInfo",
    "seatDetails"
})
public class SeatMapRequest {

    @XmlElement(name = "FlightSegmentInfo")
    protected FlightSegmentInfo flightSegmentInfo;
    @XmlElement(name = "SeatDetails")
    protected SeatDetails seatDetails;
    @XmlAttribute(name = "TravelerRefNumberRPHs")
    protected String travelerRefNumberRPHs;

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
     * Gets the value of the seatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SeatDetails }
     *     
     */
    public SeatDetails getSeatDetails() {
        return seatDetails;
    }

    /**
     * Sets the value of the seatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDetails }
     *     
     */
    public void setSeatDetails(SeatDetails value) {
        this.seatDetails = value;
    }

    /**
     * Gets the value of the travelerRefNumberRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerRefNumberRPHs() {
        return travelerRefNumberRPHs;
    }

    /**
     * Sets the value of the travelerRefNumberRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerRefNumberRPHs(String value) {
        this.travelerRefNumberRPHs = value;
    }

}
