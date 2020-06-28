
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightOptionRQ" type="{http://epowerv5.amadeus.com.tr/WS}FlightOptionRQ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightOptionRQ"
})
@XmlRootElement(name = "GetCompatibleLowestFaresForSunExpress")
public class GetCompatibleLowestFaresForSunExpress {

    @XmlElement(name = "FlightOptionRQ")
    protected FlightOptionRQ flightOptionRQ;

    /**
     * Gets the value of the flightOptionRQ property.
     * 
     * @return
     *     possible object is
     *     {@link FlightOptionRQ }
     *     
     */
    public FlightOptionRQ getFlightOptionRQ() {
        return flightOptionRQ;
    }

    /**
     * Sets the value of the flightOptionRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightOptionRQ }
     *     
     */
    public void setFlightOptionRQ(FlightOptionRQ value) {
        this.flightOptionRQ = value;
    }

}
