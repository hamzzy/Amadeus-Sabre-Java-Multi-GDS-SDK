
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationErrorCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationErrorCodes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A000"/>
 *     &lt;enumeration value="A001"/>
 *     &lt;enumeration value="A002"/>
 *     &lt;enumeration value="A003"/>
 *     &lt;enumeration value="A004"/>
 *     &lt;enumeration value="A005"/>
 *     &lt;enumeration value="A006"/>
 *     &lt;enumeration value="A007"/>
 *     &lt;enumeration value="A008"/>
 *     &lt;enumeration value="A009"/>
 *     &lt;enumeration value="A010"/>
 *     &lt;enumeration value="A011"/>
 *     &lt;enumeration value="A012"/>
 *     &lt;enumeration value="A013"/>
 *     &lt;enumeration value="A014"/>
 *     &lt;enumeration value="A015"/>
 *     &lt;enumeration value="A016"/>
 *     &lt;enumeration value="A017"/>
 *     &lt;enumeration value="A018"/>
 *     &lt;enumeration value="A019"/>
 *     &lt;enumeration value="A020"/>
 *     &lt;enumeration value="A021"/>
 *     &lt;enumeration value="A022"/>
 *     &lt;enumeration value="A023"/>
 *     &lt;enumeration value="A024"/>
 *     &lt;enumeration value="A025"/>
 *     &lt;enumeration value="A026"/>
 *     &lt;enumeration value="A027"/>
 *     &lt;enumeration value="USR000"/>
 *     &lt;enumeration value="USR011"/>
 *     &lt;enumeration value="USR012"/>
 *     &lt;enumeration value="USR013"/>
 *     &lt;enumeration value="USR014"/>
 *     &lt;enumeration value="USR015"/>
 *     &lt;enumeration value="USR016"/>
 *     &lt;enumeration value="USR017"/>
 *     &lt;enumeration value="USR018"/>
 *     &lt;enumeration value="USR019"/>
 *     &lt;enumeration value="USR020"/>
 *     &lt;enumeration value="USR021"/>
 *     &lt;enumeration value="USR022"/>
 *     &lt;enumeration value="USR023"/>
 *     &lt;enumeration value="USR024"/>
 *     &lt;enumeration value="USR025"/>
 *     &lt;enumeration value="USR026"/>
 *     &lt;enumeration value="USR027"/>
 *     &lt;enumeration value="USR028"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidationErrorCodes")
@XmlEnum
public enum ValidationErrorCodes {

    @XmlEnumValue("A000")
    A_000("A000"),
    @XmlEnumValue("A001")
    A_001("A001"),
    @XmlEnumValue("A002")
    A_002("A002"),
    @XmlEnumValue("A003")
    A_003("A003"),
    @XmlEnumValue("A004")
    A_004("A004"),
    @XmlEnumValue("A005")
    A_005("A005"),
    @XmlEnumValue("A006")
    A_006("A006"),
    @XmlEnumValue("A007")
    A_007("A007"),
    @XmlEnumValue("A008")
    A_008("A008"),
    @XmlEnumValue("A009")
    A_009("A009"),
    @XmlEnumValue("A010")
    A_010("A010"),
    @XmlEnumValue("A011")
    A_011("A011"),
    @XmlEnumValue("A012")
    A_012("A012"),
    @XmlEnumValue("A013")
    A_013("A013"),
    @XmlEnumValue("A014")
    A_014("A014"),
    @XmlEnumValue("A015")
    A_015("A015"),
    @XmlEnumValue("A016")
    A_016("A016"),
    @XmlEnumValue("A017")
    A_017("A017"),
    @XmlEnumValue("A018")
    A_018("A018"),
    @XmlEnumValue("A019")
    A_019("A019"),
    @XmlEnumValue("A020")
    A_020("A020"),
    @XmlEnumValue("A021")
    A_021("A021"),
    @XmlEnumValue("A022")
    A_022("A022"),
    @XmlEnumValue("A023")
    A_023("A023"),
    @XmlEnumValue("A024")
    A_024("A024"),
    @XmlEnumValue("A025")
    A_025("A025"),
    @XmlEnumValue("A026")
    A_026("A026"),
    @XmlEnumValue("A027")
    A_027("A027"),
    @XmlEnumValue("USR000")
    USR_000("USR000"),
    @XmlEnumValue("USR011")
    USR_011("USR011"),
    @XmlEnumValue("USR012")
    USR_012("USR012"),
    @XmlEnumValue("USR013")
    USR_013("USR013"),
    @XmlEnumValue("USR014")
    USR_014("USR014"),
    @XmlEnumValue("USR015")
    USR_015("USR015"),
    @XmlEnumValue("USR016")
    USR_016("USR016"),
    @XmlEnumValue("USR017")
    USR_017("USR017"),
    @XmlEnumValue("USR018")
    USR_018("USR018"),
    @XmlEnumValue("USR019")
    USR_019("USR019"),
    @XmlEnumValue("USR020")
    USR_020("USR020"),
    @XmlEnumValue("USR021")
    USR_021("USR021"),
    @XmlEnumValue("USR022")
    USR_022("USR022"),
    @XmlEnumValue("USR023")
    USR_023("USR023"),
    @XmlEnumValue("USR024")
    USR_024("USR024"),
    @XmlEnumValue("USR025")
    USR_025("USR025"),
    @XmlEnumValue("USR026")
    USR_026("USR026"),
    @XmlEnumValue("USR027")
    USR_027("USR027"),
    @XmlEnumValue("USR028")
    USR_028("USR028");
    private final String value;

    ValidationErrorCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidationErrorCodes fromValue(String v) {
        for (ValidationErrorCodes c: ValidationErrorCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
