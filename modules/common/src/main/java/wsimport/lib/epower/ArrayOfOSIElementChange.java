
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOSIElementChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOSIElementChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OSIElementChange" type="{http://epowerv5.amadeus.com.tr/WS}OSIElementChange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOSIElementChange", propOrder = {
    "osiElementChange"
})
public class ArrayOfOSIElementChange {

    @XmlElement(name = "OSIElementChange", nillable = true)
    protected List<OSIElementChange> osiElementChange;

    /**
     * Gets the value of the osiElementChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osiElementChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOSIElementChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OSIElementChange }
     * 
     * 
     */
    public List<OSIElementChange> getOSIElementChange() {
        if (osiElementChange == null) {
            osiElementChange = new ArrayList<OSIElementChange>();
        }
        return this.osiElementChange;
    }

}
