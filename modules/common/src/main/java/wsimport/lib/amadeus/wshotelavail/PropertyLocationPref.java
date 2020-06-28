
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PropertyLocationPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyLocationPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}PropertyLocationPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="PropertyLocationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyLocationPref", propOrder = {
    "value"
})
public class PropertyLocationPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected PropertyLocationPrefPreferLevel preferLevel;
    @XmlAttribute(name = "PropertyLocationType")
    protected String propertyLocationType;

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
     *     {@link PropertyLocationPrefPreferLevel }
     *     
     */
    public PropertyLocationPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return PropertyLocationPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyLocationPrefPreferLevel }
     *     
     */
    public void setPreferLevel(PropertyLocationPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the propertyLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyLocationType() {
        return propertyLocationType;
    }

    /**
     * Sets the value of the propertyLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyLocationType(String value) {
        this.propertyLocationType = value;
    }

}
