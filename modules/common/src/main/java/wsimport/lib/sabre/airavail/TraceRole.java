
package wsimport.lib.sabre.airavail;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TraceRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TraceRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="consumer"/>
 *     &lt;enumeration value="provider"/>
 *     &lt;enumeration value="gateway"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TraceRole", namespace = "http://flight.services.service.sabre.com/STL_Header/v120")
@XmlEnum
public enum TraceRole {


    /**
     * the system that initiated the service request and will be the ultimate consumer 
     * 					of the service results.
     * 					
     * 
     */
    @XmlEnumValue("consumer")
    CONSUMER("consumer"),

    /**
     * System that performs the service operation_manager defined in the service interface.
     * 					For RQ/RS exchange patterns, the provider reads the request message, applies business logic and 
     * 					returns a response.
     * 					
     * 
     */
    @XmlEnumValue("provider")
    PROVIDER("provider"),
    @XmlEnumValue("gateway")
    GATEWAY("gateway");
    private final String value;

    TraceRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TraceRole fromValue(String v) {
        for (TraceRole c: TraceRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
