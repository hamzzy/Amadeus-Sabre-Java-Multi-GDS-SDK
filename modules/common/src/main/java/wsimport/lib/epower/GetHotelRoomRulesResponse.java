
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="OTA_HotelAvailRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfWarningType" minOccurs="0"/>
 *                     &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *                     &lt;element name="HotelStays" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOTA_HotelAvailRSHotelStaysHotelStay" minOccurs="0"/>
 *                     &lt;element name="Profiles" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfProfilesTypeProfileInfo1" minOccurs="0"/>
 *                     &lt;element name="Criteria" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfHotelSearchCriterionType" minOccurs="0"/>
 *                     &lt;element name="Services" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfServicesTypeService1" minOccurs="0"/>
 *                     &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *                     &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *                     &lt;element name="Areas" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAreasTypeArea" minOccurs="0"/>
 *                     &lt;element name="RoomStays" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}RoomStayType">
 *                                       &lt;sequence>
 *                                         &lt;element name="Reference" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
 *                                                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="ServiceRPHs" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                       &lt;attribute name="AvailabilityStatus" type="{http://epowerv5.amadeus.com.tr/WS}RateIndicatorType" />
 *                                       &lt;attribute name="ResponseType" default="PropertyList">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="PropertyList"/>
 *                                             &lt;enumeration value="AreaList"/>
 *                                             &lt;enumeration value="PropertyRateList"/>
 *                                             &lt;enumeration value="RateInfoDetails"/>
 *                                             &lt;enumeration value="ProfilePrefs"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Target" default="Production">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Test"/>
 *                       &lt;enumeration value="Production"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="TransactionStatusCode">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Start"/>
 *                       &lt;enumeration value="End"/>
 *                       &lt;enumeration value="Rollback"/>
 *                       &lt;enumeration value="InSeries"/>
 *                       &lt;enumeration value="Continuation"/>
 *                       &lt;enumeration value="Subsequent"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SearchCacheLevel">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Live"/>
 *                       &lt;enumeration value="VeryRecent"/>
 *                       &lt;enumeration value="LessRecent"/>
 *                     &lt;/restriction>
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
@XmlType(name = "", propOrder = {
    "otaHotelAvailRS"
})
@XmlRootElement(name = "GetHotelRoomRulesResponse")
public class GetHotelRoomRulesResponse {

    @XmlElement(name = "OTA_HotelAvailRS")
    protected GetHotelRoomRulesResponse.OTAHotelAvailRS otaHotelAvailRS;

    /**
     * Gets the value of the otaHotelAvailRS property.
     * 
     * @return
     *     possible object is
     *     {@link GetHotelRoomRulesResponse.OTAHotelAvailRS }
     *     
     */
    public GetHotelRoomRulesResponse.OTAHotelAvailRS getOTAHotelAvailRS() {
        return otaHotelAvailRS;
    }

