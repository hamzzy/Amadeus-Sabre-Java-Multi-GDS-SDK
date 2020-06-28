
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowDetailsTypeAirSeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowDetailsTypeAirSeat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceFees" type="{http://epowerv5.amadeus.com.tr/WS}AncillaryServiceFeesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SeatAvailability" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatPrice" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatPriceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatCharacteristics">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AirBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowDetailsTypeAirSeat", propOrder = {
    "serviceFees"
})
public class RowDetailsTypeAirSeat {

    @XmlElement(name = "ServiceFees")
    protected AncillaryServiceFeesType serviceFees;
    @XmlAttribute(name = "SeatAvailability")
    protected String seatAvailability;
    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "SeatPrice")
    protected String seatPrice;
    @XmlAttribute(name = "SeatPriceCurrency")
    protected String seatPriceCurrency;
    @XmlAttribute(name = "SeatCharacteristics")
    protected List<String> seatCharacteristics;
    @XmlAttribute(name = "AirBookDesigCode")
    protected String airBookDesigCode;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the serviceFees property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceFeesType }
     *     
     */
    public AncillaryServiceFeesType getServiceFees() {
        return serviceFees;
    }

    /**
     * Sets the value of the serviceFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceFeesType }
     *     
     */
    public void setServiceFees(AncillaryServiceFeesType value) {
        this.serviceFees = value;
    }

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
     * Gets the value of the seatPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPrice() {
        return seatPrice;
    }

    /**
     * Sets the value of the seatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPrice(String value) {
        this.seatPrice = value;
    }

    /**
     * Gets the value of the seatPriceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPriceCurrency() {
        return seatPriceCurrency;
    }

    /**
     * Sets the value of the seatPriceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPriceCurrency(String value) {
        this.seatPriceCurrency = value;
    }

    /**
     * Gets the value of the seatCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatCharacteristics() {
        if (seatCharacteristics == null) {
            seatCharacteristics = new ArrayList<String>();
        }
        return this.seatCharacteristics;
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

}
