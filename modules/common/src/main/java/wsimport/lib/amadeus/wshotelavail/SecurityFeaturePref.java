
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SecurityFeaturePref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityFeaturePref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}SecurityFeaturePrefPreferLevel" default="Preferred" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityFeaturePref", propOrder = {
    "value"
})
public class SecurityFeaturePref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected SecurityFeaturePrefPreferLevel preferLevel;

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
     *     {@link SecurityFeaturePrefPreferLevel }
     *     
     */
    public SecurityFeaturePrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return SecurityFeaturePrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityFeaturePrefPreferLevel }
     *     
     */
    public void setPreferLevel(SecurityFeaturePrefPreferLevel value) {
        this.preferLevel = value;
    }

}
