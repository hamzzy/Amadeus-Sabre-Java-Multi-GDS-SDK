
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplicatedRecommedationsBehaviorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplicatedRecommedationsBehaviorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RDG"/>
 *     &lt;enumeration value="RDM"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DuplicatedRecommedationsBehaviorEnum")
@XmlEnum
public enum DuplicatedRecommedationsBehaviorEnum {

    RDG,
    RDM,
    NONE;

    public String value() {
        return name();
    }

    public static DuplicatedRecommedationsBehaviorEnum fromValue(String v) {
        return valueOf(v);
    }

}
