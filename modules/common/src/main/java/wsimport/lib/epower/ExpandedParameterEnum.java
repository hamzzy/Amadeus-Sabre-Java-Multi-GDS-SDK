
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpandedParameterEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpandedParameterEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NAP"/>
 *     &lt;enumeration value="NPE"/>
 *     &lt;enumeration value="NR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpandedParameterEnum")
@XmlEnum
public enum ExpandedParameterEnum {

    NAP,
    NPE,
    NR;

    public String value() {
        return name();
    }

    public static ExpandedParameterEnum fromValue(String v) {
        return valueOf(v);
    }

}
