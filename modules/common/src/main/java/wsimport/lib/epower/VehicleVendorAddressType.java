
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleVendorAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleVendorAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AddressType">
 *       &lt;sequence>
 *         &lt;element name="OpeningHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClosingHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleVendorAddressType", propOrder = {
    "openingHour",
    "closingHour",
    "faxNumber",
    "officePhone"
})
public class VehicleVendorAddressType
    extends AddressType
{

    @XmlElement(name = "OpeningHour")
    protected String openingHour;
    @XmlElement(name = "ClosingHour")
    protected String closingHour;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "OfficePhone")
    protected String officePhone;

    /**
     * Gets the value of the openingHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningHour() {
        return openingHour;
    }

    /**
     * Sets the value of the openingHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningHour(String value) {
        this.openingHour = value;
    }

    /**
     * Gets the value of the closingHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingHour() {
        return closingHour;
    }

    /**
     * Sets the value of the closingHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingHour(String value) {
        this.closingHour = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the officePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Sets the value of the officePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

}
