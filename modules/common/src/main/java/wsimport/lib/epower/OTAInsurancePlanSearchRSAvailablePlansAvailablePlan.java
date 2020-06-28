
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OTA_InsurancePlanSearchRSAvailablePlansAvailablePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_InsurancePlanSearchRSAvailablePlansAvailablePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlanDetail" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail" minOccurs="0"/>
 *         &lt;element name="ProviderDetail" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail" minOccurs="0"/>
 *         &lt;element name="UnderwriterDetail" type="{http://epowerv5.amadeus.com.tr/WS}OTA_InsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail" minOccurs="0"/>
 *         &lt;element name="PlanCost" type="{http://epowerv5.amadeus.com.tr/WS}PlanCostType" minOccurs="0"/>
 *         &lt;element name="PlanRestrictions" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPlanRestrictionTypePlanRestriction" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Featured" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PreferLevel" type="{http://epowerv5.amadeus.com.tr/WS}PreferLevelType" />
 *       &lt;attribute name="PlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PlanID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TypeID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_InsurancePlanSearchRSAvailablePlansAvailablePlan", propOrder = {
    "planDetail",
    "providerDetail",
    "underwriterDetail",
    "planCost",
    "planRestrictions"
})
public class OTAInsurancePlanSearchRSAvailablePlansAvailablePlan {

    @XmlElement(name = "PlanDetail")
    protected OTAInsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail planDetail;
    @XmlElement(name = "ProviderDetail")
    protected OTAInsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail providerDetail;
    @XmlElement(name = "UnderwriterDetail")
    protected OTAInsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail underwriterDetail;
    @XmlElement(name = "PlanCost")
    protected PlanCostType planCost;
    @XmlElement(name = "PlanRestrictions")
    protected ArrayOfPlanRestrictionTypePlanRestriction planRestrictions;
    @XmlAttribute(name = "Featured")
    protected Boolean featured;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "PlanCode")
    protected String planCode;
    @XmlAttribute(name = "PlanID")
    protected String planID;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "TypeID")
    protected String typeID;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * Gets the value of the planDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail }
     *     
     */
    public OTAInsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail getPlanDetail() {
        return planDetail;
    }

    /**
     * Sets the value of the planDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail }
     *     
     */
    public void setPlanDetail(OTAInsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail value) {
        this.planDetail = value;
    }

    /**
     * Gets the value of the providerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail }
     *     
     */
    public OTAInsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail getProviderDetail() {
        return providerDetail;
    }

    /**
     * Sets the value of the providerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail }
     *     
     */
    public void setProviderDetail(OTAInsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail value) {
        this.providerDetail = value;
    }

    /**
     * Gets the value of the underwriterDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail }
     *     
     */
    public OTAInsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail getUnderwriterDetail() {
        return underwriterDetail;
    }

    /**
     * Sets the value of the underwriterDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail }
     *     
     */
    public void setUnderwriterDetail(OTAInsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail value) {
        this.underwriterDetail = value;
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
     * Gets the value of the planRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPlanRestrictionTypePlanRestriction }
     *     
     */
    public ArrayOfPlanRestrictionTypePlanRestriction getPlanRestrictions() {
        return planRestrictions;
    }

    /**
     * Sets the value of the planRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPlanRestrictionTypePlanRestriction }
     *     
     */
    public void setPlanRestrictions(ArrayOfPlanRestrictionTypePlanRestriction value) {
        this.planRestrictions = value;
    }

    /**
     * Gets the value of the featured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeatured() {
        return featured;
    }

    /**
     * Sets the value of the featured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeatured(Boolean value) {
        this.featured = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the planCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanCode() {
        return planCode;
    }

    /**
     * Sets the value of the planCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanCode(String value) {
        this.planCode = value;
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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

}
