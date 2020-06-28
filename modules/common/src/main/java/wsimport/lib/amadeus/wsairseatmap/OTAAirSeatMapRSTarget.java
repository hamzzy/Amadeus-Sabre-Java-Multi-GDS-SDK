
package wsimport.lib.amadeus.wsairseatmap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirSeatMapRSTarget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_AirSeatMapRSTarget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="Production"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_AirSeatMapRSTarget")
@XmlEnum
public enum OTAAirSeatMapRSTarget {

    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Production")
    PRODUCTION("Production");
    private final String value;

    OTAAirSeatMapRSTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTAAirSeatMapRSTarget fromValue(String v) {
        for (OTAAirSeatMapRSTarget c: OTAAirSeatMapRSTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
