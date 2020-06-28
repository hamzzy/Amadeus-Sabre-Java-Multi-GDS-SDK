
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirRows" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfRowDetailsType" minOccurs="0"/>
 *         &lt;element name="AirColumns" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfColumnDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CabinType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}CabinType" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassType", propOrder = {
    "airRows",
    "airColumns"
})
public class CabinClassType {

    @XmlElement(name = "AirRows")
    protected ArrayOfRowDetailsType airRows;
    @XmlElement(name = "AirColumns")
    protected ArrayOfColumnDetailsType airColumns;
    @XmlAttribute(name = "CabinType", required = true)
    protected CabinType cabinType;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the airRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRowDetailsType }
     *     
     */
    public ArrayOfRowDetailsType getAirRows() {
        return airRows;
    }

    /**
     * Sets the value of the airRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRowDetailsType }
     *     
     */
    public void setAirRows(ArrayOfRowDetailsType value) {
        this.airRows = value;
    }

    /**
     * Gets the value of the airColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfColumnDetailsType }
     *     
     */
    public ArrayOfColumnDetailsType getAirColumns() {
        return airColumns;
    }

    /**
     * Sets the value of the airColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfColumnDetailsType }
     *     
     */
    public void setAirColumns(ArrayOfColumnDetailsType value) {
        this.airColumns = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinType(CabinType value) {
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
