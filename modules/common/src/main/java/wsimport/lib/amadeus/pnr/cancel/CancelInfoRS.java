
package wsimport.lib.amadeus.pnr.cancel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelInfoRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelInfoRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelRules" type="{http://traveltalk.com/wsPNRCancel}ArrayOfCancelRule" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://traveltalk.com/wsPNRCancel}UniqueID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelInfoRS", propOrder = {
    "cancelRules",
    "uniqueID"
})
public class CancelInfoRS {

    @XmlElement(name = "CancelRules")
    protected ArrayOfCancelRule cancelRules;
    @XmlElement(name = "UniqueID")
    protected UniqueID uniqueID;

    /**
     * Gets the value of the cancelRules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelRule }
     *     
     */
    public ArrayOfCancelRule getCancelRules() {
        return cancelRules;
    }

    /**
     * Sets the value of the cancelRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelRule }
     *     
     */
    public void setCancelRules(ArrayOfCancelRule value) {
        this.cancelRules = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setUniqueID(UniqueID value) {
        this.uniqueID = value;
    }

}
