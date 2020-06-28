
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for FoodSrvcPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodSrvcPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}FoodSrvcPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="FoodSrvcType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodSrvcPref", propOrder = {
    "value"
})
public class FoodSrvcPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected FoodSrvcPrefPreferLevel preferLevel;
    @XmlAttribute(name = "FoodSrvcType")
    protected String foodSrvcType;

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
     *     {@link FoodSrvcPrefPreferLevel }
     *     
     */
    public FoodSrvcPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return FoodSrvcPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodSrvcPrefPreferLevel }
     *     
     */
    public void setPreferLevel(FoodSrvcPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the foodSrvcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodSrvcType() {
        return foodSrvcType;
    }

    /**
     * Sets the value of the foodSrvcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodSrvcType(String value) {
        this.foodSrvcType = value;
    }

}
