
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="OTA_AirBookRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}GenericFlightRQ">
 *                 &lt;sequence>
 *                   &lt;element name="PNRRemarks" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPNRRemarkInfo" minOccurs="0"/>
 *                   &lt;element name="AirItineraryPricingInfo" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
 *                   &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
 *                   &lt;element name="AirItinerary" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryType" minOccurs="0"/>
 *                   &lt;element name="PriceInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BookingPriceInfoType">
 *                           &lt;sequence>
 *                             &lt;element name="PricingPref" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Type" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;enumeration value="BaseFareOnly"/>
 *                                           &lt;enumeration value="SpecifiedClass"/>
 *                                           &lt;enumeration value="TaxExempt"/>
 *                                           &lt;enumeration value="SecuratePricing"/>
 *                                           &lt;enumeration value="CodeOnlyFares"/>
 *                                           &lt;enumeration value="LowerFareFound"/>
 *                                           &lt;enumeration value="PenaltyApplies"/>
 *                                           &lt;enumeration value="DiscountApplies"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ExcludeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ParticipationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TravelerInfo" type="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoType" minOccurs="0"/>
 *                   &lt;element name="Fulfillment" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPaymentDetailType" minOccurs="0"/>
 *                             &lt;element name="DeliveryAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *                             &lt;element name="Receipt" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PaymentText" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
 *                                     &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LCCUserLogin" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Ticketing" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoType">
 *                           &lt;sequence>
 *                             &lt;element name="TicketingVendor" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PricingSystem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Queue" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *                   &lt;element name="InsurancePlan" type="{http://epowerv5.amadeus.com.tr/WS}InsurancePlan" minOccurs="0"/>
 *                   &lt;element name="RelatedMember" type="{http://epowerv5.amadeus.com.tr/WS}RelatedMember" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CorporatePinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                 &lt;attribute name="ResStatus" type="{http://epowerv5.amadeus.com.tr/WS}TransactionActionType" />
 *                 &lt;attribute name="PriceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
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
    "otaAirBookRQ"
})
@XmlRootElement(name = "BookFlightWithRecommendation")
public class BookFlightWithRecommendation {

    @XmlElement(name = "OTA_AirBookRQ")
    protected BookFlightWithRecommendation.OTAAirBookRQ otaAirBookRQ;

    /**
     * Gets the value of the otaAirBookRQ property.
     * 
     * @return
     *     possible object is
     *     {@link BookFlightWithRecommendation.OTAAirBookRQ }
     *     
     */
    public BookFlightWithRecommendation.OTAAirBookRQ getOTAAirBookRQ() {
        return otaAirBookRQ;
    }

