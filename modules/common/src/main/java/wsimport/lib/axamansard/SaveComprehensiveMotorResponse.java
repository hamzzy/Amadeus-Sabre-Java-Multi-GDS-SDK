
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
 *         &lt;element name="SaveComprehensiveMotorResult" type="{http://tempuri.org/}Result" minOccurs="0"/>
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
    "saveComprehensiveMotorResult"
})
@XmlRootElement(name = "SaveComprehensiveMotorResponse")
public class SaveComprehensiveMotorResponse {

    @XmlElement(name = "SaveComprehensiveMotorResult")
    protected Result saveComprehensiveMotorResult;

    /**
     * Gets the value of the saveComprehensiveMotorResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getSaveComprehensiveMotorResult() {
        return saveComprehensiveMotorResult;
    }

    /**
     * Sets the value of the saveComprehensiveMotorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setSaveComprehensiveMotorResult(Result value) {
        this.saveComprehensiveMotorResult = value;
    }

}
