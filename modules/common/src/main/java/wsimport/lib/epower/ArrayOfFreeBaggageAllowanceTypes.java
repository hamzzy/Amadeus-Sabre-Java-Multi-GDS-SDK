
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFreeBaggageAllowanceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFreeBaggageAllowanceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FreeBaggageAllowanceTypes" type="{http://epowerv5.amadeus.com.tr/WS}FreeBaggageAllowanceTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFreeBaggageAllowanceTypes", propOrder = {
    "freeBaggageAllowanceTypes"
})
public class ArrayOfFreeBaggageAllowanceTypes {

    @XmlElement(name = "FreeBaggageAllowanceTypes", nillable = true)
    protected List<FreeBaggageAllowanceTypes> freeBaggageAllowanceTypes;

    /**
     * Gets the value of the freeBaggageAllowanceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeBaggageAllowanceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeBaggageAllowanceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeBaggageAllowanceTypes }
     * 
     * 
     */
    public List<FreeBaggageAllowanceTypes> getFreeBaggageAllowanceTypes() {
        if (freeBaggageAllowanceTypes == null) {
            freeBaggageAllowanceTypes = new ArrayList<FreeBaggageAllowanceTypes>();
        }
        return this.freeBaggageAllowanceTypes;
    }

}
