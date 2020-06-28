
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFeeInfoRQCarInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeeInfoRQCarInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="VehicleID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="VendorID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeeInfoRQCarInfo")
public class ServiceFeeInfoRQCarInfo {

    @XmlAttribute(name = "VehicleID", required = true)
    protected int vehicleID;
    @XmlAttribute(name = "VendorID", required = true)
    protected int vendorID;

    /**
     * Gets the value of the vehicleID property.
     * 
     */
    public int getVehicleID() {
        return vehicleID;
    }

    /**
     * Sets the value of the vehicleID property.
     * 
     */
    public void setVehicleID(int value) {
        this.vehicleID = value;
    }

    /**
     * Gets the value of the vendorID property.
     * 
     */
    public int getVendorID() {
        return vendorID;
    }

    /**
     * Sets the value of the vendorID property.
     * 
     */
    public void setVendorID(int value) {
        this.vendorID = value;
    }

}
