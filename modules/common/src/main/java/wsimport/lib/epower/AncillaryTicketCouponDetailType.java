
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryTicketCouponDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryTicketCouponDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Refundable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exchangeable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterlinableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interlinable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsummedIssuanceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsummedIssuance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreeAllowance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExcessBaggage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePerUnitAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePerUnitCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePerUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryTicketCouponDetailType", propOrder = {
    "refundableCode",
    "refundable",
    "exchangeableCode",
    "exchangeable",
    "interlinableCode",
    "interlinable",
    "consummedIssuanceCode",
    "consummedIssuance",
    "quantityTypeCode",
    "quantityType",
    "unitQualifierCode",
    "unitQualifier",
    "freeAllowance",
    "excessBaggage",
    "ratePerUnitAmount",
    "ratePerUnitCurrency",
    "ratePerUnit"
})
public class AncillaryTicketCouponDetailType {

    @XmlElement(name = "RefundableCode")
    protected String refundableCode;
    @XmlElement(name = "Refundable")
    protected String refundable;
    @XmlElement(name = "ExchangeableCode")
    protected String exchangeableCode;
    @XmlElement(name = "Exchangeable")
    protected String exchangeable;
    @XmlElement(name = "InterlinableCode")
    protected String interlinableCode;
    @XmlElement(name = "Interlinable")
    protected String interlinable;
    @XmlElement(name = "ConsummedIssuanceCode")
    protected String consummedIssuanceCode;
    @XmlElement(name = "ConsummedIssuance")
    protected String consummedIssuance;
    @XmlElement(name = "QuantityTypeCode")
    protected String quantityTypeCode;
    @XmlElement(name = "QuantityType")
    protected String quantityType;
    @XmlElement(name = "UnitQualifierCode")
    protected String unitQualifierCode;
    @XmlElement(name = "UnitQualifier")
    protected String unitQualifier;
    @XmlElement(name = "FreeAllowance")
    protected String freeAllowance;
    @XmlElement(name = "ExcessBaggage")
    protected String excessBaggage;
    @XmlElement(name = "RatePerUnitAmount")
    protected String ratePerUnitAmount;
    @XmlElement(name = "RatePerUnitCurrency")
    protected String ratePerUnitCurrency;
    @XmlElement(name = "RatePerUnit")
    protected String ratePerUnit;

    /**
     * Gets the value of the refundableCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundableCode() {
        return refundableCode;
    }

    /**
     * Sets the value of the refundableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundableCode(String value) {
        this.refundableCode = value;
    }

    /**
     * Gets the value of the refundable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundable(String value) {
        this.refundable = value;
    }

    /**
     * Gets the value of the exchangeableCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeableCode() {
        return exchangeableCode;
    }

    /**
     * Sets the value of the exchangeableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeableCode(String value) {
        this.exchangeableCode = value;
    }

    /**
     * Gets the value of the exchangeable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeable() {
        return exchangeable;
    }

    /**
     * Sets the value of the exchangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeable(String value) {
        this.exchangeable = value;
    }

    /**
     * Gets the value of the interlinableCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterlinableCode() {
        return interlinableCode;
    }

    /**
     * Sets the value of the interlinableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterlinableCode(String value) {
        this.interlinableCode = value;
    }

    /**
     * Gets the value of the interlinable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterlinable() {
        return interlinable;
    }

    /**
     * Sets the value of the interlinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterlinable(String value) {
        this.interlinable = value;
    }

    /**
     * Gets the value of the consummedIssuanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsummedIssuanceCode() {
        return consummedIssuanceCode;
    }

    /**
     * Sets the value of the consummedIssuanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsummedIssuanceCode(String value) {
        this.consummedIssuanceCode = value;
    }

    /**
     * Gets the value of the consummedIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsummedIssuance() {
        return consummedIssuance;
    }

    /**
     * Sets the value of the consummedIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsummedIssuance(String value) {
        this.consummedIssuance = value;
    }

    /**
     * Gets the value of the quantityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityTypeCode() {
        return quantityTypeCode;
    }

    /**
     * Sets the value of the quantityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityTypeCode(String value) {
        this.quantityTypeCode = value;
    }

    /**
     * Gets the value of the quantityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityType() {
        return quantityType;
    }

    /**
     * Sets the value of the quantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityType(String value) {
        this.quantityType = value;
    }

    /**
     * Gets the value of the unitQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitQualifierCode() {
        return unitQualifierCode;
    }

    /**
     * Sets the value of the unitQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitQualifierCode(String value) {
        this.unitQualifierCode = value;
    }

    /**
     * Gets the value of the unitQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /**
     * Sets the value of the unitQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitQualifier(String value) {
        this.unitQualifier = value;
    }

    /**
     * Gets the value of the freeAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeAllowance() {
        return freeAllowance;
    }

    /**
     * Sets the value of the freeAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeAllowance(String value) {
        this.freeAllowance = value;
    }

    /**
     * Gets the value of the excessBaggage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcessBaggage() {
        return excessBaggage;
    }

    /**
     * Sets the value of the excessBaggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcessBaggage(String value) {
        this.excessBaggage = value;
    }

    /**
     * Gets the value of the ratePerUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePerUnitAmount() {
        return ratePerUnitAmount;
    }

    /**
     * Sets the value of the ratePerUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePerUnitAmount(String value) {
        this.ratePerUnitAmount = value;
    }

    /**
     * Gets the value of the ratePerUnitCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePerUnitCurrency() {
        return ratePerUnitCurrency;
    }

    /**
     * Sets the value of the ratePerUnitCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePerUnitCurrency(String value) {
        this.ratePerUnitCurrency = value;
    }

    /**
     * Gets the value of the ratePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePerUnit() {
        return ratePerUnit;
    }

    /**
     * Sets the value of the ratePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePerUnit(String value) {
        this.ratePerUnit = value;
    }

}
