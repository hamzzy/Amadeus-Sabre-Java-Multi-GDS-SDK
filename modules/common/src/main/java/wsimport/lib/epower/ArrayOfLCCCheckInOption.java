
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLCCCheckInOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLCCCheckInOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LCCCheckInOption" type="{http://epowerv5.amadeus.com.tr/WS}LCCCheckInOption" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLCCCheckInOption", propOrder = {
    "lccCheckInOption"
})
public class ArrayOfLCCCheckInOption {

    @XmlElement(name = "LCCCheckInOption", nillable = true)
    protected List<LCCCheckInOption> lccCheckInOption;

    /**
     * Gets the value of the lccCheckInOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lccCheckInOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLCCCheckInOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LCCCheckInOption }
     * 
     * 
     */
    public List<LCCCheckInOption> getLCCCheckInOption() {
        if (lccCheckInOption == null) {
            lccCheckInOption = new ArrayList<LCCCheckInOption>();
        }
        return this.lccCheckInOption;
    }

}
