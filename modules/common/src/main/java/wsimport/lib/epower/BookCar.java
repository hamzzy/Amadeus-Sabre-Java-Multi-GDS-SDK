
package wsimport.lib.epower;

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
 *         &lt;element name="OTA_VehResRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehResRQ" minOccurs="0"/>
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
    "otaVehResRQ"
})
@XmlRootElement(name = "BookCar")
public class BookCar {

    @XmlElement(name = "OTA_VehResRQ")
    protected OTAVehResRQ otaVehResRQ;

    /**
     * Gets the value of the otaVehResRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehResRQ }
     *     
     */
    public OTAVehResRQ getOTAVehResRQ() {
        return otaVehResRQ;
    }

    /**
     * Sets the value of the otaVehResRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehResRQ }
     *     
     */
    public void setOTAVehResRQ(OTAVehResRQ value) {
        this.otaVehResRQ = value;
    }

}
