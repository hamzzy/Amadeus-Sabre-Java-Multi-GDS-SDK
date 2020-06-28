
package wsimport.lib.amadeus.wsairrules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MinimumStay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinimumStay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ReturnTimeOfDay" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="MinStay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="StayUnit" type="{http://traveltalk.com/wsAirRules}MinimumStayStayUnit" />
 *       &lt;attribute name="MinStayDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinimumStay")
public class MinimumStay {

    @XmlAttribute(name = "ReturnTimeOfDay")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnTimeOfDay;
    @XmlAttribute(name = "MinStay")
    protected Integer minStay;
    @XmlAttribute(name = "StayUnit")
    protected MinimumStayStayUnit stayUnit;
    @XmlAttribute(name = "MinStayDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minStayDate;

    /**
     * Gets the value of the returnTimeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnTimeOfDay() {
        return returnTimeOfDay;
    }

    /**
     * Sets the value of the returnTimeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnTimeOfDay(XMLGregorianCalendar value) {
        this.returnTimeOfDay = value;
    }

    /**
     * Gets the value of the minStay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinStay() {
        return minStay;
    }

    /**
     * Sets the value of the minStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinStay(Integer value) {
        this.minStay = value;
    }

    /**
     * Gets the value of the stayUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumStayStayUnit }
     *     
     */
    public MinimumStayStayUnit getStayUnit() {
        return stayUnit;
    }

    /**
     * Sets the value of the stayUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumStayStayUnit }
     *     
     */
    public void setStayUnit(MinimumStayStayUnit value) {
        this.stayUnit = value;
    }

    /**
     * Gets the value of the minStayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinStayDate() {
        return minStayDate;
    }

    /**
     * Sets the value of the minStayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinStayDate(XMLGregorianCalendar value) {
        this.minStayDate = value;
    }

}
