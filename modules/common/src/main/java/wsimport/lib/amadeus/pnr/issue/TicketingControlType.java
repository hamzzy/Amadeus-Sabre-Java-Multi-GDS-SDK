
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketingControlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketingControlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="TF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketingControlType")
@XmlEnum
public enum TicketingControlType {

    OK,
    TF;

    public String value() {
        return name();
    }

    public static TicketingControlType fromValue(String v) {
        return valueOf(v);
    }

}
