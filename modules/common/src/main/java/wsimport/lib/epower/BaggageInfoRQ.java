
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaggageInfoRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageInfoRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}ServiceFeeInfoRQ">
 *       &lt;sequence>
 *         &lt;element name="Passenger" type="{http://epowerv5.amadeus.com.tr/WS}PassengerInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageInfoRQ", propOrder = {
    "passenger"
})
@XmlSeeAlso({
    AncillaryInfoRQ.class
})
public class BaggageInfoRQ
    extends ServiceFeeInfoRQ
{

    @XmlElement(name = "Passenger")
    protected List<PassengerInfo> passenger;

    /**
     * Gets the value of the passenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInfo }
     * 
     * 
     */
    public List<PassengerInfo> getPassenger() {
        if (passenger == null) {
            passenger = new ArrayList<PassengerInfo>();
        }
        return this.passenger;
    }

}
