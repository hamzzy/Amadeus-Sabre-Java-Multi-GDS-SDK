
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPassengerSpecialRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPassengerSpecialRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerSpecialRequest" type="{http://epowerv5.amadeus.com.tr/WS}PassengerSpecialRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPassengerSpecialRequest", propOrder = {
    "passengerSpecialRequest"
})
public class ArrayOfPassengerSpecialRequest {

    @XmlElement(name = "PassengerSpecialRequest", nillable = true)
    protected List<PassengerSpecialRequest> passengerSpecialRequest;

    /**
     * Gets the value of the passengerSpecialRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerSpecialRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerSpecialRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerSpecialRequest }
     * 
     * 
     */
    public List<PassengerSpecialRequest> getPassengerSpecialRequest() {
        if (passengerSpecialRequest == null) {
            passengerSpecialRequest = new ArrayList<PassengerSpecialRequest>();
        }
        return this.passengerSpecialRequest;
    }

}
