
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherSrvcPref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherSrvcPref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherSrvcName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorPref" type="{http://traveltalk.com/wsHotelAvail}VendorPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyPref" type="{http://traveltalk.com/wsHotelAvail}LoyaltyPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://traveltalk.com/wsHotelAvail}PaymentFormPref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://traveltalk.com/wsHotelAvail}SpecRequestPref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PreferLevel" type="{http://traveltalk.com/wsHotelAvail}OtherSrvcPrefPreferLevel" default="Preferred" />
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}OtherSrvcPrefShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}OtherSrvcPrefShareMarketInd" />
 *       &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherSrvcPref", propOrder = {
    "otherSrvcName",
    "vendorPref",
    "loyaltyPref",
    "paymentFormPref",
    "specRequestPref"
})
public class OtherSrvcPref {

    @XmlElement(name = "OtherSrvcName")
    protected String otherSrvcName;
    @XmlElement(name = "VendorPref")
    protected List<VendorPref> vendorPref;
    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPref> loyaltyPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPref> paymentFormPref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPref> specRequestPref;
    @XmlAttribute(name = "PreferLevel")
    protected OtherSrvcPrefPreferLevel preferLevel;
    @XmlAttribute(name = "ShareSynchInd")
    protected OtherSrvcPrefShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected OtherSrvcPrefShareMarketInd shareMarketInd;
    @XmlAttribute(name = "TravelPurpose")
    protected String travelPurpose;

    /**
     * Gets the value of the otherSrvcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSrvcName() {
        return otherSrvcName;
    }

    /**
     * Sets the value of the otherSrvcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSrvcName(String value) {
        this.otherSrvcName = value;
    }

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorPref }
     * 
     * 
     */
    public List<VendorPref> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<VendorPref>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPref }
     * 
     * 
     */
    public List<LoyaltyPref> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPref>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPref }
     * 
     * 
     */
    public List<PaymentFormPref> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPref>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the specRequestPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specRequestPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecRequestPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecRequestPref }
     * 
     * 
     */
    public List<SpecRequestPref> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPref>();
        }
        return this.specRequestPref;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link OtherSrvcPrefPreferLevel }
     *     
     */
    public OtherSrvcPrefPreferLevel getPreferLevel() {
        if (preferLevel == null) {
            return OtherSrvcPrefPreferLevel.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherSrvcPrefPreferLevel }
     *     
     */
    public void setPreferLevel(OtherSrvcPrefPreferLevel value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link OtherSrvcPrefShareSynchInd }
     *     
     */
    public OtherSrvcPrefShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherSrvcPrefShareSynchInd }
     *     
     */
    public void setShareSynchInd(OtherSrvcPrefShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link OtherSrvcPrefShareMarketInd }
     *     
     */
    public OtherSrvcPrefShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherSrvcPrefShareMarketInd }
     *     
     */
    public void setShareMarketInd(OtherSrvcPrefShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the travelPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPurpose() {
        return travelPurpose;
    }

    /**
     * Sets the value of the travelPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelPurpose(String value) {
        this.travelPurpose = value;
    }

}
