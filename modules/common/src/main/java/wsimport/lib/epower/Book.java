
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="BookBasketRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightReservation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}GenericFlightRQ">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HotelReservation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="HotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="RoomID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CarReservation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="VendorID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="VehicleID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InsuranceReservation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PlanID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TravelerInfo" type="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoType" minOccurs="0"/>
 *                   &lt;element name="Fulfillment" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPaymentDetailType" minOccurs="0"/>
 *                             &lt;element name="DeliveryAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *                             &lt;element name="Receipt" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PaymentText" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
 *                                     &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LCCUserLogin" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Ticketing" type="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PNRRemarks" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPNRRemarkInfo" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CorporatePinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "bookBasketRQ"
})
@XmlRootElement(name = "Book")
public class Book {

    @XmlElement(name = "BookBasketRQ")
    protected Book.BookBasketRQ bookBasketRQ;

    /**
     * Gets the value of the bookBasketRQ property.
     * 
     * @return
     *     possible object is
     *     {@link Book.BookBasketRQ }
     *     
     */
    public Book.BookBasketRQ getBookBasketRQ() {
        return bookBasketRQ;
    }

    /**
     * Sets the value of the bookBasketRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Book.BookBasketRQ }
     *     
     */
    public void setBookBasketRQ(Book.BookBasketRQ value) {
        this.bookBasketRQ = value;
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
     *         &lt;element name="FlightReservation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}GenericFlightRQ">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="HotelReservation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="HotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="RoomID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CarReservation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="VendorID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="VehicleID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InsuranceReservation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PlanID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TravelerInfo" type="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoType" minOccurs="0"/>
     *         &lt;element name="Fulfillment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPaymentDetailType" minOccurs="0"/>
     *                   &lt;element name="DeliveryAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
     *                   &lt;element name="Receipt" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PaymentText" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
     *                           &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LCCUserLogin" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Ticketing" type="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PNRRemarks" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPNRRemarkInfo" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CorporatePinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightReservation",
        "hotelReservation",
        "carReservation",
        "insuranceReservation",
        "travelerInfo",
        "fulfillment",
        "ticketing",
        "pnrRemarks"
    })
    public static class BookBasketRQ {

        @XmlElement(name = "FlightReservation")
        protected Book.BookBasketRQ.FlightReservation flightReservation;
        @XmlElement(name = "HotelReservation")
        protected Book.BookBasketRQ.HotelReservation hotelReservation;
        @XmlElement(name = "CarReservation")
        protected Book.BookBasketRQ.CarReservation carReservation;
        @XmlElement(name = "InsuranceReservation")
        protected Book.BookBasketRQ.InsuranceReservation insuranceReservation;
        @XmlElement(name = "TravelerInfo")
        protected TravelerInfoType travelerInfo;
        @XmlElement(name = "Fulfillment")
        protected Book.BookBasketRQ.Fulfillment fulfillment;
        @XmlElement(name = "Ticketing")
        protected List<TicketingInfoType> ticketing;
        @XmlElement(name = "PNRRemarks")
        protected ArrayOfPNRRemarkInfo pnrRemarks;
        @XmlAttribute(name = "ReferenceNumber")
        protected String referenceNumber;
        @XmlAttribute(name = "ControlNumber")
        protected String controlNumber;
        @XmlAttribute(name = "CorporatePinNumber")
        protected String corporatePinNumber;

        /**
         * Gets the value of the flightReservation property.
         * 
         * @return
         *     possible object is
         *     {@link Book.BookBasketRQ.FlightReservation }
         *     
         */
        public Book.BookBasketRQ.FlightReservation getFlightReservation() {
            return flightReservation;
        }

        /**
         * Sets the value of the flightReservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Book.BookBasketRQ.FlightReservation }
         *     
         */
        public void setFlightReservation(Book.BookBasketRQ.FlightReservation value) {
            this.flightReservation = value;
        }

        /**
         * Gets the value of the hotelReservation property.
         * 
         * @return
         *     possible object is
         *     {@link Book.BookBasketRQ.HotelReservation }
         *     
         */
        public Book.BookBasketRQ.HotelReservation getHotelReservation() {
            return hotelReservation;
        }

        /**
         * Sets the value of the hotelReservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Book.BookBasketRQ.HotelReservation }
         *     
         */
        public void setHotelReservation(Book.BookBasketRQ.HotelReservation value) {
            this.hotelReservation = value;
        }

        /**
         * Gets the value of the carReservation property.
         * 
         * @return
         *     possible object is
         *     {@link Book.BookBasketRQ.CarReservation }
         *     
         */
        public Book.BookBasketRQ.CarReservation getCarReservation() {
            return carReservation;
        }

        /**
         * Sets the value of the carReservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Book.BookBasketRQ.CarReservation }
         *     
         */
        public void setCarReservation(Book.BookBasketRQ.CarReservation value) {
            this.carReservation = value;
        }

        /**
         * Gets the value of the insuranceReservation property.
         * 
         * @return
         *     possible object is
         *     {@link Book.BookBasketRQ.InsuranceReservation }
         *     
         */
        public Book.BookBasketRQ.InsuranceReservation getInsuranceReservation() {
            return insuranceReservation;
        }

        /**
         * Sets the value of the insuranceReservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Book.BookBasketRQ.InsuranceReservation }
         *     
         */
        public void setInsuranceReservation(Book.BookBasketRQ.InsuranceReservation value) {
            this.insuranceReservation = value;
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
         * Gets the value of the fulfillment property.
         * 
         * @return
         *     possible object is
         *     {@link Book.BookBasketRQ.Fulfillment }
         *     
         */
        public Book.BookBasketRQ.Fulfillment getFulfillment() {
            return fulfillment;
        }

        /**
         * Sets the value of the fulfillment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Book.BookBasketRQ.Fulfillment }
         *     
         */
        public void setFulfillment(Book.BookBasketRQ.Fulfillment value) {
            this.fulfillment = value;
        }

        /**
         * Gets the value of the ticketing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketingInfoType }
         * 
         * 
         */
        public List<TicketingInfoType> getTicketing() {
            if (ticketing == null) {
                ticketing = new ArrayList<TicketingInfoType>();
            }
            return this.ticketing;
        }

        /**
         * Gets the value of the pnrRemarks property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPNRRemarkInfo }
         *     
         */
        public ArrayOfPNRRemarkInfo getPNRRemarks() {
            return pnrRemarks;
        }

        /**
         * Sets the value of the pnrRemarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPNRRemarkInfo }
         *     
         */
        public void setPNRRemarks(ArrayOfPNRRemarkInfo value) {
            this.pnrRemarks = value;
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
         * Gets the value of the controlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getControlNumber() {
            return controlNumber;
        }

        /**
         * Sets the value of the controlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setControlNumber(String value) {
            this.controlNumber = value;
        }

        /**
         * Gets the value of the corporatePinNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorporatePinNumber() {
            return corporatePinNumber;
        }

        /**
         * Sets the value of the corporatePinNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorporatePinNumber(String value) {
            this.corporatePinNumber = value;
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
         *       &lt;attribute name="VendorID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="VehicleID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CarReservation {

            @XmlAttribute(name = "VendorID", required = true)
            protected int vendorID;
            @XmlAttribute(name = "VehicleID", required = true)
            protected int vehicleID;

            /**
             * Gets the value of the vendorID property.
             * 
             */
            public int getVendorID() {
                return vendorID;
            }

            /**
             * Sets the value of the vendorID property.
             * 
             */
            public void setVendorID(int value) {
                this.vendorID = value;
            }

            /**
             * Gets the value of the vehicleID property.
             * 
             */
            public int getVehicleID() {
                return vehicleID;
            }

            /**
             * Sets the value of the vehicleID property.
             * 
             */
            public void setVehicleID(int value) {
                this.vehicleID = value;
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
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}GenericFlightRQ">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FlightReservation
            extends GenericFlightRQ
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
         *         &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
         *         &lt;element name="Receipt" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PaymentText" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
         *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LCCUserLogin" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "paymentDetails",
            "deliveryAddress",
            "name",
            "receipt",
            "paymentText",
            "lccUserLogin"
        })
        public static class Fulfillment {

            @XmlElement(name = "PaymentDetails")
            protected ArrayOfPaymentDetailType paymentDetails;
            @XmlElement(name = "DeliveryAddress")
            protected AddressType deliveryAddress;
            @XmlElement(name = "Name")
            protected PersonNameType name;
            @XmlElement(name = "Receipt")
            protected Book.BookBasketRQ.Fulfillment.Receipt receipt;
            @XmlElement(name = "PaymentText")
            protected List<Book.BookBasketRQ.Fulfillment.PaymentText> paymentText;
            @XmlElement(name = "LCCUserLogin")
            protected Book.BookBasketRQ.Fulfillment.LCCUserLogin lccUserLogin;

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

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link PersonNameType }
             *     
             */
            public PersonNameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonNameType }
             *     
             */
            public void setName(PersonNameType value) {
                this.name = value;
            }

            /**
             * Gets the value of the receipt property.
             * 
             * @return
             *     possible object is
             *     {@link Book.BookBasketRQ.Fulfillment.Receipt }
             *     
             */
            public Book.BookBasketRQ.Fulfillment.Receipt getReceipt() {
                return receipt;
            }

            /**
             * Sets the value of the receipt property.
             * 
             * @param value
             *     allowed object is
             *     {@link Book.BookBasketRQ.Fulfillment.Receipt }
             *     
             */
            public void setReceipt(Book.BookBasketRQ.Fulfillment.Receipt value) {
                this.receipt = value;
            }

            /**
             * Gets the value of the paymentText property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paymentText property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPaymentText().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Book.BookBasketRQ.Fulfillment.PaymentText }
             * 
             * 
             */
            public List<Book.BookBasketRQ.Fulfillment.PaymentText> getPaymentText() {
                if (paymentText == null) {
                    paymentText = new ArrayList<Book.BookBasketRQ.Fulfillment.PaymentText>();
                }
                return this.paymentText;
            }

            /**
             * Gets the value of the lccUserLogin property.
             * 
             * @return
             *     possible object is
             *     {@link Book.BookBasketRQ.Fulfillment.LCCUserLogin }
             *     
             */
            public Book.BookBasketRQ.Fulfillment.LCCUserLogin getLCCUserLogin() {
                return lccUserLogin;
            }

            /**
             * Sets the value of the lccUserLogin property.
             * 
             * @param value
             *     allowed object is
             *     {@link Book.BookBasketRQ.Fulfillment.LCCUserLogin }
             *     
             */
            public void setLCCUserLogin(Book.BookBasketRQ.Fulfillment.LCCUserLogin value) {
                this.lccUserLogin = value;
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
             *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LCCUserLogin {

                @XmlAttribute(name = "UserName")
                protected String userName;
                @XmlAttribute(name = "Password")
                protected String password;

                /**
                 * Gets the value of the userName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUserName() {
                    return userName;
                }

                /**
                 * Sets the value of the userName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUserName(String value) {
                    this.userName = value;
                }

                /**
                 * Gets the value of the password property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassword() {
                    return password;
                }

                /**
                 * Sets the value of the password property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassword(String value) {
                    this.password = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
             *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PaymentText
                extends FormattedTextTextType
            {

                @XmlAttribute(name = "Text")
                protected String text;
                @XmlAttribute(name = "Name")
                protected String name;

                /**
                 * Gets the value of the text property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Sets the value of the text property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
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
             *       &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Receipt {

                @XmlAttribute(name = "DistribType")
                protected String distribType;

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
         *       &lt;attribute name="HotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="RoomID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HotelReservation {

            @XmlAttribute(name = "HotelID", required = true)
            protected int hotelID;
            @XmlAttribute(name = "RoomID", required = true)
            protected int roomID;

            /**
             * Gets the value of the hotelID property.
             * 
             */
            public int getHotelID() {
                return hotelID;
            }

            /**
             * Sets the value of the hotelID property.
             * 
             */
            public void setHotelID(int value) {
                this.hotelID = value;
            }

            /**
             * Gets the value of the roomID property.
             * 
             */
            public int getRoomID() {
                return roomID;
            }

            /**
             * Sets the value of the roomID property.
             * 
             */
            public void setRoomID(int value) {
                this.roomID = value;
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
         *       &lt;attribute name="PlanID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InsuranceReservation {

            @XmlAttribute(name = "PlanID", required = true)
            protected int planID;

            /**
             * Gets the value of the planID property.
             * 
             */
            public int getPlanID() {
                return planID;
            }

            /**
             * Sets the value of the planID property.
             * 
             */
            public void setPlanID(int value) {
                this.planID = value;
            }

        }

    }

}
