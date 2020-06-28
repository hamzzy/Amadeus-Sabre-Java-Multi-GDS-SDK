
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleTypeVehIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleTypeVehIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="VehicleAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LicensePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VehicleID_Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VehicleColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleTypeVehIdentity")
public class VehicleTypeVehIdentity {

    @XmlAttribute(name = "VehicleAssetNumber")
    protected String vehicleAssetNumber;
    @XmlAttribute(name = "LicensePlateNumber")
    protected String licensePlateNumber;
    @XmlAttribute(name = "StateProvCode")
    protected String stateProvCode;
    @XmlAttribute(name = "CountryCode")
    protected String countryCode;
    @XmlAttribute(name = "VehicleID_Number")
    protected String vehicleIDNumber;
    @XmlAttribute(name = "VehicleColor")
    protected String vehicleColor;

    /**
     * Gets the value of the vehicleAssetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleAssetNumber() {
        return vehicleAssetNumber;
    }

    /**
     * Sets the value of the vehicleAssetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleAssetNumber(String value) {
        this.vehicleAssetNumber = value;
    }

    /**
     * Gets the value of the licensePlateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * Sets the value of the licensePlateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlateNumber(String value) {
        this.licensePlateNumber = value;
    }

    /**
     * Gets the value of the stateProvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvCode() {
        return stateProvCode;
    }

    /**
     * Sets the value of the stateProvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvCode(String value) {
        this.stateProvCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the vehicleIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleIDNumber() {
        return vehicleIDNumber;
    }

    /**
     * Sets the value of the vehicleIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleIDNumber(String value) {
        this.vehicleIDNumber = value;
    }

    /**
     * Gets the value of the vehicleColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleColor() {
        return vehicleColor;
    }

    /**
     * Sets the value of the vehicleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleColor(String value) {
        this.vehicleColor = value;
    }

}
