
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
 *         &lt;element name="OTA_InsuranceBookRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsuranceBookRS" minOccurs="0"/>
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
    "otaInsuranceBookRS"
})
@XmlRootElement(name = "BookInsuranceResponse")
public class BookInsuranceResponse {

    @XmlElement(name = "OTA_InsuranceBookRS")
    protected OTAInsuranceBookRS otaInsuranceBookRS;

    /**
     * Gets the value of the otaInsuranceBookRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsuranceBookRS }
     *     
     */
    public OTAInsuranceBookRS getOTAInsuranceBookRS() {
        return otaInsuranceBookRS;
    }

    /**
     * Sets the value of the otaInsuranceBookRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsuranceBookRS }
     *     
     */
    public void setOTAInsuranceBookRS(OTAInsuranceBookRS value) {
        this.otaInsuranceBookRS = value;
    }

}
