
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MealsIncluded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MealsIncluded">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Lunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Dinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MealsIncluded")
public class MealsIncluded {

    @XmlAttribute(name = "Breakfast")
    protected Boolean breakfast;
    @XmlAttribute(name = "Lunch")
    protected Boolean lunch;
    @XmlAttribute(name = "Dinner")
    protected Boolean dinner;

    /**
     * Gets the value of the breakfast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreakfast() {
        return breakfast;
    }

    /**
     * Sets the value of the breakfast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakfast(Boolean value) {
        this.breakfast = value;
    }

    /**
     * Gets the value of the lunch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLunch() {
        return lunch;
    }

    /**
     * Sets the value of the lunch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLunch(Boolean value) {
        this.lunch = value;
    }

    /**
     * Gets the value of the dinner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDinner() {
        return dinner;
    }

    /**
     * Sets the value of the dinner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDinner(Boolean value) {
        this.dinner = value;
    }

}
