
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionStatusStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestrictionStatusStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Close"/>
 *     &lt;enumeration value="ClosedOnArrival"/>
 *     &lt;enumeration value="ClosedOnArrivalOnRequest"/>
 *     &lt;enumeration value="OnRequest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RestrictionStatusStatus")
@XmlEnum
public enum RestrictionStatusStatus {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Close")
    CLOSE("Close"),
    @XmlEnumValue("ClosedOnArrival")
    CLOSED_ON_ARRIVAL("ClosedOnArrival"),
    @XmlEnumValue("ClosedOnArrivalOnRequest")
    CLOSED_ON_ARRIVAL_ON_REQUEST("ClosedOnArrivalOnRequest"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest");
    private final String value;

    RestrictionStatusStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestrictionStatusStatus fromValue(String v) {
        for (RestrictionStatusStatus c: RestrictionStatusStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
