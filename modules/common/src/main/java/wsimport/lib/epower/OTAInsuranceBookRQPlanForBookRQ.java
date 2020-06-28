
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_InsuranceBookRQPlanForBookRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsuranceBookRQPlanForBookRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}InsCoverageType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceCustomer" type="{http://epowerv5.amadeus.com.tr/WS}InsuranceCustomerType" minOccurs="0"/>
 *         &lt;element name="PlanCost" type="{http://epowerv5.amadeus.com.tr/WS}PlanCostType" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_InsuranceBookRQPlanForBookRQ", propOrder = {
    "insuranceCustomer",
    "planCost",
    "uniqueID"
})
public class OTAInsuranceBookRQPlanForBookRQ
    extends InsCoverageType
{

    @XmlElement(name = "InsuranceCustomer")
    protected InsuranceCustomerType insuranceCustomer;
    @XmlElement(name = "PlanCost")
    protected PlanCostType planCost;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;

    /**
     * Gets the value of the insuranceCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCustomerType }
     *     
     */
    public InsuranceCustomerType getInsuranceCustomer() {
        return insuranceCustomer;
    }

    /**
     * Sets the value of the insuranceCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCustomerType }
     *     
     */
    public void setInsuranceCustomer(InsuranceCustomerType value) {
        this.insuranceCustomer = value;
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
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

}
