
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueueSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightProviderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RailProviderType" type="{http://epowerv5.amadeus.com.tr/WS}RailProviderTypeEnum"/>
 *         &lt;element name="HotelProviderType" type="{http://epowerv5.amadeus.com.tr/WS}HotelProviderTypeEnum"/>
 *         &lt;element name="CarProviderType" type="{http://epowerv5.amadeus.com.tr/WS}CarProviderTypeEnum"/>
 *         &lt;element name="DefaultQue" type="{http://epowerv5.amadeus.com.tr/WS}QueSetting" minOccurs="0"/>
 *         &lt;element name="CancellationQue" type="{http://epowerv5.amadeus.com.tr/WS}QueSetting" minOccurs="0"/>
 *         &lt;element name="PendingApproval" type="{http://epowerv5.amadeus.com.tr/WS}QueSetting" minOccurs="0"/>
 *         &lt;element name="ApprovedApproval" type="{http://epowerv5.amadeus.com.tr/WS}QueSetting" minOccurs="0"/>
 *         &lt;element name="DeclinedApproval" type="{http://epowerv5.amadeus.com.tr/WS}QueSetting" minOccurs="0"/>
 *         &lt;element name="TicketedQue" type="{http://epowerv5.amadeus.com.tr/WS}QueSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueSetting", propOrder = {
    "flightProviderType",
    "railProviderType",
    "hotelProviderType",
    "carProviderType",
    "defaultQue",
    "cancellationQue",
    "pendingApproval",
    "approvedApproval",
    "declinedApproval",
    "ticketedQue"
})
public class QueueSetting {

    @XmlElement(name = "FlightProviderType")
    protected String flightProviderType;
    @XmlElement(name = "RailProviderType", required = true)
    @XmlSchemaType(name = "string")
    protected RailProviderTypeEnum railProviderType;
    @XmlElement(name = "HotelProviderType", required = true)
    @XmlSchemaType(name = "string")
    protected HotelProviderTypeEnum hotelProviderType;
    @XmlElement(name = "CarProviderType", required = true)
    @XmlSchemaType(name = "string")
    protected CarProviderTypeEnum carProviderType;
    @XmlElement(name = "DefaultQue")
    protected QueSetting defaultQue;
    @XmlElement(name = "CancellationQue")
    protected QueSetting cancellationQue;
    @XmlElement(name = "PendingApproval")
    protected QueSetting pendingApproval;
    @XmlElement(name = "ApprovedApproval")
    protected QueSetting approvedApproval;
    @XmlElement(name = "DeclinedApproval")
    protected QueSetting declinedApproval;
    @XmlElement(name = "TicketedQue")
    protected QueSetting ticketedQue;

    /**
     * Gets the value of the flightProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightProviderType() {
        return flightProviderType;
    }

    /**
     * Sets the value of the flightProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightProviderType(String value) {
        this.flightProviderType = value;
    }

    /**
     * Gets the value of the railProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link RailProviderTypeEnum }
     *     
     */
    public RailProviderTypeEnum getRailProviderType() {
        return railProviderType;
    }

    /**
     * Sets the value of the railProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailProviderTypeEnum }
     *     
     */
    public void setRailProviderType(RailProviderTypeEnum value) {
        this.railProviderType = value;
    }

    /**
     * Gets the value of the hotelProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProviderTypeEnum }
     *     
     */
    public HotelProviderTypeEnum getHotelProviderType() {
        return hotelProviderType;
    }

    /**
     * Sets the value of the hotelProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProviderTypeEnum }
     *     
     */
    public void setHotelProviderType(HotelProviderTypeEnum value) {
        this.hotelProviderType = value;
    }

    /**
     * Gets the value of the carProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link CarProviderTypeEnum }
     *     
     */
    public CarProviderTypeEnum getCarProviderType() {
        return carProviderType;
    }

    /**
     * Sets the value of the carProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarProviderTypeEnum }
     *     
     */
    public void setCarProviderType(CarProviderTypeEnum value) {
        this.carProviderType = value;
    }

    /**
     * Gets the value of the defaultQue property.
     * 
     * @return
     *     possible object is
     *     {@link QueSetting }
     *     
     */
    public QueSetting getDefaultQue() {
        return defaultQue;
    }

    /**
     * Sets the value of the defaultQue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueSetting }
     *     
     */
    public void setDefaultQue(QueSetting value) {
        this.defaultQue = value;
    }

    /**
     * Gets the value of the cancellationQue property.
     * 
     * @return
     *     possible object is
     *     {@link QueSetting }
     *     
     */
    public QueSetting getCancellationQue() {
        return cancellationQue;
    }

    /**
     * Sets the value of the cancellationQue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueSetting }
     *     
     */
    public void setCancellationQue(QueSetting value) {
        this.cancellationQue = value;
    }

    /**
     * Gets the value of the pendingApproval property.
     * 
     * @return
     *     possible object is
     *     {@link QueSetting }
     *     
     */
    public QueSetting getPendingApproval() {
        return pendingApproval;
    }

    /**
     * Sets the value of the pendingApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueSetting }
     *     
     */
    public void setPendingApproval(QueSetting value) {
        this.pendingApproval = value;
    }

    /**
     * Gets the value of the approvedApproval property.
     * 
     * @return
     *     possible object is
     *     {@link QueSetting }
     *     
     */
    public QueSetting getApprovedApproval() {
        return approvedApproval;
    }

    /**
     * Sets the value of the approvedApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueSetting }
     *     
     */
    public void setApprovedApproval(QueSetting value) {
        this.approvedApproval = value;
    }

    /**
     * Gets the value of the declinedApproval property.
     * 
     * @return
     *     possible object is
     *     {@link QueSetting }
     *     
     */
    public QueSetting getDeclinedApproval() {
        return declinedApproval;
    }

    /**
     * Sets the value of the declinedApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueSetting }
     *     
     */
    public void setDeclinedApproval(QueSetting value) {
        this.declinedApproval = value;
    }

    /**
     * Gets the value of the ticketedQue property.
     * 
     * @return
     *     possible object is
     *     {@link QueSetting }
     *     
     */
    public QueSetting getTicketedQue() {
        return ticketedQue;
    }

    /**
     * Sets the value of the ticketedQue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueSetting }
     *     
     */
    public void setTicketedQue(QueSetting value) {
        this.ticketedQue = value;
    }

}
