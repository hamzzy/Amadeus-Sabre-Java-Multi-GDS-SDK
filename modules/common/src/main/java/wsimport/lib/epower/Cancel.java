
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
 *         &lt;element name="OTA_CancelRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PNRNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
 *                   &lt;element name="UniqueID" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
 *                           &lt;attribute name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Verification" type="{http://epowerv5.amadeus.com.tr/WS}VerificationType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ItinSegNbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="FirstItinSegNbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="LastItinSegNbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CancellationOverrides" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CancellationOverride" type="{http://epowerv5.amadeus.com.tr/WS}CancelRuleType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Reasons" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFreeTextType" minOccurs="0"/>
 *                   &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
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
 *                 &lt;attribute name="ReqRespVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CancelType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}TransactionActionType" />
 *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "otaCancelRQ"
})
@XmlRootElement(name = "Cancel")
public class Cancel {

    @XmlElement(name = "OTA_CancelRQ")
    protected Cancel.OTACancelRQ otaCancelRQ;

    /**
     * Gets the value of the otaCancelRQ property.
     * 
     * @return
     *     possible object is
     *     {@link Cancel.OTACancelRQ }
     *     
     */
    public Cancel.OTACancelRQ getOTACancelRQ() {
        return otaCancelRQ;
    }

    /**
     * Sets the value of the otaCancelRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cancel.OTACancelRQ }
     *     
     */
    public void setOTACancelRQ(Cancel.OTACancelRQ value) {
        this.otaCancelRQ = value;
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
     *         &lt;element name="PNRNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
     *         &lt;element name="UniqueID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
     *                 &lt;attribute name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Verification" type="{http://epowerv5.amadeus.com.tr/WS}VerificationType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ItinSegNbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="FirstItinSegNbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="LastItinSegNbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CancellationOverrides" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CancellationOverride" type="{http://epowerv5.amadeus.com.tr/WS}CancelRuleType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Reasons" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFreeTextType" minOccurs="0"/>
     *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
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
     *       &lt;attribute name="ReqRespVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CancelType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}TransactionActionType" />
     *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pnrNo",
        "bookingReferenceID",
        "pos",
        "uniqueID",
        "verification",
        "segment",
        "cancellationOverrides",
        "reasons",
        "tpaExtensions"
    })
    public static class OTACancelRQ {

        @XmlElement(name = "PNRNo")
        protected String pnrNo;
        @XmlElement(name = "BookingReferenceID")
        protected UniqueIDType bookingReferenceID;
        @XmlElement(name = "POS")
        protected ArrayOfSourceType pos;
        @XmlElement(name = "UniqueID")
        protected List<Cancel.OTACancelRQ.UniqueID> uniqueID;
        @XmlElement(name = "Verification")
        protected List<VerificationType> verification;
        @XmlElement(name = "Segment")
        protected List<Cancel.OTACancelRQ.Segment> segment;
        @XmlElement(name = "CancellationOverrides")
        protected Cancel.OTACancelRQ.CancellationOverrides cancellationOverrides;
        @XmlElement(name = "Reasons")
        protected ArrayOfFreeTextType reasons;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
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
        @XmlAttribute(name = "ReqRespVersion")
        protected String reqRespVersion;
        @XmlAttribute(name = "CancelType", required = true)
        protected TransactionActionType cancelType;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;

        /**
         * Gets the value of the pnrNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPNRNo() {
            return pnrNo;
        }

        /**
         * Sets the value of the pnrNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPNRNo(String value) {
            this.pnrNo = value;
        }

        /**
         * Gets the value of the bookingReferenceID property.
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getBookingReferenceID() {
            return bookingReferenceID;
        }

        /**
         * Sets the value of the bookingReferenceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setBookingReferenceID(UniqueIDType value) {
            this.bookingReferenceID = value;
        }

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
         * Gets the value of the uniqueID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUniqueID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cancel.OTACancelRQ.UniqueID }
         * 
         * 
         */
        public List<Cancel.OTACancelRQ.UniqueID> getUniqueID() {
            if (uniqueID == null) {
                uniqueID = new ArrayList<Cancel.OTACancelRQ.UniqueID>();
            }
            return this.uniqueID;
        }

        /**
         * Gets the value of the verification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the verification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVerification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VerificationType }
         * 
         * 
         */
        public List<VerificationType> getVerification() {
            if (verification == null) {
                verification = new ArrayList<VerificationType>();
            }
            return this.verification;
        }

