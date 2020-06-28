
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
 *         &lt;element name="QueueRS" type="{http://epowerv5.amadeus.com.tr/WS}QueueRS" minOccurs="0"/>
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
    "queueRS"
})
@XmlRootElement(name = "QueueResponse")
public class QueueResponse {

    @XmlElement(name = "QueueRS")
    protected QueueRS queueRS;

    /**
     * Gets the value of the queueRS property.
     * 
     * @return
     *     possible object is
     *     {@link QueueRS }
     *     
     */
    public QueueRS getQueueRS() {
        return queueRS;
    }

    /**
     * Sets the value of the queueRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueRS }
     *     
     */
    public void setQueueRS(QueueRS value) {
        this.queueRS = value;
    }

}
