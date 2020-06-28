
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMiniRulesPriceText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMiniRulesPriceText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MiniRulesPriceText" type="{http://epowerv5.amadeus.com.tr/WS}MiniRulesPriceText" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMiniRulesPriceText", propOrder = {
    "miniRulesPriceText"
})
public class ArrayOfMiniRulesPriceText {

    @XmlElement(name = "MiniRulesPriceText", nillable = true)
    protected List<MiniRulesPriceText> miniRulesPriceText;

    /**
     * Gets the value of the miniRulesPriceText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miniRulesPriceText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiniRulesPriceText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesPriceText }
     * 
     * 
     */
    public List<MiniRulesPriceText> getMiniRulesPriceText() {
        if (miniRulesPriceText == null) {
            miniRulesPriceText = new ArrayList<MiniRulesPriceText>();
        }
        return this.miniRulesPriceText;
    }

}
