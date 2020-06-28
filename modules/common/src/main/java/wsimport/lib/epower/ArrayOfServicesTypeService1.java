
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServicesTypeService1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServicesTypeService1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicesTypeService" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Price" type="{http://epowerv5.amadeus.com.tr/WS}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ServiceDetails" type="{http://epowerv5.amadeus.com.tr/WS}ResCommonDetailType" minOccurs="0"/>
 *                   &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ServicePricingType" type="{http://epowerv5.amadeus.com.tr/WS}PricingType" />
 *                 &lt;attribute name="ReservationStatusType" type="{http://epowerv5.amadeus.com.tr/WS}PMS_ResStatusType" />
 *                 &lt;attribute name="ServiceRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ServiceInventoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InventoryBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PriceGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="RequestedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServicesTypeService1", propOrder = {
    "servicesTypeService"
})
public class ArrayOfServicesTypeService1 {

    @XmlElement(name = "ServicesTypeService", nillable = true)
    protected List<ArrayOfServicesTypeService1 .ServicesTypeService> servicesTypeService;

    /**
     * Gets the value of the servicesTypeService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicesTypeService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicesTypeService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfServicesTypeService1 .ServicesTypeService }
     * 
     * 
     */
    public List<ArrayOfServicesTypeService1 .ServicesTypeService> getServicesTypeService() {
        if (servicesTypeService == null) {
            servicesTypeService = new ArrayList<ArrayOfServicesTypeService1 .ServicesTypeService>();
        }
        return this.servicesTypeService;
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
     *         &lt;element name="Price" type="{http://epowerv5.amadeus.com.tr/WS}AmountType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ServiceDetails" type="{http://epowerv5.amadeus.com.tr/WS}ResCommonDetailType" minOccurs="0"/>
     *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ServicePricingType" type="{http://epowerv5.amadeus.com.tr/WS}PricingType" />
     *       &lt;attribute name="ReservationStatusType" type="{http://epowerv5.amadeus.com.tr/WS}PMS_ResStatusType" />
     *       &lt;attribute name="ServiceRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ServiceInventoryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InventoryBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PriceGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="RequestedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "price",
        "serviceDetails",
        "tpaExtensions"
    })
    public static class ServicesTypeService {

        @XmlElement(name = "Price")
        protected List<AmountType> price;
        @XmlElement(name = "ServiceDetails")
        protected ResCommonDetailType serviceDetails;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "ServicePricingType")
        protected PricingType servicePricingType;
        @XmlAttribute(name = "ReservationStatusType")
        protected PMSResStatusType reservationStatusType;
        @XmlAttribute(name = "ServiceRPH")
        protected String serviceRPH;
        @XmlAttribute(name = "ServiceInventoryCode")
        protected String serviceInventoryCode;
        @XmlAttribute(name = "RatePlanCode")
        protected String ratePlanCode;
        @XmlAttribute(name = "InventoryBlockCode")
        protected String inventoryBlockCode;
        @XmlAttribute(name = "PriceGuaranteed")
        protected Boolean priceGuaranteed;
        @XmlAttribute(name = "Inclusive")
        protected Boolean inclusive;
        @XmlAttribute(name = "Quantity")
        protected BigInteger quantity;
        @XmlAttribute(name = "RequestedIndicator")
        protected Boolean requestedIndicator;

        /**
         * Gets the value of the price property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the price property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AmountType }
         * 
         * 
         */
        public List<AmountType> getPrice() {
            if (price == null) {
                price = new ArrayList<AmountType>();
            }
            return this.price;
        }

        /**
         * Gets the value of the serviceDetails property.
         * 
         * @return
         *     possible object is
         *     {@link ResCommonDetailType }
         *     
         */
        public ResCommonDetailType getServiceDetails() {
            return serviceDetails;
        }

        /**
         * Sets the value of the serviceDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResCommonDetailType }
         *     
         */
        public void setServiceDetails(ResCommonDetailType value) {
            this.serviceDetails = value;
        }

        /**
         * Gets the value of the tpaExtensions property.
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * Sets the value of the tpaExtensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

        /**
         * Gets the value of the servicePricingType property.
         * 
         * @return
         *     possible object is
         *     {@link PricingType }
         *     
         */
        public PricingType getServicePricingType() {
            return servicePricingType;
        }

        /**
         * Sets the value of the servicePricingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingType }
         *     
         */
        public void setServicePricingType(PricingType value) {
            this.servicePricingType = value;
        }

        /**
         * Gets the value of the reservationStatusType property.
         * 
         * @return
         *     possible object is
         *     {@link PMSResStatusType }
         *     
         */
        public PMSResStatusType getReservationStatusType() {
            return reservationStatusType;
        }

        /**
         * Sets the value of the reservationStatusType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PMSResStatusType }
         *     
         */
        public void setReservationStatusType(PMSResStatusType value) {
            this.reservationStatusType = value;
        }

        /**
         * Gets the value of the serviceRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceRPH() {
            return serviceRPH;
        }

        /**
         * Sets the value of the serviceRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceRPH(String value) {
            this.serviceRPH = value;
        }

        /**
         * Gets the value of the serviceInventoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceInventoryCode() {
            return serviceInventoryCode;
        }

        /**
         * Sets the value of the serviceInventoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceInventoryCode(String value) {
            this.serviceInventoryCode = value;
        }

        /**
         * Gets the value of the ratePlanCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanCode() {
            return ratePlanCode;
        }

        /**
         * Sets the value of the ratePlanCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanCode(String value) {
            this.ratePlanCode = value;
        }

        /**
         * Gets the value of the inventoryBlockCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInventoryBlockCode() {
            return inventoryBlockCode;
        }

        /**
         * Sets the value of the inventoryBlockCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInventoryBlockCode(String value) {
            this.inventoryBlockCode = value;
        }

        /**
         * Gets the value of the priceGuaranteed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPriceGuaranteed() {
            return priceGuaranteed;
        }

        /**
         * Sets the value of the priceGuaranteed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPriceGuaranteed(Boolean value) {
            this.priceGuaranteed = value;
        }

        /**
         * Gets the value of the inclusive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInclusive() {
            return inclusive;
        }

        /**
         * Sets the value of the inclusive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInclusive(Boolean value) {
            this.inclusive = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the requestedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequestedIndicator() {
            return requestedIndicator;
        }

        /**
         * Sets the value of the requestedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRequestedIndicator(Boolean value) {
            this.requestedIndicator = value;
        }

    }

}
