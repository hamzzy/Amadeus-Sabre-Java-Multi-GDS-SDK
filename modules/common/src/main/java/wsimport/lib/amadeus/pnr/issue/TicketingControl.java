
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketingControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Type" use="required" type="{http://traveltalk.com/wsIssueTicket}TicketingControlType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingControl")
public class TicketingControl {

    @XmlAttribute(name = "Type", required = true)
    protected TicketingControlType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingControlType }
     *     
     */
    public TicketingControlType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingControlType }
     *     
     */
    public void setType(TicketingControlType value) {
        this.type = value;
    }

}
