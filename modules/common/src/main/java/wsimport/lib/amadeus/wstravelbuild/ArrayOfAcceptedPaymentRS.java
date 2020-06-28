
package wsimport.lib.amadeus.wstravelbuild;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAcceptedPaymentRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAcceptedPaymentRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptedPaymentRS" type="{http://traveltalk.com/wsTravelBuild}AcceptedPaymentRS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAcceptedPaymentRS", propOrder = {
    "acceptedPaymentRS"
})
public class ArrayOfAcceptedPaymentRS {

    @XmlElement(name = "AcceptedPaymentRS")
    protected List<AcceptedPaymentRS> acceptedPaymentRS;

    /**
     * Gets the value of the acceptedPaymentRS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedPaymentRS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedPaymentRS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptedPaymentRS }
     * 
     * 
     */
    public List<AcceptedPaymentRS> getAcceptedPaymentRS() {
        if (acceptedPaymentRS == null) {
            acceptedPaymentRS = new ArrayList<AcceptedPaymentRS>();
        }
        return this.acceptedPaymentRS;
    }

}
