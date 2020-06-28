
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirScheduleRQFlightTypePrefRoutingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_AirScheduleRQFlightTypePrefRoutingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Mirror"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_AirScheduleRQFlightTypePrefRoutingType")
@XmlEnum
public enum OTAAirScheduleRQFlightTypePrefRoutingType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Mirror")
    MIRROR("Mirror");
    private final String value;

    OTAAirScheduleRQFlightTypePrefRoutingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTAAirScheduleRQFlightTypePrefRoutingType fromValue(String v) {
        for (OTAAirScheduleRQFlightTypePrefRoutingType c: OTAAirScheduleRQFlightTypePrefRoutingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
