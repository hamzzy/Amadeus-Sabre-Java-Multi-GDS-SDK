
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehTypePrefTransmissionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehTypePrefTransmissionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="Manual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehTypePrefTransmissionType")
@XmlEnum
public enum VehTypePrefTransmissionType {

    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    VehTypePrefTransmissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehTypePrefTransmissionType fromValue(String v) {
        for (VehTypePrefTransmissionType c: VehTypePrefTransmissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
