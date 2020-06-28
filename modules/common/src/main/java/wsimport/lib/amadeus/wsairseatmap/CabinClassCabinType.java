
package wsimport.lib.amadeus.wsairseatmap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinClassCabinType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CabinClassCabinType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Premium"/>
 *     &lt;enumeration value="Economy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CabinClassCabinType")
@XmlEnum
public enum CabinClassCabinType {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Premium")
    PREMIUM("Premium"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy");
    private final String value;

    CabinClassCabinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinClassCabinType fromValue(String v) {
        for (CabinClassCabinType c: CabinClassCabinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
