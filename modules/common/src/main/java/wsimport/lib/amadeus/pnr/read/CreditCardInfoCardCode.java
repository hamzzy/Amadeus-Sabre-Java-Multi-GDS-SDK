
package wsimport.lib.amadeus.pnr.read;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardInfoCardCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditCardInfoCardCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AX"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="BL"/>
 *     &lt;enumeration value="CB"/>
 *     &lt;enumeration value="DN"/>
 *     &lt;enumeration value="DS"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="JC"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="TP"/>
 *     &lt;enumeration value="VI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditCardInfoCardCode")
@XmlEnum
public enum CreditCardInfoCardCode {

    AX,
    BC,
    BL,
    CB,
    DN,
    DS,
    EC,
    JC,
    MC,
    TP,
    VI;

    public String value() {
        return name();
    }

    public static CreditCardInfoCardCode fromValue(String v) {
        return valueOf(v);
    }

}
