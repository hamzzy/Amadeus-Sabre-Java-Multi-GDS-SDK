
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
 *         &lt;element name="OTA_CancelRQ" type="{http://traveltalk.com/wsPNRCancel}OTA_CancelRQ" minOccurs="0"/>
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
    "otaCancelRQ"
})
@XmlRootElement(name = "wmPNRCancel")
public class WmPNRCancel {

    @XmlElement(name = "OTA_CancelRQ")
    protected OTACancelRQ otaCancelRQ;

    /**
     * Gets the value of the otaCancelRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTACancelRQ }
     *     
     */
    public OTACancelRQ getOTACancelRQ() {
        return otaCancelRQ;
    }

    /**
     * Sets the value of the otaCancelRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTACancelRQ }
     *     
     */
    public void setOTACancelRQ(OTACancelRQ value) {
        this.otaCancelRQ = value;
    }

}
