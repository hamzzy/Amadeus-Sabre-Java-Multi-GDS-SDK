
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BookingOnly"/>
 *     &lt;enumeration value="ETicketInstant"/>
 *     &lt;enumeration value="ETicketRequest"/>
 *     &lt;enumeration value="MyAddress"/>
 *     &lt;enumeration value="Ticketless"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketType")
@XmlEnum
public enum TicketType {

    @XmlEnumValue("BookingOnly")
    BOOKING_ONLY("BookingOnly"),
    @XmlEnumValue("ETicketInstant")
    E_TICKET_INSTANT("ETicketInstant"),
    @XmlEnumValue("ETicketRequest")
    E_TICKET_REQUEST("ETicketRequest"),
    @XmlEnumValue("MyAddress")
    MY_ADDRESS("MyAddress"),
    @XmlEnumValue("Ticketless")
    TICKETLESS("Ticketless");
    private final String value;

    TicketType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketType fromValue(String v) {
        for (TicketType c: TicketType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
