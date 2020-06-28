
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressInfoShareMarketInd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressInfoShareMarketInd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Inherit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressInfoShareMarketInd")
@XmlEnum
public enum AddressInfoShareMarketInd {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Inherit")
    INHERIT("Inherit");
    private final String value;

    AddressInfoShareMarketInd(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressInfoShareMarketInd fromValue(String v) {
        for (AddressInfoShareMarketInd c: AddressInfoShareMarketInd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
