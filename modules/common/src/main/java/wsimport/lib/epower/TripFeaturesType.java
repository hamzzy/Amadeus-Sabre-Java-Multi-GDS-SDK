
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripFeaturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripFeaturesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Destinations" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfTripFeaturesTypeDestination" minOccurs="0"/>
 *         &lt;element name="Activities" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfString4" minOccurs="0"/>
 *         &lt;element name="Operators" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfCompanyNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripFeaturesType", propOrder = {
    "destinations",
    "activities",
    "operators"
})
@XmlSeeAlso({
    InsCoverageDetailTypeCoveredTrip.class,
    OTAInsurancePlanSearchRQSearchTripInfoCoveredTrip.class
})
public class TripFeaturesType {

    @XmlElement(name = "Destinations")
    protected ArrayOfTripFeaturesTypeDestination destinations;
    @XmlElement(name = "Activities")
    protected ArrayOfString4 activities;
    @XmlElement(name = "Operators")
    protected ArrayOfCompanyNameType operators;

    /**
     * Gets the value of the destinations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTripFeaturesTypeDestination }
     *     
     */
    public ArrayOfTripFeaturesTypeDestination getDestinations() {
        return destinations;
    }

    /**
     * Sets the value of the destinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTripFeaturesTypeDestination }
     *     
     */
    public void setDestinations(ArrayOfTripFeaturesTypeDestination value) {
        this.destinations = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString4 }
     *     
     */
    public ArrayOfString4 getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString4 }
     *     
     */
    public void setActivities(ArrayOfString4 value) {
        this.activities = value;
    }

    /**
     * Gets the value of the operators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyNameType }
     *     
     */
    public ArrayOfCompanyNameType getOperators() {
        return operators;
    }

    /**
     * Sets the value of the operators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyNameType }
     *     
     */
    public void setOperators(ArrayOfCompanyNameType value) {
        this.operators = value;
    }

}
