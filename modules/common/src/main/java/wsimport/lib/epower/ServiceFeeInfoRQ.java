
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFeeInfoRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeeInfoRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}GenericFlightRQ">
 *       &lt;sequence>
 *         &lt;element name="FlightInfo" type="{http://epowerv5.amadeus.com.tr/WS}ServiceFeeInfoRQFlightInfo" minOccurs="0"/>
 *         &lt;element name="HotelInfo" type="{http://epowerv5.amadeus.com.tr/WS}ServiceFeeInfoRQHotelInfo" minOccurs="0"/>
 *         &lt;element name="CarInfo" type="{http://epowerv5.amadeus.com.tr/WS}ServiceFeeInfoRQCarInfo" minOccurs="0"/>
 *         &lt;element name="InsuranceInfo" type="{http://epowerv5.amadeus.com.tr/WS}ServiceFeeInfoRQInsuranceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeeInfoRQ", propOrder = {
    "flightInfo",
    "hotelInfo",
    "carInfo",
    "insuranceInfo"
})
@XmlSeeAlso({
    PriceInfoRQ.class,
    BaggageInfoRQ.class
})
public class ServiceFeeInfoRQ
    extends GenericFlightRQ
{

    @XmlElement(name = "FlightInfo")
    protected ServiceFeeInfoRQFlightInfo flightInfo;
    @XmlElement(name = "HotelInfo")
    protected ServiceFeeInfoRQHotelInfo hotelInfo;
    @XmlElement(name = "CarInfo")
    protected ServiceFeeInfoRQCarInfo carInfo;
    @XmlElement(name = "InsuranceInfo")
    protected ServiceFeeInfoRQInsuranceInfo insuranceInfo;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the flightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeInfoRQFlightInfo }
     *     
     */
    public ServiceFeeInfoRQFlightInfo getFlightInfo() {
        return flightInfo;
    }

    /**
     * Sets the value of the flightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeInfoRQFlightInfo }
     *     
     */
    public void setFlightInfo(ServiceFeeInfoRQFlightInfo value) {
        this.flightInfo = value;
    }

    /**
     * Gets the value of the hotelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeInfoRQHotelInfo }
     *     
     */
    public ServiceFeeInfoRQHotelInfo getHotelInfo() {
        return hotelInfo;
    }

    /**
     * Sets the value of the hotelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeInfoRQHotelInfo }
     *     
     */
    public void setHotelInfo(ServiceFeeInfoRQHotelInfo value) {
        this.hotelInfo = value;
    }

    /**
     * Gets the value of the carInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeInfoRQCarInfo }
     *     
     */
    public ServiceFeeInfoRQCarInfo getCarInfo() {
        return carInfo;
    }

    /**
     * Sets the value of the carInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeInfoRQCarInfo }
     *     
     */
    public void setCarInfo(ServiceFeeInfoRQCarInfo value) {
        this.carInfo = value;
    }

    /**
     * Gets the value of the insuranceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeInfoRQInsuranceInfo }
     *     
     */
    public ServiceFeeInfoRQInsuranceInfo getInsuranceInfo() {
        return insuranceInfo;
    }

    /**
     * Sets the value of the insuranceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeInfoRQInsuranceInfo }
     *     
     */
    public void setInsuranceInfo(ServiceFeeInfoRQInsuranceInfo value) {
        this.insuranceInfo = value;
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

}
