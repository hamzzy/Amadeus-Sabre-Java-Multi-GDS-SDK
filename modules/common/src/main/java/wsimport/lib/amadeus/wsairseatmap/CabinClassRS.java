
package wsimport.lib.amadeus.wsairseatmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinClassRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinClassRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsAirSeatMap}TPA_ExtensionsRS" minOccurs="0"/>
 *         &lt;element name="AirRows" type="{http://traveltalk.com/wsAirSeatMap}ArrayOfAirRow" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CabinType" use="required" type="{http://traveltalk.com/wsAirSeatMap}CabinClassCabinType" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassRS", propOrder = {
    "tpaExtensions",
    "airRows"
})
public class CabinClassRS {

    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;
    @XmlElement(name = "AirRows")
    protected ArrayOfAirRow airRows;
    @XmlAttribute(name = "CabinType", required = true)
    protected CabinClassCabinType cabinType;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public TPAExtensionsRS getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public void setTPAExtensions(TPAExtensionsRS value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the airRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirRow }
     *     
     */
    public ArrayOfAirRow getAirRows() {
        return airRows;
    }

    /**
     * Sets the value of the airRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirRow }
     *     
     */
    public void setAirRows(ArrayOfAirRow value) {
        this.airRows = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClassCabinType }
     *     
     */
    public CabinClassCabinType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClassCabinType }
     *     
     */
    public void setCabinType(CabinClassCabinType value) {
        this.cabinType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
