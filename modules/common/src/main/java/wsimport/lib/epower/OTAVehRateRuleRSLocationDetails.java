
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_VehRateRuleRSLocationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehRateRuleRSLocationDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}VehicleLocationDetailsType">
 *       &lt;attribute name="DropOffIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehRateRuleRSLocationDetails")
public class OTAVehRateRuleRSLocationDetails
    extends VehicleLocationDetailsType
{

    @XmlAttribute(name = "DropOffIndicator")
    protected Boolean dropOffIndicator;

    /**
     * Gets the value of the dropOffIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropOffIndicator() {
        return dropOffIndicator;
    }

    /**
     * Sets the value of the dropOffIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropOffIndicator(Boolean value) {
        this.dropOffIndicator = value;
    }

}
