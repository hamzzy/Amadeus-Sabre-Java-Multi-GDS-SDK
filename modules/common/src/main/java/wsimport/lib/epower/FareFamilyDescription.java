
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareFamilyDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FamilyDescName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FamilyTypeText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyDescription")
public class FareFamilyDescription {

    @XmlAttribute(name = "FamilyDescName")
    protected String familyDescName;
    @XmlAttribute(name = "FamilyTypeText")
    protected String familyTypeText;
    @XmlAttribute(name = "PaymentType")
    protected String paymentType;

    /**
     * Gets the value of the familyDescName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyDescName() {
        return familyDescName;
    }

    /**
     * Sets the value of the familyDescName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyDescName(String value) {
        this.familyDescName = value;
    }

    /**
     * Gets the value of the familyTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyTypeText() {
        return familyTypeText;
    }

    /**
     * Sets the value of the familyTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyTypeText(String value) {
        this.familyTypeText = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

}
