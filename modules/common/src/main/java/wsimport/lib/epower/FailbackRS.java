
package wsimport.lib.epower;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailbackRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailbackRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewPrice" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
 *         &lt;element name="FreeBaggageAllowance" type="{http://epowerv5.amadeus.com.tr/WS}FreeBaggageAllowancesTypes" minOccurs="0"/>
 *         &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BookFlightSegmentType">
 *                 &lt;sequence>
 *                   &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FailbackIndicator" type="{http://epowerv5.amadeus.com.tr/WS}FailbackIndicator" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailbackRS", propOrder = {
    "newPrice",
    "freeBaggageAllowance",
    "flightSegment",
    "failbackIndicator"
})
public class FailbackRS {

    @XmlElement(name = "NewPrice")
    protected AirItineraryPricingInfoType newPrice;
    @XmlElement(name = "FreeBaggageAllowance")
    protected FreeBaggageAllowancesTypes freeBaggageAllowance;
    @XmlElement(name = "FlightSegment")
    protected List<FailbackRS.FlightSegment> flightSegment;
    @XmlElement(name = "FailbackIndicator")
    protected List<FailbackIndicator> failbackIndicator;

    /**
     * Gets the value of the newPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType }
     *     
     */
    public AirItineraryPricingInfoType getNewPrice() {
        return newPrice;
    }

    /**
     * Sets the value of the newPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType }
     *     
     */
    public void setNewPrice(AirItineraryPricingInfoType value) {
        this.newPrice = value;
    }

    /**
     * Gets the value of the freeBaggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link FreeBaggageAllowancesTypes }
     *     
     */
    public FreeBaggageAllowancesTypes getFreeBaggageAllowance() {
        return freeBaggageAllowance;
    }

    /**
     * Sets the value of the freeBaggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeBaggageAllowancesTypes }
     *     
     */
    public void setFreeBaggageAllowance(FreeBaggageAllowancesTypes value) {
        this.freeBaggageAllowance = value;
    }

    /**
     * Gets the value of the flightSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailbackRS.FlightSegment }
     * 
     * 
     */
    public List<FailbackRS.FlightSegment> getFlightSegment() {
        if (flightSegment == null) {
            flightSegment = new ArrayList<FailbackRS.FlightSegment>();
        }
        return this.flightSegment;
    }

    /**
     * Gets the value of the failbackIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failbackIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailbackIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailbackIndicator }
     * 
     * 
     */
    public List<FailbackIndicator> getFailbackIndicator() {
        if (failbackIndicator == null) {
            failbackIndicator = new ArrayList<FailbackIndicator>();
        }
        return this.failbackIndicator;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BookFlightSegmentType">
     *       &lt;sequence>
     *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpaExtensions"
    })
    public static class FlightSegment
        extends BookFlightSegmentType
    {

        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;

        /**
         * Gets the value of the tpaExtensions property.
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * Sets the value of the tpaExtensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

    }

}
