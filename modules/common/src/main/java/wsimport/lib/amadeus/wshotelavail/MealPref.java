
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MealPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MealPref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}MealPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="MealType" type="{http://traveltalk.com/wsHotelAvail}MealPrefMealType" />
 *       &lt;attribute name="FavoriteFood" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Beverage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MealPref", propOrder = {
    "value"
})
public class MealPref {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PreferLevel")
    protected MealPrefPreferLevel preferLevel;
    @XmlAttribute(name = "MealType")
    protected MealPrefMealType mealType;
    @XmlAttribute(name = "FavoriteFood")
    protected String favoriteFood;
    @XmlAttribute(name = "Beverage")
    protected String beverage;

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
     *     {@link MealPrefPreferLevel }
     *     
     */
    public MealPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return MealPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealPrefPreferLevel }
     *     
     */
    public void setPreferLevel(MealPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the mealType property.
     * 
     * @return
     *     possible object is
     *     {@link MealPrefMealType }
     *     
     */
    public MealPrefMealType getMealType() {
        return mealType;
    }

    /**
     * Sets the value of the mealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealPrefMealType }
     *     
     */
    public void setMealType(MealPrefMealType value) {
        this.mealType = value;
    }

    /**
     * Gets the value of the favoriteFood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavoriteFood() {
        return favoriteFood;
    }

    /**
     * Sets the value of the favoriteFood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavoriteFood(String value) {
        this.favoriteFood = value;
    }

    /**
     * Gets the value of the beverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeverage() {
        return beverage;
    }

    /**
     * Sets the value of the beverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeverage(String value) {
        this.beverage = value;
    }

}
