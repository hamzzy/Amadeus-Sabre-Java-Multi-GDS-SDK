
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativePosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativePosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transportations" type="{http://traveltalk.com/wsHotelAvail}ArrayOfTransportation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Nearest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IndexPointCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativePosition", propOrder = {
    "transportations"
})
public class RelativePosition {

    @XmlElement(name = "Transportations")
    protected ArrayOfTransportation transportations;
    @XmlAttribute(name = "Direction")
    protected String direction;
    @XmlAttribute(name = "Distance")
    protected String distance;
    @XmlAttribute(name = "Nearest")
    protected Boolean nearest;
    @XmlAttribute(name = "IndexPointCode")
    protected String indexPointCode;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the transportations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransportation }
     *     
     */
    public ArrayOfTransportation getTransportations() {
        return transportations;
    }

    /**
     * Sets the value of the transportations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransportation }
     *     
     */
    public void setTransportations(ArrayOfTransportation value) {
        this.transportations = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Gets the value of the nearest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNearest() {
        return nearest;
    }

    /**
     * Sets the value of the nearest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNearest(Boolean value) {
        this.nearest = value;
    }

    /**
     * Gets the value of the indexPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexPointCode() {
        return indexPointCode;
    }

    /**
     * Sets the value of the indexPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexPointCode(String value) {
        this.indexPointCode = value;
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
