
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PNRListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PNRListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PNRListItem" type="{http://epowerv5.amadeus.com.tr/WS}PNRListItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PNRListType", propOrder = {
    "pnrListItem"
})
public class PNRListType {

    @XmlElement(name = "PNRListItem")
    protected List<PNRListItemType> pnrListItem;

    /**
     * Gets the value of the pnrListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNRListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRListItemType }
     * 
     * 
     */
    public List<PNRListItemType> getPNRListItem() {
        if (pnrListItem == null) {
            pnrListItem = new ArrayList<PNRListItemType>();
        }
        return this.pnrListItem;
    }

}
