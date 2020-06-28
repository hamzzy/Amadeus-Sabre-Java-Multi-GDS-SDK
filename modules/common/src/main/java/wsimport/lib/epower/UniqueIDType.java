
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniqueID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniqueID_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Instance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecondarySplitPNRs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueID_Type", propOrder = {
    "companyName"
})
@XmlSeeAlso({
    wsimport.lib.epower.GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference.class,
    wsimport.lib.epower.Cancel.OTACancelRQ.UniqueID.class,
    wsimport.lib.epower.GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID.class,
    wsimport.lib.epower.GetBasketPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID.class,
    wsimport.lib.epower.GetCarPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID.class,
    wsimport.lib.epower.SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference.class,
    wsimport.lib.epower.GetPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID.class,
    VehicleReservationRQAdditionalInfoTypeReference.class,
    VehicleAvailCoreTypeReference.class,
    wsimport.lib.epower.ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay.Reference.class,
    wsimport.lib.epower.SourceType.RequestorID.class
})
public class UniqueIDType {

    @XmlElement(name = "CompanyName")
    protected CompanyNameType companyName;
    @XmlAttribute(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Instance")
    protected String instance;
    @XmlAttribute(name = "ID_Context")
    protected String idContext;
    @XmlAttribute(name = "SecondarySplitPNRs")
    protected String secondarySplitPNRs;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setCompanyName(CompanyNameType value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
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
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    /**
     * Gets the value of the idContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDContext() {
        return idContext;
    }

    /**
     * Sets the value of the idContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDContext(String value) {
        this.idContext = value;
    }

    /**
     * Gets the value of the secondarySplitPNRs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySplitPNRs() {
        return secondarySplitPNRs;
    }

    /**
     * Sets the value of the secondarySplitPNRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySplitPNRs(String value) {
        this.secondarySplitPNRs = value;
    }

}