    /**
     * Sets the value of the otaAirBookRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookFlightWithRecommendation.OTAAirBookRQ }
     *     
     */
    public void setOTAAirBookRQ(BookFlightWithRecommendation.OTAAirBookRQ value) {
        this.otaAirBookRQ = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}GenericFlightRQ">
     *       &lt;sequence>
     *         &lt;element name="PNRRemarks" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPNRRemarkInfo" minOccurs="0"/>
     *         &lt;element name="AirItineraryPricingInfo" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryPricingInfoType" minOccurs="0"/>
     *         &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
     *         &lt;element name="AirItinerary" type="{http://epowerv5.amadeus.com.tr/WS}AirItineraryType" minOccurs="0"/>
     *         &lt;element name="PriceInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BookingPriceInfoType">
     *                 &lt;sequence>
     *                   &lt;element name="PricingPref" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Type" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="BaseFareOnly"/>
     *                                 &lt;enumeration value="SpecifiedClass"/>
     *                                 &lt;enumeration value="TaxExempt"/>
     *                                 &lt;enumeration value="SecuratePricing"/>
     *                                 &lt;enumeration value="CodeOnlyFares"/>
     *                                 &lt;enumeration value="LowerFareFound"/>
     *                                 &lt;enumeration value="PenaltyApplies"/>
     *                                 &lt;enumeration value="DiscountApplies"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ExcludeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ParticipationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TravelerInfo" type="{http://epowerv5.amadeus.com.tr/WS}TravelerInfoType" minOccurs="0"/>
     *         &lt;element name="Fulfillment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPaymentDetailType" minOccurs="0"/>
     *                   &lt;element name="DeliveryAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
     *                   &lt;element name="Receipt" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PaymentText" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
     *                           &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LCCUserLogin" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Ticketing" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoType">
     *                 &lt;sequence>
     *                   &lt;element name="TicketingVendor" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PricingSystem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Queue" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
     *         &lt;element name="InsurancePlan" type="{http://epowerv5.amadeus.com.tr/WS}InsurancePlan" minOccurs="0"/>
     *         &lt;element name="RelatedMember" type="{http://epowerv5.amadeus.com.tr/WS}RelatedMember" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CorporatePinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *       &lt;attribute name="ResStatus" type="{http://epowerv5.amadeus.com.tr/WS}TransactionActionType" />
     *       &lt;attribute name="PriceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pnrRemarks",
        "airItineraryPricingInfo",
        "pos",
        "airItinerary",
        "priceInfo",
        "travelerInfo",
        "fulfillment",
        "ticketing",
        "queue",
        "bookingReferenceID",
        "tpaExtensions",
        "insurancePlan",
        "relatedMember"
    })
    public static class OTAAirBookRQ
        extends GenericFlightRQ
    {

        @XmlElement(name = "PNRRemarks")
        protected ArrayOfPNRRemarkInfo pnrRemarks;
        @XmlElement(name = "AirItineraryPricingInfo")
        protected AirItineraryPricingInfoType airItineraryPricingInfo;
        @XmlElement(name = "POS")
        protected ArrayOfSourceType pos;
        @XmlElement(name = "AirItinerary")
        protected AirItineraryType airItinerary;
        @XmlElement(name = "PriceInfo")
        protected BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo priceInfo;
        @XmlElement(name = "TravelerInfo")
        protected TravelerInfoType travelerInfo;
        @XmlElement(name = "Fulfillment")
        protected BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment fulfillment;
        @XmlElement(name = "Ticketing")
        protected List<BookFlightWithRecommendation.OTAAirBookRQ.Ticketing> ticketing;
        @XmlElement(name = "Queue")
        protected BookFlightWithRecommendation.OTAAirBookRQ.Queue queue;
        @XmlElement(name = "BookingReferenceID")
        protected UniqueIDType bookingReferenceID;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlElement(name = "InsurancePlan")
        protected InsurancePlan insurancePlan;
        @XmlElement(name = "RelatedMember")
        protected RelatedMember relatedMember;
        @XmlAttribute(name = "ReferenceNumber")
        protected String referenceNumber;
        @XmlAttribute(name = "ControlNumber")
        protected String controlNumber;
        @XmlAttribute(name = "CorporatePinNumber")
        protected String corporatePinNumber;
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
        @XmlAttribute(name = "ResStatus")
        protected TransactionActionType resStatus;
        @XmlAttribute(name = "PriceInd")
        protected Boolean priceInd;

        /**
         * Gets the value of the pnrRemarks property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfPNRRemarkInfo }
         *     
         */
        public ArrayOfPNRRemarkInfo getPNRRemarks() {
            return pnrRemarks;
        }

        /**
         * Sets the value of the pnrRemarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfPNRRemarkInfo }
         *     
         */
        public void setPNRRemarks(ArrayOfPNRRemarkInfo value) {
            this.pnrRemarks = value;
        }

        /**
         * Gets the value of the airItineraryPricingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AirItineraryPricingInfoType }
         *     
         */
        public AirItineraryPricingInfoType getAirItineraryPricingInfo() {
            return airItineraryPricingInfo;
        }

        /**
         * Sets the value of the airItineraryPricingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirItineraryPricingInfoType }
         *     
         */
        public void setAirItineraryPricingInfo(AirItineraryPricingInfoType value) {
            this.airItineraryPricingInfo = value;
        }

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
         * Gets the value of the airItinerary property.
         * 
         * @return
         *     possible object is
         *     {@link AirItineraryType }
         *     
         */
        public AirItineraryType getAirItinerary() {
            return airItinerary;
        }

        /**
         * Sets the value of the airItinerary property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirItineraryType }
         *     
         */
        public void setAirItinerary(AirItineraryType value) {
            this.airItinerary = value;
        }

        /**
         * Gets the value of the priceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo }
         *     
         */
        public BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo getPriceInfo() {
            return priceInfo;
        }

        /**
         * Sets the value of the priceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo }
         *     
         */
        public void setPriceInfo(BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo value) {
            this.priceInfo = value;
        }

        /**
         * Gets the value of the travelerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerInfoType }
         *     
         */
        public TravelerInfoType getTravelerInfo() {
            return travelerInfo;
        }

        /**
         * Sets the value of the travelerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerInfoType }
         *     
         */
        public void setTravelerInfo(TravelerInfoType value) {
            this.travelerInfo = value;
        }

        /**
         * Gets the value of the fulfillment property.
         * 
         * @return
         *     possible object is
         *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment }
         *     
         */
        public BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment getFulfillment() {
            return fulfillment;
        }

        /**
         * Sets the value of the fulfillment property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment }
         *     
         */
        public void setFulfillment(BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment value) {
            this.fulfillment = value;
        }

        /**
         * Gets the value of the ticketing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookFlightWithRecommendation.OTAAirBookRQ.Ticketing }
         * 
         * 
         */
        public List<BookFlightWithRecommendation.OTAAirBookRQ.Ticketing> getTicketing() {
            if (ticketing == null) {
                ticketing = new ArrayList<BookFlightWithRecommendation.OTAAirBookRQ.Ticketing>();
            }
            return this.ticketing;
        }

        /**
         * Gets the value of the queue property.
         * 
         * @return
         *     possible object is
         *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Queue }
         *     
         */
        public BookFlightWithRecommendation.OTAAirBookRQ.Queue getQueue() {
            return queue;
        }

        /**
         * Sets the value of the queue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Queue }
         *     
         */
        public void setQueue(BookFlightWithRecommendation.OTAAirBookRQ.Queue value) {
            this.queue = value;
        }

        /**
         * Gets the value of the bookingReferenceID property.
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getBookingReferenceID() {
            return bookingReferenceID;
        }

        /**
         * Sets the value of the bookingReferenceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setBookingReferenceID(UniqueIDType value) {
            this.bookingReferenceID = value;
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
         * Gets the value of the insurancePlan property.
         * 
         * @return
         *     possible object is
         *     {@link InsurancePlan }
         *     
         */
        public InsurancePlan getInsurancePlan() {
            return insurancePlan;
        }

        /**
         * Sets the value of the insurancePlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsurancePlan }
         *     
         */
        public void setInsurancePlan(InsurancePlan value) {
            this.insurancePlan = value;
        }

        /**
         * Gets the value of the relatedMember property.
         * 
         * @return
         *     possible object is
         *     {@link RelatedMember }
         *     
         */
        public RelatedMember getRelatedMember() {
            return relatedMember;
        }

        /**
         * Sets the value of the relatedMember property.
         * 
         * @param value
         *     allowed object is
         *     {@link RelatedMember }
         *     
         */
        public void setRelatedMember(RelatedMember value) {
            this.relatedMember = value;
        }

        /**
         * Gets the value of the referenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceNumber() {
            return referenceNumber;
        }

        /**
         * Sets the value of the referenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceNumber(String value) {
            this.referenceNumber = value;
        }

        /**
         * Gets the value of the controlNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getControlNumber() {
            return controlNumber;
        }

        /**
         * Sets the value of the controlNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setControlNumber(String value) {
            this.controlNumber = value;
        }

        /**
         * Gets the value of the corporatePinNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorporatePinNumber() {
            return corporatePinNumber;
        }

        /**
         * Sets the value of the corporatePinNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorporatePinNumber(String value) {
            this.corporatePinNumber = value;
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
         * Gets the value of the resStatus property.
         * 
         * @return
         *     possible object is
         *     {@link TransactionActionType }
         *     
         */
        public TransactionActionType getResStatus() {
            return resStatus;
        }

        /**
         * Sets the value of the resStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransactionActionType }
         *     
         */
        public void setResStatus(TransactionActionType value) {
            this.resStatus = value;
        }

        /**
         * Gets the value of the priceInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPriceInd() {
            return priceInd;
        }

        /**
         * Sets the value of the priceInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPriceInd(Boolean value) {
            this.priceInd = value;
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
         *         &lt;element name="PaymentDetails" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfPaymentDetailType" minOccurs="0"/>
         *         &lt;element name="DeliveryAddress" type="{http://epowerv5.amadeus.com.tr/WS}AddressType" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
         *         &lt;element name="Receipt" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PaymentText" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
         *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LCCUserLogin" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "paymentDetails",
            "deliveryAddress",
            "name",
            "receipt",
            "paymentText",
            "lccUserLogin"
        })
        public static class Fulfillment {

            @XmlElement(name = "PaymentDetails")
            protected ArrayOfPaymentDetailType paymentDetails;
            @XmlElement(name = "DeliveryAddress")
            protected AddressType deliveryAddress;
            @XmlElement(name = "Name")
            protected PersonNameType name;
            @XmlElement(name = "Receipt")
            protected BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.Receipt receipt;
            @XmlElement(name = "PaymentText")
            protected List<BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.PaymentText> paymentText;
            @XmlElement(name = "LCCUserLogin")
            protected BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.LCCUserLogin lccUserLogin;

            /**
             * Gets the value of the paymentDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfPaymentDetailType }
             *     
             */
            public ArrayOfPaymentDetailType getPaymentDetails() {
                return paymentDetails;
            }

            /**
             * Sets the value of the paymentDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfPaymentDetailType }
             *     
             */
            public void setPaymentDetails(ArrayOfPaymentDetailType value) {
                this.paymentDetails = value;
            }

            /**
             * Gets the value of the deliveryAddress property.
             * 
             * @return
             *     possible object is
             *     {@link AddressType }
             *     
             */
            public AddressType getDeliveryAddress() {
                return deliveryAddress;
            }

            /**
             * Sets the value of the deliveryAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressType }
             *     
             */
            public void setDeliveryAddress(AddressType value) {
                this.deliveryAddress = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link PersonNameType }
             *     
             */
            public PersonNameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonNameType }
             *     
             */
            public void setName(PersonNameType value) {
                this.name = value;
            }

            /**
             * Gets the value of the receipt property.
             * 
             * @return
             *     possible object is
             *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.Receipt }
             *     
             */
            public BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.Receipt getReceipt() {
                return receipt;
            }

            /**
             * Sets the value of the receipt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.Receipt }
             *     
             */
            public void setReceipt(BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.Receipt value) {
                this.receipt = value;
            }

            /**
             * Gets the value of the paymentText property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paymentText property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPaymentText().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.PaymentText }
             * 
             * 
             */
            public List<BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.PaymentText> getPaymentText() {
                if (paymentText == null) {
                    paymentText = new ArrayList<BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.PaymentText>();
                }
                return this.paymentText;
            }

            /**
             * Gets the value of the lccUserLogin property.
             * 
             * @return
             *     possible object is
             *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.LCCUserLogin }
             *     
             */
            public BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.LCCUserLogin getLCCUserLogin() {
                return lccUserLogin;
            }

            /**
             * Sets the value of the lccUserLogin property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.LCCUserLogin }
             *     
             */
            public void setLCCUserLogin(BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.LCCUserLogin value) {
                this.lccUserLogin = value;
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
             *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LCCUserLogin {

                @XmlAttribute(name = "UserName")
                protected String userName;
                @XmlAttribute(name = "Password")
                protected String password;

                /**
                 * Gets the value of the userName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUserName() {
                    return userName;
                }

                /**
                 * Sets the value of the userName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUserName(String value) {
                    this.userName = value;
                }

                /**
                 * Gets the value of the password property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassword() {
                    return password;
                }

                /**
                 * Sets the value of the password property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassword(String value) {
                    this.password = value;
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
             *     &lt;extension base="&lt;http://epowerv5.amadeus.com.tr/WS>FormattedTextTextType">
             *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PaymentText
                extends FormattedTextTextType
            {

                @XmlAttribute(name = "Text")
                protected String text;
                @XmlAttribute(name = "Name")
                protected String name;

                /**
                 * Gets the value of the text property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Sets the value of the text property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
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
             *       &lt;attribute name="DistribType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Receipt {

                @XmlAttribute(name = "DistribType")
                protected String distribType;

                /**
                 * Gets the value of the distribType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDistribType() {
                    return distribType;
                }

                /**
                 * Sets the value of the distribType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDistribType(String value) {
                    this.distribType = value;
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
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}BookingPriceInfoType">
         *       &lt;sequence>
         *         &lt;element name="PricingPref" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Type" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="BaseFareOnly"/>
         *                       &lt;enumeration value="SpecifiedClass"/>
         *                       &lt;enumeration value="TaxExempt"/>
         *                       &lt;enumeration value="SecuratePricing"/>
         *                       &lt;enumeration value="CodeOnlyFares"/>
         *                       &lt;enumeration value="LowerFareFound"/>
         *                       &lt;enumeration value="PenaltyApplies"/>
         *                       &lt;enumeration value="DiscountApplies"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ExcludeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ParticipationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pricingPref"
        })
        public static class PriceInfo
            extends BookingPriceInfoType
        {

            @XmlElement(name = "PricingPref")
            protected List<BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo.PricingPref> pricingPref;
            @XmlAttribute(name = "ParticipationLevel")
            protected String participationLevel;

            /**
             * Gets the value of the pricingPref property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricingPref property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricingPref().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo.PricingPref }
             * 
             * 
             */
            public List<BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo.PricingPref> getPricingPref() {
                if (pricingPref == null) {
                    pricingPref = new ArrayList<BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo.PricingPref>();
                }
                return this.pricingPref;
            }

            /**
             * Gets the value of the participationLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParticipationLevel() {
                return participationLevel;
            }

            /**
             * Sets the value of the participationLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParticipationLevel(String value) {
                this.participationLevel = value;
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
             *       &lt;attribute name="Type" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="BaseFareOnly"/>
             *             &lt;enumeration value="SpecifiedClass"/>
             *             &lt;enumeration value="TaxExempt"/>
             *             &lt;enumeration value="SecuratePricing"/>
             *             &lt;enumeration value="CodeOnlyFares"/>
             *             &lt;enumeration value="LowerFareFound"/>
             *             &lt;enumeration value="PenaltyApplies"/>
             *             &lt;enumeration value="DiscountApplies"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ExcludeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PricingPref {

                @XmlAttribute(name = "Type", required = true)
                protected String type;
                @XmlAttribute(name = "ExcludeInd")
                protected Boolean excludeInd;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the excludeInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isExcludeInd() {
                    return excludeInd;
                }

                /**
                 * Sets the value of the excludeInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setExcludeInd(Boolean value) {
                    this.excludeInd = value;
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
         *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Queue {

            @XmlAttribute(name = "PseudoCityCode")
            protected String pseudoCityCode;
            @XmlAttribute(name = "QueueNumber")
            protected String queueNumber;
            @XmlAttribute(name = "QueueCategory")
            protected String queueCategory;
            @XmlAttribute(name = "SystemCode")
            protected String systemCode;
            @XmlAttribute(name = "QueueID")
            protected String queueID;
            @XmlAttribute(name = "DateTime")
            protected String dateTime;
            @XmlAttribute(name = "Text")
            protected String text;

            /**
             * Gets the value of the pseudoCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPseudoCityCode() {
                return pseudoCityCode;
            }

            /**
             * Sets the value of the pseudoCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPseudoCityCode(String value) {
                this.pseudoCityCode = value;
            }

            /**
             * Gets the value of the queueNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueNumber() {
                return queueNumber;
            }

            /**
             * Sets the value of the queueNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueNumber(String value) {
                this.queueNumber = value;
            }

            /**
             * Gets the value of the queueCategory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueCategory() {
                return queueCategory;
            }

            /**
             * Sets the value of the queueCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueCategory(String value) {
                this.queueCategory = value;
            }

            /**
             * Gets the value of the systemCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSystemCode() {
                return systemCode;
            }

            /**
             * Sets the value of the systemCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSystemCode(String value) {
                this.systemCode = value;
            }

            /**
             * Gets the value of the queueID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueID() {
                return queueID;
            }

            /**
             * Sets the value of the queueID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueID(String value) {
                this.queueID = value;
            }

            /**
             * Gets the value of the dateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateTime() {
                return dateTime;
            }

            /**
             * Sets the value of the dateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateTime(String value) {
                this.dateTime = value;
            }

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
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
         *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoType">
         *       &lt;sequence>
         *         &lt;element name="TicketingVendor" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PricingSystem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "ticketingVendor",
            "pricingSystem"
        })
        public static class Ticketing
            extends TicketingInfoType
        {

            @XmlElement(name = "TicketingVendor")
            protected BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.TicketingVendor ticketingVendor;
            @XmlElement(name = "PricingSystem")
            protected BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.PricingSystem pricingSystem;

            /**
             * Gets the value of the ticketingVendor property.
             * 
             * @return
             *     possible object is
             *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.TicketingVendor }
             *     
             */
            public BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.TicketingVendor getTicketingVendor() {
                return ticketingVendor;
            }

            /**
             * Sets the value of the ticketingVendor property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.TicketingVendor }
             *     
             */
            public void setTicketingVendor(BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.TicketingVendor value) {
                this.ticketingVendor = value;
            }

            /**
             * Gets the value of the pricingSystem property.
             * 
             * @return
             *     possible object is
             *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.PricingSystem }
             *     
             */
            public BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.PricingSystem getPricingSystem() {
                return pricingSystem;
            }

            /**
             * Sets the value of the pricingSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.PricingSystem }
             *     
             */
            public void setPricingSystem(BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.PricingSystem value) {
                this.pricingSystem = value;
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
             *       &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PricingSystem {

                @XmlAttribute(name = "CompanyShortName")
                protected String companyShortName;
                @XmlAttribute(name = "TravelSector")
                protected String travelSector;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the companyShortName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompanyShortName() {
                    return companyShortName;
                }

                /**
                 * Sets the value of the companyShortName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompanyShortName(String value) {
                    this.companyShortName = value;
                }

                /**
                 * Gets the value of the travelSector property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTravelSector() {
                    return travelSector;
                }

                /**
                 * Sets the value of the travelSector property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTravelSector(String value) {
                    this.travelSector = value;
                }

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    return codeContext;
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
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
             *       &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TicketingVendor {

                @XmlAttribute(name = "CompanyShortName")
                protected String companyShortName;
                @XmlAttribute(name = "TravelSector")
                protected String travelSector;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the companyShortName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompanyShortName() {
                    return companyShortName;
                }

                /**
                 * Sets the value of the companyShortName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompanyShortName(String value) {
                    this.companyShortName = value;
                }

                /**
                 * Gets the value of the travelSector property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTravelSector() {
                    return travelSector;
                }

                /**
                 * Sets the value of the travelSector property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTravelSector(String value) {
                    this.travelSector = value;
                }

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    return codeContext;
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
                }

            }

        }

    }

}
