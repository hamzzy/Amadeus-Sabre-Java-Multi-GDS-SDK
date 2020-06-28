
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Deadline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Deadline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="OffsetTimeUnit" type="{http://traveltalk.com/wsHotelAvail}DeadlineOffsetTimeUnit" />
 *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="OffsetDropTime" type="{http://traveltalk.com/wsHotelAvail}DeadlineOffsetDropTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deadline")
public class Deadline {

    @XmlAttribute(name = "AbsoluteDeadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar absoluteDeadline;
    @XmlAttribute(name = "OffsetTimeUnit")
    protected DeadlineOffsetTimeUnit offsetTimeUnit;
    @XmlAttribute(name = "OffsetUnitMultiplier")
    protected Integer offsetUnitMultiplier;
    @XmlAttribute(name = "OffsetDropTime")
    protected DeadlineOffsetDropTime offsetDropTime;

    /**
     * Gets the value of the absoluteDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbsoluteDeadline() {
        return absoluteDeadline;
    }

    /**
     * Sets the value of the absoluteDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbsoluteDeadline(XMLGregorianCalendar value) {
        this.absoluteDeadline = value;
    }

    /**
     * Gets the value of the offsetTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DeadlineOffsetTimeUnit }
     *     
     */
    public DeadlineOffsetTimeUnit getOffsetTimeUnit() {
        return offsetTimeUnit;
    }

    /**
     * Sets the value of the offsetTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlineOffsetTimeUnit }
     *     
     */
    public void setOffsetTimeUnit(DeadlineOffsetTimeUnit value) {
        this.offsetTimeUnit = value;
    }

    /**
     * Gets the value of the offsetUnitMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffsetUnitMultiplier() {
        return offsetUnitMultiplier;
    }

    /**
     * Sets the value of the offsetUnitMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffsetUnitMultiplier(Integer value) {
        this.offsetUnitMultiplier = value;
    }

    /**
     * Gets the value of the offsetDropTime property.
     * 
     * @return
     *     possible object is
     *     {@link DeadlineOffsetDropTime }
     *     
     */
    public DeadlineOffsetDropTime getOffsetDropTime() {
        return offsetDropTime;
    }

    /**
     * Sets the value of the offsetDropTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlineOffsetDropTime }
     *     
     */
    public void setOffsetDropTime(DeadlineOffsetDropTime value) {
        this.offsetDropTime = value;
    }

}
