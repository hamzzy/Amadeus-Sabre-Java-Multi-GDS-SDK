
package wsimport.lib.axamansard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinationExclusionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestinationExclusionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GeoScopeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StudentExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LiveGeoScopeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Country" type="{http://tempuri.org/}Country" minOccurs="0"/>
 *         &lt;element name="MTGeographicalCovarageScope" type="{http://tempuri.org/}MTGeographicalCovarageScope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationExclusionList", propOrder = {
    "id",
    "geoScopeID",
    "countryID",
    "studentExclusion",
    "liveGeoScopeID",
    "country",
    "mtGeographicalCovarageScope"
})
public class DestinationExclusionList {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "GeoScopeID", required = true, type = Integer.class, nillable = true)
    protected Integer geoScopeID;
    @XmlElement(name = "CountryID", required = true, type = Integer.class, nillable = true)
    protected Integer countryID;
    @XmlElement(name = "StudentExclusion", required = true, type = Boolean.class, nillable = true)
    protected Boolean studentExclusion;
    @XmlElement(name = "LiveGeoScopeID", required = true, type = Integer.class, nillable = true)
    protected Integer liveGeoScopeID;
    @XmlElement(name = "Country")
    protected Country country;
    @XmlElement(name = "MTGeographicalCovarageScope")
    protected MTGeographicalCovarageScope mtGeographicalCovarageScope;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the geoScopeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGeoScopeID() {
        return geoScopeID;
    }

    /**
     * Sets the value of the geoScopeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGeoScopeID(Integer value) {
        this.geoScopeID = value;
    }

    /**
     * Gets the value of the countryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryID(Integer value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the studentExclusion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStudentExclusion() {
        return studentExclusion;
    }

    /**
     * Sets the value of the studentExclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStudentExclusion(Boolean value) {
        this.studentExclusion = value;
    }

    /**
     * Gets the value of the liveGeoScopeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiveGeoScopeID() {
        return liveGeoScopeID;
    }

    /**
     * Sets the value of the liveGeoScopeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiveGeoScopeID(Integer value) {
        this.liveGeoScopeID = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the mtGeographicalCovarageScope property.
     * 
     * @return
     *     possible object is
     *     {@link MTGeographicalCovarageScope }
     *     
     */
    public MTGeographicalCovarageScope getMTGeographicalCovarageScope() {
        return mtGeographicalCovarageScope;
    }

    /**
     * Sets the value of the mtGeographicalCovarageScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link MTGeographicalCovarageScope }
     *     
     */
    public void setMTGeographicalCovarageScope(MTGeographicalCovarageScope value) {
        this.mtGeographicalCovarageScope = value;
    }

}
