
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPrimaryAdditionalTypeAdditionalQualificationMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerPrimaryAdditionalTypeAdditionalQualificationMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RT_AirlineTicket"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="PassportAndReturnTkt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerPrimaryAdditionalTypeAdditionalQualificationMethod")
@XmlEnum
public enum CustomerPrimaryAdditionalTypeAdditionalQualificationMethod {

    @XmlEnumValue("RT_AirlineTicket")
    RT_AIRLINE_TICKET("RT_AirlineTicket"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("PassportAndReturnTkt")
    PASSPORT_AND_RETURN_TKT("PassportAndReturnTkt");
    private final String value;

    CustomerPrimaryAdditionalTypeAdditionalQualificationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerPrimaryAdditionalTypeAdditionalQualificationMethod fromValue(String v) {
        for (CustomerPrimaryAdditionalTypeAdditionalQualificationMethod c: CustomerPrimaryAdditionalTypeAdditionalQualificationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
