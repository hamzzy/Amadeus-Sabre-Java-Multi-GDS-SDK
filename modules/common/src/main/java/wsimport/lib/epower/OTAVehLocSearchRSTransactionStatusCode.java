
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_VehLocSearchRSTransactionStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_VehLocSearchRSTransactionStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="End"/>
 *     &lt;enumeration value="Rollback"/>
 *     &lt;enumeration value="InSeries"/>
 *     &lt;enumeration value="Continuation"/>
 *     &lt;enumeration value="Subsequent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_VehLocSearchRSTransactionStatusCode")
@XmlEnum
public enum OTAVehLocSearchRSTransactionStatusCode {

    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("End")
    END("End"),
    @XmlEnumValue("Rollback")
    ROLLBACK("Rollback"),
    @XmlEnumValue("InSeries")
    IN_SERIES("InSeries"),
    @XmlEnumValue("Continuation")
    CONTINUATION("Continuation"),
    @XmlEnumValue("Subsequent")
    SUBSEQUENT("Subsequent");
    private final String value;

    OTAVehLocSearchRSTransactionStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTAVehLocSearchRSTransactionStatusCode fromValue(String v) {
        for (OTAVehLocSearchRSTransactionStatusCode c: OTAVehLocSearchRSTransactionStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
