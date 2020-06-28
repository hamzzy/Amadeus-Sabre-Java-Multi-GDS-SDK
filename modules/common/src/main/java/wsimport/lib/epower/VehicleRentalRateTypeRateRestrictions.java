
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalRateTypeRateRestrictions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalRateTypeRateRestrictions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MinimumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MaximumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AdvancedBookingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RestrictedMileageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CorporateRateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GuaranteeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MaximumVehiclesAllowed" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="OvernightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OneWayPolicy" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalRateTypeRateRestrictionsOneWayPolicy" />
 *       &lt;attribute name="CancellationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ModificationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalRateTypeRateRestrictions")
public class VehicleRentalRateTypeRateRestrictions {

    @XmlAttribute(name = "ArriveByFlight")
    protected Boolean arriveByFlight;
    @XmlAttribute(name = "MinimumDayInd")
    protected Boolean minimumDayInd;
    @XmlAttribute(name = "MaximumDayInd")
    protected Boolean maximumDayInd;
    @XmlAttribute(name = "AdvancedBookingInd")
    protected Boolean advancedBookingInd;
    @XmlAttribute(name = "RestrictedMileageInd")
    protected Boolean restrictedMileageInd;
    @XmlAttribute(name = "CorporateRateInd")
    protected Boolean corporateRateInd;
    @XmlAttribute(name = "GuaranteeReqInd")
    protected Boolean guaranteeReqInd;
    @XmlAttribute(name = "MaximumVehiclesAllowed")
    protected BigInteger maximumVehiclesAllowed;
    @XmlAttribute(name = "OvernightInd")
    protected Boolean overnightInd;
    @XmlAttribute(name = "OneWayPolicy")
    protected VehicleRentalRateTypeRateRestrictionsOneWayPolicy oneWayPolicy;
    @XmlAttribute(name = "CancellationPenaltyInd")
    protected Boolean cancellationPenaltyInd;
    @XmlAttribute(name = "ModificationPenaltyInd")
    protected Boolean modificationPenaltyInd;

    /**
     * Gets the value of the arriveByFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isArriveByFlight() {
        if (arriveByFlight == null) {
            return false;
        } else {
            return arriveByFlight;
        }
    }

    /**
     * Sets the value of the arriveByFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArriveByFlight(Boolean value) {
        this.arriveByFlight = value;
    }

    /**
     * Gets the value of the minimumDayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumDayInd() {
        return minimumDayInd;
    }

    /**
     * Sets the value of the minimumDayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumDayInd(Boolean value) {
        this.minimumDayInd = value;
    }

    /**
     * Gets the value of the maximumDayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumDayInd() {
        return maximumDayInd;
    }

    /**
     * Sets the value of the maximumDayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumDayInd(Boolean value) {
        this.maximumDayInd = value;
    }

    /**
     * Gets the value of the advancedBookingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvancedBookingInd() {
        return advancedBookingInd;
    }

    /**
     * Sets the value of the advancedBookingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvancedBookingInd(Boolean value) {
        this.advancedBookingInd = value;
    }

    /**
     * Gets the value of the restrictedMileageInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedMileageInd() {
        return restrictedMileageInd;
    }

    /**
     * Sets the value of the restrictedMileageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedMileageInd(Boolean value) {
        this.restrictedMileageInd = value;
    }

    /**
     * Gets the value of the corporateRateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorporateRateInd() {
        return corporateRateInd;
    }

    /**
     * Sets the value of the corporateRateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorporateRateInd(Boolean value) {
        this.corporateRateInd = value;
    }

    /**
     * Gets the value of the guaranteeReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteeReqInd() {
        return guaranteeReqInd;
    }

    /**
     * Sets the value of the guaranteeReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteeReqInd(Boolean value) {
        this.guaranteeReqInd = value;
    }

    /**
     * Gets the value of the maximumVehiclesAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumVehiclesAllowed() {
        return maximumVehiclesAllowed;
    }

    /**
     * Sets the value of the maximumVehiclesAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumVehiclesAllowed(BigInteger value) {
        this.maximumVehiclesAllowed = value;
    }

    /**
     * Gets the value of the overnightInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOvernightInd() {
        return overnightInd;
    }

    /**
     * Sets the value of the overnightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOvernightInd(Boolean value) {
        this.overnightInd = value;
    }

    /**
     * Gets the value of the oneWayPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateTypeRateRestrictionsOneWayPolicy }
     *     
     */
    public VehicleRentalRateTypeRateRestrictionsOneWayPolicy getOneWayPolicy() {
        return oneWayPolicy;
    }

    /**
     * Sets the value of the oneWayPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateTypeRateRestrictionsOneWayPolicy }
     *     
     */
    public void setOneWayPolicy(VehicleRentalRateTypeRateRestrictionsOneWayPolicy value) {
        this.oneWayPolicy = value;
    }

    /**
     * Gets the value of the cancellationPenaltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellationPenaltyInd() {
        return cancellationPenaltyInd;
    }

    /**
     * Sets the value of the cancellationPenaltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellationPenaltyInd(Boolean value) {
        this.cancellationPenaltyInd = value;
    }

    /**
     * Gets the value of the modificationPenaltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModificationPenaltyInd() {
        return modificationPenaltyInd;
    }

    /**
     * Sets the value of the modificationPenaltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModificationPenaltyInd(Boolean value) {
        this.modificationPenaltyInd = value;
    }

}
