
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrefCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrefCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommonPref" type="{http://traveltalk.com/wsHotelAvail}CommonPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VehicleRentalPref" type="{http://traveltalk.com/wsHotelAvail}VehicleRentalPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirlinePref" type="{http://traveltalk.com/wsHotelAvail}AirlinePref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelPref" type="{http://traveltalk.com/wsHotelAvail}HotelPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherSrvcPref" type="{http://traveltalk.com/wsHotelAvail}OtherSrvcPref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}PrefCollectionShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}PrefCollectionShareMarketInd" />
 *       &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefCollection", propOrder = {
    "commonPref",
    "vehicleRentalPref",
    "airlinePref",
    "hotelPref",
    "otherSrvcPref"
})
public class PrefCollection {

    @XmlElement(name = "CommonPref")
    protected List<CommonPref> commonPref;
    @XmlElement(name = "VehicleRentalPref")
    protected List<VehicleRentalPref> vehicleRentalPref;
    @XmlElement(name = "AirlinePref")
    protected List<AirlinePref> airlinePref;
    @XmlElement(name = "HotelPref")
    protected List<HotelPref> hotelPref;
    @XmlElement(name = "OtherSrvcPref")
    protected List<OtherSrvcPref> otherSrvcPref;
    @XmlAttribute(name = "ShareSynchInd")
    protected PrefCollectionShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected PrefCollectionShareMarketInd shareMarketInd;
    @XmlAttribute(name = "TravelPurpose")
    protected String travelPurpose;

    /**
     * Gets the value of the commonPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonPref }
     * 
     * 
     */
    public List<CommonPref> getCommonPref() {
        if (commonPref == null) {
            commonPref = new ArrayList<CommonPref>();
        }
        return this.commonPref;
    }

    /**
     * Gets the value of the vehicleRentalPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRentalPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRentalPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalPref }
     * 
     * 
     */
    public List<VehicleRentalPref> getVehicleRentalPref() {
        if (vehicleRentalPref == null) {
            vehicleRentalPref = new ArrayList<VehicleRentalPref>();
        }
        return this.vehicleRentalPref;
    }

    /**
     * Gets the value of the airlinePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlinePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlinePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePref }
     * 
     * 
     */
    public List<AirlinePref> getAirlinePref() {
        if (airlinePref == null) {
            airlinePref = new ArrayList<AirlinePref>();
        }
        return this.airlinePref;
    }

    /**
     * Gets the value of the hotelPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelPref }
     * 
     * 
     */
    public List<HotelPref> getHotelPref() {
        if (hotelPref == null) {
            hotelPref = new ArrayList<HotelPref>();
        }
        return this.hotelPref;
    }

    /**
     * Gets the value of the otherSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherSrvcPref }
     * 
     * 
     */
    public List<OtherSrvcPref> getOtherSrvcPref() {
        if (otherSrvcPref == null) {
            otherSrvcPref = new ArrayList<OtherSrvcPref>();
        }
        return this.otherSrvcPref;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link PrefCollectionShareSynchInd }
     *     
     */
    public PrefCollectionShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefCollectionShareSynchInd }
     *     
     */
    public void setShareSynchInd(PrefCollectionShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link PrefCollectionShareMarketInd }
     *     
     */
    public PrefCollectionShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefCollectionShareMarketInd }
     *     
     */
    public void setShareMarketInd(PrefCollectionShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the travelPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPurpose() {
        return travelPurpose;
    }

    /**
     * Sets the value of the travelPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelPurpose(String value) {
        this.travelPurpose = value;
    }

}
