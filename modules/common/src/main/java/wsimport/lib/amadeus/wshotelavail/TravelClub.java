
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TravelClub complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelClub">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelClubName" type="{http://traveltalk.com/wsHotelAvail}TravelClubName" minOccurs="0"/>
 *         &lt;element name="ClubMemberName" type="{http://traveltalk.com/wsHotelAvail}ClubMemberName" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}TravelClubShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}TravelClubShareMarketInd" />
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
@XmlType(name = "TravelClub", propOrder = {
    "travelClubName",
    "clubMemberName"
})
public class TravelClub {

    @XmlElement(name = "TravelClubName")
    protected TravelClubName travelClubName;
    @XmlElement(name = "ClubMemberName")
    protected ClubMemberName clubMemberName;
    @XmlAttribute(name = "ShareSynchInd")
    protected TravelClubShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected TravelClubShareMarketInd shareMarketInd;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;

    /**
     * Gets the value of the travelClubName property.
     * 
     * @return
     *     possible object is
     *     {@link TravelClubName }
     *     
     */
    public TravelClubName getTravelClubName() {
        return travelClubName;
    }

    /**
     * Sets the value of the travelClubName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelClubName }
     *     
     */
    public void setTravelClubName(TravelClubName value) {
        this.travelClubName = value;
    }

    /**
     * Gets the value of the clubMemberName property.
     * 
     * @return
     *     possible object is
     *     {@link ClubMemberName }
     *     
     */
    public ClubMemberName getClubMemberName() {
        return clubMemberName;
    }

    /**
     * Sets the value of the clubMemberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClubMemberName }
     *     
     */
    public void setClubMemberName(ClubMemberName value) {
        this.clubMemberName = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link TravelClubShareSynchInd }
     *     
     */
    public TravelClubShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelClubShareSynchInd }
     *     
     */
    public void setShareSynchInd(TravelClubShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link TravelClubShareMarketInd }
     *     
     */
    public TravelClubShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelClubShareMarketInd }
     *     
     */
    public void setShareMarketInd(TravelClubShareMarketInd value) {
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

}
