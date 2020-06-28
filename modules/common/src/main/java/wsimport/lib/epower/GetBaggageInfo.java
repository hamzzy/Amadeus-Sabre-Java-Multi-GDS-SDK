
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
 *         &lt;element name="BaggageInfoRQ" type="{http://epowerv5.amadeus.com.tr/WS}BaggageInfoRQ" minOccurs="0"/>
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
    "baggageInfoRQ"
})
@XmlRootElement(name = "GetBaggageInfo")
public class GetBaggageInfo {

    @XmlElement(name = "BaggageInfoRQ")
    protected BaggageInfoRQ baggageInfoRQ;

    /**
     * Gets the value of the baggageInfoRQ property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageInfoRQ }
     *     
     */
    public BaggageInfoRQ getBaggageInfoRQ() {
        return baggageInfoRQ;
    }

    /**
     * Sets the value of the baggageInfoRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageInfoRQ }
     *     
     */
    public void setBaggageInfoRQ(BaggageInfoRQ value) {
        this.baggageInfoRQ = value;
    }

}
