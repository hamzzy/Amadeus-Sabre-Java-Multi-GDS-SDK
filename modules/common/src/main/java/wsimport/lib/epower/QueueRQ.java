
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueueRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueRQ", propOrder = {
    "queueNumber",
    "categoryNumber"
})
public class QueueRQ {

    @XmlElement(name = "QueueNumber")
    protected String queueNumber;
    @XmlElement(name = "CategoryNumber")
    protected String categoryNumber;

    /**
     * Gets the value of the queueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueNumber() {
        return queueNumber;
    }

    /**
     * Sets the value of the queueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueNumber(String value) {
        this.queueNumber = value;
    }

    /**
     * Gets the value of the categoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryNumber() {
        return categoryNumber;
    }

    /**
     * Sets the value of the categoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryNumber(String value) {
        this.categoryNumber = value;
    }

}
