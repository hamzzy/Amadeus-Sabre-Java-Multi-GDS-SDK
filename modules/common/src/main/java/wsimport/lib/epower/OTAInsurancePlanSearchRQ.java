
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
 * <p>Java class for OTA_InsurancePlanSearchRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsurancePlanSearchRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
 *         &lt;element name="CoveragePreferences" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOTA_InsurancePlanSearchRQCoveragePreference" minOccurs="0"/>
 *         &lt;element name="SearchTripInfo" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRQSearchTripInfo" minOccurs="0"/>
 *         &lt;element name="SearchFlightInfo" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRQSearchFlightInfo" minOccurs="0"/>
 *         &lt;element name="SearchTravInfo" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRQSearchTravInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Target" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRQTarget" default="Production" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TransactionStatusCode" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRQTransactionStatusCode" />
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SearchResponseFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DetailResponse" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_InsurancePlanSearchRQ", propOrder = {
    "pos",
    "coveragePreferences",
    "searchTripInfo",
    "searchFlightInfo",
    "searchTravInfo"
})
public class OTAInsurancePlanSearchRQ {

    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElement(name = "CoveragePreferences")
    protected ArrayOfOTAInsurancePlanSearchRQCoveragePreference coveragePreferences;
    @XmlElement(name = "SearchTripInfo")
    protected OTAInsurancePlanSearchRQSearchTripInfo searchTripInfo;
    @XmlElement(name = "SearchFlightInfo")
    protected OTAInsurancePlanSearchRQSearchFlightInfo searchFlightInfo;
    @XmlElement(name = "SearchTravInfo")
    protected OTAInsurancePlanSearchRQSearchTravInfo searchTravInfo;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected OTAInsurancePlanSearchRQTarget target;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected OTAInsurancePlanSearchRQTransactionStatusCode transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "SearchResponseFilter")
    protected String searchResponseFilter;
    @XmlAttribute(name = "DetailResponse", required = true)
    protected boolean detailResponse;

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
     * Gets the value of the coveragePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOTAInsurancePlanSearchRQCoveragePreference }
     *     
     */
    public ArrayOfOTAInsurancePlanSearchRQCoveragePreference getCoveragePreferences() {
        return coveragePreferences;
    }

    /**
     * Sets the value of the coveragePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOTAInsurancePlanSearchRQCoveragePreference }
     *     
     */
    public void setCoveragePreferences(ArrayOfOTAInsurancePlanSearchRQCoveragePreference value) {
        this.coveragePreferences = value;
    }

    /**
     * Gets the value of the searchTripInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsurancePlanSearchRQSearchTripInfo }
     *     
     */
    public OTAInsurancePlanSearchRQSearchTripInfo getSearchTripInfo() {
        return searchTripInfo;
    }

    /**
     * Sets the value of the searchTripInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRQSearchTripInfo }
     *     
     */
    public void setSearchTripInfo(OTAInsurancePlanSearchRQSearchTripInfo value) {
        this.searchTripInfo = value;
    }

    /**
     * Gets the value of the searchFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsurancePlanSearchRQSearchFlightInfo }
     *     
     */
    public OTAInsurancePlanSearchRQSearchFlightInfo getSearchFlightInfo() {
        return searchFlightInfo;
    }

    /**
     * Sets the value of the searchFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRQSearchFlightInfo }
     *     
     */
    public void setSearchFlightInfo(OTAInsurancePlanSearchRQSearchFlightInfo value) {
        this.searchFlightInfo = value;
    }

    /**
     * Gets the value of the searchTravInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsurancePlanSearchRQSearchTravInfo }
     *     
     */
    public OTAInsurancePlanSearchRQSearchTravInfo getSearchTravInfo() {
        return searchTravInfo;
    }

    /**
     * Sets the value of the searchTravInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRQSearchTravInfo }
     *     
     */
    public void setSearchTravInfo(OTAInsurancePlanSearchRQSearchTravInfo value) {
        this.searchTravInfo = value;
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
     *     {@link OTAInsurancePlanSearchRQTarget }
     *     
     */
    public OTAInsurancePlanSearchRQTarget getTarget() {
        if (target == null) {
            return OTAInsurancePlanSearchRQTarget.PRODUCTION;
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRQTarget }
     *     
     */
    public void setTarget(OTAInsurancePlanSearchRQTarget value) {
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
     *     {@link OTAInsurancePlanSearchRQTransactionStatusCode }
     *     
     */
    public OTAInsurancePlanSearchRQTransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRQTransactionStatusCode }
     *     
     */
    public void setTransactionStatusCode(OTAInsurancePlanSearchRQTransactionStatusCode value) {
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
     * Gets the value of the searchResponseFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchResponseFilter() {
        return searchResponseFilter;
    }

    /**
     * Sets the value of the searchResponseFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchResponseFilter(String value) {
        this.searchResponseFilter = value;
    }

    /**
     * Gets the value of the detailResponse property.
     * 
     */
    public boolean isDetailResponse() {
        return detailResponse;
    }

    /**
     * Sets the value of the detailResponse property.
     * 
     */
    public void setDetailResponse(boolean value) {
        this.detailResponse = value;
    }

}
