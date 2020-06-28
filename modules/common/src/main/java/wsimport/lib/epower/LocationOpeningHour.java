
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationOpeningHour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationOpeningHour">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="OpeningHours" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationOpeningHour")
public class LocationOpeningHour {

    @XmlAttribute(name = "OpeningHours")
    protected String openingHours;
    @XmlAttribute(name = "DayOfWeek")
    protected String dayOfWeek;

    /**
     * Gets the value of the openingHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningHours() {
        return openingHours;
    }

    /**
     * Sets the value of the openingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningHours(String value) {
        this.openingHours = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfWeek(String value) {
        this.dayOfWeek = value;
    }

}
