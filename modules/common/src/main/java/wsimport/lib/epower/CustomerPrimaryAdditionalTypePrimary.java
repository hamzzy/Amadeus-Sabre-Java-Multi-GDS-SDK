
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPrimaryAdditionalTypePrimary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPrimaryAdditionalTypePrimary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}CustomerType">
 *       &lt;sequence>
 *         &lt;element name="CustomerID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPrimaryAdditionalTypePrimary", propOrder = {
    "customerID"
})
public class CustomerPrimaryAdditionalTypePrimary
    extends CustomerType
{

    @XmlElement(name = "CustomerID")
    protected UniqueIDType customerID;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setCustomerID(UniqueIDType value) {
        this.customerID = value;
    }

}
