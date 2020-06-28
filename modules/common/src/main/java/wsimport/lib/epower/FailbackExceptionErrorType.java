
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailbackExceptionErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailbackExceptionErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SeatTaken"/>
 *     &lt;enumeration value="ScheduleChange"/>
 *     &lt;enumeration value="PriceChange"/>
 *     &lt;enumeration value="FareBasisChange"/>
 *     &lt;enumeration value="PricingFareEror"/>
 *     &lt;enumeration value="AncillaryPriceChange"/>
 *     &lt;enumeration value="FailbackDone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FailbackExceptionErrorType")
@XmlEnum
public enum FailbackExceptionErrorType {

    @XmlEnumValue("SeatTaken")
    SEAT_TAKEN("SeatTaken"),
    @XmlEnumValue("ScheduleChange")
    SCHEDULE_CHANGE("ScheduleChange"),
    @XmlEnumValue("PriceChange")
    PRICE_CHANGE("PriceChange"),
    @XmlEnumValue("FareBasisChange")
    FARE_BASIS_CHANGE("FareBasisChange"),
    @XmlEnumValue("PricingFareEror")
    PRICING_FARE_EROR("PricingFareEror"),
    @XmlEnumValue("AncillaryPriceChange")
    ANCILLARY_PRICE_CHANGE("AncillaryPriceChange"),
    @XmlEnumValue("FailbackDone")
    FAILBACK_DONE("FailbackDone");
    private final String value;

    FailbackExceptionErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FailbackExceptionErrorType fromValue(String v) {
        for (FailbackExceptionErrorType c: FailbackExceptionErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
