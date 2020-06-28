
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirSeatMapRQSeatMapRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirSeatMapRQSeatMapRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegmentInfo" type="{http://epowerv5.amadeus.com.tr/WS}FlightSegmentType" minOccurs="0"/>
 *         &lt;element name="SeatDetails" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirSeatMapRQSeatMapRequestSeatDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TravelerRefNumberRPHs">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirSeatMapRQSeatMapRequest", propOrder = {
    "flightSegmentInfo",
    "seatDetails"
})
public class OTAAirSeatMapRQSeatMapRequest {

    @XmlElement(name = "FlightSegmentInfo")
    protected FlightSegmentType flightSegmentInfo;
    @XmlElement(name = "SeatDetails")
    protected OTAAirSeatMapRQSeatMapRequestSeatDetails seatDetails;
    @XmlAttribute(name = "TravelerRefNumberRPHs")
    protected List<String> travelerRefNumberRPHs;

    /**
     * Gets the value of the flightSegmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentType }
     *     
     */
    public FlightSegmentType getFlightSegmentInfo() {
        return flightSegmentInfo;
    }

    /**
     * Sets the value of the flightSegmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentType }
     *     
     */
    public void setFlightSegmentInfo(FlightSegmentType value) {
        this.flightSegmentInfo = value;
    }

    /**
     * Gets the value of the seatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirSeatMapRQSeatMapRequestSeatDetails }
     *     
     */
    public OTAAirSeatMapRQSeatMapRequestSeatDetails getSeatDetails() {
        return seatDetails;
    }

    /**
     * Sets the value of the seatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirSeatMapRQSeatMapRequestSeatDetails }
     *     
     */
    public void setSeatDetails(OTAAirSeatMapRQSeatMapRequestSeatDetails value) {
        this.seatDetails = value;
    }

    /**
     * Gets the value of the travelerRefNumberRPHs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRefNumberRPHs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRefNumberRPHs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTravelerRefNumberRPHs() {
        if (travelerRefNumberRPHs == null) {
            travelerRefNumberRPHs = new ArrayList<String>();
        }
        return this.travelerRefNumberRPHs;
    }

}
