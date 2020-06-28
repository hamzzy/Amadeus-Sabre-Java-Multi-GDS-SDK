
package wsimport.lib.amadeus.pnr.read;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCarOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCarOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarOption" type="{http://traveltalk.com/wsPNRRead}CarOption" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCarOption", propOrder = {
    "carOption"
})
public class ArrayOfCarOption {

    @XmlElement(name = "CarOption", nillable = true)
    protected List<CarOption> carOption;

    /**
     * Gets the value of the carOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarOption }
     * 
     * 
     */
    public List<CarOption> getCarOption() {
        if (carOption == null) {
            carOption = new ArrayList<CarOption>();
        }
        return this.carOption;
    }

}
