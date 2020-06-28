
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_HotelAvailRSTransactionStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_HotelAvailRSTransactionStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="End"/>
 *     &lt;enumeration value="Rollback"/>
 *     &lt;enumeration value="InSeries"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_HotelAvailRSTransactionStatusCode")
@XmlEnum
public enum OTAHotelAvailRSTransactionStatusCode {

    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("End")
    END("End"),
    @XmlEnumValue("Rollback")
    ROLLBACK("Rollback"),
    @XmlEnumValue("InSeries")
    IN_SERIES("InSeries");
    private final String value;

    OTAHotelAvailRSTransactionStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTAHotelAvailRSTransactionStatusCode fromValue(String v) {
        for (OTAHotelAvailRSTransactionStatusCode c: OTAHotelAvailRSTransactionStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
