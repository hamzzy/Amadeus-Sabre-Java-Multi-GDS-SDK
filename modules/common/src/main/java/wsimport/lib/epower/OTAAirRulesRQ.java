
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OTA_AirRulesRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirRulesRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}GenericFlightRQ">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
 *         &lt;element name="RuleReqInfo" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirRulesRQRuleReqInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MiniRuleEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PriceMessageEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="FlightRuleEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirRulesRQTarget" default="Production" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirRulesRQTransactionStatusCode" />
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirRulesRQ", propOrder = {
    "pos",
    "ruleReqInfo"
})
public class OTAAirRulesRQ
    extends GenericFlightRQ
{

    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElement(name = "RuleReqInfo")
    protected OTAAirRulesRQRuleReqInfo ruleReqInfo;
    @XmlAttribute(name = "PassengerType")
    protected String passengerType;
    @XmlAttribute(name = "MiniRuleEnabled", required = true)
    protected int miniRuleEnabled;
    @XmlAttribute(name = "PriceMessageEnabled", required = true)
    protected int priceMessageEnabled;
    @XmlAttribute(name = "FlightRuleEnabled", required = true)
    protected int flightRuleEnabled;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTAAirRulesRQTarget target;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected OTAAirRulesRQTransactionStatusCode transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;

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
     * Gets the value of the ruleReqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirRulesRQRuleReqInfo }
     *     
     */
    public OTAAirRulesRQRuleReqInfo getRuleReqInfo() {
        return ruleReqInfo;
    }

    /**
     * Sets the value of the ruleReqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirRulesRQRuleReqInfo }
     *     
     */
    public void setRuleReqInfo(OTAAirRulesRQRuleReqInfo value) {
        this.ruleReqInfo = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the miniRuleEnabled property.
     * 
     */
    public int getMiniRuleEnabled() {
        return miniRuleEnabled;
    }

    /**
     * Sets the value of the miniRuleEnabled property.
     * 
     */
    public void setMiniRuleEnabled(int value) {
        this.miniRuleEnabled = value;
    }

    /**
     * Gets the value of the priceMessageEnabled property.
     * 
     */
    public int getPriceMessageEnabled() {
        return priceMessageEnabled;
    }

    /**
     * Sets the value of the priceMessageEnabled property.
     * 
     */
    public void setPriceMessageEnabled(int value) {
        this.priceMessageEnabled = value;
    }

    /**
     * Gets the value of the flightRuleEnabled property.
     * 
     */
    public int getFlightRuleEnabled() {
        return flightRuleEnabled;
    }

    /**
     * Sets the value of the flightRuleEnabled property.
     * 
     */
    public void setFlightRuleEnabled(int value) {
        this.flightRuleEnabled = value;
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
     *     {@link OTAAirRulesRQTarget }
     *     
     */
    public OTAAirRulesRQTarget getTarget() {
        if (target == null) {
            return OTAAirRulesRQTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirRulesRQTarget }
     *     
     */
    public void setTarget(OTAAirRulesRQTarget value) {
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
     *     {@link OTAAirRulesRQTransactionStatusCode }
     *     
     */
    public OTAAirRulesRQTransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirRulesRQTransactionStatusCode }
     *     
     */
    public void setTransactionStatusCode(OTAAirRulesRQTransactionStatusCode value) {
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
