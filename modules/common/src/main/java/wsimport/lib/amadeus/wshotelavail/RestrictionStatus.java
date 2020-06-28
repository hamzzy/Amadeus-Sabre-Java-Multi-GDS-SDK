
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestrictionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Restriction" type="{http://traveltalk.com/wsHotelAvail}RestrictionStatusRestriction" />
 *       &lt;attribute name="Status" type="{http://traveltalk.com/wsHotelAvail}RestrictionStatusStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionStatus")
public class RestrictionStatus {

    @XmlAttribute(name = "Restriction")
    protected RestrictionStatusRestriction restriction;
    @XmlAttribute(name = "Status")
    protected RestrictionStatusStatus status;

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionStatusRestriction }
     *     
     */
    public RestrictionStatusRestriction getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionStatusRestriction }
     *     
     */
    public void setRestriction(RestrictionStatusRestriction value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionStatusStatus }
     *     
     */
    public RestrictionStatusStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionStatusStatus }
     *     
     */
    public void setStatus(RestrictionStatusStatus value) {
        this.status = value;
    }

}
