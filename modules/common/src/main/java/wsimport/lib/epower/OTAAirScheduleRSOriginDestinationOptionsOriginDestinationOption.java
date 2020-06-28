
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirScheduleRSOriginDestinationOptionsOriginDestinationOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirScheduleRSOriginDestinationOptionsOriginDestinationOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeTableAvailableDates" type="{http://epowerv5.amadeus.com.tr/WS}AvailableDate" minOccurs="0"/>
 *         &lt;element name="FlightSegment" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://epowerv5.amadeus.com.tr/WS}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirScheduleRSOriginDestinationOptionsOriginDestinationOption", propOrder = {
    "timeTableAvailableDates",
    "flightSegment",
    "comment"
})
public class OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOption {

    @XmlElement(name = "TimeTableAvailableDates")
    protected AvailableDate timeTableAvailableDates;
    @XmlElement(name = "FlightSegment")
    protected List<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment> flightSegment;
    @XmlElement(name = "Comment")
    protected List<FreeTextType> comment;

    /**
     * Gets the value of the timeTableAvailableDates property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableDate }
     *     
     */
    public AvailableDate getTimeTableAvailableDates() {
        return timeTableAvailableDates;
    }

    /**
     * Sets the value of the timeTableAvailableDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableDate }
     *     
     */
    public void setTimeTableAvailableDates(AvailableDate value) {
        this.timeTableAvailableDates = value;
    }

    /**
     * Gets the value of the flightSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment }
     * 
     * 
     */
    public List<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment> getFlightSegment() {
        if (flightSegment == null) {
            flightSegment = new ArrayList<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment>();
        }
        return this.flightSegment;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getComment() {
        if (comment == null) {
            comment = new ArrayList<FreeTextType>();
        }
        return this.comment;
    }

}
