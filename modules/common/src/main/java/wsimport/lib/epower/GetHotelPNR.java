
package wsimport.lib.epower;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="OTA_ReadRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
 *                   &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="ReadRequests" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                               &lt;element name="HotelReadRequest" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                         &lt;element name="Airport" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" default="IATA" />
 *                                                 &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="UserID" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
 *                                                 &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Verification" type="{http://epowerv5.amadeus.com.tr/WS}VerificationType" minOccurs="0"/>
 *                                         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="VehicleReadRequest" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}VehicleRetrieveResRQCoreType">
 *                                       &lt;sequence>
 *                                         &lt;element name="VehRetResRQInfo" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRetrieveResRQAdditionalInfoType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="AirReadRequest" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
 *                                         &lt;element name="Airline" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNameType" minOccurs="0"/>
 *                                         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                         &lt;element name="DepartureAirport" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
 *                                         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                         &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *                                         &lt;element name="Telephone" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="CustLoyalty" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="VendorCode">
 *                                                   &lt;simpleType>
 *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="CreditCardInfo" type="{http://epowerv5.amadeus.com.tr/WS}PaymentCardType" minOccurs="0"/>
 *                                         &lt;element name="TicketNumber" type="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoRS_Type" minOccurs="0"/>
 *                                         &lt;element name="QueueInfo" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="Queue" maxOccurs="unbounded" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                           &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                           &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                           &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                           &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                                 &lt;attribute name="FirstItemOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                 &lt;attribute name="RemoveFromQueueInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                 &lt;attribute name="FullDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                 &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="IncludeFF_EquivPartnerLev" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                       &lt;attribute name="ReturnFF_Number" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                       &lt;attribute name="ReturnDownlineSeg" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                       &lt;attribute name="InfoToReturn">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="ListofFF_StatusLevels"/>
 *                                             &lt;enumeration value="NoFF_Status"/>
 *                                             &lt;enumeration value="All"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="FF_RequestCriteria">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="ReturnLevelAndAbove"/>
 *                                             &lt;enumeration value="ReturnLevelAndBelow"/>
 *                                             &lt;enumeration value="ReturnOnlySpecifiedLevel"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="GolfReadRequest" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="Membership" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="VendorCode">
 *                                                   &lt;simpleType>
 *                                                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                       &lt;attribute name="PlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="PkgReadRequest" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *                                         &lt;element name="ArrivalLocation" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
 *                                         &lt;element name="DepartureLocation" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ReadRequest" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
 *                                         &lt;element name="Verification" type="{http://epowerv5.amadeus.com.tr/WS}VerificationType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="CruiseReadRequest" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="SelectedSailing" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="VoyageID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                 &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="GuestInfo" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="GlobalReservationReadRequest" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="TravelerName" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
 *                 &lt;attribute name="ReqRespVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ReservationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ReturnListIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "otaReadRQ"
})
@XmlRootElement(name = "GetHotelPNR")
public class GetHotelPNR {

    @XmlElement(name = "OTA_ReadRQ")
    protected GetHotelPNR.OTAReadRQ otaReadRQ;

    /**
     * Gets the value of the otaReadRQ property.
     * 
     * @return
     *     possible object is
     *     {@link GetHotelPNR.OTAReadRQ }
     *     
     */
    public GetHotelPNR.OTAReadRQ getOTAReadRQ() {
        return otaReadRQ;
    }

