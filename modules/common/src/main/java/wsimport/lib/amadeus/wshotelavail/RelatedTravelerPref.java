
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedTravelerPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedTravelerPref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://traveltalk.com/wsHotelAvail}UniqueID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}RelatedTravelerPrefPreferLevel" default="Preferred" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedTravelerPref", propOrder = {
    "uniqueID"
})
public class RelatedTravelerPref {

    @XmlElement(name = "UniqueID")
    protected UniqueID uniqueID;
    @XmlAttribute(name = "PreferLevel")
    protected RelatedTravelerPrefPreferLevel preferLevel;

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

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedTravelerPrefPreferLevel }
     *     
     */
    public RelatedTravelerPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return RelatedTravelerPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedTravelerPrefPreferLevel }
     *     
     */
    public void setPreferLevel(RelatedTravelerPrefPreferLevel value) {
        this.preferLevel = value;
    }

}
