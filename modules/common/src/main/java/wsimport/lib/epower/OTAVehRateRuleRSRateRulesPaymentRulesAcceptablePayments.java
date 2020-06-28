
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_VehRateRuleRSRateRulesPaymentRulesAcceptablePayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehRateRuleRSRateRulesPaymentRulesAcceptablePayments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptablePayment" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesPaymentRulesAcceptablePaymentsAcceptablePayment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PaymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehRateRuleRSRateRulesPaymentRulesAcceptablePayments", propOrder = {
    "acceptablePayment"
})
public class OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePayments {

    @XmlElement(name = "AcceptablePayment")
    protected List<OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePaymentsAcceptablePayment> acceptablePayment;
    @XmlAttribute(name = "PaymentTypeCode")
    protected String paymentTypeCode;

    /**
     * Gets the value of the acceptablePayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptablePayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptablePayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePaymentsAcceptablePayment }
     * 
     * 
     */
    public List<OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePaymentsAcceptablePayment> getAcceptablePayment() {
        if (acceptablePayment == null) {
            acceptablePayment = new ArrayList<OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePaymentsAcceptablePayment>();
        }
        return this.acceptablePayment;
    }

    /**
     * Gets the value of the paymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeCode(String value) {
        this.paymentTypeCode = value;
    }

}