    /**
     * Sets the value of the otaReadRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelPNR.OTAReadRQ }
     *     
     */
    public void setOTAReadRQ(GetHotelPNR.OTAReadRQ value) {
        this.otaReadRQ = value;
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
     *         &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="ReadRequests" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                     &lt;element name="HotelReadRequest" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                               &lt;element name="Airport" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" default="IATA" />
     *                                       &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="UserID" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
     *                                       &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;/extension>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Verification" type="{http://epowerv5.amadeus.com.tr/WS}VerificationType" minOccurs="0"/>
     *                               &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="VehicleReadRequest" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}VehicleRetrieveResRQCoreType">
     *                             &lt;sequence>
     *                               &lt;element name="VehRetResRQInfo" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRetrieveResRQAdditionalInfoType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/extension>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="AirReadRequest" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
     *                               &lt;element name="Airline" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNameType" minOccurs="0"/>
     *                               &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                               &lt;element name="DepartureAirport" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
     *                               &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                               &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
     *                               &lt;element name="Telephone" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="CustLoyalty" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="VendorCode">
     *                                         &lt;simpleType>
     *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="CreditCardInfo" type="{http://epowerv5.amadeus.com.tr/WS}PaymentCardType" minOccurs="0"/>
     *                               &lt;element name="TicketNumber" type="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoRS_Type" minOccurs="0"/>
     *                               &lt;element name="QueueInfo" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="Queue" maxOccurs="unbounded" minOccurs="0">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                 &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                 &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                 &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                 &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                       &lt;attribute name="FirstItemOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                       &lt;attribute name="RemoveFromQueueInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                       &lt;attribute name="FullDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                       &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="IncludeFF_EquivPartnerLev" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                             &lt;attribute name="ReturnFF_Number" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                             &lt;attribute name="ReturnDownlineSeg" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                             &lt;attribute name="InfoToReturn">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="ListofFF_StatusLevels"/>
     *                                   &lt;enumeration value="NoFF_Status"/>
     *                                   &lt;enumeration value="All"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                             &lt;attribute name="FF_RequestCriteria">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="ReturnLevelAndAbove"/>
     *                                   &lt;enumeration value="ReturnLevelAndBelow"/>
     *                                   &lt;enumeration value="ReturnOnlySpecifiedLevel"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="GolfReadRequest" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="Membership" maxOccurs="unbounded" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="VendorCode">
     *                                         &lt;simpleType>
     *                                           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                             &lt;attribute name="PlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="PkgReadRequest" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
     *                               &lt;element name="ArrivalLocation" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
     *                               &lt;element name="DepartureLocation" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="ReadRequest" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
     *                               &lt;element name="Verification" type="{http://epowerv5.amadeus.com.tr/WS}VerificationType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="CruiseReadRequest" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="SelectedSailing" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="VoyageID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                       &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="GuestInfo" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="GlobalReservationReadRequest" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="TravelerName" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                             &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
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
     *       &lt;attribute name="ReqRespVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ReservationType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ReturnListIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "bookingReferenceID",
        "readRequests"
    })
    public static class OTAReadRQ {

        @XmlElement(name = "POS")
        protected ArrayOfSourceType pos;
        @XmlElement(name = "BookingReferenceID")
        protected UniqueIDType bookingReferenceID;
        @XmlElement(name = "ReadRequests")
        protected GetHotelPNR.OTAReadRQ.ReadRequests readRequests;
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
        @XmlAttribute(name = "ReqRespVersion")
        protected String reqRespVersion;
        @XmlAttribute(name = "ReservationType")
        protected String reservationType;
        @XmlAttribute(name = "ReturnListIndicator")
        protected Boolean returnListIndicator;
        @XmlAttribute(name = "MoreIndicator")
        protected Boolean moreIndicator;
        @XmlAttribute(name = "MoreDataEchoToken")
        protected String moreDataEchoToken;

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
         * Gets the value of the readRequests property.
         * 
         * @return
         *     possible object is
         *     {@link GetHotelPNR.OTAReadRQ.ReadRequests }
         *     
         */
        public GetHotelPNR.OTAReadRQ.ReadRequests getReadRequests() {
            return readRequests;
        }

        /**
         * Sets the value of the readRequests property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetHotelPNR.OTAReadRQ.ReadRequests }
         *     
         */
        public void setReadRequests(GetHotelPNR.OTAReadRQ.ReadRequests value) {
            this.readRequests = value;
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
         * Gets the value of the reqRespVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReqRespVersion() {
            return reqRespVersion;
        }

        /**
         * Sets the value of the reqRespVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReqRespVersion(String value) {
            this.reqRespVersion = value;
        }

        /**
         * Gets the value of the reservationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReservationType() {
            return reservationType;
        }

        /**
         * Sets the value of the reservationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReservationType(String value) {
            this.reservationType = value;
        }

        /**
         * Gets the value of the returnListIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnListIndicator() {
            return returnListIndicator;
        }

        /**
         * Sets the value of the returnListIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnListIndicator(Boolean value) {
            this.returnListIndicator = value;
        }

        /**
         * Gets the value of the moreIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMoreIndicator() {
            return moreIndicator;
        }

        /**
         * Sets the value of the moreIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMoreIndicator(Boolean value) {
            this.moreIndicator = value;
        }

        /**
         * Gets the value of the moreDataEchoToken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoreDataEchoToken() {
            return moreDataEchoToken;
        }

        /**
         * Sets the value of the moreDataEchoToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoreDataEchoToken(String value) {
            this.moreDataEchoToken = value;
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
         *         &lt;choice maxOccurs="unbounded" minOccurs="0">
         *           &lt;element name="HotelReadRequest" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                     &lt;element name="Airport" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" default="IATA" />
         *                             &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="UserID" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
         *                             &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Verification" type="{http://epowerv5.amadeus.com.tr/WS}VerificationType" minOccurs="0"/>
         *                     &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                   &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="VehicleReadRequest" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}VehicleRetrieveResRQCoreType">
         *                   &lt;sequence>
         *                     &lt;element name="VehRetResRQInfo" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRetrieveResRQAdditionalInfoType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/extension>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="AirReadRequest" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="POS" type="{http://epowerv5.amadeus.com.tr/WS}ArrayOfSourceType" minOccurs="0"/>
         *                     &lt;element name="Airline" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNameType" minOccurs="0"/>
         *                     &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                     &lt;element name="DepartureAirport" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
         *                     &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                     &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
         *                     &lt;element name="Telephone" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="CustLoyalty" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="VendorCode">
         *                               &lt;simpleType>
         *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="CreditCardInfo" type="{http://epowerv5.amadeus.com.tr/WS}PaymentCardType" minOccurs="0"/>
         *                     &lt;element name="TicketNumber" type="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoRS_Type" minOccurs="0"/>
         *                     &lt;element name="QueueInfo" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="Queue" maxOccurs="unbounded" minOccurs="0">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                       &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                       &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                       &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                       &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                             &lt;attribute name="FirstItemOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                             &lt;attribute name="RemoveFromQueueInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                             &lt;attribute name="FullDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                             &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                   &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="IncludeFF_EquivPartnerLev" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                   &lt;attribute name="ReturnFF_Number" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                   &lt;attribute name="ReturnDownlineSeg" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                   &lt;attribute name="InfoToReturn">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="ListofFF_StatusLevels"/>
         *                         &lt;enumeration value="NoFF_Status"/>
         *                         &lt;enumeration value="All"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/attribute>
         *                   &lt;attribute name="FF_RequestCriteria">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="ReturnLevelAndAbove"/>
         *                         &lt;enumeration value="ReturnLevelAndBelow"/>
         *                         &lt;enumeration value="ReturnOnlySpecifiedLevel"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/attribute>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="GolfReadRequest" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="Membership" maxOccurs="unbounded" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="VendorCode">
         *                               &lt;simpleType>
         *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                   &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                   &lt;attribute name="PlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="PkgReadRequest" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
         *                     &lt;element name="ArrivalLocation" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
         *                     &lt;element name="DepartureLocation" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                   &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="ReadRequest" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
         *                     &lt;element name="Verification" type="{http://epowerv5.amadeus.com.tr/WS}VerificationType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                   &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="CruiseReadRequest" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="SelectedSailing" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="VoyageID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                             &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="GuestInfo" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                   &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="GlobalReservationReadRequest" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="TravelerName" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
         *                   &lt;/sequence>
         *                   &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                   &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
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
            "hotelReadRequestOrVehicleReadRequestOrAirReadRequest"
        })
        public static class ReadRequests {

            @XmlElements({
                @XmlElement(name = "HotelReadRequest", type = GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.class),
                @XmlElement(name = "VehicleReadRequest", type = GetHotelPNR.OTAReadRQ.ReadRequests.VehicleReadRequest.class),
                @XmlElement(name = "AirReadRequest", type = GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.class),
                @XmlElement(name = "GolfReadRequest", type = GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest.class),
                @XmlElement(name = "PkgReadRequest", type = GetHotelPNR.OTAReadRQ.ReadRequests.PkgReadRequest.class),
                @XmlElement(name = "ReadRequest", type = GetHotelPNR.OTAReadRQ.ReadRequests.ReadRequest.class),
                @XmlElement(name = "CruiseReadRequest", type = GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.class),
                @XmlElement(name = "GlobalReservationReadRequest", type = GetHotelPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest.class)
            })
            protected List<Object> hotelReadRequestOrVehicleReadRequestOrAirReadRequest;

            /**
             * Gets the value of the hotelReadRequestOrVehicleReadRequestOrAirReadRequest property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hotelReadRequestOrVehicleReadRequestOrAirReadRequest property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHotelReadRequestOrVehicleReadRequestOrAirReadRequest().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest }
             * {@link GetHotelPNR.OTAReadRQ.ReadRequests.VehicleReadRequest }
             * {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest }
             * {@link GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest }
             * {@link GetHotelPNR.OTAReadRQ.ReadRequests.PkgReadRequest }
             * {@link GetHotelPNR.OTAReadRQ.ReadRequests.ReadRequest }
             * {@link GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest }
             * {@link GetHotelPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest }
             * 
             * 
             */
            public List<Object> getHotelReadRequestOrVehicleReadRequestOrAirReadRequest() {
                if (hotelReadRequestOrVehicleReadRequestOrAirReadRequest == null) {
                    hotelReadRequestOrVehicleReadRequestOrAirReadRequest = new ArrayList<Object>();
                }
                return this.hotelReadRequestOrVehicleReadRequestOrAirReadRequest;
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
             *         &lt;element name="Airline" type="{http://epowerv5.amadeus.com.tr/WS}CompanyNameType" minOccurs="0"/>
             *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DepartureAirport" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
             *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
             *         &lt;element name="Telephone" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="CustLoyalty" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VendorCode">
             *                   &lt;simpleType>
             *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="CreditCardInfo" type="{http://epowerv5.amadeus.com.tr/WS}PaymentCardType" minOccurs="0"/>
             *         &lt;element name="TicketNumber" type="{http://epowerv5.amadeus.com.tr/WS}TicketingInfoRS_Type" minOccurs="0"/>
             *         &lt;element name="QueueInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Queue" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="FirstItemOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="RemoveFromQueueInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="FullDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="IncludeFF_EquivPartnerLev" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="ReturnFF_Number" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="ReturnDownlineSeg" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="InfoToReturn">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="ListofFF_StatusLevels"/>
             *             &lt;enumeration value="NoFF_Status"/>
             *             &lt;enumeration value="All"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="FF_RequestCriteria">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="ReturnLevelAndAbove"/>
             *             &lt;enumeration value="ReturnLevelAndBelow"/>
             *             &lt;enumeration value="ReturnOnlySpecifiedLevel"/>
             *           &lt;/restriction>
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
            @XmlType(name = "", propOrder = {
                "pos",
                "airline",
                "flightNumber",
                "departureAirport",
                "departureDate",
                "name",
                "telephone",
                "custLoyalty",
                "creditCardInfo",
                "ticketNumber",
                "queueInfo",
                "tpaExtensions"
            })
            public static class AirReadRequest {

                @XmlElement(name = "POS")
                protected ArrayOfSourceType pos;
                @XmlElement(name = "Airline")
                protected CompanyNameType airline;
                @XmlElement(name = "FlightNumber")
                protected String flightNumber;
                @XmlElement(name = "DepartureAirport")
                protected LocationType departureAirport;
                @XmlElement(name = "DepartureDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar departureDate;
                @XmlElement(name = "Name")
                protected PersonNameType name;
                @XmlElement(name = "Telephone")
                protected GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone telephone;
                @XmlElement(name = "CustLoyalty")
                protected GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty custLoyalty;
                @XmlElement(name = "CreditCardInfo")
                protected PaymentCardType creditCardInfo;
                @XmlElement(name = "TicketNumber")
                protected TicketingInfoRSType ticketNumber;
                @XmlElement(name = "QueueInfo")
                protected GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo queueInfo;
                @XmlElement(name = "TPA_Extensions")
                protected TPAExtensionsType tpaExtensions;
                @XmlAttribute(name = "SeatNumber")
                protected String seatNumber;
                @XmlAttribute(name = "IncludeFF_EquivPartnerLev")
                protected Boolean includeFFEquivPartnerLev;
                @XmlAttribute(name = "ReturnFF_Number")
                protected Boolean returnFFNumber;
                @XmlAttribute(name = "ReturnDownlineSeg")
                protected Boolean returnDownlineSeg;
                @XmlAttribute(name = "InfoToReturn")
                protected String infoToReturn;
                @XmlAttribute(name = "FF_RequestCriteria")
                protected String ffRequestCriteria;

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
                 * Gets the value of the airline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CompanyNameType }
                 *     
                 */
                public CompanyNameType getAirline() {
                    return airline;
                }

                /**
                 * Sets the value of the airline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CompanyNameType }
                 *     
                 */
                public void setAirline(CompanyNameType value) {
                    this.airline = value;
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
                 * Gets the value of the departureAirport property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LocationType }
                 *     
                 */
                public LocationType getDepartureAirport() {
                    return departureAirport;
                }

                /**
                 * Sets the value of the departureAirport property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LocationType }
                 *     
                 */
                public void setDepartureAirport(LocationType value) {
                    this.departureAirport = value;
                }

                /**
                 * Gets the value of the departureDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDepartureDate() {
                    return departureDate;
                }

                /**
                 * Sets the value of the departureDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDepartureDate(XMLGregorianCalendar value) {
                    this.departureDate = value;
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
                 * Gets the value of the telephone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone }
                 *     
                 */
                public GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone getTelephone() {
                    return telephone;
                }

                /**
                 * Sets the value of the telephone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone }
                 *     
                 */
                public void setTelephone(GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone value) {
                    this.telephone = value;
                }

                /**
                 * Gets the value of the custLoyalty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty }
                 *     
                 */
                public GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty getCustLoyalty() {
                    return custLoyalty;
                }

                /**
                 * Sets the value of the custLoyalty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty }
                 *     
                 */
                public void setCustLoyalty(GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty value) {
                    this.custLoyalty = value;
                }

                /**
                 * Gets the value of the creditCardInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PaymentCardType }
                 *     
                 */
                public PaymentCardType getCreditCardInfo() {
                    return creditCardInfo;
                }

                /**
                 * Sets the value of the creditCardInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PaymentCardType }
                 *     
                 */
                public void setCreditCardInfo(PaymentCardType value) {
                    this.creditCardInfo = value;
                }

                /**
                 * Gets the value of the ticketNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TicketingInfoRSType }
                 *     
                 */
                public TicketingInfoRSType getTicketNumber() {
                    return ticketNumber;
                }

                /**
                 * Sets the value of the ticketNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TicketingInfoRSType }
                 *     
                 */
                public void setTicketNumber(TicketingInfoRSType value) {
                    this.ticketNumber = value;
                }

                /**
                 * Gets the value of the queueInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo }
                 *     
                 */
                public GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo getQueueInfo() {
                    return queueInfo;
                }

                /**
                 * Sets the value of the queueInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo }
                 *     
                 */
                public void setQueueInfo(GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo value) {
                    this.queueInfo = value;
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
                 * Gets the value of the seatNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSeatNumber() {
                    return seatNumber;
                }

                /**
                 * Sets the value of the seatNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSeatNumber(String value) {
                    this.seatNumber = value;
                }

                /**
                 * Gets the value of the includeFFEquivPartnerLev property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIncludeFFEquivPartnerLev() {
                    return includeFFEquivPartnerLev;
                }

                /**
                 * Sets the value of the includeFFEquivPartnerLev property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIncludeFFEquivPartnerLev(Boolean value) {
                    this.includeFFEquivPartnerLev = value;
                }

                /**
                 * Gets the value of the returnFFNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isReturnFFNumber() {
                    return returnFFNumber;
                }

                /**
                 * Sets the value of the returnFFNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setReturnFFNumber(Boolean value) {
                    this.returnFFNumber = value;
                }

                /**
                 * Gets the value of the returnDownlineSeg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isReturnDownlineSeg() {
                    return returnDownlineSeg;
                }

                /**
                 * Sets the value of the returnDownlineSeg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setReturnDownlineSeg(Boolean value) {
                    this.returnDownlineSeg = value;
                }

                /**
                 * Gets the value of the infoToReturn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInfoToReturn() {
                    return infoToReturn;
                }

                /**
                 * Sets the value of the infoToReturn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInfoToReturn(String value) {
                    this.infoToReturn = value;
                }

                /**
                 * Gets the value of the ffRequestCriteria property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFFRequestCriteria() {
                    return ffRequestCriteria;
                }

                /**
                 * Sets the value of the ffRequestCriteria property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFFRequestCriteria(String value) {
                    this.ffRequestCriteria = value;
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
                 *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VendorCode">
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
                public static class CustLoyalty {

                    @XmlAttribute(name = "ProgramID")
                    protected String programID;
                    @XmlAttribute(name = "MembershipID")
                    protected String membershipID;
                    @XmlAttribute(name = "TravelSector")
                    protected String travelSector;
                    @XmlAttribute(name = "RPH")
                    protected String rph;
                    @XmlAttribute(name = "VendorCode")
                    protected List<String> vendorCode;

                    /**
                     * Gets the value of the programID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProgramID() {
                        return programID;
                    }

                    /**
                     * Sets the value of the programID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProgramID(String value) {
                        this.programID = value;
                    }

                    /**
                     * Gets the value of the membershipID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMembershipID() {
                        return membershipID;
                    }

                    /**
                     * Sets the value of the membershipID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMembershipID(String value) {
                        this.membershipID = value;
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
                     * Gets the value of the vendorCode property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getVendorCode().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getVendorCode() {
                        if (vendorCode == null) {
                            vendorCode = new ArrayList<String>();
                        }
                        return this.vendorCode;
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
                 *       &lt;sequence>
                 *         &lt;element name="Queue" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="FirstItemOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="RemoveFromQueueInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="FullDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "queue"
                })
                public static class QueueInfo {

                    @XmlElement(name = "Queue")
                    protected List<GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue> queue;
                    @XmlAttribute(name = "FirstItemOnlyInd")
                    protected Boolean firstItemOnlyInd;
                    @XmlAttribute(name = "RemoveFromQueueInd")
                    protected Boolean removeFromQueueInd;
                    @XmlAttribute(name = "FullDataInd")
                    protected Boolean fullDataInd;
                    @XmlAttribute(name = "StartDate")
                    protected String startDate;
                    @XmlAttribute(name = "EndDate")
                    protected String endDate;

                    /**
                     * Gets the value of the queue property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the queue property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getQueue().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue }
                     * 
                     * 
                     */
                    public List<GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue> getQueue() {
                        if (queue == null) {
                            queue = new ArrayList<GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue>();
                        }
                        return this.queue;
                    }

                    /**
                     * Gets the value of the firstItemOnlyInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isFirstItemOnlyInd() {
                        return firstItemOnlyInd;
                    }

                    /**
                     * Sets the value of the firstItemOnlyInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setFirstItemOnlyInd(Boolean value) {
                        this.firstItemOnlyInd = value;
                    }

                    /**
                     * Gets the value of the removeFromQueueInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isRemoveFromQueueInd() {
                        return removeFromQueueInd;
                    }

                    /**
                     * Sets the value of the removeFromQueueInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setRemoveFromQueueInd(Boolean value) {
                        this.removeFromQueueInd = value;
                    }

                    /**
                     * Gets the value of the fullDataInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isFullDataInd() {
                        return fullDataInd;
                    }

                    /**
                     * Sets the value of the fullDataInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setFullDataInd(Boolean value) {
                        this.fullDataInd = value;
                    }

                    /**
                     * Gets the value of the startDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStartDate() {
                        return startDate;
                    }

                    /**
                     * Sets the value of the startDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStartDate(String value) {
                        this.startDate = value;
                    }

                    /**
                     * Gets the value of the endDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEndDate() {
                        return endDate;
                    }

                    /**
                     * Sets the value of the endDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEndDate(String value) {
                        this.endDate = value;
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
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Telephone {


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
             *       &lt;sequence>
             *         &lt;element name="SelectedSailing" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="VoyageID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="GuestInfo" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "selectedSailing",
                "guestInfo"
            })
            public static class CruiseReadRequest {

                @XmlElement(name = "SelectedSailing")
                protected GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing selectedSailing;
                @XmlElement(name = "GuestInfo")
                protected PersonNameType guestInfo;
                @XmlAttribute(name = "HistoryRequestedInd")
                protected Boolean historyRequestedInd;

                /**
                 * Gets the value of the selectedSailing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing }
                 *     
                 */
                public GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing getSelectedSailing() {
                    return selectedSailing;
                }

                /**
                 * Sets the value of the selectedSailing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing }
                 *     
                 */
                public void setSelectedSailing(GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing value) {
                    this.selectedSailing = value;
                }

                /**
                 * Gets the value of the guestInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PersonNameType }
                 *     
                 */
                public PersonNameType getGuestInfo() {
                    return guestInfo;
                }

                /**
                 * Sets the value of the guestInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PersonNameType }
                 *     
                 */
                public void setGuestInfo(PersonNameType value) {
                    this.guestInfo = value;
                }

                /**
                 * Gets the value of the historyRequestedInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isHistoryRequestedInd() {
                    return historyRequestedInd;
                }

                /**
                 * Sets the value of the historyRequestedInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setHistoryRequestedInd(Boolean value) {
                    this.historyRequestedInd = value;
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
                 *       &lt;attribute name="VoyageID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class SelectedSailing {

                    @XmlAttribute(name = "VoyageID")
                    protected String voyageID;
                    @XmlAttribute(name = "Status")
                    protected String status;
                    @XmlAttribute(name = "GroupCode")
                    protected String groupCode;

                    /**
                     * Gets the value of the voyageID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVoyageID() {
                        return voyageID;
                    }

                    /**
                     * Sets the value of the voyageID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVoyageID(String value) {
                        this.voyageID = value;
                    }

                    /**
                     * Gets the value of the status property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStatus() {
                        return status;
                    }

                    /**
                     * Sets the value of the status property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStatus(String value) {
                        this.status = value;
                    }

                    /**
                     * Gets the value of the groupCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGroupCode() {
                        return groupCode;
                    }

                    /**
                     * Sets the value of the groupCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGroupCode(String value) {
                        this.groupCode = value;
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
             *       &lt;sequence>
             *         &lt;element name="TravelerName" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "travelerName"
            })
            public static class GlobalReservationReadRequest {

                @XmlElement(name = "TravelerName")
                protected PersonNameType travelerName;
                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;

                /**
                 * Gets the value of the travelerName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PersonNameType }
                 *     
                 */
                public PersonNameType getTravelerName() {
                    return travelerName;
                }

                /**
                 * Sets the value of the travelerName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PersonNameType }
                 *     
                 */
                public void setTravelerName(PersonNameType value) {
                    this.travelerName = value;
                }

                /**
                 * Gets the value of the start property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStart() {
                    return start;
                }

                /**
                 * Sets the value of the start property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStart(String value) {
                    this.start = value;
                }

                /**
                 * Gets the value of the duration property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDuration() {
                    return duration;
                }

                /**
                 * Sets the value of the duration property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDuration(String value) {
                    this.duration = value;
                }

                /**
                 * Gets the value of the end property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnd() {
                    return end;
                }

                /**
                 * Sets the value of the end property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnd(String value) {
                    this.end = value;
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
             *       &lt;sequence>
             *         &lt;element name="Membership" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VendorCode">
             *                   &lt;simpleType>
             *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *       &lt;attribute name="PlayDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "membership",
                "name"
            })
            public static class GolfReadRequest {

                @XmlElement(name = "Membership")
                protected List<GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership> membership;
                @XmlElement(name = "Name")
                protected PersonNameType name;
                @XmlAttribute(name = "ID")
                protected String id;
                @XmlAttribute(name = "RoundID")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger roundID;
                @XmlAttribute(name = "PlayDateTime")
                protected String playDateTime;
                @XmlAttribute(name = "PackageID")
                protected String packageID;

                /**
                 * Gets the value of the membership property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the membership property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMembership().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership }
                 * 
                 * 
                 */
                public List<GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership> getMembership() {
                    if (membership == null) {
                        membership = new ArrayList<GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership>();
                    }
                    return this.membership;
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
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the roundID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRoundID() {
                    return roundID;
                }

                /**
                 * Sets the value of the roundID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRoundID(BigInteger value) {
                    this.roundID = value;
                }

                /**
                 * Gets the value of the playDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlayDateTime() {
                    return playDateTime;
                }

                /**
                 * Sets the value of the playDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlayDateTime(String value) {
                    this.playDateTime = value;
                }

                /**
                 * Gets the value of the packageID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPackageID() {
                    return packageID;
                }

                /**
                 * Sets the value of the packageID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPackageID(String value) {
                    this.packageID = value;
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
                 *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VendorCode">
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
                public static class Membership {

                    @XmlAttribute(name = "ProgramID")
                    protected String programID;
                    @XmlAttribute(name = "MembershipID")
                    protected String membershipID;
                    @XmlAttribute(name = "TravelSector")
                    protected String travelSector;
                    @XmlAttribute(name = "RPH")
                    protected String rph;
                    @XmlAttribute(name = "VendorCode")
                    protected List<String> vendorCode;

                    /**
                     * Gets the value of the programID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProgramID() {
                        return programID;
                    }

                    /**
                     * Sets the value of the programID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProgramID(String value) {
                        this.programID = value;
                    }

                    /**
                     * Gets the value of the membershipID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMembershipID() {
                        return membershipID;
                    }

                    /**
                     * Sets the value of the membershipID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMembershipID(String value) {
                        this.membershipID = value;
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
                     * Gets the value of the vendorCode property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getVendorCode().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getVendorCode() {
                        if (vendorCode == null) {
                            vendorCode = new ArrayList<String>();
                        }
                        return this.vendorCode;
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
             *       &lt;sequence>
             *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Airport" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" default="IATA" />
             *                 &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="UserID" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
             *                 &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Verification" type="{http://epowerv5.amadeus.com.tr/WS}VerificationType" minOccurs="0"/>
             *         &lt;element name="TPA_Extensions" type="{http://epowerv5.amadeus.com.tr/WS}TPA_ExtensionsType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cityName",
                "airport",
                "userID",
                "verification",
                "tpaExtensions"
            })
            public static class HotelReadRequest {

                @XmlElement(name = "CityName")
                protected String cityName;
                @XmlElement(name = "Airport")
                protected GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport airport;
                @XmlElement(name = "UserID")
                protected GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID userID;
                @XmlElement(name = "Verification")
                protected VerificationType verification;
                @XmlElement(name = "TPA_Extensions")
                protected TPAExtensionsType tpaExtensions;
                @XmlAttribute(name = "ChainCode")
                protected String chainCode;
                @XmlAttribute(name = "BrandCode")
                protected String brandCode;
                @XmlAttribute(name = "HotelCode")
                protected String hotelCode;
                @XmlAttribute(name = "HotelCityCode")
                protected String hotelCityCode;
                @XmlAttribute(name = "HotelName")
                protected String hotelName;
                @XmlAttribute(name = "HotelCodeContext")
                protected String hotelCodeContext;
                @XmlAttribute(name = "ChainName")
                protected String chainName;
                @XmlAttribute(name = "BrandName")
                protected String brandName;

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCityName(String value) {
                    this.cityName = value;
                }

                /**
                 * Gets the value of the airport property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport }
                 *     
                 */
                public GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport getAirport() {
                    return airport;
                }

                /**
                 * Sets the value of the airport property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport }
                 *     
                 */
                public void setAirport(GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport value) {
                    this.airport = value;
                }

                /**
                 * Gets the value of the userID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID }
                 *     
                 */
                public GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID getUserID() {
                    return userID;
                }

                /**
                 * Sets the value of the userID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID }
                 *     
                 */
                public void setUserID(GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID value) {
                    this.userID = value;
                }

                /**
                 * Gets the value of the verification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VerificationType }
                 *     
                 */
                public VerificationType getVerification() {
                    return verification;
                }

                /**
                 * Sets the value of the verification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VerificationType }
                 *     
                 */
                public void setVerification(VerificationType value) {
                    this.verification = value;
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
                 * Gets the value of the chainCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChainCode() {
                    return chainCode;
                }

                /**
                 * Sets the value of the chainCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChainCode(String value) {
                    this.chainCode = value;
                }

                /**
                 * Gets the value of the brandCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrandCode() {
                    return brandCode;
                }

                /**
                 * Sets the value of the brandCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrandCode(String value) {
                    this.brandCode = value;
                }

                /**
                 * Gets the value of the hotelCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCode() {
                    return hotelCode;
                }

                /**
                 * Sets the value of the hotelCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCode(String value) {
                    this.hotelCode = value;
                }

                /**
                 * Gets the value of the hotelCityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCityCode() {
                    return hotelCityCode;
                }

                /**
                 * Sets the value of the hotelCityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCityCode(String value) {
                    this.hotelCityCode = value;
                }

                /**
                 * Gets the value of the hotelName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelName() {
                    return hotelName;
                }

                /**
                 * Sets the value of the hotelName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelName(String value) {
                    this.hotelName = value;
                }

                /**
                 * Gets the value of the hotelCodeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHotelCodeContext() {
                    return hotelCodeContext;
                }

                /**
                 * Sets the value of the hotelCodeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHotelCodeContext(String value) {
                    this.hotelCodeContext = value;
                }

                /**
                 * Gets the value of the chainName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChainName() {
                    return chainName;
                }

                /**
                 * Sets the value of the chainName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChainName(String value) {
                    this.chainName = value;
                }

                /**
                 * Gets the value of the brandName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBrandName() {
                    return brandName;
                }

                /**
                 * Sets the value of the brandName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBrandName(String value) {
                    this.brandName = value;
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
                 *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" default="IATA" />
                 *       &lt;attribute name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Airport {

                    @XmlAttribute(name = "LocationCode")
                    protected String locationCode;
                    @XmlAttribute(name = "CodeContext")
                    protected String codeContext;
                    @XmlAttribute(name = "AirportName")
                    protected String airportName;

                    /**
                     * Gets the value of the locationCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLocationCode() {
                        return locationCode;
                    }

                    /**
                     * Sets the value of the locationCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLocationCode(String value) {
                        this.locationCode = value;
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
                        if (codeContext == null) {
                            return "IATA";
                        } else {
                            return codeContext;
                        }
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

                    /**
                     * Gets the value of the airportName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAirportName() {
                        return airportName;
                    }

                    /**
                     * Sets the value of the airportName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAirportName(String value) {
                        this.airportName = value;
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
                 *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type">
                 *       &lt;attribute name="PinNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class UserID
                    extends UniqueIDType
                {

                    @XmlAttribute(name = "PinNumber")
                    protected String pinNumber;

                    /**
                     * Gets the value of the pinNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPinNumber() {
                        return pinNumber;
                    }

                    /**
                     * Sets the value of the pinNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPinNumber(String value) {
                        this.pinNumber = value;
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
             *       &lt;sequence>
             *         &lt;element name="Name" type="{http://epowerv5.amadeus.com.tr/WS}PersonNameType" minOccurs="0"/>
             *         &lt;element name="ArrivalLocation" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
             *         &lt;element name="DepartureLocation" type="{http://epowerv5.amadeus.com.tr/WS}LocationType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "arrivalLocation",
                "departureLocation"
            })
            public static class PkgReadRequest {

                @XmlElement(name = "Name")
                protected PersonNameType name;
                @XmlElement(name = "ArrivalLocation")
                protected LocationType arrivalLocation;
                @XmlElement(name = "DepartureLocation")
                protected LocationType departureLocation;
                @XmlAttribute(name = "TravelCode")
                protected String travelCode;
                @XmlAttribute(name = "TourCode")
                protected String tourCode;
                @XmlAttribute(name = "PackageID")
                protected String packageID;
                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;

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
                 * Gets the value of the arrivalLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LocationType }
                 *     
                 */
                public LocationType getArrivalLocation() {
                    return arrivalLocation;
                }

                /**
                 * Sets the value of the arrivalLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LocationType }
                 *     
                 */
                public void setArrivalLocation(LocationType value) {
                    this.arrivalLocation = value;
                }

                /**
                 * Gets the value of the departureLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LocationType }
                 *     
                 */
                public LocationType getDepartureLocation() {
                    return departureLocation;
                }

                /**
                 * Sets the value of the departureLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LocationType }
                 *     
                 */
                public void setDepartureLocation(LocationType value) {
                    this.departureLocation = value;
                }

                /**
                 * Gets the value of the travelCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTravelCode() {
                    return travelCode;
                }

                /**
                 * Sets the value of the travelCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTravelCode(String value) {
                    this.travelCode = value;
                }

                /**
                 * Gets the value of the tourCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTourCode() {
                    return tourCode;
                }

                /**
                 * Sets the value of the tourCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTourCode(String value) {
                    this.tourCode = value;
                }

                /**
                 * Gets the value of the packageID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPackageID() {
                    return packageID;
                }

                /**
                 * Sets the value of the packageID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPackageID(String value) {
                    this.packageID = value;
                }

                /**
                 * Gets the value of the start property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStart() {
                    return start;
                }

                /**
                 * Sets the value of the start property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStart(String value) {
                    this.start = value;
                }

                /**
                 * Gets the value of the duration property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDuration() {
                    return duration;
                }

                /**
                 * Sets the value of the duration property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDuration(String value) {
                    this.duration = value;
                }

                /**
                 * Gets the value of the end property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnd() {
                    return end;
                }

                /**
                 * Sets the value of the end property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnd(String value) {
                    this.end = value;
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
             *       &lt;sequence>
             *         &lt;element name="BookingReferenceID" type="{http://epowerv5.amadeus.com.tr/WS}UniqueID_Type" minOccurs="0"/>
             *         &lt;element name="Verification" type="{http://epowerv5.amadeus.com.tr/WS}VerificationType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="HistoryRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bookingReferenceID",
                "verification"
            })
            public static class ReadRequest {

                @XmlElement(name = "BookingReferenceID")
                protected UniqueIDType bookingReferenceID;
                @XmlElement(name = "Verification")
                protected VerificationType verification;
                @XmlAttribute(name = "HistoryRequestedInd")
                protected Boolean historyRequestedInd;

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
                 * Gets the value of the verification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VerificationType }
                 *     
                 */
                public VerificationType getVerification() {
                    return verification;
                }

                /**
                 * Sets the value of the verification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VerificationType }
                 *     
                 */
                public void setVerification(VerificationType value) {
                    this.verification = value;
                }

                /**
                 * Gets the value of the historyRequestedInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isHistoryRequestedInd() {
                    return historyRequestedInd;
                }

                /**
                 * Sets the value of the historyRequestedInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setHistoryRequestedInd(Boolean value) {
                    this.historyRequestedInd = value;
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
             *     &lt;extension base="{http://epowerv5.amadeus.com.tr/WS}VehicleRetrieveResRQCoreType">
             *       &lt;sequence>
             *         &lt;element name="VehRetResRQInfo" type="{http://epowerv5.amadeus.com.tr/WS}VehicleRetrieveResRQAdditionalInfoType" minOccurs="0"/>
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
                "vehRetResRQInfo"
            })
            public static class VehicleReadRequest
                extends VehicleRetrieveResRQCoreType
            {

                @XmlElement(name = "VehRetResRQInfo")
                protected VehicleRetrieveResRQAdditionalInfoType vehRetResRQInfo;

                /**
                 * Gets the value of the vehRetResRQInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VehicleRetrieveResRQAdditionalInfoType }
                 *     
                 */
                public VehicleRetrieveResRQAdditionalInfoType getVehRetResRQInfo() {
                    return vehRetResRQInfo;
                }

                /**
                 * Sets the value of the vehRetResRQInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VehicleRetrieveResRQAdditionalInfoType }
                 *     
                 */
                public void setVehRetResRQInfo(VehicleRetrieveResRQAdditionalInfoType value) {
                    this.vehRetResRQInfo = value;
                }

            }

        }

    }

}
