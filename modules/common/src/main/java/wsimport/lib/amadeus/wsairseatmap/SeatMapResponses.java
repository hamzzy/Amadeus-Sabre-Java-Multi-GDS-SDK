
package wsimport.lib.amadeus.wsairseatmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatMapResponses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapResponses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatMapResponse" type="{http://traveltalk.com/wsAirSeatMap}SeatMapResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirTravelers" type="{http://traveltalk.com/wsAirSeatMap}ArrayOfAirTraveler" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapResponses", propOrder = {
    "seatMapResponse",
    "airTravelers"
})
public class SeatMapResponses {

    @XmlElement(name = "SeatMapResponse")
    protected List<SeatMapResponse> seatMapResponse;
    @XmlElement(name = "AirTravelers")
    protected ArrayOfAirTraveler airTravelers;

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
     * {@link SeatMapResponse }
     * 
     * 
     */
    public List<SeatMapResponse> getSeatMapResponse() {
        if (seatMapResponse == null) {
            seatMapResponse = new ArrayList<SeatMapResponse>();
        }
        return this.seatMapResponse;
    }

    /**
     * Gets the value of the airTravelers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirTraveler }
     *     
     */
    public ArrayOfAirTraveler getAirTravelers() {
        return airTravelers;
    }

    /**
     * Sets the value of the airTravelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirTraveler }
     *     
     */
    public void setAirTravelers(ArrayOfAirTraveler value) {
        this.airTravelers = value;
    }

}
