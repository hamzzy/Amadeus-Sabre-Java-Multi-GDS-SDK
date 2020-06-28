
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamePref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamePref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://traveltalk.com/wsHotelAvail}UniqueID" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://traveltalk.com/wsHotelAvail}PersonName" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}NamePrefPreferLevel" default="Preferred" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamePref", propOrder = {
    "uniqueID",
    "personName"
})
public class NamePref {

    @XmlElement(name = "UniqueID")
    protected UniqueID uniqueID;
    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlAttribute(name = "PreferLevel")
    protected NamePrefPreferLevel preferLevel;

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setUniqueID(UniqueID value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefPreferLevel }
     *     
     */
    public NamePrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return NamePrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefPreferLevel }
     *     
     */
    public void setPreferLevel(NamePrefPreferLevel value) {
        this.preferLevel = value;
    }

}
