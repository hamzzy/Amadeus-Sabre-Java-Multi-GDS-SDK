
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryCatalogueItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryCatalogueItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="AncillaryCatalogueItem" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAncillaryCatalogueItemType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryCatalogueItemsType", propOrder = {
    "ancillaryCatalogueItemOrErrors"
})
public class AncillaryCatalogueItemsType {

    @XmlElements({
        @XmlElement(name = "AncillaryCatalogueItem", type = ArrayOfAncillaryCatalogueItemType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class)
    })
    protected List<Object> ancillaryCatalogueItemOrErrors;

    /**
     * Gets the value of the ancillaryCatalogueItemOrErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryCatalogueItemOrErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryCatalogueItemOrErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAncillaryCatalogueItemType }
     * {@link ErrorsType }
     * 
     * 
     */
    public List<Object> getAncillaryCatalogueItemOrErrors() {
        if (ancillaryCatalogueItemOrErrors == null) {
            ancillaryCatalogueItemOrErrors = new ArrayList<Object>();
        }
        return this.ancillaryCatalogueItemOrErrors;
    }

}
