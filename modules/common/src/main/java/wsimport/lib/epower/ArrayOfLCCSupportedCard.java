
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLCCSupportedCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLCCSupportedCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LCCSupportedCard" type="{http://epowerv5.amadeus.com.tr/WS}LCCSupportedCard" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLCCSupportedCard", propOrder = {
    "lccSupportedCard"
})
public class ArrayOfLCCSupportedCard {

    @XmlElement(name = "LCCSupportedCard", nillable = true)
    protected List<LCCSupportedCard> lccSupportedCard;

    /**
     * Gets the value of the lccSupportedCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lccSupportedCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLCCSupportedCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LCCSupportedCard }
     * 
     * 
     */
    public List<LCCSupportedCard> getLCCSupportedCard() {
        if (lccSupportedCard == null) {
            lccSupportedCard = new ArrayList<LCCSupportedCard>();
        }
        return this.lccSupportedCard;
    }

}
