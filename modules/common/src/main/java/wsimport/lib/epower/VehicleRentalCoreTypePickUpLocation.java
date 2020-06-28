
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRentalCoreTypePickUpLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalCoreTypePickUpLocation">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>LocationType">
 *       &lt;attribute name="LocationAgency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VicinityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsCity" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsAirport" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalCoreTypePickUpLocation")
public class VehicleRentalCoreTypePickUpLocation
    extends LocationType
{

    @XmlAttribute(name = "LocationAgency")
    protected String locationAgency;
    @XmlAttribute(name = "VicinityCode")
    protected String vicinityCode;
    @XmlAttribute(name = "IsCity", required = true)
    protected boolean isCity;
    @XmlAttribute(name = "IsAirport", required = true)
    protected boolean isAirport;
    @XmlAttribute(name = "ExtendedLocationCode")
    protected String extendedLocationCode;
    @XmlAttribute(name = "CounterLocation")
    protected String counterLocation;

    /**
     * Gets the value of the locationAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAgency() {
        return locationAgency;
    }

    /**
     * Sets the value of the locationAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAgency(String value) {
        this.locationAgency = value;
    }

    /**
     * Gets the value of the vicinityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVicinityCode() {
        return vicinityCode;
    }

    /**
     * Sets the value of the vicinityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVicinityCode(String value) {
        this.vicinityCode = value;
    }

    /**
     * Gets the value of the isCity property.
     * 
     */
    public boolean isIsCity() {
        return isCity;
    }

    /**
     * Sets the value of the isCity property.
     * 
     */
    public void setIsCity(boolean value) {
        this.isCity = value;
    }

    /**
     * Gets the value of the isAirport property.
     * 
     */
    public boolean isIsAirport() {
        return isAirport;
    }

    /**
     * Sets the value of the isAirport property.
     * 
     */
    public void setIsAirport(boolean value) {
        this.isAirport = value;
    }

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

}
