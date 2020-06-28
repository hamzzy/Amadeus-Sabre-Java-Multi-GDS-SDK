
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PhysChallFeaturePref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysChallFeaturePref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}PhysChallFeaturePrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="PhysChallFeatureType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysChallFeaturePref", propOrder = {
    "value"
})
public class PhysChallFeaturePref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected PhysChallFeaturePrefPreferLevel preferLevel;
    @XmlAttribute(name = "PhysChallFeatureType")
    protected String physChallFeatureType;

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
     *     {@link PhysChallFeaturePrefPreferLevel }
     *     
     */
    public PhysChallFeaturePrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return PhysChallFeaturePrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysChallFeaturePrefPreferLevel }
     *     
     */
    public void setPreferLevel(PhysChallFeaturePrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the physChallFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysChallFeatureType() {
        return physChallFeatureType;
    }

    /**
     * Sets the value of the physChallFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysChallFeatureType(String value) {
        this.physChallFeatureType = value;
    }

}
