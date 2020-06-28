
package wsimport.lib.amadeus.pnr.read;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_ReadRQTarget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_ReadRQTarget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="Production"/>
 *     &lt;enumeration value="WSP"/>
 *     &lt;enumeration value="GAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_ReadRQTarget")
@XmlEnum
public enum OTAReadRQTarget {

    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Production")
    PRODUCTION("Production"),
    WSP("WSP"),
    GAL("GAL");
    private final String value;

    OTAReadRQTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTAReadRQTarget fromValue(String v) {
        for (OTAReadRQTarget c: OTAReadRQTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
