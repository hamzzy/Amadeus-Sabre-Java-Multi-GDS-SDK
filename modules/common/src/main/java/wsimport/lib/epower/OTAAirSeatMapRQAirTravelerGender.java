
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirSeatMapRQAirTravelerGender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_AirSeatMapRQAirTravelerGender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Male"/>
 *     &lt;enumeration value="Female"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_AirSeatMapRQAirTravelerGender")
@XmlEnum
public enum OTAAirSeatMapRQAirTravelerGender {

    @XmlEnumValue("Male")
    MALE("Male"),
    @XmlEnumValue("Female")
    FEMALE("Female"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    OTAAirSeatMapRQAirTravelerGender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTAAirSeatMapRQAirTravelerGender fromValue(String v) {
        for (OTAAirSeatMapRQAirTravelerGender c: OTAAirSeatMapRQAirTravelerGender.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
