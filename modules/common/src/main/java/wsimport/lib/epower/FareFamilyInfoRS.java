
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareFamilyInfoRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyInfoRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *           &lt;element name="FareFamilies" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFareFamily" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
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
@XmlType(name = "FareFamilyInfoRS", propOrder = {
    "successOrErrorsOrFareFamilies"
})
public class FareFamilyInfoRS {

    @XmlElements({
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "FareFamilies", type = ArrayOfFareFamily.class),
        @XmlElement(name = "Warnings", type = WarningsType.class)
    })
    protected List<Object> successOrErrorsOrFareFamilies;

    /**
     * Gets the value of the successOrErrorsOrFareFamilies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successOrErrorsOrFareFamilies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessOrErrorsOrFareFamilies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessType }
     * {@link ErrorsType }
     * {@link ArrayOfFareFamily }
     * {@link WarningsType }
     * 
     * 
     */
    public List<Object> getSuccessOrErrorsOrFareFamilies() {
        if (successOrErrorsOrFareFamilies == null) {
            successOrErrorsOrFareFamilies = new ArrayList<Object>();
        }
        return this.successOrErrorsOrFareFamilies;
    }

}
