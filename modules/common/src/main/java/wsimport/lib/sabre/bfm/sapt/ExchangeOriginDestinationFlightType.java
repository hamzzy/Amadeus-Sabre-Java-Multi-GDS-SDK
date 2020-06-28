
package wsimport.lib.sabre.bfm.sapt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeOriginDestinationFlightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeOriginDestinationFlightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationFlightGroup"/>
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}ExchangeOriginDestinationFlightFareGroup"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationFlightAttributeGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeOriginDestinationFlightAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeOriginDestinationFlightType", propOrder = {
    "originLocation",
    "destinationLocation",
    "airline",
    "sideTrip",
    "reservation",
    "mileageDisplay",
    "bookingDateTime",
    "fare",
    "plusUp"
})
public class ExchangeOriginDestinationFlightType {

    @XmlElement(name = "OriginLocation", required = true)
    protected RequestLocationType originLocation;
    @XmlElement(name = "DestinationLocation", required = true)
    protected RequestLocationType destinationLocation;
    @XmlElement(name = "Airline", required = true)
    protected AirlineType airline;
    @XmlElement(name = "SideTrip")
    protected SideTripType sideTrip;
    @XmlElement(name = "Reservation")
    protected ReservationType reservation;
    @XmlElement(name = "MileageDisplay")
    protected List<MileageDisplayType> mileageDisplay;
    @XmlElement(name = "BookingDateTime")
    protected String bookingDateTime;
    @XmlElement(name = "Fare", required = true)
    protected Fare fare;
    @XmlElement(name = "PlusUp")
    protected List<PlusUpType> plusUp;
    @XmlAttribute(name = "Number", required = true)
    protected short number;
    @XmlAttribute(name = "DepartureDateTime", required = true)
    protected String departureDateTime;
    @XmlAttribute(name = "ArrivalDateTime", required = true)
    protected String arrivalDateTime;
    @XmlAttribute(name = "MarriageStatus")
    protected String marriageStatus;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Flown")
    protected Boolean flown;
    @XmlAttribute(name = "ClassOfService", required = true)
    protected String classOfService;

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestLocationType }
     *     
     */
    public RequestLocationType getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestLocationType }
     *     
     */
    public void setOriginLocation(RequestLocationType value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestLocationType }
     *     
     */
    public RequestLocationType getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestLocationType }
     *     
     */
    public void setDestinationLocation(RequestLocationType value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineType }
     *     
     */
    public AirlineType getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineType }
     *     
     */
    public void setAirline(AirlineType value) {
        this.airline = value;
    }

    /**
     * Gets the value of the sideTrip property.
     * 
     * @return
     *     possible object is
     *     {@link SideTripType }
     *     
     */
    public SideTripType getSideTrip() {
        return sideTrip;
    }

    /**
     * Sets the value of the sideTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SideTripType }
     *     
     */
    public void setSideTrip(SideTripType value) {
        this.sideTrip = value;
    }

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationType }
     *     
     */
    public ReservationType getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationType }
     *     
     */
    public void setReservation(ReservationType value) {
        this.reservation = value;
    }

    /**
     * Gets the value of the mileageDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mileageDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMileageDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MileageDisplayType }
     * 
     * 
     */
    public List<MileageDisplayType> getMileageDisplay() {
        if (mileageDisplay == null) {
            mileageDisplay = new ArrayList<MileageDisplayType>();
        }
        return this.mileageDisplay;
    }

    /**
     * Gets the value of the bookingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDateTime() {
        return bookingDateTime;
    }

    /**
     * Sets the value of the bookingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDateTime(String value) {
        this.bookingDateTime = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link Fare }
     *     
     */
    public Fare getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fare }
     *     
     */
    public void setFare(Fare value) {
        this.fare = value;
    }

    /**
     * Gets the value of the plusUp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plusUp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlusUp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlusUpType }
     * 
     * 
     */
    public List<PlusUpType> getPlusUp() {
        if (plusUp == null) {
            plusUp = new ArrayList<PlusUpType>();
        }
        return this.plusUp;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public short getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(short value) {
        this.number = value;
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateTime(String value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDateTime(String value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the marriageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageStatus() {
        return marriageStatus;
    }

    /**
     * Sets the value of the marriageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageStatus(String value) {
        this.marriageStatus = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the flown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFlown() {
        if (flown == null) {
            return false;
        } else {
            return flown;
        }
    }

    /**
     * Sets the value of the flown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlown(Boolean value) {
        this.flown = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareDetailsType">
     *       &lt;sequence>
     *         &lt;element name="Adjustment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.opentravel.org/OTA/2003/05}FloatSignedCountOrPercentage" />
     *                 &lt;attribute name="Currency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *                 &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "adjustment"
    })
    public static class Fare
        extends FareDetailsType
    {

        @XmlElement(name = "Adjustment")
        protected Adjustment adjustment;

        /**
         * Gets the value of the adjustment property.
         * 
         * @return
         *     possible object is
         *     {@link Adjustment }
         *     
         */
        public Adjustment getAdjustment() {
            return adjustment;
        }

        /**
         * Sets the value of the adjustment property.
         * 
         * @param value
         *     allowed object is
         *     {@link Adjustment }
         *     
         */
        public void setAdjustment(Adjustment value) {
            this.adjustment = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.opentravel.org/OTA/2003/05}FloatSignedCountOrPercentage" />
         *       &lt;attribute name="Currency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *       &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Adjustment {

            @XmlAttribute(name = "Value", required = true)
            protected String value;
            @XmlAttribute(name = "Currency")
            protected String currency;
            @XmlAttribute(name = "Group")
            protected Short group;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
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
             * Gets the value of the group property.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getGroup() {
                return group;
            }

            /**
             * Sets the value of the group property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setGroup(Short value) {
                this.group = value;
            }

        }

    }

}
