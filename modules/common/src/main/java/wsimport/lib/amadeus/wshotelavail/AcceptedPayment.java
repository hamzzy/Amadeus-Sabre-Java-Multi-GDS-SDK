
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptedPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptedPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentCard" type="{http://traveltalk.com/wsHotelAvail}PaymentCard" minOccurs="0"/>
 *         &lt;element name="BankAcct" type="{http://traveltalk.com/wsHotelAvail}BankAcct" minOccurs="0"/>
 *         &lt;element name="DirectBill" type="{http://traveltalk.com/wsHotelAvail}DirectBill" minOccurs="0"/>
 *         &lt;element name="Voucher" type="{http://traveltalk.com/wsHotelAvail}Voucher" minOccurs="0"/>
 *         &lt;element name="LoyaltyRedemption" type="{http://traveltalk.com/wsHotelAvail}LoyaltyRedemption" minOccurs="0"/>
 *         &lt;element name="MiscChargeOrder" type="{http://traveltalk.com/wsHotelAvail}MiscChargeOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}AcceptedPaymentShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}AcceptedPaymentShareMarketInd" />
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
@XmlType(name = "AcceptedPayment", propOrder = {
    "paymentCard",
    "bankAcct",
    "directBill",
    "voucher",
    "loyaltyRedemption",
    "miscChargeOrder"
})
public class AcceptedPayment {

    @XmlElement(name = "PaymentCard")
    protected PaymentCard paymentCard;
    @XmlElement(name = "BankAcct")
    protected BankAcct bankAcct;
    @XmlElement(name = "DirectBill")
    protected DirectBill directBill;
    @XmlElement(name = "Voucher")
    protected Voucher voucher;
    @XmlElement(name = "LoyaltyRedemption")
    protected LoyaltyRedemption loyaltyRedemption;
    @XmlElement(name = "MiscChargeOrder")
    protected MiscChargeOrder miscChargeOrder;
    @XmlAttribute(name = "ShareSynchInd")
    protected AcceptedPaymentShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected AcceptedPaymentShareMarketInd shareMarketInd;
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
     * Gets the value of the bankAcct property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcct }
     *     
     */
    public BankAcct getBankAcct() {
        return bankAcct;
    }

    /**
     * Sets the value of the bankAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcct }
     *     
     */
    public void setBankAcct(BankAcct value) {
        this.bankAcct = value;
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
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link Voucher }
     *     
     */
    public Voucher getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voucher }
     *     
     */
    public void setVoucher(Voucher value) {
        this.voucher = value;
    }

    /**
     * Gets the value of the loyaltyRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRedemption }
     *     
     */
    public LoyaltyRedemption getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * Sets the value of the loyaltyRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRedemption }
     *     
     */
    public void setLoyaltyRedemption(LoyaltyRedemption value) {
        this.loyaltyRedemption = value;
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
     *     {@link AcceptedPaymentShareSynchInd }
     *     
     */
    public AcceptedPaymentShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedPaymentShareSynchInd }
     *     
     */
    public void setShareSynchInd(AcceptedPaymentShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedPaymentShareMarketInd }
     *     
     */
    public AcceptedPaymentShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedPaymentShareMarketInd }
     *     
     */
    public void setShareMarketInd(AcceptedPaymentShareMarketInd value) {
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
