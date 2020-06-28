
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreeBaggageAllowanceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeBaggageAllowanceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ItineraryReference" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SegmentReference" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeBaggageAllowanceTypes")
public class FreeBaggageAllowanceTypes {

    @XmlAttribute(name = "ItineraryReference", required = true)
    protected int itineraryReference;
    @XmlAttribute(name = "SegmentReference", required = true)
    protected int segmentReference;
    @XmlAttribute(name = "PassengerType")
    protected String passengerType;
    @XmlAttribute(name = "Unit")
    protected String unit;
    @XmlAttribute(name = "Quantity", required = true)
    protected int quantity;

    /**
     * Gets the value of the itineraryReference property.
     * 
     */
    public int getItineraryReference() {
        return itineraryReference;
    }

    /**
     * Sets the value of the itineraryReference property.
     * 
     */
    public void setItineraryReference(int value) {
        this.itineraryReference = value;
    }

    /**
     * Gets the value of the segmentReference property.
     * 
     */
    public int getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     */
    public void setSegmentReference(int value) {
        this.segmentReference = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

}
