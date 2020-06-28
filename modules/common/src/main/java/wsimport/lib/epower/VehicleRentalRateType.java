
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarTaxes" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleChargeTypeTaxAmount" minOccurs="0"/>
 *         &lt;element name="CarCompanyAddresses" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleVendorAddressType" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSpecialRemarkType" minOccurs="0"/>
 *         &lt;element name="CarModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateDistance" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalRateTypeRateDistance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VehicleCharges" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleChargePurposeType" minOccurs="0"/>
 *         &lt;element name="RateQualifier" type="{http://epowerv5.amadeus.com.tr/WS}RateQualifierType" minOccurs="0"/>
 *         &lt;element name="RateRestrictions" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalRateTypeRateRestrictions" minOccurs="0"/>
 *         &lt;element name="RateGuarantee" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalRateTypeRateGuarantee" minOccurs="0"/>
 *         &lt;element name="PickupReturnRule" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalRateTypePickupReturnRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalRateType", propOrder = {
    "carTaxes",
    "carCompanyAddresses",
    "remarks",
    "carModel",
    "rateDistance",
    "vehicleCharges",
    "rateQualifier",
    "rateRestrictions",
    "rateGuarantee",
    "pickupReturnRule"
})
@XmlSeeAlso({
    OTAVehRateRuleRSRentalRate.class
})
public class VehicleRentalRateType {

    @XmlElement(name = "CarTaxes")
    protected ArrayOfVehicleChargeTypeTaxAmount carTaxes;
    @XmlElement(name = "CarCompanyAddresses")
    protected ArrayOfVehicleVendorAddressType carCompanyAddresses;
    @XmlElement(name = "Remarks")
    protected ArrayOfSpecialRemarkType remarks;
    @XmlElement(name = "CarModel")
    protected String carModel;
    @XmlElement(name = "RateDistance")
    protected List<VehicleRentalRateTypeRateDistance> rateDistance;
    @XmlElement(name = "VehicleCharges")
    protected ArrayOfVehicleChargePurposeType vehicleCharges;
    @XmlElement(name = "RateQualifier")
    protected RateQualifierType rateQualifier;
    @XmlElement(name = "RateRestrictions")
    protected VehicleRentalRateTypeRateRestrictions rateRestrictions;
    @XmlElement(name = "RateGuarantee")
    protected VehicleRentalRateTypeRateGuarantee rateGuarantee;
    @XmlElement(name = "PickupReturnRule")
    protected List<VehicleRentalRateTypePickupReturnRule> pickupReturnRule;

    /**
     * Gets the value of the carTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleChargeTypeTaxAmount }
     *     
     */
    public ArrayOfVehicleChargeTypeTaxAmount getCarTaxes() {
        return carTaxes;
    }

    /**
     * Sets the value of the carTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleChargeTypeTaxAmount }
     *     
     */
    public void setCarTaxes(ArrayOfVehicleChargeTypeTaxAmount value) {
        this.carTaxes = value;
    }

    /**
     * Gets the value of the carCompanyAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleVendorAddressType }
     *     
     */
    public ArrayOfVehicleVendorAddressType getCarCompanyAddresses() {
        return carCompanyAddresses;
    }

    /**
     * Sets the value of the carCompanyAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleVendorAddressType }
     *     
     */
    public void setCarCompanyAddresses(ArrayOfVehicleVendorAddressType value) {
        this.carCompanyAddresses = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialRemarkType }
     *     
     */
    public ArrayOfSpecialRemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialRemarkType }
     *     
     */
    public void setRemarks(ArrayOfSpecialRemarkType value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
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
     * {@link VehicleRentalRateTypeRateDistance }
     * 
     * 
     */
    public List<VehicleRentalRateTypeRateDistance> getRateDistance() {
        if (rateDistance == null) {
            rateDistance = new ArrayList<VehicleRentalRateTypeRateDistance>();
        }
        return this.rateDistance;
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
     * Gets the value of the rateRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateTypeRateRestrictions }
     *     
     */
    public VehicleRentalRateTypeRateRestrictions getRateRestrictions() {
        return rateRestrictions;
    }

    /**
     * Sets the value of the rateRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateTypeRateRestrictions }
     *     
     */
    public void setRateRestrictions(VehicleRentalRateTypeRateRestrictions value) {
        this.rateRestrictions = value;
    }

    /**
     * Gets the value of the rateGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateTypeRateGuarantee }
     *     
     */
    public VehicleRentalRateTypeRateGuarantee getRateGuarantee() {
        return rateGuarantee;
    }

    /**
     * Sets the value of the rateGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateTypeRateGuarantee }
     *     
     */
    public void setRateGuarantee(VehicleRentalRateTypeRateGuarantee value) {
        this.rateGuarantee = value;
    }

    /**
     * Gets the value of the pickupReturnRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupReturnRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupReturnRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalRateTypePickupReturnRule }
     * 
     * 
     */
    public List<VehicleRentalRateTypePickupReturnRule> getPickupReturnRule() {
        if (pickupReturnRule == null) {
            pickupReturnRule = new ArrayList<VehicleRentalRateTypePickupReturnRule>();
        }
        return this.pickupReturnRule;
    }

}
