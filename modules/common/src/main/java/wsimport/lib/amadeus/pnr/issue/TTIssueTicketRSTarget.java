
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TT_IssueTicketRSTarget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TT_IssueTicketRSTarget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="Production"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TT_IssueTicketRSTarget")
@XmlEnum
public enum TTIssueTicketRSTarget {

    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Production")
    PRODUCTION("Production");
    private final String value;

    TTIssueTicketRSTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTIssueTicketRSTarget fromValue(String v) {
        for (TTIssueTicketRSTarget c: TTIssueTicketRSTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
