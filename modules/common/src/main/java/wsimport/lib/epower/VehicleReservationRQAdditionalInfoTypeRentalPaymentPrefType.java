
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="guarantee"/>
 *     &lt;enumeration value="payment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType")
@XmlEnum
public enum VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType {

    @XmlEnumValue("guarantee")
    GUARANTEE("guarantee"),
    @XmlEnumValue("payment")
    PAYMENT("payment");
    private final String value;

    VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType fromValue(String v) {
        for (VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType c: VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
