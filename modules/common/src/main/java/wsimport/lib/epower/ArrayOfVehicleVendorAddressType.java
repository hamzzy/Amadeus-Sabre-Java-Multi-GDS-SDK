
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVehicleVendorAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleVendorAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarCompanyAddress" type="{http://epowerv5.amadeus.com.tr/WS}VehicleVendorAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVehicleVendorAddressType", propOrder = {
    "carCompanyAddress"
})
public class ArrayOfVehicleVendorAddressType {

    @XmlElement(name = "CarCompanyAddress")
    protected List<VehicleVendorAddressType> carCompanyAddress;

    /**
     * Gets the value of the carCompanyAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carCompanyAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarCompanyAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleVendorAddressType }
     * 
     * 
     */
    public List<VehicleVendorAddressType> getCarCompanyAddress() {
        if (carCompanyAddress == null) {
            carCompanyAddress = new ArrayList<VehicleVendorAddressType>();
        }
        return this.carCompanyAddress;
    }

}
