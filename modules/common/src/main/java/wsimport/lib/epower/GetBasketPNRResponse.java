
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="OTA_AirBookRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirReservation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirReservationType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InsuranceReservation" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsuranceBookRSPlanForBookRS" minOccurs="0"/>
 *                   &lt;element name="HotelReservation" type="{http://epowerv5.amadeus.com.tr/WS}OTA_HotelResRS" minOccurs="0"/>
 *                   &lt;element name="CarReservation" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehResRS" minOccurs="0"/>
 *                   &lt;element name="TravelerInfo" type="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoType" minOccurs="0"/>
 *                   &lt;element name="FullFilment" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPaymentDetailType" minOccurs="0"/>
 *                             &lt;element name="DeliveryAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *                     &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *                     &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
 *                   &lt;/choice>
 *                   &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="NewPrice" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
 *                   &lt;element name="Failback" type="{http://epowerv5.amadeus.com.tr/WS}FailbackRS" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "", propOrder = {
    "otaAirBookRS"
})
@XmlRootElement(name = "GetBasketPNRResponse")
public class GetBasketPNRResponse {

    @XmlElement(name = "OTA_AirBookRS")
    protected GetBasketPNRResponse.OTAAirBookRS otaAirBookRS;

    /**
     * Gets the value of the otaAirBookRS property.
     * 
     * @return
     *     possible object is
     *     {@link GetBasketPNRResponse.OTAAirBookRS }
     *     
     */
    public GetBasketPNRResponse.OTAAirBookRS getOTAAirBookRS() {
        return otaAirBookRS;
    }

