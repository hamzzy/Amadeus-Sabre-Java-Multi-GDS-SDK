
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
 * <p>Java class for OTA_AirRulesRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirRulesRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Errors" type="{http://epowerv5.amadeus.com.tr/WS}ErrorsType" minOccurs="0"/>
 *           &lt;element name="PriceMessageInfoType" type="{http://epowerv5.amadeus.com.tr/WS}PriceMessageInfoType" minOccurs="0"/>
 *           &lt;element name="MiniRuleResponseInfo" type="{http://epowerv5.amadeus.com.tr/WS}MiniRuleResponseInfoType" minOccurs="0"/>
 *           &lt;element name="FareRuleResponseInfo" type="{http://epowerv5.amadeus.com.tr/WS}FareRuleResponseInfoType" minOccurs="0"/>
 *           &lt;element name="Success" type="{http://epowerv5.amadeus.com.tr/WS}SuccessType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}WarningsType" minOccurs="0"/>
 *           &lt;element name="RuleLink" type="{http://epowerv5.amadeus.com.tr/WS}RuleLink" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirRulesRSTarget" default="Production" />
 *       &lt;attribute name="RuleLink" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirRulesRSTransactionStatusCode" />
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirRulesRS", propOrder = {
    "errorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo"
})
public class OTAAirRulesRS {

    @XmlElements({
        @XmlElement(name = "Errors", type = ErrorsType.class),
        @XmlElement(name = "PriceMessageInfoType", type = PriceMessageInfoType.class),
        @XmlElement(name = "MiniRuleResponseInfo", type = MiniRuleResponseInfoType.class),
        @XmlElement(name = "FareRuleResponseInfo", type = FareRuleResponseInfoType.class),
        @XmlElement(name = "Success", type = SuccessType.class),
        @XmlElement(name = "Warnings", type = WarningsType.class),
        @XmlElement(name = "RuleLink", type = RuleLink.class)
    })
    protected List<Object> errorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTAAirRulesRSTarget target;
    @XmlAttribute(name = "RuleLink")
    protected String ruleLink;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected OTAAirRulesRSTransactionStatusCode transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;

    /**
     * Gets the value of the errorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorsType }
     * {@link PriceMessageInfoType }
     * {@link MiniRuleResponseInfoType }
     * {@link FareRuleResponseInfoType }
     * {@link SuccessType }
     * {@link WarningsType }
     * {@link RuleLink }
     * 
     * 
     */
    public List<Object> getErrorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo() {
        if (errorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo == null) {
            errorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo = new ArrayList<Object>();
        }
        return this.errorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo;
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
     *     {@link OTAAirRulesRSTarget }
     *     
     */
    public OTAAirRulesRSTarget getTarget() {
        if (target == null) {
            return OTAAirRulesRSTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirRulesRSTarget }
     *     
     */
    public void setTarget(OTAAirRulesRSTarget value) {
        this.target = value;
    }

    /**
     * Gets the value of the ruleLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleLink() {
        return ruleLink;
    }

    /**
     * Sets the value of the ruleLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleLink(String value) {
        this.ruleLink = value;
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
     *     {@link OTAAirRulesRSTransactionStatusCode }
     *     
     */
    public OTAAirRulesRSTransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirRulesRSTransactionStatusCode }
     *     
     */
    public void setTransactionStatusCode(OTAAirRulesRSTransactionStatusCode value) {
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
