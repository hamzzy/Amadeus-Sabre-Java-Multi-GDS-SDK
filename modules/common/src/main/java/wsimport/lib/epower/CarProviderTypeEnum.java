
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarProviderTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarProviderTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AmadeusProvider"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarProviderTypeEnum")
@XmlEnum
public enum CarProviderTypeEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("AmadeusProvider")
    AMADEUS_PROVIDER("AmadeusProvider");
    private final String value;

    CarProviderTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarProviderTypeEnum fromValue(String v) {
        for (CarProviderTypeEnum c: CarProviderTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
