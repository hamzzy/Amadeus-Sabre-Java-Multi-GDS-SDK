
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
 *         &lt;element name="OTA_AirLowFareSearchRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HasMoreResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ProfilerData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *                     &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *                     &lt;element name="PricedItineraries" type="{http://epowerv5.amadeus.com.tr/WS}PricedItinerariesType" minOccurs="0"/>
 *                     &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
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
    "otaAirLowFareSearchRS"
})
@XmlRootElement(name = "GetCompatibleLowestFaresForSunExpressResponse")
public class GetCompatibleLowestFaresForSunExpressResponse {

    @XmlElement(name = "OTA_AirLowFareSearchRS")
    protected GetCompatibleLowestFaresForSunExpressResponse.OTAAirLowFareSearchRS otaAirLowFareSearchRS;

    /**
     * Gets the value of the otaAirLowFareSearchRS property.
     * 
     * @return
     *     possible object is
     *     {@link GetCompatibleLowestFaresForSunExpressResponse.OTAAirLowFareSearchRS }
     *     
     */
    public GetCompatibleLowestFaresForSunExpressResponse.OTAAirLowFareSearchRS getOTAAirLowFareSearchRS() {
        return otaAirLowFareSearchRS;
    }

    /**
     * Sets the value of the otaAirLowFareSearchRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCompatibleLowestFaresForSunExpressResponse.OTAAirLowFareSearchRS }
     *     
     */
    public void setOTAAirLowFareSearchRS(GetCompatibleLowestFaresForSunExpressResponse.OTAAirLowFareSearchRS value) {
        this.otaAirLowFareSearchRS = value;
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
     *         &lt;element name="HasMoreResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ProfilerData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
     *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
     *           &lt;element name="PricedItineraries" type="{http://epowerv5.amadeus.com.tr/WS}PricedItinerariesType" minOccurs="0"/>
     *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hasMoreResult",
        "profilerData",
        "successOrErrorsOrPricedItineraries"
    })
    public static class OTAAirLowFareSearchRS {

        @XmlElement(name = "HasMoreResult")
        protected boolean hasMoreResult;
        @XmlElement(name = "ProfilerData")
        protected String profilerData;
        @XmlElements({
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "PricedItineraries", type = PricedItinerariesType.class),
            @XmlElement(name = "Warnings", type = WarningsType.class)
        })
        protected List<Object> successOrErrorsOrPricedItineraries;
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

        /**
         * Gets the value of the hasMoreResult property.
         * 
         */
        public boolean isHasMoreResult() {
            return hasMoreResult;
        }

        /**
         * Sets the value of the hasMoreResult property.
         * 
         */
        public void setHasMoreResult(boolean value) {
            this.hasMoreResult = value;
        }

        /**
         * Gets the value of the profilerData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfilerData() {
            return profilerData;
        }

        /**
         * Sets the value of the profilerData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfilerData(String value) {
            this.profilerData = value;
        }

        /**
         * Gets the value of the successOrErrorsOrPricedItineraries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the successOrErrorsOrPricedItineraries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuccessOrErrorsOrPricedItineraries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuccessType }
         * {@link ErrorsType }
         * {@link PricedItinerariesType }
         * {@link WarningsType }
         * 
         * 
         */
        public List<Object> getSuccessOrErrorsOrPricedItineraries() {
            if (successOrErrorsOrPricedItineraries == null) {
                successOrErrorsOrPricedItineraries = new ArrayList<Object>();
            }
            return this.successOrErrorsOrPricedItineraries;
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

    }

}
