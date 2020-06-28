
package wsimport.lib.amadeus.wstravelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuaranteeAccepted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuaranteeAccepted">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentCard" type="{http://traveltalk.com/wsTravelBuild}PaymentCard" minOccurs="0"/>
 *         &lt;element name="BankAcct" type="{http://traveltalk.com/wsTravelBuild}BankAcct" minOccurs="0"/>
 *         &lt;element name="DirectBill" type="{http://traveltalk.com/wsTravelBuild}DirectBill" minOccurs="0"/>
 *         &lt;element name="Voucher" type="{http://traveltalk.com/wsTravelBuild}Voucher" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsTravelBuild}GuaranteeAcceptedShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsTravelBuild}GuaranteeAcceptedShareMarketInd" />
 *       &lt;attribute name="CostCenterId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeAccepted", propOrder = {
    "paymentCard",
    "bankAcct",
    "directBill",
    "voucher"
})
public class GuaranteeAccepted {

    @XmlElement(name = "PaymentCard")
    protected PaymentCard paymentCard;
    @XmlElement(name = "BankAcct")
    protected BankAcct bankAcct;
    @XmlElement(name = "DirectBill")
    protected DirectBill directBill;
    @XmlElement(name = "Voucher")
    protected Voucher voucher;
    @XmlAttribute(name = "ShareSynchInd")
    protected GuaranteeAcceptedShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected GuaranteeAcceptedShareMarketInd shareMarketInd;
    @XmlAttribute(name = "CostCenterId")
    protected String costCenterId;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Default")
    protected Boolean _default;

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
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeAcceptedShareSynchInd }
     *     
     */
    public GuaranteeAcceptedShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeAcceptedShareSynchInd }
     *     
     */
    public void setShareSynchInd(GuaranteeAcceptedShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeAcceptedShareMarketInd }
     *     
     */
    public GuaranteeAcceptedShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeAcceptedShareMarketInd }
     *     
     */
    public void setShareMarketInd(GuaranteeAcceptedShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the costCenterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterId() {
        return costCenterId;
    }

    /**
     * Sets the value of the costCenterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterId(String value) {
        this.costCenterId = value;
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

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

}
