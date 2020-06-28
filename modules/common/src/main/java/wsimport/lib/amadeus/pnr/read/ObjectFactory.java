
package wsimport.lib.amadeus.pnr.read;

import wsimport.lib.amadeus.travelbuild.TravelItinerary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.lang.Package;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.traveltalk.wspnrread package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TripXML_QNAME = new QName("http://traveltalk.com/wsPNRRead", "TripXML");
    private final static QName _String_QNAME = new QName("http://traveltalk.com/wsPNRRead", "string");
    private final static QName _AirSeats_QNAME = new QName("http://traveltalk.com/wsPNRRead", "Seats");
    private final static QName _AirOperatingAirline_QNAME = new QName("http://traveltalk.com/wsPNRRead", "OperatingAirline");
    private final static QName _AirEquipment_QNAME = new QName("http://traveltalk.com/wsPNRRead", "Equipment");
    private final static QName _AirMarketingAirline_QNAME = new QName("http://traveltalk.com/wsPNRRead", "MarketingAirline");
    private final static QName _AirArrivalAirport_QNAME = new QName("http://traveltalk.com/wsPNRRead", "ArrivalAirport");
    private final static QName _AirTPAExtensions_QNAME = new QName("http://traveltalk.com/wsPNRRead", "TPA_Extensions");
    private final static QName _AirMarriageGrp_QNAME = new QName("http://traveltalk.com/wsPNRRead", "MarriageGrp");
    private final static QName _AirDepartureAirport_QNAME = new QName("http://traveltalk.com/wsPNRRead", "DepartureAirport");
    private final static QName _TPAExtensionsRSExtraAdult_QNAME = new QName("http://traveltalk.com/wsPNRRead", "ExtraAdult");
    private final static QName _TPAExtensionsRSAgencyCommission_QNAME = new QName("http://traveltalk.com/wsPNRRead", "AgencyCommission");
    private final static QName _TPAExtensionsRSSupplementalInfo_QNAME = new QName("http://traveltalk.com/wsPNRRead", "SupplementalInfo");
    private final static QName _TPAExtensionsRSExtraChild_QNAME = new QName("http://traveltalk.com/wsPNRRead", "ExtraChild");
    private final static QName _TPAExtensionsRSGuestFirstName_QNAME = new QName("http://traveltalk.com/wsPNRRead", "GuestFirstName");
    private final static QName _TPAExtensionsRSOriginCityCode_QNAME = new QName("http://traveltalk.com/wsPNRRead", "OriginCityCode");
    private final static QName _TPAExtensionsRSIssuedTickets_QNAME = new QName("http://traveltalk.com/wsPNRRead", "IssuedTickets");
    private final static QName _TPAExtensionsRSAlternateCurrency_QNAME = new QName("http://traveltalk.com/wsPNRRead", "AlternateCurrency");
    private final static QName _TPAExtensionsRSArnk_QNAME = new QName("http://traveltalk.com/wsPNRRead", "Arnk");
    private final static QName _TPAExtensionsRSTourNumber_QNAME = new QName("http://traveltalk.com/wsPNRRead", "TourNumber");
    private final static QName _TPAExtensionsRSOverrideCorporateRate_QNAME = new QName("http://traveltalk.com/wsPNRRead", "OverrideCorporateRate");
    private final static QName _TPAExtensionsRSAccountingInfo_QNAME = new QName("http://traveltalk.com/wsPNRRead", "AccountingInfo");
    private final static QName _TPAExtensionsRSCrib_QNAME = new QName("http://traveltalk.com/wsPNRRead", "Crib");
    private final static QName _TPAExtensionsRSCorporateDiscount_QNAME = new QName("http://traveltalk.com/wsPNRRead", "CorporateDiscount");
    private final static QName _TPAExtensionsRSGuestLastName_QNAME = new QName("http://traveltalk.com/wsPNRRead", "GuestLastName");
    private final static QName _TPAExtensionsRSPaymentCard_QNAME = new QName("http://traveltalk.com/wsPNRRead", "PaymentCard");
    private final static QName _TPAExtensionsRSDestinationRailwayStation_QNAME = new QName("http://traveltalk.com/wsPNRRead", "DestinationRailwayStation");
    private final static QName _TPAExtensionsRSMealPlan_QNAME = new QName("http://traveltalk.com/wsPNRRead", "MealPlan");
    private final static QName _TPAExtensionsRSFuturePriceInfo_QNAME = new QName("http://traveltalk.com/wsPNRRead", "FuturePriceInfo");
    private final static QName _TPAExtensionsRSAccountingLine_QNAME = new QName("http://traveltalk.com/wsPNRRead", "AccountingLine");
    private final static QName _TPAExtensionsRSRateRequested_QNAME = new QName("http://traveltalk.com/wsPNRRead", "RateRequested");
    private final static QName _TPAExtensionsRSCarType_QNAME = new QName("http://traveltalk.com/wsPNRRead", "CarType");
    private final static QName _TPAExtensionsRSAgencyServiceFee_QNAME = new QName("http://traveltalk.com/wsPNRRead", "AgencyServiceFee");
    private final static QName _TPAExtensionsRSOriginRailwayStation_QNAME = new QName("http://traveltalk.com/wsPNRRead", "OriginRailwayStation");
    private final static QName _TPAExtensionsRSBagAllowance_QNAME = new QName("http://traveltalk.com/wsPNRRead", "BagAllowance");
    private final static QName _TPAExtensionsRSRollawayChild_QNAME = new QName("http://traveltalk.com/wsPNRRead", "RollawayChild");
    private final static QName _TPAExtensionsRSAdvancedDeposit_QNAME = new QName("http://traveltalk.com/wsPNRRead", "AdvancedDeposit");
    private final static QName _TPAExtensionsRSFareCalculation_QNAME = new QName("http://traveltalk.com/wsPNRRead", "FareCalculation");
    private final static QName _TPAExtensionsRSMerchantCurrency_QNAME = new QName("http://traveltalk.com/wsPNRRead", "MerchantCurrency");
    private final static QName _TPAExtensionsRSRules_QNAME = new QName("http://traveltalk.com/wsPNRRead", "Rules");
    private final static QName _TPAExtensionsRSPaymentRestrictions_QNAME = new QName("http://traveltalk.com/wsPNRRead", "PaymentRestrictions");
    private final static QName _TPAExtensionsRSValidatingAirlineCode_QNAME = new QName("http://traveltalk.com/wsPNRRead", "ValidatingAirlineCode");
    private final static QName _TPAExtensionsRSVendor_QNAME = new QName("http://traveltalk.com/wsPNRRead", "Vendor");
    private final static QName _TPAExtensionsRSFareRules_QNAME = new QName("http://traveltalk.com/wsPNRRead", "FareRules");
    private final static QName _TPAExtensionsRSRoomLocation_QNAME = new QName("http://traveltalk.com/wsPNRRead", "RoomLocation");
    private final static QName _TPAExtensionsRSRateQuoted_QNAME = new QName("http://traveltalk.com/wsPNRRead", "RateQuoted");
    private final static QName _TPAExtensionsRSRollawayAdult_QNAME = new QName("http://traveltalk.com/wsPNRRead", "RollawayAdult");
    private final static QName _TPAExtensionsRSCarOptions_QNAME = new QName("http://traveltalk.com/wsPNRRead", "CarOptions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.traveltalk.wspnrread
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WmPNRRead }
     * 
     */
    public WmPNRRead createWmPNRRead() {
        return new WmPNRRead();
    }

    /**
     * Create an instance of {@link OTAReadRQ }
     * 
     */
    public OTAReadRQ createOTAReadRQ() {
        return new OTAReadRQ();
    }

    /**
     * Create an instance of {@link WmPNRReadResponse }
     * 
     */
    public WmPNRReadResponse createWmPNRReadResponse() {
        return new WmPNRReadResponse();
    }

    /**
     * Create an instance of {@link OTATravelItineraryRS }
     * 
     */
    public OTATravelItineraryRS createOTATravelItineraryRS() {
        return new OTATravelItineraryRS();
    }

    /**
     * Create an instance of {@link WmPNRReadXmlResponse }
     * 
     */
    public WmPNRReadXmlResponse createWmPNRReadXmlResponse() {
        return new WmPNRReadXmlResponse();
    }

    /**
     * Create an instance of {@link WmPNRReadXml }
     * 
     */
    public WmPNRReadXml createWmPNRReadXml() {
        return new WmPNRReadXml();
    }

    /**
     * Create an instance of {@link TripXML }
     * 
     */
    public TripXML createTripXML() {
        return new TripXML();
    }

    /**
     * Create an instance of {@link Seat }
     * 
     */
    public Seat createSeat() {
        return new Seat();
    }

    /**
     * Create an instance of {@link TravelItinerary }
     * 
     */
    public TravelItinerary createTravelItinerary() {
        return new TravelItinerary();
    }

    /**
     * Create an instance of {@link Airline }
     * 
     */
    public Airline createAirline() {
        return new Airline();
    }

    /**
     * Create an instance of {@link ArrayOfPricedEquip }
     * 
     */
    public ArrayOfPricedEquip createArrayOfPricedEquip() {
        return new ArrayOfPricedEquip();
    }

    /**
     * Create an instance of {@link ArrayOfRate }
     * 
     */
    public ArrayOfRate createArrayOfRate() {
        return new ArrayOfRate();
    }

    /**
     * Create an instance of {@link VehRentalCore }
     * 
     */
    public VehRentalCore createVehRentalCore() {
        return new VehRentalCore();
    }

    /**
     * Create an instance of {@link ProfileRefRS }
     * 
     */
    public ProfileRefRS createProfileRefRS() {
        return new ProfileRefRS();
    }

    /**
     * Create an instance of {@link IssuedTicket }
     * 
     */
    public IssuedTicket createIssuedTicket() {
        return new IssuedTicket();
    }

    /**
     * Create an instance of {@link Remark }
     * 
     */
    public Remark createRemark() {
        return new Remark();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialServiceRequest }
     * 
     */
    public ArrayOfSpecialServiceRequest createArrayOfSpecialServiceRequest() {
        return new ArrayOfSpecialServiceRequest();
    }

    /**
     * Create an instance of {@link TaxAmount }
     * 
     */
    public TaxAmount createTaxAmount() {
        return new TaxAmount();
    }

    /**
     * Create an instance of {@link UniqueIDRQ }
     * 
     */
    public UniqueIDRQ createUniqueIDRQ() {
        return new UniqueIDRQ();
    }

    /**
     * Create an instance of {@link GuaranteeRS }
     * 
     */
    public GuaranteeRS createGuaranteeRS() {
        return new GuaranteeRS();
    }

    /**
     * Create an instance of {@link TelephoneRS }
     * 
     */
    public TelephoneRS createTelephoneRS() {
        return new TelephoneRS();
    }

    /**
     * Create an instance of {@link RelatedTraveler }
     * 
     */
    public RelatedTraveler createRelatedTraveler() {
        return new RelatedTraveler();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link ReturnLocation }
     * 
     */
    public ReturnLocation createReturnLocation() {
        return new ReturnLocation();
    }

    /**
     * Create an instance of {@link Cruise }
     * 
     */
    public Cruise createCruise() {
        return new Cruise();
    }

    /**
     * Create an instance of {@link CustLoyaltyRS }
     * 
     */
    public CustLoyaltyRS createCustLoyaltyRS() {
        return new CustLoyaltyRS();
    }

    /**
     * Create an instance of {@link MaximumStayRS }
     * 
     */
    public MaximumStayRS createMaximumStayRS() {
        return new MaximumStayRS();
    }

    /**
     * Create an instance of {@link CustomerRS }
     * 
     */
    public CustomerRS createCustomerRS() {
        return new CustomerRS();
    }

    /**
     * Create an instance of {@link GuestCountsRS }
     * 
     */
    public GuestCountsRS createGuestCountsRS() {
        return new GuestCountsRS();
    }

    /**
     * Create an instance of {@link FeeRS }
     * 
     */
    public FeeRS createFeeRS() {
        return new FeeRS();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownRS }
     * 
     */
    public PTCFareBreakdownRS createPTCFareBreakdownRS() {
        return new PTCFareBreakdownRS();
    }

    /**
     * Create an instance of {@link POS }
     * 
     */
    public POS createPOS() {
        return new POS();
    }

    /**
     * Create an instance of {@link AccessPerson }
     * 
     */
    public AccessPerson createAccessPerson() {
        return new AccessPerson();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link AssocItemRef }
     * 
     */
    public AssocItemRef createAssocItemRef() {
        return new AssocItemRef();
    }

    /**
     * Create an instance of {@link ManualTicket }
     * 
     */
    public ManualTicket createManualTicket() {
        return new ManualTicket();
    }

    /**
     * Create an instance of {@link FlightRefNumber }
     * 
     */
    public FlightRefNumber createFlightRefNumber() {
        return new FlightRefNumber();
    }

    /**
     * Create an instance of {@link AirReadRequest }
     * 
     */
    public AirReadRequest createAirReadRequest() {
        return new AirReadRequest();
    }

    /**
     * Create an instance of {@link AssocItems }
     * 
     */
    public AssocItems createAssocItems() {
        return new AssocItems();
    }

    /**
     * Create an instance of {@link VendorRQ }
     * 
     */
    public VendorRQ createVendorRQ() {
        return new VendorRQ();
    }

    /**
     * Create an instance of {@link PaymentCardRS }
     * 
     */
    public PaymentCardRS createPaymentCardRS() {
        return new PaymentCardRS();
    }

    /**
     * Create an instance of {@link DirectBillRS }
     * 
     */
    public DirectBillRS createDirectBillRS() {
        return new DirectBillRS();
    }

    /**
     * Create an instance of {@link ArrayOfUniqueRemark }
     * 
     */
    public ArrayOfUniqueRemark createArrayOfUniqueRemark() {
        return new ArrayOfUniqueRemark();
    }

    /**
     * Create an instance of {@link CountryName }
     * 
     */
    public CountryName createCountryName() {
        return new CountryName();
    }

    /**
     * Create an instance of {@link DepartureLocation }
     * 
     */
    public DepartureLocation createDepartureLocation() {
        return new DepartureLocation();
    }

    /**
     * Create an instance of {@link EndDateWindowRS }
     * 
     */
    public EndDateWindowRS createEndDateWindowRS() {
        return new EndDateWindowRS();
    }

    /**
     * Create an instance of {@link VehicleCharge }
     * 
     */
    public VehicleCharge createVehicleCharge() {
        return new VehicleCharge();
    }

    /**
     * Create an instance of {@link TPAExtensionsRS }
     * 
     */
    public TPAExtensionsRS createTPAExtensionsRS() {
        return new TPAExtensionsRS();
    }

    /**
     * Create an instance of {@link IssuedTickets }
     * 
     */
    public IssuedTickets createIssuedTickets() {
        return new IssuedTickets();
    }

    /**
     * Create an instance of {@link ArrivalLocation }
     * 
     */
    public ArrivalLocation createArrivalLocation() {
        return new ArrivalLocation();
    }

    /**
     * Create an instance of {@link PaymentForm }
     * 
     */
    public PaymentForm createPaymentForm() {
        return new PaymentForm();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoRS }
     * 
     */
    public BasicPropertyInfoRS createBasicPropertyInfoRS() {
        return new BasicPropertyInfoRS();
    }

    /**
     * Create an instance of {@link CreditCardInfo }
     * 
     */
    public CreditCardInfo createCreditCardInfo() {
        return new CreditCardInfo();
    }

    /**
     * Create an instance of {@link EmployeeInfo }
     * 
     */
    public EmployeeInfo createEmployeeInfo() {
        return new EmployeeInfo();
    }

    /**
     * Create an instance of {@link RateQualifierRS }
     * 
     */
    public RateQualifierRS createRateQualifierRS() {
        return new RateQualifierRS();
    }

    /**
     * Create an instance of {@link Tour }
     * 
     */
    public Tour createTour() {
        return new Tour();
    }

    /**
     * Create an instance of {@link GuestCountRS }
     * 
     */
    public GuestCountRS createGuestCountRS() {
        return new GuestCountRS();
    }

    /**
     * Create an instance of {@link StateProv }
     * 
     */
    public StateProv createStateProv() {
        return new StateProv();
    }

    /**
     * Create an instance of {@link AdvTicketingRS }
     * 
     */
    public AdvTicketingRS createAdvTicketingRS() {
        return new AdvTicketingRS();
    }

    /**
     * Create an instance of {@link GuaranteesAcceptedRS }
     * 
     */
    public GuaranteesAcceptedRS createGuaranteesAcceptedRS() {
        return new GuaranteesAcceptedRS();
    }

    /**
     * Create an instance of {@link AgencyAcctNumber }
     * 
     */
    public AgencyAcctNumber createAgencyAcctNumber() {
        return new AgencyAcctNumber();
    }

    /**
     * Create an instance of {@link ReservationItems }
     * 
     */
    public ReservationItems createReservationItems() {
        return new ReservationItems();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantityRS }
     * 
     */
    public PassengerTypeQuantityRS createPassengerTypeQuantityRS() {
        return new PassengerTypeQuantityRS();
    }

    /**
     * Create an instance of {@link TicketingRS }
     * 
     */
    public TicketingRS createTicketingRS() {
        return new TicketingRS();
    }

    /**
     * Create an instance of {@link AmountPercent }
     * 
     */
    public AmountPercent createAmountPercent() {
        return new AmountPercent();
    }

    /**
     * Create an instance of {@link UniqueID }
     * 
     */
    public UniqueID createUniqueID() {
        return new UniqueID();
    }

    /**
     * Create an instance of {@link DocumentRS }
     * 
     */
    public DocumentRS createDocumentRS() {
        return new DocumentRS();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link AdvResTicketingRS }
     * 
     */
    public AdvResTicketingRS createAdvResTicketingRS() {
        return new AdvResTicketingRS();
    }

    /**
     * Create an instance of {@link DateWindowRangeRS }
     * 
     */
    public DateWindowRangeRS createDateWindowRangeRS() {
        return new DateWindowRangeRS();
    }

    /**
     * Create an instance of {@link AddressRS }
     * 
     */
    public AddressRS createAddressRS() {
        return new AddressRS();
    }

    /**
     * Create an instance of {@link EndLocation }
     * 
     */
    public EndLocation createEndLocation() {
        return new EndLocation();
    }

    /**
     * Create an instance of {@link Commission }
     * 
     */
    public Commission createCommission() {
        return new Commission();
    }

    /**
     * Create an instance of {@link CustomerInfoRS }
     * 
     */
    public CustomerInfoRS createCustomerInfoRS() {
        return new CustomerInfoRS();
    }

    /**
     * Create an instance of {@link MinMax }
     * 
     */
    public MinMax createMinMax() {
        return new MinMax();
    }

    /**
     * Create an instance of {@link SpecialServiceRequest }
     * 
     */
    public SpecialServiceRequest createSpecialServiceRequest() {
        return new SpecialServiceRequest();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link StartLocation }
     * 
     */
    public StartLocation createStartLocation() {
        return new StartLocation();
    }

    /**
     * Create an instance of {@link TicketNumber }
     * 
     */
    public TicketNumber createTicketNumber() {
        return new TicketNumber();
    }

    /**
     * Create an instance of {@link CommentRS }
     * 
     */
    public CommentRS createCommentRS() {
        return new CommentRS();
    }

    /**
     * Create an instance of {@link GuaranteeDescriptionRS }
     * 
     */
    public GuaranteeDescriptionRS createGuaranteeDescriptionRS() {
        return new GuaranteeDescriptionRS();
    }

    /**
     * Create an instance of {@link IssuedInvoice }
     * 
     */
    public IssuedInvoice createIssuedInvoice() {
        return new IssuedInvoice();
    }

    /**
     * Create an instance of {@link ItineraryRef }
     * 
     */
    public ItineraryRef createItineraryRef() {
        return new ItineraryRef();
    }

    /**
     * Create an instance of {@link TelephoneInfo }
     * 
     */
    public TelephoneInfo createTelephoneInfo() {
        return new TelephoneInfo();
    }

    /**
     * Create an instance of {@link CustLoyalty }
     * 
     */
    public CustLoyalty createCustLoyalty() {
        return new CustLoyalty();
    }

    /**
     * Create an instance of {@link Amenity }
     * 
     */
    public Amenity createAmenity() {
        return new Amenity();
    }

    /**
     * Create an instance of {@link TaxesRS }
     * 
     */
    public TaxesRS createTaxesRS() {
        return new TaxesRS();
    }

    /**
     * Create an instance of {@link GuaranteeAcceptedRS }
     * 
     */
    public GuaranteeAcceptedRS createGuaranteeAcceptedRS() {
        return new GuaranteeAcceptedRS();
    }

    /**
     * Create an instance of {@link RoomRateRS }
     * 
     */
    public RoomRateRS createRoomRateRS() {
        return new RoomRateRS();
    }

    /**
     * Create an instance of {@link FareInfoRS }
     * 
     */
    public FareInfoRS createFareInfoRS() {
        return new FareInfoRS();
    }

    /**
     * Create an instance of {@link BagAllowance }
     * 
     */
    public BagAllowance createBagAllowance() {
        return new BagAllowance();
    }

    /**
     * Create an instance of {@link Airport }
     * 
     */
    public Airport createAirport() {
        return new Airport();
    }

    /**
     * Create an instance of {@link CarOption }
     * 
     */
    public CarOption createCarOption() {
        return new CarOption();
    }

    /**
     * Create an instance of {@link General }
     * 
     */
    public General createGeneral() {
        return new General();
    }

    /**
     * Create an instance of {@link SpecialRemarkRSA }
     * 
     */
    public SpecialRemarkRSA createSpecialRemarkRSA() {
        return new SpecialRemarkRSA();
    }

    /**
     * Create an instance of {@link ArrayOfWarning }
     * 
     */
    public ArrayOfWarning createArrayOfWarning() {
        return new ArrayOfWarning();
    }

    /**
     * Create an instance of {@link AssociatedQuantity }
     * 
     */
    public AssociatedQuantity createAssociatedQuantity() {
        return new AssociatedQuantity();
    }

    /**
     * Create an instance of {@link CardIssuerName }
     * 
     */
    public CardIssuerName createCardIssuerName() {
        return new CardIssuerName();
    }

    /**
     * Create an instance of {@link TPAExtensions }
     * 
     */
    public TPAExtensions createTPAExtensions() {
        return new TPAExtensions();
    }

    /**
     * Create an instance of {@link DestinationRailwayStation }
     * 
     */
    public DestinationRailwayStation createDestinationRailwayStation() {
        return new DestinationRailwayStation();
    }

    /**
     * Create an instance of {@link AccountingInfo }
     * 
     */
    public AccountingInfo createAccountingInfo() {
        return new AccountingInfo();
    }

    /**
     * Create an instance of {@link ArrayOfSeatRequest }
     * 
     */
    public ArrayOfSeatRequest createArrayOfSeatRequest() {
        return new ArrayOfSeatRequest();
    }

    /**
     * Create an instance of {@link RuleInfoRS }
     * 
     */
    public RuleInfoRS createRuleInfoRS() {
        return new RuleInfoRS();
    }

    /**
     * Create an instance of {@link DepartureAirport }
     * 
     */
    public DepartureAirport createDepartureAirport() {
        return new DepartureAirport();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link ArrayOfSeat }
     * 
     */
    public ArrayOfSeat createArrayOfSeat() {
        return new ArrayOfSeat();
    }

    /**
     * Create an instance of {@link RoomRatesRS }
     * 
     */
    public RoomRatesRS createRoomRatesRS() {
        return new RoomRatesRS();
    }

    /**
     * Create an instance of {@link ArrayOfError }
     * 
     */
    public ArrayOfError createArrayOfError() {
        return new ArrayOfError();
    }

    /**
     * Create an instance of {@link Charge }
     * 
     */
    public Charge createCharge() {
        return new Charge();
    }

    /**
     * Create an instance of {@link SpecialRemarkRS }
     * 
     */
    public SpecialRemarkRS createSpecialRemarkRS() {
        return new SpecialRemarkRS();
    }

    /**
     * Create an instance of {@link Base }
     * 
     */
    public Base createBase() {
        return new Base();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link ArrayOfPTCFareBreakdownRS }
     * 
     */
    public ArrayOfPTCFareBreakdownRS createArrayOfPTCFareBreakdownRS() {
        return new ArrayOfPTCFareBreakdownRS();
    }

    /**
     * Create an instance of {@link ArrayOfFareInfoRS }
     * 
     */
    public ArrayOfFareInfoRS createArrayOfFareInfoRS() {
        return new ArrayOfFareInfoRS();
    }

    /**
     * Create an instance of {@link ChargesRulesRS }
     * 
     */
    public ChargesRulesRS createChargesRulesRS() {
        return new ChargesRulesRS();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link CostTotals }
     * 
     */
    public CostTotals createCostTotals() {
        return new CostTotals();
    }

    /**
     * Create an instance of {@link AirFareInfo }
     * 
     */
    public AirFareInfo createAirFareInfo() {
        return new AirFareInfo();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link RoomTypesRS }
     * 
     */
    public RoomTypesRS createRoomTypesRS() {
        return new RoomTypesRS();
    }

    /**
     * Create an instance of {@link ListItem }
     * 
     */
    public ListItem createListItem() {
        return new ListItem();
    }

    /**
     * Create an instance of {@link LengthOfStayRulesRS }
     * 
     */
    public LengthOfStayRulesRS createLengthOfStayRulesRS() {
        return new LengthOfStayRulesRS();
    }

    /**
     * Create an instance of {@link VoucherRS }
     * 
     */
    public VoucherRS createVoucherRS() {
        return new VoucherRS();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Access }
     * 
     */
    public Access createAccess() {
        return new Access();
    }

    /**
     * Create an instance of {@link ContactPerson }
     * 
     */
    public ContactPerson createContactPerson() {
        return new ContactPerson();
    }

    /**
     * Create an instance of {@link ArrayOfFeeRS }
     * 
     */
    public ArrayOfFeeRS createArrayOfFeeRS() {
        return new ArrayOfFeeRS();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link UpdatedBy }
     * 
     */
    public UpdatedBy createUpdatedBy() {
        return new UpdatedBy();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlan }
     * 
     */
    public ArrayOfRatePlan createArrayOfRatePlan() {
        return new ArrayOfRatePlan();
    }

    /**
     * Create an instance of {@link ArrayOfFeeRS1 }
     * 
     */
    public ArrayOfFeeRS1 createArrayOfFeeRS1() {
        return new ArrayOfFeeRS1();
    }

    /**
     * Create an instance of {@link ArrayOfTaxAmount }
     * 
     */
    public ArrayOfTaxAmount createArrayOfTaxAmount() {
        return new ArrayOfTaxAmount();
    }

    /**
     * Create an instance of {@link HotelReadRequest }
     * 
     */
    public HotelReadRequest createHotelReadRequest() {
        return new HotelReadRequest();
    }

    /**
     * Create an instance of {@link VoluntaryChangesRS }
     * 
     */
    public VoluntaryChangesRS createVoluntaryChangesRS() {
        return new VoluntaryChangesRS();
    }

    /**
     * Create an instance of {@link MinimumStayRS }
     * 
     */
    public MinimumStayRS createMinimumStayRS() {
        return new MinimumStayRS();
    }

    /**
     * Create an instance of {@link Membership }
     * 
     */
    public Membership createMembership() {
        return new Membership();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link Calculation }
     * 
     */
    public Calculation createCalculation() {
        return new Calculation();
    }

    /**
     * Create an instance of {@link VehicleCharges }
     * 
     */
    public VehicleCharges createVehicleCharges() {
        return new VehicleCharges();
    }

    /**
     * Create an instance of {@link AccessComment }
     * 
     */
    public AccessComment createAccessComment() {
        return new AccessComment();
    }

    /**
     * Create an instance of {@link TaxDescription }
     * 
     */
    public TaxDescription createTaxDescription() {
        return new TaxDescription();
    }

    /**
     * Create an instance of {@link RateRestrictions }
     * 
     */
    public RateRestrictions createRateRestrictions() {
        return new RateRestrictions();
    }

    /**
     * Create an instance of {@link MarketingAirline }
     * 
     */
    public MarketingAirline createMarketingAirline() {
        return new MarketingAirline();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link Rate }
     * 
     */
    public Rate createRate() {
        return new Rate();
    }

    /**
     * Create an instance of {@link VehRetResRQInfo }
     * 
     */
    public VehRetResRQInfo createVehRetResRQInfo() {
        return new VehRetResRQInfo();
    }

    /**
     * Create an instance of {@link Air }
     * 
     */
    public Air createAir() {
        return new Air();
    }

    /**
     * Create an instance of {@link AcceptedPaymentRS }
     * 
     */
    public AcceptedPaymentRS createAcceptedPaymentRS() {
        return new AcceptedPaymentRS();
    }

    /**
     * Create an instance of {@link RequestorID }
     * 
     */
    public RequestorID createRequestorID() {
        return new RequestorID();
    }

    /**
     * Create an instance of {@link ItineraryInfo }
     * 
     */
    public ItineraryInfo createItineraryInfo() {
        return new ItineraryInfo();
    }

    /**
     * Create an instance of {@link SeatRequest }
     * 
     */
    public SeatRequest createSeatRequest() {
        return new SeatRequest();
    }

    /**
     * Create an instance of {@link ItineraryPricing }
     * 
     */
    public ItineraryPricing createItineraryPricing() {
        return new ItineraryPricing();
    }

    /**
     * Create an instance of {@link TicketAdvisory }
     * 
     */
    public TicketAdvisory createTicketAdvisory() {
        return new TicketAdvisory();
    }

    /**
     * Create an instance of {@link Package }
     *
     */
    public wsimport.lib.amadeus.pnr.read.Package createPackage() {
        return new wsimport.lib.amadeus.pnr.read.Package();
    }

    /**
     * Create an instance of {@link ManualDocument }
     * 
     */
    public ManualDocument createManualDocument() {
        return new ManualDocument();
    }

    /**
     * Create an instance of {@link VehClassRS }
     * 
     */
    public VehClassRS createVehClassRS() {
        return new VehClassRS();
    }

    /**
     * Create an instance of {@link PickUpLocation }
     * 
     */
    public PickUpLocation createPickUpLocation() {
        return new PickUpLocation();
    }

    /**
     * Create an instance of {@link Warning }
     * 
     */
    public Warning createWarning() {
        return new Warning();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link VehTypeRS }
     * 
     */
    public VehTypeRS createVehTypeRS() {
        return new VehTypeRS();
    }

    /**
     * Create an instance of {@link TravelCost }
     * 
     */
    public TravelCost createTravelCost() {
        return new TravelCost();
    }

    /**
     * Create an instance of {@link ArrayOfOtherServiceInformation }
     * 
     */
    public ArrayOfOtherServiceInformation createArrayOfOtherServiceInformation() {
        return new ArrayOfOtherServiceInformation();
    }

    /**
     * Create an instance of {@link RatePlan }
     * 
     */
    public RatePlan createRatePlan() {
        return new RatePlan();
    }

    /**
     * Create an instance of {@link URL }
     * 
     */
    public URL createURL() {
        return new URL();
    }

    /**
     * Create an instance of {@link LoyaltyRedemptionRS }
     * 
     */
    public LoyaltyRedemptionRS createLoyaltyRedemptionRS() {
        return new LoyaltyRedemptionRS();
    }

    /**
     * Create an instance of {@link CitizenCountryNameRS }
     * 
     */
    public CitizenCountryNameRS createCitizenCountryNameRS() {
        return new CitizenCountryNameRS();
    }

    /**
     * Create an instance of {@link AirlineRQ }
     * 
     */
    public AirlineRQ createAirlineRQ() {
        return new AirlineRQ();
    }

    /**
     * Create an instance of {@link PricedEquip }
     * 
     */
    public PricedEquip createPricedEquip() {
        return new PricedEquip();
    }

    /**
     * Create an instance of {@link AssocItem }
     * 
     */
    public AssocItem createAssocItem() {
        return new AssocItem();
    }

    /**
     * Create an instance of {@link ReadRequest }
     * 
     */
    public ReadRequest createReadRequest() {
        return new ReadRequest();
    }

    /**
     * Create an instance of {@link VehicleReadRequest }
     * 
     */
    public VehicleReadRequest createVehicleReadRequest() {
        return new VehicleReadRequest();
    }

    /**
     * Create an instance of {@link TotalFareRS }
     * 
     */
    public TotalFareRS createTotalFareRS() {
        return new TotalFareRS();
    }

    /**
     * Create an instance of {@link GlobalReservationReadRequest }
     * 
     */
    public GlobalReservationReadRequest createGlobalReservationReadRequest() {
        return new GlobalReservationReadRequest();
    }

    /**
     * Create an instance of {@link FormOfPaymentRS }
     * 
     */
    public FormOfPaymentRS createFormOfPaymentRS() {
        return new FormOfPaymentRS();
    }

    /**
     * Create an instance of {@link Verification }
     * 
     */
    public Verification createVerification() {
        return new Verification();
    }

    /**
     * Create an instance of {@link TotalCharge }
     * 
     */
    public TotalCharge createTotalCharge() {
        return new TotalCharge();
    }

    /**
     * Create an instance of {@link BookingChannel }
     * 
     */
    public BookingChannel createBookingChannel() {
        return new BookingChannel();
    }

    /**
     * Create an instance of {@link EquivFareRS }
     * 
     */
    public EquivFareRS createEquivFareRS() {
        return new EquivFareRS();
    }

    /**
     * Create an instance of {@link Veh }
     * 
     */
    public Veh createVeh() {
        return new Veh();
    }

    /**
     * Create an instance of {@link AgencyServiceFee }
     * 
     */
    public AgencyServiceFee createAgencyServiceFee() {
        return new AgencyServiceFee();
    }

    /**
     * Create an instance of {@link RentalRate }
     * 
     */
    public RentalRate createRentalRate() {
        return new RentalRate();
    }

    /**
     * Create an instance of {@link AutomatedTicket }
     * 
     */
    public AutomatedTicket createAutomatedTicket() {
        return new AutomatedTicket();
    }

    /**
     * Create an instance of {@link DocumentInfo }
     * 
     */
    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    /**
     * Create an instance of {@link ReadRequests }
     * 
     */
    public ReadRequests createReadRequests() {
        return new ReadRequests();
    }

    /**
     * Create an instance of {@link FuturePriceInfo }
     * 
     */
    public FuturePriceInfo createFuturePriceInfo() {
        return new FuturePriceInfo();
    }

    /**
     * Create an instance of {@link TimeSpanRS }
     * 
     */
    public TimeSpanRS createTimeSpanRS() {
        return new TimeSpanRS();
    }

    /**
     * Create an instance of {@link PaymentCard }
     * 
     */
    public PaymentCard createPaymentCard() {
        return new PaymentCard();
    }

    /**
     * Create an instance of {@link GolfReadRequest }
     * 
     */
    public GolfReadRequest createGolfReadRequest() {
        return new GolfReadRequest();
    }

    /**
     * Create an instance of {@link BankAcct }
     * 
     */
    public BankAcct createBankAcct() {
        return new BankAcct();
    }

    /**
     * Create an instance of {@link StartDateWindowRS }
     * 
     */
    public StartDateWindowRS createStartDateWindowRS() {
        return new StartDateWindowRS();
    }

    /**
     * Create an instance of {@link CompanyName }
     * 
     */
    public CompanyName createCompanyName() {
        return new CompanyName();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link Rail }
     * 
     */
    public Rail createRail() {
        return new Rail();
    }

    /**
     * Create an instance of {@link CardIssuerNameRS }
     * 
     */
    public CardIssuerNameRS createCardIssuerNameRS() {
        return new CardIssuerNameRS();
    }

    /**
     * Create an instance of {@link BaseFareRS }
     * 
     */
    public BaseFareRS createBaseFareRS() {
        return new BaseFareRS();
    }

    /**
     * Create an instance of {@link ArrayOfCommentRS }
     * 
     */
    public ArrayOfCommentRS createArrayOfCommentRS() {
        return new ArrayOfCommentRS();
    }

    /**
     * Create an instance of {@link RemarksRS }
     * 
     */
    public RemarksRS createRemarksRS() {
        return new RemarksRS();
    }

    /**
     * Create an instance of {@link AgencyCommission }
     * 
     */
    public AgencyCommission createAgencyCommission() {
        return new AgencyCommission();
    }

    /**
     * Create an instance of {@link ElectronicTicket }
     * 
     */
    public ElectronicTicket createElectronicTicket() {
        return new ElectronicTicket();
    }

    /**
     * Create an instance of {@link ReservationTimeSpan }
     * 
     */
    public ReservationTimeSpan createReservationTimeSpan() {
        return new ReservationTimeSpan();
    }

    /**
     * Create an instance of {@link PaymentAmountRS }
     * 
     */
    public PaymentAmountRS createPaymentAmountRS() {
        return new PaymentAmountRS();
    }

    /**
     * Create an instance of {@link AdvReservation }
     * 
     */
    public AdvReservation createAdvReservation() {
        return new AdvReservation();
    }

    /**
     * Create an instance of {@link Deadline }
     * 
     */
    public Deadline createDeadline() {
        return new Deadline();
    }

    /**
     * Create an instance of {@link AccountVendor }
     * 
     */
    public AccountVendor createAccountVendor() {
        return new AccountVendor();
    }

    /**
     * Create an instance of {@link SpecialRequestDetails }
     * 
     */
    public SpecialRequestDetails createSpecialRequestDetails() {
        return new SpecialRequestDetails();
    }

    /**
     * Create an instance of {@link CustomerInfosRS }
     * 
     */
    public CustomerInfosRS createCustomerInfosRS() {
        return new CustomerInfosRS();
    }

    /**
     * Create an instance of {@link TravelerName }
     * 
     */
    public TravelerName createTravelerName() {
        return new TravelerName();
    }

    /**
     * Create an instance of {@link MiscChargeOrderRS }
     * 
     */
    public MiscChargeOrderRS createMiscChargeOrderRS() {
        return new MiscChargeOrderRS();
    }

    /**
     * Create an instance of {@link DepositPaymentRS }
     * 
     */
    public DepositPaymentRS createDepositPaymentRS() {
        return new DepositPaymentRS();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link ArrayOfCarOption }
     * 
     */
    public ArrayOfCarOption createArrayOfCarOption() {
        return new ArrayOfCarOption();
    }

    /**
     * Create an instance of {@link RoomDescriptionRS }
     * 
     */
    public RoomDescriptionRS createRoomDescriptionRS() {
        return new RoomDescriptionRS();
    }

    /**
     * Create an instance of {@link PenaltyRS }
     * 
     */
    public PenaltyRS createPenaltyRS() {
        return new PenaltyRS();
    }

    /**
     * Create an instance of {@link TaxRS }
     * 
     */
    public TaxRS createTaxRS() {
        return new TaxRS();
    }

    /**
     * Create an instance of {@link FilingAirline }
     * 
     */
    public FilingAirline createFilingAirline() {
        return new FilingAirline();
    }

    /**
     * Create an instance of {@link Telephone }
     * 
     */
    public Telephone createTelephone() {
        return new Telephone();
    }

    /**
     * Create an instance of {@link ArrivalAirport }
     * 
     */
    public ArrivalAirport createArrivalAirport() {
        return new ArrivalAirport();
    }

    /**
     * Create an instance of {@link RoomTypeRS }
     * 
     */
    public RoomTypeRS createRoomTypeRS() {
        return new RoomTypeRS();
    }

    /**
     * Create an instance of {@link TravelerRefNumber }
     * 
     */
    public TravelerRefNumber createTravelerRefNumber() {
        return new TravelerRefNumber();
    }

    /**
     * Create an instance of {@link VehMakeModel }
     * 
     */
    public VehMakeModel createVehMakeModel() {
        return new VehMakeModel();
    }

    /**
     * Create an instance of {@link ArrayOfAcceptedPaymentRS }
     * 
     */
    public ArrayOfAcceptedPaymentRS createArrayOfAcceptedPaymentRS() {
        return new ArrayOfAcceptedPaymentRS();
    }

    /**
     * Create an instance of {@link AssociatedContent }
     * 
     */
    public AssociatedContent createAssociatedContent() {
        return new AssociatedContent();
    }

    /**
     * Create an instance of {@link Cost }
     * 
     */
    public Cost createCost() {
        return new Cost();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link ResTicketingRulesRS }
     * 
     */
    public ResTicketingRulesRS createResTicketingRulesRS() {
        return new ResTicketingRulesRS();
    }

    /**
     * Create an instance of {@link UniqueRemark }
     * 
     */
    public UniqueRemark createUniqueRemark() {
        return new UniqueRemark();
    }

    /**
     * Create an instance of {@link UserID }
     * 
     */
    public UserID createUserID() {
        return new UserID();
    }

    /**
     * Create an instance of {@link Pricing }
     * 
     */
    public Pricing createPricing() {
        return new Pricing();
    }

    /**
     * Create an instance of {@link OperatingAirline }
     * 
     */
    public OperatingAirline createOperatingAirline() {
        return new OperatingAirline();
    }

    /**
     * Create an instance of {@link StreetNmbr }
     * 
     */
    public StreetNmbr createStreetNmbr() {
        return new StreetNmbr();
    }

    /**
     * Create an instance of {@link ItemPricing }
     * 
     */
    public ItemPricing createItemPricing() {
        return new ItemPricing();
    }

    /**
     * Create an instance of {@link OtherServiceInformation }
     * 
     */
    public OtherServiceInformation createOtherServiceInformation() {
        return new OtherServiceInformation();
    }

    /**
     * Create an instance of {@link RatePlanDescription }
     * 
     */
    public RatePlanDescription createRatePlanDescription() {
        return new RatePlanDescription();
    }

    /**
     * Create an instance of {@link java.lang.Error }
     * 
     */
    public java.lang.Error createError() {
        return new java.lang.Error();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link FareRules }
     * 
     */
    public FareRules createFareRules() {
        return new FareRules();
    }

    /**
     * Create an instance of {@link AddressInfo }
     * 
     */
    public AddressInfo createAddressInfo() {
        return new AddressInfo();
    }

    /**
     * Create an instance of {@link RateDistance }
     * 
     */
    public RateDistance createRateDistance() {
        return new RateDistance();
    }

    /**
     * Create an instance of {@link ItinTotalFareRS }
     * 
     */
    public ItinTotalFareRS createItinTotalFareRS() {
        return new ItinTotalFareRS();
    }

    /**
     * Create an instance of {@link OriginRailwayStation }
     * 
     */
    public OriginRailwayStation createOriginRailwayStation() {
        return new OriginRailwayStation();
    }

    /**
     * Create an instance of {@link ConfID }
     * 
     */
    public ConfID createConfID() {
        return new ConfID();
    }

    /**
     * Create an instance of {@link PassengerFareRS }
     * 
     */
    public PassengerFareRS createPassengerFareRS() {
        return new PassengerFareRS();
    }

    /**
     * Create an instance of {@link TicketingInfo }
     * 
     */
    public TicketingInfo createTicketingInfo() {
        return new TicketingInfo();
    }

    /**
     * Create an instance of {@link PkgReadRequest }
     * 
     */
    public PkgReadRequest createPkgReadRequest() {
        return new PkgReadRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "TripXML")
    public JAXBElement<TripXML> createTripXML(TripXML value) {
        return new JAXBElement<TripXML>(_TripXML_QNAME, TripXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "Seats", scope = Air.class)
    public JAXBElement<ArrayOfSeat> createAirSeats(ArrayOfSeat value) {
        return new JAXBElement<ArrayOfSeat>(_AirSeats_QNAME, ArrayOfSeat.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingAirline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "OperatingAirline", scope = Air.class)
    public JAXBElement<OperatingAirline> createAirOperatingAirline(OperatingAirline value) {
        return new JAXBElement<OperatingAirline>(_AirOperatingAirline_QNAME, OperatingAirline.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Equipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "Equipment", scope = Air.class)
    public JAXBElement<Equipment> createAirEquipment(Equipment value) {
        return new JAXBElement<Equipment>(_AirEquipment_QNAME, Equipment.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingAirline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "MarketingAirline", scope = Air.class)
    public JAXBElement<MarketingAirline> createAirMarketingAirline(MarketingAirline value) {
        return new JAXBElement<MarketingAirline>(_AirMarketingAirline_QNAME, MarketingAirline.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivalAirport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "ArrivalAirport", scope = Air.class)
    public JAXBElement<ArrivalAirport> createAirArrivalAirport(ArrivalAirport value) {
        return new JAXBElement<ArrivalAirport>(_AirArrivalAirport_QNAME, ArrivalAirport.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPAExtensionsRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "TPA_Extensions", scope = Air.class)
    public JAXBElement<TPAExtensionsRS> createAirTPAExtensions(TPAExtensionsRS value) {
        return new JAXBElement<TPAExtensionsRS>(_AirTPAExtensions_QNAME, TPAExtensionsRS.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "MarriageGrp", scope = Air.class)
    public JAXBElement<String> createAirMarriageGrp(String value) {
        return new JAXBElement<String>(_AirMarriageGrp_QNAME, String.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartureAirport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "DepartureAirport", scope = Air.class)
    public JAXBElement<DepartureAirport> createAirDepartureAirport(DepartureAirport value) {
        return new JAXBElement<DepartureAirport>(_AirDepartureAirport_QNAME, DepartureAirport.class, Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "ExtraAdult", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSExtraAdult(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSExtraAdult_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyCommission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "AgencyCommission", scope = TPAExtensionsRS.class)
    public JAXBElement<AgencyCommission> createTPAExtensionsRSAgencyCommission(AgencyCommission value) {
        return new JAXBElement<AgencyCommission>(_TPAExtensionsRSAgencyCommission_QNAME, AgencyCommission.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "SupplementalInfo", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSSupplementalInfo(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSSupplementalInfo_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "ExtraChild", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSExtraChild(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSExtraChild_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "GuestFirstName", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSGuestFirstName(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSGuestFirstName_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "OriginCityCode", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSOriginCityCode(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSOriginCityCode_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuedTickets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "IssuedTickets", scope = TPAExtensionsRS.class)
    public JAXBElement<IssuedTickets> createTPAExtensionsRSIssuedTickets(IssuedTickets value) {
        return new JAXBElement<IssuedTickets>(_TPAExtensionsRSIssuedTickets_QNAME, IssuedTickets.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "AlternateCurrency", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSAlternateCurrency(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSAlternateCurrency_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "Arnk", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSArnk(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSArnk_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "TourNumber", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSTourNumber(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSTourNumber_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "OverrideCorporateRate", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSOverrideCorporateRate(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSOverrideCorporateRate_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "AccountingInfo", scope = TPAExtensionsRS.class)
    public JAXBElement<AccountingInfo> createTPAExtensionsRSAccountingInfo(AccountingInfo value) {
        return new JAXBElement<AccountingInfo>(_TPAExtensionsRSAccountingInfo_QNAME, AccountingInfo.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "Crib", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSCrib(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSCrib_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "CorporateDiscount", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSCorporateDiscount(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSCorporateDiscount_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "GuestLastName", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSGuestLastName(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSGuestLastName_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "PaymentCard", scope = TPAExtensionsRS.class)
    public JAXBElement<PaymentCardRS> createTPAExtensionsRSPaymentCard(PaymentCardRS value) {
        return new JAXBElement<PaymentCardRS>(_TPAExtensionsRSPaymentCard_QNAME, PaymentCardRS.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationRailwayStation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "DestinationRailwayStation", scope = TPAExtensionsRS.class)
    public JAXBElement<DestinationRailwayStation> createTPAExtensionsRSDestinationRailwayStation(DestinationRailwayStation value) {
        return new JAXBElement<DestinationRailwayStation>(_TPAExtensionsRSDestinationRailwayStation_QNAME, DestinationRailwayStation.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "MealPlan", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSMealPlan(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSMealPlan_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuturePriceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "FuturePriceInfo", scope = TPAExtensionsRS.class)
    public JAXBElement<FuturePriceInfo> createTPAExtensionsRSFuturePriceInfo(FuturePriceInfo value) {
        return new JAXBElement<FuturePriceInfo>(_TPAExtensionsRSFuturePriceInfo_QNAME, FuturePriceInfo.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "AccountingLine", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSAccountingLine(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSAccountingLine_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "RateRequested", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSRateRequested(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSRateRequested_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "CarType", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSCarType(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSCarType_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyServiceFee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "AgencyServiceFee", scope = TPAExtensionsRS.class)
    public JAXBElement<AgencyServiceFee> createTPAExtensionsRSAgencyServiceFee(AgencyServiceFee value) {
        return new JAXBElement<AgencyServiceFee>(_TPAExtensionsRSAgencyServiceFee_QNAME, AgencyServiceFee.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginRailwayStation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "OriginRailwayStation", scope = TPAExtensionsRS.class)
    public JAXBElement<OriginRailwayStation> createTPAExtensionsRSOriginRailwayStation(OriginRailwayStation value) {
        return new JAXBElement<OriginRailwayStation>(_TPAExtensionsRSOriginRailwayStation_QNAME, OriginRailwayStation.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagAllowance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "BagAllowance", scope = TPAExtensionsRS.class)
    public JAXBElement<BagAllowance> createTPAExtensionsRSBagAllowance(BagAllowance value) {
        return new JAXBElement<BagAllowance>(_TPAExtensionsRSBagAllowance_QNAME, BagAllowance.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "RollawayChild", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSRollawayChild(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSRollawayChild_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "AdvancedDeposit", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSAdvancedDeposit(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSAdvancedDeposit_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "FareCalculation", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSFareCalculation(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSFareCalculation_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "MerchantCurrency", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSMerchantCurrency(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSMerchantCurrency_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "Rules", scope = TPAExtensionsRS.class)
    public JAXBElement<ArrayOfString> createTPAExtensionsRSRules(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_TPAExtensionsRSRules_QNAME, ArrayOfString.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "PaymentRestrictions", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSPaymentRestrictions(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSPaymentRestrictions_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "ValidatingAirlineCode", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSValidatingAirlineCode(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSValidatingAirlineCode_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "Vendor", scope = TPAExtensionsRS.class)
    public JAXBElement<Vendor> createTPAExtensionsRSVendor(Vendor value) {
        return new JAXBElement<Vendor>(_TPAExtensionsRSVendor_QNAME, Vendor.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "FareRules", scope = TPAExtensionsRS.class)
    public JAXBElement<FareRules> createTPAExtensionsRSFareRules(FareRules value) {
        return new JAXBElement<FareRules>(_TPAExtensionsRSFareRules_QNAME, FareRules.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "RoomLocation", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSRoomLocation(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSRoomLocation_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "RateQuoted", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSRateQuoted(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSRateQuoted_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "RollawayAdult", scope = TPAExtensionsRS.class)
    public JAXBElement<String> createTPAExtensionsRSRollawayAdult(String value) {
        return new JAXBElement<String>(_TPAExtensionsRSRollawayAdult_QNAME, String.class, TPAExtensionsRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCarOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://traveltalk.com/wsPNRRead", name = "CarOptions", scope = TPAExtensionsRS.class)
    public JAXBElement<ArrayOfCarOption> createTPAExtensionsRSCarOptions(ArrayOfCarOption value) {
        return new JAXBElement<ArrayOfCarOption>(_TPAExtensionsRSCarOptions_QNAME, ArrayOfCarOption.class, TPAExtensionsRS.class, value);
    }

}
