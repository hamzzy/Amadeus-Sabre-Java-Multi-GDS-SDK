
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BookFlightSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookFlightSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}FlightSegmentType">
 *       &lt;sequence>
 *         &lt;element name="MarriageGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingClassAvails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfBookFlightSegmentTypeBookingClassAvail" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://epowerv5.amadeus.com.tr/WS}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopLocation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" default="IATA" />
 *                 &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="E_TicketEligibility">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Eligible"/>
 *             &lt;enumeration value="Not Eligible"/>
 *             &lt;enumeration value="Required"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DepartureDay" type="{http://epowerv5.amadeus.com.tr/WS}DayOfWeekType" />
 *       &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ConnectionType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParticipationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="DateChangeNbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ValidConnectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookFlightSegmentType", propOrder = {
    "marriageGrp",
    "bookingClassAvails",
    "comment",
    "stopLocation"
})
@XmlSeeAlso({
    wsimport.lib.epower.OriginDestinationOptionType.FlightSegment.class,
    wsimport.lib.epower.PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg.class,
    wsimport.lib.epower.FailbackRS.FlightSegment.class
})
public class BookFlightSegmentType
    extends FlightSegmentType
{

    @XmlElement(name = "MarriageGrp")
    protected String marriageGrp;
    @XmlElement(name = "BookingClassAvails")
    protected ArrayOfBookFlightSegmentTypeBookingClassAvail bookingClassAvails;
    @XmlElement(name = "Comment")
    protected List<FreeTextType> comment;
    @XmlElement(name = "StopLocation")
    protected List<BookFlightSegmentType.StopLocation> stopLocation;
    @XmlAttribute(name = "ResBookDesigCode")
    protected String resBookDesigCode;
    @XmlAttribute(name = "NumberInParty")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberInParty;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "E_TicketEligibility")
    protected String eTicketEligibility;
    @XmlAttribute(name = "MealCode")
    protected String mealCode;
    @XmlAttribute(name = "DepartureDay")
    protected DayOfWeekType departureDay;
    @XmlAttribute(name = "StopoverInd")
    protected Boolean stopoverInd;
    @XmlAttribute(name = "LineNumber")
    protected BigInteger lineNumber;
    @XmlAttribute(name = "ConnectionType")
    protected String connectionType;
    @XmlAttribute(name = "ParticipationLevelCode")
    protected String participationLevelCode;
    @XmlAttribute(name = "Distance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distance;
    @XmlAttribute(name = "DateChangeNbr")
    protected String dateChangeNbr;
    @XmlAttribute(name = "ValidConnectionInd")
    protected Boolean validConnectionInd;

    /**
     * Gets the value of the marriageGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageGrp() {
        return marriageGrp;
    }

    /**
     * Sets the value of the marriageGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageGrp(String value) {
        this.marriageGrp = value;
    }

    /**
     * Gets the value of the bookingClassAvails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBookFlightSegmentTypeBookingClassAvail }
     *     
     */
    public ArrayOfBookFlightSegmentTypeBookingClassAvail getBookingClassAvails() {
        return bookingClassAvails;
    }

    /**
     * Sets the value of the bookingClassAvails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBookFlightSegmentTypeBookingClassAvail }
     *     
     */
    public void setBookingClassAvails(ArrayOfBookFlightSegmentTypeBookingClassAvail value) {
        this.bookingClassAvails = value;
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

    /**
     * Gets the value of the stopLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookFlightSegmentType.StopLocation }
     * 
     * 
     */
    public List<BookFlightSegmentType.StopLocation> getStopLocation() {
        if (stopLocation == null) {
            stopLocation = new ArrayList<BookFlightSegmentType.StopLocation>();
        }
        return this.stopLocation;
    }

    /**
     * Gets the value of the resBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * Sets the value of the resBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
    }

    /**
     * Gets the value of the numberInParty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberInParty() {
        return numberInParty;
    }

    /**
     * Sets the value of the numberInParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberInParty(BigInteger value) {
        this.numberInParty = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the eTicketEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketEligibility() {
        return eTicketEligibility;
    }

    /**
     * Sets the value of the eTicketEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketEligibility(String value) {
        this.eTicketEligibility = value;
    }

    /**
     * Gets the value of the mealCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealCode() {
        return mealCode;
    }

    /**
     * Sets the value of the mealCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealCode(String value) {
        this.mealCode = value;
    }

    /**
     * Gets the value of the departureDay property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDepartureDay() {
        return departureDay;
    }

    /**
     * Sets the value of the departureDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDepartureDay(DayOfWeekType value) {
        this.departureDay = value;
    }

    /**
     * Gets the value of the stopoverInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopoverInd() {
        return stopoverInd;
    }

    /**
     * Sets the value of the stopoverInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopoverInd(Boolean value) {
        this.stopoverInd = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the connectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * Sets the value of the connectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionType(String value) {
        this.connectionType = value;
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
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
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
     * Gets the value of the validConnectionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidConnectionInd() {
        return validConnectionInd;
    }

    /**
     * Sets the value of the validConnectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidConnectionInd(Boolean value) {
        this.validConnectionInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" default="IATA" />
     *       &lt;attribute name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StopLocation {

        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "DepartureDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar departureDateTime;
        @XmlAttribute(name = "ArrivalDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar arrivalDateTime;

        /**
         * Gets the value of the locationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * Sets the value of the locationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            if (codeContext == null) {
                return "IATA";
            } else {
                return codeContext;
            }
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * Gets the value of the departureDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureDateTime() {
            return departureDateTime;
        }

        /**
         * Sets the value of the departureDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureDateTime(XMLGregorianCalendar value) {
            this.departureDateTime = value;
        }

        /**
         * Gets the value of the arrivalDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getArrivalDateTime() {
            return arrivalDateTime;
        }

        /**
         * Sets the value of the arrivalDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setArrivalDateTime(XMLGregorianCalendar value) {
            this.arrivalDateTime = value;
        }

    }

}
