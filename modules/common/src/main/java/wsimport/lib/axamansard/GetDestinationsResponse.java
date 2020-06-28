
package wsimport.lib.axamansard;

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
 *         &lt;element name="GetDestinationsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDestinationsResult"
})
@XmlRootElement(name = "GetDestinationsResponse")
public class GetDestinationsResponse {

    @XmlElement(name = "GetDestinationsResult")
    protected String getDestinationsResult;

    /**
     * Gets the value of the getDestinationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDestinationsResult() {
        return getDestinationsResult;
    }

    /**
     * Sets the value of the getDestinationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDestinationsResult(String value) {
        this.getDestinationsResult = value;
    }

}
