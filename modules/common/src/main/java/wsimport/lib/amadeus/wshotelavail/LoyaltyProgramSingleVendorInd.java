
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyProgramSingleVendorInd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoyaltyProgramSingleVendorInd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleVndr"/>
 *     &lt;enumeration value="Alliance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoyaltyProgramSingleVendorInd")
@XmlEnum
public enum LoyaltyProgramSingleVendorInd {

    @XmlEnumValue("SingleVndr")
    SINGLE_VNDR("SingleVndr"),
    @XmlEnumValue("Alliance")
    ALLIANCE("Alliance");
    private final String value;

    LoyaltyProgramSingleVendorInd(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoyaltyProgramSingleVendorInd fromValue(String v) {
        for (LoyaltyProgramSingleVendorInd c: LoyaltyProgramSingleVendorInd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
