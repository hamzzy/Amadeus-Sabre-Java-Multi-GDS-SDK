
package wsimport.lib.amadeus.wsairrules;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirRulesRSTarget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_AirRulesRSTarget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="Production"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_AirRulesRSTarget")
@XmlEnum
public enum OTAAirRulesRSTarget {

    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Production")
    PRODUCTION("Production");
    private final String value;

    OTAAirRulesRSTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTAAirRulesRSTarget fromValue(String v) {
        for (OTAAirRulesRSTarget c: OTAAirRulesRSTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
