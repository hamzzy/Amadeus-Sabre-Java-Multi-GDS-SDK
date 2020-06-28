
package wsimport.lib.amadeus.wshotelavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrefCollections complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrefCollections">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrefCollection" type="{http://traveltalk.com/wsHotelAvail}PrefCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsHotelAvail}PrefCollectionsShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsHotelAvail}PrefCollectionsShareMarketInd" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefCollections", propOrder = {
    "prefCollection"
})
public class PrefCollections {

    @XmlElement(name = "PrefCollection")
    protected List<PrefCollection> prefCollection;
    @XmlAttribute(name = "ShareSynchInd")
    protected PrefCollectionsShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected PrefCollectionsShareMarketInd shareMarketInd;

    /**
     * Gets the value of the prefCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefCollection }
     * 
     * 
     */
    public List<PrefCollection> getPrefCollection() {
        if (prefCollection == null) {
            prefCollection = new ArrayList<PrefCollection>();
        }
        return this.prefCollection;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link PrefCollectionsShareSynchInd }
     *     
     */
    public PrefCollectionsShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefCollectionsShareSynchInd }
     *     
     */
    public void setShareSynchInd(PrefCollectionsShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link PrefCollectionsShareMarketInd }
     *     
     */
    public PrefCollectionsShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefCollectionsShareMarketInd }
     *     
     */
    public void setShareMarketInd(PrefCollectionsShareMarketInd value) {
        this.shareMarketInd = value;
    }

}
