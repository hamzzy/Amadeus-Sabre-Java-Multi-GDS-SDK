
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirSeatMapRSSeatMapResponses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirSeatMapRSSeatMapResponses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatMapResponse" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirSeatMapRSSeatMapResponsesSeatMapResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirTravelers" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOTA_AirSeatMapRSSeatMapResponsesAirTraveler" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirSeatMapRSSeatMapResponses", propOrder = {
    "seatMapResponse",
    "airTravelers"
})
public class OTAAirSeatMapRSSeatMapResponses {

    @XmlElement(name = "SeatMapResponse")
    protected List<OTAAirSeatMapRSSeatMapResponsesSeatMapResponse> seatMapResponse;
    @XmlElement(name = "AirTravelers")
    protected ArrayOfOTAAirSeatMapRSSeatMapResponsesAirTraveler airTravelers;

    /**
     * Gets the value of the seatMapResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatMapResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatMapResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAAirSeatMapRSSeatMapResponsesSeatMapResponse }
     * 
     * 
     */
    public List<OTAAirSeatMapRSSeatMapResponsesSeatMapResponse> getSeatMapResponse() {
        if (seatMapResponse == null) {
            seatMapResponse = new ArrayList<OTAAirSeatMapRSSeatMapResponsesSeatMapResponse>();
        }
        return this.seatMapResponse;
    }

    /**
     * Gets the value of the airTravelers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOTAAirSeatMapRSSeatMapResponsesAirTraveler }
     *     
     */
    public ArrayOfOTAAirSeatMapRSSeatMapResponsesAirTraveler getAirTravelers() {
        return airTravelers;
    }

    /**
     * Sets the value of the airTravelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOTAAirSeatMapRSSeatMapResponsesAirTraveler }
     *     
     */
    public void setAirTravelers(ArrayOfOTAAirSeatMapRSSeatMapResponsesAirTraveler value) {
        this.airTravelers = value;
    }

}
