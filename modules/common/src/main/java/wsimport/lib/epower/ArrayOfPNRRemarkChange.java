
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPNRRemarkChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPNRRemarkChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PNRRemarkChange" type="{http://epowerv5.amadeus.com.tr/WS}PNRRemarkChange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPNRRemarkChange", propOrder = {
    "pnrRemarkChange"
})
public class ArrayOfPNRRemarkChange {

    @XmlElement(name = "PNRRemarkChange", nillable = true)
    protected List<PNRRemarkChange> pnrRemarkChange;

    /**
     * Gets the value of the pnrRemarkChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrRemarkChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRRemarkChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRRemarkChange }
     * 
     * 
     */
    public List<PNRRemarkChange> getPNRRemarkChange() {
        if (pnrRemarkChange == null) {
            pnrRemarkChange = new ArrayList<PNRRemarkChange>();
        }
        return this.pnrRemarkChange;
    }

}
