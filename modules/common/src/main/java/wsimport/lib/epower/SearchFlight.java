
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OTA_AirLowFareSearchRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
 *                   &lt;element name="ProcessingInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="TargetSource">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Core"/>
 *                                 &lt;enumeration value="Vendor"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="FlightSvcInfoIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="DisplayOrder" type="{http://epowerv5.amadeus.com.tr/WS}DisplayOrderType" />
 *                           &lt;attribute name="ReducedDataIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="BaseFaresOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="SearchType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Normal"/>
 *                                 &lt;enumeration value="Window"/>
 *                                 &lt;enumeration value="ArrivalTime"/>
 *                                 &lt;enumeration value="PowerFlight"/>
 *                                 &lt;enumeration value="AvailableOnly"/>
 *                                 &lt;enumeration value="WaitlistOnly"/>
 *                                 &lt;enumeration value="AvailableAndWaitlist"/>
 *                                 &lt;enumeration value="FreighterFlights"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="AvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OriginDestinationInformation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}OriginDestinationInformationType">
 *                           &lt;sequence>
 *                             &lt;element name="AlternateLocationInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="OriginLocation">
 *                                       &lt;simpleType>
 *                                         &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="DestinationLocation">
 *                                       &lt;simpleType>
 *                                         &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RefNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SpecificFlightInfo" type="{http://epowerv5.amadeus.com.tr/WS}SpecificFlightInfoType" minOccurs="0"/>
 *                   &lt;element name="TravelPreferences" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirSearchPrefsType">
 *                           &lt;attribute name="FlexDatePref">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Outbound"/>
 *                                 &lt;enumeration value="Return"/>
 *                                 &lt;enumeration value="Both"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="FlexWeekendIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="FlexLevelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="NoFareBreakIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="OriginDestinationRPHs">
 *                             &lt;simpleType>
 *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TravelerInfoSummary" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoSummaryType">
 *                           &lt;attribute name="ForcePTC" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="FamilyCard" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="FamilyType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="FamilyDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="TicketingCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SpecificPTC_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AdvanceSearchInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumberOfRecommendation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="MaxEFTPercentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="MaxLayoverPerConnection" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Hour" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="Minute" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AirlineDiversity" type="{http://epowerv5.amadeus.com.tr/WS}AirlineDiversityType" minOccurs="0"/>
 *                             &lt;element name="IgnoreAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExpandedParameters" type="{http://epowerv5.amadeus.com.tr/WS}ExpandedParametersType" minOccurs="0"/>
 *                             &lt;element name="ReturnMoreOvernightFlights" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="DuplicatedRecommedationsBehavior" type="{http://epowerv5.amadeus.com.tr/WS}DuplicatedRecommedationsBehaviorEnum" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MetaLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RefundableType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}RefundableTypesEnum" />
 *                 &lt;attribute name="MaxPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ProviderType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}SearchTypeByProviderEnum" />
 *                 &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Target" default="Production">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Test"/>
 *                       &lt;enumeration value="Production"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="TransactionStatusCode">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Start"/>
 *                       &lt;enumeration value="End"/>
 *                       &lt;enumeration value="Rollback"/>
 *                       &lt;enumeration value="InSeries"/>
 *                       &lt;enumeration value="Continuation"/>
 *                       &lt;enumeration value="Subsequent"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="DirectFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="AvailableFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ForMetaBook" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "otaAirLowFareSearchRQ"
})
@XmlRootElement(name = "SearchFlight")
public class SearchFlight {

    @XmlElement(name = "OTA_AirLowFareSearchRQ")
    protected SearchFlight.OTAAirLowFareSearchRQ otaAirLowFareSearchRQ;


