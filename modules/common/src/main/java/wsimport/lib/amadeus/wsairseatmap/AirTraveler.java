
package wsimport.lib.amadeus.wsairseatmap;

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
 * <p>Java class for AirTraveler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirTraveler">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://traveltalk.com/wsAirSeatMap}PersonName" minOccurs="0"/>
 *         &lt;element name="CustLoyalty" type="{http://traveltalk.com/wsAirSeatMap}CustLoyalty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PassengerTypeQuantity" type="{http://traveltalk.com/wsAirSeatMap}PassengerTypeQuantity" minOccurs="0"/>
 *         &lt;element name="TravelerRefNumber" type="{http://traveltalk.com/wsAirSeatMap}TravelerRefNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Gender" type="{http://traveltalk.com/wsAirSeatMap}AirTravelerGender" />
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsAirSeatMap}AirTravelerShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsAirSeatMap}AirTravelerShareMarketInd" />
 *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccompaniedByInfant" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirTraveler", propOrder = {
    "personName",
    "custLoyalty",
    "passengerTypeQuantity",
    "travelerRefNumber"
})
public class AirTraveler {

    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlElement(name = "CustLoyalty")
    protected List<CustLoyalty> custLoyalty;
    @XmlElement(name = "PassengerTypeQuantity")
    protected PassengerTypeQuantity passengerTypeQuantity;
    @XmlElement(name = "TravelerRefNumber")
    protected TravelerRefNumber travelerRefNumber;
    @XmlAttribute(name = "Gender")
    protected AirTravelerGender gender;
    @XmlAttribute(name = "ShareSynchInd")
    protected AirTravelerShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected AirTravelerShareMarketInd shareMarketInd;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "FareBasisCode")
    protected String fareBasisCode;
    @XmlAttribute(name = "AccompaniedByInfant")
    protected Boolean accompaniedByInfant;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustLoyalty }
     * 
     * 
     */
    public List<CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTypeQuantity }
     *     
     */
    public PassengerTypeQuantity getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /**
     * Sets the value of the passengerTypeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTypeQuantity }
     *     
     */
    public void setPassengerTypeQuantity(PassengerTypeQuantity value) {
        this.passengerTypeQuantity = value;
    }

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerRefNumber }
     *     
     */
    public TravelerRefNumber getTravelerRefNumber() {
        return travelerRefNumber;
    }

    /**
     * Sets the value of the travelerRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerRefNumber }
     *     
     */
    public void setTravelerRefNumber(TravelerRefNumber value) {
        this.travelerRefNumber = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link AirTravelerGender }
     *     
     */
    public AirTravelerGender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTravelerGender }
     *     
     */
    public void setGender(AirTravelerGender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link AirTravelerShareSynchInd }
     *     
     */
    public AirTravelerShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTravelerShareSynchInd }
     *     
     */
    public void setShareSynchInd(AirTravelerShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link AirTravelerShareMarketInd }
     *     
     */
    public AirTravelerShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTravelerShareMarketInd }
     *     
     */
    public void setShareMarketInd(AirTravelerShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the accompaniedByInfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccompaniedByInfant() {
        return accompaniedByInfant;
    }

    /**
     * Sets the value of the accompaniedByInfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccompaniedByInfant(Boolean value) {
        this.accompaniedByInfant = value;
    }

}
