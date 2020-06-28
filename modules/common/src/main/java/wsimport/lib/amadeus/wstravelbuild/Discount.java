
package wsimport.lib.amadeus.wstravelbuild;

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
 *         &lt;element name="Discount_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount_Fare" type="{http://traveltalk.com/wsTravelBuild}Discount_Fare" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://traveltalk.com/wsTravelBuild}RemarksRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Discount_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Selected" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discount", propOrder = {
    "discountType",
    "discountValue",
    "discountFare",
    "remarks"
})
public class Discount {

    @XmlElement(name = "Discount_Type")
    protected String discountType;
    @XmlElement(name = "Discount_Value")
    protected String discountValue;
    @XmlElement(name = "Discount_Fare")
    protected DiscountFare discountFare;
    @XmlElement(name = "Remarks")
    protected RemarksRS remarks;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Discount_Name")
    protected String discountName;
    @XmlAttribute(name = "Selected", required = true)
    protected boolean selected;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountType(String value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the discountValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountValue() {
        return discountValue;
    }

    /**
     * Sets the value of the discountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountValue(String value) {
        this.discountValue = value;
    }

    /**
     * Gets the value of the discountFare property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountFare }
     *     
     */
    public DiscountFare getDiscountFare() {
        return discountFare;
    }

    /**
     * Sets the value of the discountFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountFare }
     *     
     */
    public void setDiscountFare(DiscountFare value) {
        this.discountFare = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarksRS }
     *     
     */
    public RemarksRS getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarksRS }
     *     
     */
    public void setRemarks(RemarksRS value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the discountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountName() {
        return discountName;
    }

    /**
     * Sets the value of the discountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountName(String value) {
        this.discountName = value;
    }

    /**
     * Gets the value of the selected property.
     * 
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     */
    public void setSelected(boolean value) {
        this.selected = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

}
