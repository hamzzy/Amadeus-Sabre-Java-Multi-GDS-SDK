
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPlanRestrictionTypePlanRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPlanRestrictionTypePlanRestriction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlanRestriction" type="{http://epowerv5.amadeus.com.tr/WS}PlanRestrictionTypePlanRestriction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPlanRestrictionTypePlanRestriction", propOrder = {
    "planRestriction"
})
public class ArrayOfPlanRestrictionTypePlanRestriction {

    @XmlElement(name = "PlanRestriction")
    protected List<PlanRestrictionTypePlanRestriction> planRestriction;

    /**
     * Gets the value of the planRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanRestrictionTypePlanRestriction }
     * 
     * 
     */
    public List<PlanRestrictionTypePlanRestriction> getPlanRestriction() {
        if (planRestriction == null) {
            planRestriction = new ArrayList<PlanRestrictionTypePlanRestriction>();
        }
        return this.planRestriction;
    }

}
