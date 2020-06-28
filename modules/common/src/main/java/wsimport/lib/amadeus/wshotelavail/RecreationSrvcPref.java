
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for RecreationSrvcPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecreationSrvcPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}RecreationSrvcPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="RecreationSrvcType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecreationSrvcPref", propOrder = {
    "value"
})
public class RecreationSrvcPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected RecreationSrvcPrefPreferLevel preferLevel;
    @XmlAttribute(name = "RecreationSrvcType")
    protected String recreationSrvcType;

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
     *     {@link RecreationSrvcPrefPreferLevel }
     *     
     */
    public RecreationSrvcPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return RecreationSrvcPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecreationSrvcPrefPreferLevel }
     *     
     */
    public void setPreferLevel(RecreationSrvcPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the recreationSrvcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecreationSrvcType() {
        return recreationSrvcType;
    }

    /**
     * Sets the value of the recreationSrvcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecreationSrvcType(String value) {
        this.recreationSrvcType = value;
    }

}
