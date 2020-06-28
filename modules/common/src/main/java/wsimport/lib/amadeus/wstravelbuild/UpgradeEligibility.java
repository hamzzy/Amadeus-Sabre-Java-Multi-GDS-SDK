
package wsimport.lib.amadeus.wstravelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpgradeEligibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeEligibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustLoyalty" type="{http://traveltalk.com/wsTravelBuild}CustLoyaltyRS" minOccurs="0"/>
 *         &lt;element name="UpgradeOptions" type="{http://traveltalk.com/wsTravelBuild}UpgradeOptions" minOccurs="0"/>
 *         &lt;element name="UpsellOption" type="{http://traveltalk.com/wsTravelBuild}UpsellOption" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LoyalLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Eligible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeEligibility", propOrder = {
    "custLoyalty",
    "upgradeOptions",
    "upsellOption"
})
public class UpgradeEligibility {

    @XmlElement(name = "CustLoyalty")
    protected CustLoyaltyRS custLoyalty;
    @XmlElement(name = "UpgradeOptions")
    protected UpgradeOptions upgradeOptions;
    @XmlElement(name = "UpsellOption")
    protected UpsellOption upsellOption;
    @XmlAttribute(name = "LoyalLevel")
    protected String loyalLevel;
    @XmlAttribute(name = "Eligible", required = true)
    protected boolean eligible;

    /**
     * Gets the value of the custLoyalty property.
     * 
     * @return
     *     possible object is
     *     {@link CustLoyaltyRS }
     *     
     */
    public CustLoyaltyRS getCustLoyalty() {
        return custLoyalty;
    }

    /**
     * Sets the value of the custLoyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustLoyaltyRS }
     *     
     */
    public void setCustLoyalty(CustLoyaltyRS value) {
        this.custLoyalty = value;
    }

    /**
     * Gets the value of the upgradeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link UpgradeOptions }
     *     
     */
    public UpgradeOptions getUpgradeOptions() {
        return upgradeOptions;
    }

    /**
     * Sets the value of the upgradeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeOptions }
     *     
     */
    public void setUpgradeOptions(UpgradeOptions value) {
        this.upgradeOptions = value;
    }

    /**
     * Gets the value of the upsellOption property.
     * 
     * @return
     *     possible object is
     *     {@link UpsellOption }
     *     
     */
    public UpsellOption getUpsellOption() {
        return upsellOption;
    }

    /**
     * Sets the value of the upsellOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpsellOption }
     *     
     */
    public void setUpsellOption(UpsellOption value) {
        this.upsellOption = value;
    }

    /**
     * Gets the value of the loyalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyalLevel() {
        return loyalLevel;
    }

    /**
     * Sets the value of the loyalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyalLevel(String value) {
        this.loyalLevel = value;
    }

    /**
     * Gets the value of the eligible property.
     * 
     */
    public boolean isEligible() {
        return eligible;
    }

    /**
     * Sets the value of the eligible property.
     * 
     */
    public void setEligible(boolean value) {
        this.eligible = value;
    }

}
