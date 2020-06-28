
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_InsurancePlanSearchRSTarget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_InsurancePlanSearchRSTarget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="Production"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_InsurancePlanSearchRSTarget")
@XmlEnum
public enum OTAInsurancePlanSearchRSTarget {

    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Production")
    PRODUCTION("Production");
    private final String value;

    OTAInsurancePlanSearchRSTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTAInsurancePlanSearchRSTarget fromValue(String v) {
        for (OTAInsurancePlanSearchRSTarget c: OTAInsurancePlanSearchRSTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
