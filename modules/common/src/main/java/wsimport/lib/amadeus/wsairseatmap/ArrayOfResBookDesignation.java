
package wsimport.lib.amadeus.wsairseatmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResBookDesignation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResBookDesignation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResBookDesignation" type="{http://traveltalk.com/wsAirSeatMap}ResBookDesignation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResBookDesignation", propOrder = {
    "resBookDesignation"
})
public class ArrayOfResBookDesignation {

    @XmlElement(name = "ResBookDesignation")
    protected List<ResBookDesignation> resBookDesignation;

    /**
     * Gets the value of the resBookDesignation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resBookDesignation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResBookDesignation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResBookDesignation }
     * 
     * 
     */
    public List<ResBookDesignation> getResBookDesignation() {
        if (resBookDesignation == null) {
            resBookDesignation = new ArrayList<ResBookDesignation>();
        }
        return this.resBookDesignation;
    }

}
