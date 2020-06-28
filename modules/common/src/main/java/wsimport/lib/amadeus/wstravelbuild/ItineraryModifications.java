
package wsimport.lib.amadeus.wstravelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryModifications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryModifications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItineraryModification" type="{http://traveltalk.com/wsTravelBuild}ItineraryModification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Allowed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryModifications", propOrder = {
    "itineraryModification"
})
public class ItineraryModifications {

    @XmlElement(name = "ItineraryModification")
    protected List<ItineraryModification> itineraryModification;
    @XmlAttribute(name = "Allowed", required = true)
    protected boolean allowed;

    /**
     * Gets the value of the itineraryModification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryModification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryModification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryModification }
     * 
     * 
     */
    public List<ItineraryModification> getItineraryModification() {
        if (itineraryModification == null) {
            itineraryModification = new ArrayList<ItineraryModification>();
        }
        return this.itineraryModification;
    }

    /**
     * Gets the value of the allowed property.
     * 
     */
    public boolean isAllowed() {
        return allowed;
    }

    /**
     * Sets the value of the allowed property.
     * 
     */
    public void setAllowed(boolean value) {
        this.allowed = value;
    }

}
