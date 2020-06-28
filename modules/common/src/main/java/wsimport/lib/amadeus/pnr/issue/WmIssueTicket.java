
package wsimport.lib.amadeus.pnr.issue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TT_IssueTicketRQ" type="{http://traveltalk.com/wsIssueTicket}TT_IssueTicketRQ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ttIssueTicketRQ"
})
@XmlRootElement(name = "wmIssueTicket")
public class WmIssueTicket {

    @XmlElement(name = "TT_IssueTicketRQ")
    protected TTIssueTicketRQ ttIssueTicketRQ;

    /**
     * Gets the value of the ttIssueTicketRQ property.
     * 
     * @return
     *     possible object is
     *     {@link TTIssueTicketRQ }
     *     
     */
    public TTIssueTicketRQ getTTIssueTicketRQ() {
        return ttIssueTicketRQ;
    }

    /**
     * Sets the value of the ttIssueTicketRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTIssueTicketRQ }
     *     
     */
    public void setTTIssueTicketRQ(TTIssueTicketRQ value) {
        this.ttIssueTicketRQ = value;
    }

}
