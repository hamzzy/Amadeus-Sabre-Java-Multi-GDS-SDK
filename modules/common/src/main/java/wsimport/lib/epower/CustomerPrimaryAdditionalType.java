
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPrimaryAdditionalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPrimaryAdditionalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Primary" type="{http://epowerv5.amadeus.com.tr/WS}CustomerPrimaryAdditionalTypePrimary" minOccurs="0"/>
 *         &lt;element name="Additional" type="{http://epowerv5.amadeus.com.tr/WS}CustomerPrimaryAdditionalTypeAdditional" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPrimaryAdditionalType", propOrder = {
    "primary",
    "additional"
})
public class CustomerPrimaryAdditionalType {

    @XmlElement(name = "Primary")
    protected CustomerPrimaryAdditionalTypePrimary primary;
    @XmlElement(name = "Additional")
    protected List<CustomerPrimaryAdditionalTypeAdditional> additional;

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPrimaryAdditionalTypePrimary }
     *     
     */
    public CustomerPrimaryAdditionalTypePrimary getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPrimaryAdditionalTypePrimary }
     *     
     */
    public void setPrimary(CustomerPrimaryAdditionalTypePrimary value) {
        this.primary = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPrimaryAdditionalTypeAdditional }
     * 
     * 
     */
    public List<CustomerPrimaryAdditionalTypeAdditional> getAdditional() {
        if (additional == null) {
            additional = new ArrayList<CustomerPrimaryAdditionalTypeAdditional>();
        }
        return this.additional;
    }

}
