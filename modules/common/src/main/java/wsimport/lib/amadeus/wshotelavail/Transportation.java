
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transportation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transportation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descriptions" type="{http://traveltalk.com/wsHotelAvail}ArrayOfDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NotificationRequired" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransportationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TypicalTravelTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transportation", propOrder = {
    "descriptions"
})
public class Transportation {

    @XmlElement(name = "Descriptions")
    protected ArrayOfDescription descriptions;
    @XmlAttribute(name = "NotificationRequired")
    protected String notificationRequired;
    @XmlAttribute(name = "TransportationCode")
    protected String transportationCode;
    @XmlAttribute(name = "CodeDetail")
    protected String codeDetail;
    @XmlAttribute(name = "Removal")
    protected Boolean removal;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "TypicalTravelTime")
    protected String typicalTravelTime;
    @XmlAttribute(name = "Amount")
    protected Double amount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    protected Integer decimalPlaces;

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDescription }
     *     
     */
    public ArrayOfDescription getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDescription }
     *     
     */
    public void setDescriptions(ArrayOfDescription value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the notificationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationRequired() {
        return notificationRequired;
    }

    /**
     * Sets the value of the notificationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationRequired(String value) {
        this.notificationRequired = value;
    }

    /**
     * Gets the value of the transportationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationCode() {
        return transportationCode;
    }

    /**
     * Sets the value of the transportationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationCode(String value) {
        this.transportationCode = value;
    }

    /**
     * Gets the value of the codeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDetail() {
        return codeDetail;
    }

    /**
     * Sets the value of the codeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDetail(String value) {
        this.codeDetail = value;
    }

    /**
     * Gets the value of the removal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRemoval() {
        if (removal == null) {
            return false;
        } else {
            return removal;
        }
    }

    /**
     * Sets the value of the removal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoval(Boolean value) {
        this.removal = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the typicalTravelTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypicalTravelTime() {
        return typicalTravelTime;
    }

    /**
     * Sets the value of the typicalTravelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypicalTravelTime(String value) {
        this.typicalTravelTime = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimalPlaces(Integer value) {
        this.decimalPlaces = value;
    }

}
