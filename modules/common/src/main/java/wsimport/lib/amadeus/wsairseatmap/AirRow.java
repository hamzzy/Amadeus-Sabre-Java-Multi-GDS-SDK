
package wsimport.lib.amadeus.wsairseatmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirSeats" type="{http://traveltalk.com/wsAirSeatMap}ArrayOfAirSeat" minOccurs="0"/>
 *         &lt;element name="AirRowCharacteristics" type="{http://traveltalk.com/wsAirSeatMap}AirRowCharacteristics" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxNumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RowNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="AirBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirRow", propOrder = {
    "airSeats",
    "airRowCharacteristics"
})
public class AirRow {

    @XmlElement(name = "AirSeats")
    protected ArrayOfAirSeat airSeats;
    @XmlElement(name = "AirRowCharacteristics")
    protected AirRowCharacteristics airRowCharacteristics;
    @XmlAttribute(name = "MaxNumberOfSeats")
    protected Integer maxNumberOfSeats;
    @XmlAttribute(name = "RowNumber", required = true)
    protected int rowNumber;
    @XmlAttribute(name = "AirBookDesigCode")
    protected String airBookDesigCode;

    /**
     * Gets the value of the airSeats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirSeat }
     *     
     */
    public ArrayOfAirSeat getAirSeats() {
        return airSeats;
    }

    /**
     * Sets the value of the airSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirSeat }
     *     
     */
    public void setAirSeats(ArrayOfAirSeat value) {
        this.airSeats = value;
    }

    /**
     * Gets the value of the airRowCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link AirRowCharacteristics }
     *     
     */
    public AirRowCharacteristics getAirRowCharacteristics() {
        return airRowCharacteristics;
    }

    /**
     * Sets the value of the airRowCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRowCharacteristics }
     *     
     */
    public void setAirRowCharacteristics(AirRowCharacteristics value) {
        this.airRowCharacteristics = value;
    }

    /**
     * Gets the value of the maxNumberOfSeats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    /**
     * Sets the value of the maxNumberOfSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfSeats(Integer value) {
        this.maxNumberOfSeats = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     */
    public int getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     */
    public void setRowNumber(int value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the airBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirBookDesigCode() {
        return airBookDesigCode;
    }

    /**
     * Sets the value of the airBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirBookDesigCode(String value) {
        this.airBookDesigCode = value;
    }

}
