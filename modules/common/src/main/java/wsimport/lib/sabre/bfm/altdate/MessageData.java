
package wsimport.lib.sabre.bfm.altdate;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}MessageId"/>
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}Timestamp"/>
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}RefToMessageId" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}TimeToLive" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}Timeout" minOccurs="0"/>
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
    "messageId",
    "timestamp",
    "refToMessageId",
    "timeToLive",
    "timeout"
})
@XmlRootElement(name = "MessageData", namespace = "http://www.ebxml.org/namespaces/messageHeader")
public class MessageData {

    @XmlElement(name = "MessageId", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected String messageId;
    @XmlElement(name = "Timestamp", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected String timestamp;
    @XmlElement(name = "RefToMessageId", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    protected String refToMessageId;
    @XmlElement(name = "TimeToLive", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeToLive;
    @XmlElement(name = "Timeout", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger timeout;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the refToMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefToMessageId() {
        return refToMessageId;
    }

    /**
     * Sets the value of the refToMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefToMessageId(String value) {
        this.refToMessageId = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeToLive(XMLGregorianCalendar value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeout(BigInteger value) {
        this.timeout = value;
    }

}
