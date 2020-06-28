
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificationSingleVendorInd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificationSingleVendorInd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleVndr"/>
 *     &lt;enumeration value="Alliance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CertificationSingleVendorInd")
@XmlEnum
public enum CertificationSingleVendorInd {

    @XmlEnumValue("SingleVndr")
    SINGLE_VNDR("SingleVndr"),
    @XmlEnumValue("Alliance")
    ALLIANCE("Alliance");
    private final String value;

    CertificationSingleVendorInd(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertificationSingleVendorInd fromValue(String v) {
        for (CertificationSingleVendorInd c: CertificationSingleVendorInd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
