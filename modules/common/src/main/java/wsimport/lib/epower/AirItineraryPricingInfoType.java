
package wsimport.lib.epower;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirItineraryPricingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItineraryPricingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItinTotalFare" type="{http://epowerv5.amadeus.com.tr/WS}FareType" minOccurs="0"/>
 *         &lt;element name="MinCCOBFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxCCOBFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCOBFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PTC_FareBreakdowns" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPTCFareBreakdownType" minOccurs="0"/>
 *         &lt;element name="FareInfos" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfAirItineraryPricingInfoTypeFareInfo" minOccurs="0"/>
 *         &lt;element name="ServiceFees" type="{http://epowerv5.amadeus.com.tr/WS}ServiceFeesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ITIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PricingSource" type="{http://epowerv5.amadeus.com.tr/WS}PricingSourceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryPricingInfoType", propOrder = {
    "itinTotalFare",
    "minCCOBFee",
    "maxCCOBFee",
    "ccobFee",
    "ptcFareBreakdowns",
    "fareInfos",
    "serviceFees"
})
@XmlSeeAlso({
    BookingPriceInfoType.class
})
public class AirItineraryPricingInfoType {

    @XmlElement(name = "ItinTotalFare")
    protected FareType itinTotalFare;
    @XmlElement(name = "MinCCOBFee")
    protected BigDecimal minCCOBFee;
    @XmlElement(name = "MaxCCOBFee")
    protected BigDecimal maxCCOBFee;
    @XmlElement(name = "CCOBFee")
    protected BigDecimal ccobFee;
    @XmlElement(name = "PTC_FareBreakdowns")
    protected ArrayOfPTCFareBreakdownType ptcFareBreakdowns;
    @XmlElement(name = "FareInfos")
    protected ArrayOfAirItineraryPricingInfoTypeFareInfo fareInfos;
    @XmlElement(name = "ServiceFees")
    protected ServiceFeesType serviceFees;
    @XmlAttribute(name = "ITIndex")
    protected Integer itIndex;
    @XmlAttribute(name = "PricingSource")
    protected PricingSourceType pricingSource;

    /**
     * Gets the value of the itinTotalFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getItinTotalFare() {
        return itinTotalFare;
    }

    /**
     * Sets the value of the itinTotalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setItinTotalFare(FareType value) {
        this.itinTotalFare = value;
    }

    /**
     * Gets the value of the minCCOBFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinCCOBFee() {
        return minCCOBFee;
    }

    /**
     * Sets the value of the minCCOBFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinCCOBFee(BigDecimal value) {
        this.minCCOBFee = value;
    }

    /**
     * Gets the value of the maxCCOBFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxCCOBFee() {
        return maxCCOBFee;
    }

    /**
     * Sets the value of the maxCCOBFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxCCOBFee(BigDecimal value) {
        this.maxCCOBFee = value;
    }

    /**
     * Gets the value of the ccobFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCOBFee() {
        return ccobFee;
    }

    /**
     * Sets the value of the ccobFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCOBFee(BigDecimal value) {
        this.ccobFee = value;
    }

    /**
     * Gets the value of the ptcFareBreakdowns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPTCFareBreakdownType }
     *     
     */
    public ArrayOfPTCFareBreakdownType getPTCFareBreakdowns() {
        return ptcFareBreakdowns;
    }

    /**
     * Sets the value of the ptcFareBreakdowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPTCFareBreakdownType }
     *     
     */
    public void setPTCFareBreakdowns(ArrayOfPTCFareBreakdownType value) {
        this.ptcFareBreakdowns = value;
    }

    /**
     * Gets the value of the fareInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirItineraryPricingInfoTypeFareInfo }
     *     
     */
    public ArrayOfAirItineraryPricingInfoTypeFareInfo getFareInfos() {
        return fareInfos;
    }

    /**
     * Sets the value of the fareInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirItineraryPricingInfoTypeFareInfo }
     *     
     */
    public void setFareInfos(ArrayOfAirItineraryPricingInfoTypeFareInfo value) {
        this.fareInfos = value;
    }

    /**
     * Gets the value of the serviceFees property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeesType }
     *     
     */
    public ServiceFeesType getServiceFees() {
        return serviceFees;
    }

    /**
     * Sets the value of the serviceFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeesType }
     *     
     */
    public void setServiceFees(ServiceFeesType value) {
        this.serviceFees = value;
    }

    /**
     * Gets the value of the itIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getITIndex() {
        return itIndex;
    }

    /**
     * Sets the value of the itIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setITIndex(Integer value) {
        this.itIndex = value;
    }

    /**
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link PricingSourceType }
     *     
     */
    public PricingSourceType getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSourceType }
     *     
     */
    public void setPricingSource(PricingSourceType value) {
        this.pricingSource = value;
    }

}
