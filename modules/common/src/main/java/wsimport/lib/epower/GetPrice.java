
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
 *         &lt;element name="PriceInfoRQ" type="{http://epowerv5.amadeus.com.tr/WS}PriceInfoRQ" minOccurs="0"/>
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
    "priceInfoRQ"
})
@XmlRootElement(name = "GetPrice")
public class GetPrice {

    @XmlElement(name = "PriceInfoRQ")
    protected PriceInfoRQ priceInfoRQ;

    /**
     * Gets the value of the priceInfoRQ property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInfoRQ }
     *     
     */
    public PriceInfoRQ getPriceInfoRQ() {
        return priceInfoRQ;
    }

    /**
     * Sets the value of the priceInfoRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInfoRQ }
     *     
     */
    public void setPriceInfoRQ(PriceInfoRQ value) {
        this.priceInfoRQ = value;
    }

}
