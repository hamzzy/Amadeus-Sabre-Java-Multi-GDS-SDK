
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
 *         &lt;element name="Book3rdPartyMotorResult" type="{http://tempuri.org/}Result" minOccurs="0"/>
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
    "book3RdPartyMotorResult"
})
@XmlRootElement(name = "Book3rdPartyMotorResponse")
public class Book3RdPartyMotorResponse {

    @XmlElement(name = "Book3rdPartyMotorResult")
    protected Result book3RdPartyMotorResult;

    /**
     * Gets the value of the book3RdPartyMotorResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getBook3RdPartyMotorResult() {
        return book3RdPartyMotorResult;
    }

    /**
     * Sets the value of the book3RdPartyMotorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setBook3RdPartyMotorResult(Result value) {
        this.book3RdPartyMotorResult = value;
    }

}
