
package wsimport.lib.amadeus.wstransferownership;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_TransferOwnershipRQNewOwnerChangeActionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_TransferOwnershipRQNewOwnerChangeActionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QueuingOffice"/>
 *     &lt;enumeration value="TicketingOffice"/>
 *     &lt;enumeration value="QueueElement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_TransferOwnershipRQNewOwnerChangeActionCode")
@XmlEnum
public enum OTATransferOwnershipRQNewOwnerChangeActionCode {

    @XmlEnumValue("QueuingOffice")
    QUEUING_OFFICE("QueuingOffice"),
    @XmlEnumValue("TicketingOffice")
    TICKETING_OFFICE("TicketingOffice"),
    @XmlEnumValue("QueueElement")
    QUEUE_ELEMENT("QueueElement");
    private final String value;

    OTATransferOwnershipRQNewOwnerChangeActionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTATransferOwnershipRQNewOwnerChangeActionCode fromValue(String v) {
        for (OTATransferOwnershipRQNewOwnerChangeActionCode c: OTATransferOwnershipRQNewOwnerChangeActionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
