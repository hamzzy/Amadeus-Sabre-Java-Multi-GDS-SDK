
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripApprovalRuleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TripApprovalRuleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEVERNEEDSAPPROVAL"/>
 *     &lt;enumeration value="ALWAYSNEEDSAPPROVAL"/>
 *     &lt;enumeration value="NEEDSAPPROVALWHENTRIPISOUTOFPOLICY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TripApprovalRuleEnum")
@XmlEnum
public enum TripApprovalRuleEnum {

    NEVERNEEDSAPPROVAL,
    ALWAYSNEEDSAPPROVAL,
    NEEDSAPPROVALWHENTRIPISOUTOFPOLICY;

    public String value() {
        return name();
    }

    public static TripApprovalRuleEnum fromValue(String v) {
        return valueOf(v);
    }

}
