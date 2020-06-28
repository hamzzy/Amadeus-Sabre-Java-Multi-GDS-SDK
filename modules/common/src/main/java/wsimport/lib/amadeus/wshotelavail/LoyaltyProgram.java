
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for LoyaltyProgram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyProgram">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SingleVendorInd" type="{http://traveltalk.com/wsHotelAvail}LoyaltyProgramSingleVendorInd" />
 *       &lt;attribute name="LoyaltyLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgram", propOrder = {
    "value"
})
public class LoyaltyProgram {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ProgramCode")
    protected String programCode;
    @XmlAttribute(name = "SingleVendorInd")
    protected LoyaltyProgramSingleVendorInd singleVendorInd;
    @XmlAttribute(name = "LoyaltyLevel")
    protected String loyaltyLevel;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the singleVendorInd property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramSingleVendorInd }
     *     
     */
    public LoyaltyProgramSingleVendorInd getSingleVendorInd() {
        return singleVendorInd;
    }

    /**
     * Sets the value of the singleVendorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramSingleVendorInd }
     *     
     */
    public void setSingleVendorInd(LoyaltyProgramSingleVendorInd value) {
        this.singleVendorInd = value;
    }

    /**
     * Gets the value of the loyaltyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyLevel() {
        return loyaltyLevel;
    }

    /**
     * Sets the value of the loyaltyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyLevel(String value) {
        this.loyaltyLevel = value;
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
