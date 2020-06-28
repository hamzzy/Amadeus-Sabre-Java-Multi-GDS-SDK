
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalRateTypeRateRestrictionsOneWayPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleRentalRateTypeRateRestrictionsOneWayPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OneWayAllowed"/>
 *     &lt;enumeration value="OneWayNotAllowed"/>
 *     &lt;enumeration value="RestrictedOneWay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleRentalRateTypeRateRestrictionsOneWayPolicy")
@XmlEnum
public enum VehicleRentalRateTypeRateRestrictionsOneWayPolicy {

    @XmlEnumValue("OneWayAllowed")
    ONE_WAY_ALLOWED("OneWayAllowed"),
    @XmlEnumValue("OneWayNotAllowed")
    ONE_WAY_NOT_ALLOWED("OneWayNotAllowed"),
    @XmlEnumValue("RestrictedOneWay")
    RESTRICTED_ONE_WAY("RestrictedOneWay");
    private final String value;

    VehicleRentalRateTypeRateRestrictionsOneWayPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleRentalRateTypeRateRestrictionsOneWayPolicy fromValue(String v) {
        for (VehicleRentalRateTypeRateRestrictionsOneWayPolicy c: VehicleRentalRateTypeRateRestrictionsOneWayPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
