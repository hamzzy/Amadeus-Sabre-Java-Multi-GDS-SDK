
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialReqDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialReqDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatRequests" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSpecialReqDetailsTypeSeatRequest" minOccurs="0"/>
 *         &lt;element name="SpecialServiceRequests" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSpecialReqDetailsTypeSpecialServiceRequest" minOccurs="0"/>
 *         &lt;element name="OtherServiceInformations" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSpecialReqDetailsTypeOtherServiceInformation" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSpecialReqDetailsTypeRemark" minOccurs="0"/>
 *         &lt;element name="SpecialRemarks" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSpecialReqDetailsTypeSpecialRemark" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialReqDetailsType", propOrder = {
    "seatRequests",
    "specialServiceRequests",
    "otherServiceInformations",
    "remarks",
    "specialRemarks"
})
public class SpecialReqDetailsType {

    @XmlElement(name = "SeatRequests")
    protected ArrayOfSpecialReqDetailsTypeSeatRequest seatRequests;
    @XmlElement(name = "SpecialServiceRequests")
    protected ArrayOfSpecialReqDetailsTypeSpecialServiceRequest specialServiceRequests;
    @XmlElement(name = "OtherServiceInformations")
    protected ArrayOfSpecialReqDetailsTypeOtherServiceInformation otherServiceInformations;
    @XmlElement(name = "Remarks")
    protected ArrayOfSpecialReqDetailsTypeRemark remarks;
    @XmlElement(name = "SpecialRemarks")
    protected ArrayOfSpecialReqDetailsTypeSpecialRemark specialRemarks;

    /**
     * Gets the value of the seatRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialReqDetailsTypeSeatRequest }
     *     
     */
    public ArrayOfSpecialReqDetailsTypeSeatRequest getSeatRequests() {
        return seatRequests;
    }

    /**
     * Sets the value of the seatRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialReqDetailsTypeSeatRequest }
     *     
     */
    public void setSeatRequests(ArrayOfSpecialReqDetailsTypeSeatRequest value) {
        this.seatRequests = value;
    }

    /**
     * Gets the value of the specialServiceRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialReqDetailsTypeSpecialServiceRequest }
     *     
     */
    public ArrayOfSpecialReqDetailsTypeSpecialServiceRequest getSpecialServiceRequests() {
        return specialServiceRequests;
    }

    /**
     * Sets the value of the specialServiceRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialReqDetailsTypeSpecialServiceRequest }
     *     
     */
    public void setSpecialServiceRequests(ArrayOfSpecialReqDetailsTypeSpecialServiceRequest value) {
        this.specialServiceRequests = value;
    }

    /**
     * Gets the value of the otherServiceInformations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialReqDetailsTypeOtherServiceInformation }
     *     
     */
    public ArrayOfSpecialReqDetailsTypeOtherServiceInformation getOtherServiceInformations() {
        return otherServiceInformations;
    }

    /**
     * Sets the value of the otherServiceInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialReqDetailsTypeOtherServiceInformation }
     *     
     */
    public void setOtherServiceInformations(ArrayOfSpecialReqDetailsTypeOtherServiceInformation value) {
        this.otherServiceInformations = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialReqDetailsTypeRemark }
     *     
     */
    public ArrayOfSpecialReqDetailsTypeRemark getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialReqDetailsTypeRemark }
     *     
     */
    public void setRemarks(ArrayOfSpecialReqDetailsTypeRemark value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the specialRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialReqDetailsTypeSpecialRemark }
     *     
     */
    public ArrayOfSpecialReqDetailsTypeSpecialRemark getSpecialRemarks() {
        return specialRemarks;
    }

    /**
     * Sets the value of the specialRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialReqDetailsTypeSpecialRemark }
     *     
     */
    public void setSpecialRemarks(ArrayOfSpecialReqDetailsTypeSpecialRemark value) {
        this.specialRemarks = value;
    }

}
