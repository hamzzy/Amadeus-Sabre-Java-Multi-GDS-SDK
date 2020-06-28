
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeDetailActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeDetailActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Modify"/>
 *     &lt;enumeration value="Delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeDetailActionTypes")
@XmlEnum
public enum ChangeDetailActionTypes {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Delete")
    DELETE("Delete");
    private final String value;

    ChangeDetailActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeDetailActionTypes fromValue(String v) {
        for (ChangeDetailActionTypes c: ChangeDetailActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
