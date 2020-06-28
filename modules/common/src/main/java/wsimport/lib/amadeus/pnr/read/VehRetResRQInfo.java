
package wsimport.lib.amadeus.pnr.read;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VehRetResRQInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehRetResRQInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickUpLocation" type="{http://traveltalk.com/wsPNRRead}PickUpLocation" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://traveltalk.com/wsPNRRead}Telephone" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://traveltalk.com/wsPNRRead}VendorRQ" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehRetResRQInfo", propOrder = {
    "pickUpLocation",
    "telephone",
    "vendor"
})
public class VehRetResRQInfo {

    @XmlElement(name = "PickUpLocation")
    protected PickUpLocation pickUpLocation;
    @XmlElement(name = "Telephone")
    protected Telephone telephone;
    @XmlElement(name = "Vendor")
    protected VendorRQ vendor;
    @XmlAttribute(name = "PickUpDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickUpDateTime;

    /**
     * Gets the value of the pickUpLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PickUpLocation }
     *     
     */
    public PickUpLocation getPickUpLocation() {
        return pickUpLocation;
    }

    /**
     * Sets the value of the pickUpLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickUpLocation }
     *     
     */
    public void setPickUpLocation(PickUpLocation value) {
        this.pickUpLocation = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link Telephone }
     *     
     */
    public Telephone getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telephone }
     *     
     */
    public void setTelephone(Telephone value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link VendorRQ }
     *     
     */
    public VendorRQ getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorRQ }
     *     
     */
    public void setVendor(VendorRQ value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the pickUpDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDateTime() {
        return pickUpDateTime;
    }

    /**
     * Sets the value of the pickUpDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDateTime(XMLGregorianCalendar value) {
        this.pickUpDateTime = value;
    }

}
