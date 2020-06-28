
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="LoyaltyRedemption" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="LoyaltyCertificate" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                             &lt;attribute name="Format">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Paper"/>
 *                                   &lt;enumeration value="Electronic"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="PromotionVendorCode">
 *                     &lt;simpleType>
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="MiscChargeOrder" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="PaymentCard" type="{http://epowerv5.amadeus.com.tr/WS}PaymentCardType" minOccurs="0"/>
 *           &lt;element name="Cash" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="CashIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="BankAcct" type="{http://epowerv5.amadeus.com.tr/WS}BankAcctType" minOccurs="0"/>
 *           &lt;element name="DirectBill" type="{http://epowerv5.amadeus.com.tr/WS}DirectBillType" minOccurs="0"/>
 *           &lt;element name="Voucher" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="SupplierIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="ElectronicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="TFThreeDSecureResultURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThreeDSecureReturnURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PaymentType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}PaymentTypes" />
 *       &lt;attribute name="PaymentFPType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}PaymentFPTypes" />
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CostCenterID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PaymentTransactionTypeCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="charge"/>
 *             &lt;enumeration value="reserve"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFormType", propOrder = {
    "billingAddress",
    "loyaltyRedemption",
    "miscChargeOrder",
    "paymentCard",
    "cash",
    "bankAcct",
    "directBill",
    "voucher",
    "tfThreeDSecureResultURL",
    "threeDSecureReturnURL"
})
@XmlSeeAlso({
    wsimport.lib.epower.ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted.class,
    PaymentDetailType.class
})
public class PaymentFormType {

