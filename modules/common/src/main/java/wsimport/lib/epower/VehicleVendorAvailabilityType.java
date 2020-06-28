
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleVendorAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleVendorAvailabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehRentalCore" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRentalCoreType" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="VehAvails" type="{http://epowerv5.amadeus.com.tr/WS}VehicleVendorAvailabilityTypeVehAvails" minOccurs="0"/>
 *         &lt;element name="Info" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailVendorInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VendorId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleVendorAvailabilityType", propOrder = {
    "vehRentalCore",
    "vendor",
    "vehAvails",
    "info"
})
public class VehicleVendorAvailabilityType {

    @XmlElement(name = "VehRentalCore")
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "Vendor")
    protected CompanyNameType vendor;
    @XmlElement(name = "VehAvails")
    protected VehicleVendorAvailabilityTypeVehAvails vehAvails;
    @XmlElement(name = "Info")
    protected VehicleAvailVendorInfoType info;
    @XmlAttribute(name = "VendorId")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger vendorId;

    /**
     * Gets the value of the vehRentalCore property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public VehicleRentalCoreType getVehRentalCore() {
        return vehRentalCore;
    }

    /**
     * Sets the value of the vehRentalCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public void setVehRentalCore(VehicleRentalCoreType value) {
        this.vehRentalCore = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setVendor(CompanyNameType value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the vehAvails property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleVendorAvailabilityTypeVehAvails }
     *     
     */
    public VehicleVendorAvailabilityTypeVehAvails getVehAvails() {
        return vehAvails;
    }

    /**
     * Sets the value of the vehAvails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleVendorAvailabilityTypeVehAvails }
     *     
     */
    public void setVehAvails(VehicleVendorAvailabilityTypeVehAvails value) {
        this.vehAvails = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailVendorInfoType }
     *     
     */
    public VehicleAvailVendorInfoType getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailVendorInfoType }
     *     
     */
    public void setInfo(VehicleAvailVendorInfoType value) {
        this.info = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVendorId(BigInteger value) {
        this.vendorId = value;
    }

}
