
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Office"/>
 *     &lt;enumeration value="Gsm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhoneTypeEnum")
@XmlEnum
public enum PhoneTypeEnum {

    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Office")
    OFFICE("Office"),
    @XmlEnumValue("Gsm")
    GSM("Gsm");
    private final String value;

    PhoneTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneTypeEnum fromValue(String v) {
        for (PhoneTypeEnum c: PhoneTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
