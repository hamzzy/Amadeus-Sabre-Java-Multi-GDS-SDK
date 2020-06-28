
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlinePref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlinePref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" type="{http://traveltalk.com/wsHotelAvail}LoyaltyPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VendorPref" type="{http://traveltalk.com/wsHotelAvail}VendorPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://traveltalk.com/wsHotelAvail}PaymentFormPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirportOriginPref" type="{http://traveltalk.com/wsHotelAvail}AirportOriginPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirportRoutePref" type="{http://traveltalk.com/wsHotelAvail}AirportRoutePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareRestrictPref" type="{http://traveltalk.com/wsHotelAvail}FareRestrictPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightTypePref" type="{http://traveltalk.com/wsHotelAvail}FlightTypePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipPref" type="{http://traveltalk.com/wsHotelAvail}EquipPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CabinPref" type="{http://traveltalk.com/wsHotelAvail}CabinPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatPref" type="{http://traveltalk.com/wsHotelAvail}SeatPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TicketDistribPref" type="{http://traveltalk.com/wsHotelAvail}TicketDistribPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://traveltalk.com/wsHotelAvail}MealPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://traveltalk.com/wsHotelAvail}SpecRequestPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SSR_Pref" type="{http://traveltalk.com/wsHotelAvail}SSR_Pref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://traveltalk.com/wsHotelAvail}MediaEntertainPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://traveltalk.com/wsHotelAvail}PetInfoPref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}AirlinePrefShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}AirlinePrefShareMarketInd" />
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}AirlinePrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirTicketType" type="{http://traveltalk.com/wsHotelAvail}AirlinePrefAirTicketType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlinePref", propOrder = {
    "loyaltyPref",
    "vendorPref",
    "paymentFormPref",
    "airportOriginPref",
    "airportRoutePref",
    "fareRestrictPref",
    "flightTypePref",
    "equipPref",
    "cabinPref",
    "seatPref",
    "ticketDistribPref",
    "mealPref",
    "specRequestPref",
    "ssrPref",
    "mediaEntertainPref",
    "petInfoPref"
})
public class AirlinePref {

    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPref> loyaltyPref;
    @XmlElement(name = "VendorPref")
    protected List<VendorPref> vendorPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPref> paymentFormPref;
    @XmlElement(name = "AirportOriginPref")
    protected List<AirportOriginPref> airportOriginPref;
    @XmlElement(name = "AirportRoutePref")
    protected List<AirportRoutePref> airportRoutePref;
    @XmlElement(name = "FareRestrictPref")
    protected List<FareRestrictPref> fareRestrictPref;
    @XmlElement(name = "FlightTypePref")
    protected List<FlightTypePref> flightTypePref;
    @XmlElement(name = "EquipPref")
    protected List<EquipPref> equipPref;
    @XmlElement(name = "CabinPref")
    protected List<CabinPref> cabinPref;
    @XmlElement(name = "SeatPref")
    protected List<SeatPref> seatPref;
    @XmlElement(name = "TicketDistribPref")
    protected List<TicketDistribPref> ticketDistribPref;
    @XmlElement(name = "MealPref")
    protected List<MealPref> mealPref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPref> specRequestPref;
    @XmlElement(name = "SSR_Pref")
    protected List<SSRPref> ssrPref;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPref> mediaEntertainPref;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPref> petInfoPref;
    @XmlAttribute(name = "ShareSynchInd")
    protected AirlinePrefShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected AirlinePrefShareMarketInd shareMarketInd;
    @XmlAttribute(name = "PreferLevel")
    protected AirlinePrefPreferLevel preferLevel;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "AirTicketType")
    protected AirlinePrefAirTicketType airTicketType;

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPref }
     * 
     * 
     */
    public List<LoyaltyPref> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPref>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorPref }
     * 
     * 
     */
    public List<VendorPref> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<VendorPref>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPref }
     * 
     * 
     */
    public List<PaymentFormPref> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPref>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the airportOriginPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportOriginPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportOriginPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportOriginPref }
     * 
     * 
     */
    public List<AirportOriginPref> getAirportOriginPref() {
        if (airportOriginPref == null) {
            airportOriginPref = new ArrayList<AirportOriginPref>();
        }
        return this.airportOriginPref;
    }

    /**
     * Gets the value of the airportRoutePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportRoutePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportRoutePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportRoutePref }
     * 
     * 
     */
    public List<AirportRoutePref> getAirportRoutePref() {
        if (airportRoutePref == null) {
            airportRoutePref = new ArrayList<AirportRoutePref>();
        }
        return this.airportRoutePref;
    }

    /**
     * Gets the value of the fareRestrictPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRestrictPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestrictPref }
     * 
     * 
     */
    public List<FareRestrictPref> getFareRestrictPref() {
        if (fareRestrictPref == null) {
            fareRestrictPref = new ArrayList<FareRestrictPref>();
        }
        return this.fareRestrictPref;
    }

    /**
     * Gets the value of the flightTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightTypePref }
     * 
     * 
     */
    public List<FlightTypePref> getFlightTypePref() {
        if (flightTypePref == null) {
            flightTypePref = new ArrayList<FlightTypePref>();
        }
        return this.flightTypePref;
    }

    /**
     * Gets the value of the equipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipPref }
     * 
     * 
     */
    public List<EquipPref> getEquipPref() {
        if (equipPref == null) {
            equipPref = new ArrayList<EquipPref>();
        }
        return this.equipPref;
    }

    /**
     * Gets the value of the cabinPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinPref }
     * 
     * 
     */
    public List<CabinPref> getCabinPref() {
        if (cabinPref == null) {
            cabinPref = new ArrayList<CabinPref>();
        }
        return this.cabinPref;
    }

    /**
     * Gets the value of the seatPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatPref }
     * 
     * 
     */
    public List<SeatPref> getSeatPref() {
        if (seatPref == null) {
            seatPref = new ArrayList<SeatPref>();
        }
        return this.seatPref;
    }

    /**
     * Gets the value of the ticketDistribPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDistribPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDistribPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDistribPref }
     * 
     * 
     */
    public List<TicketDistribPref> getTicketDistribPref() {
        if (ticketDistribPref == null) {
            ticketDistribPref = new ArrayList<TicketDistribPref>();
        }
        return this.ticketDistribPref;
    }

    /**
     * Gets the value of the mealPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MealPref }
     * 
     * 
     */
    public List<MealPref> getMealPref() {
        if (mealPref == null) {
            mealPref = new ArrayList<MealPref>();
        }
        return this.mealPref;
    }

    /**
     * Gets the value of the specRequestPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specRequestPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecRequestPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecRequestPref }
     * 
     * 
     */
    public List<SpecRequestPref> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPref>();
        }
        return this.specRequestPref;
    }

    /**
     * Gets the value of the ssrPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRPref }
     * 
     * 
     */
    public List<SSRPref> getSSRPref() {
        if (ssrPref == null) {
            ssrPref = new ArrayList<SSRPref>();
        }
        return this.ssrPref;
    }

    /**
     * Gets the value of the mediaEntertainPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEntertainPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEntertainPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaEntertainPref }
     * 
     * 
     */
    public List<MediaEntertainPref> getMediaEntertainPref() {
        if (mediaEntertainPref == null) {
            mediaEntertainPref = new ArrayList<MediaEntertainPref>();
        }
        return this.mediaEntertainPref;
    }

    /**
     * Gets the value of the petInfoPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfoPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfoPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PetInfoPref }
     * 
     * 
     */
    public List<PetInfoPref> getPetInfoPref() {
        if (petInfoPref == null) {
            petInfoPref = new ArrayList<PetInfoPref>();
        }
        return this.petInfoPref;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link AirlinePrefShareSynchInd }
     *     
     */
    public AirlinePrefShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlinePrefShareSynchInd }
     *     
     */
    public void setShareSynchInd(AirlinePrefShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link AirlinePrefShareMarketInd }
     *     
     */
    public AirlinePrefShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlinePrefShareMarketInd }
     *     
     */
    public void setShareMarketInd(AirlinePrefShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AirlinePrefPreferLevel }
     *     
     */
    public AirlinePrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return AirlinePrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlinePrefPreferLevel }
     *     
     */
    public void setPreferLevel(AirlinePrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Gets the value of the airTicketType property.
     * 
     * @return
     *     possible object is
     *     {@link AirlinePrefAirTicketType }
     *     
     */
    public AirlinePrefAirTicketType getAirTicketType() {
        return airTicketType;
    }

    /**
     * Sets the value of the airTicketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlinePrefAirTicketType }
     *     
     */
    public void setAirTicketType(AirlinePrefAirTicketType value) {
        this.airTicketType = value;
    }

}
