
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSR_Pref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSR_Pref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}SSR_PrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="SSR_Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSR_Pref")
public class SSRPref {

    @XmlAttribute(name = "PreferLevel")
    protected SSRPrefPreferLevel preferLevel;
    @XmlAttribute(name = "SSR_Code")
    protected String ssrCode;

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SSRPrefPreferLevel }
     *     
     */
    public SSRPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return SSRPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSRPrefPreferLevel }
     *     
     */
    public void setPreferLevel(SSRPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

}
