
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleVendorAvailabilityTypeVehAvailsVehAvail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleVendorAvailabilityTypeVehAvailsVehAvail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehAvailCore" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailCoreType" minOccurs="0"/>
 *         &lt;element name="VehAvailInfo" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailAdditionalInfoType" minOccurs="0"/>
 *         &lt;element name="AdvanceBooking" type="{http://epowerv5.amadeus.com.tr/WS}VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VehicleId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleVendorAvailabilityTypeVehAvailsVehAvail", propOrder = {
    "vehAvailCore",
    "vehAvailInfo",
    "advanceBooking"
})
public class VehicleVendorAvailabilityTypeVehAvailsVehAvail {

    @XmlElement(name = "VehAvailCore")
    protected VehicleAvailCoreType vehAvailCore;
    @XmlElement(name = "VehAvailInfo")
    protected VehicleAvailAdditionalInfoType vehAvailInfo;
    @XmlElement(name = "AdvanceBooking")
    protected VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking advanceBooking;
    @XmlAttribute(name = "VehicleId")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger vehicleId;

    /**
     * Gets the value of the vehAvailCore property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType }
     *     
     */
    public VehicleAvailCoreType getVehAvailCore() {
        return vehAvailCore;
    }

    /**
     * Sets the value of the vehAvailCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType }
     *     
     */
    public void setVehAvailCore(VehicleAvailCoreType value) {
        this.vehAvailCore = value;
    }

    /**
     * Gets the value of the vehAvailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailAdditionalInfoType }
     *     
     */
    public VehicleAvailAdditionalInfoType getVehAvailInfo() {
        return vehAvailInfo;
    }

    /**
     * Sets the value of the vehAvailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailAdditionalInfoType }
     *     
     */
    public void setVehAvailInfo(VehicleAvailAdditionalInfoType value) {
        this.vehAvailInfo = value;
    }

    /**
     * Gets the value of the advanceBooking property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking }
     *     
     */
    public VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking getAdvanceBooking() {
        return advanceBooking;
    }

    /**
     * Sets the value of the advanceBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking }
     *     
     */
    public void setAdvanceBooking(VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking value) {
        this.advanceBooking = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleId(BigInteger value) {
        this.vehicleId = value;
    }

}
