
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for RoomAmenity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomAmenity">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}RoomAmenityPreferLevel" default="Preferred" />
 *       &lt;attribute name="RoomAmenity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomAmenity", propOrder = {
    "value"
})
public class RoomAmenity {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected RoomAmenityPreferLevel preferLevel;
    @XmlAttribute(name = "RoomAmenity")
    protected String roomAmenity;
    @XmlAttribute(name = "Quantity")
    protected Integer quantity;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link RoomAmenityPreferLevel }
     *     
     */
    public RoomAmenityPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return RoomAmenityPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomAmenityPreferLevel }
     *     
     */
    public void setPreferLevel(RoomAmenityPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the roomAmenity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomAmenity() {
        return roomAmenity;
    }

    /**
     * Sets the value of the roomAmenity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomAmenity(String value) {
        this.roomAmenity = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

}
