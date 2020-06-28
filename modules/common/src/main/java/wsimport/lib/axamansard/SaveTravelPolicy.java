
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
 *         &lt;element name="Travel" type="{http://tempuri.org/}TravelObject" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "travel",
    "token"
})
@XmlRootElement(name = "SaveTravelPolicy")
public class SaveTravelPolicy {

    @XmlElement(name = "Travel")
    protected TravelObject travel;
    protected String token;

    /**
     * Gets the value of the travel property.
     * 
     * @return
     *     possible object is
     *     {@link TravelObject }
     *     
     */
    public TravelObject getTravel() {
        return travel;
    }

    /**
     * Sets the value of the travel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelObject }
     *     
     */
    public void setTravel(TravelObject value) {
        this.travel = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
