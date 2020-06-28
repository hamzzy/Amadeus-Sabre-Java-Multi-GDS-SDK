
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleLocationAdditionalDetailsTypeShuttle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationAdditionalDetailsTypeShuttle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShuttleInfos" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo" minOccurs="0"/>
 *         &lt;element name="OperationSchedules" type="{http://epowerv5.amadeus.com.tr/WS}OperationSchedulesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationAdditionalDetailsTypeShuttle", propOrder = {
    "shuttleInfos",
    "operationSchedules"
})
public class VehicleLocationAdditionalDetailsTypeShuttle {

    @XmlElement(name = "ShuttleInfos")
    protected ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo shuttleInfos;
    @XmlElement(name = "OperationSchedules")
    protected OperationSchedulesType operationSchedules;

    /**
     * Gets the value of the shuttleInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
     *     
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo getShuttleInfos() {
        return shuttleInfos;
    }

    /**
     * Sets the value of the shuttleInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
     *     
     */
    public void setShuttleInfos(ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo value) {
        this.shuttleInfos = value;
    }

    /**
     * Gets the value of the operationSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link OperationSchedulesType }
     *     
     */
    public OperationSchedulesType getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * Sets the value of the operationSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSchedulesType }
     *     
     */
    public void setOperationSchedules(OperationSchedulesType value) {
        this.operationSchedules = value;
    }

}
