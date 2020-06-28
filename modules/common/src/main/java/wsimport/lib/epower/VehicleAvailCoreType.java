
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleAvailCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vehicle" type="{http://epowerv5.amadeus.com.tr/WS}VehicleType" minOccurs="0"/>
 *         &lt;element name="RentalRate" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalRateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalCharge" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailCoreTypeTotalCharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PricedEquips" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleEquipmentPricedType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleChargePurposeType1" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailCoreTypeReference" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailCoreTypeVendor" minOccurs="0"/>
 *         &lt;element name="VendorLocation" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailCoreTypeVendorLocation" minOccurs="0"/>
 *         &lt;element name="DropOffLocation" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailCoreTypeDropOffLocation" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" use="required" type="{http://epowerv5.amadeus.com.tr/WS}InventoryStatusType" />
 *       &lt;attribute name="IsAlternateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailCoreType", propOrder = {
    "vehicle",
    "rentalRate",
    "totalCharge",
    "pricedEquips",
    "fees",
    "reference",
    "vendor",
    "vendorLocation",
    "dropOffLocation",
    "tpaExtensions"
})
public class VehicleAvailCoreType {

    @XmlElement(name = "Vehicle")
    protected VehicleType vehicle;
    @XmlElement(name = "RentalRate")
    protected List<VehicleRentalRateType> rentalRate;
    @XmlElement(name = "TotalCharge")
    protected List<VehicleAvailCoreTypeTotalCharge> totalCharge;
    @XmlElement(name = "PricedEquips")
    protected ArrayOfVehicleEquipmentPricedType pricedEquips;
    @XmlElement(name = "Fees")
    protected ArrayOfVehicleChargePurposeType1 fees;
    @XmlElement(name = "Reference")
    protected VehicleAvailCoreTypeReference reference;
    @XmlElement(name = "Vendor")
    protected VehicleAvailCoreTypeVendor vendor;
    @XmlElement(name = "VendorLocation")
    protected VehicleAvailCoreTypeVendorLocation vendorLocation;
    @XmlElement(name = "DropOffLocation")
    protected VehicleAvailCoreTypeDropOffLocation dropOffLocation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "Status", required = true)
    protected InventoryStatusType status;
    @XmlAttribute(name = "IsAlternateInd")
    protected Boolean isAlternateInd;

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType }
     *     
     */
    public VehicleType getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType }
     *     
     */
    public void setVehicle(VehicleType value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the rentalRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentalRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalRateType }
     * 
     * 
     */
    public List<VehicleRentalRateType> getRentalRate() {
        if (rentalRate == null) {
            rentalRate = new ArrayList<VehicleRentalRateType>();
        }
        return this.rentalRate;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleAvailCoreTypeTotalCharge }
     * 
     * 
     */
    public List<VehicleAvailCoreTypeTotalCharge> getTotalCharge() {
        if (totalCharge == null) {
            totalCharge = new ArrayList<VehicleAvailCoreTypeTotalCharge>();
        }
        return this.totalCharge;
    }

    /**
     * Gets the value of the pricedEquips property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleEquipmentPricedType }
     *     
     */
    public ArrayOfVehicleEquipmentPricedType getPricedEquips() {
        return pricedEquips;
    }

    /**
     * Sets the value of the pricedEquips property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleEquipmentPricedType }
     *     
     */
    public void setPricedEquips(ArrayOfVehicleEquipmentPricedType value) {
        this.pricedEquips = value;
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
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreTypeReference }
     *     
     */
    public VehicleAvailCoreTypeReference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreTypeReference }
     *     
     */
    public void setReference(VehicleAvailCoreTypeReference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreTypeVendor }
     *     
     */
    public VehicleAvailCoreTypeVendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreTypeVendor }
     *     
     */
    public void setVendor(VehicleAvailCoreTypeVendor value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the vendorLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreTypeVendorLocation }
     *     
     */
    public VehicleAvailCoreTypeVendorLocation getVendorLocation() {
        return vendorLocation;
    }

    /**
     * Sets the value of the vendorLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreTypeVendorLocation }
     *     
     */
    public void setVendorLocation(VehicleAvailCoreTypeVendorLocation value) {
        this.vendorLocation = value;
    }

    /**
     * Gets the value of the dropOffLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreTypeDropOffLocation }
     *     
     */
    public VehicleAvailCoreTypeDropOffLocation getDropOffLocation() {
        return dropOffLocation;
    }

    /**
     * Sets the value of the dropOffLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreTypeDropOffLocation }
     *     
     */
    public void setDropOffLocation(VehicleAvailCoreTypeDropOffLocation value) {
        this.dropOffLocation = value;
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
     * Gets the value of the isAlternateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlternateInd() {
        return isAlternateInd;
    }

    /**
     * Sets the value of the isAlternateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlternateInd(Boolean value) {
        this.isAlternateInd = value;
    }

}
