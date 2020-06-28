
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ScheduleChangeParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleChangeParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OldDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleChangeParameter", propOrder = {
    "segmentRef",
    "newDate",
    "oldDate"
})
public class ScheduleChangeParameter {

    @XmlElement(name = "SegmentRef")
    protected String segmentRef;
    @XmlElement(name = "NewDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newDate;
    @XmlElement(name = "OldDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oldDate;

    /**
     * Gets the value of the segmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

    /**
     * Gets the value of the newDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewDate() {
        return newDate;
    }

    /**
     * Sets the value of the newDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewDate(XMLGregorianCalendar value) {
        this.newDate = value;
    }

    /**
     * Gets the value of the oldDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOldDate() {
        return oldDate;
    }

    /**
     * Sets the value of the oldDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOldDate(XMLGregorianCalendar value) {
        this.oldDate = value;
    }

}
