
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidationErrors" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfValidationError" minOccurs="0"/>
 *         &lt;element name="SelfValidationErrors" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfValidationError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseEntity", propOrder = {
    "validationErrors",
    "selfValidationErrors"
})
@XmlSeeAlso({
    DocumentDetails.class,
    CommunicationDetails.class,
    PassengerDetails.class,
    CrossBoarderSearchSetting.class,
    AddressDetails.class,
    GenericItem.class
})
public abstract class BaseEntity {

    @XmlElement(name = "ValidationErrors")
    protected ArrayOfValidationError validationErrors;
    @XmlElement(name = "SelfValidationErrors")
    protected ArrayOfValidationError selfValidationErrors;

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public ArrayOfValidationError getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public void setValidationErrors(ArrayOfValidationError value) {
        this.validationErrors = value;
    }

    /**
     * Gets the value of the selfValidationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public ArrayOfValidationError getSelfValidationErrors() {
        return selfValidationErrors;
    }

    /**
     * Sets the value of the selfValidationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public void setSelfValidationErrors(ArrayOfValidationError value) {
        this.selfValidationErrors = value;
    }

}
