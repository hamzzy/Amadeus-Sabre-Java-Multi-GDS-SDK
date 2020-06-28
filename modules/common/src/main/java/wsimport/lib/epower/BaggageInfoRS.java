
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaggageInfoRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageInfoRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
 *           &lt;element name="FreeBaggageAllowances" type="{http://epowerv5.amadeus.com.tr/WS}FreeBaggageAllowancesTypes" minOccurs="0"/>
 *           &lt;element name="AncillaryCatalogueItems" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryCatalogueItemsType" minOccurs="0"/>
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
@XmlType(name = "BaggageInfoRS", propOrder = {
    "successOrErrorsOrWarnings"
})
public class BaggageInfoRS {

    @XmlElements({
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "FreeBaggageAllowances", type = FreeBaggageAllowancesTypes.class),
        @XmlElement(name = "AncillaryCatalogueItems", type = AncillaryCatalogueItemsType.class)
    })
    protected List<Object> successOrErrorsOrWarnings;

    /**
     * Gets the value of the successOrErrorsOrWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successOrErrorsOrWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessOrErrorsOrWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessType }
     * {@link ErrorsType }
     * {@link WarningsType }
     * {@link FreeBaggageAllowancesTypes }
     * {@link AncillaryCatalogueItemsType }
     * 
     * 
     */
    public List<Object> getSuccessOrErrorsOrWarnings() {
        if (successOrErrorsOrWarnings == null) {
            successOrErrorsOrWarnings = new ArrayList<Object>();
        }
        return this.successOrErrorsOrWarnings;
    }

}