    @XmlTransient
    protected String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Gets the value of the otaAirLowFareSearchRQ property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFlight.OTAAirLowFareSearchRQ }
     *     
     */
    public SearchFlight.OTAAirLowFareSearchRQ getOTAAirLowFareSearchRQ() {
        return otaAirLowFareSearchRQ;
    }

    /**
     * Sets the value of the otaAirLowFareSearchRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFlight.OTAAirLowFareSearchRQ }
     *     
     */
    public void setOTAAirLowFareSearchRQ(SearchFlight.OTAAirLowFareSearchRQ value) {
        this.otaAirLowFareSearchRQ = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
     *         &lt;element name="ProcessingInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="TargetSource">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Core"/>
     *                       &lt;enumeration value="Vendor"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="FlightSvcInfoIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="DisplayOrder" type="{http://epowerv5.amadeus.com.tr/WS}DisplayOrderType" />
     *                 &lt;attribute name="ReducedDataIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="BaseFaresOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="SearchType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Normal"/>
     *                       &lt;enumeration value="Window"/>
     *                       &lt;enumeration value="ArrivalTime"/>
     *                       &lt;enumeration value="PowerFlight"/>
     *                       &lt;enumeration value="AvailableOnly"/>
     *                       &lt;enumeration value="WaitlistOnly"/>
     *                       &lt;enumeration value="AvailableAndWaitlist"/>
     *                       &lt;enumeration value="FreighterFlights"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="AvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OriginDestinationInformation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}OriginDestinationInformationType">
     *                 &lt;sequence>
     *                   &lt;element name="AlternateLocationInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="OriginLocation">
     *                             &lt;simpleType>
     *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="DestinationLocation">
     *                             &lt;simpleType>
     *                               &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RefNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SpecificFlightInfo" type="{http://epowerv5.amadeus.com.tr/WS}SpecificFlightInfoType" minOccurs="0"/>
     *         &lt;element name="TravelPreferences" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirSearchPrefsType">
     *                 &lt;attribute name="FlexDatePref">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Outbound"/>
     *                       &lt;enumeration value="Return"/>
     *                       &lt;enumeration value="Both"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="FlexWeekendIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="FlexLevelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="NoFareBreakIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="OriginDestinationRPHs">
     *                   &lt;simpleType>
     *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TravelerInfoSummary" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoSummaryType">
     *                 &lt;attribute name="ForcePTC" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="FamilyCard" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="FamilyType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="FamilyDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="TicketingCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SpecificPTC_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AdvanceSearchInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NumberOfRecommendation" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="MaxEFTPercentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="MaxLayoverPerConnection" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Hour" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Minute" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AirlineDiversity" type="{http://epowerv5.amadeus.com.tr/WS}AirlineDiversityType" minOccurs="0"/>
     *                   &lt;element name="IgnoreAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExpandedParameters" type="{http://epowerv5.amadeus.com.tr/WS}ExpandedParametersType" minOccurs="0"/>
     *                   &lt;element name="ReturnMoreOvernightFlights" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="DuplicatedRecommedationsBehavior" type="{http://epowerv5.amadeus.com.tr/WS}DuplicatedRecommedationsBehaviorEnum" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MetaLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RefundableType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}RefundableTypesEnum" />
     *       &lt;attribute name="MaxPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="ProviderType" use="required" type="{http://epowerv5.amadeus.com.tr/WS}SearchTypeByProviderEnum" />
     *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Target" default="Production">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Test"/>
     *             &lt;enumeration value="Production"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="TransactionStatusCode">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Start"/>
     *             &lt;enumeration value="End"/>
     *             &lt;enumeration value="Rollback"/>
     *             &lt;enumeration value="InSeries"/>
     *             &lt;enumeration value="Continuation"/>
     *             &lt;enumeration value="Subsequent"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="DirectFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="AvailableFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ForMetaBook" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pos",
        "processingInfo",
        "originDestinationInformation",
        "specificFlightInfo",
        "travelPreferences",
        "travelerInfoSummary",
        "advanceSearchInfo",
        "metaLink"
    })
    public static class OTAAirLowFareSearchRQ {

        @XmlElement(name = "POS")
        protected ArrayOfSourceType pos;
        @XmlElement(name = "ProcessingInfo")
        protected SearchFlight.OTAAirLowFareSearchRQ.ProcessingInfo processingInfo;
        @XmlElement(name = "OriginDestinationInformation")
        protected List<SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation> originDestinationInformation;
        @XmlElement(name = "SpecificFlightInfo")
        protected SpecificFlightInfoType specificFlightInfo;
        @XmlElement(name = "TravelPreferences")
        protected List<SearchFlight.OTAAirLowFareSearchRQ.TravelPreferences> travelPreferences;
        @XmlElement(name = "TravelerInfoSummary")
        protected SearchFlight.OTAAirLowFareSearchRQ.TravelerInfoSummary travelerInfoSummary;
        @XmlElement(name = "AdvanceSearchInfo")
        protected SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo advanceSearchInfo;
        @XmlElement(name = "MetaLink")
        protected String metaLink;
        @XmlAttribute(name = "RefundableType", required = true)
        protected RefundableTypesEnum refundableType;
        @XmlAttribute(name = "MaxPrice", required = true)
        protected BigDecimal maxPrice;
        @XmlAttribute(name = "ProviderType", required = true)
        protected SearchTypeByProviderEnum providerType;
        @XmlAttribute(name = "EchoToken")
        protected String echoToken;
        @XmlAttribute(name = "TimeStamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timeStamp;
        @XmlAttribute(name = "Target")
        protected String target;
        @XmlAttribute(name = "Version", required = true)
        protected BigDecimal version;
        @XmlAttribute(name = "TransactionIdentifier")
        protected String transactionIdentifier;
        @XmlAttribute(name = "SequenceNmbr")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger sequenceNmbr;
        @XmlAttribute(name = "TransactionStatusCode")
        protected String transactionStatusCode;
        @XmlAttribute(name = "RetransmissionIndicator")
        protected Boolean retransmissionIndicator;
        @XmlAttribute(name = "MaxResponses")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxResponses;
        @XmlAttribute(name = "DirectFlightsOnly")
        protected Boolean directFlightsOnly;
        @XmlAttribute(name = "AvailableFlightsOnly")
        protected Boolean availableFlightsOnly;
        @XmlAttribute(name = "ForMetaBook", required = true)
        protected boolean forMetaBook;

        /**
         * Gets the value of the pos property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSourceType }
         *     
         */
        public ArrayOfSourceType getPOS() {
            return pos;
        }

        /**
         * Sets the value of the pos property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSourceType }
         *     
         */
        public void setPOS(ArrayOfSourceType value) {
            this.pos = value;
        }

        /**
         * Gets the value of the processingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SearchFlight.OTAAirLowFareSearchRQ.ProcessingInfo }
         *     
         */
        public SearchFlight.OTAAirLowFareSearchRQ.ProcessingInfo getProcessingInfo() {
            return processingInfo;
        }

        /**
         * Sets the value of the processingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchFlight.OTAAirLowFareSearchRQ.ProcessingInfo }
         *     
         */
        public void setProcessingInfo(SearchFlight.OTAAirLowFareSearchRQ.ProcessingInfo value) {
            this.processingInfo = value;
        }

        /**
         * Gets the value of the originDestinationInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation }
         * 
         * 
         */
        public List<SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation> getOriginDestinationInformation() {
            if (originDestinationInformation == null) {
                originDestinationInformation = new ArrayList<SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation>();
            }
            return this.originDestinationInformation;
        }

        /**
         * Gets the value of the specificFlightInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SpecificFlightInfoType }
         *     
         */
        public SpecificFlightInfoType getSpecificFlightInfo() {
            return specificFlightInfo;
        }

        /**
         * Sets the value of the specificFlightInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecificFlightInfoType }
         *     
         */
        public void setSpecificFlightInfo(SpecificFlightInfoType value) {
            this.specificFlightInfo = value;
        }

        /**
         * Gets the value of the travelPreferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelPreferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelPreferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchFlight.OTAAirLowFareSearchRQ.TravelPreferences }
         * 
         * 
         */
        public List<SearchFlight.OTAAirLowFareSearchRQ.TravelPreferences> getTravelPreferences() {
            if (travelPreferences == null) {
                travelPreferences = new ArrayList<SearchFlight.OTAAirLowFareSearchRQ.TravelPreferences>();
            }
            return this.travelPreferences;
        }

        /**
         * Gets the value of the travelerInfoSummary property.
         * 
         * @return
         *     possible object is
         *     {@link SearchFlight.OTAAirLowFareSearchRQ.TravelerInfoSummary }
         *     
         */
        public SearchFlight.OTAAirLowFareSearchRQ.TravelerInfoSummary getTravelerInfoSummary() {
            return travelerInfoSummary;
        }

        /**
         * Sets the value of the travelerInfoSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchFlight.OTAAirLowFareSearchRQ.TravelerInfoSummary }
         *     
         */
        public void setTravelerInfoSummary(SearchFlight.OTAAirLowFareSearchRQ.TravelerInfoSummary value) {
            this.travelerInfoSummary = value;
        }

        /**
         * Gets the value of the advanceSearchInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo }
         *     
         */
        public SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo getAdvanceSearchInfo() {
            return advanceSearchInfo;
        }

        /**
         * Sets the value of the advanceSearchInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo }
         *     
         */
        public void setAdvanceSearchInfo(SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo value) {
            this.advanceSearchInfo = value;
        }

        /**
         * Gets the value of the metaLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetaLink() {
            return metaLink;
        }

        /**
         * Sets the value of the metaLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetaLink(String value) {
            this.metaLink = value;
        }

        /**
         * Gets the value of the refundableType property.
         * 
         * @return
         *     possible object is
         *     {@link RefundableTypesEnum }
         *     
         */
        public RefundableTypesEnum getRefundableType() {
            return refundableType;
        }

        /**
         * Sets the value of the refundableType property.
         * 
         * @param value
         *     allowed object is
         *     {@link RefundableTypesEnum }
         *     
         */
        public void setRefundableType(RefundableTypesEnum value) {
            this.refundableType = value;
        }

        /**
         * Gets the value of the maxPrice property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxPrice() {
            return maxPrice;
        }

        /**
         * Sets the value of the maxPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxPrice(BigDecimal value) {
            this.maxPrice = value;
        }

        /**
         * Gets the value of the providerType property.
         * 
         * @return
         *     possible object is
         *     {@link SearchTypeByProviderEnum }
         *     
         */
        public SearchTypeByProviderEnum getProviderType() {
            return providerType;
        }

        /**
         * Sets the value of the providerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchTypeByProviderEnum }
         *     
         */
        public void setProviderType(SearchTypeByProviderEnum value) {
            this.providerType = value;
        }

        /**
         * Gets the value of the echoToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEchoToken() {
            return echoToken;
        }

        /**
         * Sets the value of the echoToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEchoToken(String value) {
            this.echoToken = value;
        }

        /**
         * Gets the value of the timeStamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimeStamp() {
            return timeStamp;
        }

        /**
         * Sets the value of the timeStamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimeStamp(XMLGregorianCalendar value) {
            this.timeStamp = value;
        }

        /**
         * Gets the value of the target property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            if (target == null) {
                return "Production";
            } else {
                return target;
            }
        }

        /**
         * Sets the value of the target property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVersion(BigDecimal value) {
            this.version = value;
        }

        /**
         * Gets the value of the transactionIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionIdentifier() {
            return transactionIdentifier;
        }

        /**
         * Sets the value of the transactionIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionIdentifier(String value) {
            this.transactionIdentifier = value;
        }

        /**
         * Gets the value of the sequenceNmbr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNmbr() {
            return sequenceNmbr;
        }

        /**
         * Sets the value of the sequenceNmbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNmbr(BigInteger value) {
            this.sequenceNmbr = value;
        }

        /**
         * Gets the value of the transactionStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionStatusCode() {
            return transactionStatusCode;
        }

        /**
         * Sets the value of the transactionStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionStatusCode(String value) {
            this.transactionStatusCode = value;
        }

        /**
         * Gets the value of the retransmissionIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRetransmissionIndicator() {
            return retransmissionIndicator;
        }

        /**
         * Sets the value of the retransmissionIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRetransmissionIndicator(Boolean value) {
            this.retransmissionIndicator = value;
        }

        /**
         * Gets the value of the maxResponses property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxResponses() {
            return maxResponses;
        }

        /**
         * Sets the value of the maxResponses property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxResponses(BigInteger value) {
            this.maxResponses = value;
        }

        /**
         * Gets the value of the directFlightsOnly property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isDirectFlightsOnly() {
            if (directFlightsOnly == null) {
                return false;
            } else {
                return directFlightsOnly;
            }
        }

        /**
         * Sets the value of the directFlightsOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDirectFlightsOnly(Boolean value) {
            this.directFlightsOnly = value;
        }

        /**
         * Gets the value of the availableFlightsOnly property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailableFlightsOnly() {
            return availableFlightsOnly;
        }

        /**
         * Sets the value of the availableFlightsOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailableFlightsOnly(Boolean value) {
            this.availableFlightsOnly = value;
        }

        /**
         * Gets the value of the forMetaBook property.
         * 
         */
        public boolean isForMetaBook() {
            return forMetaBook;
        }

        /**
         * Sets the value of the forMetaBook property.
         * 
         */
        public void setForMetaBook(boolean value) {
            this.forMetaBook = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="NumberOfRecommendation" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="MaxEFTPercentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="MaxLayoverPerConnection" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Hour" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Minute" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AirlineDiversity" type="{http://epowerv5.amadeus.com.tr/WS}AirlineDiversityType" minOccurs="0"/>
         *         &lt;element name="IgnoreAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExpandedParameters" type="{http://epowerv5.amadeus.com.tr/WS}ExpandedParametersType" minOccurs="0"/>
         *         &lt;element name="ReturnMoreOvernightFlights" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="DuplicatedRecommedationsBehavior" type="{http://epowerv5.amadeus.com.tr/WS}DuplicatedRecommedationsBehaviorEnum" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numberOfRecommendation",
            "maxEFTPercentage",
            "maxLayoverPerConnection",
            "airlineDiversity",
            "ignoreAvailability",
            "currency",
            "expandedParameters",
            "returnMoreOvernightFlights",
            "duplicatedRecommedationsBehavior"
        })
        public static class AdvanceSearchInfo {

            @XmlElement(name = "NumberOfRecommendation")
            protected int numberOfRecommendation;
            @XmlElement(name = "MaxEFTPercentage")
            protected int maxEFTPercentage;
            @XmlElement(name = "MaxLayoverPerConnection")
            protected SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection maxLayoverPerConnection;
            @XmlElement(name = "AirlineDiversity")
            protected AirlineDiversityType airlineDiversity;
            @XmlElement(name = "IgnoreAvailability")
            protected boolean ignoreAvailability;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "ExpandedParameters")
            protected ExpandedParametersType expandedParameters;
            @XmlElement(name = "ReturnMoreOvernightFlights")
            protected Boolean returnMoreOvernightFlights;
            @XmlElement(name = "DuplicatedRecommedationsBehavior")
            @XmlSchemaType(name = "string")
            protected DuplicatedRecommedationsBehaviorEnum duplicatedRecommedationsBehavior;

            /**
             * Gets the value of the numberOfRecommendation property.
             * 
             */
            public int getNumberOfRecommendation() {
                return numberOfRecommendation;
            }

            /**
             * Sets the value of the numberOfRecommendation property.
             * 
             */
            public void setNumberOfRecommendation(int value) {
                this.numberOfRecommendation = value;
            }

            /**
             * Gets the value of the maxEFTPercentage property.
             * 
             */
            public int getMaxEFTPercentage() {
                return maxEFTPercentage;
            }

            /**
             * Sets the value of the maxEFTPercentage property.
             * 
             */
            public void setMaxEFTPercentage(int value) {
                this.maxEFTPercentage = value;
            }

            /**
             * Gets the value of the maxLayoverPerConnection property.
             * 
             * @return
             *     possible object is
             *     {@link SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection }
             *     
             */
            public SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection getMaxLayoverPerConnection() {
                return maxLayoverPerConnection;
            }

            /**
             * Sets the value of the maxLayoverPerConnection property.
             * 
             * @param value
             *     allowed object is
             *     {@link SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection }
             *     
             */
            public void setMaxLayoverPerConnection(SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection value) {
                this.maxLayoverPerConnection = value;
            }

            /**
             * Gets the value of the airlineDiversity property.
             * 
             * @return
             *     possible object is
             *     {@link AirlineDiversityType }
             *     
             */
            public AirlineDiversityType getAirlineDiversity() {
                return airlineDiversity;
            }

            /**
             * Sets the value of the airlineDiversity property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirlineDiversityType }
             *     
             */
            public void setAirlineDiversity(AirlineDiversityType value) {
                this.airlineDiversity = value;
            }

            /**
             * Gets the value of the ignoreAvailability property.
             * 
             */
            public boolean isIgnoreAvailability() {
                return ignoreAvailability;
            }

            /**
             * Sets the value of the ignoreAvailability property.
             * 
             */
            public void setIgnoreAvailability(boolean value) {
                this.ignoreAvailability = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrency(String value) {
                this.currency = value;
            }

            /**
             * Gets the value of the expandedParameters property.
             * 
             * @return
             *     possible object is
             *     {@link ExpandedParametersType }
             *     
             */
            public ExpandedParametersType getExpandedParameters() {
                return expandedParameters;
            }

            /**
             * Sets the value of the expandedParameters property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExpandedParametersType }
             *     
             */
            public void setExpandedParameters(ExpandedParametersType value) {
                this.expandedParameters = value;
            }

            /**
             * Gets the value of the returnMoreOvernightFlights property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isReturnMoreOvernightFlights() {
                return returnMoreOvernightFlights;
            }

            /**
             * Sets the value of the returnMoreOvernightFlights property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setReturnMoreOvernightFlights(Boolean value) {
                this.returnMoreOvernightFlights = value;
            }

            /**
             * Gets the value of the duplicatedRecommedationsBehavior property.
             * 
             * @return
             *     possible object is
             *     {@link DuplicatedRecommedationsBehaviorEnum }
             *     
             */
            public DuplicatedRecommedationsBehaviorEnum getDuplicatedRecommedationsBehavior() {
                return duplicatedRecommedationsBehavior;
            }

            /**
             * Sets the value of the duplicatedRecommedationsBehavior property.
             * 
             * @param value
             *     allowed object is
             *     {@link DuplicatedRecommedationsBehaviorEnum }
             *     
             */
            public void setDuplicatedRecommedationsBehavior(DuplicatedRecommedationsBehaviorEnum value) {
                this.duplicatedRecommedationsBehavior = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Hour" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Minute" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MaxLayoverPerConnection {

                @XmlAttribute(name = "Hour", required = true)
                protected int hour;
                @XmlAttribute(name = "Minute", required = true)
                protected int minute;

                /**
                 * Gets the value of the hour property.
                 * 
                 */
                public int getHour() {
                    return hour;
                }

                /**
                 * Sets the value of the hour property.
                 * 
                 */
                public void setHour(int value) {
                    this.hour = value;
                }

                /**
                 * Gets the value of the minute property.
                 * 
                 */
                public int getMinute() {
                    return minute;
                }

                /**
                 * Sets the value of the minute property.
                 * 
                 */
                public void setMinute(int value) {
                    this.minute = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}OriginDestinationInformationType">
         *       &lt;sequence>
         *         &lt;element name="AlternateLocationInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="OriginLocation">
         *                   &lt;simpleType>
         *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="DestinationLocation">
         *                   &lt;simpleType>
         *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RefNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "alternateLocationInfo",
            "tpaExtensions"
        })
        public static class OriginDestinationInformation
            extends OriginDestinationInformationType
        {

            @XmlElement(name = "AlternateLocationInfo")
            protected SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo alternateLocationInfo;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "RefNumber")
            protected BigInteger refNumber;

            /**
             * Gets the value of the alternateLocationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo }
             *     
             */
            public SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo getAlternateLocationInfo() {
                return alternateLocationInfo;
            }

            /**
             * Sets the value of the alternateLocationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo }
             *     
             */
            public void setAlternateLocationInfo(SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo value) {
                this.alternateLocationInfo = value;
            }

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

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * Gets the value of the refNumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRefNumber() {
                return refNumber;
            }

            /**
             * Sets the value of the refNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRefNumber(BigInteger value) {
                this.refNumber = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="OriginLocation">
             *         &lt;simpleType>
             *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="DestinationLocation">
             *         &lt;simpleType>
             *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AlternateLocationInfo {

                @XmlAttribute(name = "OriginLocation")
                protected List<String> originLocation;
                @XmlAttribute(name = "DestinationLocation")
                protected List<String> destinationLocation;

                /**
                 * Gets the value of the originLocation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the originLocation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOriginLocation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getOriginLocation() {
                    if (originLocation == null) {
                        originLocation = new ArrayList<String>();
                    }
                    return this.originLocation;
                }

                /**
                 * Gets the value of the destinationLocation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the destinationLocation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDestinationLocation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getDestinationLocation() {
                    if (destinationLocation == null) {
                        destinationLocation = new ArrayList<String>();
                    }
                    return this.destinationLocation;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="TargetSource">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Core"/>
         *             &lt;enumeration value="Vendor"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="FlightSvcInfoIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="DisplayOrder" type="{http://epowerv5.amadeus.com.tr/WS}DisplayOrderType" />
         *       &lt;attribute name="ReducedDataIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="BaseFaresOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="SearchType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Normal"/>
         *             &lt;enumeration value="Window"/>
         *             &lt;enumeration value="ArrivalTime"/>
         *             &lt;enumeration value="PowerFlight"/>
         *             &lt;enumeration value="AvailableOnly"/>
         *             &lt;enumeration value="WaitlistOnly"/>
         *             &lt;enumeration value="AvailableAndWaitlist"/>
         *             &lt;enumeration value="FreighterFlights"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="AvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ProcessingInfo {

            @XmlAttribute(name = "TargetSource")
            protected String targetSource;
            @XmlAttribute(name = "FlightSvcInfoIndicator")
            protected Boolean flightSvcInfoIndicator;
            @XmlAttribute(name = "DisplayOrder")
            protected DisplayOrderType displayOrder;
            @XmlAttribute(name = "ReducedDataIndicator")
            protected Boolean reducedDataIndicator;
            @XmlAttribute(name = "BaseFaresOnlyIndicator")
            protected Boolean baseFaresOnlyIndicator;
            @XmlAttribute(name = "SearchType")
            protected String searchType;
            @XmlAttribute(name = "AvailabilityIndicator")
            protected Boolean availabilityIndicator;

            /**
             * Gets the value of the targetSource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetSource() {
                return targetSource;
            }

            /**
             * Sets the value of the targetSource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetSource(String value) {
                this.targetSource = value;
            }

            /**
             * Gets the value of the flightSvcInfoIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFlightSvcInfoIndicator() {
                return flightSvcInfoIndicator;
            }

            /**
             * Sets the value of the flightSvcInfoIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFlightSvcInfoIndicator(Boolean value) {
                this.flightSvcInfoIndicator = value;
            }

            /**
             * Gets the value of the displayOrder property.
             * 
             * @return
             *     possible object is
             *     {@link DisplayOrderType }
             *     
             */
            public DisplayOrderType getDisplayOrder() {
                return displayOrder;
            }

            /**
             * Sets the value of the displayOrder property.
             * 
             * @param value
             *     allowed object is
             *     {@link DisplayOrderType }
             *     
             */
            public void setDisplayOrder(DisplayOrderType value) {
                this.displayOrder = value;
            }

            /**
             * Gets the value of the reducedDataIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isReducedDataIndicator() {
                return reducedDataIndicator;
            }

            /**
             * Sets the value of the reducedDataIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setReducedDataIndicator(Boolean value) {
                this.reducedDataIndicator = value;
            }

            /**
             * Gets the value of the baseFaresOnlyIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBaseFaresOnlyIndicator() {
                return baseFaresOnlyIndicator;
            }

            /**
             * Sets the value of the baseFaresOnlyIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBaseFaresOnlyIndicator(Boolean value) {
                this.baseFaresOnlyIndicator = value;
            }

            /**
             * Gets the value of the searchType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSearchType() {
                return searchType;
            }

            /**
             * Sets the value of the searchType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSearchType(String value) {
                this.searchType = value;
            }

            /**
             * Gets the value of the availabilityIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAvailabilityIndicator() {
                return availabilityIndicator;
            }

            /**
             * Sets the value of the availabilityIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAvailabilityIndicator(Boolean value) {
                this.availabilityIndicator = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoSummaryType">
         *       &lt;attribute name="ForcePTC" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="FamilyCard" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="FamilyType" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="FamilyDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="TicketingCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SpecificPTC_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TravelerInfoSummary
            extends TravelerInfoSummaryType
        {

            @XmlAttribute(name = "ForcePTC")
            protected Boolean forcePTC;
            @XmlAttribute(name = "FamilyCard")
            protected Boolean familyCard;
            @XmlAttribute(name = "FamilyType")
            protected Boolean familyType;
            @XmlAttribute(name = "FamilyDiscount")
            protected Boolean familyDiscount;
            @XmlAttribute(name = "TicketingCountryCode")
            protected String ticketingCountryCode;
            @XmlAttribute(name = "SpecificPTC_Indicator")
            protected Boolean specificPTCIndicator;

            /**
             * Gets the value of the forcePTC property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isForcePTC() {
                return forcePTC;
            }

            /**
             * Sets the value of the forcePTC property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setForcePTC(Boolean value) {
                this.forcePTC = value;
            }

            /**
             * Gets the value of the familyCard property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFamilyCard() {
                return familyCard;
            }

            /**
             * Sets the value of the familyCard property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFamilyCard(Boolean value) {
                this.familyCard = value;
            }

            /**
             * Gets the value of the familyType property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFamilyType() {
                return familyType;
            }

            /**
             * Sets the value of the familyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFamilyType(Boolean value) {
                this.familyType = value;
            }

            /**
             * Gets the value of the familyDiscount property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFamilyDiscount() {
                return familyDiscount;
            }

            /**
             * Sets the value of the familyDiscount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFamilyDiscount(Boolean value) {
                this.familyDiscount = value;
            }

            /**
             * Gets the value of the ticketingCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketingCountryCode() {
                return ticketingCountryCode;
            }

            /**
             * Sets the value of the ticketingCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketingCountryCode(String value) {
                this.ticketingCountryCode = value;
            }

            /**
             * Gets the value of the specificPTCIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSpecificPTCIndicator() {
                return specificPTCIndicator;
            }

            /**
             * Sets the value of the specificPTCIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSpecificPTCIndicator(Boolean value) {
                this.specificPTCIndicator = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}AirSearchPrefsType">
         *       &lt;attribute name="FlexDatePref">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Outbound"/>
         *             &lt;enumeration value="Return"/>
         *             &lt;enumeration value="Both"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="FlexWeekendIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="FlexLevelIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="NoFareBreakIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="OriginDestinationRPHs">
         *         &lt;simpleType>
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TravelPreferences
            extends AirSearchPrefsType
        {

            @XmlAttribute(name = "FlexDatePref")
            protected String flexDatePref;
            @XmlAttribute(name = "FlexWeekendIndicator")
            protected Boolean flexWeekendIndicator;
            @XmlAttribute(name = "FlexLevelIndicator")
            protected Boolean flexLevelIndicator;
            @XmlAttribute(name = "NoFareBreakIndicator")
            protected Boolean noFareBreakIndicator;
            @XmlAttribute(name = "OriginDestinationRPHs")
            protected List<String> originDestinationRPHs;

            /**
             * Gets the value of the flexDatePref property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlexDatePref() {
                return flexDatePref;
            }

            /**
             * Sets the value of the flexDatePref property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlexDatePref(String value) {
                this.flexDatePref = value;
            }

            /**
             * Gets the value of the flexWeekendIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFlexWeekendIndicator() {
                return flexWeekendIndicator;
            }

            /**
             * Sets the value of the flexWeekendIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFlexWeekendIndicator(Boolean value) {
                this.flexWeekendIndicator = value;
            }

            /**
             * Gets the value of the flexLevelIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFlexLevelIndicator() {
                return flexLevelIndicator;
            }

            /**
             * Sets the value of the flexLevelIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFlexLevelIndicator(Boolean value) {
                this.flexLevelIndicator = value;
            }

            /**
             * Gets the value of the noFareBreakIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNoFareBreakIndicator() {
                return noFareBreakIndicator;
            }

            /**
             * Sets the value of the noFareBreakIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNoFareBreakIndicator(Boolean value) {
                this.noFareBreakIndicator = value;
            }

            /**
             * Gets the value of the originDestinationRPHs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the originDestinationRPHs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOriginDestinationRPHs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getOriginDestinationRPHs() {
                if (originDestinationRPHs == null) {
                    originDestinationRPHs = new ArrayList<String>();
                }
                return this.originDestinationRPHs;
            }

        }

    }

}
