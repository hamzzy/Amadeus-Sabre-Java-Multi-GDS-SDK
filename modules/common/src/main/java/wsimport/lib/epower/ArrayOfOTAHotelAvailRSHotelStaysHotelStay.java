
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOTA_HotelAvailRSHotelStaysHotelStay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOTA_HotelAvailRSHotelStaysHotelStay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OTA_HotelAvailRSHotelStaysHotelStay" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Availability" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="RestrictionType">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="MinLOS"/>
 *                                           &lt;enumeration value="MaxLOS"/>
 *                                           &lt;enumeration value="FixedLOS"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="TimeUnit" type="{http://epowerv5.amadeus.com.tr/WS}TimeUnitType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Status" use="required" type="{http://epowerv5.amadeus.com.tr/WS}AvailabilityStatusType" />
 *                           &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BasicPropertyInfo" type="{http://epowerv5.amadeus.com.tr/WS}BasicPropertyInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RoomStayRPH">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOTA_HotelAvailRSHotelStaysHotelStay", propOrder = {
    "otaHotelAvailRSHotelStaysHotelStay"
})
public class ArrayOfOTAHotelAvailRSHotelStaysHotelStay {

    @XmlElement(name = "OTA_HotelAvailRSHotelStaysHotelStay", nillable = true)
    protected List<ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay> otaHotelAvailRSHotelStaysHotelStay;

    /**
     * Gets the value of the otaHotelAvailRSHotelStaysHotelStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otaHotelAvailRSHotelStaysHotelStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOTAHotelAvailRSHotelStaysHotelStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay }
     * 
     * 
     */
    public List<ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay> getOTAHotelAvailRSHotelStaysHotelStay() {
        if (otaHotelAvailRSHotelStaysHotelStay == null) {
            otaHotelAvailRSHotelStaysHotelStay = new ArrayList<ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay>();
        }
        return this.otaHotelAvailRSHotelStaysHotelStay;
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
     *       &lt;sequence>
     *         &lt;element name="Availability" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="RestrictionType">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="MinLOS"/>
     *                                 &lt;enumeration value="MaxLOS"/>
     *                                 &lt;enumeration value="FixedLOS"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="TimeUnit" type="{http://epowerv5.amadeus.com.tr/WS}TimeUnitType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Status" use="required" type="{http://epowerv5.amadeus.com.tr/WS}AvailabilityStatusType" />
     *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BasicPropertyInfo" type="{http://epowerv5.amadeus.com.tr/WS}BasicPropertyInfoType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RoomStayRPH">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "availability",
        "basicPropertyInfo"
    })
    public static class OTAHotelAvailRSHotelStaysHotelStay {

        @XmlElement(name = "Availability")
        protected List<ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability> availability;
        @XmlElement(name = "BasicPropertyInfo")
        protected BasicPropertyInfoType basicPropertyInfo;
        @XmlAttribute(name = "RoomStayRPH")
        protected List<String> roomStayRPH;

        /**
         * Gets the value of the availability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability }
         * 
         * 
         */
        public List<ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability> getAvailability() {
            if (availability == null) {
                availability = new ArrayList<ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability>();
            }
            return this.availability;
        }

        /**
         * Gets the value of the basicPropertyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link BasicPropertyInfoType }
         *     
         */
        public BasicPropertyInfoType getBasicPropertyInfo() {
            return basicPropertyInfo;
        }

        /**
         * Sets the value of the basicPropertyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BasicPropertyInfoType }
         *     
         */
        public void setBasicPropertyInfo(BasicPropertyInfoType value) {
            this.basicPropertyInfo = value;
        }

        /**
         * Gets the value of the roomStayRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomStayRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomStayRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRoomStayRPH() {
            if (roomStayRPH == null) {
                roomStayRPH = new ArrayList<String>();
            }
            return this.roomStayRPH;
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
         *       &lt;sequence>
         *         &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="RestrictionType">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="MinLOS"/>
         *                       &lt;enumeration value="MaxLOS"/>
         *                       &lt;enumeration value="FixedLOS"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="TimeUnit" type="{http://epowerv5.amadeus.com.tr/WS}TimeUnitType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Status" use="required" type="{http://epowerv5.amadeus.com.tr/WS}AvailabilityStatusType" />
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "restriction"
        })
        public static class Availability {

            @XmlElement(name = "Restriction")
            protected List<ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability.Restriction> restriction;
            @XmlAttribute(name = "Status", required = true)
            protected AvailabilityStatusType status;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;

            /**
             * Gets the value of the restriction property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the restriction property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRestriction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability.Restriction }
             * 
             * 
             */
            public List<ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability.Restriction> getRestriction() {
                if (restriction == null) {
                    restriction = new ArrayList<ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability.Restriction>();
                }
                return this.restriction;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link AvailabilityStatusType }
             *     
             */
            public AvailabilityStatusType getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link AvailabilityStatusType }
             *     
             */
            public void setStatus(AvailabilityStatusType value) {
                this.status = value;
            }

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * Gets the value of the duration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
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
             *       &lt;attribute name="RestrictionType">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="MinLOS"/>
             *             &lt;enumeration value="MaxLOS"/>
             *             &lt;enumeration value="FixedLOS"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="TimeUnit" type="{http://epowerv5.amadeus.com.tr/WS}TimeUnitType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Restriction {

                @XmlAttribute(name = "RestrictionType")
                protected String restrictionType;
                @XmlAttribute(name = "Time")
                protected BigInteger time;
                @XmlAttribute(name = "TimeUnit")
                protected TimeUnitType timeUnit;

                /**
                 * Gets the value of the restrictionType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRestrictionType() {
                    return restrictionType;
                }

                /**
                 * Sets the value of the restrictionType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRestrictionType(String value) {
                    this.restrictionType = value;
                }

                /**
                 * Gets the value of the time property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTime() {
                    return time;
                }

                /**
                 * Sets the value of the time property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTime(BigInteger value) {
                    this.time = value;
                }

                /**
                 * Gets the value of the timeUnit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TimeUnitType }
                 *     
                 */
                public TimeUnitType getTimeUnit() {
                    return timeUnit;
                }

                /**
                 * Sets the value of the timeUnit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TimeUnitType }
                 *     
                 */
                public void setTimeUnit(TimeUnitType value) {
                    this.timeUnit = value;
                }

            }

        }

    }

}
