
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginDestinationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}TravelDateTimeType">
 *       &lt;sequence>
 *         &lt;element name="OriginLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>LocationType">
 *                 &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DestinationLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>LocationType">
 *                 &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginLocationList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOriginDestinationInformationTypeOriginLocation" minOccurs="0"/>
 *         &lt;element name="DestinationLocationList" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfOriginDestinationInformationTypeDestinationLocation" minOccurs="0"/>
 *         &lt;element name="ConnectionLocations" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfConnectionTypeConnectionLocation" minOccurs="0"/>
 *         &lt;element name="RadiusInformation" type="{http://epowerv5.amadeus.com.tr/WS}RadiusItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationInformationType", propOrder = {
    "originLocation",
    "destinationLocation",
    "originLocationList",
    "destinationLocationList",
    "connectionLocations",
    "radiusInformation"
})
@XmlSeeAlso({
    wsimport.lib.epower.SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation.class,
    wsimport.lib.epower.SearchFlightCalendar.OTAAirLowFareSearchRQ.OriginDestinationInformation.class
})
public class OriginDestinationInformationType
    extends TravelDateTimeType
{

    @XmlElement(name = "OriginLocation")
    protected OriginDestinationInformationType.OriginLocation originLocation;
    @XmlElement(name = "DestinationLocation")
    protected OriginDestinationInformationType.DestinationLocation destinationLocation;
    @XmlElement(name = "OriginLocationList")
    protected ArrayOfOriginDestinationInformationTypeOriginLocation originLocationList;
    @XmlElement(name = "DestinationLocationList")
    protected ArrayOfOriginDestinationInformationTypeDestinationLocation destinationLocationList;
    @XmlElement(name = "ConnectionLocations")
    protected ArrayOfConnectionTypeConnectionLocation connectionLocations;
    @XmlElement(name = "RadiusInformation")
    protected RadiusItem radiusInformation;

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationInformationType.OriginLocation }
     *     
     */
    public OriginDestinationInformationType.OriginLocation getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationInformationType.OriginLocation }
     *     
     */
    public void setOriginLocation(OriginDestinationInformationType.OriginLocation value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationInformationType.DestinationLocation }
     *     
     */
    public OriginDestinationInformationType.DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationInformationType.DestinationLocation }
     *     
     */
    public void setDestinationLocation(OriginDestinationInformationType.DestinationLocation value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the originLocationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOriginDestinationInformationTypeOriginLocation }
     *     
     */
    public ArrayOfOriginDestinationInformationTypeOriginLocation getOriginLocationList() {
        return originLocationList;
    }

    /**
     * Sets the value of the originLocationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOriginDestinationInformationTypeOriginLocation }
     *     
     */
    public void setOriginLocationList(ArrayOfOriginDestinationInformationTypeOriginLocation value) {
        this.originLocationList = value;
    }

    /**
     * Gets the value of the destinationLocationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOriginDestinationInformationTypeDestinationLocation }
     *     
     */
    public ArrayOfOriginDestinationInformationTypeDestinationLocation getDestinationLocationList() {
        return destinationLocationList;
    }

    /**
     * Sets the value of the destinationLocationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOriginDestinationInformationTypeDestinationLocation }
     *     
     */
    public void setDestinationLocationList(ArrayOfOriginDestinationInformationTypeDestinationLocation value) {
        this.destinationLocationList = value;
    }

    /**
     * Gets the value of the connectionLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConnectionTypeConnectionLocation }
     *     
     */
    public ArrayOfConnectionTypeConnectionLocation getConnectionLocations() {
        return connectionLocations;
    }

    /**
     * Sets the value of the connectionLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConnectionTypeConnectionLocation }
     *     
     */
    public void setConnectionLocations(ArrayOfConnectionTypeConnectionLocation value) {
        this.connectionLocations = value;
    }

    /**
     * Gets the value of the radiusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RadiusItem }
     *     
     */
    public RadiusItem getRadiusInformation() {
        return radiusInformation;
    }

    /**
     * Sets the value of the radiusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadiusItem }
     *     
     */
    public void setRadiusInformation(RadiusItem value) {
        this.radiusInformation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>LocationType">
     *       &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DestinationLocation
        extends LocationType
    {

        @XmlAttribute(name = "MultiAirportCityInd")
        protected Boolean multiAirportCityInd;
        @XmlAttribute(name = "AlternateLocationInd")
        protected Boolean alternateLocationInd;

        /**
         * Gets the value of the multiAirportCityInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMultiAirportCityInd() {
            return multiAirportCityInd;
        }

        /**
         * Sets the value of the multiAirportCityInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMultiAirportCityInd(Boolean value) {
            this.multiAirportCityInd = value;
        }

        /**
         * Gets the value of the alternateLocationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlternateLocationInd() {
            return alternateLocationInd;
        }

        /**
         * Sets the value of the alternateLocationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlternateLocationInd(Boolean value) {
            this.alternateLocationInd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>LocationType">
     *       &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginLocation
        extends LocationType
    {

        @XmlAttribute(name = "MultiAirportCityInd")
        protected Boolean multiAirportCityInd;
        @XmlAttribute(name = "AlternateLocationInd")
        protected Boolean alternateLocationInd;

        /**
         * Gets the value of the multiAirportCityInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMultiAirportCityInd() {
            return multiAirportCityInd;
        }

        /**
         * Sets the value of the multiAirportCityInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMultiAirportCityInd(Boolean value) {
            this.multiAirportCityInd = value;
        }

        /**
         * Gets the value of the alternateLocationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlternateLocationInd() {
            return alternateLocationInd;
        }

        /**
         * Sets the value of the alternateLocationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlternateLocationInd(Boolean value) {
            this.alternateLocationInd = value;
        }

    }

}
