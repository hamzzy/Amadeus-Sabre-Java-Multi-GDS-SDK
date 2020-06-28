
package wsimport.lib.sabre.bfm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *   Container for priced itineraries.
 *   
 * 
 * <p>Java class for PricedItinerariesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedItinerariesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedItinerariesType", propOrder = {
    "pricedItinerary"
})
public class PricedItinerariesType {

    @XmlElement(name = "PricedItinerary", required = true)
    protected List<PricedItineraryType> pricedItinerary;

    /**
     * Gets the value of the pricedItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedItineraryType }
     * 
     * 
     */
    public List<PricedItineraryType> getPricedItinerary() {
        if (pricedItinerary == null) {
            pricedItinerary = new ArrayList<PricedItineraryType>();
        }
        return this.pricedItinerary;
    }

}
