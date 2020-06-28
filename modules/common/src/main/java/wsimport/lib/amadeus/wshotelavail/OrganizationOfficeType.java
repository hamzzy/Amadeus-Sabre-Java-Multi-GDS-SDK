
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationOfficeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationOfficeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Main"/>
 *     &lt;enumeration value="Field"/>
 *     &lt;enumeration value="Division"/>
 *     &lt;enumeration value="Regional"/>
 *     &lt;enumeration value="Remote"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganizationOfficeType")
@XmlEnum
public enum OrganizationOfficeType {

    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("Field")
    FIELD("Field"),
    @XmlEnumValue("Division")
    DIVISION("Division"),
    @XmlEnumValue("Regional")
    REGIONAL("Regional"),
    @XmlEnumValue("Remote")
    REMOTE("Remote");
    private final String value;

    OrganizationOfficeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganizationOfficeType fromValue(String v) {
        for (OrganizationOfficeType c: OrganizationOfficeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
