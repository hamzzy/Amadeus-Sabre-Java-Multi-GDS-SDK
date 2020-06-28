
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Area complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Area">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaDescription" type="{http://traveltalk.com/wsHotelAvail}AreaDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", propOrder = {
    "areaDescription"
})
public class Area {

    @XmlElement(name = "AreaDescription")
    protected AreaDescription areaDescription;
    @XmlAttribute(name = "AreaID")
    protected String areaID;

    /**
     * Gets the value of the areaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link AreaDescription }
     *     
     */
    public AreaDescription getAreaDescription() {
        return areaDescription;
    }

    /**
     * Sets the value of the areaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaDescription }
     *     
     */
    public void setAreaDescription(AreaDescription value) {
        this.areaDescription = value;
    }

    /**
     * Gets the value of the areaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * Sets the value of the areaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
    }

}
