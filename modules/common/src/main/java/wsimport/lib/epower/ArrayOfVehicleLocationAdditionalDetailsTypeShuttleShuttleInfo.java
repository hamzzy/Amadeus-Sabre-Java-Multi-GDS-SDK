
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShuttleInfo" type="{http://epowerv5.amadeus.com.tr/WS}VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo", propOrder = {
    "shuttleInfo"
})
public class ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo {

    @XmlElement(name = "ShuttleInfo")
    protected List<VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo> shuttleInfo;

    /**
     * Gets the value of the shuttleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shuttleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShuttleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
     * 
     * 
     */
    public List<VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo> getShuttleInfo() {
        if (shuttleInfo == null) {
            shuttleInfo = new ArrayList<VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo>();
        }
        return this.shuttleInfo;
    }

}
