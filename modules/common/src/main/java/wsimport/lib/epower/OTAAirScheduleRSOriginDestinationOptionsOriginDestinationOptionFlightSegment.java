
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OTA_AirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}FlightSegmentType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://epowerv5.amadeus.com.tr/WS}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MarketingCabin" type="{http://epowerv5.amadeus.com.tr/WS}MarketingCabinType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DaysOfOperation" type="{http://epowerv5.amadeus.com.tr/WS}OperationSchedulesType" minOccurs="0"/>
 *         &lt;element name="BookingClass" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentBookingClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrafficRestrictionInfo" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentTrafficRestrictionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="JourneyDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OnTimeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ScheduleValidStartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ScheduleValidEndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ParticipationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateChangeNbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FLIFO_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment", propOrder = {
    "comment",
    "marketingCabin",
    "daysOfOperation",
    "bookingClass",
    "trafficRestrictionInfo"
})
public class OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment
    extends FlightSegmentType
{

    @XmlElement(name = "Comment")
    protected List<FreeTextType> comment;
    @XmlElement(name = "MarketingCabin")
    protected List<MarketingCabinType> marketingCabin;
    @XmlElement(name = "DaysOfOperation")
    protected OperationSchedulesType daysOfOperation;
    @XmlElement(name = "BookingClass")
    protected List<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentBookingClass> bookingClass;
    @XmlElement(name = "TrafficRestrictionInfo")
    protected List<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentTrafficRestrictionInfo> trafficRestrictionInfo;
    @XmlAttribute(name = "JourneyDuration")
    protected Duration journeyDuration;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "OnTimeRate")
    protected BigDecimal onTimeRate;
    @XmlAttribute(name = "ScheduleValidStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleValidStartDate;
    @XmlAttribute(name = "ScheduleValidEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleValidEndDate;
    @XmlAttribute(name = "ParticipationLevelCode")
    protected String participationLevelCode;
    @XmlAttribute(name = "DateChangeNbr")
    protected String dateChangeNbr;
    @XmlAttribute(name = "FLIFO_Ind")
    protected Boolean flifoInd;

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

    /**
     * Gets the value of the marketingCabin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingCabin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingCabin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingCabinType }
     * 
     * 
     */
    public List<MarketingCabinType> getMarketingCabin() {
        if (marketingCabin == null) {
            marketingCabin = new ArrayList<MarketingCabinType>();
        }
        return this.marketingCabin;
    }

    /**
     * Gets the value of the daysOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationSchedulesType }
     *     
     */
    public OperationSchedulesType getDaysOfOperation() {
        return daysOfOperation;
    }

    /**
     * Sets the value of the daysOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSchedulesType }
     *     
     */
    public void setDaysOfOperation(OperationSchedulesType value) {
        this.daysOfOperation = value;
    }

    /**
     * Gets the value of the bookingClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentBookingClass }
     * 
     * 
     */
    public List<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentBookingClass> getBookingClass() {
        if (bookingClass == null) {
            bookingClass = new ArrayList<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentBookingClass>();
        }
        return this.bookingClass;
    }

    /**
     * Gets the value of the trafficRestrictionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficRestrictionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficRestrictionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentTrafficRestrictionInfo }
     * 
     * 
     */
    public List<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentTrafficRestrictionInfo> getTrafficRestrictionInfo() {
        if (trafficRestrictionInfo == null) {
            trafficRestrictionInfo = new ArrayList<OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentTrafficRestrictionInfo>();
        }
        return this.trafficRestrictionInfo;
    }

    /**
     * Gets the value of the journeyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getJourneyDuration() {
        return journeyDuration;
    }

    /**
     * Sets the value of the journeyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setJourneyDuration(Duration value) {
        this.journeyDuration = value;
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
     * Gets the value of the onTimeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnTimeRate() {
        return onTimeRate;
    }

    /**
     * Sets the value of the onTimeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnTimeRate(BigDecimal value) {
        this.onTimeRate = value;
    }

    /**
     * Gets the value of the scheduleValidStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleValidStartDate() {
        return scheduleValidStartDate;
    }

    /**
     * Sets the value of the scheduleValidStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleValidStartDate(XMLGregorianCalendar value) {
        this.scheduleValidStartDate = value;
    }

    /**
     * Gets the value of the scheduleValidEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleValidEndDate() {
        return scheduleValidEndDate;
    }

    /**
     * Sets the value of the scheduleValidEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleValidEndDate(XMLGregorianCalendar value) {
        this.scheduleValidEndDate = value;
    }

    /**
     * Gets the value of the participationLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipationLevelCode() {
        return participationLevelCode;
    }

    /**
     * Sets the value of the participationLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipationLevelCode(String value) {
        this.participationLevelCode = value;
    }

    /**
     * Gets the value of the dateChangeNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateChangeNbr() {
        return dateChangeNbr;
    }

    /**
     * Sets the value of the dateChangeNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateChangeNbr(String value) {
        this.dateChangeNbr = value;
    }

    /**
     * Gets the value of the flifoInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFLIFOInd() {
        return flifoInd;
    }

    /**
     * Sets the value of the flifoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFLIFOInd(Boolean value) {
        this.flifoInd = value;
    }

}
