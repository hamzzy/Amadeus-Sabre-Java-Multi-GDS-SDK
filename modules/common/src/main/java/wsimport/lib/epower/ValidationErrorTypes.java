
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationErrorTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationErrorTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ValidationError"/>
 *     &lt;enumeration value="AmadeusAPIError"/>
 *     &lt;enumeration value="EpowerInternalError"/>
 *     &lt;enumeration value="EpowerUnhandledError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidationErrorTypes")
@XmlEnum
public enum ValidationErrorTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError"),
    @XmlEnumValue("AmadeusAPIError")
    AMADEUS_API_ERROR("AmadeusAPIError"),
    @XmlEnumValue("EpowerInternalError")
    EPOWER_INTERNAL_ERROR("EpowerInternalError"),
    @XmlEnumValue("EpowerUnhandledError")
    EPOWER_UNHANDLED_ERROR("EpowerUnhandledError");
    private final String value;

    ValidationErrorTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidationErrorTypes fromValue(String v) {
        for (ValidationErrorTypes c: ValidationErrorTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
