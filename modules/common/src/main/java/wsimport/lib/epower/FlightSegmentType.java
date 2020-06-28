
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}FlightSegmentBaseType">
 *       &lt;sequence>
 *         &lt;element name="MarketingAirline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>CompanyNameType">
 *                 &lt;attribute name="SingleVendorInd">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="SingleVndr"/>
 *                       &lt;enumeration value="Alliance"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Baggages" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfFreeBaggageSegmentItem" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TourOperatorFlightID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentType", propOrder = {
    "marketingAirline",
    "baggages"
})
@XmlSeeAlso({
    OTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo.class,
    OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment.class,
    BookFlightSegmentType.class
})
public class FlightSegmentType
    extends FlightSegmentBaseType
{

    @XmlElement(name = "MarketingAirline")
    protected FlightSegmentType.MarketingAirline marketingAirline;
    @XmlElement(name = "Baggages")
    protected ArrayOfFreeBaggageSegmentItem baggages;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "TourOperatorFlightID")
    protected String tourOperatorFlightID;

    /**
     * Gets the value of the marketingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentType.MarketingAirline }
     *     
     */
    public FlightSegmentType.MarketingAirline getMarketingAirline() {
        return marketingAirline;
    }

    /**
     * Sets the value of the marketingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentType.MarketingAirline }
     *     
     */
    public void setMarketingAirline(FlightSegmentType.MarketingAirline value) {
        this.marketingAirline = value;
    }

    /**
     * Gets the value of the baggages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFreeBaggageSegmentItem }
     *     
     */
    public ArrayOfFreeBaggageSegmentItem getBaggages() {
        return baggages;
    }

    /**
     * Sets the value of the baggages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFreeBaggageSegmentItem }
     *     
     */
    public void setBaggages(ArrayOfFreeBaggageSegmentItem value) {
        this.baggages = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the tourOperatorFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    /**
     * Sets the value of the tourOperatorFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorFlightID(String value) {
        this.tourOperatorFlightID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>CompanyNameType">
     *       &lt;attribute name="SingleVendorInd">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="SingleVndr"/>
     *             &lt;enumeration value="Alliance"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MarketingAirline
        extends CompanyNameType
    {

        @XmlAttribute(name = "SingleVendorInd")
        protected String singleVendorInd;

        /**
         * Gets the value of the singleVendorInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * Sets the value of the singleVendorInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleVendorInd(String value) {
            this.singleVendorInd = value;
        }

    }

}
