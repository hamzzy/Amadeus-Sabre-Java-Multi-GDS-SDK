
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleLocationAdditionalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationAdditionalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehRentLocInfos" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleLocationInformationType" minOccurs="0"/>
 *         &lt;element name="ParkLocation" type="{http://epowerv5.amadeus.com.tr/WS}VehicleWhereAtFacilityType" minOccurs="0"/>
 *         &lt;element name="CounterLocation" type="{http://epowerv5.amadeus.com.tr/WS}VehicleWhereAtFacilityType" minOccurs="0"/>
 *         &lt;element name="OperationSchedules" type="{http://epowerv5.amadeus.com.tr/WS}OperationSchedulesType" minOccurs="0"/>
 *         &lt;element name="Shuttle" type="{http://epowerv5.amadeus.com.tr/WS}VehicleLocationAdditionalDetailsTypeShuttle" minOccurs="0"/>
 *         &lt;element name="OneWayDropLocations" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationAdditionalDetailsType", propOrder = {
    "vehRentLocInfos",
    "parkLocation",
    "counterLocation",
    "operationSchedules",
    "shuttle",
    "oneWayDropLocations",
    "tpaExtensions"
})
public class VehicleLocationAdditionalDetailsType {

    @XmlElement(name = "VehRentLocInfos")
    protected ArrayOfVehicleLocationInformationType vehRentLocInfos;
    @XmlElement(name = "ParkLocation")
    protected VehicleWhereAtFacilityType parkLocation;
    @XmlElement(name = "CounterLocation")
    protected VehicleWhereAtFacilityType counterLocation;
    @XmlElement(name = "OperationSchedules")
    protected OperationSchedulesType operationSchedules;
    @XmlElement(name = "Shuttle")
    protected VehicleLocationAdditionalDetailsTypeShuttle shuttle;
    @XmlElement(name = "OneWayDropLocations")
    protected ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation oneWayDropLocations;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Gets the value of the vehRentLocInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationInformationType }
     *     
     */
    public ArrayOfVehicleLocationInformationType getVehRentLocInfos() {
        return vehRentLocInfos;
    }

    /**
     * Sets the value of the vehRentLocInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationInformationType }
     *     
     */
    public void setVehRentLocInfos(ArrayOfVehicleLocationInformationType value) {
        this.vehRentLocInfos = value;
    }

    /**
     * Gets the value of the parkLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public VehicleWhereAtFacilityType getParkLocation() {
        return parkLocation;
    }

    /**
     * Sets the value of the parkLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public void setParkLocation(VehicleWhereAtFacilityType value) {
        this.parkLocation = value;
    }

    /**
     * Gets the value of the counterLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public VehicleWhereAtFacilityType getCounterLocation() {
        return counterLocation;
    }

    /**
     * Sets the value of the counterLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public void setCounterLocation(VehicleWhereAtFacilityType value) {
        this.counterLocation = value;
    }

    /**
     * Gets the value of the operationSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link OperationSchedulesType }
     *     
     */
    public OperationSchedulesType getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * Sets the value of the operationSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSchedulesType }
     *     
     */
    public void setOperationSchedules(OperationSchedulesType value) {
        this.operationSchedules = value;
    }

    /**
     * Gets the value of the shuttle property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsTypeShuttle }
     *     
     */
    public VehicleLocationAdditionalDetailsTypeShuttle getShuttle() {
        return shuttle;
    }

    /**
     * Sets the value of the shuttle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsTypeShuttle }
     *     
     */
    public void setShuttle(VehicleLocationAdditionalDetailsTypeShuttle value) {
        this.shuttle = value;
    }

    /**
     * Gets the value of the oneWayDropLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     *     
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation getOneWayDropLocations() {
        return oneWayDropLocations;
    }

    /**
     * Sets the value of the oneWayDropLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     *     
     */
    public void setOneWayDropLocations(ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation value) {
        this.oneWayDropLocations = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

}
