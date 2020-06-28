
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RailProviderTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RailProviderTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SNCFProvider"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RailProviderTypeEnum")
@XmlEnum
public enum RailProviderTypeEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SNCFProvider")
    SNCF_PROVIDER("SNCFProvider");
    private final String value;

    RailProviderTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RailProviderTypeEnum fromValue(String v) {
        for (RailProviderTypeEnum c: RailProviderTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
