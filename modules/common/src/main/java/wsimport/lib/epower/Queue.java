
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueueRQ" type="{http://epowerv5.amadeus.com.tr/WS}QueueRQ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queueRQ"
})
@XmlRootElement(name = "Queue")
public class Queue {

    @XmlElement(name = "QueueRQ")
    protected QueueRQ queueRQ;

    /**
     * Gets the value of the queueRQ property.
     * 
     * @return
     *     possible object is
     *     {@link QueueRQ }
     *     
     */
    public QueueRQ getQueueRQ() {
        return queueRQ;
    }

    /**
     * Sets the value of the queueRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueRQ }
     *     
     */
    public void setQueueRQ(QueueRQ value) {
        this.queueRQ = value;
    }

}
