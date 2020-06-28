
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnderwriterCompany" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="UnderwriterDescription" type="{http://epowerv5.amadeus.com.tr/WS}FormattedTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail", propOrder = {
    "underwriterCompany",
    "underwriterDescription"
})
public class OTAInsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail {

    @XmlElement(name = "UnderwriterCompany")
    protected CompanyNameType underwriterCompany;
    @XmlElement(name = "UnderwriterDescription")
    protected FormattedTextType underwriterDescription;

    /**
     * Gets the value of the underwriterCompany property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getUnderwriterCompany() {
        return underwriterCompany;
    }

    /**
     * Sets the value of the underwriterCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setUnderwriterCompany(CompanyNameType value) {
        this.underwriterCompany = value;
    }

    /**
     * Gets the value of the underwriterDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextType }
     *     
     */
    public FormattedTextType getUnderwriterDescription() {
        return underwriterDescription;
    }

    /**
     * Sets the value of the underwriterDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextType }
     *     
     */
    public void setUnderwriterDescription(FormattedTextType value) {
        this.underwriterDescription = value;
    }

}
