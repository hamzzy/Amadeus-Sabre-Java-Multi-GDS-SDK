
package wsimport.lib.amadeus.wsairseatmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Discount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Taxes" type="{http://traveltalk.com/wsAirSeatMap}Taxes" minOccurs="0"/>
 *         &lt;element name="Go_Discount_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Go_Discount_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Is_Substract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discount", propOrder = {
    "taxes",
    "goDiscountID",
    "goDiscountName"
})
public class Discount {

    @XmlElement(name = "Taxes")
    protected Taxes taxes;
    @XmlElement(name = "Go_Discount_ID")
    protected String goDiscountID;
    @XmlElement(name = "Go_Discount_Name")
    protected String goDiscountName;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Amount", required = true)
    protected double amount;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Is_Substract", required = true)
    protected boolean isSubstract;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link Taxes }
     *     
     */
    public Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxes }
     *     
     */
    public void setTaxes(Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the goDiscountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoDiscountID() {
        return goDiscountID;
    }

    /**
     * Sets the value of the goDiscountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoDiscountID(String value) {
        this.goDiscountID = value;
    }

    /**
     * Gets the value of the goDiscountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoDiscountName() {
        return goDiscountName;
    }

    /**
     * Sets the value of the goDiscountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoDiscountName(String value) {
        this.goDiscountName = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isSubstract property.
     * 
     */
    public boolean isIsSubstract() {
        return isSubstract;
    }

    /**
     * Sets the value of the isSubstract property.
     * 
     */
    public void setIsSubstract(boolean value) {
        this.isSubstract = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

}
