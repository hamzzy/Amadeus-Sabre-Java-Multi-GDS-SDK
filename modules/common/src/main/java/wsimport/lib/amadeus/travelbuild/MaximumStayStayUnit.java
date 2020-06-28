
package wsimport.lib.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaximumStayStayUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaximumStayStayUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Minutes"/>
 *     &lt;enumeration value="Hours"/>
 *     &lt;enumeration value="Days"/>
 *     &lt;enumeration value="Months"/>
 *     &lt;enumeration value="MON"/>
 *     &lt;enumeration value="TUES"/>
 *     &lt;enumeration value="WED"/>
 *     &lt;enumeration value="THU"/>
 *     &lt;enumeration value="FRI"/>
 *     &lt;enumeration value="SAT"/>
 *     &lt;enumeration value="SUN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaximumStayStayUnit")
@XmlEnum
public enum MaximumStayStayUnit {

    @XmlEnumValue("Minutes")
    MINUTES("Minutes"),
    @XmlEnumValue("Hours")
    HOURS("Hours"),
    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Months")
    MONTHS("Months"),
    MON("MON"),
    TUES("TUES"),
    WED("WED"),
    THU("THU"),
    FRI("FRI"),
    SAT("SAT"),
    SUN("SUN");
    private final String value;

    MaximumStayStayUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaximumStayStayUnit fromValue(String v) {
        for (MaximumStayStayUnit c: MaximumStayStayUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
