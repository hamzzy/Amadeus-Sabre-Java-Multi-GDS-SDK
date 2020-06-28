
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeQuantity" type="{http://epowerv5.amadeus.com.tr/WS}PassengerTypeQuantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="SurChargeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ExternalServiceFee" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ItineraryIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TotalForAllPax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MarkupFeeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ExtraSeatAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CabinBaggageAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeeType", propOrder = {
    "passengerTypeQuantity"
})
@XmlSeeAlso({
    BookingFeeType.class
})
public class ServiceFeeType {

    @XmlElement(name = "PassengerTypeQuantity")
    protected PassengerTypeQuantityType passengerTypeQuantity;
    @XmlAttribute(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlAttribute(name = "SurChargeAmount")
    protected BigDecimal surChargeAmount;
    @XmlAttribute(name = "ExternalServiceFee")
    protected BigDecimal externalServiceFee;
    @XmlAttribute(name = "ItineraryIndex")
    protected Integer itineraryIndex;
    @XmlAttribute(name = "TotalForAllPax")
    protected Boolean totalForAllPax;
    @XmlAttribute(name = "MarkupFeeAmount")
    protected BigDecimal markupFeeAmount;
    @XmlAttribute(name = "ExtraSeatAmount")
    protected BigDecimal extraSeatAmount;
    @XmlAttribute(name = "CabinBaggageAmount")
    protected BigDecimal cabinBaggageAmount;

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public PassengerTypeQuantityType getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /**
     * Sets the value of the passengerTypeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public void setPassengerTypeQuantity(PassengerTypeQuantityType value) {
        this.passengerTypeQuantity = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the surChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurChargeAmount() {
        return surChargeAmount;
    }

    /**
     * Sets the value of the surChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurChargeAmount(BigDecimal value) {
        this.surChargeAmount = value;
    }

    /**
     * Gets the value of the externalServiceFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExternalServiceFee() {
        return externalServiceFee;
    }

    /**
     * Sets the value of the externalServiceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExternalServiceFee(BigDecimal value) {
        this.externalServiceFee = value;
    }

    /**
     * Gets the value of the itineraryIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItineraryIndex() {
        return itineraryIndex;
    }

    /**
     * Sets the value of the itineraryIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItineraryIndex(Integer value) {
        this.itineraryIndex = value;
    }

    /**
     * Gets the value of the totalForAllPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalForAllPax() {
        return totalForAllPax;
    }

    /**
     * Sets the value of the totalForAllPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalForAllPax(Boolean value) {
        this.totalForAllPax = value;
    }

    /**
     * Gets the value of the markupFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkupFeeAmount() {
        return markupFeeAmount;
    }

    /**
     * Sets the value of the markupFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkupFeeAmount(BigDecimal value) {
        this.markupFeeAmount = value;
    }

    /**
     * Gets the value of the extraSeatAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraSeatAmount() {
        return extraSeatAmount;
    }

    /**
     * Sets the value of the extraSeatAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraSeatAmount(BigDecimal value) {
        this.extraSeatAmount = value;
    }

    /**
     * Gets the value of the cabinBaggageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCabinBaggageAmount() {
        return cabinBaggageAmount;
    }

    /**
     * Sets the value of the cabinBaggageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCabinBaggageAmount(BigDecimal value) {
        this.cabinBaggageAmount = value;
    }

}
