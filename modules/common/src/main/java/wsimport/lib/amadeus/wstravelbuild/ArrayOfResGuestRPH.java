
package wsimport.lib.amadeus.wstravelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResGuestRPH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResGuestRPH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResGuestRPH" type="{http://traveltalk.com/wsTravelBuild}ResGuestRPH" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResGuestRPH", propOrder = {
    "resGuestRPH"
})
public class ArrayOfResGuestRPH {

    @XmlElement(name = "ResGuestRPH")
    protected List<ResGuestRPH> resGuestRPH;

    /**
     * Gets the value of the resGuestRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resGuestRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResGuestRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResGuestRPH }
     * 
     * 
     */
    public List<ResGuestRPH> getResGuestRPH() {
        if (resGuestRPH == null) {
            resGuestRPH = new ArrayList<ResGuestRPH>();
        }
        return this.resGuestRPH;
    }

}
