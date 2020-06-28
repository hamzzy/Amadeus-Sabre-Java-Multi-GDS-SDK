
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinAvailabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Meal" type="{http://epowerv5.amadeus.com.tr/WS}CabinAvailabilityTypeMeal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BaggageAllowance" type="{http://epowerv5.amadeus.com.tr/WS}CabinAvailabilityTypeBaggageAllowance" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CabinType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}CabinType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinAvailabilityType", propOrder = {
    "meal",
    "baggageAllowance"
})
@XmlSeeAlso({
    MarketingCabinType.class
})
public class CabinAvailabilityType {

    @XmlElement(name = "Meal")
    protected List<CabinAvailabilityTypeMeal> meal;
    @XmlElement(name = "BaggageAllowance")
    protected CabinAvailabilityTypeBaggageAllowance baggageAllowance;
    @XmlAttribute(name = "CabinType", required = true)
    protected CabinType cabinType;

    /**
     * Gets the value of the meal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinAvailabilityTypeMeal }
     * 
     * 
     */
    public List<CabinAvailabilityTypeMeal> getMeal() {
        if (meal == null) {
            meal = new ArrayList<CabinAvailabilityTypeMeal>();
        }
        return this.meal;
    }

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link CabinAvailabilityTypeBaggageAllowance }
     *     
     */
    public CabinAvailabilityTypeBaggageAllowance getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinAvailabilityTypeBaggageAllowance }
     *     
     */
    public void setBaggageAllowance(CabinAvailabilityTypeBaggageAllowance value) {
        this.baggageAllowance = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinType(CabinType value) {
        this.cabinType = value;
    }

}
