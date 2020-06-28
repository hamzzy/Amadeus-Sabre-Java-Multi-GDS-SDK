
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_InsurancePlanSearchRQSearchTripInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsurancePlanSearchRQSearchTripInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalTripCost" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRQSearchTripInfoTotalTripCost" minOccurs="0"/>
 *         &lt;element name="MaximumTripLength" type="{http://epowerv5.amadeus.com.tr/WS}TimeDurationType" minOccurs="0"/>
 *         &lt;element name="CoveredTrips" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOTA_InsurancePlanSearchRQSearchTripInfoCoveredTrip" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_InsurancePlanSearchRQSearchTripInfo", propOrder = {
    "travelSector",
    "totalTripCost",
    "maximumTripLength",
    "coveredTrips"
})
public class OTAInsurancePlanSearchRQSearchTripInfo {

    @XmlElement(name = "TravelSector")
    protected List<String> travelSector;
    @XmlElement(name = "TotalTripCost")
    protected OTAInsurancePlanSearchRQSearchTripInfoTotalTripCost totalTripCost;
    @XmlElement(name = "MaximumTripLength")
    protected TimeDurationType maximumTripLength;
    @XmlElement(name = "CoveredTrips")
    protected ArrayOfOTAInsurancePlanSearchRQSearchTripInfoCoveredTrip coveredTrips;

    /**
     * Gets the value of the travelSector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelSector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelSector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTravelSector() {
        if (travelSector == null) {
            travelSector = new ArrayList<String>();
        }
        return this.travelSector;
    }

    /**
     * Gets the value of the totalTripCost property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsurancePlanSearchRQSearchTripInfoTotalTripCost }
     *     
     */
    public OTAInsurancePlanSearchRQSearchTripInfoTotalTripCost getTotalTripCost() {
        return totalTripCost;
    }

    /**
     * Sets the value of the totalTripCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRQSearchTripInfoTotalTripCost }
     *     
     */
    public void setTotalTripCost(OTAInsurancePlanSearchRQSearchTripInfoTotalTripCost value) {
        this.totalTripCost = value;
    }

    /**
     * Gets the value of the maximumTripLength property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDurationType }
     *     
     */
    public TimeDurationType getMaximumTripLength() {
        return maximumTripLength;
    }

    /**
     * Sets the value of the maximumTripLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDurationType }
     *     
     */
    public void setMaximumTripLength(TimeDurationType value) {
        this.maximumTripLength = value;
    }

    /**
     * Gets the value of the coveredTrips property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOTAInsurancePlanSearchRQSearchTripInfoCoveredTrip }
     *     
     */
    public ArrayOfOTAInsurancePlanSearchRQSearchTripInfoCoveredTrip getCoveredTrips() {
        return coveredTrips;
    }

    /**
     * Sets the value of the coveredTrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOTAInsurancePlanSearchRQSearchTripInfoCoveredTrip }
     *     
     */
    public void setCoveredTrips(ArrayOfOTAInsurancePlanSearchRQSearchTripInfoCoveredTrip value) {
        this.coveredTrips = value;
    }

}
