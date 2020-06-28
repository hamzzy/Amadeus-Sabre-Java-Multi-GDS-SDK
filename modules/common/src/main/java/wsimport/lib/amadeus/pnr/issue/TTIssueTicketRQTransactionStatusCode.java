
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TT_IssueTicketRQTransactionStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TT_IssueTicketRQTransactionStatusCode">
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
@XmlType(name = "TT_IssueTicketRQTransactionStatusCode")
@XmlEnum
public enum TTIssueTicketRQTransactionStatusCode {

    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("End")
    END("End"),
    @XmlEnumValue("Rollback")
    ROLLBACK("Rollback"),
    @XmlEnumValue("InSeries")
    IN_SERIES("InSeries");
    private final String value;

    TTIssueTicketRQTransactionStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTIssueTicketRQTransactionStatusCode fromValue(String v) {
        for (TTIssueTicketRQTransactionStatusCode c: TTIssueTicketRQTransactionStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