        /**
         * Gets the value of the segment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cancel.OTACancelRQ.Segment }
         * 
         * 
         */
        public List<Cancel.OTACancelRQ.Segment> getSegment() {
            if (segment == null) {
                segment = new ArrayList<Cancel.OTACancelRQ.Segment>();
            }
            return this.segment;
        }

        /**
         * Gets the value of the cancellationOverrides property.
         * 
         * @return
         *     possible object is
         *     {@link Cancel.OTACancelRQ.CancellationOverrides }
         *     
         */
        public Cancel.OTACancelRQ.CancellationOverrides getCancellationOverrides() {
            return cancellationOverrides;
        }

        /**
         * Sets the value of the cancellationOverrides property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cancel.OTACancelRQ.CancellationOverrides }
         *     
         */
        public void setCancellationOverrides(Cancel.OTACancelRQ.CancellationOverrides value) {
            this.cancellationOverrides = value;
        }

        /**
         * Gets the value of the reasons property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfFreeTextType }
         *     
         */
        public ArrayOfFreeTextType getReasons() {
            return reasons;
        }

        /**
         * Sets the value of the reasons property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfFreeTextType }
         *     
         */
        public void setReasons(ArrayOfFreeTextType value) {
            this.reasons = value;
        }

        /**
         * Gets the value of the tpaExtensions property.
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * Sets the value of the tpaExtensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
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
         * Gets the value of the reqRespVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReqRespVersion() {
            return reqRespVersion;
        }

        /**
         * Sets the value of the reqRespVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReqRespVersion(String value) {
            this.reqRespVersion = value;
        }

        /**
         * Gets the value of the cancelType property.
         * 
         * @return
         *     possible object is
         *     {@link TransactionActionType }
         *     
         */
        public TransactionActionType getCancelType() {
            return cancelType;
        }

        /**
         * Sets the value of the cancelType property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransactionActionType }
         *     
         */
        public void setCancelType(TransactionActionType value) {
            this.cancelType = value;
        }

        /**
         * Gets the value of the travelSector property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Sets the value of the travelSector property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
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
         *         &lt;element name="CancellationOverride" type="{http://epowerv5.amadeus.com.tr/WS}CancelRuleType" minOccurs="0"/>
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
            "cancellationOverride"
        })
        public static class CancellationOverrides {

            @XmlElement(name = "CancellationOverride")
            protected CancelRuleType cancellationOverride;

            /**
             * Gets the value of the cancellationOverride property.
             * 
             * @return
             *     possible object is
             *     {@link CancelRuleType }
             *     
             */
            public CancelRuleType getCancellationOverride() {
                return cancellationOverride;
            }

            /**
             * Sets the value of the cancellationOverride property.
             * 
             * @param value
             *     allowed object is
             *     {@link CancelRuleType }
             *     
             */
            public void setCancellationOverride(CancelRuleType value) {
                this.cancellationOverride = value;
            }

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
         *       &lt;attribute name="ItinSegNbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="FirstItinSegNbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="LastItinSegNbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Segment {

            @XmlAttribute(name = "ItinSegNbr")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger itinSegNbr;
            @XmlAttribute(name = "FirstItinSegNbr")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger firstItinSegNbr;
            @XmlAttribute(name = "LastItinSegNbr")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger lastItinSegNbr;

            /**
             * Gets the value of the itinSegNbr property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getItinSegNbr() {
                return itinSegNbr;
            }

            /**
             * Sets the value of the itinSegNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setItinSegNbr(BigInteger value) {
                this.itinSegNbr = value;
            }

            /**
             * Gets the value of the firstItinSegNbr property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getFirstItinSegNbr() {
                return firstItinSegNbr;
            }

            /**
             * Sets the value of the firstItinSegNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setFirstItinSegNbr(BigInteger value) {
                this.firstItinSegNbr = value;
            }

            /**
             * Gets the value of the lastItinSegNbr property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLastItinSegNbr() {
                return lastItinSegNbr;
            }

            /**
             * Sets the value of the lastItinSegNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLastItinSegNbr(BigInteger value) {
                this.lastItinSegNbr = value;
            }

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
         *       &lt;attribute name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UniqueID
            extends UniqueIDType
        {

            @XmlAttribute(name = "Reason")
            protected String reason;

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
            }

        }

    }

}
