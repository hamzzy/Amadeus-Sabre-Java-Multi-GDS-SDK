
package wsimport.lib.epower;

import java.math.BigDecimal;
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
 * <p>Java class for PricedItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirItinerary" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryType" minOccurs="0"/>
 *         &lt;element name="AirItineraryPricingInfo" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://epowerv5.amadeus.com.tr/WS}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TicketingInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoRS_Type">
 *                 &lt;sequence>
 *                   &lt;element name="DeliveryInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PaymentType">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="IsOneWayCombinable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedItineraryType", propOrder = {
    "airItinerary",
    "airItineraryPricingInfo",
    "notes",
    "ticketingInfo"
})
@XmlSeeAlso({
    wsimport.lib.epower.PricedItinerariesType.PricedItinerary.class,
    wsimport.lib.epower.PricedItinerariesType.PricedItineraryForOWC.class
})
public class PricedItineraryType {

    @XmlElement(name = "AirItinerary")
    protected AirItineraryType airItinerary;
    @XmlElement(name = "AirItineraryPricingInfo")
    protected AirItineraryPricingInfoType airItineraryPricingInfo;
    @XmlElement(name = "Notes")
    protected List<FreeTextType> notes;
    @XmlElement(name = "TicketingInfo")
    protected PricedItineraryType.TicketingInfo ticketingInfo;
    @XmlAttribute(name = "IsOneWayCombinable")
    protected Boolean isOneWayCombinable;
    @XmlAttribute(name = "Currency")
    protected String currency;
    @XmlAttribute(name = "ProviderType")
    protected String providerType;
    @XmlAttribute(name = "SequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;

    /**
     * Gets the value of the airItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType }
     *     
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType }
     *     
     */
    public void setAirItinerary(AirItineraryType value) {
        this.airItinerary = value;
    }

    /**
     * Gets the value of the airItineraryPricingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType }
     *     
     */
    public AirItineraryPricingInfoType getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    /**
     * Sets the value of the airItineraryPricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType }
     *     
     */
    public void setAirItineraryPricingInfo(AirItineraryPricingInfoType value) {
        this.airItineraryPricingInfo = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getNotes() {
        if (notes == null) {
            notes = new ArrayList<FreeTextType>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the ticketingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricedItineraryType.TicketingInfo }
     *     
     */
    public PricedItineraryType.TicketingInfo getTicketingInfo() {
        return ticketingInfo;
    }

    /**
     * Sets the value of the ticketingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItineraryType.TicketingInfo }
     *     
     */
    public void setTicketingInfo(PricedItineraryType.TicketingInfo value) {
        this.ticketingInfo = value;
    }

    /**
     * Gets the value of the isOneWayCombinable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOneWayCombinable() {
        return isOneWayCombinable;
    }

    /**
     * Sets the value of the isOneWayCombinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOneWayCombinable(Boolean value) {
        this.isOneWayCombinable = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the providerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * Sets the value of the providerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderType(String value) {
        this.providerType = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoRS_Type">
     *       &lt;sequence>
     *         &lt;element name="DeliveryInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="PaymentType">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "deliveryInfo"
    })
    public static class TicketingInfo
        extends TicketingInfoRSType
    {

        @XmlElement(name = "DeliveryInfo")
        protected List<PricedItineraryType.TicketingInfo.DeliveryInfo> deliveryInfo;
        @XmlAttribute(name = "PaymentType")
        protected List<String> paymentType;

        /**
         * Gets the value of the deliveryInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deliveryInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeliveryInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PricedItineraryType.TicketingInfo.DeliveryInfo }
         * 
         * 
         */
        public List<PricedItineraryType.TicketingInfo.DeliveryInfo> getDeliveryInfo() {
            if (deliveryInfo == null) {
                deliveryInfo = new ArrayList<PricedItineraryType.TicketingInfo.DeliveryInfo>();
            }
            return this.deliveryInfo;
        }

        /**
         * Gets the value of the paymentType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPaymentType() {
            if (paymentType == null) {
                paymentType = new ArrayList<String>();
            }
            return this.paymentType;
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
         *       &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DeliveryInfo {

            @XmlAttribute(name = "DistribType")
            protected String distribType;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;

            /**
             * Gets the value of the distribType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistribType() {
                return distribType;
            }

            /**
             * Sets the value of the distribType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistribType(String value) {
                this.distribType = value;
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

        }

    }

}
