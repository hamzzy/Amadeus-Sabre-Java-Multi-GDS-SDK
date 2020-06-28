
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
 *         &lt;element name="BaggageInfoRS" type="{http://epowerv5.amadeus.com.tr/WS}BaggageInfoRS" minOccurs="0"/>
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
    "baggageInfoRS"
})
@XmlRootElement(name = "GetBaggageInfoResponse")
public class GetBaggageInfoResponse {

    @XmlElement(name = "BaggageInfoRS")
    protected BaggageInfoRS baggageInfoRS;

    /**
     * Gets the value of the baggageInfoRS property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageInfoRS }
     *     
     */
    public BaggageInfoRS getBaggageInfoRS() {
        return baggageInfoRS;
    }

    /**
     * Sets the value of the baggageInfoRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageInfoRS }
     *     
     */
    public void setBaggageInfoRS(BaggageInfoRS value) {
        this.baggageInfoRS = value;
    }

}
