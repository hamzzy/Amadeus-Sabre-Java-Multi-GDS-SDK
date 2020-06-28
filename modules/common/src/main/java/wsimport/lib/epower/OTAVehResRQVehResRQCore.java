
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_VehResRQVehResRQCore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehResRQVehResRQCore">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}VehicleReservationRQCoreType">
 *       &lt;attribute name="OptionChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehResRQVehResRQCore")
public class OTAVehResRQVehResRQCore
    extends VehicleReservationRQCoreType
{

    @XmlAttribute(name = "OptionChangeIndicator")
    protected Boolean optionChangeIndicator;

    /**
     * Gets the value of the optionChangeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionChangeIndicator() {
        return optionChangeIndicator;
    }

    /**
     * Sets the value of the optionChangeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionChangeIndicator(Boolean value) {
        this.optionChangeIndicator = value;
    }

}
