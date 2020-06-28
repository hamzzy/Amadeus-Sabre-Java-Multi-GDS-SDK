
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundableTypesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundableTypesEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllFlights"/>
 *     &lt;enumeration value="OnlyRefundable"/>
 *     &lt;enumeration value="OnlyNonRefundable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefundableTypesEnum")
@XmlEnum
public enum RefundableTypesEnum {

    @XmlEnumValue("AllFlights")
    ALL_FLIGHTS("AllFlights"),
    @XmlEnumValue("OnlyRefundable")
    ONLY_REFUNDABLE("OnlyRefundable"),
    @XmlEnumValue("OnlyNonRefundable")
    ONLY_NON_REFUNDABLE("OnlyNonRefundable");
    private final String value;

    RefundableTypesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundableTypesEnum fromValue(String v) {
        for (RefundableTypesEnum c: RefundableTypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
