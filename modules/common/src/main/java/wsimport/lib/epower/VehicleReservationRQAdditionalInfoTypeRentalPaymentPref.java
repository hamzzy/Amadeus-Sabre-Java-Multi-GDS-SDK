
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleReservationRQAdditionalInfoTypeRentalPaymentPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationRQAdditionalInfoTypeRentalPaymentPref">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}PaymentDetailType">
 *       &lt;attribute name="Type" type="{http://epowerv5.amadeus.com.tr/WS}VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationRQAdditionalInfoTypeRentalPaymentPref")
public class VehicleReservationRQAdditionalInfoTypeRentalPaymentPref
    extends PaymentDetailType
{

    @XmlAttribute(name = "Type")
    protected VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType }
     *     
     */
    public VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType }
     *     
     */
    public void setType(VehicleReservationRQAdditionalInfoTypeRentalPaymentPrefType value) {
        this.type = value;
    }

}
