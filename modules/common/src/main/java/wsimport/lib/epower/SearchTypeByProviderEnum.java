
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchTypeByProviderEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchTypeByProviderEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OnlyAmadeus"/>
 *     &lt;enumeration value="AmadeusAndExtProviders"/>
 *     &lt;enumeration value="OnlyExtProviders"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchTypeByProviderEnum")
@XmlEnum
public enum SearchTypeByProviderEnum {

    @XmlEnumValue("OnlyAmadeus")
    ONLY_AMADEUS("OnlyAmadeus"),
    @XmlEnumValue("AmadeusAndExtProviders")
    AMADEUS_AND_EXT_PROVIDERS("AmadeusAndExtProviders"),
    @XmlEnumValue("OnlyExtProviders")
    ONLY_EXT_PROVIDERS("OnlyExtProviders");
    private final String value;

    SearchTypeByProviderEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchTypeByProviderEnum fromValue(String v) {
        for (SearchTypeByProviderEnum c: SearchTypeByProviderEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
