
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleReservationRQCoreTypeRateDistance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationRQCoreTypeRateDistance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Unlimited" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="DistUnitName" type="{http://epowerv5.amadeus.com.tr/WS}DistanceUnitNameType" />
 *       &lt;attribute name="VehiclePeriodUnitName" type="{http://epowerv5.amadeus.com.tr/WS}VehiclePeriodUnitNameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationRQCoreTypeRateDistance")
public class VehicleReservationRQCoreTypeRateDistance {

    @XmlAttribute(name = "Unlimited", required = true)
    protected boolean unlimited;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "DistUnitName")
    protected DistanceUnitNameType distUnitName;
    @XmlAttribute(name = "VehiclePeriodUnitName")
    protected VehiclePeriodUnitNameType vehiclePeriodUnitName;

    /**
     * Gets the value of the unlimited property.
     * 
     */
    public boolean isUnlimited() {
        return unlimited;
    }

    /**
     * Sets the value of the unlimited property.
     * 
     */
    public void setUnlimited(boolean value) {
        this.unlimited = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the distUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public DistanceUnitNameType getDistUnitName() {
        return distUnitName;
    }

    /**
     * Sets the value of the distUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public void setDistUnitName(DistanceUnitNameType value) {
        this.distUnitName = value;
    }

    /**
     * Gets the value of the vehiclePeriodUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePeriodUnitNameType }
     *     
     */
    public VehiclePeriodUnitNameType getVehiclePeriodUnitName() {
        return vehiclePeriodUnitName;
    }

    /**
     * Sets the value of the vehiclePeriodUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePeriodUnitNameType }
     *     
     */
    public void setVehiclePeriodUnitName(VehiclePeriodUnitNameType value) {
        this.vehiclePeriodUnitName = value;
    }

}
