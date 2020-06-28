
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirScheduleRSAirItinerariesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirScheduleRSAirItinerariesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirItinerary" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRSAirItineraryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MyProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirScheduleRSAirItinerariesType", propOrder = {
    "airItinerary",
    "myProperty"
})
public class OTAAirScheduleRSAirItinerariesType {

    @XmlElement(name = "AirItinerary")
    protected List<OTAAirScheduleRSAirItineraryType> airItinerary;
    @XmlElement(name = "MyProperty")
    protected String myProperty;

    /**
     * Gets the value of the airItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAAirScheduleRSAirItineraryType }
     * 
     * 
     */
    public List<OTAAirScheduleRSAirItineraryType> getAirItinerary() {
        if (airItinerary == null) {
            airItinerary = new ArrayList<OTAAirScheduleRSAirItineraryType>();
        }
        return this.airItinerary;
    }

    /**
     * Gets the value of the myProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyProperty() {
        return myProperty;
    }

    /**
     * Sets the value of the myProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyProperty(String value) {
        this.myProperty = value;
    }

}
