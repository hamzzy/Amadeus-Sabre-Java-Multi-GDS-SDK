
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleAvailCoreTypeVendorLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailCoreTypeVendorLocation">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>LocationType">
 *       &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CounterLocInfo" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailCoreTypeVendorLocationCounterLocInfo" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailCoreTypeVendorLocation")
public class VehicleAvailCoreTypeVendorLocation
    extends LocationType
{

    @XmlAttribute(name = "ExtendedLocationCode")
    protected String extendedLocationCode;
    @XmlAttribute(name = "CounterLocation")
    protected String counterLocation;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "CounterLocInfo")
    protected VehicleAvailCoreTypeVendorLocationCounterLocInfo counterLocInfo;

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

    /**
     * Gets the value of the counterLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterLocation() {
        return counterLocation;
    }

    /**
     * Sets the value of the counterLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterLocation(String value) {
        this.counterLocation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the counterLocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreTypeVendorLocationCounterLocInfo }
     *     
     */
    public VehicleAvailCoreTypeVendorLocationCounterLocInfo getCounterLocInfo() {
        return counterLocInfo;
    }

    /**
     * Sets the value of the counterLocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreTypeVendorLocationCounterLocInfo }
     *     
     */
    public void setCounterLocInfo(VehicleAvailCoreTypeVendorLocationCounterLocInfo value) {
        this.counterLocInfo = value;
    }

}
