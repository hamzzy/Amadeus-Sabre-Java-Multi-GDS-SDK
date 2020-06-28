
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="OTA_AirScheduleRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
 *                   &lt;element name="OriginDestinationInformation" type="{http://epowerv5.amadeus.com.tr/WS}OriginDestinationInformationType" minOccurs="0"/>
 *                   &lt;element name="FlightInfo" type="{http://epowerv5.amadeus.com.tr/WS}SpecificFlightInfoType" minOccurs="0"/>
 *                   &lt;element name="VendorPref" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FlightTypePref" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRQFlightTypePref" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="EquipPref" type="{http://epowerv5.amadeus.com.tr/WS}EquipmentTypePref" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MoreResults" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Target" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRQTarget" default="Production" />
 *                 &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="TransactionStatusCode" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRQTransactionStatusCode" />
 *                 &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
    "otaAirScheduleRQ"
})
@XmlRootElement(name = "SearchFlightTimeTable")
public class SearchFlightTimeTable {

    @XmlElement(name = "OTA_AirScheduleRQ")
    protected SearchFlightTimeTable.OTAAirScheduleRQ otaAirScheduleRQ;

    /**
     * Gets the value of the otaAirScheduleRQ property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFlightTimeTable.OTAAirScheduleRQ }
     *     
     */
    public SearchFlightTimeTable.OTAAirScheduleRQ getOTAAirScheduleRQ() {
        return otaAirScheduleRQ;
    }

    /**
     * Sets the value of the otaAirScheduleRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFlightTimeTable.OTAAirScheduleRQ }
     *     
     */
    public void setOTAAirScheduleRQ(SearchFlightTimeTable.OTAAirScheduleRQ value) {
        this.otaAirScheduleRQ = value;
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
     *         &lt;element name="OriginDestinationInformation" type="{http://epowerv5.amadeus.com.tr/WS}OriginDestinationInformationType" minOccurs="0"/>
     *         &lt;element name="FlightInfo" type="{http://epowerv5.amadeus.com.tr/WS}SpecificFlightInfoType" minOccurs="0"/>
     *         &lt;element name="VendorPref" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FlightTypePref" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRQFlightTypePref" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="EquipPref" type="{http://epowerv5.amadeus.com.tr/WS}EquipmentTypePref" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="MoreResults" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Target" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRQTarget" default="Production" />
     *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="TransactionStatusCode" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRQTransactionStatusCode" />
     *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
        "originDestinationInformation",
        "flightInfo",
        "vendorPref",
        "flightTypePref",
        "equipPref"
    })
    public static class OTAAirScheduleRQ {

        @XmlElement(name = "POS")
        protected ArrayOfSourceType pos;
        @XmlElement(name = "OriginDestinationInformation")
        protected OriginDestinationInformationType originDestinationInformation;
        @XmlElement(name = "FlightInfo")
        protected SpecificFlightInfoType flightInfo;
        @XmlElement(name = "VendorPref")
        protected List<CompanyNamePrefType> vendorPref;
        @XmlElement(name = "FlightTypePref")
        protected List<OTAAirScheduleRQFlightTypePref> flightTypePref;
        @XmlElement(name = "EquipPref")
        protected List<EquipmentTypePref> equipPref;
        @XmlAttribute(name = "MoreResults", required = true)
        protected boolean moreResults;
        @XmlAttribute(name = "EchoToken")
        protected String echoToken;
        @XmlAttribute(name = "TimeStamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timeStamp;
        @XmlAttribute(name = "Target")
        protected OTAAirScheduleRQTarget target;
        @XmlAttribute(name = "Version", required = true)
        protected BigDecimal version;
        @XmlAttribute(name = "TransactionIdentifier")
        protected String transactionIdentifier;
        @XmlAttribute(name = "SequenceNmbr")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger sequenceNmbr;
        @XmlAttribute(name = "TransactionStatusCode")
        protected OTAAirScheduleRQTransactionStatusCode transactionStatusCode;
        @XmlAttribute(name = "RetransmissionIndicator")
        protected Boolean retransmissionIndicator;
        @XmlAttribute(name = "MaxResponses")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxResponses;

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
         * Gets the value of the originDestinationInformation property.
         * 
         * @return
         *     possible object is
         *     {@link OriginDestinationInformationType }
         *     
         */
        public OriginDestinationInformationType getOriginDestinationInformation() {
            return originDestinationInformation;
        }

        /**
         * Sets the value of the originDestinationInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginDestinationInformationType }
         *     
         */
        public void setOriginDestinationInformation(OriginDestinationInformationType value) {
            this.originDestinationInformation = value;
        }

        /**
         * Gets the value of the flightInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SpecificFlightInfoType }
         *     
         */
        public SpecificFlightInfoType getFlightInfo() {
            return flightInfo;
        }

        /**
         * Sets the value of the flightInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecificFlightInfoType }
         *     
         */
        public void setFlightInfo(SpecificFlightInfoType value) {
            this.flightInfo = value;
        }

        /**
         * Gets the value of the vendorPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyNamePrefType }
         * 
         * 
         */
        public List<CompanyNamePrefType> getVendorPref() {
            if (vendorPref == null) {
                vendorPref = new ArrayList<CompanyNamePrefType>();
            }
            return this.vendorPref;
        }

        /**
         * Gets the value of the flightTypePref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightTypePref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightTypePref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTAAirScheduleRQFlightTypePref }
         * 
         * 
         */
        public List<OTAAirScheduleRQFlightTypePref> getFlightTypePref() {
            if (flightTypePref == null) {
                flightTypePref = new ArrayList<OTAAirScheduleRQFlightTypePref>();
            }
            return this.flightTypePref;
        }

        /**
         * Gets the value of the equipPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the equipPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEquipPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EquipmentTypePref }
         * 
         * 
         */
        public List<EquipmentTypePref> getEquipPref() {
            if (equipPref == null) {
                equipPref = new ArrayList<EquipmentTypePref>();
            }
            return this.equipPref;
        }

        /**
         * Gets the value of the moreResults property.
         * 
         */
        public boolean isMoreResults() {
            return moreResults;
        }

        /**
         * Sets the value of the moreResults property.
         * 
         */
        public void setMoreResults(boolean value) {
            this.moreResults = value;
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
         *     {@link OTAAirScheduleRQTarget }
         *     
         */
        public OTAAirScheduleRQTarget getTarget() {
            if (target == null) {
                return OTAAirScheduleRQTarget.PRODUCTION;
            } else {
                return target;
            }
        }

        /**
         * Sets the value of the target property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAAirScheduleRQTarget }
         *     
         */
        public void setTarget(OTAAirScheduleRQTarget value) {
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
         *     {@link OTAAirScheduleRQTransactionStatusCode }
         *     
         */
        public OTAAirScheduleRQTransactionStatusCode getTransactionStatusCode() {
            return transactionStatusCode;
        }

        /**
         * Sets the value of the transactionStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAAirScheduleRQTransactionStatusCode }
         *     
         */
        public void setTransactionStatusCode(OTAAirScheduleRQTransactionStatusCode value) {
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
         * Gets the value of the maxResponses property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxResponses() {
            return maxResponses;
        }

        /**
         * Sets the value of the maxResponses property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxResponses(BigInteger value) {
            this.maxResponses = value;
        }

    }

}
