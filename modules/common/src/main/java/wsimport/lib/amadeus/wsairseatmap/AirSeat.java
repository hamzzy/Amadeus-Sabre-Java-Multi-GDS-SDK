
package wsimport.lib.amadeus.wsairseatmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirSeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSeat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SeatAvailability" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSeat")
public class AirSeat {

    @XmlAttribute(name = "SeatAvailability")
    protected String seatAvailability;
    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "SeatCharacteristics")
    protected String seatCharacteristics;
    @XmlAttribute(name = "AirBookDesigCode")
    protected String airBookDesigCode;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "DiscountCode")
    protected String discountCode;

    /**
     * Gets the value of the seatAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatAvailability() {
        return seatAvailability;
    }

    /**
     * Sets the value of the seatAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatAvailability(String value) {
        this.seatAvailability = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the seatCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatCharacteristics() {
        return seatCharacteristics;
    }

    /**
     * Sets the value of the seatCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatCharacteristics(String value) {
        this.seatCharacteristics = value;
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

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

}
