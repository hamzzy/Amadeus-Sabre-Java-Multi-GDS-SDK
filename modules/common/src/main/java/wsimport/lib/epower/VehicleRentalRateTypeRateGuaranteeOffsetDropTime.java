
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalRateTypeRateGuaranteeOffsetDropTime.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleRentalRateTypeRateGuaranteeOffsetDropTime">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BeforeArrival"/>
 *     &lt;enumeration value="AfterBooking"/>
 *     &lt;enumeration value="AfterConfirmation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleRentalRateTypeRateGuaranteeOffsetDropTime")
@XmlEnum
public enum VehicleRentalRateTypeRateGuaranteeOffsetDropTime {

    @XmlEnumValue("BeforeArrival")
    BEFORE_ARRIVAL("BeforeArrival"),
    @XmlEnumValue("AfterBooking")
    AFTER_BOOKING("AfterBooking"),
    @XmlEnumValue("AfterConfirmation")
    AFTER_CONFIRMATION("AfterConfirmation");
    private final String value;

    VehicleRentalRateTypeRateGuaranteeOffsetDropTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleRentalRateTypeRateGuaranteeOffsetDropTime fromValue(String v) {
        for (VehicleRentalRateTypeRateGuaranteeOffsetDropTime c: VehicleRentalRateTypeRateGuaranteeOffsetDropTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
