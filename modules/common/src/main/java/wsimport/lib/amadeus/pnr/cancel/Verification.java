
package wsimport.lib.amadeus.pnr.cancel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Verification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Verification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://traveltalk.com/wsPNRCancel}PersonName" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://traveltalk.com/wsPNRCancel}Email" minOccurs="0"/>
 *         &lt;element name="TelephoneInfo" type="{http://traveltalk.com/wsPNRCancel}TelephoneInfo" minOccurs="0"/>
 *         &lt;element name="PaymentCard" type="{http://traveltalk.com/wsPNRCancel}PaymentCard" minOccurs="0"/>
 *         &lt;element name="AddressInfo" type="{http://traveltalk.com/wsPNRCancel}AddressInfo" minOccurs="0"/>
 *         &lt;element name="CustLoyalty" type="{http://traveltalk.com/wsPNRCancel}CustLoyalty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://traveltalk.com/wsPNRCancel}Vendor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReservationTimeSpan" type="{http://traveltalk.com/wsPNRCancel}ReservationTimeSpan" minOccurs="0"/>
 *         &lt;element name="AssociatedQuantity" type="{http://traveltalk.com/wsPNRCancel}AssociatedQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StartLocation" type="{http://traveltalk.com/wsPNRCancel}StartLocation" minOccurs="0"/>
 *         &lt;element name="EndLocation" type="{http://traveltalk.com/wsPNRCancel}EndLocation" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsPNRCancel}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verification", propOrder = {
    "personName",
    "email",
    "telephoneInfo",
    "paymentCard",
    "addressInfo",
    "custLoyalty",
    "vendor",
    "reservationTimeSpan",
    "associatedQuantity",
    "startLocation",
    "endLocation",
    "tpaExtensions"
})
public class Verification {

    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlElement(name = "Email")
    protected Email email;
    @XmlElement(name = "TelephoneInfo")
    protected TelephoneInfo telephoneInfo;
    @XmlElement(name = "PaymentCard")
    protected PaymentCard paymentCard;
    @XmlElement(name = "AddressInfo")
    protected AddressInfo addressInfo;
    @XmlElement(name = "CustLoyalty")
    protected List<CustLoyalty> custLoyalty;
    @XmlElement(name = "Vendor")
    protected List<Vendor> vendor;
    @XmlElement(name = "ReservationTimeSpan")
    protected ReservationTimeSpan reservationTimeSpan;
    @XmlElement(name = "AssociatedQuantity")
    protected List<AssociatedQuantity> associatedQuantity;
    @XmlElement(name = "StartLocation")
    protected StartLocation startLocation;
    @XmlElement(name = "EndLocation")
    protected EndLocation endLocation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;

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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the telephoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneInfo }
     *     
     */
    public TelephoneInfo getTelephoneInfo() {
        return telephoneInfo;
    }

    /**
     * Sets the value of the telephoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneInfo }
     *     
     */
    public void setTelephoneInfo(TelephoneInfo value) {
        this.telephoneInfo = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard }
     *     
     */
    public PaymentCard getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard }
     *     
     */
    public void setPaymentCard(PaymentCard value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfo }
     *     
     */
    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfo }
     *     
     */
    public void setAddressInfo(AddressInfo value) {
        this.addressInfo = value;
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
     * Gets the value of the vendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vendor }
     * 
     * 
     */
    public List<Vendor> getVendor() {
        if (vendor == null) {
            vendor = new ArrayList<Vendor>();
        }
        return this.vendor;
    }

    /**
     * Gets the value of the reservationTimeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationTimeSpan }
     *     
     */
    public ReservationTimeSpan getReservationTimeSpan() {
        return reservationTimeSpan;
    }

    /**
     * Sets the value of the reservationTimeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationTimeSpan }
     *     
     */
    public void setReservationTimeSpan(ReservationTimeSpan value) {
        this.reservationTimeSpan = value;
    }

    /**
     * Gets the value of the associatedQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedQuantity }
     * 
     * 
     */
    public List<AssociatedQuantity> getAssociatedQuantity() {
        if (associatedQuantity == null) {
            associatedQuantity = new ArrayList<AssociatedQuantity>();
        }
        return this.associatedQuantity;
    }

    /**
     * Gets the value of the startLocation property.
     * 
     * @return
     *     possible object is
     *     {@link StartLocation }
     *     
     */
    public StartLocation getStartLocation() {
        return startLocation;
    }

    /**
     * Sets the value of the startLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartLocation }
     *     
     */
    public void setStartLocation(StartLocation value) {
        this.startLocation = value;
    }

    /**
     * Gets the value of the endLocation property.
     * 
     * @return
     *     possible object is
     *     {@link EndLocation }
     *     
     */
    public EndLocation getEndLocation() {
        return endLocation;
    }

    /**
     * Sets the value of the endLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndLocation }
     *     
     */
    public void setEndLocation(EndLocation value) {
        this.endLocation = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensions }
     *     
     */
    public TPAExtensions getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensions }
     *     
     */
    public void setTPAExtensions(TPAExtensions value) {
        this.tpaExtensions = value;
    }

}
