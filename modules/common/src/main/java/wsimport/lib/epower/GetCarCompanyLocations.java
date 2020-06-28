
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
 *         &lt;element name="OTA_VehLocSearchRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehLocSearchRQ" minOccurs="0"/>
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
    "otaVehLocSearchRQ"
})
@XmlRootElement(name = "GetCarCompanyLocations")
public class GetCarCompanyLocations {

    @XmlElement(name = "OTA_VehLocSearchRQ")
    protected OTAVehLocSearchRQ otaVehLocSearchRQ;

    /**
     * Gets the value of the otaVehLocSearchRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehLocSearchRQ }
     *     
     */
    public OTAVehLocSearchRQ getOTAVehLocSearchRQ() {
        return otaVehLocSearchRQ;
    }

    /**
     * Sets the value of the otaVehLocSearchRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehLocSearchRQ }
     *     
     */
    public void setOTAVehLocSearchRQ(OTAVehLocSearchRQ value) {
        this.otaVehLocSearchRQ = value;
    }

}
