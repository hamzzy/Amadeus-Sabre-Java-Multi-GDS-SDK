
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PropertyAmenityPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyAmenityPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}PropertyAmenityPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="PropertyAmenityType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyAmenityPref", propOrder = {
    "value"
})
public class PropertyAmenityPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected PropertyAmenityPrefPreferLevel preferLevel;
    @XmlAttribute(name = "PropertyAmenityType")
    protected String propertyAmenityType;

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
     *     {@link PropertyAmenityPrefPreferLevel }
     *     
     */
    public PropertyAmenityPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return PropertyAmenityPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyAmenityPrefPreferLevel }
     *     
     */
    public void setPreferLevel(PropertyAmenityPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the propertyAmenityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyAmenityType() {
        return propertyAmenityType;
    }

    /**
     * Sets the value of the propertyAmenityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyAmenityType(String value) {
        this.propertyAmenityType = value;
    }

}
