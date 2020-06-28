
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
 *         &lt;element name="OTA_InsurancePlanSearchRS" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRS" minOccurs="0"/>
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
    "otaInsurancePlanSearchRS"
})
@XmlRootElement(name = "SearchInsurancePlansResponse")
public class SearchInsurancePlansResponse {

    @XmlElement(name = "OTA_InsurancePlanSearchRS")
    protected OTAInsurancePlanSearchRS otaInsurancePlanSearchRS;

    /**
     * Gets the value of the otaInsurancePlanSearchRS property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsurancePlanSearchRS }
     *     
     */
    public OTAInsurancePlanSearchRS getOTAInsurancePlanSearchRS() {
        return otaInsurancePlanSearchRS;
    }

    /**
     * Sets the value of the otaInsurancePlanSearchRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRS }
     *     
     */
    public void setOTAInsurancePlanSearchRS(OTAInsurancePlanSearchRS value) {
        this.otaInsurancePlanSearchRS = value;
    }

}
