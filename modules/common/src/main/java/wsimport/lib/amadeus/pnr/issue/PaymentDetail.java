
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentCard" type="{http://traveltalk.com/wsIssueTicket}PaymentCard" minOccurs="0"/>
 *         &lt;element name="DirectBill" type="{http://traveltalk.com/wsIssueTicket}DirectBill" minOccurs="0"/>
 *         &lt;element name="MiscChargeOrder" type="{http://traveltalk.com/wsIssueTicket}MiscChargeOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsIssueTicket}PaymentDetailShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsIssueTicket}PaymentDetailShareMarketInd" />
 *       &lt;attribute name="CostCenterID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetail", propOrder = {
    "paymentCard",
    "directBill",
    "miscChargeOrder"
})
public class PaymentDetail {

    @XmlElement(name = "PaymentCard")
    protected PaymentCard paymentCard;
    @XmlElement(name = "DirectBill")
    protected DirectBill directBill;
    @XmlElement(name = "MiscChargeOrder")
    protected MiscChargeOrder miscChargeOrder;
    @XmlAttribute(name = "ShareSynchInd")
    protected PaymentDetailShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected PaymentDetailShareMarketInd shareMarketInd;
    @XmlAttribute(name = "CostCenterID")
    protected String costCenterID;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard }
     *     
     */
    public PaymentCard getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard }
     *     
     */
    public void setPaymentCard(PaymentCard value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the directBill property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBill }
     *     
     */
    public DirectBill getDirectBill() {
        return directBill;
    }

    /**
     * Sets the value of the directBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBill }
     *     
     */
    public void setDirectBill(DirectBill value) {
        this.directBill = value;
    }

    /**
     * Gets the value of the miscChargeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link MiscChargeOrder }
     *     
     */
    public MiscChargeOrder getMiscChargeOrder() {
        return miscChargeOrder;
    }

    /**
     * Sets the value of the miscChargeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscChargeOrder }
     *     
     */
    public void setMiscChargeOrder(MiscChargeOrder value) {
        this.miscChargeOrder = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailShareSynchInd }
     *     
     */
    public PaymentDetailShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailShareSynchInd }
     *     
     */
    public void setShareSynchInd(PaymentDetailShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailShareMarketInd }
     *     
     */
    public PaymentDetailShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailShareMarketInd }
     *     
     */
    public void setShareMarketInd(PaymentDetailShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the costCenterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterID() {
        return costCenterID;
    }

    /**
     * Sets the value of the costCenterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterID(String value) {
        this.costCenterID = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}