    @XmlElement(name = "BillingAddress")
    protected AddressType billingAddress;
    @XmlElement(name = "LoyaltyRedemption")
    protected PaymentFormType.LoyaltyRedemption loyaltyRedemption;
    @XmlElement(name = "MiscChargeOrder")
    protected PaymentFormType.MiscChargeOrder miscChargeOrder;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "Cash")
    protected PaymentFormType.Cash cash;
    @XmlElement(name = "BankAcct")
    protected BankAcctType bankAcct;
    @XmlElement(name = "DirectBill")
    protected DirectBillType directBill;
    @XmlElement(name = "Voucher")
    protected PaymentFormType.Voucher voucher;
    @XmlElement(name = "TFThreeDSecureResultURL")
    protected String tfThreeDSecureResultURL;
    @XmlElement(name = "ThreeDSecureReturnURL")
    protected String threeDSecureReturnURL;
    @XmlAttribute(name = "PaymentType", required = true)
    protected PaymentTypes paymentType;
    @XmlAttribute(name = "PaymentFPType", required = true)
    protected PaymentFPTypes paymentFPType;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "CostCenterID")
    protected String costCenterID;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "PaymentTransactionTypeCode")
    protected String paymentTransactionTypeCode;

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBillingAddress(AddressType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the loyaltyRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.LoyaltyRedemption }
     *     
     */
    public PaymentFormType.LoyaltyRedemption getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * Sets the value of the loyaltyRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.LoyaltyRedemption }
     *     
     */
    public void setLoyaltyRedemption(PaymentFormType.LoyaltyRedemption value) {
        this.loyaltyRedemption = value;
    }

    /**
     * Gets the value of the miscChargeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.MiscChargeOrder }
     *     
     */
    public PaymentFormType.MiscChargeOrder getMiscChargeOrder() {
        return miscChargeOrder;
    }

    /**
     * Sets the value of the miscChargeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.MiscChargeOrder }
     *     
     */
    public void setMiscChargeOrder(PaymentFormType.MiscChargeOrder value) {
        this.miscChargeOrder = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Cash }
     *     
     */
    public PaymentFormType.Cash getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Cash }
     *     
     */
    public void setCash(PaymentFormType.Cash value) {
        this.cash = value;
    }

    /**
     * Gets the value of the bankAcct property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctType }
     *     
     */
    public BankAcctType getBankAcct() {
        return bankAcct;
    }

    /**
     * Sets the value of the bankAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctType }
     *     
     */
    public void setBankAcct(BankAcctType value) {
        this.bankAcct = value;
    }

    /**
     * Gets the value of the directBill property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType }
     *     
     */
    public DirectBillType getDirectBill() {
        return directBill;
    }

    /**
     * Sets the value of the directBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType }
     *     
     */
    public void setDirectBill(DirectBillType value) {
        this.directBill = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Voucher }
     *     
     */
    public PaymentFormType.Voucher getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Voucher }
     *     
     */
    public void setVoucher(PaymentFormType.Voucher value) {
        this.voucher = value;
    }

    /**
     * Gets the value of the tfThreeDSecureResultURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTFThreeDSecureResultURL() {
        return tfThreeDSecureResultURL;
    }

    /**
     * Sets the value of the tfThreeDSecureResultURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTFThreeDSecureResultURL(String value) {
        this.tfThreeDSecureResultURL = value;
    }

    /**
     * Gets the value of the threeDSecureReturnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSecureReturnURL() {
        return threeDSecureReturnURL;
    }

    /**
     * Sets the value of the threeDSecureReturnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSecureReturnURL(String value) {
        this.threeDSecureReturnURL = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypes }
     *     
     */
    public PaymentTypes getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypes }
     *     
     */
    public void setPaymentType(PaymentTypes value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentFPType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFPTypes }
     *     
     */
    public PaymentFPTypes getPaymentFPType() {
        return paymentFPType;
    }

    /**
     * Sets the value of the paymentFPType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFPTypes }
     *     
     */
    public void setPaymentFPType(PaymentFPTypes value) {
        this.paymentFPType = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
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

    /**
     * Gets the value of the paymentTransactionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTransactionTypeCode() {
        return paymentTransactionTypeCode;
    }

    /**
     * Sets the value of the paymentTransactionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTransactionTypeCode(String value) {
        this.paymentTransactionTypeCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="CashIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cash {

        @XmlAttribute(name = "CashIndicator")
        protected Boolean cashIndicator;

        /**
         * Gets the value of the cashIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCashIndicator() {
            if (cashIndicator == null) {
                return true;
            } else {
                return cashIndicator;
            }
        }

        /**
         * Sets the value of the cashIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCashIndicator(Boolean value) {
            this.cashIndicator = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LoyaltyCertificate" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="Format">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Paper"/>
     *                       &lt;enumeration value="Electronic"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PromotionVendorCode">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "loyaltyCertificate"
    })
    public static class LoyaltyRedemption {

        @XmlElement(name = "LoyaltyCertificate")
        protected List<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate> loyaltyCertificate;
        @XmlAttribute(name = "CertificateNumber")
        protected String certificateNumber;
        @XmlAttribute(name = "MemberNumber")
        protected String memberNumber;
        @XmlAttribute(name = "ProgramName")
        protected String programName;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "PromotionVendorCode")
        protected List<String> promotionVendorCode;
        @XmlAttribute(name = "RedemptionQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger redemptionQuantity;

        /**
         * Gets the value of the loyaltyCertificate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loyaltyCertificate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoyaltyCertificate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentFormType.LoyaltyRedemption.LoyaltyCertificate }
         * 
         * 
         */
        public List<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate> getLoyaltyCertificate() {
            if (loyaltyCertificate == null) {
                loyaltyCertificate = new ArrayList<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate>();
            }
            return this.loyaltyCertificate;
        }

        /**
         * Gets the value of the certificateNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertificateNumber() {
            return certificateNumber;
        }

        /**
         * Sets the value of the certificateNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertificateNumber(String value) {
            this.certificateNumber = value;
        }

        /**
         * Gets the value of the memberNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberNumber() {
            return memberNumber;
        }

        /**
         * Sets the value of the memberNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberNumber(String value) {
            this.memberNumber = value;
        }

        /**
         * Gets the value of the programName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramName() {
            return programName;
        }

        /**
         * Sets the value of the programName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramName(String value) {
            this.programName = value;
        }

        /**
         * Gets the value of the promotionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionCode() {
            return promotionCode;
        }

        /**
         * Sets the value of the promotionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionCode(String value) {
            this.promotionCode = value;
        }

        /**
         * Gets the value of the promotionVendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPromotionVendorCode() {
            if (promotionVendorCode == null) {
                promotionVendorCode = new ArrayList<String>();
            }
            return this.promotionVendorCode;
        }

        /**
         * Gets the value of the redemptionQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRedemptionQuantity() {
            return redemptionQuantity;
        }

        /**
         * Sets the value of the redemptionQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRedemptionQuantity(BigInteger value) {
            this.redemptionQuantity = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="Format">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Paper"/>
         *             &lt;enumeration value="Electronic"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LoyaltyCertificate {

            @XmlAttribute(name = "ID_Context")
            protected String idContext;
            @XmlAttribute(name = "NmbrOfNights")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nmbrOfNights;
            @XmlAttribute(name = "Format")
            protected String format;
            @XmlAttribute(name = "Status")
            protected String status;

            /**
             * Gets the value of the idContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDContext() {
                return idContext;
            }

            /**
             * Sets the value of the idContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDContext(String value) {
                this.idContext = value;
            }

            /**
             * Gets the value of the nmbrOfNights property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNmbrOfNights() {
                return nmbrOfNights;
            }

            /**
             * Sets the value of the nmbrOfNights property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNmbrOfNights(BigInteger value) {
                this.nmbrOfNights = value;
            }

            /**
             * Gets the value of the format property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Sets the value of the format property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MiscChargeOrder {

        @XmlAttribute(name = "TicketNumber")
        protected String ticketNumber;

        /**
         * Gets the value of the ticketNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketNumber() {
            return ticketNumber;
        }

        /**
         * Sets the value of the ticketNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketNumber(String value) {
            this.ticketNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SupplierIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ElectronicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Voucher {

        @XmlAttribute(name = "SeriesCode")
        protected String seriesCode;
        @XmlAttribute(name = "BillingNumber")
        protected String billingNumber;
        @XmlAttribute(name = "SupplierIdentifier")
        protected String supplierIdentifier;
        @XmlAttribute(name = "Identifier")
        protected String identifier;
        @XmlAttribute(name = "ValueType")
        protected String valueType;
        @XmlAttribute(name = "ElectronicIndicator")
        protected Boolean electronicIndicator;

        /**
         * Gets the value of the seriesCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeriesCode() {
            return seriesCode;
        }

        /**
         * Sets the value of the seriesCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeriesCode(String value) {
            this.seriesCode = value;
        }

        /**
         * Gets the value of the billingNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingNumber() {
            return billingNumber;
        }

        /**
         * Sets the value of the billingNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingNumber(String value) {
            this.billingNumber = value;
        }

        /**
         * Gets the value of the supplierIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierIdentifier() {
            return supplierIdentifier;
        }

        /**
         * Sets the value of the supplierIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierIdentifier(String value) {
            this.supplierIdentifier = value;
        }

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifier(String value) {
            this.identifier = value;
        }

        /**
         * Gets the value of the valueType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueType() {
            return valueType;
        }

        /**
         * Sets the value of the valueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueType(String value) {
            this.valueType = value;
        }

        /**
         * Gets the value of the electronicIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isElectronicIndicator() {
            return electronicIndicator;
        }

        /**
         * Sets the value of the electronicIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setElectronicIndicator(Boolean value) {
            this.electronicIndicator = value;
        }

    }

}
