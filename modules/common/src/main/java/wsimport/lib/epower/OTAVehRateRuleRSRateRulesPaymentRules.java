
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_VehRateRuleRSRateRulesPaymentRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehRateRuleRSRateRulesPaymentRules">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}PaymentRulesType">
 *       &lt;sequence>
 *         &lt;element name="AcceptablePayments" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRulesPaymentRulesAcceptablePayments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehRateRuleRSRateRulesPaymentRules", propOrder = {
    "acceptablePayments"
})
public class OTAVehRateRuleRSRateRulesPaymentRules
    extends PaymentRulesType
{

    @XmlElement(name = "AcceptablePayments")
    protected List<OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePayments> acceptablePayments;

    /**
     * Gets the value of the acceptablePayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptablePayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptablePayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePayments }
     * 
     * 
     */
    public List<OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePayments> getAcceptablePayments() {
        if (acceptablePayments == null) {
            acceptablePayments = new ArrayList<OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePayments>();
        }
        return this.acceptablePayments;
    }

}
