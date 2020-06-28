
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVehicleChargeTypeTaxAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleChargeTypeTaxAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarTax" type="{http://epowerv5.amadeus.com.tr/WS}VehicleChargeTypeTaxAmount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVehicleChargeTypeTaxAmount", propOrder = {
    "carTax"
})
public class ArrayOfVehicleChargeTypeTaxAmount {

    @XmlElement(name = "CarTax")
    protected List<VehicleChargeTypeTaxAmount> carTax;

    /**
     * Gets the value of the carTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleChargeTypeTaxAmount }
     * 
     * 
     */
    public List<VehicleChargeTypeTaxAmount> getCarTax() {
        if (carTax == null) {
            carTax = new ArrayList<VehicleChargeTypeTaxAmount>();
        }
        return this.carTax;
    }

}
