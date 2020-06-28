
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BaseEntity">
 *       &lt;sequence>
 *         &lt;element name="Communications" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfCommunication" minOccurs="0"/>
 *         &lt;element name="CommunicationHint" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfCommunicationHint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationDetails", propOrder = {
    "communications",
    "communicationHint"
})
public class CommunicationDetails
    extends BaseEntity
{

    @XmlElement(name = "Communications")
    protected ArrayOfCommunication communications;
    @XmlElement(name = "CommunicationHint")
    protected ArrayOfCommunicationHint communicationHint;

    /**
     * Gets the value of the communications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommunication }
     *     
     */
    public ArrayOfCommunication getCommunications() {
        return communications;
    }

    /**
     * Sets the value of the communications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommunication }
     *     
     */
    public void setCommunications(ArrayOfCommunication value) {
        this.communications = value;
    }

    /**
     * Gets the value of the communicationHint property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommunicationHint }
     *     
     */
    public ArrayOfCommunicationHint getCommunicationHint() {
        return communicationHint;
    }

    /**
     * Sets the value of the communicationHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommunicationHint }
     *     
     */
    public void setCommunicationHint(ArrayOfCommunicationHint value) {
        this.communicationHint = value;
    }

}
