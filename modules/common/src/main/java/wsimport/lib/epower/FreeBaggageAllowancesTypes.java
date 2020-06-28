
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreeBaggageAllowancesTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeBaggageAllowancesTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="FreeBaggageAllowance" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFreeBaggageAllowanceTypes" minOccurs="0"/>
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
@XmlType(name = "FreeBaggageAllowancesTypes", propOrder = {
    "freeBaggageAllowanceOrErrors"
})
public class FreeBaggageAllowancesTypes {

    @XmlElements({
        @XmlElement(name = "FreeBaggageAllowance", type = ArrayOfFreeBaggageAllowanceTypes.class),
        @XmlElement(name = "Errors", type = ErrorsType.class)
    })
    protected List<Object> freeBaggageAllowanceOrErrors;

    /**
     * Gets the value of the freeBaggageAllowanceOrErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeBaggageAllowanceOrErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeBaggageAllowanceOrErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfFreeBaggageAllowanceTypes }
     * {@link ErrorsType }
     * 
     * 
     */
    public List<Object> getFreeBaggageAllowanceOrErrors() {
        if (freeBaggageAllowanceOrErrors == null) {
            freeBaggageAllowanceOrErrors = new ArrayList<Object>();
        }
        return this.freeBaggageAllowanceOrErrors;
    }

}
