
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardHolderName" type="{http://traveltalk.com/wsIssueTicket}CardHolderName" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsIssueTicket}PaymentCardShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsIssueTicket}PaymentCardShareMarketInd" />
 *       &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CardCode" type="{http://traveltalk.com/wsIssueTicket}PaymentCardCardCode" />
 *       &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard", propOrder = {
    "cardHolderName"
})
public class PaymentCard {

    @XmlElement(name = "CardHolderName")
    protected CardHolderName cardHolderName;
    @XmlAttribute(name = "ShareSynchInd")
    protected PaymentCardShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected PaymentCardShareMarketInd shareMarketInd;
    @XmlAttribute(name = "CardType")
    protected String cardType;
    @XmlAttribute(name = "CardCode")
    protected PaymentCardCardCode cardCode;
    @XmlAttribute(name = "CardNumber")
    protected String cardNumber;
    @XmlAttribute(name = "SeriesCode")
    protected String seriesCode;
    @XmlAttribute(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    protected String expireDate;
    @XmlAttribute(name = "ConfirmationNumber")
    protected String confirmationNumber;

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link CardHolderName }
     *     
     */
    public CardHolderName getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardHolderName }
     *     
     */
    public void setCardHolderName(CardHolderName value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardShareSynchInd }
     *     
     */
    public PaymentCardShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardShareSynchInd }
     *     
     */
    public void setShareSynchInd(PaymentCardShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardShareMarketInd }
     *     
     */
    public PaymentCardShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardShareMarketInd }
     *     
     */
    public void setShareMarketInd(PaymentCardShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardCardCode }
     *     
     */
    public PaymentCardCardCode getCardCode() {
        return cardCode;
    }

    /**
     * Sets the value of the cardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardCardCode }
     *     
     */
    public void setCardCode(PaymentCardCardCode value) {
        this.cardCode = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

}
