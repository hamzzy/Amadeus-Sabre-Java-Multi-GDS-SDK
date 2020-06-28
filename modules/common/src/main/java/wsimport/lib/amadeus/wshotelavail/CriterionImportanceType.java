
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriterionImportanceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriterionImportanceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mandatory"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Low"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CriterionImportanceType")
@XmlEnum
public enum CriterionImportanceType {

    @XmlEnumValue("Mandatory")
    MANDATORY("Mandatory"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("Low")
    LOW("Low");
    private final String value;

    CriterionImportanceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CriterionImportanceType fromValue(String v) {
        for (CriterionImportanceType c: CriterionImportanceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
