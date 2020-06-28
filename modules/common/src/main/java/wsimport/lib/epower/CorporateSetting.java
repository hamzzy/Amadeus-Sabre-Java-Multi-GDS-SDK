
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightProviderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RailProviderType" type="{http://epowerv5.amadeus.com.tr/WS}RailProviderTypeEnum"/>
 *         &lt;element name="HotelProviderType" type="{http://epowerv5.amadeus.com.tr/WS}HotelProviderTypeEnum"/>
 *         &lt;element name="CarProviderType" type="{http://epowerv5.amadeus.com.tr/WS}CarProviderTypeEnum"/>
 *         &lt;element name="DisplayRule" type="{http://epowerv5.amadeus.com.tr/WS}DisplayRuleEnum"/>
 *         &lt;element name="TripApprovalRule" type="{http://epowerv5.amadeus.com.tr/WS}TripApprovalRuleEnum"/>
 *         &lt;element name="RequireJustificationRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RequireJustificationOnlyFlightRule" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RequireJusificationForDeclineProcess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ApplyApprovalRules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowBookingOnlyArrangerOrSelectedMembers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowETicketForNext" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateSetting", propOrder = {
    "flightProviderType",
    "railProviderType",
    "hotelProviderType",
    "carProviderType",
    "displayRule",
    "tripApprovalRule",
    "requireJustificationRule",
    "requireJustificationOnlyFlightRule",
    "requireJusificationForDeclineProcess",
    "applyApprovalRules",
    "allowBookingOnlyArrangerOrSelectedMembers",
    "allowETicketForNext"
})
public class CorporateSetting {

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
    @XmlElement(name = "DisplayRule", required = true)
    @XmlSchemaType(name = "string")
    protected DisplayRuleEnum displayRule;
    @XmlElement(name = "TripApprovalRule", required = true)
    @XmlSchemaType(name = "string")
    protected TripApprovalRuleEnum tripApprovalRule;
    @XmlElement(name = "RequireJustificationRule")
    protected boolean requireJustificationRule;
    @XmlElement(name = "RequireJustificationOnlyFlightRule")
    protected boolean requireJustificationOnlyFlightRule;
    @XmlElement(name = "RequireJusificationForDeclineProcess")
    protected boolean requireJusificationForDeclineProcess;
    @XmlElement(name = "ApplyApprovalRules")
    protected String applyApprovalRules;
    @XmlElement(name = "AllowBookingOnlyArrangerOrSelectedMembers", required = true, type = Boolean.class, nillable = true)
    protected Boolean allowBookingOnlyArrangerOrSelectedMembers;
    @XmlElement(name = "AllowETicketForNext", required = true, type = Integer.class, nillable = true)
    protected Integer allowETicketForNext;

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
     * Gets the value of the displayRule property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayRuleEnum }
     *     
     */
    public DisplayRuleEnum getDisplayRule() {
        return displayRule;
    }

    /**
     * Sets the value of the displayRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayRuleEnum }
     *     
     */
    public void setDisplayRule(DisplayRuleEnum value) {
        this.displayRule = value;
    }

    /**
     * Gets the value of the tripApprovalRule property.
     * 
     * @return
     *     possible object is
     *     {@link TripApprovalRuleEnum }
     *     
     */
    public TripApprovalRuleEnum getTripApprovalRule() {
        return tripApprovalRule;
    }

    /**
     * Sets the value of the tripApprovalRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripApprovalRuleEnum }
     *     
     */
    public void setTripApprovalRule(TripApprovalRuleEnum value) {
        this.tripApprovalRule = value;
    }

    /**
     * Gets the value of the requireJustificationRule property.
     * 
     */
    public boolean isRequireJustificationRule() {
        return requireJustificationRule;
    }

    /**
     * Sets the value of the requireJustificationRule property.
     * 
     */
    public void setRequireJustificationRule(boolean value) {
        this.requireJustificationRule = value;
    }

    /**
     * Gets the value of the requireJustificationOnlyFlightRule property.
     * 
     */
    public boolean isRequireJustificationOnlyFlightRule() {
        return requireJustificationOnlyFlightRule;
    }

    /**
     * Sets the value of the requireJustificationOnlyFlightRule property.
     * 
     */
    public void setRequireJustificationOnlyFlightRule(boolean value) {
        this.requireJustificationOnlyFlightRule = value;
    }

    /**
     * Gets the value of the requireJusificationForDeclineProcess property.
     * 
     */
    public boolean isRequireJusificationForDeclineProcess() {
        return requireJusificationForDeclineProcess;
    }

    /**
     * Sets the value of the requireJusificationForDeclineProcess property.
     * 
     */
    public void setRequireJusificationForDeclineProcess(boolean value) {
        this.requireJusificationForDeclineProcess = value;
    }

    /**
     * Gets the value of the applyApprovalRules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyApprovalRules() {
        return applyApprovalRules;
    }

    /**
     * Sets the value of the applyApprovalRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyApprovalRules(String value) {
        this.applyApprovalRules = value;
    }

    /**
     * Gets the value of the allowBookingOnlyArrangerOrSelectedMembers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowBookingOnlyArrangerOrSelectedMembers() {
        return allowBookingOnlyArrangerOrSelectedMembers;
    }

    /**
     * Sets the value of the allowBookingOnlyArrangerOrSelectedMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowBookingOnlyArrangerOrSelectedMembers(Boolean value) {
        this.allowBookingOnlyArrangerOrSelectedMembers = value;
    }

    /**
     * Gets the value of the allowETicketForNext property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllowETicketForNext() {
        return allowETicketForNext;
    }

    /**
     * Sets the value of the allowETicketForNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllowETicketForNext(Integer value) {
        this.allowETicketForNext = value;
    }

}
