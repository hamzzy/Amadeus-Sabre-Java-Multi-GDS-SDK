
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailRequestSegmentAvailReqType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailRequestSegmentAvailReqType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Room"/>
 *     &lt;enumeration value="NonRoom"/>
 *     &lt;enumeration value="Both"/>
 *     &lt;enumeration value="PricingDetails"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvailRequestSegmentAvailReqType")
@XmlEnum
public enum AvailRequestSegmentAvailReqType {

    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("NonRoom")
    NON_ROOM("NonRoom"),
    @XmlEnumValue("Both")
    BOTH("Both"),
    @XmlEnumValue("PricingDetails")
    PRICING_DETAILS("PricingDetails");
    private final String value;

    AvailRequestSegmentAvailReqType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailRequestSegmentAvailReqType fromValue(String v) {
        for (AvailRequestSegmentAvailReqType c: AvailRequestSegmentAvailReqType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
