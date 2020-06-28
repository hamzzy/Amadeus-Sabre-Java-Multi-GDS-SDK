
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
 *         &lt;element name="OTA_CurrencyConversionRQ" type="{http://epowerv5.amadeus.com.tr/WS}OTA_CurrencyConversionRQ" minOccurs="0"/>
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
    "otaCurrencyConversionRQ"
})
@XmlRootElement(name = "CurrencyConversion")
public class CurrencyConversion {

    @XmlElement(name = "OTA_CurrencyConversionRQ")
    protected OTACurrencyConversionRQ otaCurrencyConversionRQ;

    /**
     * Gets the value of the otaCurrencyConversionRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTACurrencyConversionRQ }
     *     
     */
    public OTACurrencyConversionRQ getOTACurrencyConversionRQ() {
        return otaCurrencyConversionRQ;
    }

    /**
     * Sets the value of the otaCurrencyConversionRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTACurrencyConversionRQ }
     *     
     */
    public void setOTACurrencyConversionRQ(OTACurrencyConversionRQ value) {
        this.otaCurrencyConversionRQ = value;
    }

}
