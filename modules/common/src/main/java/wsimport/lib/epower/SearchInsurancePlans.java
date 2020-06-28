
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
 *         &lt;element name="OTA_InsurancePlanSearchRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRQ" minOccurs="0"/>
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
    "otaInsurancePlanSearchRQ"
})
@XmlRootElement(name = "SearchInsurancePlans")
public class SearchInsurancePlans {

    @XmlElement(name = "OTA_InsurancePlanSearchRQ")
    protected OTAInsurancePlanSearchRQ otaInsurancePlanSearchRQ;

    /**
     * Gets the value of the otaInsurancePlanSearchRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsurancePlanSearchRQ }
     *     
     */
    public OTAInsurancePlanSearchRQ getOTAInsurancePlanSearchRQ() {
        return otaInsurancePlanSearchRQ;
    }

    /**
     * Sets the value of the otaInsurancePlanSearchRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRQ }
     *     
     */
    public void setOTAInsurancePlanSearchRQ(OTAInsurancePlanSearchRQ value) {
        this.otaInsurancePlanSearchRQ = value;
    }

}
