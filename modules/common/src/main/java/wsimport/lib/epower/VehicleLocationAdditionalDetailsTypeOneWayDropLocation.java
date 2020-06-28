
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleLocationAdditionalDetailsTypeOneWayDropLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationAdditionalDetailsTypeOneWayDropLocation">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>LocationType">
 *       &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationAdditionalDetailsTypeOneWayDropLocation")
public class VehicleLocationAdditionalDetailsTypeOneWayDropLocation
    extends LocationType
{

    @XmlAttribute(name = "ExtendedLocationCode")
    protected String extendedLocationCode;

    /**
     * Gets the value of the extendedLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedLocationCode() {
        return extendedLocationCode;
    }

    /**
     * Sets the value of the extendedLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedLocationCode(String value) {
        this.extendedLocationCode = value;
    }

}
