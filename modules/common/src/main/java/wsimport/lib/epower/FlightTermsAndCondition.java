
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightTermsAndCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightTermsAndCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuleInfo" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfRuleInfos" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightTermsAndCondition", propOrder = {
    "ruleInfo"
})
public class FlightTermsAndCondition {

    @XmlElement(name = "RuleInfo")
    protected ArrayOfRuleInfos ruleInfo;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "AirlineCode")
    protected String airlineCode;
    @XmlAttribute(name = "AirlineName")
    protected String airlineName;
    @XmlAttribute(name = "FareBasisCode")
    protected String fareBasisCode;

    /**
     * Gets the value of the ruleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuleInfos }
     *     
     */
    public ArrayOfRuleInfos getRuleInfo() {
        return ruleInfo;
    }

    /**
     * Sets the value of the ruleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuleInfos }
     *     
     */
    public void setRuleInfo(ArrayOfRuleInfos value) {
        this.ruleInfo = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the airlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * Sets the value of the airlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineName(String value) {
        this.airlineName = value;
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

}
