
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFrequentFlyerCardsWithPassengerForSeatMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFrequentFlyerCardsWithPassengerForSeatMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrequentFlyerCardsWithPassengerForSeatMap" type="{http://epowerv5.amadeus.com.tr/WS}FrequentFlyerCardsWithPassengerForSeatMap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFrequentFlyerCardsWithPassengerForSeatMap", propOrder = {
    "frequentFlyerCardsWithPassengerForSeatMap"
})
public class ArrayOfFrequentFlyerCardsWithPassengerForSeatMap {

    @XmlElement(name = "FrequentFlyerCardsWithPassengerForSeatMap", nillable = true)
    protected List<FrequentFlyerCardsWithPassengerForSeatMap> frequentFlyerCardsWithPassengerForSeatMap;

    /**
     * Gets the value of the frequentFlyerCardsWithPassengerForSeatMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequentFlyerCardsWithPassengerForSeatMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequentFlyerCardsWithPassengerForSeatMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentFlyerCardsWithPassengerForSeatMap }
     * 
     * 
     */
    public List<FrequentFlyerCardsWithPassengerForSeatMap> getFrequentFlyerCardsWithPassengerForSeatMap() {
        if (frequentFlyerCardsWithPassengerForSeatMap == null) {
            frequentFlyerCardsWithPassengerForSeatMap = new ArrayList<FrequentFlyerCardsWithPassengerForSeatMap>();
        }
        return this.frequentFlyerCardsWithPassengerForSeatMap;
    }

}
