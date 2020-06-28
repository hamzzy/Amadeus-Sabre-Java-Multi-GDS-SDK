
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayRuleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisplayRuleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISPLAYALLOPTIONS"/>
 *     &lt;enumeration value="DISPLAYONLYINPOLICYOPTIONS"/>
 *     &lt;enumeration value="DISPLAYONLYOUTPOLICYOPTIONSIFNOINPOLICYOPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisplayRuleEnum")
@XmlEnum
public enum DisplayRuleEnum {

    DISPLAYALLOPTIONS,
    DISPLAYONLYINPOLICYOPTIONS,
    DISPLAYONLYOUTPOLICYOPTIONSIFNOINPOLICYOPTION;

    public String value() {
        return name();
    }

    public static DisplayRuleEnum fromValue(String v) {
        return valueOf(v);
    }

}
