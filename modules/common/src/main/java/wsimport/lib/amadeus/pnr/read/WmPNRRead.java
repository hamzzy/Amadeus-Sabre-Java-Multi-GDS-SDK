
package wsimport.lib.amadeus.pnr.read;

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
 *         &lt;element name="OTA_ReadRQ" type="{http://traveltalk.com/wsPNRRead}OTA_ReadRQ" minOccurs="0"/>
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
    "otaReadRQ"
})
@XmlRootElement(name = "wmPNRRead")
public class WmPNRRead {

    @XmlElement(name = "OTA_ReadRQ")
    protected OTAReadRQ otaReadRQ;

    /**
     * Gets the value of the otaReadRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAReadRQ }
     *     
     */
    public OTAReadRQ getOTAReadRQ() {
        return otaReadRQ;
    }

    /**
     * Sets the value of the otaReadRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAReadRQ }
     *     
     */
    public void setOTAReadRQ(OTAReadRQ value) {
        this.otaReadRQ = value;
    }

}
