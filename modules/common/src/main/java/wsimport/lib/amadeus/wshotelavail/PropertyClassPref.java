
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PropertyClassPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyClassPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}PropertyClassPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="PropertyClassType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyClassPref", propOrder = {
    "value"
})
public class PropertyClassPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected PropertyClassPrefPreferLevel preferLevel;
    @XmlAttribute(name = "PropertyClassType")
    protected String propertyClassType;

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
     *     {@link PropertyClassPrefPreferLevel }
     *     
     */
    public PropertyClassPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return PropertyClassPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyClassPrefPreferLevel }
     *     
     */
    public void setPreferLevel(PropertyClassPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the propertyClassType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyClassType() {
        return propertyClassType;
    }

    /**
     * Sets the value of the propertyClassType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyClassType(String value) {
        this.propertyClassType = value;
    }

}
