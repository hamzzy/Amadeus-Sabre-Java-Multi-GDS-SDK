
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfETicketItineraryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfETicketItineraryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ETicketItineraryInfo" type="{http://epowerv5.amadeus.com.tr/WS}ETicketItineraryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfETicketItineraryInfo", propOrder = {
    "eTicketItineraryInfo"
})
public class ArrayOfETicketItineraryInfo {

    @XmlElement(name = "ETicketItineraryInfo", nillable = true)
    protected List<ETicketItineraryInfo> eTicketItineraryInfo;

    /**
     * Gets the value of the eTicketItineraryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eTicketItineraryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETicketItineraryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETicketItineraryInfo }
     * 
     * 
     */
    public List<ETicketItineraryInfo> getETicketItineraryInfo() {
        if (eTicketItineraryInfo == null) {
            eTicketItineraryInfo = new ArrayList<ETicketItineraryInfo>();
        }
        return this.eTicketItineraryInfo;
    }

}
