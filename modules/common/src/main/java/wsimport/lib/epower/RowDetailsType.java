
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirSeats" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfRowDetailsTypeAirSeat" minOccurs="0"/>
 *         &lt;element name="AirRowCharacteristics" type="{http://epowerv5.amadeus.com.tr/WS}RowDetailsTypeAirRowCharacteristics" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxNumberOfSeats" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AirBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowDetailsType", propOrder = {
    "airSeats",
    "airRowCharacteristics"
})
public class RowDetailsType {

    @XmlElement(name = "AirSeats")
    protected ArrayOfRowDetailsTypeAirSeat airSeats;
    @XmlElement(name = "AirRowCharacteristics")
    protected RowDetailsTypeAirRowCharacteristics airRowCharacteristics;
    @XmlAttribute(name = "MaxNumberOfSeats")
    protected BigInteger maxNumberOfSeats;
    @XmlAttribute(name = "RowNumber")
    protected BigInteger rowNumber;
    @XmlAttribute(name = "AirBookDesigCode")
    protected String airBookDesigCode;

    /**
     * Gets the value of the airSeats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRowDetailsTypeAirSeat }
     *     
     */
    public ArrayOfRowDetailsTypeAirSeat getAirSeats() {
        return airSeats;
    }

    /**
     * Sets the value of the airSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRowDetailsTypeAirSeat }
     *     
     */
    public void setAirSeats(ArrayOfRowDetailsTypeAirSeat value) {
        this.airSeats = value;
    }

    /**
     * Gets the value of the airRowCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link RowDetailsTypeAirRowCharacteristics }
     *     
     */
    public RowDetailsTypeAirRowCharacteristics getAirRowCharacteristics() {
        return airRowCharacteristics;
    }

    /**
     * Sets the value of the airRowCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowDetailsTypeAirRowCharacteristics }
     *     
     */
    public void setAirRowCharacteristics(RowDetailsTypeAirRowCharacteristics value) {
        this.airRowCharacteristics = value;
    }

    /**
     * Gets the value of the maxNumberOfSeats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    /**
     * Sets the value of the maxNumberOfSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfSeats(BigInteger value) {
        this.maxNumberOfSeats = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowNumber(BigInteger value) {
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
