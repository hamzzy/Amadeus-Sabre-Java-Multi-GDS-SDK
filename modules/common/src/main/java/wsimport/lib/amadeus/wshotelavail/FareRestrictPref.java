
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareRestrictPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRestrictPref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}FareRestrictPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="FareRestriction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRestrictPref")
public class FareRestrictPref {

    @XmlAttribute(name = "PreferLevel")
    protected FareRestrictPrefPreferLevel preferLevel;
    @XmlAttribute(name = "FareRestriction")
    protected String fareRestriction;

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link FareRestrictPrefPreferLevel }
     *     
     */
    public FareRestrictPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return FareRestrictPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRestrictPrefPreferLevel }
     *     
     */
    public void setPreferLevel(FareRestrictPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the fareRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRestriction() {
        return fareRestriction;
    }

    /**
     * Sets the value of the fareRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRestriction(String value) {
        this.fareRestriction = value;
    }

}
