
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accesses" type="{http://traveltalk.com/wsHotelAvail}Accesses" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://traveltalk.com/wsHotelAvail}Customer" minOccurs="0"/>
 *         &lt;element name="PrefCollections" type="{http://traveltalk.com/wsHotelAvail}PrefCollections" minOccurs="0"/>
 *         &lt;element name="CompanyInfo" type="{http://traveltalk.com/wsHotelAvail}CompanyInfo" minOccurs="0"/>
 *         &lt;element name="Affiliations" type="{http://traveltalk.com/wsHotelAvail}Affiliations" minOccurs="0"/>
 *         &lt;element name="Agreements" type="{http://traveltalk.com/wsHotelAvail}Agreements" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareAllSynchInd" type="{http://traveltalk.com/wsHotelAvail}ProfileShareAllSynchInd" default="No" />
 *       &lt;attribute name="ShareAllMarketInd" type="{http://traveltalk.com/wsHotelAvail}ProfileShareAllMarketInd" default="No" />
 *       &lt;attribute name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "accesses",
    "customer",
    "prefCollections",
    "companyInfo",
    "affiliations",
    "agreements"
})
public class Profile {

    @XmlElement(name = "Accesses")
    protected Accesses accesses;
    @XmlElement(name = "Customer")
    protected Customer customer;
    @XmlElement(name = "PrefCollections")
    protected PrefCollections prefCollections;
    @XmlElement(name = "CompanyInfo")
    protected CompanyInfo companyInfo;
    @XmlElement(name = "Affiliations")
    protected Affiliations affiliations;
    @XmlElement(name = "Agreements")
    protected Agreements agreements;
    @XmlAttribute(name = "ShareAllSynchInd")
    protected ProfileShareAllSynchInd shareAllSynchInd;
    @XmlAttribute(name = "ShareAllMarketInd")
    protected ProfileShareAllMarketInd shareAllMarketInd;
    @XmlAttribute(name = "ProfileType")
    protected String profileType;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;

    /**
     * Gets the value of the accesses property.
     * 
     * @return
     *     possible object is
     *     {@link Accesses }
     *     
     */
    public Accesses getAccesses() {
        return accesses;
    }

    /**
     * Sets the value of the accesses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accesses }
     *     
     */
    public void setAccesses(Accesses value) {
        this.accesses = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the prefCollections property.
     * 
     * @return
     *     possible object is
     *     {@link PrefCollections }
     *     
     */
    public PrefCollections getPrefCollections() {
        return prefCollections;
    }

    /**
     * Sets the value of the prefCollections property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefCollections }
     *     
     */
    public void setPrefCollections(PrefCollections value) {
        this.prefCollections = value;
    }

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInfo }
     *     
     */
    public CompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfo }
     *     
     */
    public void setCompanyInfo(CompanyInfo value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the affiliations property.
     * 
     * @return
     *     possible object is
     *     {@link Affiliations }
     *     
     */
    public Affiliations getAffiliations() {
        return affiliations;
    }

    /**
     * Sets the value of the affiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Affiliations }
     *     
     */
    public void setAffiliations(Affiliations value) {
        this.affiliations = value;
    }

    /**
     * Gets the value of the agreements property.
     * 
     * @return
     *     possible object is
     *     {@link Agreements }
     *     
     */
    public Agreements getAgreements() {
        return agreements;
    }

    /**
     * Sets the value of the agreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreements }
     *     
     */
    public void setAgreements(Agreements value) {
        this.agreements = value;
    }

    /**
     * Gets the value of the shareAllSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileShareAllSynchInd }
     *     
     */
    public ProfileShareAllSynchInd getShareAllSynchInd() {
        if (shareAllSynchInd == null) {
            return ProfileShareAllSynchInd.NO;
        } else {
            return shareAllSynchInd;
        }
    }

    /**
     * Sets the value of the shareAllSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileShareAllSynchInd }
     *     
     */
    public void setShareAllSynchInd(ProfileShareAllSynchInd value) {
        this.shareAllSynchInd = value;
    }

    /**
     * Gets the value of the shareAllMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileShareAllMarketInd }
     *     
     */
    public ProfileShareAllMarketInd getShareAllMarketInd() {
        if (shareAllMarketInd == null) {
            return ProfileShareAllMarketInd.NO;
        } else {
            return shareAllMarketInd;
        }
    }

    /**
     * Sets the value of the shareAllMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileShareAllMarketInd }
     *     
     */
    public void setShareAllMarketInd(ProfileShareAllMarketInd value) {
        this.shareAllMarketInd = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the creatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * Gets the value of the lastModifyDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * Sets the value of the lastModifyDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * Gets the value of the lastModifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * Sets the value of the lastModifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

}
