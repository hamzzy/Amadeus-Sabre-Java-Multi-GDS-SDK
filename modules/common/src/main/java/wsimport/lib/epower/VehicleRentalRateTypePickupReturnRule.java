
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalRateTypePickupReturnRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalRateTypePickupReturnRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DayOfWeek" type="{http://epowerv5.amadeus.com.tr/WS}DayOfWeekType" />
 *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RuleType" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalRateTypePickupReturnRuleRuleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalRateTypePickupReturnRule")
public class VehicleRentalRateTypePickupReturnRule {

    @XmlAttribute(name = "DayOfWeek")
    protected DayOfWeekType dayOfWeek;
    @XmlAttribute(name = "Time")
    protected String time;
    @XmlAttribute(name = "RuleType")
    protected VehicleRentalRateTypePickupReturnRuleRuleType ruleType;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDayOfWeek(DayOfWeekType value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the ruleType property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateTypePickupReturnRuleRuleType }
     *     
     */
    public VehicleRentalRateTypePickupReturnRuleRuleType getRuleType() {
        return ruleType;
    }

    /**
     * Sets the value of the ruleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateTypePickupReturnRuleRuleType }
     *     
     */
    public void setRuleType(VehicleRentalRateTypePickupReturnRuleRuleType value) {
        this.ruleType = value;
    }

}
