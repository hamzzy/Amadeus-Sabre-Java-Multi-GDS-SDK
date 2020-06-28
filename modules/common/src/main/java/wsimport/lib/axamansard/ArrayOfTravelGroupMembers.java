
package wsimport.lib.axamansard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTravelGroupMembers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTravelGroupMembers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelGroupMembers" type="{http://tempuri.org/}TravelGroupMembers" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTravelGroupMembers", propOrder = {
    "travelGroupMembers"
})
public class ArrayOfTravelGroupMembers {

    @XmlElement(name = "TravelGroupMembers", nillable = true)
    protected List<TravelGroupMembers> travelGroupMembers;

    /**
     * Gets the value of the travelGroupMembers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelGroupMembers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelGroupMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelGroupMembers }
     * 
     * 
     */
    public List<TravelGroupMembers> getTravelGroupMembers() {
        if (travelGroupMembers == null) {
            travelGroupMembers = new ArrayList<TravelGroupMembers>();
        }
        return this.travelGroupMembers;
    }

}
