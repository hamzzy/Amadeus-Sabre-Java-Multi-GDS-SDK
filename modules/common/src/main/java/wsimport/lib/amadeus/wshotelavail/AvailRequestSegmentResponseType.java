
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailRequestSegmentResponseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailRequestSegmentResponseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PropertyList"/>
 *     &lt;enumeration value="AreaList"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvailRequestSegmentResponseType")
@XmlEnum
public enum AvailRequestSegmentResponseType {

    @XmlEnumValue("PropertyList")
    PROPERTY_LIST("PropertyList"),
    @XmlEnumValue("AreaList")
    AREA_LIST("AreaList");
    private final String value;

    AvailRequestSegmentResponseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailRequestSegmentResponseType fromValue(String v) {
        for (AvailRequestSegmentResponseType c: AvailRequestSegmentResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
