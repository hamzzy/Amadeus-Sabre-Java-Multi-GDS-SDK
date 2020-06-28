
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
 *         &lt;element name="OTA_VehLocSearchRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_VehLocSearchRS" minOccurs="0"/>
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
    "otaVehLocSearchRS"
})
@XmlRootElement(name = "GetCarCompanyLocationsResponse")
public class GetCarCompanyLocationsResponse {

    @XmlElement(name = "OTA_VehLocSearchRS")
    protected OTAVehLocSearchRS otaVehLocSearchRS;

    /**
     * Gets the value of the otaVehLocSearchRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehLocSearchRS }
     *     
     */
    public OTAVehLocSearchRS getOTAVehLocSearchRS() {
        return otaVehLocSearchRS;
    }

    /**
     * Sets the value of the otaVehLocSearchRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehLocSearchRS }
     *     
     */
    public void setOTAVehLocSearchRS(OTAVehLocSearchRS value) {
        this.otaVehLocSearchRS = value;
    }

}
