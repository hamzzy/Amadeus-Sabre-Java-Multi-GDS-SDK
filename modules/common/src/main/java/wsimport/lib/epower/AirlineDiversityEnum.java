
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineDiversityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirlineDiversityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADC"/>
 *     &lt;enumeration value="NAD"/>
 *     &lt;enumeration value="NDD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirlineDiversityEnum")
@XmlEnum
public enum AirlineDiversityEnum {

    ADC,
    NAD,
    NDD;

    public String value() {
        return name();
    }

    public static AirlineDiversityEnum fromValue(String v) {
        return valueOf(v);
    }

}
