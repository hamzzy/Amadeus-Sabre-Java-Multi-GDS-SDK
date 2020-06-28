
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InsCoverageDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsCoverageDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoverageRequirements" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfCoverageLimitType" minOccurs="0"/>
 *         &lt;element name="TotalTripQuantity" type="{http://epowerv5.amadeus.com.tr/WS}InsCoverageDetailTypeTotalTripQuantity" minOccurs="0"/>
 *         &lt;element name="MaximumTripLength" type="{http://epowerv5.amadeus.com.tr/WS}TimeDurationType" minOccurs="0"/>
 *         &lt;element name="TotalTripCost" type="{http://epowerv5.amadeus.com.tr/WS}InsCoverageDetailTypeTotalTripCost" minOccurs="0"/>
 *         &lt;element name="CoveredTrips" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfInsCoverageDetailTypeCoveredTrip" minOccurs="0"/>
 *         &lt;element name="DeliveryPref" type="{http://epowerv5.amadeus.com.tr/WS}DistribPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Type" use="required" type="{http://epowerv5.amadeus.com.tr/WS}InsCoverageDetailTypeType" />
 *       &lt;attribute name="AutoRenew" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsCoverageDetailType", propOrder = {
    "coverageRequirements",
    "totalTripQuantity",
    "maximumTripLength",
    "totalTripCost",
    "coveredTrips",
    "deliveryPref"
})
public class InsCoverageDetailType {

    @XmlElement(name = "CoverageRequirements")
    protected ArrayOfCoverageLimitType coverageRequirements;
    @XmlElement(name = "TotalTripQuantity")
    protected InsCoverageDetailTypeTotalTripQuantity totalTripQuantity;
    @XmlElement(name = "MaximumTripLength")
    protected TimeDurationType maximumTripLength;
    @XmlElement(name = "TotalTripCost")
    protected InsCoverageDetailTypeTotalTripCost totalTripCost;
    @XmlElement(name = "CoveredTrips")
    protected ArrayOfInsCoverageDetailTypeCoveredTrip coveredTrips;
    @XmlElement(name = "DeliveryPref")
    protected List<DistribPrefType> deliveryPref;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "Type", required = true)
    protected InsCoverageDetailTypeType type;
    @XmlAttribute(name = "AutoRenew")
    protected Boolean autoRenew;

    /**
     * Gets the value of the coverageRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoverageLimitType }
     *     
     */
    public ArrayOfCoverageLimitType getCoverageRequirements() {
        return coverageRequirements;
    }

    /**
     * Sets the value of the coverageRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoverageLimitType }
     *     
     */
    public void setCoverageRequirements(ArrayOfCoverageLimitType value) {
        this.coverageRequirements = value;
    }

    /**
     * Gets the value of the totalTripQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailTypeTotalTripQuantity }
     *     
     */
    public InsCoverageDetailTypeTotalTripQuantity getTotalTripQuantity() {
        return totalTripQuantity;
    }

    /**
     * Sets the value of the totalTripQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailTypeTotalTripQuantity }
     *     
     */
    public void setTotalTripQuantity(InsCoverageDetailTypeTotalTripQuantity value) {
        this.totalTripQuantity = value;
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
     * Gets the value of the totalTripCost property.
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailTypeTotalTripCost }
     *     
     */
    public InsCoverageDetailTypeTotalTripCost getTotalTripCost() {
        return totalTripCost;
    }

    /**
     * Sets the value of the totalTripCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailTypeTotalTripCost }
     *     
     */
    public void setTotalTripCost(InsCoverageDetailTypeTotalTripCost value) {
        this.totalTripCost = value;
    }

    /**
     * Gets the value of the coveredTrips property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsCoverageDetailTypeCoveredTrip }
     *     
     */
    public ArrayOfInsCoverageDetailTypeCoveredTrip getCoveredTrips() {
        return coveredTrips;
    }

    /**
     * Sets the value of the coveredTrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsCoverageDetailTypeCoveredTrip }
     *     
     */
    public void setCoveredTrips(ArrayOfInsCoverageDetailTypeCoveredTrip value) {
        this.coveredTrips = value;
    }

    /**
     * Gets the value of the deliveryPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistribPrefType }
     * 
     * 
     */
    public List<DistribPrefType> getDeliveryPref() {
        if (deliveryPref == null) {
            deliveryPref = new ArrayList<DistribPrefType>();
        }
        return this.deliveryPref;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailTypeType }
     *     
     */
    public InsCoverageDetailTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailTypeType }
     *     
     */
    public void setType(InsCoverageDetailTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the autoRenew property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRenew() {
        return autoRenew;
    }

    /**
     * Sets the value of the autoRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRenew(Boolean value) {
        this.autoRenew = value;
    }

}
