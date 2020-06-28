
package wsimport.lib.epower;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareRuleResponseInfoTypeRouting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRuleResponseInfoTypeRouting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Info" type="{http://epowerv5.amadeus.com.tr/WS}FareRuleResponseInfoTypeRoutingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RoutingConstructedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MaximumPermittedMileage" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RoutingRestriction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRuleResponseInfoTypeRouting", propOrder = {
    "info"
})
public class FareRuleResponseInfoTypeRouting {

    @XmlElement(name = "Info")
    protected List<FareRuleResponseInfoTypeRoutingInfo> info;
    @XmlAttribute(name = "Number")
    protected BigInteger number;
    @XmlAttribute(name = "RoutingConstructedInd")
    protected Boolean routingConstructedInd;
    @XmlAttribute(name = "MaximumPermittedMileage")
    protected BigInteger maximumPermittedMileage;
    @XmlAttribute(name = "RoutingRestriction")
    protected String routingRestriction;

    /**
     * Gets the value of the info property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleResponseInfoTypeRoutingInfo }
     * 
     * 
     */
    public List<FareRuleResponseInfoTypeRoutingInfo> getInfo() {
        if (info == null) {
            info = new ArrayList<FareRuleResponseInfoTypeRoutingInfo>();
        }
        return this.info;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the routingConstructedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutingConstructedInd() {
        return routingConstructedInd;
    }

    /**
     * Sets the value of the routingConstructedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutingConstructedInd(Boolean value) {
        this.routingConstructedInd = value;
    }

    /**
     * Gets the value of the maximumPermittedMileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPermittedMileage() {
        return maximumPermittedMileage;
    }

    /**
     * Sets the value of the maximumPermittedMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPermittedMileage(BigInteger value) {
        this.maximumPermittedMileage = value;
    }

    /**
     * Gets the value of the routingRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingRestriction() {
        return routingRestriction;
    }

    /**
     * Sets the value of the routingRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingRestriction(String value) {
        this.routingRestriction = value;
    }

}
