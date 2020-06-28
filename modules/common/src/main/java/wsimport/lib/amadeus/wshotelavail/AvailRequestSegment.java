
package wsimport.lib.amadeus.wshotelavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailRequestSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailRequestSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StayDateRange" type="{http://traveltalk.com/wsHotelAvail}StayDateRange" minOccurs="0"/>
 *         &lt;element name="RateRange" type="{http://traveltalk.com/wsHotelAvail}RateRange" minOccurs="0"/>
 *         &lt;element name="RatePlanCandidates" type="{http://traveltalk.com/wsHotelAvail}ArrayOfRatePlanCandidate" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://traveltalk.com/wsHotelAvail}ArrayOfProfileInfo" minOccurs="0"/>
 *         &lt;element name="RoomStayCandidates" type="{http://traveltalk.com/wsHotelAvail}ArrayOfRoomStayCandidate" minOccurs="0"/>
 *         &lt;element name="HotelSearchCriteria" type="{http://traveltalk.com/wsHotelAvail}ArrayOfCriterion" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AvailReqType" type="{http://traveltalk.com/wsHotelAvail}AvailRequestSegmentAvailReqType" />
 *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ResponseType" type="{http://traveltalk.com/wsHotelAvail}AvailRequestSegmentResponseType" default="PropertyList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailRequestSegment", propOrder = {
    "stayDateRange",
    "rateRange",
    "ratePlanCandidates",
    "profiles",
    "roomStayCandidates",
    "hotelSearchCriteria"
})
public class AvailRequestSegment {

    @XmlElement(name = "StayDateRange")
    protected StayDateRange stayDateRange;
    @XmlElement(name = "RateRange")
    protected RateRange rateRange;
    @XmlElement(name = "RatePlanCandidates")
    protected ArrayOfRatePlanCandidate ratePlanCandidates;
    @XmlElement(name = "Profiles")
    protected ArrayOfProfileInfo profiles;
    @XmlElement(name = "RoomStayCandidates")
    protected ArrayOfRoomStayCandidate roomStayCandidates;
    @XmlElement(name = "HotelSearchCriteria")
    protected ArrayOfCriterion hotelSearchCriteria;
    @XmlAttribute(name = "InfoSource")
    protected String infoSource;
    @XmlAttribute(name = "AvailReqType")
    protected AvailRequestSegmentAvailReqType availReqType;
    @XmlAttribute(name = "MoreDataEchoToken")
    protected String moreDataEchoToken;
    @XmlAttribute(name = "ResponseType")
    protected AvailRequestSegmentResponseType responseType;

    /**
     * Gets the value of the stayDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link StayDateRange }
     *     
     */
    public StayDateRange getStayDateRange() {
        return stayDateRange;
    }

    /**
     * Sets the value of the stayDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayDateRange }
     *     
     */
    public void setStayDateRange(StayDateRange value) {
        this.stayDateRange = value;
    }

    /**
     * Gets the value of the rateRange property.
     * 
     * @return
     *     possible object is
     *     {@link RateRange }
     *     
     */
    public RateRange getRateRange() {
        return rateRange;
    }

    /**
     * Sets the value of the rateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRange }
     *     
     */
    public void setRateRange(RateRange value) {
        this.rateRange = value;
    }

    /**
     * Gets the value of the ratePlanCandidates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatePlanCandidate }
     *     
     */
    public ArrayOfRatePlanCandidate getRatePlanCandidates() {
        return ratePlanCandidates;
    }

    /**
     * Sets the value of the ratePlanCandidates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatePlanCandidate }
     *     
     */
    public void setRatePlanCandidates(ArrayOfRatePlanCandidate value) {
        this.ratePlanCandidates = value;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileInfo }
     *     
     */
    public ArrayOfProfileInfo getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileInfo }
     *     
     */
    public void setProfiles(ArrayOfProfileInfo value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the roomStayCandidates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomStayCandidate }
     *     
     */
    public ArrayOfRoomStayCandidate getRoomStayCandidates() {
        return roomStayCandidates;
    }

    /**
     * Sets the value of the roomStayCandidates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomStayCandidate }
     *     
     */
    public void setRoomStayCandidates(ArrayOfRoomStayCandidate value) {
        this.roomStayCandidates = value;
    }

    /**
     * Gets the value of the hotelSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCriterion }
     *     
     */
    public ArrayOfCriterion getHotelSearchCriteria() {
        return hotelSearchCriteria;
    }

    /**
     * Sets the value of the hotelSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCriterion }
     *     
     */
    public void setHotelSearchCriteria(ArrayOfCriterion value) {
        this.hotelSearchCriteria = value;
    }

    /**
     * Gets the value of the infoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * Sets the value of the infoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSource(String value) {
        this.infoSource = value;
    }

    /**
     * Gets the value of the availReqType property.
     * 
     * @return
     *     possible object is
     *     {@link AvailRequestSegmentAvailReqType }
     *     
     */
    public AvailRequestSegmentAvailReqType getAvailReqType() {
        return availReqType;
    }

    /**
     * Sets the value of the availReqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailRequestSegmentAvailReqType }
     *     
     */
    public void setAvailReqType(AvailRequestSegmentAvailReqType value) {
        this.availReqType = value;
    }

    /**
     * Gets the value of the moreDataEchoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDataEchoToken() {
        return moreDataEchoToken;
    }

    /**
     * Sets the value of the moreDataEchoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreDataEchoToken(String value) {
        this.moreDataEchoToken = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link AvailRequestSegmentResponseType }
     *     
     */
    public AvailRequestSegmentResponseType getResponseType() {
        if (responseType == null) {
            return AvailRequestSegmentResponseType.PROPERTY_LIST;
        } else {
            return responseType;
        }
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailRequestSegmentResponseType }
     *     
     */
    public void setResponseType(AvailRequestSegmentResponseType value) {
        this.responseType = value;
    }

}
