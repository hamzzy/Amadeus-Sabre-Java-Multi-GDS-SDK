
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fulfillment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fulfillment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentDetails" type="{http://traveltalk.com/wsIssueTicket}ArrayOfPaymentDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fulfillment", propOrder = {
    "paymentDetails"
})
public class Fulfillment {

    @XmlElement(name = "PaymentDetails")
    protected ArrayOfPaymentDetail paymentDetails;

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentDetail }
     *     
     */
    public ArrayOfPaymentDetail getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentDetail }
     *     
     */
    public void setPaymentDetails(ArrayOfPaymentDetail value) {
        this.paymentDetails = value;
    }

}
