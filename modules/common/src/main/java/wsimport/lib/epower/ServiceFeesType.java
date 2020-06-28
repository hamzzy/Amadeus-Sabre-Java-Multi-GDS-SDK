
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFeesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceFee" type="{http://epowerv5.amadeus.com.tr/WS}ServiceFeeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BookingFee" type="{http://epowerv5.amadeus.com.tr/WS}BookingFeeType" minOccurs="0"/>
 *         &lt;element name="HotelExtraFee" type="{http://epowerv5.amadeus.com.tr/WS}HotelExtraFeeType" minOccurs="0"/>
 *         &lt;element name="CarExtraFee" type="{http://epowerv5.amadeus.com.tr/WS}CarExtraFeeType" minOccurs="0"/>
 *         &lt;element name="InsuranceExtraFee" type="{http://epowerv5.amadeus.com.tr/WS}InsuranceExtraFeeType" minOccurs="0"/>
 *         &lt;element name="DeliveryFee" type="{http://epowerv5.amadeus.com.tr/WS}DeliveryFeeType" minOccurs="0"/>
 *         &lt;element name="PaymentFee" type="{http://epowerv5.amadeus.com.tr/WS}PaymentFeeType" minOccurs="0"/>
 *         &lt;element name="AirlineOBFee" type="{http://epowerv5.amadeus.com.tr/WS}AirlineOBFeeType" minOccurs="0"/>
 *         &lt;element name="AncillaryFee" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryFeeType" minOccurs="0"/>
 *         &lt;element name="CCOBFee" type="{http://epowerv5.amadeus.com.tr/WS}CCOBFeeType" minOccurs="0"/>
 *         &lt;element name="OtherExtraCost" type="{http://epowerv5.amadeus.com.tr/WS}OtherExtraCostType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeesType", propOrder = {
    "serviceFee",
    "bookingFee",
    "hotelExtraFee",
    "carExtraFee",
    "insuranceExtraFee",
    "deliveryFee",
    "paymentFee",
    "airlineOBFee",
    "ancillaryFee",
    "ccobFee",
    "otherExtraCost"
})
public class ServiceFeesType {

    @XmlElement(name = "ServiceFee")
    protected List<ServiceFeeType> serviceFee;
    @XmlElement(name = "BookingFee")
    protected BookingFeeType bookingFee;
    @XmlElement(name = "HotelExtraFee")
    protected HotelExtraFeeType hotelExtraFee;
    @XmlElement(name = "CarExtraFee")
    protected CarExtraFeeType carExtraFee;
    @XmlElement(name = "InsuranceExtraFee")
    protected InsuranceExtraFeeType insuranceExtraFee;
    @XmlElement(name = "DeliveryFee")
    protected DeliveryFeeType deliveryFee;
    @XmlElement(name = "PaymentFee")
    protected PaymentFeeType paymentFee;
    @XmlElement(name = "AirlineOBFee")
    protected AirlineOBFeeType airlineOBFee;
    @XmlElement(name = "AncillaryFee")
    protected AncillaryFeeType ancillaryFee;
    @XmlElement(name = "CCOBFee")
    protected CCOBFeeType ccobFee;
    @XmlElement(name = "OtherExtraCost")
    protected List<OtherExtraCostType> otherExtraCost;

    /**
     * Gets the value of the serviceFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeeType }
     * 
     * 
     */
    public List<ServiceFeeType> getServiceFee() {
        if (serviceFee == null) {
            serviceFee = new ArrayList<ServiceFeeType>();
        }
        return this.serviceFee;
    }

    /**
     * Gets the value of the bookingFee property.
     * 
     * @return
     *     possible object is
     *     {@link BookingFeeType }
     *     
     */
    public BookingFeeType getBookingFee() {
        return bookingFee;
    }

    /**
     * Sets the value of the bookingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingFeeType }
     *     
     */
    public void setBookingFee(BookingFeeType value) {
        this.bookingFee = value;
    }

    /**
     * Gets the value of the hotelExtraFee property.
     * 
     * @return
     *     possible object is
     *     {@link HotelExtraFeeType }
     *     
     */
    public HotelExtraFeeType getHotelExtraFee() {
        return hotelExtraFee;
    }

    /**
     * Sets the value of the hotelExtraFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelExtraFeeType }
     *     
     */
    public void setHotelExtraFee(HotelExtraFeeType value) {
        this.hotelExtraFee = value;
    }

    /**
     * Gets the value of the carExtraFee property.
     * 
     * @return
     *     possible object is
     *     {@link CarExtraFeeType }
     *     
     */
    public CarExtraFeeType getCarExtraFee() {
        return carExtraFee;
    }

    /**
     * Sets the value of the carExtraFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarExtraFeeType }
     *     
     */
    public void setCarExtraFee(CarExtraFeeType value) {
        this.carExtraFee = value;
    }

    /**
     * Gets the value of the insuranceExtraFee property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceExtraFeeType }
     *     
     */
    public InsuranceExtraFeeType getInsuranceExtraFee() {
        return insuranceExtraFee;
    }

    /**
     * Sets the value of the insuranceExtraFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceExtraFeeType }
     *     
     */
    public void setInsuranceExtraFee(InsuranceExtraFeeType value) {
        this.insuranceExtraFee = value;
    }

    /**
     * Gets the value of the deliveryFee property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryFeeType }
     *     
     */
    public DeliveryFeeType getDeliveryFee() {
        return deliveryFee;
    }

    /**
     * Sets the value of the deliveryFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryFeeType }
     *     
     */
    public void setDeliveryFee(DeliveryFeeType value) {
        this.deliveryFee = value;
    }

    /**
     * Gets the value of the paymentFee property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFeeType }
     *     
     */
    public PaymentFeeType getPaymentFee() {
        return paymentFee;
    }

    /**
     * Sets the value of the paymentFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFeeType }
     *     
     */
    public void setPaymentFee(PaymentFeeType value) {
        this.paymentFee = value;
    }

    /**
     * Gets the value of the airlineOBFee property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineOBFeeType }
     *     
     */
    public AirlineOBFeeType getAirlineOBFee() {
        return airlineOBFee;
    }

    /**
     * Sets the value of the airlineOBFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineOBFeeType }
     *     
     */
    public void setAirlineOBFee(AirlineOBFeeType value) {
        this.airlineOBFee = value;
    }

    /**
     * Gets the value of the ancillaryFee property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryFeeType }
     *     
     */
    public AncillaryFeeType getAncillaryFee() {
        return ancillaryFee;
    }

    /**
     * Sets the value of the ancillaryFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryFeeType }
     *     
     */
    public void setAncillaryFee(AncillaryFeeType value) {
        this.ancillaryFee = value;
    }

    /**
     * Gets the value of the ccobFee property.
     * 
     * @return
     *     possible object is
     *     {@link CCOBFeeType }
     *     
     */
    public CCOBFeeType getCCOBFee() {
        return ccobFee;
    }

    /**
     * Sets the value of the ccobFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCOBFeeType }
     *     
     */
    public void setCCOBFee(CCOBFeeType value) {
        this.ccobFee = value;
    }

    /**
     * Gets the value of the otherExtraCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherExtraCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherExtraCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherExtraCostType }
     * 
     * 
     */
    public List<OtherExtraCostType> getOtherExtraCost() {
        if (otherExtraCost == null) {
            otherExtraCost = new ArrayList<OtherExtraCostType>();
        }
        return this.otherExtraCost;
    }

}
