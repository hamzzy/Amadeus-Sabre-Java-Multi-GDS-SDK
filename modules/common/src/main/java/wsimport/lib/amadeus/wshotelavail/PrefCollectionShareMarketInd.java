
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrefCollectionShareMarketInd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrefCollectionShareMarketInd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Inherit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrefCollectionShareMarketInd")
@XmlEnum
public enum PrefCollectionShareMarketInd {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Inherit")
    INHERIT("Inherit");
    private final String value;

    PrefCollectionShareMarketInd(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrefCollectionShareMarketInd fromValue(String v) {
        for (PrefCollectionShareMarketInd c: PrefCollectionShareMarketInd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
