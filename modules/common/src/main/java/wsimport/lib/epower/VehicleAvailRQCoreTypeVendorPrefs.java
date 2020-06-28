
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleAvailRQCoreTypeVendorPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailRQCoreTypeVendorPrefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorPref" type="{http://epowerv5.amadeus.com.tr/WS}VehicleAvailRQCoreTypeVendorPrefsVendorPref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ParticipationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LocationCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailRQCoreTypeVendorPrefs", propOrder = {
    "vendorPref"
})
public class VehicleAvailRQCoreTypeVendorPrefs {

    @XmlElement(name = "VendorPref")
    protected List<VehicleAvailRQCoreTypeVendorPrefsVendorPref> vendorPref;
    @XmlAttribute(name = "ParticipationLevelCode")
    protected String participationLevelCode;
    @XmlAttribute(name = "LocationCategory")
    protected String locationCategory;

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleAvailRQCoreTypeVendorPrefsVendorPref }
     * 
     * 
     */
    public List<VehicleAvailRQCoreTypeVendorPrefsVendorPref> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<VehicleAvailRQCoreTypeVendorPrefsVendorPref>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the participationLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipationLevelCode() {
        return participationLevelCode;
    }

    /**
     * Sets the value of the participationLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipationLevelCode(String value) {
        this.participationLevelCode = value;
    }

    /**
     * Gets the value of the locationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCategory() {
        return locationCategory;
    }

    /**
     * Sets the value of the locationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCategory(String value) {
        this.locationCategory = value;
    }

}
