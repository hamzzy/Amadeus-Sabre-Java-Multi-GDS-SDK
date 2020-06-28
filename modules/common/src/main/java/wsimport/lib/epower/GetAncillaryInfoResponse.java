
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
 *         &lt;element name="AncillaryInfoRS" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryInfoRS" minOccurs="0"/>
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
    "ancillaryInfoRS"
})
@XmlRootElement(name = "GetAncillaryInfoResponse")
public class GetAncillaryInfoResponse {

    @XmlElement(name = "AncillaryInfoRS")
    protected AncillaryInfoRS ancillaryInfoRS;

    /**
     * Gets the value of the ancillaryInfoRS property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryInfoRS }
     *     
     */
    public AncillaryInfoRS getAncillaryInfoRS() {
        return ancillaryInfoRS;
    }

    /**
     * Sets the value of the ancillaryInfoRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryInfoRS }
     *     
     */
    public void setAncillaryInfoRS(AncillaryInfoRS value) {
        this.ancillaryInfoRS = value;
    }

}
