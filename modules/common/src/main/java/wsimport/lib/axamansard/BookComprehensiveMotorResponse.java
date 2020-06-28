
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
 *         &lt;element name="BookComprehensiveMotorResult" type="{http://tempuri.org/}Result" minOccurs="0"/>
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
    "bookComprehensiveMotorResult"
})
@XmlRootElement(name = "BookComprehensiveMotorResponse")
public class BookComprehensiveMotorResponse {

    @XmlElement(name = "BookComprehensiveMotorResult")
    protected Result bookComprehensiveMotorResult;

    /**
     * Gets the value of the bookComprehensiveMotorResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getBookComprehensiveMotorResult() {
        return bookComprehensiveMotorResult;
    }

    /**
     * Sets the value of the bookComprehensiveMotorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setBookComprehensiveMotorResult(Result value) {
        this.bookComprehensiveMotorResult = value;
    }

}
