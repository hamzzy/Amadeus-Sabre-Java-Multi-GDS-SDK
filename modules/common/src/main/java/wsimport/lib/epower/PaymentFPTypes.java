
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentFPTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentFPTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FPCA"/>
 *     &lt;enumeration value="FPCC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentFPTypes")
@XmlEnum
public enum PaymentFPTypes {

    FPCA,
    FPCC;

    public String value() {
        return name();
    }

    public static PaymentFPTypes fromValue(String v) {
        return valueOf(v);
    }

}
