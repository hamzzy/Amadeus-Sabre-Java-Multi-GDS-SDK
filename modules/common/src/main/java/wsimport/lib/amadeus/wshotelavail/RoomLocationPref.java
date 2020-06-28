
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for RoomLocationPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomLocationPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}RoomLocationPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="RoomLocationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomLocationPref", propOrder = {
    "value"
})
public class RoomLocationPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected RoomLocationPrefPreferLevel preferLevel;
    @XmlAttribute(name = "RoomLocationType")
    protected String roomLocationType;

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
     *     {@link RoomLocationPrefPreferLevel }
     *     
     */
    public RoomLocationPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return RoomLocationPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomLocationPrefPreferLevel }
     *     
     */
    public void setPreferLevel(RoomLocationPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the roomLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomLocationType() {
        return roomLocationType;
    }

    /**
     * Sets the value of the roomLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomLocationType(String value) {
        this.roomLocationType = value;
    }

}
