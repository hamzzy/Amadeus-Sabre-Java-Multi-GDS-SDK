
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleReservationRQCoreTypeSpecialEquipPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationRQCoreTypeSpecialEquipPrefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialEquipPref" type="{http://epowerv5.amadeus.com.tr/WS}VehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://epowerv5.amadeus.com.tr/WS}VehicleChargeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationRQCoreTypeSpecialEquipPrefs", propOrder = {
    "specialEquipPref",
    "charge"
})
public class VehicleReservationRQCoreTypeSpecialEquipPrefs {

    @XmlElement(name = "SpecialEquipPref")
    protected List<VehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref> specialEquipPref;
    @XmlElement(name = "Charge")
    protected VehicleChargeType charge;

    /**
     * Gets the value of the specialEquipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref }
     * 
     * 
     */
    public List<VehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref> getSpecialEquipPref() {
        if (specialEquipPref == null) {
            specialEquipPref = new ArrayList<VehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref>();
        }
        return this.specialEquipPref;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargeType }
     *     
     */
    public VehicleChargeType getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargeType }
     *     
     */
    public void setCharge(VehicleChargeType value) {
        this.charge = value;
    }

}
