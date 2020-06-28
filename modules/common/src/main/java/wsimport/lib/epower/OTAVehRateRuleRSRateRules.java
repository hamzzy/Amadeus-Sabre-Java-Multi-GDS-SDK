
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for OTA_VehRateRuleRSRateRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehRateRuleRSRateRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvanceBooking" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesAdvanceBooking" minOccurs="0"/>
 *         &lt;element name="PickupReturnRules" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesPickupReturnRules" minOccurs="0"/>
 *         &lt;element name="RateGuarantee" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesRateGuarantee" minOccurs="0"/>
 *         &lt;element name="PaymentRules" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesPaymentRules" minOccurs="0"/>
 *         &lt;element name="CancelPenaltyInfo" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesCancelPenaltyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateDeposit" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesRateDeposit" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MinimumKeep" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="MaximumKeep" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="MaximumRental" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehRateRuleRSRateRules", propOrder = {
    "advanceBooking",
    "pickupReturnRules",
    "rateGuarantee",
    "paymentRules",
    "cancelPenaltyInfo",
    "rateDeposit"
})
public class OTAVehRateRuleRSRateRules {

    @XmlElement(name = "AdvanceBooking")
    protected OTAVehRateRuleRSRateRulesAdvanceBooking advanceBooking;
    @XmlElement(name = "PickupReturnRules")
    protected OTAVehRateRuleRSRateRulesPickupReturnRules pickupReturnRules;
    @XmlElement(name = "RateGuarantee")
    protected OTAVehRateRuleRSRateRulesRateGuarantee rateGuarantee;
    @XmlElement(name = "PaymentRules")
    protected OTAVehRateRuleRSRateRulesPaymentRules paymentRules;
    @XmlElement(name = "CancelPenaltyInfo")
    protected List<OTAVehRateRuleRSRateRulesCancelPenaltyInfo> cancelPenaltyInfo;
    @XmlElement(name = "RateDeposit")
    protected OTAVehRateRuleRSRateRulesRateDeposit rateDeposit;
    @XmlAttribute(name = "MinimumKeep")
    protected Duration minimumKeep;
    @XmlAttribute(name = "MaximumKeep")
    protected Duration maximumKeep;
    @XmlAttribute(name = "MaximumRental")
    protected Duration maximumRental;

    /**
     * Gets the value of the advanceBooking property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRSRateRulesAdvanceBooking }
     *     
     */
    public OTAVehRateRuleRSRateRulesAdvanceBooking getAdvanceBooking() {
        return advanceBooking;
    }

    /**
     * Sets the value of the advanceBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSRateRulesAdvanceBooking }
     *     
     */
    public void setAdvanceBooking(OTAVehRateRuleRSRateRulesAdvanceBooking value) {
        this.advanceBooking = value;
    }

    /**
     * Gets the value of the pickupReturnRules property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRSRateRulesPickupReturnRules }
     *     
     */
    public OTAVehRateRuleRSRateRulesPickupReturnRules getPickupReturnRules() {
        return pickupReturnRules;
    }

    /**
     * Sets the value of the pickupReturnRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSRateRulesPickupReturnRules }
     *     
     */
    public void setPickupReturnRules(OTAVehRateRuleRSRateRulesPickupReturnRules value) {
        this.pickupReturnRules = value;
    }

    /**
     * Gets the value of the rateGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRSRateRulesRateGuarantee }
     *     
     */
    public OTAVehRateRuleRSRateRulesRateGuarantee getRateGuarantee() {
        return rateGuarantee;
    }

    /**
     * Sets the value of the rateGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSRateRulesRateGuarantee }
     *     
     */
    public void setRateGuarantee(OTAVehRateRuleRSRateRulesRateGuarantee value) {
        this.rateGuarantee = value;
    }

    /**
     * Gets the value of the paymentRules property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRSRateRulesPaymentRules }
     *     
     */
    public OTAVehRateRuleRSRateRulesPaymentRules getPaymentRules() {
        return paymentRules;
    }

    /**
     * Sets the value of the paymentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSRateRulesPaymentRules }
     *     
     */
    public void setPaymentRules(OTAVehRateRuleRSRateRulesPaymentRules value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the cancelPenaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelPenaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelPenaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAVehRateRuleRSRateRulesCancelPenaltyInfo }
     * 
     * 
     */
    public List<OTAVehRateRuleRSRateRulesCancelPenaltyInfo> getCancelPenaltyInfo() {
        if (cancelPenaltyInfo == null) {
            cancelPenaltyInfo = new ArrayList<OTAVehRateRuleRSRateRulesCancelPenaltyInfo>();
        }
        return this.cancelPenaltyInfo;
    }

    /**
     * Gets the value of the rateDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRSRateRulesRateDeposit }
     *     
     */
    public OTAVehRateRuleRSRateRulesRateDeposit getRateDeposit() {
        return rateDeposit;
    }

    /**
     * Sets the value of the rateDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSRateRulesRateDeposit }
     *     
     */
    public void setRateDeposit(OTAVehRateRuleRSRateRulesRateDeposit value) {
        this.rateDeposit = value;
    }

    /**
     * Gets the value of the minimumKeep property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumKeep() {
        return minimumKeep;
    }

    /**
     * Sets the value of the minimumKeep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumKeep(Duration value) {
        this.minimumKeep = value;
    }

    /**
     * Gets the value of the maximumKeep property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumKeep() {
        return maximumKeep;
    }

    /**
     * Sets the value of the maximumKeep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumKeep(Duration value) {
        this.maximumKeep = value;
    }

    /**
     * Gets the value of the maximumRental property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumRental() {
        return maximumRental;
    }

    /**
     * Sets the value of the maximumRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumRental(Duration value) {
        this.maximumRental = value;
    }

}
