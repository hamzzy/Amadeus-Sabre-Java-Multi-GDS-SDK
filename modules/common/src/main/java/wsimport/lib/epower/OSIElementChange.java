
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OSIElementChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OSIElementChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *         &lt;element name="OSIMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ChangeDetailAction" use="required" type="{http://epowerv5.amadeus.com.tr/WS}ChangeDetailActionTypes" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSIElementChange", propOrder = {
    "personName",
    "osiMessage"
})
public class OSIElementChange {

    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "OSIMessage")
    protected String osiMessage;
    @XmlAttribute(name = "ChangeDetailAction", required = true)
    protected ChangeDetailActionTypes changeDetailAction;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the osiMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSIMessage() {
        return osiMessage;
    }

    /**
     * Sets the value of the osiMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSIMessage(String value) {
        this.osiMessage = value;
    }

    /**
     * Gets the value of the changeDetailAction property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeDetailActionTypes }
     *     
     */
    public ChangeDetailActionTypes getChangeDetailAction() {
        return changeDetailAction;
    }

    /**
     * Sets the value of the changeDetailAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeDetailActionTypes }
     *     
     */
    public void setChangeDetailAction(ChangeDetailActionTypes value) {
        this.changeDetailAction = value;
    }

}
