
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
 *         &lt;element name="OTA_InsuranceBookRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsuranceBookRQ" minOccurs="0"/>
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
    "otaInsuranceBookRQ"
})
@XmlRootElement(name = "BookInsurance")
public class BookInsurance {

    @XmlElement(name = "OTA_InsuranceBookRQ")
    protected OTAInsuranceBookRQ otaInsuranceBookRQ;

    /**
     * Gets the value of the otaInsuranceBookRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsuranceBookRQ }
     *     
     */
    public OTAInsuranceBookRQ getOTAInsuranceBookRQ() {
        return otaInsuranceBookRQ;
    }

    /**
     * Sets the value of the otaInsuranceBookRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsuranceBookRQ }
     *     
     */
    public void setOTAInsuranceBookRQ(OTAInsuranceBookRQ value) {
        this.otaInsuranceBookRQ = value;
    }

}
