
package wsimport.lib.amadeus.pnr.read;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirReadRequestFF_RequestCriteria.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirReadRequestFF_RequestCriteria">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReturnLevelAndAbove"/>
 *     &lt;enumeration value="ReturnLevelAndBelow"/>
 *     &lt;enumeration value="ReturnOnlySpecifiedLevel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirReadRequestFF_RequestCriteria")
@XmlEnum
public enum AirReadRequestFFRequestCriteria {

    @XmlEnumValue("ReturnLevelAndAbove")
    RETURN_LEVEL_AND_ABOVE("ReturnLevelAndAbove"),
    @XmlEnumValue("ReturnLevelAndBelow")
    RETURN_LEVEL_AND_BELOW("ReturnLevelAndBelow"),
    @XmlEnumValue("ReturnOnlySpecifiedLevel")
    RETURN_ONLY_SPECIFIED_LEVEL("ReturnOnlySpecifiedLevel");
    private final String value;

    AirReadRequestFFRequestCriteria(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirReadRequestFFRequestCriteria fromValue(String v) {
        for (AirReadRequestFFRequestCriteria c: AirReadRequestFFRequestCriteria.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
