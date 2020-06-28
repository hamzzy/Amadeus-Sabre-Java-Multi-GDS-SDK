
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_InsurancePlanSearchRQSearchTravInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsurancePlanSearchRQSearchTravInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchTravelers" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSearchTravelerType" minOccurs="0"/>
 *         &lt;element name="CitizenCountryName" type="{http://epowerv5.amadeus.com.tr/WS}CountryNameType" minOccurs="0"/>
 *         &lt;element name="ResidenceCountryName" type="{http://epowerv5.amadeus.com.tr/WS}CountryNameType" minOccurs="0"/>
 *         &lt;element name="Affiliations" type="{http://epowerv5.amadeus.com.tr/WS}BoundedAffiliationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MinTravelers" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MaxTravelers" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_InsurancePlanSearchRQSearchTravInfo", propOrder = {
    "searchTravelers",
    "citizenCountryName",
    "residenceCountryName",
    "affiliations"
})
public class OTAInsurancePlanSearchRQSearchTravInfo {

    @XmlElement(name = "SearchTravelers")
    protected ArrayOfSearchTravelerType searchTravelers;
    @XmlElement(name = "CitizenCountryName")
    protected CountryNameType citizenCountryName;
    @XmlElement(name = "ResidenceCountryName")
    protected CountryNameType residenceCountryName;
    @XmlElement(name = "Affiliations")
    protected BoundedAffiliationsType affiliations;
    @XmlAttribute(name = "MinTravelers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minTravelers;
    @XmlAttribute(name = "MaxTravelers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxTravelers;

    /**
     * Gets the value of the searchTravelers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchTravelerType }
     *     
     */
    public ArrayOfSearchTravelerType getSearchTravelers() {
        return searchTravelers;
    }

    /**
     * Sets the value of the searchTravelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchTravelerType }
     *     
     */
    public void setSearchTravelers(ArrayOfSearchTravelerType value) {
        this.searchTravelers = value;
    }

    /**
     * Gets the value of the citizenCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link CountryNameType }
     *     
     */
    public CountryNameType getCitizenCountryName() {
        return citizenCountryName;
    }

    /**
     * Sets the value of the citizenCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryNameType }
     *     
     */
    public void setCitizenCountryName(CountryNameType value) {
        this.citizenCountryName = value;
    }

    /**
     * Gets the value of the residenceCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link CountryNameType }
     *     
     */
    public CountryNameType getResidenceCountryName() {
        return residenceCountryName;
    }

    /**
     * Sets the value of the residenceCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryNameType }
     *     
     */
    public void setResidenceCountryName(CountryNameType value) {
        this.residenceCountryName = value;
    }

    /**
     * Gets the value of the affiliations property.
     * 
     * @return
     *     possible object is
     *     {@link BoundedAffiliationsType }
     *     
     */
    public BoundedAffiliationsType getAffiliations() {
        return affiliations;
    }

    /**
     * Sets the value of the affiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundedAffiliationsType }
     *     
     */
    public void setAffiliations(BoundedAffiliationsType value) {
        this.affiliations = value;
    }

    /**
     * Gets the value of the minTravelers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinTravelers() {
        return minTravelers;
    }

    /**
     * Sets the value of the minTravelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinTravelers(BigInteger value) {
        this.minTravelers = value;
    }

    /**
     * Gets the value of the maxTravelers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxTravelers() {
        return maxTravelers;
    }

    /**
     * Sets the value of the maxTravelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxTravelers(BigInteger value) {
        this.maxTravelers = value;
    }

}
