
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}FormattedTextType">
 *       &lt;attribute name="Type" use="required" type="{http://epowerv5.amadeus.com.tr/WS}LocationDetailShuttleInfoType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo")
public class VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo
    extends FormattedTextType
{

    @XmlAttribute(name = "Type", required = true)
    protected LocationDetailShuttleInfoType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailShuttleInfoType }
     *     
     */
    public LocationDetailShuttleInfoType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailShuttleInfoType }
     *     
     */
    public void setType(LocationDetailShuttleInfoType value) {
        this.type = value;
    }

}
