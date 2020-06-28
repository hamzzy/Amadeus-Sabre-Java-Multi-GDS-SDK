
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://traveltalk.com/wsHotelAvail}CompanyName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressInfo" type="{http://traveltalk.com/wsHotelAvail}AddressInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TelephoneInfo" type="{http://traveltalk.com/wsHotelAvail}TelephoneInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://traveltalk.com/wsHotelAvail}Email" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://traveltalk.com/wsHotelAvail}URL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessLocale" type="{http://traveltalk.com/wsHotelAvail}BusinessLocale" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentForm" type="{http://traveltalk.com/wsHotelAvail}PaymentForm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactPerson" type="{http://traveltalk.com/wsHotelAvail}ContactPerson" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelArranger" type="{http://traveltalk.com/wsHotelAvail}TravelArranger" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyProgram" type="{http://traveltalk.com/wsHotelAvail}LoyaltyProgram" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInfo", propOrder = {
    "companyName",
    "addressInfo",
    "telephoneInfo",
    "email",
    "url",
    "businessLocale",
    "paymentForm",
    "contactPerson",
    "travelArranger",
    "loyaltyProgram"
})
public class CompanyInfo {

    @XmlElement(name = "CompanyName")
    protected List<CompanyName> companyName;
    @XmlElement(name = "AddressInfo")
    protected List<AddressInfo> addressInfo;
    @XmlElement(name = "TelephoneInfo")
    protected List<TelephoneInfo> telephoneInfo;
    @XmlElement(name = "Email")
    protected List<Email> email;
    @XmlElement(name = "URL")
    protected List<URL> url;
    @XmlElement(name = "BusinessLocale")
    protected List<BusinessLocale> businessLocale;
    @XmlElement(name = "PaymentForm")
    protected List<PaymentForm> paymentForm;
    @XmlElement(name = "ContactPerson")
    protected List<ContactPerson> contactPerson;
    @XmlElement(name = "TravelArranger")
    protected List<TravelArranger> travelArranger;
    @XmlElement(name = "LoyaltyProgram")
    protected List<LoyaltyProgram> loyaltyProgram;

    /**
     * Gets the value of the companyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyName }
     * 
     * 
     */
    public List<CompanyName> getCompanyName() {
        if (companyName == null) {
            companyName = new ArrayList<CompanyName>();
        }
        return this.companyName;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressInfo }
     * 
     * 
     */
    public List<AddressInfo> getAddressInfo() {
        if (addressInfo == null) {
            addressInfo = new ArrayList<AddressInfo>();
        }
        return this.addressInfo;
    }

    /**
     * Gets the value of the telephoneInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneInfo }
     * 
     * 
     */
    public List<TelephoneInfo> getTelephoneInfo() {
        if (telephoneInfo == null) {
            telephoneInfo = new ArrayList<TelephoneInfo>();
        }
        return this.telephoneInfo;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<Email>();
        }
        return this.email;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URL }
     * 
     * 
     */
    public List<URL> getURL() {
        if (url == null) {
            url = new ArrayList<URL>();
        }
        return this.url;
    }

    /**
     * Gets the value of the businessLocale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessLocale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessLocale }
     * 
     * 
     */
    public List<BusinessLocale> getBusinessLocale() {
        if (businessLocale == null) {
            businessLocale = new ArrayList<BusinessLocale>();
        }
        return this.businessLocale;
    }

    /**
     * Gets the value of the paymentForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentForm }
     * 
     * 
     */
    public List<PaymentForm> getPaymentForm() {
        if (paymentForm == null) {
            paymentForm = new ArrayList<PaymentForm>();
        }
        return this.paymentForm;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPerson }
     * 
     * 
     */
    public List<ContactPerson> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<ContactPerson>();
        }
        return this.contactPerson;
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
     * Gets the value of the loyaltyProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgram }
     * 
     * 
     */
    public List<LoyaltyProgram> getLoyaltyProgram() {
        if (loyaltyProgram == null) {
            loyaltyProgram = new ArrayList<LoyaltyProgram>();
        }
        return this.loyaltyProgram;
    }

}
