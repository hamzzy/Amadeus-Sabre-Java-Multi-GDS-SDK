
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderCompany" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="ProviderDescription" type="{http://epowerv5.amadeus.com.tr/WS}FormattedTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail", propOrder = {
    "providerCompany",
    "providerDescription"
})
public class OTAInsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail {

    @XmlElement(name = "ProviderCompany")
    protected CompanyNameType providerCompany;
    @XmlElement(name = "ProviderDescription")
    protected FormattedTextType providerDescription;

    /**
     * Gets the value of the providerCompany property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getProviderCompany() {
        return providerCompany;
    }

    /**
     * Sets the value of the providerCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setProviderCompany(CompanyNameType value) {
        this.providerCompany = value;
    }

    /**
     * Gets the value of the providerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextType }
     *     
     */
    public FormattedTextType getProviderDescription() {
        return providerDescription;
    }

    /**
     * Sets the value of the providerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextType }
     *     
     */
    public void setProviderDescription(FormattedTextType value) {
        this.providerDescription = value;
    }

}
