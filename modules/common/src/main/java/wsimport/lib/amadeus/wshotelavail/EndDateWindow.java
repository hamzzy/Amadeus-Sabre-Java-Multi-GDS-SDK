
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndDateWindow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndDateWindow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DOW" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndDateWindow")
public class EndDateWindow {

    @XmlAttribute(name = "EarliestDate")
    protected String earliestDate;
    @XmlAttribute(name = "LatestDate")
    protected String latestDate;
    @XmlAttribute(name = "DOW")
    protected String dow;

    /**
     * Gets the value of the earliestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestDate() {
        return earliestDate;
    }

    /**
     * Sets the value of the earliestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestDate(String value) {
        this.earliestDate = value;
    }

    /**
     * Gets the value of the latestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestDate() {
        return latestDate;
    }

    /**
     * Sets the value of the latestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestDate(String value) {
        this.latestDate = value;
    }

    /**
     * Gets the value of the dow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOW() {
        return dow;
    }

    /**
     * Sets the value of the dow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOW(String value) {
        this.dow = value;
    }

}
