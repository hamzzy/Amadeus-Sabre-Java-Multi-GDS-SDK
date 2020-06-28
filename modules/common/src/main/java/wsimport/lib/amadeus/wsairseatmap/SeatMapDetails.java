
package wsimport.lib.amadeus.wsairseatmap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatMapDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinClass" type="{http://traveltalk.com/wsAirSeatMap}CabinClassRS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsAirSeatMap}TPA_ExtensionsRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TravelerRefNumberRPHs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapDetails", propOrder = {
    "cabinClass",
    "tpaExtensions"
})
public class SeatMapDetails {

    @XmlElement(name = "CabinClass")
    protected List<CabinClassRS> cabinClass;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;
    @XmlAttribute(name = "TravelerRefNumberRPHs")
    protected String travelerRefNumberRPHs;

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
     * {@link CabinClassRS }
     * 
     * 
     */
    public List<CabinClassRS> getCabinClass() {
        if (cabinClass == null) {
            cabinClass = new ArrayList<CabinClassRS>();
        }
        return this.cabinClass;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public TPAExtensionsRS getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public void setTPAExtensions(TPAExtensionsRS value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the travelerRefNumberRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerRefNumberRPHs() {
        return travelerRefNumberRPHs;
    }

    /**
     * Sets the value of the travelerRefNumberRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerRefNumberRPHs(String value) {
        this.travelerRefNumberRPHs = value;
    }

}
