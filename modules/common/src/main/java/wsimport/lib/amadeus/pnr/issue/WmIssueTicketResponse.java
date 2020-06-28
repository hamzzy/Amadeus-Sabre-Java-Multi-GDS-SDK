
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
 *         &lt;element name="TT_IssueTicketRS" type="{http://traveltalk.com/wsIssueTicket}TT_IssueTicketRS" minOccurs="0"/>
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
    "ttIssueTicketRS"
})
@XmlRootElement(name = "wmIssueTicketResponse")
public class WmIssueTicketResponse {

    @XmlElement(name = "TT_IssueTicketRS")
    protected TTIssueTicketRS ttIssueTicketRS;

    /**
     * Gets the value of the ttIssueTicketRS property.
     * 
     * @return
     *     possible object is
     *     {@link TTIssueTicketRS }
     *     
     */
    public TTIssueTicketRS getTTIssueTicketRS() {
        return ttIssueTicketRS;
    }

    /**
     * Sets the value of the ttIssueTicketRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTIssueTicketRS }
     *     
     */
    public void setTTIssueTicketRS(TTIssueTicketRS value) {
        this.ttIssueTicketRS = value;
    }

}
