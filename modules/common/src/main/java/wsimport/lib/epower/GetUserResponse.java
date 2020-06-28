
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
 *         &lt;element name="GetUserRS" type="{http://epowerv5.amadeus.com.tr/WS}GetUserRS" minOccurs="0"/>
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
    "getUserRS"
})
@XmlRootElement(name = "GetUserResponse")
public class GetUserResponse {

    @XmlElement(name = "GetUserRS")
    protected GetUserRS getUserRS;

    /**
     * Gets the value of the getUserRS property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserRS }
     *     
     */
    public GetUserRS getGetUserRS() {
        return getUserRS;
    }

    /**
     * Sets the value of the getUserRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserRS }
     *     
     */
    public void setGetUserRS(GetUserRS value) {
        this.getUserRS = value;
    }

}
