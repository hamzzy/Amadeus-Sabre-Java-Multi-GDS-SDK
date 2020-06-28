
package wsimport.lib.amadeus.pnr.read;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirReadRequestInfoToReturn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirReadRequestInfoToReturn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ListofFF_StatusLevels"/>
 *     &lt;enumeration value="NoFF_Status"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirReadRequestInfoToReturn")
@XmlEnum
public enum AirReadRequestInfoToReturn {

    @XmlEnumValue("ListofFF_StatusLevels")
    LISTOF_FF_STATUS_LEVELS("ListofFF_StatusLevels"),
    @XmlEnumValue("NoFF_Status")
    NO_FF_STATUS("NoFF_Status"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    AirReadRequestInfoToReturn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirReadRequestInfoToReturn fromValue(String v) {
        for (AirReadRequestInfoToReturn c: AirReadRequestInfoToReturn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
