
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalRateTypePickupReturnRuleRuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleRentalRateTypePickupReturnRuleRuleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EarliestPickup"/>
 *     &lt;enumeration value="LatestPickup"/>
 *     &lt;enumeration value="LatestReturn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleRentalRateTypePickupReturnRuleRuleType")
@XmlEnum
public enum VehicleRentalRateTypePickupReturnRuleRuleType {

    @XmlEnumValue("EarliestPickup")
    EARLIEST_PICKUP("EarliestPickup"),
    @XmlEnumValue("LatestPickup")
    LATEST_PICKUP("LatestPickup"),
    @XmlEnumValue("LatestReturn")
    LATEST_RETURN("LatestReturn");
    private final String value;

    VehicleRentalRateTypePickupReturnRuleRuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleRentalRateTypePickupReturnRuleRuleType fromValue(String v) {
        for (VehicleRentalRateTypePickupReturnRuleRuleType c: VehicleRentalRateTypePickupReturnRuleRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
