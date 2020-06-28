
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}FlightSegmentType">
 *       &lt;sequence>
 *         &lt;element name="Warnings" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfWarningType1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo", propOrder = {
    "warnings"
})
public class OTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo
    extends FlightSegmentType
{

    @XmlElement(name = "Warnings")
    protected ArrayOfWarningType1 warnings;

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarningType1 }
     *     
     */
    public ArrayOfWarningType1 getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarningType1 }
     *     
     */
    public void setWarnings(ArrayOfWarningType1 value) {
        this.warnings = value;
    }

}
