
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PersonalSrvcPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalSrvcPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}PersonalSrvcPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="PersonalSrvcType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalSrvcPref", propOrder = {
    "value"
})
public class PersonalSrvcPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected PersonalSrvcPrefPreferLevel preferLevel;
    @XmlAttribute(name = "PersonalSrvcType")
    protected String personalSrvcType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalSrvcPrefPreferLevel }
     *     
     */
    public PersonalSrvcPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return PersonalSrvcPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalSrvcPrefPreferLevel }
     *     
     */
    public void setPreferLevel(PersonalSrvcPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the personalSrvcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalSrvcType() {
        return personalSrvcType;
    }

    /**
     * Sets the value of the personalSrvcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalSrvcType(String value) {
        this.personalSrvcType = value;
    }

}
