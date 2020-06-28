
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ArrayOfOTA_HotelAvailRSRoomStaysRoomStay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOTA_HotelAvailRSRoomStaysRoomStay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}RoomStayType">
 *                 &lt;sequence>
 *                   &lt;element name="Reference" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
 *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ServiceRPHs" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="AvailabilityStatus" type="{http://epowerv5.amadeus.com.tr/WS}RateIndicatorType" />
 *                 &lt;attribute name="ResponseType" default="PropertyList">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="PropertyList"/>
 *                       &lt;enumeration value="AreaList"/>
 *                       &lt;enumeration value="PropertyRateList"/>
 *                       &lt;enumeration value="RateInfoDetails"/>
 *                       &lt;enumeration value="ProfilePrefs"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
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
@XmlType(name = "ArrayOfOTA_HotelAvailRSRoomStaysRoomStay", propOrder = {
    "roomStay"
})
public class ArrayOfOTAHotelAvailRSRoomStaysRoomStay {

    @XmlElement(name = "RoomStay")
    protected List<ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay> roomStay;

    /**
     * Gets the value of the roomStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay }
     * 
     * 
     */
    public List<ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay> getRoomStay() {
        if (roomStay == null) {
            roomStay = new ArrayList<ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay>();
        }
        return this.roomStay;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}RoomStayType">
     *       &lt;sequence>
     *         &lt;element name="Reference" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
     *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ServiceRPHs" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="AvailabilityStatus" type="{http://epowerv5.amadeus.com.tr/WS}RateIndicatorType" />
     *       &lt;attribute name="ResponseType" default="PropertyList">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="PropertyList"/>
     *             &lt;enumeration value="AreaList"/>
     *             &lt;enumeration value="PropertyRateList"/>
     *             &lt;enumeration value="RateInfoDetails"/>
     *             &lt;enumeration value="ProfilePrefs"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reference",
        "serviceRPHs"
    })
    public static class RoomStay
        extends RoomStayType
    {

        @XmlElement(name = "Reference")
        protected ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay.Reference reference;
        @XmlElement(name = "ServiceRPHs")
        protected ArrayOfServiceRPHsTypeServiceRPH serviceRPHs;
        @XmlAttribute(name = "RoomID")
        protected String roomID;
        @XmlAttribute(name = "IsAlternate")
        protected Boolean isAlternate;
        @XmlAttribute(name = "AvailabilityStatus")
        protected RateIndicatorType availabilityStatus;
        @XmlAttribute(name = "ResponseType")
        protected String responseType;
        @XmlAttribute(name = "RoomStayCandidateRPH")
        protected String roomStayCandidateRPH;
        @XmlAttribute(name = "MoreDataEchoToken")
        protected String moreDataEchoToken;
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "AvailableIndicator")
        protected Boolean availableIndicator;

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay.Reference }
         *     
         */
        public ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay.Reference getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay.Reference }
         *     
         */
        public void setReference(ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay.Reference value) {
            this.reference = value;
        }

        /**
         * Gets the value of the serviceRPHs property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfServiceRPHsTypeServiceRPH }
         *     
         */
        public ArrayOfServiceRPHsTypeServiceRPH getServiceRPHs() {
            return serviceRPHs;
        }

        /**
         * Sets the value of the serviceRPHs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfServiceRPHsTypeServiceRPH }
         *     
         */
        public void setServiceRPHs(ArrayOfServiceRPHsTypeServiceRPH value) {
            this.serviceRPHs = value;
        }

        /**
         * Gets the value of the roomID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomID() {
            return roomID;
        }

        /**
         * Sets the value of the roomID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomID(String value) {
            this.roomID = value;
        }

        /**
         * Gets the value of the isAlternate property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isIsAlternate() {
            if (isAlternate == null) {
                return false;
            } else {
                return isAlternate;
            }
        }

        /**
         * Sets the value of the isAlternate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsAlternate(Boolean value) {
            this.isAlternate = value;
        }

        /**
         * Gets the value of the availabilityStatus property.
         * 
         * @return
         *     possible object is
         *     {@link RateIndicatorType }
         *     
         */
        public RateIndicatorType getAvailabilityStatus() {
            return availabilityStatus;
        }

        /**
         * Sets the value of the availabilityStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link RateIndicatorType }
         *     
         */
        public void setAvailabilityStatus(RateIndicatorType value) {
            this.availabilityStatus = value;
        }

        /**
         * Gets the value of the responseType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseType() {
            if (responseType == null) {
                return "PropertyList";
            } else {
                return responseType;
            }
        }

        /**
         * Sets the value of the responseType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseType(String value) {
            this.responseType = value;
        }

        /**
         * Gets the value of the roomStayCandidateRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomStayCandidateRPH() {
            return roomStayCandidateRPH;
        }

        /**
         * Sets the value of the roomStayCandidateRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomStayCandidateRPH(String value) {
            this.roomStayCandidateRPH = value;
        }

        /**
         * Gets the value of the moreDataEchoToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoreDataEchoToken() {
            return moreDataEchoToken;
        }

        /**
         * Sets the value of the moreDataEchoToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoreDataEchoToken(String value) {
            this.moreDataEchoToken = value;
        }

        /**
         * Gets the value of the infoSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * Sets the value of the infoSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the availableIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailableIndicator() {
            return availableIndicator;
        }

        /**
         * Sets the value of the availableIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailableIndicator(Boolean value) {
            this.availableIndicator = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
         *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Reference
            extends UniqueIDType
        {

            @XmlAttribute(name = "DateTime")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dateTime;

            /**
             * Gets the value of the dateTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateTime() {
                return dateTime;
            }

            /**
             * Sets the value of the dateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateTime(XMLGregorianCalendar value) {
                this.dateTime = value;
            }

        }

    }

}
