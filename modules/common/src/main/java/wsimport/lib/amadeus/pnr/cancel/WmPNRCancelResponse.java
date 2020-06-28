
package wsimport.lib.amadeus.pnr.cancel;

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
 *         &lt;element name="OTA_CancelRS" type="{http://traveltalk.com/wsPNRCancel}OTA_CancelRS" minOccurs="0"/>
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
    "otaCancelRS"
})
@XmlRootElement(name = "wmPNRCancelResponse")
public class WmPNRCancelResponse {

    @XmlElement(name = "OTA_CancelRS")
    protected OTACancelRS otaCancelRS;

    /**
     * Gets the value of the otaCancelRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTACancelRS }
     *     
     */
    public OTACancelRS getOTACancelRS() {
        return otaCancelRS;
    }

    /**
     * Sets the value of the otaCancelRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTACancelRS }
     *     
     */
    public void setOTACancelRS(OTACancelRS value) {
        this.otaCancelRS = value;
    }

}
