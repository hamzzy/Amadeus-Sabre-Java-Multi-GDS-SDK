
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOSIelement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOSIelement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OSIelement" type="{http://epowerv5.amadeus.com.tr/WS}OSIelement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOSIelement", propOrder = {
    "osIelement"
})
public class ArrayOfOSIelement {

    @XmlElement(name = "OSIelement", nillable = true)
    protected List<OSIelement> osIelement;

    /**
     * Gets the value of the osIelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osIelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOSIelement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OSIelement }
     * 
     * 
     */
    public List<OSIelement> getOSIelement() {
        if (osIelement == null) {
            osIelement = new ArrayList<OSIelement>();
        }
        return this.osIelement;
    }

}
