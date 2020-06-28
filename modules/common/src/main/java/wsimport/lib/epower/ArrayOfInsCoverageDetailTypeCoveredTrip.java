
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInsCoverageDetailTypeCoveredTrip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInsCoverageDetailTypeCoveredTrip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoveredTrip" type="{http://epowerv5.amadeus.com.tr/WS}InsCoverageDetailTypeCoveredTrip" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInsCoverageDetailTypeCoveredTrip", propOrder = {
    "coveredTrip"
})
public class ArrayOfInsCoverageDetailTypeCoveredTrip {

    @XmlElement(name = "CoveredTrip")
    protected List<InsCoverageDetailTypeCoveredTrip> coveredTrip;

    /**
     * Gets the value of the coveredTrip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveredTrip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveredTrip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsCoverageDetailTypeCoveredTrip }
     * 
     * 
     */
    public List<InsCoverageDetailTypeCoveredTrip> getCoveredTrip() {
        if (coveredTrip == null) {
            coveredTrip = new ArrayList<InsCoverageDetailTypeCoveredTrip>();
        }
        return this.coveredTrip;
    }

}
