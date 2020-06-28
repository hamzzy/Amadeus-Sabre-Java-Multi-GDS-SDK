
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Affiliations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Affiliations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization" type="{http://traveltalk.com/wsHotelAvail}Organization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Employer" type="{http://traveltalk.com/wsHotelAvail}Employer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelArranger" type="{http://traveltalk.com/wsHotelAvail}TravelArranger" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelClub" type="{http://traveltalk.com/wsHotelAvail}TravelClub" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Insurance" type="{http://traveltalk.com/wsHotelAvail}Insurance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}AffiliationsShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}AffiliationsShareMarketInd" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Affiliations", propOrder = {
    "organization",
    "employer",
    "travelArranger",
    "travelClub",
    "insurance"
})
public class Affiliations {

    @XmlElement(name = "Organization")
    protected List<Organization> organization;
    @XmlElement(name = "Employer")
    protected List<Employer> employer;
    @XmlElement(name = "TravelArranger")
    protected List<TravelArranger> travelArranger;
    @XmlElement(name = "TravelClub")
    protected List<TravelClub> travelClub;
    @XmlElement(name = "Insurance")
    protected List<Insurance> insurance;
    @XmlAttribute(name = "ShareSynchInd")
    protected AffiliationsShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected AffiliationsShareMarketInd shareMarketInd;

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organization }
     * 
     * 
     */
    public List<Organization> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<Organization>();
        }
        return this.organization;
    }

    /**
     * Gets the value of the employer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Employer }
     * 
     * 
     */
    public List<Employer> getEmployer() {
        if (employer == null) {
            employer = new ArrayList<Employer>();
        }
        return this.employer;
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
     * Gets the value of the travelClub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelClub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelClub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelClub }
     * 
     * 
     */
    public List<TravelClub> getTravelClub() {
        if (travelClub == null) {
            travelClub = new ArrayList<TravelClub>();
        }
        return this.travelClub;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Insurance }
     * 
     * 
     */
    public List<Insurance> getInsurance() {
        if (insurance == null) {
            insurance = new ArrayList<Insurance>();
        }
        return this.insurance;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationsShareSynchInd }
     *     
     */
    public AffiliationsShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationsShareSynchInd }
     *     
     */
    public void setShareSynchInd(AffiliationsShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationsShareMarketInd }
     *     
     */
    public AffiliationsShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationsShareMarketInd }
     *     
     */
    public void setShareMarketInd(AffiliationsShareMarketInd value) {
        this.shareMarketInd = value;
    }

}
