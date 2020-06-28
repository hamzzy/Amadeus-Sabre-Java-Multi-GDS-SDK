
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryFareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryFareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItineraryReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLPassengerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceFees" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryServiceFeesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryFareType", propOrder = {
    "amount",
    "tax",
    "currency",
    "itineraryReference",
    "segmentReference",
    "segmentInfo",
    "passengerType",
    "xmlPassengerID",
    "description",
    "serviceFees"
})
public class AncillaryFareType {

    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Tax", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "ItineraryReference")
    protected String itineraryReference;
    @XmlElement(name = "SegmentReference")
    protected String segmentReference;
    @XmlElement(name = "SegmentInfo")
    protected String segmentInfo;
    @XmlElement(name = "PassengerType")
    protected String passengerType;
    @XmlElement(name = "XMLPassengerID")
    protected int xmlPassengerID;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ServiceFees")
    protected AncillaryServiceFeesType serviceFees;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the itineraryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryReference() {
        return itineraryReference;
    }

    /**
     * Sets the value of the itineraryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryReference(String value) {
        this.itineraryReference = value;
    }

    /**
     * Gets the value of the segmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentReference(String value) {
        this.segmentReference = value;
    }

    /**
     * Gets the value of the segmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentInfo() {
        return segmentInfo;
    }

    /**
     * Sets the value of the segmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentInfo(String value) {
        this.segmentInfo = value;
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
     * Gets the value of the xmlPassengerID property.
     * 
     */
    public int getXMLPassengerID() {
        return xmlPassengerID;
    }

    /**
     * Sets the value of the xmlPassengerID property.
     * 
     */
    public void setXMLPassengerID(int value) {
        this.xmlPassengerID = value;
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
     * Gets the value of the serviceFees property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceFeesType }
     *     
     */
    public AncillaryServiceFeesType getServiceFees() {
        return serviceFees;
    }

    /**
     * Sets the value of the serviceFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceFeesType }
     *     
     */
    public void setServiceFees(AncillaryServiceFeesType value) {
        this.serviceFees = value;
    }

}
