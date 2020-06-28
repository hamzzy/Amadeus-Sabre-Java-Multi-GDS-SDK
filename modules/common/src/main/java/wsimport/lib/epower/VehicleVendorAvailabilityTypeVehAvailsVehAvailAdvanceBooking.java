
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OffsetTimeUnit" type="{http://epowerv5.amadeus.com.tr/WS}TimeUnitType" />
 *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="OffsetDropTime" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalRateTypeRateGuaranteeOffsetDropTime" />
 *       &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking")
public class VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking {

    @XmlAttribute(name = "AbsoluteDeadline")
    protected String absoluteDeadline;
    @XmlAttribute(name = "OffsetTimeUnit")
    protected TimeUnitType offsetTimeUnit;
    @XmlAttribute(name = "OffsetUnitMultiplier")
    protected BigInteger offsetUnitMultiplier;
    @XmlAttribute(name = "OffsetDropTime")
    protected VehicleRentalRateTypeRateGuaranteeOffsetDropTime offsetDropTime;
    @XmlAttribute(name = "RulesApplyInd")
    protected Boolean rulesApplyInd;

    /**
     * Gets the value of the absoluteDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsoluteDeadline() {
        return absoluteDeadline;
    }

    /**
     * Sets the value of the absoluteDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsoluteDeadline(String value) {
        this.absoluteDeadline = value;
    }

    /**
     * Gets the value of the offsetTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitType }
     *     
     */
    public TimeUnitType getOffsetTimeUnit() {
        return offsetTimeUnit;
    }

    /**
     * Sets the value of the offsetTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitType }
     *     
     */
    public void setOffsetTimeUnit(TimeUnitType value) {
        this.offsetTimeUnit = value;
    }

    /**
     * Gets the value of the offsetUnitMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffsetUnitMultiplier() {
        return offsetUnitMultiplier;
    }

    /**
     * Sets the value of the offsetUnitMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffsetUnitMultiplier(BigInteger value) {
        this.offsetUnitMultiplier = value;
    }

    /**
     * Gets the value of the offsetDropTime property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateTypeRateGuaranteeOffsetDropTime }
     *     
     */
    public VehicleRentalRateTypeRateGuaranteeOffsetDropTime getOffsetDropTime() {
        return offsetDropTime;
    }

    /**
     * Sets the value of the offsetDropTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateTypeRateGuaranteeOffsetDropTime }
     *     
     */
    public void setOffsetDropTime(VehicleRentalRateTypeRateGuaranteeOffsetDropTime value) {
        this.offsetDropTime = value;
    }

    /**
     * Gets the value of the rulesApplyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRulesApplyInd() {
        return rulesApplyInd;
    }

    /**
     * Sets the value of the rulesApplyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRulesApplyInd(Boolean value) {
        this.rulesApplyInd = value;
    }

}
