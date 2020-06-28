
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APISRuleDoco complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APISRuleDoco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfIssuance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceOfIssuance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryRequiringVisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APISRuleDoco", propOrder = {
    "visaNumber",
    "placeOfBirth",
    "dateOfIssuance",
    "placeOfIssuance",
    "countryRequiringVisa"
})
public class APISRuleDoco {

    @XmlElement(name = "VisaNumber")
    protected String visaNumber;
    @XmlElement(name = "PlaceOfBirth")
    protected String placeOfBirth;
    @XmlElement(name = "DateOfIssuance")
    protected String dateOfIssuance;
    @XmlElement(name = "PlaceOfIssuance")
    protected String placeOfIssuance;
    @XmlElement(name = "CountryRequiringVisa")
    protected String countryRequiringVisa;

    /**
     * Gets the value of the visaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumber() {
        return visaNumber;
    }

    /**
     * Sets the value of the visaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumber(String value) {
        this.visaNumber = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the dateOfIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfIssuance() {
        return dateOfIssuance;
    }

    /**
     * Sets the value of the dateOfIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfIssuance(String value) {
        this.dateOfIssuance = value;
    }

    /**
     * Gets the value of the placeOfIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfIssuance() {
        return placeOfIssuance;
    }

    /**
     * Sets the value of the placeOfIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfIssuance(String value) {
        this.placeOfIssuance = value;
    }

    /**
     * Gets the value of the countryRequiringVisa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryRequiringVisa() {
        return countryRequiringVisa;
    }

    /**
     * Sets the value of the countryRequiringVisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryRequiringVisa(String value) {
        this.countryRequiringVisa = value;
    }

}
