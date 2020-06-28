
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgMemberName" type="{http://traveltalk.com/wsHotelAvail}OrgMemberName" minOccurs="0"/>
 *         &lt;element name="OrgName" type="{http://traveltalk.com/wsHotelAvail}OrgName" minOccurs="0"/>
 *         &lt;element name="RelatedOrgName" type="{http://traveltalk.com/wsHotelAvail}RelatedOrgName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelArranger" type="{http://traveltalk.com/wsHotelAvail}TravelArranger" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}OrganizationShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}OrganizationShareMarketInd" />
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="OfficeType" type="{http://traveltalk.com/wsHotelAvail}OrganizationOfficeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "orgMemberName",
    "orgName",
    "relatedOrgName",
    "travelArranger"
})
public class Organization {

    @XmlElement(name = "OrgMemberName")
    protected OrgMemberName orgMemberName;
    @XmlElement(name = "OrgName")
    protected OrgName orgName;
    @XmlElement(name = "RelatedOrgName")
    protected List<RelatedOrgName> relatedOrgName;
    @XmlElement(name = "TravelArranger")
    protected List<TravelArranger> travelArranger;
    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;
    @XmlAttribute(name = "ShareSynchInd")
    protected OrganizationShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected OrganizationShareMarketInd shareMarketInd;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "OfficeType")
    protected OrganizationOfficeType officeType;

    /**
     * Gets the value of the orgMemberName property.
     * 
     * @return
     *     possible object is
     *     {@link OrgMemberName }
     *     
     */
    public OrgMemberName getOrgMemberName() {
        return orgMemberName;
    }

    /**
     * Sets the value of the orgMemberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgMemberName }
     *     
     */
    public void setOrgMemberName(OrgMemberName value) {
        this.orgMemberName = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link OrgName }
     *     
     */
    public OrgName getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgName }
     *     
     */
    public void setOrgName(OrgName value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the relatedOrgName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedOrgName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedOrgName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedOrgName }
     * 
     * 
     */
    public List<RelatedOrgName> getRelatedOrgName() {
        if (relatedOrgName == null) {
            relatedOrgName = new ArrayList<RelatedOrgName>();
        }
        return this.relatedOrgName;
    }

    /**
     * Gets the value of the travelArranger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelArranger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelArranger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelArranger }
     * 
     * 
     */
    public List<TravelArranger> getTravelArranger() {
        if (travelArranger == null) {
            travelArranger = new ArrayList<TravelArranger>();
        }
        return this.travelArranger;
    }

    /**
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDefaultInd() {
        if (defaultInd == null) {
            return false;
        } else {
            return defaultInd;
        }
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultInd(Boolean value) {
        this.defaultInd = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationShareSynchInd }
     *     
     */
    public OrganizationShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationShareSynchInd }
     *     
     */
    public void setShareSynchInd(OrganizationShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationShareMarketInd }
     *     
     */
    public OrganizationShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationShareMarketInd }
     *     
     */
    public void setShareMarketInd(OrganizationShareMarketInd value) {
        this.shareMarketInd = value;
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

    /**
     * Gets the value of the officeType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationOfficeType }
     *     
     */
    public OrganizationOfficeType getOfficeType() {
        return officeType;
    }

    /**
     * Sets the value of the officeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationOfficeType }
     *     
     */
    public void setOfficeType(OrganizationOfficeType value) {
        this.officeType = value;
    }

}
