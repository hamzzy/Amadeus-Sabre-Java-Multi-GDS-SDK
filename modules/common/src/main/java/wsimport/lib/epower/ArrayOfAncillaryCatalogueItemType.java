
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAncillaryCatalogueItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAncillaryCatalogueItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AncillaryCatalogueItemType" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryCatalogueItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAncillaryCatalogueItemType", propOrder = {
    "ancillaryCatalogueItemType"
})
public class ArrayOfAncillaryCatalogueItemType {

    @XmlElement(name = "AncillaryCatalogueItemType", nillable = true)
    protected List<AncillaryCatalogueItemType> ancillaryCatalogueItemType;

    /**
     * Gets the value of the ancillaryCatalogueItemType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryCatalogueItemType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryCatalogueItemType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryCatalogueItemType }
     * 
     * 
     */
    public List<AncillaryCatalogueItemType> getAncillaryCatalogueItemType() {
        if (ancillaryCatalogueItemType == null) {
            ancillaryCatalogueItemType = new ArrayList<AncillaryCatalogueItemType>();
        }
        return this.ancillaryCatalogueItemType;
    }

}
