
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Corporate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Corporate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}Organization">
 *       &lt;sequence>
 *         &lt;element name="HomeOfficeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AwayOfficeIDs" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfString5" minOccurs="0"/>
 *         &lt;element name="CrossBorderSearchLogic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CBSSettings" type="{http://epowerv5.amadeus.com.tr/WS}CrossBoarderSearchSetting" minOccurs="0"/>
 *         &lt;element name="B2CRules" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfString5" minOccurs="0"/>
 *         &lt;element name="Theme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Master" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareCodes" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfString5" minOccurs="0"/>
 *         &lt;element name="CorporateSettings" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfCorporateSetting" minOccurs="0"/>
 *         &lt;element name="QueueSettings" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfQueueSetting" minOccurs="0"/>
 *         &lt;element name="ModifyProfile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AgencyCommissionID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="AgencySecondaryLevelServiceFeeID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="GroupCommissionID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="AgencyGroupID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAgencyUseParentCommission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SubAgencyUseParentServiceFee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GroupUseParentCommission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GroupUseParentServiceFee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Corporate", propOrder = {
    "homeOfficeID",
    "awayOfficeIDs",
    "crossBorderSearchLogic",
    "cbsSettings",
    "b2CRules",
    "theme",
    "master",
    "fareCodes",
    "corporateSettings",
    "queueSettings",
    "modifyProfile",
    "agencyCommissionID",
    "agencySecondaryLevelServiceFeeID",
    "groupCommissionID",
    "agencyGroupID",
    "groupName",
    "subAgencyUseParentCommission",
    "subAgencyUseParentServiceFee",
    "groupUseParentCommission",
    "groupUseParentServiceFee"
})
public class Corporate
    extends Organization
{

    @XmlElement(name = "HomeOfficeID")
    protected String homeOfficeID;
    @XmlElement(name = "AwayOfficeIDs")
    protected ArrayOfString5 awayOfficeIDs;
    @XmlElement(name = "CrossBorderSearchLogic")
    protected String crossBorderSearchLogic;
    @XmlElement(name = "CBSSettings")
    protected CrossBoarderSearchSetting cbsSettings;
    @XmlElement(name = "B2CRules")
    protected ArrayOfString5 b2CRules;
    @XmlElement(name = "Theme")
    protected String theme;
    @XmlElement(name = "Master")
    protected String master;
    @XmlElement(name = "FareCodes")
    protected ArrayOfString5 fareCodes;
    @XmlElement(name = "CorporateSettings")
    protected ArrayOfCorporateSetting corporateSettings;
    @XmlElement(name = "QueueSettings")
    protected ArrayOfQueueSetting queueSettings;
    @XmlElement(name = "ModifyProfile", required = true, type = Boolean.class, nillable = true)
    protected Boolean modifyProfile;
    @XmlElement(name = "AgencyCommissionID", required = true, nillable = true)
    protected String agencyCommissionID;
    @XmlElement(name = "AgencySecondaryLevelServiceFeeID", required = true, nillable = true)
    protected String agencySecondaryLevelServiceFeeID;
    @XmlElement(name = "GroupCommissionID", required = true, nillable = true)
    protected String groupCommissionID;
    @XmlElement(name = "AgencyGroupID", required = true, nillable = true)
    protected String agencyGroupID;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "SubAgencyUseParentCommission", required = true, type = Boolean.class, nillable = true)
    protected Boolean subAgencyUseParentCommission;
    @XmlElement(name = "SubAgencyUseParentServiceFee", required = true, type = Boolean.class, nillable = true)
    protected Boolean subAgencyUseParentServiceFee;
    @XmlElement(name = "GroupUseParentCommission", required = true, type = Boolean.class, nillable = true)
    protected Boolean groupUseParentCommission;
    @XmlElement(name = "GroupUseParentServiceFee", required = true, type = Boolean.class, nillable = true)
    protected Boolean groupUseParentServiceFee;

    /**
     * Gets the value of the homeOfficeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeOfficeID() {
        return homeOfficeID;
    }

    /**
     * Sets the value of the homeOfficeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeOfficeID(String value) {
        this.homeOfficeID = value;
    }

    /**
     * Gets the value of the awayOfficeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString5 }
     *     
     */
    public ArrayOfString5 getAwayOfficeIDs() {
        return awayOfficeIDs;
    }

    /**
     * Sets the value of the awayOfficeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString5 }
     *     
     */
    public void setAwayOfficeIDs(ArrayOfString5 value) {
        this.awayOfficeIDs = value;
    }

    /**
     * Gets the value of the crossBorderSearchLogic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossBorderSearchLogic() {
        return crossBorderSearchLogic;
    }

    /**
     * Sets the value of the crossBorderSearchLogic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossBorderSearchLogic(String value) {
        this.crossBorderSearchLogic = value;
    }

    /**
     * Gets the value of the cbsSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CrossBoarderSearchSetting }
     *     
     */
    public CrossBoarderSearchSetting getCBSSettings() {
        return cbsSettings;
    }

    /**
     * Sets the value of the cbsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossBoarderSearchSetting }
     *     
     */
    public void setCBSSettings(CrossBoarderSearchSetting value) {
        this.cbsSettings = value;
    }

    /**
     * Gets the value of the b2CRules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString5 }
     *     
     */
    public ArrayOfString5 getB2CRules() {
        return b2CRules;
    }

    /**
     * Sets the value of the b2CRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString5 }
     *     
     */
    public void setB2CRules(ArrayOfString5 value) {
        this.b2CRules = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * Gets the value of the master property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaster(String value) {
        this.master = value;
    }

    /**
     * Gets the value of the fareCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString5 }
     *     
     */
    public ArrayOfString5 getFareCodes() {
        return fareCodes;
    }

    /**
     * Sets the value of the fareCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString5 }
     *     
     */
    public void setFareCodes(ArrayOfString5 value) {
        this.fareCodes = value;
    }

    /**
     * Gets the value of the corporateSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCorporateSetting }
     *     
     */
    public ArrayOfCorporateSetting getCorporateSettings() {
        return corporateSettings;
    }

    /**
     * Sets the value of the corporateSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCorporateSetting }
     *     
     */
    public void setCorporateSettings(ArrayOfCorporateSetting value) {
        this.corporateSettings = value;
    }

    /**
     * Gets the value of the queueSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQueueSetting }
     *     
     */
    public ArrayOfQueueSetting getQueueSettings() {
        return queueSettings;
    }

    /**
     * Sets the value of the queueSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQueueSetting }
     *     
     */
    public void setQueueSettings(ArrayOfQueueSetting value) {
        this.queueSettings = value;
    }

    /**
     * Gets the value of the modifyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifyProfile() {
        return modifyProfile;
    }

    /**
     * Sets the value of the modifyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifyProfile(Boolean value) {
        this.modifyProfile = value;
    }

    /**
     * Gets the value of the agencyCommissionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCommissionID() {
        return agencyCommissionID;
    }

    /**
     * Sets the value of the agencyCommissionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCommissionID(String value) {
        this.agencyCommissionID = value;
    }

    /**
     * Gets the value of the agencySecondaryLevelServiceFeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencySecondaryLevelServiceFeeID() {
        return agencySecondaryLevelServiceFeeID;
    }

    /**
     * Sets the value of the agencySecondaryLevelServiceFeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencySecondaryLevelServiceFeeID(String value) {
        this.agencySecondaryLevelServiceFeeID = value;
    }

    /**
     * Gets the value of the groupCommissionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCommissionID() {
        return groupCommissionID;
    }

    /**
     * Sets the value of the groupCommissionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCommissionID(String value) {
        this.groupCommissionID = value;
    }

    /**
     * Gets the value of the agencyGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyGroupID() {
        return agencyGroupID;
    }

    /**
     * Sets the value of the agencyGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyGroupID(String value) {
        this.agencyGroupID = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the subAgencyUseParentCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubAgencyUseParentCommission() {
        return subAgencyUseParentCommission;
    }

    /**
     * Sets the value of the subAgencyUseParentCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubAgencyUseParentCommission(Boolean value) {
        this.subAgencyUseParentCommission = value;
    }

    /**
     * Gets the value of the subAgencyUseParentServiceFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubAgencyUseParentServiceFee() {
        return subAgencyUseParentServiceFee;
    }

    /**
     * Sets the value of the subAgencyUseParentServiceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubAgencyUseParentServiceFee(Boolean value) {
        this.subAgencyUseParentServiceFee = value;
    }

    /**
     * Gets the value of the groupUseParentCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupUseParentCommission() {
        return groupUseParentCommission;
    }

    /**
     * Sets the value of the groupUseParentCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupUseParentCommission(Boolean value) {
        this.groupUseParentCommission = value;
    }

    /**
     * Gets the value of the groupUseParentServiceFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupUseParentServiceFee() {
        return groupUseParentServiceFee;
    }

    /**
     * Sets the value of the groupUseParentServiceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupUseParentServiceFee(Boolean value) {
        this.groupUseParentServiceFee = value;
    }

}
