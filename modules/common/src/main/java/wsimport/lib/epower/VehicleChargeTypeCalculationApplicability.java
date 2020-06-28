
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleChargeTypeCalculationApplicability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleChargeTypeCalculationApplicability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FromPickupLocation"/>
 *     &lt;enumeration value="FromDropoffLocation"/>
 *     &lt;enumeration value="BeforePickup"/>
 *     &lt;enumeration value="AfterDropoff"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleChargeTypeCalculationApplicability")
@XmlEnum
public enum VehicleChargeTypeCalculationApplicability {

    @XmlEnumValue("FromPickupLocation")
    FROM_PICKUP_LOCATION("FromPickupLocation"),
    @XmlEnumValue("FromDropoffLocation")
    FROM_DROPOFF_LOCATION("FromDropoffLocation"),
    @XmlEnumValue("BeforePickup")
    BEFORE_PICKUP("BeforePickup"),
    @XmlEnumValue("AfterDropoff")
    AFTER_DROPOFF("AfterDropoff");
    private final String value;

    VehicleChargeTypeCalculationApplicability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleChargeTypeCalculationApplicability fromValue(String v) {
        for (VehicleChargeTypeCalculationApplicability c: VehicleChargeTypeCalculationApplicability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
