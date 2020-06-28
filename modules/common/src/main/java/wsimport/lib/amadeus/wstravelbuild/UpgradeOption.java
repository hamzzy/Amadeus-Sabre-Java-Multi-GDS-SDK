
package wsimport.lib.amadeus.wstravelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpgradeOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpgradeFee" type="{http://traveltalk.com/wsTravelBuild}UpgradeFee" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UpgradeCabin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RequiredCredits" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="UpgradeClassAvailability" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="UpgradeWindow" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeOption", propOrder = {
    "upgradeFee"
})
public class UpgradeOption {

    @XmlElement(name = "UpgradeFee")
    protected UpgradeFee upgradeFee;
    @XmlAttribute(name = "UpgradeCabin")
    protected String upgradeCabin;
    @XmlAttribute(name = "RequiredCredits", required = true)
    protected int requiredCredits;
    @XmlAttribute(name = "UpgradeClassAvailability")
    protected Integer upgradeClassAvailability;
    @XmlAttribute(name = "UpgradeWindow")
    protected String upgradeWindow;

    /**
     * Gets the value of the upgradeFee property.
     * 
     * @return
     *     possible object is
     *     {@link UpgradeFee }
     *     
     */
    public UpgradeFee getUpgradeFee() {
        return upgradeFee;
    }

    /**
     * Sets the value of the upgradeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeFee }
     *     
     */
    public void setUpgradeFee(UpgradeFee value) {
        this.upgradeFee = value;
    }

    /**
     * Gets the value of the upgradeCabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeCabin() {
        return upgradeCabin;
    }

    /**
     * Sets the value of the upgradeCabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeCabin(String value) {
        this.upgradeCabin = value;
    }

    /**
     * Gets the value of the requiredCredits property.
     * 
     */
    public int getRequiredCredits() {
        return requiredCredits;
    }

    /**
     * Sets the value of the requiredCredits property.
     * 
     */
    public void setRequiredCredits(int value) {
        this.requiredCredits = value;
    }

    /**
     * Gets the value of the upgradeClassAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpgradeClassAvailability() {
        return upgradeClassAvailability;
    }

    /**
     * Sets the value of the upgradeClassAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpgradeClassAvailability(Integer value) {
        this.upgradeClassAvailability = value;
    }

    /**
     * Gets the value of the upgradeWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeWindow() {
        return upgradeWindow;
    }

    /**
     * Sets the value of the upgradeWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeWindow(String value) {
        this.upgradeWindow = value;
    }

}
