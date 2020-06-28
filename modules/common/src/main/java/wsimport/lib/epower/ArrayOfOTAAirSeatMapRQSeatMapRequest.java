
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOTA_AirSeatMapRQSeatMapRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOTA_AirSeatMapRQSeatMapRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatMapRequest" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirSeatMapRQSeatMapRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOTA_AirSeatMapRQSeatMapRequest", propOrder = {
    "seatMapRequest"
})
public class ArrayOfOTAAirSeatMapRQSeatMapRequest {

    @XmlElement(name = "SeatMapRequest")
    protected List<OTAAirSeatMapRQSeatMapRequest> seatMapRequest;

    /**
     * Gets the value of the seatMapRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatMapRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatMapRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAAirSeatMapRQSeatMapRequest }
     * 
     * 
     */
    public List<OTAAirSeatMapRQSeatMapRequest> getSeatMapRequest() {
        if (seatMapRequest == null) {
            seatMapRequest = new ArrayList<OTAAirSeatMapRQSeatMapRequest>();
        }
        return this.seatMapRequest;
    }

}
