
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleVendorAvailabilityTypeVehAvails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleVendorAvailabilityTypeVehAvails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehAvail" type="{http://epowerv5.amadeus.com.tr/WS}VehicleVendorAvailabilityTypeVehAvailsVehAvail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePeriod" type="{http://epowerv5.amadeus.com.tr/WS}RateQualifierTypeRatePeriod" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleVendorAvailabilityTypeVehAvails", propOrder = {
    "vehAvail"
})
public class VehicleVendorAvailabilityTypeVehAvails {

    @XmlElement(name = "VehAvail")
    protected List<VehicleVendorAvailabilityTypeVehAvailsVehAvail> vehAvail;
    @XmlAttribute(name = "RateCategory")
    protected String rateCategory;
    @XmlAttribute(name = "RatePeriod")
    protected RateQualifierTypeRatePeriod ratePeriod;

    /**
     * Gets the value of the vehAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleVendorAvailabilityTypeVehAvailsVehAvail }
     * 
     * 
     */
    public List<VehicleVendorAvailabilityTypeVehAvailsVehAvail> getVehAvail() {
        if (vehAvail == null) {
            vehAvail = new ArrayList<VehicleVendorAvailabilityTypeVehAvailsVehAvail>();
        }
        return this.vehAvail;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCategory(String value) {
        this.rateCategory = value;
    }

    /**
     * Gets the value of the ratePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RateQualifierTypeRatePeriod }
     *     
     */
    public RateQualifierTypeRatePeriod getRatePeriod() {
        return ratePeriod;
    }

    /**
     * Sets the value of the ratePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateQualifierTypeRatePeriod }
     *     
     */
    public void setRatePeriod(RateQualifierTypeRatePeriod value) {
        this.ratePeriod = value;
    }

}
