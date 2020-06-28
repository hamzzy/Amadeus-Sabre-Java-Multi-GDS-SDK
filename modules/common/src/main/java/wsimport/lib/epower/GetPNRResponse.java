
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
 *         &lt;element name="OTA_AirBookRS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NewPrice" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
 *                   &lt;element name="Failback" type="{http://epowerv5.amadeus.com.tr/WS}FailbackRS" minOccurs="0"/>
 *                   &lt;element name="OldPrice" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
 *                   &lt;element name="AirReservation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirReservationType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *                     &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *                     &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
 *                   &lt;/choice>
 *                   &lt;element name="BookingToBeCancelled" type="{http://epowerv5.amadeus.com.tr/WS}BookingToBeCancelled" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PaymentRequestURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
 *                 &lt;attribute name="PriceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "otaAirBookRS"
})
@XmlRootElement(name = "GetPNRResponse")
public class GetPNRResponse {

    @XmlElement(name = "OTA_AirBookRS")
    protected GetPNRResponse.OTAAirBookRS otaAirBookRS;

    /**
     * Gets the value of the otaAirBookRS property.
     * 
     * @return
     *     possible object is
     *     {@link GetPNRResponse.OTAAirBookRS }
     *     
     */
    public GetPNRResponse.OTAAirBookRS getOTAAirBookRS() {
        return otaAirBookRS;
    }

    /**
     * Sets the value of the otaAirBookRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPNRResponse.OTAAirBookRS }
     *     
     */
    public void setOTAAirBookRS(GetPNRResponse.OTAAirBookRS value) {
        this.otaAirBookRS = value;
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
     *         &lt;element name="NewPrice" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
     *         &lt;element name="Failback" type="{http://epowerv5.amadeus.com.tr/WS}FailbackRS" minOccurs="0"/>
     *         &lt;element name="OldPrice" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
     *         &lt;element name="AirReservation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirReservationType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
     *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
     *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
     *         &lt;/choice>
     *         &lt;element name="BookingToBeCancelled" type="{http://epowerv5.amadeus.com.tr/WS}BookingToBeCancelled" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PaymentRequestURL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
     *       &lt;attribute name="PriceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "newPrice",
        "failback",
        "oldPrice",
        "airReservation",
        "errorsOrSuccessOrWarnings",
        "bookingToBeCancelled"
    })
    public static class OTAAirBookRS {

        @XmlElement(name = "NewPrice")
        protected AirItineraryPricingInfoType newPrice;
        @XmlElement(name = "Failback")
        protected FailbackRS failback;
        @XmlElement(name = "OldPrice")
        protected AirItineraryPricingInfoType oldPrice;
        @XmlElement(name = "AirReservation")
        protected GetPNRResponse.OTAAirBookRS.AirReservation airReservation;
        @XmlElements({
            @XmlElement(name = "Errors", type = ErrorsType.class),
            @XmlElement(name = "Success", type = SuccessType.class),
            @XmlElement(name = "Warnings", type = WarningsType.class)
        })
        protected List<Object> errorsOrSuccessOrWarnings;
        @XmlElement(name = "BookingToBeCancelled")
        protected BookingToBeCancelled bookingToBeCancelled;
        @XmlAttribute(name = "ReferenceNumber")
        protected String referenceNumber;
        @XmlAttribute(name = "PaymentRequestURL")
        protected String paymentRequestURL;
        @XmlAttribute(name = "Cancel")
        protected Boolean cancel;
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
        @XmlAttribute(name = "PriceInd")
        protected Boolean priceInd;

        /**
         * Gets the value of the newPrice property.
         * 
         * @return
         *     possible object is
         *     {@link AirItineraryPricingInfoType }
         *     
         */
        public AirItineraryPricingInfoType getNewPrice() {
            return newPrice;
        }

        /**
         * Sets the value of the newPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirItineraryPricingInfoType }
         *     
         */
        public void setNewPrice(AirItineraryPricingInfoType value) {
            this.newPrice = value;
        }

        /**
         * Gets the value of the failback property.
         * 
         * @return
         *     possible object is
         *     {@link FailbackRS }
         *     
         */
        public FailbackRS getFailback() {
            return failback;
        }

        /**
         * Sets the value of the failback property.
         * 
         * @param value
         *     allowed object is
         *     {@link FailbackRS }
         *     
         */
        public void setFailback(FailbackRS value) {
            this.failback = value;
        }

        /**
         * Gets the value of the oldPrice property.
         * 
         * @return
         *     possible object is
         *     {@link AirItineraryPricingInfoType }
         *     
         */
        public AirItineraryPricingInfoType getOldPrice() {
            return oldPrice;
        }

        /**
         * Sets the value of the oldPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirItineraryPricingInfoType }
         *     
         */
        public void setOldPrice(AirItineraryPricingInfoType value) {
            this.oldPrice = value;
        }

        /**
         * Gets the value of the airReservation property.
         * 
         * @return
         *     possible object is
         *     {@link GetPNRResponse.OTAAirBookRS.AirReservation }
         *     
         */
        public GetPNRResponse.OTAAirBookRS.AirReservation getAirReservation() {
            return airReservation;
        }

        /**
         * Sets the value of the airReservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetPNRResponse.OTAAirBookRS.AirReservation }
         *     
         */
        public void setAirReservation(GetPNRResponse.OTAAirBookRS.AirReservation value) {
            this.airReservation = value;
        }

        /**
         * Gets the value of the errorsOrSuccessOrWarnings property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the errorsOrSuccessOrWarnings property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErrorsOrSuccessOrWarnings().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ErrorsType }
         * {@link SuccessType }
         * {@link WarningsType }
         * 
         * 
         */
        public List<Object> getErrorsOrSuccessOrWarnings() {
            if (errorsOrSuccessOrWarnings == null) {
                errorsOrSuccessOrWarnings = new ArrayList<Object>();
            }
            return this.errorsOrSuccessOrWarnings;
        }

        /**
         * Gets the value of the bookingToBeCancelled property.
         * 
         * @return
         *     possible object is
         *     {@link BookingToBeCancelled }
         *     
         */
        public BookingToBeCancelled getBookingToBeCancelled() {
            return bookingToBeCancelled;
        }

        /**
         * Sets the value of the bookingToBeCancelled property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookingToBeCancelled }
         *     
         */
        public void setBookingToBeCancelled(BookingToBeCancelled value) {
            this.bookingToBeCancelled = value;
        }

        /**
         * Gets the value of the referenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceNumber() {
            return referenceNumber;
        }

        /**
         * Sets the value of the referenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceNumber(String value) {
            this.referenceNumber = value;
        }

        /**
         * Gets the value of the paymentRequestURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentRequestURL() {
            return paymentRequestURL;
        }

        /**
         * Sets the value of the paymentRequestURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentRequestURL(String value) {
            this.paymentRequestURL = value;
        }

        /**
         * Gets the value of the cancel property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCancel() {
            if (cancel == null) {
                return false;
            } else {
                return cancel;
            }
        }

        /**
         * Sets the value of the cancel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCancel(Boolean value) {
            this.cancel = value;
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
         * Gets the value of the priceInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPriceInd() {
            return priceInd;
        }

        /**
         * Sets the value of the priceInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPriceInd(Boolean value) {
            this.priceInd = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirReservationType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AirReservation
            extends AirReservationType
        {


        }

    }

}
