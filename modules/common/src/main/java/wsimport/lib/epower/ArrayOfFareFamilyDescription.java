
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFareFamilyDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFareFamilyDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareFamilyDescription" type="{http://epowerv5.amadeus.com.tr/WS}FareFamilyDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFareFamilyDescription", propOrder = {
    "fareFamilyDescription"
})
public class ArrayOfFareFamilyDescription {

    @XmlElement(name = "FareFamilyDescription", nillable = true)
    protected List<FareFamilyDescription> fareFamilyDescription;

    /**
     * Gets the value of the fareFamilyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareFamilyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareFamilyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareFamilyDescription }
     * 
     * 
     */
    public List<FareFamilyDescription> getFareFamilyDescription() {
        if (fareFamilyDescription == null) {
            fareFamilyDescription = new ArrayList<FareFamilyDescription>();
        }
        return this.fareFamilyDescription;
    }

}
