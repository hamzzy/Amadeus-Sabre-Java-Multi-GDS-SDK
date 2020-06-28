
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalGuestAmountAgeTimeUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalGuestAmountAgeTimeUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Second"/>
 *     &lt;enumeration value="FullDuration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalGuestAmountAgeTimeUnit")
@XmlEnum
public enum AdditionalGuestAmountAgeTimeUnit {

    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("Second")
    SECOND("Second"),
    @XmlEnumValue("FullDuration")
    FULL_DURATION("FullDuration");
    private final String value;

    AdditionalGuestAmountAgeTimeUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdditionalGuestAmountAgeTimeUnit fromValue(String v) {
        for (AdditionalGuestAmountAgeTimeUnit c: AdditionalGuestAmountAgeTimeUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
