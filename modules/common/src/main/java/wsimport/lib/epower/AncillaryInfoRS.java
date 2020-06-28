
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryInfoRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryInfoRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *           &lt;element name="AncillaryCatalogueItems" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryCatalogueItemsType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
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
@XmlType(name = "AncillaryInfoRS", propOrder = {
    "errorsOrAncillaryCatalogueItemsOrWarnings"
})
public class AncillaryInfoRS {

    @XmlElements({
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "AncillaryCatalogueItems", type = AncillaryCatalogueItemsType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Success", type = SuccessType.class)
    })
    protected List<Object> errorsOrAncillaryCatalogueItemsOrWarnings;

    /**
     * Gets the value of the errorsOrAncillaryCatalogueItemsOrWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorsOrAncillaryCatalogueItemsOrWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorsOrAncillaryCatalogueItemsOrWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorsType }
     * {@link AncillaryCatalogueItemsType }
     * {@link WarningsType }
     * {@link SuccessType }
     * 
     * 
     */
    public List<Object> getErrorsOrAncillaryCatalogueItemsOrWarnings() {
        if (errorsOrAncillaryCatalogueItemsOrWarnings == null) {
            errorsOrAncillaryCatalogueItemsOrWarnings = new ArrayList<Object>();
        }
        return this.errorsOrAncillaryCatalogueItemsOrWarnings;
    }

}
