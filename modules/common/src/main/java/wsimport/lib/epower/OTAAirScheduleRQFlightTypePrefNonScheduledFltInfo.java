
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirScheduleRQFlightTypePrefNonScheduledFltInfo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_AirScheduleRQFlightTypePrefNonScheduledFltInfo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ChartersOnly"/>
 *     &lt;enumeration value="ExcludeCharters"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_AirScheduleRQFlightTypePrefNonScheduledFltInfo")
@XmlEnum
public enum OTAAirScheduleRQFlightTypePrefNonScheduledFltInfo {

    @XmlEnumValue("ChartersOnly")
    CHARTERS_ONLY("ChartersOnly"),
    @XmlEnumValue("ExcludeCharters")
    EXCLUDE_CHARTERS("ExcludeCharters"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    OTAAirScheduleRQFlightTypePrefNonScheduledFltInfo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTAAirScheduleRQFlightTypePrefNonScheduledFltInfo fromValue(String v) {
        for (OTAAirScheduleRQFlightTypePrefNonScheduledFltInfo c: OTAAirScheduleRQFlightTypePrefNonScheduledFltInfo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
