
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirScheduleRSAirItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirScheduleRSAirItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirITIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OriginDestinationOptions" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRSOriginDestinationOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirScheduleRSAirItineraryType", propOrder = {
    "airITIndex",
    "originDestinationOptions"
})
public class OTAAirScheduleRSAirItineraryType {

    @XmlElement(name = "AirITIndex")
    protected int airITIndex;
    @XmlElement(name = "OriginDestinationOptions")
    protected OTAAirScheduleRSOriginDestinationOptions originDestinationOptions;

    /**
     * Gets the value of the airITIndex property.
     * 
     */
    public int getAirITIndex() {
        return airITIndex;
    }

    /**
     * Sets the value of the airITIndex property.
     * 
     */
    public void setAirITIndex(int value) {
        this.airITIndex = value;
    }

    /**
     * Gets the value of the originDestinationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirScheduleRSOriginDestinationOptions }
     *     
     */
    public OTAAirScheduleRSOriginDestinationOptions getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    /**
     * Sets the value of the originDestinationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirScheduleRSOriginDestinationOptions }
     *     
     */
    public void setOriginDestinationOptions(OTAAirScheduleRSOriginDestinationOptions value) {
        this.originDestinationOptions = value;
    }

}
