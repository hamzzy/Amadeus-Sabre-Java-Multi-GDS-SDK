
package wsimport.lib.amadeus.pnr.cancel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_CancelRQCancelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_CancelRQCancelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Book"/>
 *     &lt;enumeration value="Quote"/>
 *     &lt;enumeration value="Hold"/>
 *     &lt;enumeration value="Initiate"/>
 *     &lt;enumeration value="Ignore"/>
 *     &lt;enumeration value="Modify"/>
 *     &lt;enumeration value="Commit"/>
 *     &lt;enumeration value="Cancel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_CancelRQCancelType")
@XmlEnum
public enum OTACancelRQCancelType {

    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("Quote")
    QUOTE("Quote"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Commit")
    COMMIT("Commit"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel");
    private final String value;

    OTACancelRQCancelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTACancelRQCancelType fromValue(String v) {
        for (OTACancelRQCancelType c: OTACancelRQCancelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
