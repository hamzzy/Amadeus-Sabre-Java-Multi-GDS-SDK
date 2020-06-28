
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommissionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Partial"/>
 *     &lt;enumeration value="Non-paying"/>
 *     &lt;enumeration value="No-show"/>
 *     &lt;enumeration value="Adjustment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommissionStatusType")
@XmlEnum
public enum CommissionStatusType {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial"),
    @XmlEnumValue("Non-paying")
    NON_PAYING("Non-paying"),
    @XmlEnumValue("No-show")
    NO_SHOW("No-show"),
    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment");
    private final String value;

    CommissionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommissionStatusType fromValue(String v) {
        for (CommissionStatusType c: CommissionStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
