
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CoverageLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageLimitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Deductible" type="{http://epowerv5.amadeus.com.tr/WS}CoverageLimitTypeDeductible" minOccurs="0"/>
 *         &lt;element name="PolicyLimit" type="{http://epowerv5.amadeus.com.tr/WS}CoverageLimitTypePolicyLimit" minOccurs="0"/>
 *         &lt;element name="IndividualLimit" type="{http://epowerv5.amadeus.com.tr/WS}CoverageLimitTypeIndividualLimit" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CoverageLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CoverageType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UnlimitedCoverage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Covered" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageLimitType", propOrder = {
    "deductible",
    "policyLimit",
    "individualLimit"
})
@XmlSeeAlso({
    OTAInsurancePlanSearchRQCoveragePreference.class
})
public class CoverageLimitType {

    @XmlElement(name = "Deductible")
    protected CoverageLimitTypeDeductible deductible;
    @XmlElement(name = "PolicyLimit")
    protected CoverageLimitTypePolicyLimit policyLimit;
    @XmlElement(name = "IndividualLimit")
    protected CoverageLimitTypeIndividualLimit individualLimit;
    @XmlAttribute(name = "CoverageLevel")
    protected String coverageLevel;
    @XmlAttribute(name = "CoverageType")
    protected String coverageType;
    @XmlAttribute(name = "UnlimitedCoverage")
    protected Boolean unlimitedCoverage;
    @XmlAttribute(name = "Covered")
    protected Boolean covered;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * Gets the value of the deductible property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageLimitTypeDeductible }
     *     
     */
    public CoverageLimitTypeDeductible getDeductible() {
        return deductible;
    }

    /**
     * Sets the value of the deductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageLimitTypeDeductible }
     *     
     */
    public void setDeductible(CoverageLimitTypeDeductible value) {
        this.deductible = value;
    }

    /**
     * Gets the value of the policyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageLimitTypePolicyLimit }
     *     
     */
    public CoverageLimitTypePolicyLimit getPolicyLimit() {
        return policyLimit;
    }

    /**
     * Sets the value of the policyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageLimitTypePolicyLimit }
     *     
     */
    public void setPolicyLimit(CoverageLimitTypePolicyLimit value) {
        this.policyLimit = value;
    }

    /**
     * Gets the value of the individualLimit property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageLimitTypeIndividualLimit }
     *     
     */
    public CoverageLimitTypeIndividualLimit getIndividualLimit() {
        return individualLimit;
    }

    /**
     * Sets the value of the individualLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageLimitTypeIndividualLimit }
     *     
     */
    public void setIndividualLimit(CoverageLimitTypeIndividualLimit value) {
        this.individualLimit = value;
    }

    /**
     * Gets the value of the coverageLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageLevel() {
        return coverageLevel;
    }

    /**
     * Sets the value of the coverageLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageLevel(String value) {
        this.coverageLevel = value;
    }

    /**
     * Gets the value of the coverageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageType() {
        return coverageType;
    }

    /**
     * Sets the value of the coverageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageType(String value) {
        this.coverageType = value;
    }

    /**
     * Gets the value of the unlimitedCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimitedCoverage() {
        return unlimitedCoverage;
    }

    /**
     * Sets the value of the unlimitedCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimitedCoverage(Boolean value) {
        this.unlimitedCoverage = value;
    }

    /**
     * Gets the value of the covered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCovered() {
        return covered;
    }

    /**
     * Sets the value of the covered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCovered(Boolean value) {
        this.covered = value;
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

}
