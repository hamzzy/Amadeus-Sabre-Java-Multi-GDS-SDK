
package wsimport.lib.amadeus.wstransferownership;

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
 *         &lt;element name="OTA_TransferOwnershipRQ" type="{http://traveltalk.com/wsTransferOwnership}OTA_TransferOwnershipRQ" minOccurs="0"/>
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
    "otaTransferOwnershipRQ"
})
@XmlRootElement(name = "wmTransferOwnership")
public class WmTransferOwnership {

    @XmlElement(name = "OTA_TransferOwnershipRQ")
    protected OTATransferOwnershipRQ otaTransferOwnershipRQ;

    /**
     * Gets the value of the otaTransferOwnershipRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTATransferOwnershipRQ }
     *     
     */
    public OTATransferOwnershipRQ getOTATransferOwnershipRQ() {
        return otaTransferOwnershipRQ;
    }

    /**
     * Sets the value of the otaTransferOwnershipRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTATransferOwnershipRQ }
     *     
     */
    public void setOTATransferOwnershipRQ(OTATransferOwnershipRQ value) {
        this.otaTransferOwnershipRQ = value;
    }

}
