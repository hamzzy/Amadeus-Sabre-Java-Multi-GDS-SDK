
package wsimport.lib.amadeus.wstransferownership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_TransferOwnershipRQNewOwnerChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_TransferOwnershipRQNewOwnerChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ActionCode" use="required" type="{http://traveltalk.com/wsTransferOwnership}OTA_TransferOwnershipRQNewOwnerChangeActionCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_TransferOwnershipRQNewOwnerChange")
public class OTATransferOwnershipRQNewOwnerChange {

    @XmlAttribute(name = "ActionCode", required = true)
    protected OTATransferOwnershipRQNewOwnerChangeActionCode actionCode;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link OTATransferOwnershipRQNewOwnerChangeActionCode }
     *     
     */
    public OTATransferOwnershipRQNewOwnerChangeActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTATransferOwnershipRQNewOwnerChangeActionCode }
     *     
     */
    public void setActionCode(OTATransferOwnershipRQNewOwnerChangeActionCode value) {
        this.actionCode = value;
    }

}
