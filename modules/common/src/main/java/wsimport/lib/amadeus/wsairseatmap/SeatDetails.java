
package wsimport.lib.amadeus.wsairseatmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinClass" type="{http://traveltalk.com/wsAirSeatMap}CabinClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResBookDesignations" type="{http://traveltalk.com/wsAirSeatMap}ArrayOfResBookDesignation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SeatUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDetails", propOrder = {
    "cabinClass",
    "resBookDesignations"
})
public class SeatDetails {

    @XmlElement(name = "CabinClass")
    protected List<CabinClass> cabinClass;
    @XmlElement(name = "ResBookDesignations")
    protected ArrayOfResBookDesignation resBookDesignations;
    @XmlAttribute(name = "SeatUpgrade")
    protected Boolean seatUpgrade;

    /**
     * Gets the value of the cabinClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinClass }
     * 
     * 
     */
    public List<CabinClass> getCabinClass() {
        if (cabinClass == null) {
            cabinClass = new ArrayList<CabinClass>();
        }
        return this.cabinClass;
    }

    /**
     * Gets the value of the resBookDesignations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResBookDesignation }
     *     
     */
    public ArrayOfResBookDesignation getResBookDesignations() {
        return resBookDesignations;
    }

    /**
     * Sets the value of the resBookDesignations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResBookDesignation }
     *     
     */
    public void setResBookDesignations(ArrayOfResBookDesignation value) {
        this.resBookDesignations = value;
    }

    /**
     * Gets the value of the seatUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSeatUpgrade() {
        if (seatUpgrade == null) {
            return false;
        } else {
            return seatUpgrade;
        }
    }

    /**
     * Sets the value of the seatUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeatUpgrade(Boolean value) {
        this.seatUpgrade = value;
    }

}
