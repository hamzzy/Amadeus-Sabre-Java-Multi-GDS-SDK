
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRateQualifierTypeRateComment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRateQualifierTypeRateComment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateComment" type="{http://epowerv5.amadeus.com.tr/WS}RateQualifierTypeRateComment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRateQualifierTypeRateComment", propOrder = {
    "rateComment"
})
public class ArrayOfRateQualifierTypeRateComment {

    @XmlElement(name = "RateComment")
    protected List<RateQualifierTypeRateComment> rateComment;

    /**
     * Gets the value of the rateComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateQualifierTypeRateComment }
     * 
     * 
     */
    public List<RateQualifierTypeRateComment> getRateComment() {
        if (rateComment == null) {
            rateComment = new ArrayList<RateQualifierTypeRateComment>();
        }
        return this.rateComment;
    }

}
