
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehTypePrefClassPref.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehTypePrefClassPref">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Only"/>
 *     &lt;enumeration value="Unacceptable"/>
 *     &lt;enumeration value="Preferred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehTypePrefClassPref")
@XmlEnum
public enum VehTypePrefClassPref {

    @XmlEnumValue("Only")
    ONLY("Only"),
    @XmlEnumValue("Unacceptable")
    UNACCEPTABLE("Unacceptable"),
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred");
    private final String value;

    VehTypePrefClassPref(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehTypePrefClassPref fromValue(String v) {
        for (VehTypePrefClassPref c: VehTypePrefClassPref.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
