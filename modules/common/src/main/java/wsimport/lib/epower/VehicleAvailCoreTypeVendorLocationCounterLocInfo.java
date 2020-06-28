
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleAvailCoreTypeVendorLocationCounterLocInfo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleAvailCoreTypeVendorLocationCounterLocInfo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WalkToCar"/>
 *     &lt;enumeration value="ShuttleToCar"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleAvailCoreTypeVendorLocationCounterLocInfo")
@XmlEnum
public enum VehicleAvailCoreTypeVendorLocationCounterLocInfo {

    @XmlEnumValue("WalkToCar")
    WALK_TO_CAR("WalkToCar"),
    @XmlEnumValue("ShuttleToCar")
    SHUTTLE_TO_CAR("ShuttleToCar");
    private final String value;

    VehicleAvailCoreTypeVendorLocationCounterLocInfo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleAvailCoreTypeVendorLocationCounterLocInfo fromValue(String v) {
        for (VehicleAvailCoreTypeVendorLocationCounterLocInfo c: VehicleAvailCoreTypeVendorLocationCounterLocInfo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
