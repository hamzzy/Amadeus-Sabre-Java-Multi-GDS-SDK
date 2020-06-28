
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BaseEntity">
 *       &lt;sequence>
 *         &lt;element name="Addresses" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAddressDB" minOccurs="0"/>
 *         &lt;element name="AddresHints" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAddressHint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressDetails", propOrder = {
    "addresses",
    "addresHints"
})
public class AddressDetails
    extends BaseEntity
{

    @XmlElement(name = "Addresses")
    protected ArrayOfAddressDB addresses;
    @XmlElement(name = "AddresHints")
    protected ArrayOfAddressHint addresHints;

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddressDB }
     *     
     */
    public ArrayOfAddressDB getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddressDB }
     *     
     */
    public void setAddresses(ArrayOfAddressDB value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the addresHints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddressHint }
     *     
     */
    public ArrayOfAddressHint getAddresHints() {
        return addresHints;
    }

    /**
     * Sets the value of the addresHints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddressHint }
     *     
     */
    public void setAddresHints(ArrayOfAddressHint value) {
        this.addresHints = value;
    }

}
