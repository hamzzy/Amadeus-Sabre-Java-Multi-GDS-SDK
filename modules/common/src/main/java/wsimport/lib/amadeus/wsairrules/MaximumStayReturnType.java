
package wsimport.lib.amadeus.wsairrules;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaximumStayReturnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaximumStayReturnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaximumStayReturnType")
@XmlEnum
public enum MaximumStayReturnType {

    C,
    S;

    public String value() {
        return name();
    }

    public static MaximumStayReturnType fromValue(String v) {
        return valueOf(v);
    }

}
