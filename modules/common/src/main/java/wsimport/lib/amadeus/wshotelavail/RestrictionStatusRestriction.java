
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionStatusRestriction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestrictionStatusRestriction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Master"/>
 *     &lt;enumeration value="Arrival"/>
 *     &lt;enumeration value="Departure"/>
 *     &lt;enumeration value="NonGuarantee"/>
 *     &lt;enumeration value="TravelAgent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RestrictionStatusRestriction")
@XmlEnum
public enum RestrictionStatusRestriction {

    @XmlEnumValue("Master")
    MASTER("Master"),
    @XmlEnumValue("Arrival")
    ARRIVAL("Arrival"),
    @XmlEnumValue("Departure")
    DEPARTURE("Departure"),
    @XmlEnumValue("NonGuarantee")
    NON_GUARANTEE("NonGuarantee"),
    @XmlEnumValue("TravelAgent")
    TRAVEL_AGENT("TravelAgent");
    private final String value;

    RestrictionStatusRestriction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestrictionStatusRestriction fromValue(String v) {
        for (RestrictionStatusRestriction c: RestrictionStatusRestriction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