    /**
     * Sets the value of the otaAirBookRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBasketPNRResponse.OTAAirBookRS }
     *     
     */
    public void setOTAAirBookRS(GetBasketPNRResponse.OTAAirBookRS value) {
        this.otaAirBookRS = value;
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
     *         &lt;element name="AirReservation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirReservationType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InsuranceReservation" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsuranceBookRSPlanForBookRS" minOccurs="0"/>
     *         &lt;element name="HotelReservation" type="{http://epowerv5.amadeus.com.tr/WS}OTA_HotelResRS" minOccurs="0"/>
     *         &lt;element name="CarReservation" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehResRS" minOccurs="0"/>
     *         &lt;element name="TravelerInfo" type="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoType" minOccurs="0"/>
     *         &lt;element name="FullFilment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPaymentDetailType" minOccurs="0"/>
     *                   &lt;element name="DeliveryAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
     *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
     *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
     *         &lt;/choice>
     *         &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="NewPrice" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
     *         &lt;element name="Failback" type="{http://epowerv5.amadeus.com.tr/WS}FailbackRS" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airReservation",
        "insuranceReservation",
        "hotelReservation",
        "carReservation",
        "travelerInfo",
        "fullFilment",
        "successOrErrorsOrWarnings",
        "bookingReferenceID",
        "newPrice",
        "failback"
    })
    public static class OTAAirBookRS {

        @XmlElement(name = "AirReservation")
        protected GetBasketPNRResponse.OTAAirBookRS.AirReservation airReservation;
        @XmlElement(name = "InsuranceReservation")
        protected OTAInsuranceBookRSPlanForBookRS insuranceReservation;
        @XmlElement(name = "HotelReservation")
        protected OTAHotelResRS hotelReservation;
        @XmlElement(name = "CarReservation")
        protected OTAVehResRS carReservation;
        @XmlElement(name = "TravelerInfo")
        protected TravelerInfoType travelerInfo;
        @XmlElement(name = "FullFilment")
        protected GetBasketPNRResponse.OTAAirBookRS.FullFilment fullFilment;
        @XmlElements({
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "Warnings", type = WarningsType.class)
        })
        protected List<Object> successOrErrorsOrWarnings;
        @XmlElement(name = "BookingReferenceID")
        protected List<UniqueIDType> bookingReferenceID;
        @XmlElement(name = "NewPrice")
        protected AirItineraryPricingInfoType newPrice;
        @XmlElement(name = "Failback")
        protected FailbackRS failback;
        @XmlAttribute(name = "Cancel")
        protected Boolean cancel;
        @XmlAttribute(name = "ReferenceNumber")
        protected String referenceNumber;

        /**
         * Gets the value of the airReservation property.
         * 
         * @return
         *     possible object is
         *     {@link GetBasketPNRResponse.OTAAirBookRS.AirReservation }
         *     
         */
        public GetBasketPNRResponse.OTAAirBookRS.AirReservation getAirReservation() {
            return airReservation;
        }

        /**
         * Sets the value of the airReservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetBasketPNRResponse.OTAAirBookRS.AirReservation }
         *     
         */
        public void setAirReservation(GetBasketPNRResponse.OTAAirBookRS.AirReservation value) {
            this.airReservation = value;
        }

        /**
         * Gets the value of the insuranceReservation property.
         * 
         * @return
         *     possible object is
         *     {@link OTAInsuranceBookRSPlanForBookRS }
         *     
         */
        public OTAInsuranceBookRSPlanForBookRS getInsuranceReservation() {
            return insuranceReservation;
        }

        /**
         * Sets the value of the insuranceReservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAInsuranceBookRSPlanForBookRS }
         *     
         */
        public void setInsuranceReservation(OTAInsuranceBookRSPlanForBookRS value) {
            this.insuranceReservation = value;
        }

        /**
         * Gets the value of the hotelReservation property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelResRS }
         *     
         */
        public OTAHotelResRS getHotelReservation() {
            return hotelReservation;
        }

        /**
         * Sets the value of the hotelReservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelResRS }
         *     
         */
        public void setHotelReservation(OTAHotelResRS value) {
            this.hotelReservation = value;
        }

        /**
         * Gets the value of the carReservation property.
         * 
         * @return
         *     possible object is
         *     {@link OTAVehResRS }
         *     
         */
        public OTAVehResRS getCarReservation() {
            return carReservation;
        }

        /**
         * Sets the value of the carReservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAVehResRS }
         *     
         */
        public void setCarReservation(OTAVehResRS value) {
            this.carReservation = value;
        }

        /**
         * Gets the value of the travelerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerInfoType }
         *     
         */
        public TravelerInfoType getTravelerInfo() {
            return travelerInfo;
        }

        /**
         * Sets the value of the travelerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerInfoType }
         *     
         */
        public void setTravelerInfo(TravelerInfoType value) {
            this.travelerInfo = value;
        }

        /**
         * Gets the value of the fullFilment property.
         * 
         * @return
         *     possible object is
         *     {@link GetBasketPNRResponse.OTAAirBookRS.FullFilment }
         *     
         */
        public GetBasketPNRResponse.OTAAirBookRS.FullFilment getFullFilment() {
            return fullFilment;
        }

        /**
         * Sets the value of the fullFilment property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetBasketPNRResponse.OTAAirBookRS.FullFilment }
         *     
         */
        public void setFullFilment(GetBasketPNRResponse.OTAAirBookRS.FullFilment value) {
            this.fullFilment = value;
        }

        /**
         * Gets the value of the successOrErrorsOrWarnings property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the successOrErrorsOrWarnings property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuccessOrErrorsOrWarnings().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuccessType }
         * {@link ErrorsType }
         * {@link WarningsType }
         * 
         * 
         */
        public List<Object> getSuccessOrErrorsOrWarnings() {
            if (successOrErrorsOrWarnings == null) {
                successOrErrorsOrWarnings = new ArrayList<Object>();
            }
            return this.successOrErrorsOrWarnings;
        }

        /**
         * Gets the value of the bookingReferenceID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingReferenceID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingReferenceID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueIDType }
         * 
         * 
         */
        public List<UniqueIDType> getBookingReferenceID() {
            if (bookingReferenceID == null) {
                bookingReferenceID = new ArrayList<UniqueIDType>();
            }
            return this.bookingReferenceID;
        }

        /**
         * Gets the value of the newPrice property.
         * 
         * @return
         *     possible object is
         *     {@link AirItineraryPricingInfoType }
         *     
         */
        public AirItineraryPricingInfoType getNewPrice() {
            return newPrice;
        }

        /**
         * Sets the value of the newPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirItineraryPricingInfoType }
         *     
         */
        public void setNewPrice(AirItineraryPricingInfoType value) {
            this.newPrice = value;
        }

        /**
         * Gets the value of the failback property.
         * 
         * @return
         *     possible object is
         *     {@link FailbackRS }
         *     
         */
        public FailbackRS getFailback() {
            return failback;
        }

        /**
         * Sets the value of the failback property.
         * 
         * @param value
         *     allowed object is
         *     {@link FailbackRS }
         *     
         */
        public void setFailback(FailbackRS value) {
            this.failback = value;
        }

        /**
         * Gets the value of the cancel property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCancel() {
            if (cancel == null) {
                return false;
            } else {
                return cancel;
            }
        }

        /**
         * Sets the value of the cancel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCancel(Boolean value) {
            this.cancel = value;
        }

        /**
         * Gets the value of the referenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceNumber() {
            return referenceNumber;
        }

        /**
         * Sets the value of the referenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceNumber(String value) {
            this.referenceNumber = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirReservationType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AirReservation
            extends AirReservationType
        {


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
         *         &lt;element name="PaymentDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPaymentDetailType" minOccurs="0"/>
         *         &lt;element name="DeliveryAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paymentDetails",
            "deliveryAddress"
        })
        public static class FullFilment {

            @XmlElement(name = "PaymentDetails")
            protected ArrayOfPaymentDetailType paymentDetails;
            @XmlElement(name = "DeliveryAddress")
            protected AddressType deliveryAddress;

            /**
             * Gets the value of the paymentDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfPaymentDetailType }
             *     
             */
            public ArrayOfPaymentDetailType getPaymentDetails() {
                return paymentDetails;
            }

            /**
             * Sets the value of the paymentDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfPaymentDetailType }
             *     
             */
            public void setPaymentDetails(ArrayOfPaymentDetailType value) {
                this.paymentDetails = value;
            }

            /**
             * Gets the value of the deliveryAddress property.
             * 
             * @return
             *     possible object is
             *     {@link AddressType }
             *     
             */
            public AddressType getDeliveryAddress() {
                return deliveryAddress;
            }

            /**
             * Sets the value of the deliveryAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressType }
             *     
             */
            public void setDeliveryAddress(AddressType value) {
                this.deliveryAddress = value;
            }

        }

    }

}
