
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
 *         &lt;element name="AncillaryInfoRQ" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryInfoRQ" minOccurs="0"/>
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
    "ancillaryInfoRQ"
})
@XmlRootElement(name = "GetAncillaryInfo")
public class GetAncillaryInfo {

    @XmlElement(name = "AncillaryInfoRQ")
    protected AncillaryInfoRQ ancillaryInfoRQ;

    /**
     * Gets the value of the ancillaryInfoRQ property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryInfoRQ }
     *     
     */
    public AncillaryInfoRQ getAncillaryInfoRQ() {
        return ancillaryInfoRQ;
    }

    /**
     * Sets the value of the ancillaryInfoRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryInfoRQ }
     *     
     */
    public void setAncillaryInfoRQ(AncillaryInfoRQ value) {
        this.ancillaryInfoRQ = value;
    }

}
