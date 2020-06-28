
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareRuleResponseInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRuleResponseInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareRuleInfo" type="{http://epowerv5.amadeus.com.tr/WS}FareRuleResponseInfoTypeFareRuleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareRules" type="{http://epowerv5.amadeus.com.tr/WS}FormattedTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Routing" type="{http://epowerv5.amadeus.com.tr/WS}FareRuleResponseInfoTypeRouting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdvisoryInfo" type="{http://epowerv5.amadeus.com.tr/WS}FareRuleResponseInfoTypeAdvisoryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ItineraryIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRuleResponseInfoType", propOrder = {
    "fareRuleInfo",
    "fareRules",
    "routing",
    "advisoryInfo"
})
public class FareRuleResponseInfoType {

    @XmlElement(name = "FareRuleInfo")
    protected List<FareRuleResponseInfoTypeFareRuleInfo> fareRuleInfo;
    @XmlElement(name = "FareRules")
    protected List<FormattedTextType> fareRules;
    @XmlElement(name = "Routing")
    protected List<FareRuleResponseInfoTypeRouting> routing;
    @XmlElement(name = "AdvisoryInfo")
    protected List<FareRuleResponseInfoTypeAdvisoryInfo> advisoryInfo;
    @XmlAttribute(name = "ItineraryIndex")
    protected Integer itineraryIndex;

    /**
     * Gets the value of the fareRuleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRuleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleResponseInfoTypeFareRuleInfo }
     * 
     * 
     */
    public List<FareRuleResponseInfoTypeFareRuleInfo> getFareRuleInfo() {
        if (fareRuleInfo == null) {
            fareRuleInfo = new ArrayList<FareRuleResponseInfoTypeFareRuleInfo>();
        }
        return this.fareRuleInfo;
    }

    /**
     * Gets the value of the fareRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextType }
     * 
     * 
     */
    public List<FormattedTextType> getFareRules() {
        if (fareRules == null) {
            fareRules = new ArrayList<FormattedTextType>();
        }
        return this.fareRules;
    }

    /**
     * Gets the value of the routing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleResponseInfoTypeRouting }
     * 
     * 
     */
    public List<FareRuleResponseInfoTypeRouting> getRouting() {
        if (routing == null) {
            routing = new ArrayList<FareRuleResponseInfoTypeRouting>();
        }
        return this.routing;
    }

    /**
     * Gets the value of the advisoryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advisoryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvisoryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleResponseInfoTypeAdvisoryInfo }
     * 
     * 
     */
    public List<FareRuleResponseInfoTypeAdvisoryInfo> getAdvisoryInfo() {
        if (advisoryInfo == null) {
            advisoryInfo = new ArrayList<FareRuleResponseInfoTypeAdvisoryInfo>();
        }
        return this.advisoryInfo;
    }

    /**
     * Gets the value of the itineraryIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItineraryIndex() {
        return itineraryIndex;
    }

    /**
     * Sets the value of the itineraryIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItineraryIndex(Integer value) {
        this.itineraryIndex = value;
    }

}
