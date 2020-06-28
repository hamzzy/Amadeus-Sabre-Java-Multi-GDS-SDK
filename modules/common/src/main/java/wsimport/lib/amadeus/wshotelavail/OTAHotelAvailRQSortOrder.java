
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_HotelAvailRQSortOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_HotelAvailRQSortOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_HotelAvailRQSortOrder")
@XmlEnum
public enum OTAHotelAvailRQSortOrder {

    A,
    D,
    N;

    public String value() {
        return name();
    }

    public static OTAHotelAvailRQSortOrder fromValue(String v) {
        return valueOf(v);
    }

}
