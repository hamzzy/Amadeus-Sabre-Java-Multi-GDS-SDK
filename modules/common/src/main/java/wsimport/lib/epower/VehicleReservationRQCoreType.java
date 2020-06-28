
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
 * <p>Java class for VehicleReservationRQCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationRQCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VehRentalCore" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalCoreType" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://epowerv5.amadeus.com.tr/WS}CustomerPrimaryAdditionalType" minOccurs="0"/>
 *         &lt;element name="VendorPref" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNamePrefType" minOccurs="0"/>
 *         &lt;element name="VehPref" type="{http://epowerv5.amadeus.com.tr/WS}VehiclePrefType" minOccurs="0"/>
 *         &lt;element name="DriverType" type="{http://epowerv5.amadeus.com.tr/WS}VehicleReservationRQCoreTypeDriverType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateQualifier" type="{http://epowerv5.amadeus.com.tr/WS}RateQualifierType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleChargePurposeType1" minOccurs="0"/>
 *         &lt;element name="VehicleCharges" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleChargePurposeType" minOccurs="0"/>
 *         &lt;element name="SpecialEquipPrefs" type="{http://epowerv5.amadeus.com.tr/WS}VehicleReservationRQCoreTypeSpecialEquipPrefs" minOccurs="0"/>
 *         &lt;element name="RateDistance" type="{http://epowerv5.amadeus.com.tr/WS}VehicleReservationRQCoreTypeRateDistance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalCharge" type="{http://epowerv5.amadeus.com.tr/WS}VehicleReservationRQCoreTypeTotalCharge" minOccurs="0"/>
 *         &lt;element name="Queue" type="{http://epowerv5.amadeus.com.tr/WS}VehicleReservationRQCoreTypeQueue" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationRQCoreType", propOrder = {
    "uniqueID",
    "vehRentalCore",
    "customer",
    "vendorPref",
    "vehPref",
    "driverType",
    "rateQualifier",
    "fees",
    "vehicleCharges",
    "specialEquipPrefs",
    "rateDistance",
    "totalCharge",
    "queue",
    "tpaExtensions"
})
@XmlSeeAlso({
    OTAVehResRQVehResRQCore.class
})
public class VehicleReservationRQCoreType {

    @XmlElement(name = "UniqueID")
    protected List<UniqueIDType> uniqueID;
    @XmlElement(name = "VehRentalCore")
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "Customer")
    protected CustomerPrimaryAdditionalType customer;
    @XmlElement(name = "VendorPref")
    protected CompanyNamePrefType vendorPref;
    @XmlElement(name = "VehPref")
    protected VehiclePrefType vehPref;
    @XmlElement(name = "DriverType")
    protected List<VehicleReservationRQCoreTypeDriverType> driverType;
    @XmlElement(name = "RateQualifier")
    protected RateQualifierType rateQualifier;
    @XmlElement(name = "Fees")
    protected ArrayOfVehicleChargePurposeType1 fees;
    @XmlElement(name = "VehicleCharges")
    protected ArrayOfVehicleChargePurposeType vehicleCharges;
    @XmlElement(name = "SpecialEquipPrefs")
    protected VehicleReservationRQCoreTypeSpecialEquipPrefs specialEquipPrefs;
    @XmlElement(name = "RateDistance")
    protected List<VehicleReservationRQCoreTypeRateDistance> rateDistance;
    @XmlElement(name = "TotalCharge")
    protected VehicleReservationRQCoreTypeTotalCharge totalCharge;
    @XmlElement(name = "Queue")
    protected VehicleReservationRQCoreTypeQueue queue;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * Gets the value of the uniqueID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getUniqueID() {
        if (uniqueID == null) {
            uniqueID = new ArrayList<UniqueIDType>();
        }
        return this.uniqueID;
    }

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
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPrimaryAdditionalType }
     *     
     */
    public CustomerPrimaryAdditionalType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPrimaryAdditionalType }
     *     
     */
    public void setCustomer(CustomerPrimaryAdditionalType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the vendorPref property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNamePrefType }
     *     
     */
    public CompanyNamePrefType getVendorPref() {
        return vendorPref;
    }

    /**
     * Sets the value of the vendorPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNamePrefType }
     *     
     */
    public void setVendorPref(CompanyNamePrefType value) {
        this.vendorPref = value;
    }

    /**
     * Gets the value of the vehPref property.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePrefType }
     *     
     */
    public VehiclePrefType getVehPref() {
        return vehPref;
    }

    /**
     * Sets the value of the vehPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePrefType }
     *     
     */
    public void setVehPref(VehiclePrefType value) {
        this.vehPref = value;
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
     * {@link VehicleReservationRQCoreTypeDriverType }
     * 
     * 
     */
    public List<VehicleReservationRQCoreTypeDriverType> getDriverType() {
        if (driverType == null) {
            driverType = new ArrayList<VehicleReservationRQCoreTypeDriverType>();
        }
        return this.driverType;
    }

    /**
     * Gets the value of the rateQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link RateQualifierType }
     *     
     */
    public RateQualifierType getRateQualifier() {
        return rateQualifier;
    }

    /**
     * Sets the value of the rateQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateQualifierType }
     *     
     */
    public void setRateQualifier(RateQualifierType value) {
        this.rateQualifier = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleChargePurposeType1 }
     *     
     */
    public ArrayOfVehicleChargePurposeType1 getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleChargePurposeType1 }
     *     
     */
    public void setFees(ArrayOfVehicleChargePurposeType1 value) {
        this.fees = value;
    }

    /**
     * Gets the value of the vehicleCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleChargePurposeType }
     *     
     */
    public ArrayOfVehicleChargePurposeType getVehicleCharges() {
        return vehicleCharges;
    }

    /**
     * Sets the value of the vehicleCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleChargePurposeType }
     *     
     */
    public void setVehicleCharges(ArrayOfVehicleChargePurposeType value) {
        this.vehicleCharges = value;
    }

    /**
     * Gets the value of the specialEquipPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationRQCoreTypeSpecialEquipPrefs }
     *     
     */
    public VehicleReservationRQCoreTypeSpecialEquipPrefs getSpecialEquipPrefs() {
        return specialEquipPrefs;
    }

    /**
     * Sets the value of the specialEquipPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationRQCoreTypeSpecialEquipPrefs }
     *     
     */
    public void setSpecialEquipPrefs(VehicleReservationRQCoreTypeSpecialEquipPrefs value) {
        this.specialEquipPrefs = value;
    }

    /**
     * Gets the value of the rateDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleReservationRQCoreTypeRateDistance }
     * 
     * 
     */
    public List<VehicleReservationRQCoreTypeRateDistance> getRateDistance() {
        if (rateDistance == null) {
            rateDistance = new ArrayList<VehicleReservationRQCoreTypeRateDistance>();
        }
        return this.rateDistance;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationRQCoreTypeTotalCharge }
     *     
     */
    public VehicleReservationRQCoreTypeTotalCharge getTotalCharge() {
        return totalCharge;
    }

    /**
     * Sets the value of the totalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationRQCoreTypeTotalCharge }
     *     
     */
    public void setTotalCharge(VehicleReservationRQCoreTypeTotalCharge value) {
        this.totalCharge = value;
    }

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationRQCoreTypeQueue }
     *     
     */
    public VehicleReservationRQCoreTypeQueue getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationRQCoreTypeQueue }
     *     
     */
    public void setQueue(VehicleReservationRQCoreTypeQueue value) {
        this.queue = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
