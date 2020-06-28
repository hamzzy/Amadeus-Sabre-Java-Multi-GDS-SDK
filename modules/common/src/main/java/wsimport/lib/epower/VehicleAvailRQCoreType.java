
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
 * <p>Java class for VehicleAvailRQCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailRQCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehRentalCore" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalCoreType" minOccurs="0"/>
 *         &lt;element name="VendorPrefs" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailRQCoreTypeVendorPrefs" minOccurs="0"/>
 *         &lt;element name="VehPrefs" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleAvailRQCoreTypeVehPref" minOccurs="0"/>
 *         &lt;element name="DriverType" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailRQCoreTypeDriverType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateQualifier" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailRQCoreTypeRateQualifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateRange" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailRQCoreTypeRateRange" minOccurs="0"/>
 *         &lt;element name="SpecialEquipPrefs" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Unlimited" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Status" type="{http://epowerv5.amadeus.com.tr/WS}InventoryStatusType" />
 *       &lt;attribute name="TargetSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailRQCoreType", propOrder = {
    "vehRentalCore",
    "vendorPrefs",
    "vehPrefs",
    "driverType",
    "rateQualifier",
    "rateRange",
    "specialEquipPrefs",
    "tpaExtensions"
})
@XmlSeeAlso({
    OTAVehAvailRateRQVehAvailRQCore.class
})
public class VehicleAvailRQCoreType {

    @XmlElement(name = "VehRentalCore")
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "VendorPrefs")
    protected VehicleAvailRQCoreTypeVendorPrefs vendorPrefs;
    @XmlElement(name = "VehPrefs")
    protected ArrayOfVehicleAvailRQCoreTypeVehPref vehPrefs;
    @XmlElement(name = "DriverType")
    protected List<VehicleAvailRQCoreTypeDriverType> driverType;
    @XmlElement(name = "RateQualifier")
    protected List<VehicleAvailRQCoreTypeRateQualifier> rateQualifier;
    @XmlElement(name = "RateRange")
    protected VehicleAvailRQCoreTypeRateRange rateRange;
    @XmlElement(name = "SpecialEquipPrefs")
    protected ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref specialEquipPrefs;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "Unlimited", required = true)
    protected boolean unlimited;
    @XmlAttribute(name = "Status")
    protected InventoryStatusType status;
    @XmlAttribute(name = "TargetSource")
    protected String targetSource;

    /**
     * Gets the value of the vehRentalCore property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public VehicleRentalCoreType getVehRentalCore() {
        return vehRentalCore;
    }

    /**
     * Sets the value of the vehRentalCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public void setVehRentalCore(VehicleRentalCoreType value) {
        this.vehRentalCore = value;
    }

    /**
     * Gets the value of the vendorPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailRQCoreTypeVendorPrefs }
     *     
     */
    public VehicleAvailRQCoreTypeVendorPrefs getVendorPrefs() {
        return vendorPrefs;
    }

    /**
     * Sets the value of the vendorPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailRQCoreTypeVendorPrefs }
     *     
     */
    public void setVendorPrefs(VehicleAvailRQCoreTypeVendorPrefs value) {
        this.vendorPrefs = value;
    }

    /**
     * Gets the value of the vehPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleAvailRQCoreTypeVehPref }
     *     
     */
    public ArrayOfVehicleAvailRQCoreTypeVehPref getVehPrefs() {
        return vehPrefs;
    }

    /**
     * Sets the value of the vehPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleAvailRQCoreTypeVehPref }
     *     
     */
    public void setVehPrefs(ArrayOfVehicleAvailRQCoreTypeVehPref value) {
        this.vehPrefs = value;
    }

    /**
     * Gets the value of the driverType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleAvailRQCoreTypeDriverType }
     * 
     * 
     */
    public List<VehicleAvailRQCoreTypeDriverType> getDriverType() {
        if (driverType == null) {
            driverType = new ArrayList<VehicleAvailRQCoreTypeDriverType>();
        }
        return this.driverType;
    }

    /**
     * Gets the value of the rateQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleAvailRQCoreTypeRateQualifier }
     * 
     * 
     */
    public List<VehicleAvailRQCoreTypeRateQualifier> getRateQualifier() {
        if (rateQualifier == null) {
            rateQualifier = new ArrayList<VehicleAvailRQCoreTypeRateQualifier>();
        }
        return this.rateQualifier;
    }

    /**
     * Gets the value of the rateRange property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailRQCoreTypeRateRange }
     *     
     */
    public VehicleAvailRQCoreTypeRateRange getRateRange() {
        return rateRange;
    }

    /**
     * Sets the value of the rateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailRQCoreTypeRateRange }
     *     
     */
    public void setRateRange(VehicleAvailRQCoreTypeRateRange value) {
        this.rateRange = value;
    }

    /**
     * Gets the value of the specialEquipPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref }
     *     
     */
    public ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref getSpecialEquipPrefs() {
        return specialEquipPrefs;
    }

    /**
     * Sets the value of the specialEquipPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref }
     *     
     */
    public void setSpecialEquipPrefs(ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref value) {
        this.specialEquipPrefs = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryStatusType }
     *     
     */
    public InventoryStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStatusType }
     *     
     */
    public void setStatus(InventoryStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the targetSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSource() {
        return targetSource;
    }

    /**
     * Sets the value of the targetSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSource(String value) {
        this.targetSource = value;
    }

}
