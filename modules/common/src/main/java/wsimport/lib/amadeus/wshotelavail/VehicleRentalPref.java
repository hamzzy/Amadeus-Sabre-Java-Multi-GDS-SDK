
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalPref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" type="{http://traveltalk.com/wsHotelAvail}LoyaltyPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VendorPref" type="{http://traveltalk.com/wsHotelAvail}VendorPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://traveltalk.com/wsHotelAvail}PaymentFormPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CoveragePref" type="{http://traveltalk.com/wsHotelAvail}CoveragePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecialReqPref" type="{http://traveltalk.com/wsHotelAvail}SpecialReqPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VehTypePref" type="{http://traveltalk.com/wsHotelAvail}VehTypePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecialEquipPref" type="{http://traveltalk.com/wsHotelAvail}SpecialEquipPref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}VehicleRentalPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}VehicleRentalPrefShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}VehicleRentalPrefShareMarketInd" />
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="GasPrePay" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalPref", propOrder = {
    "loyaltyPref",
    "vendorPref",
    "paymentFormPref",
    "coveragePref",
    "specialReqPref",
    "vehTypePref",
    "specialEquipPref"
})
public class VehicleRentalPref {

    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPref> loyaltyPref;
    @XmlElement(name = "VendorPref")
    protected List<VendorPref> vendorPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPref> paymentFormPref;
    @XmlElement(name = "CoveragePref")
    protected List<CoveragePref> coveragePref;
    @XmlElement(name = "SpecialReqPref")
    protected List<SpecialReqPref> specialReqPref;
    @XmlElement(name = "VehTypePref")
    protected List<VehTypePref> vehTypePref;
    @XmlElement(name = "SpecialEquipPref")
    protected List<SpecialEquipPref> specialEquipPref;
    @XmlAttribute(name = "PreferLevel")
    protected VehicleRentalPrefPreferLevel preferLevel;
    @XmlAttribute(name = "ShareSynchInd")
    protected VehicleRentalPrefShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected VehicleRentalPrefShareMarketInd shareMarketInd;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "GasPrePay")
    protected Boolean gasPrePay;

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPref }
     * 
     * 
     */
    public List<LoyaltyPref> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPref>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorPref }
     * 
     * 
     */
    public List<VendorPref> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<VendorPref>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPref }
     * 
     * 
     */
    public List<PaymentFormPref> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPref>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the coveragePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveragePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveragePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoveragePref }
     * 
     * 
     */
    public List<CoveragePref> getCoveragePref() {
        if (coveragePref == null) {
            coveragePref = new ArrayList<CoveragePref>();
        }
        return this.coveragePref;
    }

    /**
     * Gets the value of the specialReqPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialReqPref }
     * 
     * 
     */
    public List<SpecialReqPref> getSpecialReqPref() {
        if (specialReqPref == null) {
            specialReqPref = new ArrayList<SpecialReqPref>();
        }
        return this.specialReqPref;
    }

    /**
     * Gets the value of the vehTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehTypePref }
     * 
     * 
     */
    public List<VehTypePref> getVehTypePref() {
        if (vehTypePref == null) {
            vehTypePref = new ArrayList<VehTypePref>();
        }
        return this.vehTypePref;
    }

    /**
     * Gets the value of the specialEquipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialEquipPref }
     * 
     * 
     */
    public List<SpecialEquipPref> getSpecialEquipPref() {
        if (specialEquipPref == null) {
            specialEquipPref = new ArrayList<SpecialEquipPref>();
        }
        return this.specialEquipPref;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalPrefPreferLevel }
     *     
     */
    public VehicleRentalPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return VehicleRentalPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalPrefPreferLevel }
     *     
     */
    public void setPreferLevel(VehicleRentalPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalPrefShareSynchInd }
     *     
     */
    public VehicleRentalPrefShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalPrefShareSynchInd }
     *     
     */
    public void setShareSynchInd(VehicleRentalPrefShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalPrefShareMarketInd }
     *     
     */
    public VehicleRentalPrefShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalPrefShareMarketInd }
     *     
     */
    public void setShareMarketInd(VehicleRentalPrefShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Gets the value of the gasPrePay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGasPrePay() {
        if (gasPrePay == null) {
            return false;
        } else {
            return gasPrePay;
        }
    }

    /**
     * Sets the value of the gasPrePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGasPrePay(Boolean value) {
        this.gasPrePay = value;
    }

}
