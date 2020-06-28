
package wsimport.lib.axamansard;

import javax.xml.bind.annotation.*;

/**
 * <p>Java class for Result complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsSuccessful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnedObject" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "Result", propOrder = {
        "isSuccessful",
        "message",
        "returnedObject",
//        "travelPlanCost",
        "returnCode"
})
public class Result {

    @XmlElement(name = "IsSuccessful")
    protected boolean isSuccessful;
    protected String message;
    @XmlElement(name = "ReturnedObject")
    protected Object returnedObject;
//    @XmlElement(name = "TravelPlanCost")
//    protected Object travelPlanCost;
    @XmlElement(name = "ReturnCode")
    protected String returnCode;

    /**
     * Gets the value of the isSuccessful property.
     *
     */
    public boolean isIsSuccessful() {
        return isSuccessful;
    }

    /**
     * Sets the value of the isSuccessful property.
     *
     */
    public void setIsSuccessful(boolean value) {
        this.isSuccessful = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the returnedObject property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getReturnedObject() {
        return returnedObject;
    }

    /**
     * Sets the value of the returnedObject property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setReturnedObject(Object value) {
        this.returnedObject = value;
    }

    /**
     * Gets the value of the returnCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

}

