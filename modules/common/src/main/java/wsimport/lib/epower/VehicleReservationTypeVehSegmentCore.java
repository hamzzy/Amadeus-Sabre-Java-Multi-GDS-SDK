
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleReservationTypeVehSegmentCore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationTypeVehSegmentCore">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}VehicleSegmentCoreType">
 *       &lt;attribute name="OptionChangeAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationTypeVehSegmentCore")
public class VehicleReservationTypeVehSegmentCore
    extends VehicleSegmentCoreType
{

    @XmlAttribute(name = "OptionChangeAllowedIndicator")
    protected Boolean optionChangeAllowedIndicator;

    /**
     * Gets the value of the optionChangeAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionChangeAllowedIndicator() {
        return optionChangeAllowedIndicator;
    }

    /**
     * Sets the value of the optionChangeAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionChangeAllowedIndicator(Boolean value) {
        this.optionChangeAllowedIndicator = value;
    }

}
