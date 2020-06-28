
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLCCBaggageFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLCCBaggageFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LCCBaggageFee" type="{http://epowerv5.amadeus.com.tr/WS}LCCBaggageFee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLCCBaggageFee", propOrder = {
    "lccBaggageFee"
})
public class ArrayOfLCCBaggageFee {

    @XmlElement(name = "LCCBaggageFee", nillable = true)
    protected List<LCCBaggageFee> lccBaggageFee;

    /**
     * Gets the value of the lccBaggageFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lccBaggageFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLCCBaggageFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LCCBaggageFee }
     * 
     * 
     */
    public List<LCCBaggageFee> getLCCBaggageFee() {
        if (lccBaggageFee == null) {
            lccBaggageFee = new ArrayList<LCCBaggageFee>();
        }
        return this.lccBaggageFee;
    }

}
