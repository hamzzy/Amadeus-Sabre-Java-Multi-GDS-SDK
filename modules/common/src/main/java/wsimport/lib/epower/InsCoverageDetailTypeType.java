
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsCoverageDetailTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsCoverageDetailTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleTrip"/>
 *     &lt;enumeration value="MultiTrip"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InsCoverageDetailTypeType")
@XmlEnum
public enum InsCoverageDetailTypeType {

    @XmlEnumValue("SingleTrip")
    SINGLE_TRIP("SingleTrip"),
    @XmlEnumValue("MultiTrip")
    MULTI_TRIP("MultiTrip"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    InsCoverageDetailTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsCoverageDetailTypeType fromValue(String v) {
        for (InsCoverageDetailTypeType c: InsCoverageDetailTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
