
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_VehRateRuleRSRateRulesCancelPenaltyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehRateRuleRSRateRulesCancelPenaltyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Deadline" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesCancelPenaltyInfoDeadline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PenaltyFee" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesCancelPenaltyInfoPenaltyFee" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://epowerv5.amadeus.com.tr/WS}FormattedTextTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ModifyPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehRateRuleRSRateRulesCancelPenaltyInfo", propOrder = {
    "deadline",
    "penaltyFee",
    "description"
})
public class OTAVehRateRuleRSRateRulesCancelPenaltyInfo {

    @XmlElement(name = "Deadline")
    protected List<OTAVehRateRuleRSRateRulesCancelPenaltyInfoDeadline> deadline;
    @XmlElement(name = "PenaltyFee")
    protected OTAVehRateRuleRSRateRulesCancelPenaltyInfoPenaltyFee penaltyFee;
    @XmlElement(name = "Description")
    protected FormattedTextTextType description;
    @XmlAttribute(name = "GuaranteeRequiredInd")
    protected Boolean guaranteeRequiredInd;
    @XmlAttribute(name = "ModifyPenaltyInd")
    protected Boolean modifyPenaltyInd;

    /**
     * Gets the value of the deadline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deadline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeadline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAVehRateRuleRSRateRulesCancelPenaltyInfoDeadline }
     * 
     * 
     */
    public List<OTAVehRateRuleRSRateRulesCancelPenaltyInfoDeadline> getDeadline() {
        if (deadline == null) {
            deadline = new ArrayList<OTAVehRateRuleRSRateRulesCancelPenaltyInfoDeadline>();
        }
        return this.deadline;
    }

    /**
     * Gets the value of the penaltyFee property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehRateRuleRSRateRulesCancelPenaltyInfoPenaltyFee }
     *     
     */
    public OTAVehRateRuleRSRateRulesCancelPenaltyInfoPenaltyFee getPenaltyFee() {
        return penaltyFee;
    }

    /**
     * Sets the value of the penaltyFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSRateRulesCancelPenaltyInfoPenaltyFee }
     *     
     */
    public void setPenaltyFee(OTAVehRateRuleRSRateRulesCancelPenaltyInfoPenaltyFee value) {
        this.penaltyFee = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextTextType }
     *     
     */
    public FormattedTextTextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextTextType }
     *     
     */
    public void setDescription(FormattedTextTextType value) {
        this.description = value;
    }

    /**
     * Gets the value of the guaranteeRequiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteeRequiredInd() {
        return guaranteeRequiredInd;
    }

    /**
     * Sets the value of the guaranteeRequiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteeRequiredInd(Boolean value) {
        this.guaranteeRequiredInd = value;
    }

    /**
     * Gets the value of the modifyPenaltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifyPenaltyInd() {
        return modifyPenaltyInd;
    }

    /**
     * Sets the value of the modifyPenaltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifyPenaltyInd(Boolean value) {
        this.modifyPenaltyInd = value;
    }

}
