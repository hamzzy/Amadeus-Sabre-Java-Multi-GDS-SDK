
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleReservationRQCoreTypeQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationRQCoreTypeQueue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationRQCoreTypeQueue")
public class VehicleReservationRQCoreTypeQueue {

    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "QueueNumber")
    protected String queueNumber;
    @XmlAttribute(name = "QueueCategory")
    protected String queueCategory;
    @XmlAttribute(name = "SystemCode")
    protected String systemCode;
    @XmlAttribute(name = "QueueID")
    protected String queueID;

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

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
     * Gets the value of the queueCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueCategory() {
        return queueCategory;
    }

    /**
     * Sets the value of the queueCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueCategory(String value) {
        this.queueCategory = value;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    /**
     * Gets the value of the queueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueID() {
        return queueID;
    }

    /**
     * Sets the value of the queueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueID(String value) {
        this.queueID = value;
    }

}
