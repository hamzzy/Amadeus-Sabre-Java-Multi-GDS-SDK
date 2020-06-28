
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIndCoverageReqsTypeLuggageItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIndCoverageReqsTypeLuggageItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LuggageItem" type="{http://epowerv5.amadeus.com.tr/WS}IndCoverageReqsTypeLuggageItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIndCoverageReqsTypeLuggageItem", propOrder = {
    "luggageItem"
})
public class ArrayOfIndCoverageReqsTypeLuggageItem {

    @XmlElement(name = "LuggageItem")
    protected List<IndCoverageReqsTypeLuggageItem> luggageItem;

    /**
     * Gets the value of the luggageItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the luggageItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLuggageItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndCoverageReqsTypeLuggageItem }
     * 
     * 
     */
    public List<IndCoverageReqsTypeLuggageItem> getLuggageItem() {
        if (luggageItem == null) {
            luggageItem = new ArrayList<IndCoverageReqsTypeLuggageItem>();
        }
        return this.luggageItem;
    }

}
