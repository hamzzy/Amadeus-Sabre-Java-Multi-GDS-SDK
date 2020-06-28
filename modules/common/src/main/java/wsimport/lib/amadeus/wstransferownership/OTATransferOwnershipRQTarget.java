
package wsimport.lib.amadeus.wstransferownership;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_TransferOwnershipRQTarget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_TransferOwnershipRQTarget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="Production"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_TransferOwnershipRQTarget")
@XmlEnum
public enum OTATransferOwnershipRQTarget {

    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Production")
    PRODUCTION("Production");
    private final String value;

    OTATransferOwnershipRQTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTATransferOwnershipRQTarget fromValue(String v) {
        for (OTATransferOwnershipRQTarget c: OTATransferOwnershipRQTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
