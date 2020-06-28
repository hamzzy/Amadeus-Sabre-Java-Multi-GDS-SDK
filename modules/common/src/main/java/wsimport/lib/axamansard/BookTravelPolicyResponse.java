
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
 *         &lt;element name="BookTravelPolicyResult" type="{http://tempuri.org/}Result" minOccurs="0"/>
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
    "bookTravelPolicyResult"
})
@XmlRootElement(name = "BookTravelPolicyResponse")
public class BookTravelPolicyResponse {

    @XmlElement(name = "BookTravelPolicyResult")
    protected Result bookTravelPolicyResult;

    /**
     * Gets the value of the bookTravelPolicyResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getBookTravelPolicyResult() {
        return bookTravelPolicyResult;
    }

    /**
     * Sets the value of the bookTravelPolicyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setBookTravelPolicyResult(Result value) {
        this.bookTravelPolicyResult = value;
    }

}
