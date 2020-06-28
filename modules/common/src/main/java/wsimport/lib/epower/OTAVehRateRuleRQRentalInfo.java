
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_VehRateRuleRQRentalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehRateRuleRQRentalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehRentalCore" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalCoreType" minOccurs="0"/>
 *         &lt;element name="VehicleInfo" type="{http://epowerv5.amadeus.com.tr/WS}VehiclePrefType" minOccurs="0"/>
 *         &lt;element name="SpecialEquipPrefs" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOTA_VehRateRuleRQRentalInfoSpecialEquipPref" minOccurs="0"/>
 *         &lt;element name="CustLoyalty" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRQRentalInfoCustLoyalty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateQualifier" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRQRentalInfoRateQualifier" minOccurs="0"/>
 *         &lt;element name="OffLocService" type="{http://epowerv5.amadeus.com.tr/WS}OffLocationServiceType" minOccurs="0"/>
 *         &lt;element name="ArrivalDetails" type="{http://epowerv5.amadeus.com.tr/WS}VehicleArrivalDetailsType" minOccurs="0"/>
 *         &lt;element name="TourInfo" type="{http://epowerv5.amadeus.com.tr/WS}VehicleTourInfoType" minOccurs="0"/>
 *         &lt;element name="CustomerID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
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
@XmlType(name = "OTA_VehRateRuleRQRentalInfo", propOrder = {
    "vehRentalCore",
    "vehicleInfo",
    "specialEquipPrefs",
    "custLoyalty",
    "rateQualifier",
    "offLocService",
    "arrivalDetails",
    "tourInfo",
    "customerID",
    "tpaExtensions"
})
public class OTAVehRateRuleRQRentalInfo {

    @XmlElement(name = "VehRentalCore")
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "VehicleInfo")
    protected VehiclePrefType vehicleInfo;
    @XmlElement(name = "SpecialEquipPrefs")
    protected ArrayOfOTAVehRateRuleRQRentalInfoSpecialEquipPref specialEquipPrefs;
    @XmlElement(name = "CustLoyalty")
    protected List<OTAVehRateRuleRQRentalInfoCustLoyalty> custLoyalty;
    @XmlElement(name = "RateQualifier")
    protected OTAVehRateRuleRQRentalInfoRateQualifier rateQualifier;
    @XmlElement(name = "OffLocService")
    protected OffLocationServiceType offLocService;
    @XmlElement(name = "ArrivalDetails")
    protected VehicleArrivalDetailsType arrivalDetails;
    @XmlElement(name = "TourInfo")
    protected VehicleTourInfoType tourInfo;
    @XmlElement(name = "CustomerID")
    protected UniqueIDType customerID;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

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
     * Gets the value of the vehicleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePrefType }
     *     
     */
    public VehiclePrefType getVehicleInfo() {
        return vehicleInfo;
    }

    /**
     * Sets the value of the vehicleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePrefType }
     *     
     */
    public void setVehicleInfo(VehiclePrefType value) {
        this.vehicleInfo = value;
    }

    /**
     * Gets the value of the specialEquipPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOTAVehRateRuleRQRentalInfoSpecialEquipPref }
     *     
     */
    public ArrayOfOTAVehRateRuleRQRentalInfoSpecialEquipPref getSpecialEquipPrefs() {
        return specialEquipPrefs;
    }

    /**
     * Sets the value of the specialEquipPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOTAVehRateRuleRQRentalInfoSpecialEquipPref }
     *     
     */
    public void setSpecialEquipPrefs(ArrayOfOTAVehRateRuleRQRentalInfoSpecialEquipPref value) {
        this.specialEquipPrefs = value;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAVehRateRuleRQRentalInfoCustLoyalty }
     * 
     * 
     */
    public List<OTAVehRateRuleRQRentalInfoCustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<OTAVehRateRuleRQRentalInfoCustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the rateQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRQRentalInfoRateQualifier }
     *     
     */
    public OTAVehRateRuleRQRentalInfoRateQualifier getRateQualifier() {
        return rateQualifier;
    }

    /**
     * Sets the value of the rateQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRQRentalInfoRateQualifier }
     *     
     */
    public void setRateQualifier(OTAVehRateRuleRQRentalInfoRateQualifier value) {
        this.rateQualifier = value;
    }

    /**
     * Gets the value of the offLocService property.
     * 
     * @return
     *     possible object is
     *     {@link OffLocationServiceType }
     *     
     */
    public OffLocationServiceType getOffLocService() {
        return offLocService;
    }

    /**
     * Sets the value of the offLocService property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocationServiceType }
     *     
     */
    public void setOffLocService(OffLocationServiceType value) {
        this.offLocService = value;
    }

    /**
     * Gets the value of the arrivalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleArrivalDetailsType }
     *     
     */
    public VehicleArrivalDetailsType getArrivalDetails() {
        return arrivalDetails;
    }

    /**
     * Sets the value of the arrivalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleArrivalDetailsType }
     *     
     */
    public void setArrivalDetails(VehicleArrivalDetailsType value) {
        this.arrivalDetails = value;
    }

    /**
     * Gets the value of the tourInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTourInfoType }
     *     
     */
    public VehicleTourInfoType getTourInfo() {
        return tourInfo;
    }

    /**
     * Sets the value of the tourInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTourInfoType }
     *     
     */
    public void setTourInfo(VehicleTourInfoType value) {
        this.tourInfo = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setCustomerID(UniqueIDType value) {
        this.customerID = value;
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
