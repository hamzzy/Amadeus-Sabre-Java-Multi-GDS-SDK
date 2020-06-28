
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VehicleRentalCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickupAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
 *         &lt;element name="PickUpLocation" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalCoreTypePickUpLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnLocation" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalCoreTypeReturnLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="StartChargesDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="StopChargesDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="OneWayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MultiIslandRentalDays" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="DistUnitName" type="{http://epowerv5.amadeus.com.tr/WS}DistanceUnitNameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalCoreType", propOrder = {
    "pickupAddress",
    "pickUpLocation",
    "returnLocation"
})
@XmlSeeAlso({
    OTAVehRateRuleRSVehRentalCore.class
})
public class VehicleRentalCoreType {

    @XmlElement(name = "PickupAddress")
    protected AddressType pickupAddress;
    @XmlElement(name = "PickUpLocation")
    protected List<VehicleRentalCoreTypePickUpLocation> pickUpLocation;
    @XmlElement(name = "ReturnLocation")
    protected VehicleRentalCoreTypeReturnLocation returnLocation;
    @XmlAttribute(name = "PickUpDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickUpDateTime;
    @XmlAttribute(name = "ReturnDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateTime;
    @XmlAttribute(name = "StartChargesDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startChargesDateTime;
    @XmlAttribute(name = "StopChargesDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopChargesDateTime;
    @XmlAttribute(name = "OneWayIndicator")
    protected Boolean oneWayIndicator;
    @XmlAttribute(name = "MultiIslandRentalDays")
    protected BigInteger multiIslandRentalDays;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "DistUnitName")
    protected DistanceUnitNameType distUnitName;

    /**
     * Gets the value of the pickupAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPickupAddress() {
        return pickupAddress;
    }

    /**
     * Sets the value of the pickupAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPickupAddress(AddressType value) {
        this.pickupAddress = value;
    }

    /**
     * Gets the value of the pickUpLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickUpLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickUpLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalCoreTypePickUpLocation }
     * 
     * 
     */
    public List<VehicleRentalCoreTypePickUpLocation> getPickUpLocation() {
        if (pickUpLocation == null) {
            pickUpLocation = new ArrayList<VehicleRentalCoreTypePickUpLocation>();
        }
        return this.pickUpLocation;
    }

    /**
     * Gets the value of the returnLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreTypeReturnLocation }
     *     
     */
    public VehicleRentalCoreTypeReturnLocation getReturnLocation() {
        return returnLocation;
    }

    /**
     * Sets the value of the returnLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreTypeReturnLocation }
     *     
     */
    public void setReturnLocation(VehicleRentalCoreTypeReturnLocation value) {
        this.returnLocation = value;
    }

    /**
     * Gets the value of the pickUpDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDateTime() {
        return pickUpDateTime;
    }

    /**
     * Sets the value of the pickUpDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDateTime(XMLGregorianCalendar value) {
        this.pickUpDateTime = value;
    }

    /**
     * Gets the value of the returnDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDateTime() {
        return returnDateTime;
    }

    /**
     * Sets the value of the returnDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDateTime(XMLGregorianCalendar value) {
        this.returnDateTime = value;
    }

    /**
     * Gets the value of the startChargesDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartChargesDateTime() {
        return startChargesDateTime;
    }

    /**
     * Sets the value of the startChargesDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartChargesDateTime(XMLGregorianCalendar value) {
        this.startChargesDateTime = value;
    }

    /**
     * Gets the value of the stopChargesDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStopChargesDateTime() {
        return stopChargesDateTime;
    }

    /**
     * Sets the value of the stopChargesDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStopChargesDateTime(XMLGregorianCalendar value) {
        this.stopChargesDateTime = value;
    }

    /**
     * Gets the value of the oneWayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneWayIndicator() {
        return oneWayIndicator;
    }

    /**
     * Sets the value of the oneWayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneWayIndicator(Boolean value) {
        this.oneWayIndicator = value;
    }

    /**
     * Gets the value of the multiIslandRentalDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultiIslandRentalDays() {
        return multiIslandRentalDays;
    }

    /**
     * Sets the value of the multiIslandRentalDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultiIslandRentalDays(BigInteger value) {
        this.multiIslandRentalDays = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the distUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public DistanceUnitNameType getDistUnitName() {
        return distUnitName;
    }

    /**
     * Sets the value of the distUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public void setDistUnitName(DistanceUnitNameType value) {
        this.distUnitName = value;
    }

}