    /**
     * Sets the value of the otaHotelAvailRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelRoomRulesResponse.OTAHotelAvailRS }
     *     
     */
    public void setOTAHotelAvailRS(GetHotelRoomRulesResponse.OTAHotelAvailRS value) {
        this.otaHotelAvailRS = value;
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
     *         &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfWarningType" minOccurs="0"/>
     *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
     *           &lt;element name="HotelStays" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOTA_HotelAvailRSHotelStaysHotelStay" minOccurs="0"/>
     *           &lt;element name="Profiles" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfProfilesTypeProfileInfo1" minOccurs="0"/>
     *           &lt;element name="Criteria" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfHotelSearchCriterionType" minOccurs="0"/>
     *           &lt;element name="Services" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfServicesTypeService1" minOccurs="0"/>
     *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
     *           &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
     *           &lt;element name="Areas" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAreasTypeArea" minOccurs="0"/>
     *           &lt;element name="RoomStays" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}RoomStayType">
     *                             &lt;sequence>
     *                               &lt;element name="Reference" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
     *                                       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                     &lt;/extension>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="ServiceRPHs" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfServiceRPHsTypeServiceRPH" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                             &lt;attribute name="AvailabilityStatus" type="{http://epowerv5.amadeus.com.tr/WS}RateIndicatorType" />
     *                             &lt;attribute name="ResponseType" default="PropertyList">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="PropertyList"/>
     *                                   &lt;enumeration value="AreaList"/>
     *                                   &lt;enumeration value="PropertyRateList"/>
     *                                   &lt;enumeration value="RateInfoDetails"/>
     *                                   &lt;enumeration value="ProfilePrefs"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                             &lt;attribute name="RoomStayCandidateRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="AvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;/extension>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                   &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Target" default="Production">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Test"/>
     *             &lt;enumeration value="Production"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="TransactionStatusCode">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Start"/>
     *             &lt;enumeration value="End"/>
     *             &lt;enumeration value="Rollback"/>
     *             &lt;enumeration value="InSeries"/>
     *             &lt;enumeration value="Continuation"/>
     *             &lt;enumeration value="Subsequent"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SearchCacheLevel">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Live"/>
     *             &lt;enumeration value="VeryRecent"/>
     *             &lt;enumeration value="LessRecent"/>
     *           &lt;/restriction>
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
        "pos",
        "warningsOrErrorsOrHotelStays"
    })
    public static class OTAHotelAvailRS {

        @XmlElement(name = "POS")
        protected ArrayOfSourceType pos;
        @XmlElements({
            @XmlElement(name = "Warnings", type = ArrayOfWarningType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "HotelStays", type = ArrayOfOTAHotelAvailRSHotelStaysHotelStay.class),
            @XmlElement(name = "Profiles", type = ArrayOfProfilesTypeProfileInfo1 .class),
            @XmlElement(name = "Criteria", type = ArrayOfHotelSearchCriterionType.class),
            @XmlElement(name = "Services", type = ArrayOfServicesTypeService1 .class),
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class),
            @XmlElement(name = "Areas", type = ArrayOfAreasTypeArea.class),
            @XmlElement(name = "RoomStays", type = GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.class)
        })
        protected List<Object> warningsOrErrorsOrHotelStays;
        @XmlAttribute(name = "EchoToken")
        protected String echoToken;
        @XmlAttribute(name = "TimeStamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timeStamp;
        @XmlAttribute(name = "Target")
        protected String target;
        @XmlAttribute(name = "Version", required = true)
        protected BigDecimal version;
        @XmlAttribute(name = "TransactionIdentifier")
        protected String transactionIdentifier;
        @XmlAttribute(name = "SequenceNmbr")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger sequenceNmbr;
        @XmlAttribute(name = "TransactionStatusCode")
        protected String transactionStatusCode;
        @XmlAttribute(name = "RetransmissionIndicator")
        protected Boolean retransmissionIndicator;
        @XmlAttribute(name = "SearchCacheLevel")
        protected String searchCacheLevel;

        /**
         * Gets the value of the pos property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSourceType }
         *     
         */
        public ArrayOfSourceType getPOS() {
            return pos;
        }

        /**
         * Sets the value of the pos property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSourceType }
         *     
         */
        public void setPOS(ArrayOfSourceType value) {
            this.pos = value;
        }

        /**
         * Gets the value of the warningsOrErrorsOrHotelStays property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warningsOrErrorsOrHotelStays property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarningsOrErrorsOrHotelStays().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfWarningType }
         * {@link ErrorsType }
         * {@link ArrayOfOTAHotelAvailRSHotelStaysHotelStay }
         * {@link ArrayOfProfilesTypeProfileInfo1 }
         * {@link ArrayOfHotelSearchCriterionType }
         * {@link ArrayOfServicesTypeService1 }
         * {@link SuccessType }
         * {@link TPAExtensionsType }
         * {@link ArrayOfAreasTypeArea }
         * {@link GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays }
         * 
         * 
         */
        public List<Object> getWarningsOrErrorsOrHotelStays() {
            if (warningsOrErrorsOrHotelStays == null) {
                warningsOrErrorsOrHotelStays = new ArrayList<Object>();
            }
            return this.warningsOrErrorsOrHotelStays;
        }

        /**
         * Gets the value of the echoToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEchoToken() {
            return echoToken;
        }

        /**
         * Sets the value of the echoToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEchoToken(String value) {
            this.echoToken = value;
        }

        /**
         * Gets the value of the timeStamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimeStamp() {
            return timeStamp;
        }

        /**
         * Sets the value of the timeStamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimeStamp(XMLGregorianCalendar value) {
            this.timeStamp = value;
        }

        /**
         * Gets the value of the target property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            if (target == null) {
                return "Production";
            } else {
                return target;
            }
        }

        /**
         * Sets the value of the target property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVersion(BigDecimal value) {
            this.version = value;
        }

        /**
         * Gets the value of the transactionIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionIdentifier() {
            return transactionIdentifier;
        }

        /**
         * Sets the value of the transactionIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionIdentifier(String value) {
            this.transactionIdentifier = value;
        }

        /**
         * Gets the value of the sequenceNmbr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNmbr() {
            return sequenceNmbr;
        }

        /**
         * Sets the value of the sequenceNmbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNmbr(BigInteger value) {
            this.sequenceNmbr = value;
        }

        /**
         * Gets the value of the transactionStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionStatusCode() {
            return transactionStatusCode;
        }

        /**
         * Sets the value of the transactionStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionStatusCode(String value) {
            this.transactionStatusCode = value;
        }

        /**
         * Gets the value of the retransmissionIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRetransmissionIndicator() {
            return retransmissionIndicator;
        }

        /**
         * Sets the value of the retransmissionIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRetransmissionIndicator(Boolean value) {
            this.retransmissionIndicator = value;
        }

        /**
         * Gets the value of the searchCacheLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchCacheLevel() {
            return searchCacheLevel;
        }

        /**
         * Sets the value of the searchCacheLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchCacheLevel(String value) {
            this.searchCacheLevel = value;
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
         *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "roomStay"
        })
        public static class RoomStays {

            @XmlElement(name = "RoomStay")
            protected List<GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay> roomStay;
            @XmlAttribute(name = "MoreIndicator")
            protected String moreIndicator;

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
             * {@link GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay }
             * 
             * 
             */
            public List<GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay> getRoomStay() {
                if (roomStay == null) {
                    roomStay = new ArrayList<GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay>();
                }
                return this.roomStay;
            }

            /**
             * Gets the value of the moreIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoreIndicator() {
                return moreIndicator;
            }

            /**
             * Sets the value of the moreIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoreIndicator(String value) {
                this.moreIndicator = value;
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
                protected GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference reference;
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
                 *     {@link GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference }
                 *     
                 */
                public GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference getReference() {
                    return reference;
                }

                /**
                 * Sets the value of the reference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference }
                 *     
                 */
                public void setReference(GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference value) {
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

    }

}
