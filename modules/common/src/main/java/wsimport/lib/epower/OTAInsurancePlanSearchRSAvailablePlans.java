
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_InsurancePlanSearchRSAvailablePlans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsurancePlanSearchRSAvailablePlans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailablePlan" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRSAvailablePlansAvailablePlan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_InsurancePlanSearchRSAvailablePlans", propOrder = {
    "availablePlan"
})
public class OTAInsurancePlanSearchRSAvailablePlans {

    @XmlElement(name = "AvailablePlan")
    protected List<OTAInsurancePlanSearchRSAvailablePlansAvailablePlan> availablePlan;

    /**
     * Gets the value of the availablePlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availablePlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailablePlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlan }
     * 
     * 
     */
    public List<OTAInsurancePlanSearchRSAvailablePlansAvailablePlan> getAvailablePlan() {
        if (availablePlan == null) {
            availablePlan = new ArrayList<OTAInsurancePlanSearchRSAvailablePlansAvailablePlan>();
        }
        return this.availablePlan;
    }

}
