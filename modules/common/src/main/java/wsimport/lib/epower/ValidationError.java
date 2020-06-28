
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelatedEntityPropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://epowerv5.amadeus.com.tr/WS}ValidationErrorCodes"/>
 *         &lt;element name="ErrorType" type="{http://epowerv5.amadeus.com.tr/WS}ValidationErrorTypes"/>
 *         &lt;element name="ErrorCategory" type="{http://epowerv5.amadeus.com.tr/WS}ValidationErrorCategories"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageValueList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfString5" minOccurs="0"/>
 *         &lt;element name="MessageValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GotoPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationError", propOrder = {
    "relatedEntityPropertyName",
    "errorCode",
    "errorType",
    "errorCategory",
    "errorMessage",
    "messageValueList",
    "messageValue",
    "mainMessage",
    "errorField",
    "gotoPage"
})
public class ValidationError {

    @XmlElement(name = "RelatedEntityPropertyName")
    protected String relatedEntityPropertyName;
    @XmlElement(name = "ErrorCode", required = true)
    @XmlSchemaType(name = "string")
    protected ValidationErrorCodes errorCode;
    @XmlElement(name = "ErrorType", required = true)
    @XmlSchemaType(name = "string")
    protected ValidationErrorTypes errorType;
    @XmlElement(name = "ErrorCategory", required = true)
    @XmlSchemaType(name = "string")
    protected ValidationErrorCategories errorCategory;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "MessageValueList")
    protected ArrayOfString5 messageValueList;
    @XmlElement(name = "MessageValue")
    protected String messageValue;
    @XmlElement(name = "MainMessage")
    protected String mainMessage;
    @XmlElement(name = "ErrorField")
    protected String errorField;
    @XmlElement(name = "GotoPage")
    protected String gotoPage;

    /**
     * Gets the value of the relatedEntityPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedEntityPropertyName() {
        return relatedEntityPropertyName;
    }

    /**
     * Sets the value of the relatedEntityPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedEntityPropertyName(String value) {
        this.relatedEntityPropertyName = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationErrorCodes }
     *     
     */
    public ValidationErrorCodes getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationErrorCodes }
     *     
     */
    public void setErrorCode(ValidationErrorCodes value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationErrorTypes }
     *     
     */
    public ValidationErrorTypes getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationErrorTypes }
     *     
     */
    public void setErrorType(ValidationErrorTypes value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the errorCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationErrorCategories }
     *     
     */
    public ValidationErrorCategories getErrorCategory() {
        return errorCategory;
    }

    /**
     * Sets the value of the errorCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationErrorCategories }
     *     
     */
    public void setErrorCategory(ValidationErrorCategories value) {
        this.errorCategory = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the messageValueList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString5 }
     *     
     */
    public ArrayOfString5 getMessageValueList() {
        return messageValueList;
    }

    /**
     * Sets the value of the messageValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString5 }
     *     
     */
    public void setMessageValueList(ArrayOfString5 value) {
        this.messageValueList = value;
    }

    /**
     * Gets the value of the messageValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageValue() {
        return messageValue;
    }

    /**
     * Sets the value of the messageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageValue(String value) {
        this.messageValue = value;
    }

    /**
     * Gets the value of the mainMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainMessage() {
        return mainMessage;
    }

    /**
     * Sets the value of the mainMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainMessage(String value) {
        this.mainMessage = value;
    }

    /**
     * Gets the value of the errorField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorField() {
        return errorField;
    }

    /**
     * Sets the value of the errorField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorField(String value) {
        this.errorField = value;
    }

    /**
     * Gets the value of the gotoPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGotoPage() {
        return gotoPage;
    }

    /**
     * Sets the value of the gotoPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGotoPage(String value) {
        this.gotoPage = value;
    }

}
