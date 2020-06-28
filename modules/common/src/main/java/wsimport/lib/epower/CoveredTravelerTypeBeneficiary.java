
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoveredTravelerTypeBeneficiary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoveredTravelerTypeBeneficiary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}CoveredTravelerTypeBeneficiaryName" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://epowerv5.amadeus.com.tr/WS}AddressInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BenefitPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoveredTravelerTypeBeneficiary", propOrder = {
    "name",
    "address"
})
public class CoveredTravelerTypeBeneficiary {

    @XmlElement(name = "Name")
    protected CoveredTravelerTypeBeneficiaryName name;
    @XmlElement(name = "Address")
    protected AddressInfoType address;
    @XmlAttribute(name = "Relation")
    protected String relation;
    @XmlAttribute(name = "BenefitPercent")
    protected BigDecimal benefitPercent;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CoveredTravelerTypeBeneficiaryName }
     *     
     */
    public CoveredTravelerTypeBeneficiaryName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredTravelerTypeBeneficiaryName }
     *     
     */
    public void setName(CoveredTravelerTypeBeneficiaryName value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddress(AddressInfoType value) {
        this.address = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

    /**
     * Gets the value of the benefitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenefitPercent() {
        return benefitPercent;
    }

    /**
     * Sets the value of the benefitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenefitPercent(BigDecimal value) {
        this.benefitPercent = value;
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

}
