
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirColumnCharacteristics" type="{http://epowerv5.amadeus.com.tr/WS}ColumnDetailsTypeAirColumnCharacteristics" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SeatColumn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnDetailsType", propOrder = {
    "airColumnCharacteristics"
})
public class ColumnDetailsType {

    @XmlElement(name = "AirColumnCharacteristics")
    protected ColumnDetailsTypeAirColumnCharacteristics airColumnCharacteristics;
    @XmlAttribute(name = "SeatColumn")
    protected String seatColumn;

    /**
     * Gets the value of the airColumnCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnDetailsTypeAirColumnCharacteristics }
     *     
     */
    public ColumnDetailsTypeAirColumnCharacteristics getAirColumnCharacteristics() {
        return airColumnCharacteristics;
    }

    /**
     * Sets the value of the airColumnCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnDetailsTypeAirColumnCharacteristics }
     *     
     */
    public void setAirColumnCharacteristics(ColumnDetailsTypeAirColumnCharacteristics value) {
        this.airColumnCharacteristics = value;
    }

    /**
     * Gets the value of the seatColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatColumn() {
        return seatColumn;
    }

    /**
     * Sets the value of the seatColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatColumn(String value) {
        this.seatColumn = value;
    }

}
