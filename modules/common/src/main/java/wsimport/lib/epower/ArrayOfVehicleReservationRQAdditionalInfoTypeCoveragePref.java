
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoveragePref" type="{http://epowerv5.amadeus.com.tr/WS}VehicleReservationRQAdditionalInfoTypeCoveragePref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref", propOrder = {
    "coveragePref"
})
public class ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref {

    @XmlElement(name = "CoveragePref")
    protected List<VehicleReservationRQAdditionalInfoTypeCoveragePref> coveragePref;

    /**
     * Gets the value of the coveragePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveragePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveragePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleReservationRQAdditionalInfoTypeCoveragePref }
     * 
     * 
     */
    public List<VehicleReservationRQAdditionalInfoTypeCoveragePref> getCoveragePref() {
        if (coveragePref == null) {
            coveragePref = new ArrayList<VehicleReservationRQAdditionalInfoTypeCoveragePref>();
        }
        return this.coveragePref;
    }

}
