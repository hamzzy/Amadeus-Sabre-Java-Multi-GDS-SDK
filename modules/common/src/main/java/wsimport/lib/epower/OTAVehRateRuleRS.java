
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OTA_VehRateRuleRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehRateRuleRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *           &lt;element name="VehRentalCore" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSVehRentalCore" minOccurs="0"/>
 *           &lt;element name="RentalRate" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRentalRate" minOccurs="0"/>
 *           &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *           &lt;element name="TotalCharge" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSTotalCharge" minOccurs="0"/>
 *           &lt;element name="Vehicle" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSVehicle" minOccurs="0"/>
 *           &lt;element name="VendorMessages" type="{http://epowerv5.amadeus.com.tr/WS}VendorMessagesType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
 *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *           &lt;element name="Fees" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSFees" minOccurs="0"/>
 *           &lt;element name="LocationDetails" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSLocationDetails" minOccurs="0"/>
 *           &lt;element name="PricedCoverages" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSPricedCoverages" minOccurs="0"/>
 *           &lt;element name="PricedEquips" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSPricedEquips" minOccurs="0"/>
 *           &lt;element name="RateRules" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSRateRules" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSTarget" default="Production" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehRateRuleRSTransactionStatusCode" />
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehRateRuleRS", propOrder = {
    "successOrVehRentalCoreOrRentalRate"
})
public class OTAVehRateRuleRS {

    @XmlElements({
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "VehRentalCore", type = OTAVehRateRuleRSVehRentalCore.class),
        @XmlElement(name = "RentalRate", type = OTAVehRateRuleRSRentalRate.class),
        @XmlElement(name = "TPA_Extensions", type = TPAExtensionsType.class),
        @XmlElement(name = "TotalCharge", type = OTAVehRateRuleRSTotalCharge.class),
        @XmlElement(name = "Vehicle", type = OTAVehRateRuleRSVehicle.class),
        @XmlElement(name = "VendorMessages", type = VendorMessagesType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "Fees", type = OTAVehRateRuleRSFees.class),
        @XmlElement(name = "LocationDetails", type = OTAVehRateRuleRSLocationDetails.class),
        @XmlElement(name = "PricedCoverages", type = OTAVehRateRuleRSPricedCoverages.class),
        @XmlElement(name = "PricedEquips", type = OTAVehRateRuleRSPricedEquips.class),
        @XmlElement(name = "RateRules", type = OTAVehRateRuleRSRateRules.class)
    })
    protected List<Object> successOrVehRentalCoreOrRentalRate;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTAVehRateRuleRSTarget target;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected OTAVehRateRuleRSTransactionStatusCode transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;

    /**
     * Gets the value of the successOrVehRentalCoreOrRentalRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successOrVehRentalCoreOrRentalRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessOrVehRentalCoreOrRentalRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuccessType }
     * {@link OTAVehRateRuleRSVehRentalCore }
     * {@link OTAVehRateRuleRSRentalRate }
     * {@link TPAExtensionsType }
     * {@link OTAVehRateRuleRSTotalCharge }
     * {@link OTAVehRateRuleRSVehicle }
     * {@link VendorMessagesType }
     * {@link WarningsType }
     * {@link ErrorsType }
     * {@link OTAVehRateRuleRSFees }
     * {@link OTAVehRateRuleRSLocationDetails }
     * {@link OTAVehRateRuleRSPricedCoverages }
     * {@link OTAVehRateRuleRSPricedEquips }
     * {@link OTAVehRateRuleRSRateRules }
     * 
     * 
     */
    public List<Object> getSuccessOrVehRentalCoreOrRentalRate() {
        if (successOrVehRentalCoreOrRentalRate == null) {
            successOrVehRentalCoreOrRentalRate = new ArrayList<Object>();
        }
        return this.successOrVehRentalCoreOrRentalRate;
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
     *     {@link OTAVehRateRuleRSTarget }
     *     
     */
    public OTAVehRateRuleRSTarget getTarget() {
        if (target == null) {
            return OTAVehRateRuleRSTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSTarget }
     *     
     */
    public void setTarget(OTAVehRateRuleRSTarget value) {
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
     *     {@link OTAVehRateRuleRSTransactionStatusCode }
     *     
     */
    public OTAVehRateRuleRSTransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehRateRuleRSTransactionStatusCode }
     *     
     */
    public void setTransactionStatusCode(OTAVehRateRuleRSTransactionStatusCode value) {
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
