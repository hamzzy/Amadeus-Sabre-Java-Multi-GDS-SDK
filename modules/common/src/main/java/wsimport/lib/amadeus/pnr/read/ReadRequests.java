
package wsimport.lib.amadeus.pnr.read;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReadRequest" type="{http://traveltalk.com/wsPNRRead}ReadRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GlobalReservationReadRequest" type="{http://traveltalk.com/wsPNRRead}GlobalReservationReadRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelReadRequest" type="{http://traveltalk.com/wsPNRRead}HotelReadRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirReadRequest" type="{http://traveltalk.com/wsPNRRead}AirReadRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PkgReadRequest" type="{http://traveltalk.com/wsPNRRead}PkgReadRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GolfReadRequest" type="{http://traveltalk.com/wsPNRRead}GolfReadRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VehicleReadRequest" type="{http://traveltalk.com/wsPNRRead}VehicleReadRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadRequests", propOrder = {
    "readRequest",
    "globalReservationReadRequest",
    "hotelReadRequest",
    "airReadRequest",
    "pkgReadRequest",
    "golfReadRequest",
    "vehicleReadRequest"
})
public class ReadRequests {

    @XmlElement(name = "ReadRequest")
    protected List<ReadRequest> readRequest;
    @XmlElement(name = "GlobalReservationReadRequest")
    protected List<GlobalReservationReadRequest> globalReservationReadRequest;
    @XmlElement(name = "HotelReadRequest")
    protected List<HotelReadRequest> hotelReadRequest;
    @XmlElement(name = "AirReadRequest")
    protected List<AirReadRequest> airReadRequest;
    @XmlElement(name = "PkgReadRequest")
    protected List<PkgReadRequest> pkgReadRequest;
    @XmlElement(name = "GolfReadRequest")
    protected List<GolfReadRequest> golfReadRequest;
    @XmlElement(name = "VehicleReadRequest")
    protected List<VehicleReadRequest> vehicleReadRequest;

    /**
     * Gets the value of the readRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadRequest }
     * 
     * 
     */
    public List<ReadRequest> getReadRequest() {
        if (readRequest == null) {
            readRequest = new ArrayList<ReadRequest>();
        }
        return this.readRequest;
    }

    /**
     * Gets the value of the globalReservationReadRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalReservationReadRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalReservationReadRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalReservationReadRequest }
     * 
     * 
     */
    public List<GlobalReservationReadRequest> getGlobalReservationReadRequest() {
        if (globalReservationReadRequest == null) {
            globalReservationReadRequest = new ArrayList<GlobalReservationReadRequest>();
        }
        return this.globalReservationReadRequest;
    }

    /**
     * Gets the value of the hotelReadRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReadRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReadRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReadRequest }
     * 
     * 
     */
    public List<HotelReadRequest> getHotelReadRequest() {
        if (hotelReadRequest == null) {
            hotelReadRequest = new ArrayList<HotelReadRequest>();
        }
        return this.hotelReadRequest;
    }

    /**
     * Gets the value of the airReadRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airReadRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirReadRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirReadRequest }
     * 
     * 
     */
    public List<AirReadRequest> getAirReadRequest() {
        if (airReadRequest == null) {
            airReadRequest = new ArrayList<AirReadRequest>();
        }
        return this.airReadRequest;
    }

    /**
     * Gets the value of the pkgReadRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pkgReadRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPkgReadRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PkgReadRequest }
     * 
     * 
     */
    public List<PkgReadRequest> getPkgReadRequest() {
        if (pkgReadRequest == null) {
            pkgReadRequest = new ArrayList<PkgReadRequest>();
        }
        return this.pkgReadRequest;
    }

    /**
     * Gets the value of the golfReadRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the golfReadRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGolfReadRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GolfReadRequest }
     * 
     * 
     */
    public List<GolfReadRequest> getGolfReadRequest() {
        if (golfReadRequest == null) {
            golfReadRequest = new ArrayList<GolfReadRequest>();
        }
        return this.golfReadRequest;
    }

    /**
     * Gets the value of the vehicleReadRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleReadRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleReadRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleReadRequest }
     * 
     * 
     */
    public List<VehicleReadRequest> getVehicleReadRequest() {
        if (vehicleReadRequest == null) {
            vehicleReadRequest = new ArrayList<VehicleReadRequest>();
        }
        return this.vehicleReadRequest;
    }

}
