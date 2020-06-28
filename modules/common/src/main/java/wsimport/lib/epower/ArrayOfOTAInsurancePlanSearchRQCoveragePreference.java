
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOTA_InsurancePlanSearchRQCoveragePreference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOTA_InsurancePlanSearchRQCoveragePreference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoveragePreference" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRQCoveragePreference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOTA_InsurancePlanSearchRQCoveragePreference", propOrder = {
    "coveragePreference"
})
public class ArrayOfOTAInsurancePlanSearchRQCoveragePreference {

    @XmlElement(name = "CoveragePreference")
    protected List<OTAInsurancePlanSearchRQCoveragePreference> coveragePreference;

    /**
     * Gets the value of the coveragePreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveragePreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveragePreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAInsurancePlanSearchRQCoveragePreference }
     * 
     * 
     */
    public List<OTAInsurancePlanSearchRQCoveragePreference> getCoveragePreference() {
        if (coveragePreference == null) {
            coveragePreference = new ArrayList<OTAInsurancePlanSearchRQCoveragePreference>();
        }
        return this.coveragePreference;
    }

}
