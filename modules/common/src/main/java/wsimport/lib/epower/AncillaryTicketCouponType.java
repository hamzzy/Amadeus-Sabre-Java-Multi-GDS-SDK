
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryTicketCouponType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryTicketCouponType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CpnNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuanceSubCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingAirline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionWithEticketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionWithEticketType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionWithEticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponDetail" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryTicketCouponDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryTicketCouponType", propOrder = {
    "cpnNumber",
    "issuanceSubCode",
    "operatingAirline",
    "originDestination",
    "statusCode",
    "status",
    "connectionWithEticketNumber",
    "connectionWithEticketType",
    "connectionWithEticket",
    "couponAmount",
    "couponCurrency",
    "couponValue",
    "couponDetail"
})
public class AncillaryTicketCouponType {

    @XmlElement(name = "CpnNumber")
    protected String cpnNumber;
    @XmlElement(name = "IssuanceSubCode")
    protected String issuanceSubCode;
    @XmlElement(name = "OperatingAirline")
    protected String operatingAirline;
    @XmlElement(name = "OriginDestination")
    protected String originDestination;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ConnectionWithEticketNumber")
    protected String connectionWithEticketNumber;
    @XmlElement(name = "ConnectionWithEticketType")
    protected String connectionWithEticketType;
    @XmlElement(name = "ConnectionWithEticket")
    protected String connectionWithEticket;
    @XmlElement(name = "CouponAmount")
    protected String couponAmount;
    @XmlElement(name = "CouponCurrency")
    protected String couponCurrency;
    @XmlElement(name = "CouponValue")
    protected String couponValue;
    @XmlElement(name = "CouponDetail")
    protected AncillaryTicketCouponDetailType couponDetail;

    /**
     * Gets the value of the cpnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnNumber() {
        return cpnNumber;
    }

    /**
     * Sets the value of the cpnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnNumber(String value) {
        this.cpnNumber = value;
    }

    /**
     * Gets the value of the issuanceSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceSubCode() {
        return issuanceSubCode;
    }

    /**
     * Sets the value of the issuanceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuanceSubCode(String value) {
        this.issuanceSubCode = value;
    }

    /**
     * Gets the value of the operatingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingAirline() {
        return operatingAirline;
    }

    /**
     * Sets the value of the operatingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingAirline(String value) {
        this.operatingAirline = value;
    }

    /**
     * Gets the value of the originDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestination() {
        return originDestination;
    }

    /**
     * Sets the value of the originDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestination(String value) {
        this.originDestination = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the connectionWithEticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionWithEticketNumber() {
        return connectionWithEticketNumber;
    }

    /**
     * Sets the value of the connectionWithEticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionWithEticketNumber(String value) {
        this.connectionWithEticketNumber = value;
    }

    /**
     * Gets the value of the connectionWithEticketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionWithEticketType() {
        return connectionWithEticketType;
    }

    /**
     * Sets the value of the connectionWithEticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionWithEticketType(String value) {
        this.connectionWithEticketType = value;
    }

    /**
     * Gets the value of the connectionWithEticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionWithEticket() {
        return connectionWithEticket;
    }

    /**
     * Sets the value of the connectionWithEticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionWithEticket(String value) {
        this.connectionWithEticket = value;
    }

    /**
     * Gets the value of the couponAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponAmount() {
        return couponAmount;
    }

    /**
     * Sets the value of the couponAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponAmount(String value) {
        this.couponAmount = value;
    }

    /**
     * Gets the value of the couponCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponCurrency() {
        return couponCurrency;
    }

    /**
     * Sets the value of the couponCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponCurrency(String value) {
        this.couponCurrency = value;
    }

    /**
     * Gets the value of the couponValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponValue() {
        return couponValue;
    }

    /**
     * Sets the value of the couponValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponValue(String value) {
        this.couponValue = value;
    }

    /**
     * Gets the value of the couponDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryTicketCouponDetailType }
     *     
     */
    public AncillaryTicketCouponDetailType getCouponDetail() {
        return couponDetail;
    }

    /**
     * Sets the value of the couponDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryTicketCouponDetailType }
     *     
     */
    public void setCouponDetail(AncillaryTicketCouponDetailType value) {
        this.couponDetail = value;
    }

}
