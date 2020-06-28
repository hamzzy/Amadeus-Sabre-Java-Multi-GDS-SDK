
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllianceCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllianceCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONEWORLD"/>
 *     &lt;enumeration value="SKYTEAM"/>
 *     &lt;enumeration value="STAR_ALLIANCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllianceCode")
@XmlEnum
public enum AllianceCode {

    ONEWORLD,
    SKYTEAM,
    STAR_ALLIANCE;

    public String value() {
        return name();
    }

    public static AllianceCode fromValue(String v) {
        return valueOf(v);
    }

}
