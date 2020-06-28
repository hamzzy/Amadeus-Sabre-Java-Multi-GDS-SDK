
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentFormPrefPreferLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentFormPrefPreferLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Only"/>
 *     &lt;enumeration value="Unacceptable"/>
 *     &lt;enumeration value="Preferred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentFormPrefPreferLevel")
@XmlEnum
public enum PaymentFormPrefPreferLevel {

    @XmlEnumValue("Only")
    ONLY("Only"),
    @XmlEnumValue("Unacceptable")
    UNACCEPTABLE("Unacceptable"),
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred");
    private final String value;

    PaymentFormPrefPreferLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentFormPrefPreferLevel fromValue(String v) {
        for (PaymentFormPrefPreferLevel c: PaymentFormPrefPreferLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
