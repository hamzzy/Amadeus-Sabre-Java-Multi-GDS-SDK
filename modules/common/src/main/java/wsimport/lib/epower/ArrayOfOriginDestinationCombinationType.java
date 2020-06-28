
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOriginDestinationCombinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOriginDestinationCombinationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationCombination" type="{http://epowerv5.amadeus.com.tr/WS}OriginDestinationCombinationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOriginDestinationCombinationType", propOrder = {
    "originDestinationCombination"
})
public class ArrayOfOriginDestinationCombinationType {

    @XmlElement(name = "OriginDestinationCombination", nillable = true)
    protected List<OriginDestinationCombinationType> originDestinationCombination;

    /**
     * Gets the value of the originDestinationCombination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationCombination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationCombination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestinationCombinationType }
     * 
     * 
     */
    public List<OriginDestinationCombinationType> getOriginDestinationCombination() {
        if (originDestinationCombination == null) {
            originDestinationCombination = new ArrayList<OriginDestinationCombinationType>();
        }
        return this.originDestinationCombination;
    }

}
