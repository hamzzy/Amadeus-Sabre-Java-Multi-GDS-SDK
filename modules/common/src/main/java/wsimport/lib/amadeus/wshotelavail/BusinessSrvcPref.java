
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for BusinessSrvcPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessSrvcPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}BusinessSrvcPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="BusinessSrvcType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessSrvcPref", propOrder = {
    "value"
})
public class BusinessSrvcPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected BusinessSrvcPrefPreferLevel preferLevel;
    @XmlAttribute(name = "BusinessSrvcType")
    protected String businessSrvcType;

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
     *     {@link BusinessSrvcPrefPreferLevel }
     *     
     */
    public BusinessSrvcPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return BusinessSrvcPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSrvcPrefPreferLevel }
     *     
     */
    public void setPreferLevel(BusinessSrvcPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the businessSrvcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessSrvcType() {
        return businessSrvcType;
    }

    /**
     * Sets the value of the businessSrvcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessSrvcType(String value) {
        this.businessSrvcType = value;
    }

}
