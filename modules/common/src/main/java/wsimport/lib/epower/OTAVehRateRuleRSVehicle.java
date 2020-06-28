
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_VehRateRuleRSVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_VehRateRuleRSVehicle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}VehicleType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://epowerv5.amadeus.com.tr/WS}FormattedTextTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LowMileage" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="HighMileage" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehRateRuleRSVehicle", propOrder = {
    "description"
})
public class OTAVehRateRuleRSVehicle
    extends VehicleType
{

    @XmlElement(name = "Description")
    protected FormattedTextTextType description;
    @XmlAttribute(name = "LowMileage")
    protected BigInteger lowMileage;
    @XmlAttribute(name = "HighMileage")
    protected BigInteger highMileage;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextTextType }
     *     
     */
    public FormattedTextTextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextTextType }
     *     
     */
    public void setDescription(FormattedTextTextType value) {
        this.description = value;
    }

    /**
     * Gets the value of the lowMileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowMileage() {
        return lowMileage;
    }

    /**
     * Sets the value of the lowMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowMileage(BigInteger value) {
        this.lowMileage = value;
    }

    /**
     * Gets the value of the highMileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHighMileage() {
        return highMileage;
    }

    /**
     * Sets the value of the highMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHighMileage(BigInteger value) {
        this.highMileage = value;
    }

}
