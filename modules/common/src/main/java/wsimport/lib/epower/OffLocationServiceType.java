
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffLocationServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffLocationServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}OffLocationServiceCoreType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://epowerv5.amadeus.com.tr/WS}OffLocationServiceTypeTelephone" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SpecInstructions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocationServiceType", propOrder = {
    "personName",
    "telephone"
})
public class OffLocationServiceType
    extends OffLocationServiceCoreType
{

    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "Telephone")
    protected OffLocationServiceTypeTelephone telephone;
    @XmlAttribute(name = "SpecInstructions")
    protected String specInstructions;

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
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link OffLocationServiceTypeTelephone }
     *     
     */
    public OffLocationServiceTypeTelephone getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocationServiceTypeTelephone }
     *     
     */
    public void setTelephone(OffLocationServiceTypeTelephone value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the specInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecInstructions() {
        return specInstructions;
    }

    /**
     * Sets the value of the specInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecInstructions(String value) {
        this.specInstructions = value;
    }

}
