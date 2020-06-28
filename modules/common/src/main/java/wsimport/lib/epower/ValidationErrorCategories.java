
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationErrorCategories.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationErrorCategories">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="AmadeusAPI"/>
 *     &lt;enumeration value="FatalError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidationErrorCategories")
@XmlEnum
public enum ValidationErrorCategories {

    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("AmadeusAPI")
    AMADEUS_API("AmadeusAPI"),
    @XmlEnumValue("FatalError")
    FATAL_ERROR("FatalError");
    private final String value;

    ValidationErrorCategories(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidationErrorCategories fromValue(String v) {
        for (ValidationErrorCategories c: ValidationErrorCategories.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
