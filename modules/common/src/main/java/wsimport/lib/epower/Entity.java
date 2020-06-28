
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}DBBaseEntity">
 *       &lt;sequence>
 *         &lt;element name="TravelPolicySetID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TravelPolicySetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressDetails" type="{http://epowerv5.amadeus.com.tr/WS}AddressDetails" minOccurs="0"/>
 *         &lt;element name="CommunicationDetails" type="{http://epowerv5.amadeus.com.tr/WS}CommunicationDetails" minOccurs="0"/>
 *         &lt;element name="DocumentDetails" type="{http://epowerv5.amadeus.com.tr/WS}DocumentDetails" minOccurs="0"/>
 *         &lt;element name="ClientReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMailFooter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMailHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsUpdatableUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", propOrder = {
    "travelPolicySetID",
    "travelPolicySetName",
    "taxOffice",
    "taxNo",
    "addressDetails",
    "communicationDetails",
    "documentDetails",
    "clientReference",
    "costNumber",
    "currentAccountCode",
    "eMailFooter",
    "eMailHeader",
    "isUpdatableUser"
})
@XmlSeeAlso({
    Organization.class,
    Person.class
})
public class Entity
    extends DBBaseEntity
{

    @XmlElement(name = "TravelPolicySetID", required = true, type = Integer.class, nillable = true)
    protected Integer travelPolicySetID;
    @XmlElement(name = "TravelPolicySetName")
    protected String travelPolicySetName;
    @XmlElement(name = "TaxOffice")
    protected String taxOffice;
    @XmlElement(name = "TaxNo")
    protected String taxNo;
    @XmlElement(name = "AddressDetails")
    protected AddressDetails addressDetails;
    @XmlElement(name = "CommunicationDetails")
    protected CommunicationDetails communicationDetails;
    @XmlElement(name = "DocumentDetails")
    protected DocumentDetails documentDetails;
    @XmlElement(name = "ClientReference")
    protected String clientReference;
    @XmlElement(name = "CostNumber")
    protected String costNumber;
    @XmlElement(name = "CurrentAccountCode")
    protected String currentAccountCode;
    @XmlElement(name = "EMailFooter")
    protected String eMailFooter;
    @XmlElement(name = "EMailHeader")
    protected String eMailHeader;
    @XmlElement(name = "IsUpdatableUser")
    protected boolean isUpdatableUser;

    /**
     * Gets the value of the travelPolicySetID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTravelPolicySetID() {
        return travelPolicySetID;
    }

    /**
     * Sets the value of the travelPolicySetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTravelPolicySetID(Integer value) {
        this.travelPolicySetID = value;
    }

    /**
     * Gets the value of the travelPolicySetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPolicySetName() {
        return travelPolicySetName;
    }

    /**
     * Sets the value of the travelPolicySetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelPolicySetName(String value) {
        this.travelPolicySetName = value;
    }

    /**
     * Gets the value of the taxOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOffice() {
        return taxOffice;
    }

    /**
     * Sets the value of the taxOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOffice(String value) {
        this.taxOffice = value;
    }

    /**
     * Gets the value of the taxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNo() {
        return taxNo;
    }

    /**
     * Sets the value of the taxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNo(String value) {
        this.taxNo = value;
    }

    /**
     * Gets the value of the addressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetails }
     *     
     */
    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetails }
     *     
     */
    public void setAddressDetails(AddressDetails value) {
        this.addressDetails = value;
    }

    /**
     * Gets the value of the communicationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationDetails }
     *     
     */
    public CommunicationDetails getCommunicationDetails() {
        return communicationDetails;
    }

    /**
     * Sets the value of the communicationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationDetails }
     *     
     */
    public void setCommunicationDetails(CommunicationDetails value) {
        this.communicationDetails = value;
    }

    /**
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDetails }
     *     
     */
    public DocumentDetails getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDetails }
     *     
     */
    public void setDocumentDetails(DocumentDetails value) {
        this.documentDetails = value;
    }

    /**
     * Gets the value of the clientReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReference() {
        return clientReference;
    }

    /**
     * Sets the value of the clientReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReference(String value) {
        this.clientReference = value;
    }

    /**
     * Gets the value of the costNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostNumber() {
        return costNumber;
    }

    /**
     * Sets the value of the costNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostNumber(String value) {
        this.costNumber = value;
    }

    /**
     * Gets the value of the currentAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentAccountCode() {
        return currentAccountCode;
    }

    /**
     * Sets the value of the currentAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentAccountCode(String value) {
        this.currentAccountCode = value;
    }

    /**
     * Gets the value of the eMailFooter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailFooter() {
        return eMailFooter;
    }

    /**
     * Sets the value of the eMailFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailFooter(String value) {
        this.eMailFooter = value;
    }

    /**
     * Gets the value of the eMailHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailHeader() {
        return eMailHeader;
    }

    /**
     * Sets the value of the eMailHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailHeader(String value) {
        this.eMailHeader = value;
    }

    /**
     * Gets the value of the isUpdatableUser property.
     * 
     */
    public boolean isIsUpdatableUser() {
        return isUpdatableUser;
    }

    /**
     * Sets the value of the isUpdatableUser property.
     * 
     */
    public void setIsUpdatableUser(boolean value) {
        this.isUpdatableUser = value;
    }

}
