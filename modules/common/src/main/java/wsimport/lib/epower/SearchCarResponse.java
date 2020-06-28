package wsimport.lib.epower;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="OTA_VehAvailRateRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehAvailRateRS" minOccurs="0"/>
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
    "otaVehAvailRateRS"
})
@XmlRootElement(name = "SearchCarResponse")
public class SearchCarResponse {

    @XmlElement(name = "OTA_VehAvailRateRS")
    protected OTAVehAvailRateRS otaVehAvailRateRS;

    @XmlTransient
    protected String sessionId;

    /**
     * Gets the value of the otaVehAvailRateRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehAvailRateRS }
     *      public static Airports getAirport(String airCode) {
    //        models.Airports airport = models.Airports.find.where().eq("air_code", airCode.toUpperCase()).findUnique();
    //        if (airport != null) {
    //            return new Airports(airport.getAirCode(), airport.getAirportName(), airport.getCountryName(), airport.getCountryCode(), airport.getCity(), airport.getCity(), airport.getState());
    //        } else {
    return AirportCityGetter.findAirport(airCode).isDefined() ? AirportCityGetter.findAirport(airCode).get() : new Airports();
    //        }
    }
     */
    public OTAVehAvailRateRS getOTAVehAvailRateRS() {
        return otaVehAvailRateRS;
    }

    /**
     * Sets the value of the otaVehAvailRateRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehAvailRateRS }
     *     
     */
    public void setOTAVehAvailRateRS(OTAVehAvailRateRS value) {
        this.otaVehAvailRateRS = value;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
