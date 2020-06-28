
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Electronic"/>
 *     &lt;enumeration value="Paper"/>
 *     &lt;enumeration value="MCO"/>
 *     &lt;enumeration value="Void"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketTypeType")
@XmlEnum
public enum TicketTypeType {

    @XmlEnumValue("Electronic")
    ELECTRONIC("Electronic"),
    @XmlEnumValue("Paper")
    PAPER("Paper"),
    MCO("MCO"),
    @XmlEnumValue("Void")
    VOID("Void");
    private final String value;

    TicketTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketTypeType fromValue(String v) {
        for (TicketTypeType c: TicketTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
