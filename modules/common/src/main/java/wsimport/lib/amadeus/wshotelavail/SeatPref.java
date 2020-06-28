
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatPref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}SeatPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatPreference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatPref")
public class SeatPref {

    @XmlAttribute(name = "PreferLevel")
    protected SeatPrefPreferLevel preferLevel;
    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "SeatPreference")
    protected String seatPreference;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SeatPrefPreferLevel }
     *     
     */
    public SeatPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return SeatPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatPrefPreferLevel }
     *     
     */
    public void setPreferLevel(SeatPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the seatPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPreference() {
        return seatPreference;
    }

    /**
     * Sets the value of the seatPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPreference(String value) {
        this.seatPreference = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

}
