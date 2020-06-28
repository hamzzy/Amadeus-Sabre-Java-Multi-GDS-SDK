
package wsimport.lib.amadeus.wstravelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpsellOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpsellOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequiredCredits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BaseFare" type="{http://traveltalk.com/wsTravelBuild}BaseFareRS" minOccurs="0"/>
 *         &lt;element name="TotalFare" type="{http://traveltalk.com/wsTravelBuild}TotalFareRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResBookDesigQuantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpsellOption", propOrder = {
    "requiredCredits",
    "baseFare",
    "totalFare"
})
public class UpsellOption {

    @XmlElement(name = "RequiredCredits")
    protected int requiredCredits;
    @XmlElement(name = "BaseFare")
    protected BaseFareRS baseFare;
    @XmlElement(name = "TotalFare")
    protected TotalFareRS totalFare;
    @XmlAttribute(name = "ResBookDesigCode")
    protected String resBookDesigCode;
    @XmlAttribute(name = "ResBookDesigQuantity", required = true)
    protected int resBookDesigQuantity;

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
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BaseFareRS }
     *     
     */
    public BaseFareRS getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseFareRS }
     *     
     */
    public void setBaseFare(BaseFareRS value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFareRS }
     *     
     */
    public TotalFareRS getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFareRS }
     *     
     */
    public void setTotalFare(TotalFareRS value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the resBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * Sets the value of the resBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
    }

    /**
     * Gets the value of the resBookDesigQuantity property.
     * 
     */
    public int getResBookDesigQuantity() {
        return resBookDesigQuantity;
    }

    /**
     * Sets the value of the resBookDesigQuantity property.
     * 
     */
    public void setResBookDesigQuantity(int value) {
        this.resBookDesigQuantity = value;
    }

}
