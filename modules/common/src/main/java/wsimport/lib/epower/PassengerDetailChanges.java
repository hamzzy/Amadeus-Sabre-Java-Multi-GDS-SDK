
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerDetailChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerDetailChanges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfChangeDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerDetailChanges", propOrder = {
    "changeDetails"
})
public class PassengerDetailChanges {

    @XmlElement(name = "ChangeDetails")
    protected ArrayOfChangeDetail changeDetails;

    /**
     * Gets the value of the changeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChangeDetail }
     *     
     */
    public ArrayOfChangeDetail getChangeDetails() {
        return changeDetails;
    }

    /**
     * Sets the value of the changeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChangeDetail }
     *     
     */
    public void setChangeDetails(ArrayOfChangeDetail value) {
        this.changeDetails = value;
    }

}
