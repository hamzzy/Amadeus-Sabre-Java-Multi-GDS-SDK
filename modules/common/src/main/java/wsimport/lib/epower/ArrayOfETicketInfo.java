
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfETicketInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfETicketInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ETicketInfo" type="{http://epowerv5.amadeus.com.tr/WS}ETicketInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfETicketInfo", propOrder = {
    "eTicketInfo"
})
public class ArrayOfETicketInfo {

    @XmlElement(name = "ETicketInfo", nillable = true)
    protected List<ETicketInfo> eTicketInfo;

    /**
     * Gets the value of the eTicketInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eTicketInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETicketInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETicketInfo }
     * 
     * 
     */
    public List<ETicketInfo> getETicketInfo() {
        if (eTicketInfo == null) {
            eTicketInfo = new ArrayList<ETicketInfo>();
        }
        return this.eTicketInfo;
    }

}
