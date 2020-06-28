
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Agreements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Agreements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Certification" type="{http://traveltalk.com/wsHotelAvail}Certification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllianceConsortium" type="{http://traveltalk.com/wsHotelAvail}AllianceConsortium" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommissionInfo" type="{http://traveltalk.com/wsHotelAvail}CommissionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}AgreementsShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}AgreementsShareMarketInd" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agreements", propOrder = {
    "certification",
    "allianceConsortium",
    "commissionInfo"
})
public class Agreements {

    @XmlElement(name = "Certification")
    protected List<Certification> certification;
    @XmlElement(name = "AllianceConsortium")
    protected List<AllianceConsortium> allianceConsortium;
    @XmlElement(name = "CommissionInfo")
    protected List<CommissionInfo> commissionInfo;
    @XmlAttribute(name = "ShareSynchInd")
    protected AgreementsShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected AgreementsShareMarketInd shareMarketInd;

    /**
     * Gets the value of the certification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Certification }
     * 
     * 
     */
    public List<Certification> getCertification() {
        if (certification == null) {
            certification = new ArrayList<Certification>();
        }
        return this.certification;
    }

    /**
     * Gets the value of the allianceConsortium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allianceConsortium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllianceConsortium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllianceConsortium }
     * 
     * 
     */
    public List<AllianceConsortium> getAllianceConsortium() {
        if (allianceConsortium == null) {
            allianceConsortium = new ArrayList<AllianceConsortium>();
        }
        return this.allianceConsortium;
    }

    /**
     * Gets the value of the commissionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionInfo }
     * 
     * 
     */
    public List<CommissionInfo> getCommissionInfo() {
        if (commissionInfo == null) {
            commissionInfo = new ArrayList<CommissionInfo>();
        }
        return this.commissionInfo;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementsShareSynchInd }
     *     
     */
    public AgreementsShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementsShareSynchInd }
     *     
     */
    public void setShareSynchInd(AgreementsShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementsShareMarketInd }
     *     
     */
    public AgreementsShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementsShareMarketInd }
     *     
     */
    public void setShareMarketInd(AgreementsShareMarketInd value) {
        this.shareMarketInd = value;
    }

}
