
package wsimport.lib.amadeus.pnr.read;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MembershipSingleVendorInd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MembershipSingleVendorInd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleVndr"/>
 *     &lt;enumeration value="Alliance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MembershipSingleVendorInd")
@XmlEnum
public enum MembershipSingleVendorInd {

    @XmlEnumValue("SingleVndr")
    SINGLE_VNDR("SingleVndr"),
    @XmlEnumValue("Alliance")
    ALLIANCE("Alliance");
    private final String value;

    MembershipSingleVendorInd(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MembershipSingleVendorInd fromValue(String v) {
        for (MembershipSingleVendorInd c: MembershipSingleVendorInd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
