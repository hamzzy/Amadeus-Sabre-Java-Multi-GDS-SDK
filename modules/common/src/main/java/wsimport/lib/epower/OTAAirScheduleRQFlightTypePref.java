
package wsimport.lib.epower;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_AirScheduleRQFlightTypePref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTA_AirScheduleRQFlightTypePref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FlightType" type="{http://epowerv5.amadeus.com.tr/WS}FlightTypeType" />
 *       &lt;attribute name="MaxConnections" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="NonScheduledFltInfo" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRQFlightTypePrefNonScheduledFltInfo" />
 *       &lt;attribute name="BackhaulIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GroundTransportIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DirectAndNonStopOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NonStopsOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OnlineConnectionsOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RoutingType" type="{http://epowerv5.amadeus.com.tr/WS}OTA_AirScheduleRQFlightTypePrefRoutingType" />
 *       &lt;attribute name="ExcludeTrainInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_AirScheduleRQFlightTypePref")
public class OTAAirScheduleRQFlightTypePref {

    @XmlAttribute(name = "FlightType")
    protected FlightTypeType flightType;
    @XmlAttribute(name = "MaxConnections")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxConnections;
    @XmlAttribute(name = "NonScheduledFltInfo")
    protected OTAAirScheduleRQFlightTypePrefNonScheduledFltInfo nonScheduledFltInfo;
    @XmlAttribute(name = "BackhaulIndicator")
    protected Boolean backhaulIndicator;
    @XmlAttribute(name = "GroundTransportIndicator")
    protected Boolean groundTransportIndicator;
    @XmlAttribute(name = "DirectAndNonStopOnlyInd")
    protected Boolean directAndNonStopOnlyInd;
    @XmlAttribute(name = "NonStopsOnlyInd")
    protected Boolean nonStopsOnlyInd;
    @XmlAttribute(name = "OnlineConnectionsOnlyInd")
    protected Boolean onlineConnectionsOnlyInd;
    @XmlAttribute(name = "RoutingType")
    protected OTAAirScheduleRQFlightTypePrefRoutingType routingType;
    @XmlAttribute(name = "ExcludeTrainInd")
    protected Boolean excludeTrainInd;

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTypeType }
     *     
     */
    public FlightTypeType getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTypeType }
     *     
     */
    public void setFlightType(FlightTypeType value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the maxConnections property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxConnections() {
        return maxConnections;
    }

    /**
     * Sets the value of the maxConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxConnections(BigInteger value) {
        this.maxConnections = value;
    }

    /**
     * Gets the value of the nonScheduledFltInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirScheduleRQFlightTypePrefNonScheduledFltInfo }
     *     
     */
    public OTAAirScheduleRQFlightTypePrefNonScheduledFltInfo getNonScheduledFltInfo() {
        return nonScheduledFltInfo;
    }

    /**
     * Sets the value of the nonScheduledFltInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirScheduleRQFlightTypePrefNonScheduledFltInfo }
     *     
     */
    public void setNonScheduledFltInfo(OTAAirScheduleRQFlightTypePrefNonScheduledFltInfo value) {
        this.nonScheduledFltInfo = value;
    }

    /**
     * Gets the value of the backhaulIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackhaulIndicator() {
        return backhaulIndicator;
    }

    /**
     * Sets the value of the backhaulIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackhaulIndicator(Boolean value) {
        this.backhaulIndicator = value;
    }

    /**
     * Gets the value of the groundTransportIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroundTransportIndicator() {
        return groundTransportIndicator;
    }

    /**
     * Sets the value of the groundTransportIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroundTransportIndicator(Boolean value) {
        this.groundTransportIndicator = value;
    }

    /**
     * Gets the value of the directAndNonStopOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectAndNonStopOnlyInd() {
        return directAndNonStopOnlyInd;
    }

    /**
     * Sets the value of the directAndNonStopOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectAndNonStopOnlyInd(Boolean value) {
        this.directAndNonStopOnlyInd = value;
    }

    /**
     * Gets the value of the nonStopsOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonStopsOnlyInd() {
        return nonStopsOnlyInd;
    }

    /**
     * Sets the value of the nonStopsOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonStopsOnlyInd(Boolean value) {
        this.nonStopsOnlyInd = value;
    }

    /**
     * Gets the value of the onlineConnectionsOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlineConnectionsOnlyInd() {
        return onlineConnectionsOnlyInd;
    }

    /**
     * Sets the value of the onlineConnectionsOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlineConnectionsOnlyInd(Boolean value) {
        this.onlineConnectionsOnlyInd = value;
    }

    /**
     * Gets the value of the routingType property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirScheduleRQFlightTypePrefRoutingType }
     *     
     */
    public OTAAirScheduleRQFlightTypePrefRoutingType getRoutingType() {
        return routingType;
    }

    /**
     * Sets the value of the routingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirScheduleRQFlightTypePrefRoutingType }
     *     
     */
    public void setRoutingType(OTAAirScheduleRQFlightTypePrefRoutingType value) {
        this.routingType = value;
    }

    /**
     * Gets the value of the excludeTrainInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeTrainInd() {
        return excludeTrainInd;
    }

    /**
     * Sets the value of the excludeTrainInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeTrainInd(Boolean value) {
        this.excludeTrainInd = value;
    }

}
