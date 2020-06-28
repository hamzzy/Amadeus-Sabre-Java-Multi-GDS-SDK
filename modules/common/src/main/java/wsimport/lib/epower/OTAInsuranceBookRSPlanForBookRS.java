
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_InsuranceBookRSPlanForBookRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsuranceBookRSPlanForBookRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyDetail" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsuranceBookRSPlanForBookRSPolicyDetail" minOccurs="0"/>
 *         &lt;element name="CoveredTravelers" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfCoveredTravelerType" minOccurs="0"/>
 *         &lt;element name="InsCoverageDetail" type="{http://epowerv5.amadeus.com.tr/WS}InsCoverageDetailType" minOccurs="0"/>
 *         &lt;element name="PlanCost" type="{http://epowerv5.amadeus.com.tr/WS}PlanCostType" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://epowerv5.amadeus.com.tr/WS}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TypeID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_InsuranceBookRSPlanForBookRS", propOrder = {
    "policyDetail",
    "coveredTravelers",
    "insCoverageDetail",
    "planCost",
    "contact"
})
public class OTAInsuranceBookRSPlanForBookRS {

    @XmlElement(name = "PolicyDetail")
    protected OTAInsuranceBookRSPlanForBookRSPolicyDetail policyDetail;
    @XmlElement(name = "CoveredTravelers")
    protected ArrayOfCoveredTravelerType coveredTravelers;
    @XmlElement(name = "InsCoverageDetail")
    protected InsCoverageDetailType insCoverageDetail;
    @XmlElement(name = "PlanCost")
    protected PlanCostType planCost;
    @XmlElement(name = "Contact")
    protected List<ContactPersonType> contact;
    @XmlAttribute(name = "PlanID")
    protected String planID;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "TypeID")
    protected String typeID;
    @XmlAttribute(name = "RPH")
    protected String rph;

    /**
     * Gets the value of the policyDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsuranceBookRSPlanForBookRSPolicyDetail }
     *     
     */
    public OTAInsuranceBookRSPlanForBookRSPolicyDetail getPolicyDetail() {
        return policyDetail;
    }

    /**
     * Sets the value of the policyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsuranceBookRSPlanForBookRSPolicyDetail }
     *     
     */
    public void setPolicyDetail(OTAInsuranceBookRSPlanForBookRSPolicyDetail value) {
        this.policyDetail = value;
    }

    /**
     * Gets the value of the coveredTravelers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoveredTravelerType }
     *     
     */
    public ArrayOfCoveredTravelerType getCoveredTravelers() {
        return coveredTravelers;
    }

    /**
     * Sets the value of the coveredTravelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoveredTravelerType }
     *     
     */
    public void setCoveredTravelers(ArrayOfCoveredTravelerType value) {
        this.coveredTravelers = value;
    }

    /**
     * Gets the value of the insCoverageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailType }
     *     
     */
    public InsCoverageDetailType getInsCoverageDetail() {
        return insCoverageDetail;
    }

    /**
     * Sets the value of the insCoverageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailType }
     *     
     */
    public void setInsCoverageDetail(InsCoverageDetailType value) {
        this.insCoverageDetail = value;
    }

    /**
     * Gets the value of the planCost property.
     * 
     * @return
     *     possible object is
     *     {@link PlanCostType }
     *     
     */
    public PlanCostType getPlanCost() {
        return planCost;
    }

    /**
     * Sets the value of the planCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanCostType }
     *     
     */
    public void setPlanCost(PlanCostType value) {
        this.planCost = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType }
     * 
     * 
     */
    public List<ContactPersonType> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactPersonType>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the planID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanID() {
        return planID;
    }

    /**
     * Sets the value of the planID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanID(String value) {
        this.planID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * Sets the value of the typeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
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
