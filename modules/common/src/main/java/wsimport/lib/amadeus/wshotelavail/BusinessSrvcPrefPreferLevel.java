
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessSrvcPrefPreferLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessSrvcPrefPreferLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Only"/>
 *     &lt;enumeration value="Unacceptable"/>
 *     &lt;enumeration value="Preferred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessSrvcPrefPreferLevel")
@XmlEnum
public enum BusinessSrvcPrefPreferLevel {

    @XmlEnumValue("Only")
    ONLY("Only"),
    @XmlEnumValue("Unacceptable")
    UNACCEPTABLE("Unacceptable"),
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred");
    private final String value;

    BusinessSrvcPrefPreferLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessSrvcPrefPreferLevel fromValue(String v) {
        for (BusinessSrvcPrefPreferLevel c: BusinessSrvcPrefPreferLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
