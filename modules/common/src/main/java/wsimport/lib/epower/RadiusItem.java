
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadiusItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadiusItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FromValue" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ToValue" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadiusItem", propOrder = {
    "index"
})
public class RadiusItem {

    @XmlElement(name = "Index")
    protected int index;
    @XmlAttribute(name = "FromValue", required = true)
    protected int fromValue;
    @XmlAttribute(name = "ToValue", required = true)
    protected int toValue;
    @XmlAttribute(name = "MeasureUnit")
    protected String measureUnit;

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the fromValue property.
     * 
     */
    public int getFromValue() {
        return fromValue;
    }

    /**
     * Sets the value of the fromValue property.
     * 
     */
    public void setFromValue(int value) {
        this.fromValue = value;
    }

    /**
     * Gets the value of the toValue property.
     * 
     */
    public int getToValue() {
        return toValue;
    }

    /**
     * Sets the value of the toValue property.
     * 
     */
    public void setToValue(int value) {
        this.toValue = value;
    }

    /**
     * Gets the value of the measureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Sets the value of the measureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnit(String value) {
        this.measureUnit = value;
    }

}
