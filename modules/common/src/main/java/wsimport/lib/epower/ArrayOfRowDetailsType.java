
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRowDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRowDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirRow" type="{http://epowerv5.amadeus.com.tr/WS}RowDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRowDetailsType", propOrder = {
    "airRow"
})
public class ArrayOfRowDetailsType {

    @XmlElement(name = "AirRow")
    protected List<RowDetailsType> airRow;

    /**
     * Gets the value of the airRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowDetailsType }
     * 
     * 
     */
    public List<RowDetailsType> getAirRow() {
        if (airRow == null) {
            airRow = new ArrayList<RowDetailsType>();
        }
        return this.airRow;
    }

}
