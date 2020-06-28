
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIndCoverageReqsTypePreexistingCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIndCoverageReqsTypePreexistingCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreexistingCondition" type="{http://epowerv5.amadeus.com.tr/WS}IndCoverageReqsTypePreexistingCondition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIndCoverageReqsTypePreexistingCondition", propOrder = {
    "preexistingCondition"
})
public class ArrayOfIndCoverageReqsTypePreexistingCondition {

    @XmlElement(name = "PreexistingCondition")
    protected List<IndCoverageReqsTypePreexistingCondition> preexistingCondition;

    /**
     * Gets the value of the preexistingCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preexistingCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreexistingCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndCoverageReqsTypePreexistingCondition }
     * 
     * 
     */
    public List<IndCoverageReqsTypePreexistingCondition> getPreexistingCondition() {
        if (preexistingCondition == null) {
            preexistingCondition = new ArrayList<IndCoverageReqsTypePreexistingCondition>();
        }
        return this.preexistingCondition;
    }

}
