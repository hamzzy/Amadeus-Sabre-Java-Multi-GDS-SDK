
package wsimport.lib.epower;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsimport.lib.epower package.
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

    private final static QName _GenericSoapHeader_QNAME = new QName("http://epowerv5.amadeus.com.tr/WS", "GenericSoapHeader");
    private final static QName _AuthenticationSoapHeader_QNAME = new QName("http://epowerv5.amadeus.com.tr/WS", "AuthenticationSoapHeader");
    private final static QName _ETicketInfoTicketingDate_QNAME = new QName("http://epowerv5.amadeus.com.tr/WS", "TicketingDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsimport.lib.epower
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link SearchFlight }
     * 
     */
    public SearchFlight createSearchFlight() {
        return new SearchFlight();
    }

    /**
     * Create an instance of {@link GetCompatibleLowestFaresForSunExpressResponse }
     * 
     */
    public GetCompatibleLowestFaresForSunExpressResponse createGetCompatibleLowestFaresForSunExpressResponse() {
        return new GetCompatibleLowestFaresForSunExpressResponse();
    }

    /**
     * Create an instance of {@link GetHotelRoomRulesResponse }
     * 
     */
    public GetHotelRoomRulesResponse createGetHotelRoomRulesResponse() {
        return new GetHotelRoomRulesResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link CancelResponse }
     * 
     */
    public CancelResponse createCancelResponse() {
        return new CancelResponse();
    }

    /**
     * Create an instance of {@link EditPNR }
     * 
     */
    public EditPNR createEditPNR() {
        return new EditPNR();
    }

    /**
     * Create an instance of {@link CreateTicket }
     * 
     */
    public CreateTicket createCreateTicket() {
        return new CreateTicket();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendationResponse }
     * 
     */
    public BookFlightWithRecommendationResponse createBookFlightWithRecommendationResponse() {
        return new BookFlightWithRecommendationResponse();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link SearchHotel }
     * 
     */
    public SearchHotel createSearchHotel() {
        return new SearchHotel();
    }

    /**
     * Create an instance of {@link ExecuteCommand }
     * 
     */
    public ExecuteCommand createExecuteCommand() {
        return new ExecuteCommand();
    }

    /**
     * Create an instance of {@link GetPNRPriceResponse }
     * 
     */
    public GetPNRPriceResponse createGetPNRPriceResponse() {
        return new GetPNRPriceResponse();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation }
     * 
     */
    public BookFlightWithRecommendation createBookFlightWithRecommendation() {
        return new BookFlightWithRecommendation();
    }

    /**
     * Create an instance of {@link GetPriceResponse }
     * 
     */
    public GetPriceResponse createGetPriceResponse() {
        return new GetPriceResponse();
    }

    /**
     * Create an instance of {@link Cancel }
     * 
     */
    public Cancel createCancel() {
        return new Cancel();
    }

    /**
     * Create an instance of {@link EditPNRResponse }
     * 
     */
    public EditPNRResponse createEditPNRResponse() {
        return new EditPNRResponse();
    }

    /**
     * Create an instance of {@link BookFlightResponse }
     * 
     */
    public BookFlightResponse createBookFlightResponse() {
        return new BookFlightResponse();
    }

    /**
     * Create an instance of {@link GetBasketPNRResponse }
     * 
     */
    public GetBasketPNRResponse createGetBasketPNRResponse() {
        return new GetBasketPNRResponse();
    }

    /**
     * Create an instance of {@link SearchFlightTimeTable }
     * 
     */
    public SearchFlightTimeTable createSearchFlightTimeTable() {
        return new SearchFlightTimeTable();
    }

    /**
     * Create an instance of {@link GetHotelPNR }
     * 
     */
    public GetHotelPNR createGetHotelPNR() {
        return new GetHotelPNR();
    }

    /**
     * Create an instance of {@link GetPNRResponse }
     * 
     */
    public GetPNRResponse createGetPNRResponse() {
        return new GetPNRResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link GetBasketPNR }
     * 
     */
    public GetBasketPNR createGetBasketPNR() {
        return new GetBasketPNR();
    }

    /**
     * Create an instance of {@link GetLastTicketingDateResponse }
     * 
     */
    public GetLastTicketingDateResponse createGetLastTicketingDateResponse() {
        return new GetLastTicketingDateResponse();
    }

    /**
     * Create an instance of {@link CreateTicketResponse }
     * 
     */
    public CreateTicketResponse createCreateTicketResponse() {
        return new CreateTicketResponse();
    }

    /**
     * Create an instance of {@link BookResponse }
     * 
     */
    public BookResponse createBookResponse() {
        return new BookResponse();
    }

    /**
     * Create an instance of {@link GetCarPNR }
     * 
     */
    public GetCarPNR createGetCarPNR() {
        return new GetCarPNR();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link SearchHotelRoomsResponse }
     * 
     */
    public SearchHotelRoomsResponse createSearchHotelRoomsResponse() {
        return new SearchHotelRoomsResponse();
    }

    /**
     * Create an instance of {@link ExecuteCommandResponse }
     * 
     */
    public ExecuteCommandResponse createExecuteCommandResponse() {
        return new ExecuteCommandResponse();
    }

    /**
     * Create an instance of {@link SearchFlightCalendarResponse }
     * 
     */
    public SearchFlightCalendarResponse createSearchFlightCalendarResponse() {
        return new SearchFlightCalendarResponse();
    }

    /**
     * Create an instance of {@link SearchFlightCalendar }
     * 
     */
    public SearchFlightCalendar createSearchFlightCalendar() {
        return new SearchFlightCalendar();
    }

    /**
     * Create an instance of {@link GetNextFlightResultsResponse }
     * 
     */
    public GetNextFlightResultsResponse createGetNextFlightResultsResponse() {
        return new GetNextFlightResultsResponse();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link SearchFlightTimeTableResponse }
     * 
     */
    public SearchFlightTimeTableResponse createSearchFlightTimeTableResponse() {
        return new SearchFlightTimeTableResponse();
    }

    /**
     * Create an instance of {@link GetRequiredParametersForLCCResponse }
     * 
     */
    public GetRequiredParametersForLCCResponse createGetRequiredParametersForLCCResponse() {
        return new GetRequiredParametersForLCCResponse();
    }

    /**
     * Create an instance of {@link BookFlight }
     * 
     */
    public BookFlight createBookFlight() {
        return new BookFlight();
    }

    /**
     * Create an instance of {@link SearchFlightResponse }
     * 
     */
    public SearchFlightResponse createSearchFlightResponse() {
        return new SearchFlightResponse();
    }

    /**
     * Create an instance of {@link GetPNR }
     * 
     */
    public GetPNR createGetPNR() {
        return new GetPNR();
    }

    /**
     * Create an instance of {@link ArrayOfTextItemsTypeTextItem }
     * 
     */
    public ArrayOfTextItemsTypeTextItem createArrayOfTextItemsTypeTextItem() {
        return new ArrayOfTextItemsTypeTextItem();
    }

    /**
     * Create an instance of {@link TextDescriptionType }
     * 
     */
    public TextDescriptionType createTextDescriptionType() {
        return new TextDescriptionType();
    }

    /**
     * Create an instance of {@link AccessesType }
     * 
     */
    public AccessesType createAccessesType() {
        return new AccessesType();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType }
     * 
     */
    public BasicPropertyInfoType createBasicPropertyInfoType() {
        return new BasicPropertyInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfRoutingHopTypeRoutingHop }
     * 
     */
    public ArrayOfRoutingHopTypeRoutingHop createArrayOfRoutingHopTypeRoutingHop() {
        return new ArrayOfRoutingHopTypeRoutingHop();
    }

    /**
     * Create an instance of {@link VideoDescriptionType }
     * 
     */
    public VideoDescriptionType createVideoDescriptionType() {
        return new VideoDescriptionType();
    }

    /**
     * Create an instance of {@link AirlinePrefType }
     * 
     */
    public AirlinePrefType createAirlinePrefType() {
        return new AirlinePrefType();
    }

    /**
     * Create an instance of {@link ArrayOfProfilesTypeProfileInfo1 }
     * 
     */
    public ArrayOfProfilesTypeProfileInfo1 createArrayOfProfilesTypeProfileInfo1() {
        return new ArrayOfProfilesTypeProfileInfo1();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link TransportInfoType }
     * 
     */
    public TransportInfoType createTransportInfoType() {
        return new TransportInfoType();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link PaymentFormType }
     * 
     */
    public PaymentFormType createPaymentFormType() {
        return new PaymentFormType();
    }

    /**
     * Create an instance of {@link PaymentFormType.LoyaltyRedemption }
     * 
     */
    public PaymentFormType.LoyaltyRedemption createPaymentFormTypeLoyaltyRedemption() {
        return new PaymentFormType.LoyaltyRedemption();
    }

    /**
     * Create an instance of {@link VehicleCoreType }
     * 
     */
    public VehicleCoreType createVehicleCoreType() {
        return new VehicleCoreType();
    }

    /**
     * Create an instance of {@link RoomStayType }
     * 
     */
    public RoomStayType createRoomStayType() {
        return new RoomStayType();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates }
     * 
     */
    public RoomStayType.RoomRates createRoomStayTypeRoomRates() {
        return new RoomStayType.RoomRates();
    }

    /**
     * Create an instance of {@link RoomRateType }
     * 
     */
    public RoomRateType createRoomRateType() {
        return new RoomRateType();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate }
     * 
     */
    public RoomStayType.RoomRates.RoomRate createRoomStayTypeRoomRatesRoomRate() {
        return new RoomStayType.RoomRates.RoomRate();
    }

    /**
     * Create an instance of {@link FareInfoType }
     * 
     */
    public FareInfoType createFareInfoType() {
        return new FareInfoType();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo }
     * 
     */
    public FareInfoType.FareInfo createFareInfoTypeFareInfo() {
        return new FareInfoType.FareInfo();
    }

    /**
     * Create an instance of {@link RuleInfoType }
     * 
     */
    public RuleInfoType createRuleInfoType() {
        return new RuleInfoType();
    }

    /**
     * Create an instance of {@link RuleInfoType.ResTicketingRules }
     * 
     */
    public RuleInfoType.ResTicketingRules createRuleInfoTypeResTicketingRules() {
        return new RuleInfoType.ResTicketingRules();
    }

    /**
     * Create an instance of {@link AdvResTicketingType }
     * 
     */
    public AdvResTicketingType createAdvResTicketingType() {
        return new AdvResTicketingType();
    }

    /**
     * Create an instance of {@link SpecialRemarkType }
     * 
     */
    public SpecialRemarkType createSpecialRemarkType() {
        return new SpecialRemarkType();
    }

    /**
     * Create an instance of {@link ImageDescriptionType }
     * 
     */
    public ImageDescriptionType createImageDescriptionType() {
        return new ImageDescriptionType();
    }

    /**
     * Create an instance of {@link ArrayOfAirItineraryPricingInfoTypeFareInfo }
     * 
     */
    public ArrayOfAirItineraryPricingInfoTypeFareInfo createArrayOfAirItineraryPricingInfoTypeFareInfo() {
        return new ArrayOfAirItineraryPricingInfoTypeFareInfo();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link ArrayOfProfilesTypeProfileInfo }
     * 
     */
    public ArrayOfProfilesTypeProfileInfo createArrayOfProfilesTypeProfileInfo() {
        return new ArrayOfProfilesTypeProfileInfo();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType }
     * 
     */
    public FlightSegmentBaseType createFlightSegmentBaseType() {
        return new FlightSegmentBaseType();
    }

    /**
     * Create an instance of {@link FlightSegmentType }
     * 
     */
    public FlightSegmentType createFlightSegmentType() {
        return new FlightSegmentType();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType }
     * 
     */
    public BookFlightSegmentType createBookFlightSegmentType() {
        return new BookFlightSegmentType();
    }

    /**
     * Create an instance of {@link LengthsOfStayType }
     * 
     */
    public LengthsOfStayType createLengthsOfStayType() {
        return new LengthsOfStayType();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay }
     * 
     */
    public LengthsOfStayType.LengthOfStay createLengthsOfStayTypeLengthOfStay() {
        return new LengthsOfStayType.LengthOfStay();
    }

    /**
     * Create an instance of {@link ArrayOfFreeBaggageSegmentItem }
     * 
     */
    public ArrayOfFreeBaggageSegmentItem createArrayOfFreeBaggageSegmentItem() {
        return new ArrayOfFreeBaggageSegmentItem();
    }

    /**
     * Create an instance of {@link ArrayOfRoomRateTypeFeature }
     * 
     */
    public ArrayOfRoomRateTypeFeature createArrayOfRoomRateTypeFeature() {
        return new ArrayOfRoomRateTypeFeature();
    }

    /**
     * Create an instance of {@link CommissionType }
     * 
     */
    public CommissionType createCommissionType() {
        return new CommissionType();
    }

    /**
     * Create an instance of {@link ArrayOfOperationScheduleTypeOperationTime }
     * 
     */
    public ArrayOfOperationScheduleTypeOperationTime createArrayOfOperationScheduleTypeOperationTime() {
        return new ArrayOfOperationScheduleTypeOperationTime();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType }
     * 
     */
    public DOWRestrictionsType createDOWRestrictionsType() {
        return new DOWRestrictionsType();
    }

    /**
     * Create an instance of {@link ArrayOfBasicPropertyInfoTypeContactNumber }
     * 
     */
    public ArrayOfBasicPropertyInfoTypeContactNumber createArrayOfBasicPropertyInfoTypeContactNumber() {
        return new ArrayOfBasicPropertyInfoTypeContactNumber();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee createArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee() {
        return new ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee();
    }

    /**
     * Create an instance of {@link GuaranteeType }
     * 
     */
    public GuaranteeType createGuaranteeType() {
        return new GuaranteeType();
    }

    /**
     * Create an instance of {@link FlightLegType }
     * 
     */
    public FlightLegType createFlightLegType() {
        return new FlightLegType();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType }
     * 
     */
    public PropertyValueMatchType createPropertyValueMatchType() {
        return new PropertyValueMatchType();
    }

    /**
     * Create an instance of {@link ArrayOfServicesTypeService1 }
     * 
     */
    public ArrayOfServicesTypeService1 createArrayOfServicesTypeService1() {
        return new ArrayOfServicesTypeService1();
    }

    /**
     * Create an instance of {@link GuestCountType }
     * 
     */
    public GuestCountType createGuestCountType() {
        return new GuestCountType();
    }

    /**
     * Create an instance of {@link HotelReservationType }
     * 
     */
    public HotelReservationType createHotelReservationType() {
        return new HotelReservationType();
    }

    /**
     * Create an instance of {@link ArrayOfVideoItemsTypeVideoItem }
     * 
     */
    public ArrayOfVideoItemsTypeVideoItem createArrayOfVideoItemsTypeVideoItem() {
        return new ArrayOfVideoItemsTypeVideoItem();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRule }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRule createArrayOfBookingRulesTypeBookingRule() {
        return new ArrayOfBookingRulesTypeBookingRule();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRule.BookingRule }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRule.BookingRule createArrayOfBookingRulesTypeBookingRuleBookingRule() {
        return new ArrayOfBookingRulesTypeBookingRule.BookingRule();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership }
     * 
     */
    public ArrayOfViewershipsTypeViewership createArrayOfViewershipsTypeViewership() {
        return new ArrayOfViewershipsTypeViewership();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership createArrayOfViewershipsTypeViewershipViewership() {
        return new ArrayOfViewershipsTypeViewership.Viewership();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes createArrayOfViewershipsTypeViewershipViewershipBookingChannelCodes() {
        return new ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.LocationCodes createArrayOfViewershipsTypeViewershipViewershipLocationCodes() {
        return new ArrayOfViewershipsTypeViewership.Viewership.LocationCodes();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.SystemCodes createArrayOfViewershipsTypeViewershipViewershipSystemCodes() {
        return new ArrayOfViewershipsTypeViewership.Viewership.SystemCodes();
    }

    /**
     * Create an instance of {@link AirTravelerType }
     * 
     */
    public AirTravelerType createAirTravelerType() {
        return new AirTravelerType();
    }

    /**
     * Create an instance of {@link FailbackRS }
     * 
     */
    public FailbackRS createFailbackRS() {
        return new FailbackRS();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialReqDetailsTypeSeatRequest }
     * 
     */
    public ArrayOfSpecialReqDetailsTypeSeatRequest createArrayOfSpecialReqDetailsTypeSeatRequest() {
        return new ArrayOfSpecialReqDetailsTypeSeatRequest();
    }

    /**
     * Create an instance of {@link ArrayOfPTCFareBreakdownTypeTicketDesignator }
     * 
     */
    public ArrayOfPTCFareBreakdownTypeTicketDesignator createArrayOfPTCFareBreakdownTypeTicketDesignator() {
        return new ArrayOfPTCFareBreakdownTypeTicketDesignator();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRQAdditionalInfoType }
     * 
     */
    public VehicleRetrieveResRQAdditionalInfoType createVehicleRetrieveResRQAdditionalInfoType() {
        return new VehicleRetrieveResRQAdditionalInfoType();
    }

    /**
     * Create an instance of {@link CoveredTravelerType }
     * 
     */
    public CoveredTravelerType createCoveredTravelerType() {
        return new CoveredTravelerType();
    }

    /**
     * Create an instance of {@link ArrayOfConnectionTypeConnectionLocation }
     * 
     */
    public ArrayOfConnectionTypeConnectionLocation createArrayOfConnectionTypeConnectionLocation() {
        return new ArrayOfConnectionTypeConnectionLocation();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction }
     * 
     */
    public ArrayOfRoomStayTypeRoomRatesRoomRateRestriction createArrayOfRoomStayTypeRoomRatesRoomRateRestriction() {
        return new ArrayOfRoomStayTypeRoomRatesRoomRateRestriction();
    }

    /**
     * Create an instance of {@link ArrayOfServicesTypeService }
     * 
     */
    public ArrayOfServicesTypeService createArrayOfServicesTypeService() {
        return new ArrayOfServicesTypeService();
    }

    /**
     * Create an instance of {@link ArrayOfFreeBaggageLegendItem }
     * 
     */
    public ArrayOfFreeBaggageLegendItem createArrayOfFreeBaggageLegendItem() {
        return new ArrayOfFreeBaggageLegendItem();
    }

    /**
     * Create an instance of {@link ArrayOfImageItemsTypeImageItem }
     * 
     */
    public ArrayOfImageItemsTypeImageItem createArrayOfImageItemsTypeImageItem() {
        return new ArrayOfImageItemsTypeImageItem();
    }

    /**
     * Create an instance of {@link ArrayOfRateTypeRate }
     * 
     */
    public ArrayOfRateTypeRate createArrayOfRateTypeRate() {
        return new ArrayOfRateTypeRate();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link AmountType.AdditionalCharges }
     * 
     */
    public AmountType.AdditionalCharges createAmountTypeAdditionalCharges() {
        return new AmountType.AdditionalCharges();
    }

    /**
     * Create an instance of {@link ArrayOfAreasTypeArea }
     * 
     */
    public ArrayOfAreasTypeArea createArrayOfAreasTypeArea() {
        return new ArrayOfAreasTypeArea();
    }

    /**
     * Create an instance of {@link AirReservationType }
     * 
     */
    public AirReservationType createAirReservationType() {
        return new AirReservationType();
    }

    /**
     * Create an instance of {@link AirReservationType.PricingOverview }
     * 
     */
    public AirReservationType.PricingOverview createAirReservationTypePricingOverview() {
        return new AirReservationType.PricingOverview();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType }
     * 
     */
    public ItemSearchCriterionType createItemSearchCriterionType() {
        return new ItemSearchCriterionType();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType }
     * 
     */
    public HotelSearchCriterionType createHotelSearchCriterionType() {
        return new HotelSearchCriterionType();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType }
     * 
     */
    public PTCFareBreakdownType createPTCFareBreakdownType() {
        return new PTCFareBreakdownType();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PricingUnit }
     * 
     */
    public PTCFareBreakdownType.PricingUnit createPTCFareBreakdownTypePricingUnit() {
        return new PTCFareBreakdownType.PricingUnit();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PricingUnit.FareComponent }
     * 
     */
    public PTCFareBreakdownType.PricingUnit.FareComponent createPTCFareBreakdownTypePricingUnitFareComponent() {
        return new PTCFareBreakdownType.PricingUnit.FareComponent();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.Endorsements }
     * 
     */
    public PTCFareBreakdownType.Endorsements createPTCFareBreakdownTypeEndorsements() {
        return new PTCFareBreakdownType.Endorsements();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredPaymentsTypeGuaranteePayment }
     * 
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment createArrayOfRequiredPaymentsTypeGuaranteePayment() {
        return new ArrayOfRequiredPaymentsTypeGuaranteePayment();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment }
     * 
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment createArrayOfRequiredPaymentsTypeGuaranteePaymentGuaranteePayment() {
        return new ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType }
     * 
     */
    public PriceRequestInformationType createPriceRequestInformationType() {
        return new PriceRequestInformationType();
    }

    /**
     * Create an instance of {@link OtherServiceInfoType }
     * 
     */
    public OtherServiceInfoType createOtherServiceInfoType() {
        return new OtherServiceInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfBookFlightSegmentTypeBookingClassAvail }
     * 
     */
    public ArrayOfBookFlightSegmentTypeBookingClassAvail createArrayOfBookFlightSegmentTypeBookingClassAvail() {
        return new ArrayOfBookFlightSegmentTypeBookingClassAvail();
    }

    /**
     * Create an instance of {@link VerificationType }
     * 
     */
    public VerificationType createVerificationType() {
        return new VerificationType();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType }
     * 
     */
    public OriginDestinationInformationType createOriginDestinationInformationType() {
        return new OriginDestinationInformationType();
    }

    /**
     * Create an instance of {@link TravelerInfoType }
     * 
     */
    public TravelerInfoType createTravelerInfoType() {
        return new TravelerInfoType();
    }

    /**
     * Create an instance of {@link TravelerInfoType.AirTraveler }
     * 
     */
    public TravelerInfoType.AirTraveler createTravelerInfoTypeAirTraveler() {
        return new TravelerInfoType.AirTraveler();
    }

    /**
     * Create an instance of {@link ContactPersonType }
     * 
     */
    public ContactPersonType createContactPersonType() {
        return new ContactPersonType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewershipDistributorType }
     * 
     */
    public ArrayOfViewershipsTypeViewershipDistributorType createArrayOfViewershipsTypeViewershipDistributorType() {
        return new ArrayOfViewershipsTypeViewershipDistributorType();
    }

    /**
     * Create an instance of {@link ArrayOfOriginDestinationInformationTypeDestinationLocation }
     * 
     */
    public ArrayOfOriginDestinationInformationTypeDestinationLocation createArrayOfOriginDestinationInformationTypeDestinationLocation() {
        return new ArrayOfOriginDestinationInformationTypeDestinationLocation();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef }
     * 
     */
    public ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef createArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef() {
        return new ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef();
    }

    /**
     * Create an instance of {@link FareType }
     * 
     */
    public FareType createFareType() {
        return new FareType();
    }

    /**
     * Create an instance of {@link DateTimeSpanType }
     * 
     */
    public DateTimeSpanType createDateTimeSpanType() {
        return new DateTimeSpanType();
    }

    /**
     * Create an instance of {@link OriginDestinationOptionType }
     * 
     */
    public OriginDestinationOptionType createOriginDestinationOptionType() {
        return new OriginDestinationOptionType();
    }

    /**
     * Create an instance of {@link PaymentDetailType }
     * 
     */
    public PaymentDetailType createPaymentDetailType() {
        return new PaymentDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfOTAHotelAvailRSRoomStaysRoomStay }
     * 
     */
    public ArrayOfOTAHotelAvailRSRoomStaysRoomStay createArrayOfOTAHotelAvailRSRoomStaysRoomStay() {
        return new ArrayOfOTAHotelAvailRSRoomStaysRoomStay();
    }

    /**
     * Create an instance of {@link ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay }
     * 
     */
    public ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay createArrayOfOTAHotelAvailRSRoomStaysRoomStayRoomStay() {
        return new ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay();
    }

    /**
     * Create an instance of {@link ArrayOfAirItineraryTypeOriginDestinationOption }
     * 
     */
    public ArrayOfAirItineraryTypeOriginDestinationOption createArrayOfAirItineraryTypeOriginDestinationOption() {
        return new ArrayOfAirItineraryTypeOriginDestinationOption();
    }

    /**
     * Create an instance of {@link ArrayOfLastTicketingDateData }
     * 
     */
    public ArrayOfLastTicketingDateData createArrayOfLastTicketingDateData() {
        return new ArrayOfLastTicketingDateData();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRuleAdditionalRule createArrayOfBookingRulesTypeBookingRuleAdditionalRule() {
        return new ArrayOfBookingRulesTypeBookingRuleAdditionalRule();
    }

    /**
     * Create an instance of {@link ArrayOfHotelReservationIDsTypeHotelReservationID }
     * 
     */
    public ArrayOfHotelReservationIDsTypeHotelReservationID createArrayOfHotelReservationIDsTypeHotelReservationID() {
        return new ArrayOfHotelReservationIDsTypeHotelReservationID();
    }

    /**
     * Create an instance of {@link PricedItineraryType }
     * 
     */
    public PricedItineraryType createPricedItineraryType() {
        return new PricedItineraryType();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TicketingInfo }
     * 
     */
    public PricedItineraryType.TicketingInfo createPricedItineraryTypeTicketingInfo() {
        return new PricedItineraryType.TicketingInfo();
    }

    /**
     * Create an instance of {@link SpecificFlightInfoType }
     * 
     */
    public SpecificFlightInfoType createSpecificFlightInfoType() {
        return new SpecificFlightInfoType();
    }

    /**
     * Create an instance of {@link VoluntaryChangesType }
     * 
     */
    public VoluntaryChangesType createVoluntaryChangesType() {
        return new VoluntaryChangesType();
    }

    /**
     * Create an instance of {@link PhonePrefType }
     * 
     */
    public PhonePrefType createPhonePrefType() {
        return new PhonePrefType();
    }

    /**
     * Create an instance of {@link ArrayOfTransportationTypeTransportation }
     * 
     */
    public ArrayOfTransportationTypeTransportation createArrayOfTransportationTypeTransportation() {
        return new ArrayOfTransportationTypeTransportation();
    }

    /**
     * Create an instance of {@link ArrayOfMembershipTypeMembership }
     * 
     */
    public ArrayOfMembershipTypeMembership createArrayOfMembershipTypeMembership() {
        return new ArrayOfMembershipTypeMembership();
    }

    /**
     * Create an instance of {@link StayRestrictionsType }
     * 
     */
    public StayRestrictionsType createStayRestrictionsType() {
        return new StayRestrictionsType();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate }
     * 
     */
    public ArrayOfRatePlanCandidatesTypeRatePlanCandidate createArrayOfRatePlanCandidatesTypeRatePlanCandidate() {
        return new ArrayOfRatePlanCandidatesTypeRatePlanCandidate();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate }
     * 
     */
    public ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate createArrayOfRatePlanCandidatesTypeRatePlanCandidateRatePlanCandidate() {
        return new ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType }
     * 
     */
    public HotelSearchCriteriaType createHotelSearchCriteriaType() {
        return new HotelSearchCriteriaType();
    }

    /**
     * Create an instance of {@link PreferencesType }
     * 
     */
    public PreferencesType createPreferencesType() {
        return new PreferencesType();
    }

    /**
     * Create an instance of {@link ArrayOfPropertiesTypeProperty }
     * 
     */
    public ArrayOfPropertiesTypeProperty createArrayOfPropertiesTypeProperty() {
        return new ArrayOfPropertiesTypeProperty();
    }

    /**
     * Create an instance of {@link RatePlanType }
     * 
     */
    public RatePlanType createRatePlanType() {
        return new RatePlanType();
    }

    /**
     * Create an instance of {@link ArrayOfGuaranteeTypeGuaranteeAccepted }
     * 
     */
    public ArrayOfGuaranteeTypeGuaranteeAccepted createArrayOfGuaranteeTypeGuaranteeAccepted() {
        return new ArrayOfGuaranteeTypeGuaranteeAccepted();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link CancelPenaltyType }
     * 
     */
    public CancelPenaltyType createCancelPenaltyType() {
        return new CancelPenaltyType();
    }

    /**
     * Create an instance of {@link ArrayOfResGuestsTypeResGuestProfileRPH }
     * 
     */
    public ArrayOfResGuestsTypeResGuestProfileRPH createArrayOfResGuestsTypeResGuestProfileRPH() {
        return new ArrayOfResGuestsTypeResGuestProfileRPH();
    }

    /**
     * Create an instance of {@link ArrayOfOriginDestinationInformationTypeOriginLocation }
     * 
     */
    public ArrayOfOriginDestinationInformationTypeOriginLocation createArrayOfOriginDestinationInformationTypeOriginLocation() {
        return new ArrayOfOriginDestinationInformationTypeOriginLocation();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialReqDetailsTypeSpecialServiceRequest }
     * 
     */
    public ArrayOfSpecialReqDetailsTypeSpecialServiceRequest createArrayOfSpecialReqDetailsTypeSpecialServiceRequest() {
        return new ArrayOfSpecialReqDetailsTypeSpecialServiceRequest();
    }

    /**
     * Create an instance of {@link AllianceConsortiumType }
     * 
     */
    public AllianceConsortiumType createAllianceConsortiumType() {
        return new AllianceConsortiumType();
    }

    /**
     * Create an instance of {@link ArrayOfAirReservationTypeQueue }
     * 
     */
    public ArrayOfAirReservationTypeQueue createArrayOfAirReservationTypeQueue() {
        return new ArrayOfAirReservationTypeQueue();
    }

    /**
     * Create an instance of {@link ChangeDetail }
     * 
     */
    public ChangeDetail createChangeDetail() {
        return new ChangeDetail();
    }

    /**
     * Create an instance of {@link DirectBillType }
     * 
     */
    public DirectBillType createDirectBillType() {
        return new DirectBillType();
    }

    /**
     * Create an instance of {@link ArrayOfPropertyValueMatchTypeAmenity }
     * 
     */
    public ArrayOfPropertyValueMatchTypeAmenity createArrayOfPropertyValueMatchTypeAmenity() {
        return new ArrayOfPropertyValueMatchTypeAmenity();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialReqDetailsTypeSpecialRemark }
     * 
     */
    public ArrayOfSpecialReqDetailsTypeSpecialRemark createArrayOfSpecialReqDetailsTypeSpecialRemark() {
        return new ArrayOfSpecialReqDetailsTypeSpecialRemark();
    }

    /**
     * Create an instance of {@link ArrayOfCommentTypeComment }
     * 
     */
    public ArrayOfCommentTypeComment createArrayOfCommentTypeComment() {
        return new ArrayOfCommentTypeComment();
    }

    /**
     * Create an instance of {@link ArrayOfResGuestsTypeResGuest }
     * 
     */
    public ArrayOfResGuestsTypeResGuest createArrayOfResGuestsTypeResGuest() {
        return new ArrayOfResGuestsTypeResGuest();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRemarkTypeAuthorizedViewer }
     * 
     */
    public ArrayOfSpecialRemarkTypeAuthorizedViewer createArrayOfSpecialRemarkTypeAuthorizedViewer() {
        return new ArrayOfSpecialRemarkTypeAuthorizedViewer();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialReqDetailsTypeRemark }
     * 
     */
    public ArrayOfSpecialReqDetailsTypeRemark createArrayOfSpecialReqDetailsTypeRemark() {
        return new ArrayOfSpecialReqDetailsTypeRemark();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType }
     * 
     */
    public AirSearchPrefsType createAirSearchPrefsType() {
        return new AirSearchPrefsType();
    }

    /**
     * Create an instance of {@link TravelClubType }
     * 
     */
    public TravelClubType createTravelClubType() {
        return new TravelClubType();
    }

    /**
     * Create an instance of {@link CompanyInfoType }
     * 
     */
    public CompanyInfoType createCompanyInfoType() {
        return new CompanyInfoType();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRQCoreType }
     * 
     */
    public VehicleRetrieveResRQCoreType createVehicleRetrieveResRQCoreType() {
        return new VehicleRetrieveResRQCoreType();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRequestTypeSpecialRequest }
     * 
     */
    public ArrayOfSpecialRequestTypeSpecialRequest createArrayOfSpecialRequestTypeSpecialRequest() {
        return new ArrayOfSpecialRequestTypeSpecialRequest();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewershipProfileType }
     * 
     */
    public ArrayOfViewershipsTypeViewershipProfileType createArrayOfViewershipsTypeViewershipProfileType() {
        return new ArrayOfViewershipsTypeViewershipProfileType();
    }

    /**
     * Create an instance of {@link ArrayOfConnectedOperatingAirline }
     * 
     */
    public ArrayOfConnectedOperatingAirline createArrayOfConnectedOperatingAirline() {
        return new ArrayOfConnectedOperatingAirline();
    }

    /**
     * Create an instance of {@link ArrayOfServiceRPHsTypeServiceRPH }
     * 
     */
    public ArrayOfServiceRPHsTypeServiceRPH createArrayOfServiceRPHsTypeServiceRPH() {
        return new ArrayOfServiceRPHsTypeServiceRPH();
    }

    /**
     * Create an instance of {@link PricedItinerariesType }
     * 
     */
    public PricedItinerariesType createPricedItinerariesType() {
        return new PricedItinerariesType();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType }
     * 
     */
    public VehicleProfileRentalPrefType createVehicleProfileRentalPrefType() {
        return new VehicleProfileRentalPrefType();
    }

    /**
     * Create an instance of {@link ArrayOfResGuestRPHsTypeResGuestRPH }
     * 
     */
    public ArrayOfResGuestRPHsTypeResGuestRPH createArrayOfResGuestRPHsTypeResGuestRPH() {
        return new ArrayOfResGuestRPHsTypeResGuestRPH();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialReqDetailsTypeOtherServiceInformation }
     * 
     */
    public ArrayOfSpecialReqDetailsTypeOtherServiceInformation createArrayOfSpecialReqDetailsTypeOtherServiceInformation() {
        return new ArrayOfSpecialReqDetailsTypeOtherServiceInformation();
    }

    /**
     * Create an instance of {@link ArrayOfOTAHotelAvailRSHotelStaysHotelStay }
     * 
     */
    public ArrayOfOTAHotelAvailRSHotelStaysHotelStay createArrayOfOTAHotelAvailRSHotelStaysHotelStay() {
        return new ArrayOfOTAHotelAvailRSHotelStaysHotelStay();
    }

    /**
     * Create an instance of {@link ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay }
     * 
     */
    public ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay createArrayOfOTAHotelAvailRSHotelStaysHotelStayOTAHotelAvailRSHotelStaysHotelStay() {
        return new ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay();
    }

    /**
     * Create an instance of {@link ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability }
     * 
     */
    public ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability createArrayOfOTAHotelAvailRSHotelStaysHotelStayOTAHotelAvailRSHotelStaysHotelStayAvailability() {
        return new ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ }
     * 
     */
    public GetPNR.OTAReadRQ createGetPNROTAReadRQ() {
        return new GetPNR.OTAReadRQ();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests createGetPNROTAReadRQReadRequests() {
        return new GetPNR.OTAReadRQ.ReadRequests();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.CruiseReadRequest }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.CruiseReadRequest createGetPNROTAReadRQReadRequestsCruiseReadRequest() {
        return new GetPNR.OTAReadRQ.ReadRequests.CruiseReadRequest();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.GolfReadRequest }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.GolfReadRequest createGetPNROTAReadRQReadRequestsGolfReadRequest() {
        return new GetPNR.OTAReadRQ.ReadRequests.GolfReadRequest();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.AirReadRequest }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.AirReadRequest createGetPNROTAReadRQReadRequestsAirReadRequest() {
        return new GetPNR.OTAReadRQ.ReadRequests.AirReadRequest();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo createGetPNROTAReadRQReadRequestsAirReadRequestQueueInfo() {
        return new GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.HotelReadRequest }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.HotelReadRequest createGetPNROTAReadRQReadRequestsHotelReadRequest() {
        return new GetPNR.OTAReadRQ.ReadRequests.HotelReadRequest();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ }
     * 
     */
    public BookFlight.OTAAirBookRQ createBookFlightOTAAirBookRQ() {
        return new BookFlight.OTAAirBookRQ();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ.Ticketing }
     * 
     */
    public BookFlight.OTAAirBookRQ.Ticketing createBookFlightOTAAirBookRQTicketing() {
        return new BookFlight.OTAAirBookRQ.Ticketing();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ.Fulfillment }
     * 
     */
    public BookFlight.OTAAirBookRQ.Fulfillment createBookFlightOTAAirBookRQFulfillment() {
        return new BookFlight.OTAAirBookRQ.Fulfillment();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ.PriceInfo }
     * 
     */
    public BookFlight.OTAAirBookRQ.PriceInfo createBookFlightOTAAirBookRQPriceInfo() {
        return new BookFlight.OTAAirBookRQ.PriceInfo();
    }

    /**
     * Create an instance of {@link GetRequiredParametersForLCCResponse.RequiredParametersRS }
     * 
     */
    public GetRequiredParametersForLCCResponse.RequiredParametersRS createGetRequiredParametersForLCCResponseRequiredParametersRS() {
        return new GetRequiredParametersForLCCResponse.RequiredParametersRS();
    }

    /**
     * Create an instance of {@link SearchFlightCalendar.OTAAirLowFareSearchRQ }
     * 
     */
    public SearchFlightCalendar.OTAAirLowFareSearchRQ createSearchFlightCalendarOTAAirLowFareSearchRQ() {
        return new SearchFlightCalendar.OTAAirLowFareSearchRQ();
    }

    /**
     * Create an instance of {@link SearchFlightCalendar.OTAAirLowFareSearchRQ.AdvanceSearchInfo }
     * 
     */
    public SearchFlightCalendar.OTAAirLowFareSearchRQ.AdvanceSearchInfo createSearchFlightCalendarOTAAirLowFareSearchRQAdvanceSearchInfo() {
        return new SearchFlightCalendar.OTAAirLowFareSearchRQ.AdvanceSearchInfo();
    }

    /**
     * Create an instance of {@link SearchFlightCalendar.OTAAirLowFareSearchRQ.OriginDestinationInformation }
     * 
     */
    public SearchFlightCalendar.OTAAirLowFareSearchRQ.OriginDestinationInformation createSearchFlightCalendarOTAAirLowFareSearchRQOriginDestinationInformation() {
        return new SearchFlightCalendar.OTAAirLowFareSearchRQ.OriginDestinationInformation();
    }

    /**
     * Create an instance of {@link SearchHotelRoomsResponse.OTAHotelAvailRS }
     * 
     */
    public SearchHotelRoomsResponse.OTAHotelAvailRS createSearchHotelRoomsResponseOTAHotelAvailRS() {
        return new SearchHotelRoomsResponse.OTAHotelAvailRS();
    }

    /**
     * Create an instance of {@link SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays }
     * 
     */
    public SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays createSearchHotelRoomsResponseOTAHotelAvailRSRoomStays() {
        return new SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays();
    }

    /**
     * Create an instance of {@link SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays.RoomStay }
     * 
     */
    public SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays.RoomStay createSearchHotelRoomsResponseOTAHotelAvailRSRoomStaysRoomStay() {
        return new SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays.RoomStay();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ }
     * 
     */
    public GetCarPNR.OTAReadRQ createGetCarPNROTAReadRQ() {
        return new GetCarPNR.OTAReadRQ();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests createGetCarPNROTAReadRQReadRequests() {
        return new GetCarPNR.OTAReadRQ.ReadRequests();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.CruiseReadRequest }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.CruiseReadRequest createGetCarPNROTAReadRQReadRequestsCruiseReadRequest() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.CruiseReadRequest();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.GolfReadRequest }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.GolfReadRequest createGetCarPNROTAReadRQReadRequestsGolfReadRequest() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.GolfReadRequest();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest createGetCarPNROTAReadRQReadRequestsAirReadRequest() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo createGetCarPNROTAReadRQReadRequestsAirReadRequestQueueInfo() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.HotelReadRequest }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.HotelReadRequest createGetCarPNROTAReadRQReadRequestsHotelReadRequest() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.HotelReadRequest();
    }

    /**
     * Create an instance of {@link BookResponse.BookBasketRS }
     * 
     */
    public BookResponse.BookBasketRS createBookResponseBookBasketRS() {
        return new BookResponse.BookBasketRS();
    }

    /**
     * Create an instance of {@link CreateTicketResponse.OTAAirBookRS }
     * 
     */
    public CreateTicketResponse.OTAAirBookRS createCreateTicketResponseOTAAirBookRS() {
        return new CreateTicketResponse.OTAAirBookRS();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ }
     * 
     */
    public GetBasketPNR.OTAReadRQ createGetBasketPNROTAReadRQ() {
        return new GetBasketPNR.OTAReadRQ();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests createGetBasketPNROTAReadRQReadRequests() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.CruiseReadRequest }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.CruiseReadRequest createGetBasketPNROTAReadRQReadRequestsCruiseReadRequest() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.CruiseReadRequest();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.GolfReadRequest }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.GolfReadRequest createGetBasketPNROTAReadRQReadRequestsGolfReadRequest() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.GolfReadRequest();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest createGetBasketPNROTAReadRQReadRequestsAirReadRequest() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo createGetBasketPNROTAReadRQReadRequestsAirReadRequestQueueInfo() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.HotelReadRequest }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.HotelReadRequest createGetBasketPNROTAReadRQReadRequestsHotelReadRequest() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.HotelReadRequest();
    }

    /**
     * Create an instance of {@link GetPNRResponse.OTAAirBookRS }
     * 
     */
    public GetPNRResponse.OTAAirBookRS createGetPNRResponseOTAAirBookRS() {
        return new GetPNRResponse.OTAAirBookRS();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ }
     * 
     */
    public GetHotelPNR.OTAReadRQ createGetHotelPNROTAReadRQ() {
        return new GetHotelPNR.OTAReadRQ();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests createGetHotelPNROTAReadRQReadRequests() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest createGetHotelPNROTAReadRQReadRequestsCruiseReadRequest() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest createGetHotelPNROTAReadRQReadRequestsGolfReadRequest() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest createGetHotelPNROTAReadRQReadRequestsAirReadRequest() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo createGetHotelPNROTAReadRQReadRequestsAirReadRequestQueueInfo() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest createGetHotelPNROTAReadRQReadRequestsHotelReadRequest() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest();
    }

    /**
     * Create an instance of {@link GetBasketPNRResponse.OTAAirBookRS }
     * 
     */
    public GetBasketPNRResponse.OTAAirBookRS createGetBasketPNRResponseOTAAirBookRS() {
        return new GetBasketPNRResponse.OTAAirBookRS();
    }

    /**
     * Create an instance of {@link BookFlightResponse.OTAAirBookRS }
     * 
     */
    public BookFlightResponse.OTAAirBookRS createBookFlightResponseOTAAirBookRS() {
        return new BookFlightResponse.OTAAirBookRS();
    }

    /**
     * Create an instance of {@link EditPNRResponse.EditPnrRS }
     * 
     */
    public EditPNRResponse.EditPnrRS createEditPNRResponseEditPnrRS() {
        return new EditPNRResponse.EditPnrRS();
    }

    /**
     * Create an instance of {@link Cancel.OTACancelRQ }
     * 
     */
    public Cancel.OTACancelRQ createCancelOTACancelRQ() {
        return new Cancel.OTACancelRQ();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ createBookFlightWithRecommendationOTAAirBookRQ() {
        return new BookFlightWithRecommendation.OTAAirBookRQ();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ.Ticketing }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ.Ticketing createBookFlightWithRecommendationOTAAirBookRQTicketing() {
        return new BookFlightWithRecommendation.OTAAirBookRQ.Ticketing();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment createBookFlightWithRecommendationOTAAirBookRQFulfillment() {
        return new BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo createBookFlightWithRecommendationOTAAirBookRQPriceInfo() {
        return new BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo();
    }

    /**
     * Create an instance of {@link GetPNRPriceResponse.OTAAirBookRS }
     * 
     */
    public GetPNRPriceResponse.OTAAirBookRS createGetPNRPriceResponseOTAAirBookRS() {
        return new GetPNRPriceResponse.OTAAirBookRS();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendationResponse.OTAAirBookRS }
     * 
     */
    public BookFlightWithRecommendationResponse.OTAAirBookRS createBookFlightWithRecommendationResponseOTAAirBookRS() {
        return new BookFlightWithRecommendationResponse.OTAAirBookRS();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ }
     * 
     */
    public CreateTicket.OTAAirBookRQ createCreateTicketOTAAirBookRQ() {
        return new CreateTicket.OTAAirBookRQ();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ.Ticketing }
     * 
     */
    public CreateTicket.OTAAirBookRQ.Ticketing createCreateTicketOTAAirBookRQTicketing() {
        return new CreateTicket.OTAAirBookRQ.Ticketing();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ.Fulfillment }
     * 
     */
    public CreateTicket.OTAAirBookRQ.Fulfillment createCreateTicketOTAAirBookRQFulfillment() {
        return new CreateTicket.OTAAirBookRQ.Fulfillment();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ.PriceInfo }
     * 
     */
    public CreateTicket.OTAAirBookRQ.PriceInfo createCreateTicketOTAAirBookRQPriceInfo() {
        return new CreateTicket.OTAAirBookRQ.PriceInfo();
    }

    /**
     * Create an instance of {@link CancelResponse.OTACancelRS }
     * 
     */
    public CancelResponse.OTACancelRS createCancelResponseOTACancelRS() {
        return new CancelResponse.OTACancelRS();
    }

    /**
     * Create an instance of {@link CancelResponse.OTACancelRS.OTAAirBookRS }
     * 
     */
    public CancelResponse.OTACancelRS.OTAAirBookRS createCancelResponseOTACancelRSOTAAirBookRS() {
        return new CancelResponse.OTACancelRS.OTAAirBookRS();
    }

    /**
     * Create an instance of {@link Book.BookBasketRQ }
     * 
     */
    public Book.BookBasketRQ createBookBookBasketRQ() {
        return new Book.BookBasketRQ();
    }

    /**
     * Create an instance of {@link Book.BookBasketRQ.Fulfillment }
     * 
     */
    public Book.BookBasketRQ.Fulfillment createBookBookBasketRQFulfillment() {
        return new Book.BookBasketRQ.Fulfillment();
    }

    /**
     * Create an instance of {@link GetHotelRoomRulesResponse.OTAHotelAvailRS }
     * 
     */
    public GetHotelRoomRulesResponse.OTAHotelAvailRS createGetHotelRoomRulesResponseOTAHotelAvailRS() {
        return new GetHotelRoomRulesResponse.OTAHotelAvailRS();
    }

    /**
     * Create an instance of {@link GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays }
     * 
     */
    public GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays createGetHotelRoomRulesResponseOTAHotelAvailRSRoomStays() {
        return new GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays();
    }

    /**
     * Create an instance of {@link GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay }
     * 
     */
    public GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay createGetHotelRoomRulesResponseOTAHotelAvailRSRoomStaysRoomStay() {
        return new GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay();
    }

    /**
     * Create an instance of {@link SearchFlight.OTAAirLowFareSearchRQ }
     * 
     */
    public SearchFlight.OTAAirLowFareSearchRQ createSearchFlightOTAAirLowFareSearchRQ() {
        return new SearchFlight.OTAAirLowFareSearchRQ();
    }

    /**
     * Create an instance of {@link SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo }
     * 
     */
    public SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo createSearchFlightOTAAirLowFareSearchRQAdvanceSearchInfo() {
        return new SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo();
    }

    /**
     * Create an instance of {@link SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation }
     * 
     */
    public SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation createSearchFlightOTAAirLowFareSearchRQOriginDestinationInformation() {
        return new SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation();
    }

    /**
     * Create an instance of {@link PingResponse.OTAPingRS }
     * 
     */
    public PingResponse.OTAPingRS createPingResponseOTAPingRS() {
        return new PingResponse.OTAPingRS();
    }

    /**
     * Create an instance of {@link GetCompatibleLowestFaresForSunExpressResponse.OTAAirLowFareSearchRS }
     * 
     */
    public GetCompatibleLowestFaresForSunExpressResponse.OTAAirLowFareSearchRS createGetCompatibleLowestFaresForSunExpressResponseOTAAirLowFareSearchRS() {
        return new GetCompatibleLowestFaresForSunExpressResponse.OTAAirLowFareSearchRS();
    }

    /**
     * Create an instance of {@link GetCarRules }
     * 
     */
    public GetCarRules createGetCarRules() {
        return new GetCarRules();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRQ }
     * 
     */
    public OTAVehRateRuleRQ createOTAVehRateRuleRQ() {
        return new OTAVehRateRuleRQ();
    }

    /**
     * Create an instance of {@link GetServiceFeeV2Response }
     * 
     */
    public GetServiceFeeV2Response createGetServiceFeeV2Response() {
        return new GetServiceFeeV2Response();
    }

    /**
     * Create an instance of {@link ServiceFeeInfoRS }
     * 
     */
    public ServiceFeeInfoRS createServiceFeeInfoRS() {
        return new ServiceFeeInfoRS();
    }

    /**
     * Create an instance of {@link GetSeatMapResponse }
     * 
     */
    public GetSeatMapResponse createGetSeatMapResponse() {
        return new GetSeatMapResponse();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRS }
     * 
     */
    public OTAAirSeatMapRS createOTAAirSeatMapRS() {
        return new OTAAirSeatMapRS();
    }

    /**
     * Create an instance of {@link BookCar }
     * 
     */
    public BookCar createBookCar() {
        return new BookCar();
    }

    /**
     * Create an instance of {@link OTAVehResRQ }
     * 
     */
    public OTAVehResRQ createOTAVehResRQ() {
        return new OTAVehResRQ();
    }

    /**
     * Create an instance of {@link EditPNR.EditPNRRQ }
     * 
     */
    public EditPNR.EditPNRRQ createEditPNREditPNRRQ() {
        return new EditPNR.EditPNRRQ();
    }

    /**
     * Create an instance of {@link GetBaggageInfoResponse }
     * 
     */
    public GetBaggageInfoResponse createGetBaggageInfoResponse() {
        return new GetBaggageInfoResponse();
    }

    /**
     * Create an instance of {@link BaggageInfoRS }
     * 
     */
    public BaggageInfoRS createBaggageInfoRS() {
        return new BaggageInfoRS();
    }

    /**
     * Create an instance of {@link RegisterUser.UserOperationsRQ }
     * 
     */
    public RegisterUser.UserOperationsRQ createRegisterUserUserOperationsRQ() {
        return new RegisterUser.UserOperationsRQ();
    }

    /**
     * Create an instance of {@link GetAncillaryInfo }
     * 
     */
    public GetAncillaryInfo createGetAncillaryInfo() {
        return new GetAncillaryInfo();
    }

    /**
     * Create an instance of {@link AncillaryInfoRQ }
     * 
     */
    public AncillaryInfoRQ createAncillaryInfoRQ() {
        return new AncillaryInfoRQ();
    }

    /**
     * Create an instance of {@link SearchHotel.OTAHotelSearchRQ }
     * 
     */
    public SearchHotel.OTAHotelSearchRQ createSearchHotelOTAHotelSearchRQ() {
        return new SearchHotel.OTAHotelSearchRQ();
    }

     /**
     * Create an instance of {@link ExecuteCommand.AmadeusAPICommandRQ }
     * 
     */
    public ExecuteCommand.AmadeusAPICommandRQ createExecuteCommandAmadeusAPICommandRQ() {
        return new ExecuteCommand.AmadeusAPICommandRQ();
    }

    /**
     * Create an instance of {@link BookHotelResponse }
     * 
     */
    public BookHotelResponse createBookHotelResponse() {
        return new BookHotelResponse();
    }

    /**
     * Create an instance of {@link OTAHotelResRS }
     * 
     */
    public OTAHotelResRS createOTAHotelResRS() {
        return new OTAHotelResRS();
    }

    /**
     * Create an instance of {@link GetPriceResponse.OTAAirLowFareSearchRS }
     * 
     */
    public GetPriceResponse.OTAAirLowFareSearchRS createGetPriceResponseOTAAirLowFareSearchRS() {
        return new GetPriceResponse.OTAAirLowFareSearchRS();
    }

    /**
     * Create an instance of {@link GetFlightRules }
     * 
     */
    public GetFlightRules createGetFlightRules() {
        return new GetFlightRules();
    }

    /**
     * Create an instance of {@link OTAAirRulesRQ }
     * 
     */
    public OTAAirRulesRQ createOTAAirRulesRQ() {
        return new OTAAirRulesRQ();
    }

    /**
     * Create an instance of {@link GetHotelRoomRules }
     * 
     */
    public GetHotelRoomRules createGetHotelRoomRules() {
        return new GetHotelRoomRules();
    }

    /**
     * Create an instance of {@link OTAHotelRoomRuleRQ }
     * 
     */
    public OTAHotelRoomRuleRQ createOTAHotelRoomRuleRQ() {
        return new OTAHotelRoomRuleRQ();
    }

    /**
     * Create an instance of {@link SignOutResponse }
     * 
     */
    public SignOutResponse createSignOutResponse() {
        return new SignOutResponse();
    }

    /**
     * Create an instance of {@link QueueResponse }
     * 
     */
    public QueueResponse createQueueResponse() {
        return new QueueResponse();
    }

    /**
     * Create an instance of {@link QueueRS }
     * 
     */
    public QueueRS createQueueRS() {
        return new QueueRS();
    }

    /**
     * Create an instance of {@link BookInsuranceResponse }
     * 
     */
    public BookInsuranceResponse createBookInsuranceResponse() {
        return new BookInsuranceResponse();
    }

    /**
     * Create an instance of {@link OTAInsuranceBookRS }
     * 
     */
    public OTAInsuranceBookRS createOTAInsuranceBookRS() {
        return new OTAInsuranceBookRS();
    }

    /**
     * Create an instance of {@link SearchFlightTimeTable.OTAAirScheduleRQ }
     * 
     */
    public SearchFlightTimeTable.OTAAirScheduleRQ createSearchFlightTimeTableOTAAirScheduleRQ() {
        return new SearchFlightTimeTable.OTAAirScheduleRQ();
    }

    /**
     * Create an instance of {@link SearchCarResponse }
     * 
     */
    public SearchCarResponse createSearchCarResponse() {
        return new SearchCarResponse();
    }

    /**
     * Create an instance of {@link OTAVehAvailRateRS }
     * 
     */
    public OTAVehAvailRateRS createOTAVehAvailRateRS() {
        return new OTAVehAvailRateRS();
    }

    /**
     * Create an instance of {@link wsimport.lib.epower.Queue }
     * 
     */
    public wsimport.lib.epower.Queue createQueue() {
        return new wsimport.lib.epower.Queue();
    }

    /**
     * Create an instance of {@link QueueRQ }
     * 
     */
    public QueueRQ createQueueRQ() {
        return new QueueRQ();
    }

    /**
     * Create an instance of {@link GetFlightRulesResponse }
     * 
     */
    public GetFlightRulesResponse createGetFlightRulesResponse() {
        return new GetFlightRulesResponse();
    }

    /**
     * Create an instance of {@link OTAAirRulesRS }
     * 
     */
    public OTAAirRulesRS createOTAAirRulesRS() {
        return new OTAAirRulesRS();
    }

    /**
     * Create an instance of {@link CheckETicketResponse }
     * 
     */
    public CheckETicketResponse createCheckETicketResponse() {
        return new CheckETicketResponse();
    }

    /**
     * Create an instance of {@link OTAAirCheckETicketRS }
     * 
     */
    public OTAAirCheckETicketRS createOTAAirCheckETicketRS() {
        return new OTAAirCheckETicketRS();
    }

    /**
     * Create an instance of {@link GetPrice }
     * 
     */
    public GetPrice createGetPrice() {
        return new GetPrice();
    }

    /**
     * Create an instance of {@link PriceInfoRQ }
     * 
     */
    public PriceInfoRQ createPriceInfoRQ() {
        return new PriceInfoRQ();
    }

    /**
     * Create an instance of {@link GetServiceFeeResponse }
     * 
     */
    public GetServiceFeeResponse createGetServiceFeeResponse() {
        return new GetServiceFeeResponse();
    }

    /**
     * Create an instance of {@link AuthenticationSoapHeader }
     * 
     */
    public AuthenticationSoapHeader createAuthenticationSoapHeader() {
        return new AuthenticationSoapHeader();
    }

    /**
     * Create an instance of {@link GetServiceFee }
     * 
     */
    public GetServiceFee createGetServiceFee() {
        return new GetServiceFee();
    }

    /**
     * Create an instance of {@link ServiceFeeInfoRQ }
     * 
     */
    public ServiceFeeInfoRQ createServiceFeeInfoRQ() {
        return new ServiceFeeInfoRQ();
    }

    /**
     * Create an instance of {@link GetLastTicketingDate }
     * 
     */
    public GetLastTicketingDate createGetLastTicketingDate() {
        return new GetLastTicketingDate();
    }

    /**
     * Create an instance of {@link SearchInsurancePlansResponse }
     * 
     */
    public SearchInsurancePlansResponse createSearchInsurancePlansResponse() {
        return new SearchInsurancePlansResponse();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRS }
     * 
     */
    public OTAInsurancePlanSearchRS createOTAInsurancePlanSearchRS() {
        return new OTAInsurancePlanSearchRS();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link GetUserRS }
     * 
     */
    public GetUserRS createGetUserRS() {
        return new GetUserRS();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUser.UserOperationsRQ }
     * 
     */
    public UpdateUser.UserOperationsRQ createUpdateUserUserOperationsRQ() {
        return new UpdateUser.UserOperationsRQ();
    }

    /**
     * Create an instance of {@link GetFlightFareFamiliesResponse }
     * 
     */
    public GetFlightFareFamiliesResponse createGetFlightFareFamiliesResponse() {
        return new GetFlightFareFamiliesResponse();
    }

    /**
     * Create an instance of {@link FareFamilyInfoRS }
     * 
     */
    public FareFamilyInfoRS createFareFamilyInfoRS() {
        return new FareFamilyInfoRS();
    }

    /**
     * Create an instance of {@link GetCancelPolicyText }
     * 
     */
    public GetCancelPolicyText createGetCancelPolicyText() {
        return new GetCancelPolicyText();
    }

    /**
     * Create an instance of {@link SignOut }
     * 
     */
    public SignOut createSignOut() {
        return new SignOut();
    }

    /**
     * Create an instance of {@link GetLastTicketingDateResponse.LastTicketingDateRS }
     * 
     */
    public GetLastTicketingDateResponse.LastTicketingDateRS createGetLastTicketingDateResponseLastTicketingDateRS() {
        return new GetLastTicketingDateResponse.LastTicketingDateRS();
    }

    /**
     * Create an instance of {@link SearchHotelRooms }
     * 
     */
    public SearchHotelRooms createSearchHotelRooms() {
        return new SearchHotelRooms();
    }

    /**
     * Create an instance of {@link OTAHotelAvailRQ }
     * 
     */
    public OTAHotelAvailRQ createOTAHotelAvailRQ() {
        return new OTAHotelAvailRQ();
    }

    /**
     * Create an instance of {@link SearchCar }
     * 
     */
    public SearchCar createSearchCar() {
        return new SearchCar();
    }

    /**
     * Create an instance of {@link OTAVehAvailRateRQ }
     * 
     */
    public OTAVehAvailRateRQ createOTAVehAvailRateRQ() {
        return new OTAVehAvailRateRQ();
    }

    /**
     * Create an instance of {@link SearchCarVendorResponse }
     * 
     */
    public SearchCarVendorResponse createSearchCarVendorResponse() {
        return new SearchCarVendorResponse();
    }

    /**
     * Create an instance of {@link GetCarCompanyLocations }
     * 
     */
    public GetCarCompanyLocations createGetCarCompanyLocations() {
        return new GetCarCompanyLocations();
    }

    /**
     * Create an instance of {@link OTAVehLocSearchRQ }
     * 
     */
    public OTAVehLocSearchRQ createOTAVehLocSearchRQ() {
        return new OTAVehLocSearchRQ();
    }

    /**
     * Create an instance of {@link GetHotelInfo }
     * 
     */
    public GetHotelInfo createGetHotelInfo() {
        return new GetHotelInfo();
    }

    /**
     * Create an instance of {@link OTAHotelInfoRQ }
     * 
     */
    public OTAHotelInfoRQ createOTAHotelInfoRQ() {
        return new OTAHotelInfoRQ();
    }

    /**
     * Create an instance of {@link CurrencyConversion }
     * 
     */
    public CurrencyConversion createCurrencyConversion() {
        return new CurrencyConversion();
    }

    /**
     * Create an instance of {@link OTACurrencyConversionRQ }
     * 
     */
    public OTACurrencyConversionRQ createOTACurrencyConversionRQ() {
        return new OTACurrencyConversionRQ();
    }

    /**
     * Create an instance of {@link GetHotelInfoResponse }
     * 
     */
    public GetHotelInfoResponse createGetHotelInfoResponse() {
        return new GetHotelInfoResponse();
    }

    /**
     * Create an instance of {@link OTAHotelSearchRS }
     * 
     */
    public OTAHotelSearchRS createOTAHotelSearchRS() {
        return new OTAHotelSearchRS();
    }

    /**
     * Create an instance of {@link CheckETicket }
     * 
     */
    public CheckETicket createCheckETicket() {
        return new CheckETicket();
    }

    /**
     * Create an instance of {@link OTAAirCheckETicketRQ }
     * 
     */
    public OTAAirCheckETicketRQ createOTAAirCheckETicketRQ() {
        return new OTAAirCheckETicketRQ();
    }

    /**
     * Create an instance of {@link GetAPISRulesResponse }
     * 
     */
    public GetAPISRulesResponse createGetAPISRulesResponse() {
        return new GetAPISRulesResponse();
    }

    /**
     * Create an instance of {@link APISRulesRS }
     * 
     */
    public APISRulesRS createAPISRulesRS() {
        return new APISRulesRS();
    }

    /**
     * Create an instance of {@link GetUser.GetUserRQ }
     * 
     */
    public GetUser.GetUserRQ createGetUserGetUserRQ() {
        return new GetUser.GetUserRQ();
    }

    /**
     * Create an instance of {@link ExecuteCommandResponse.AmadeusAPICommandRS }
     * 
     */
    public ExecuteCommandResponse.AmadeusAPICommandRS createExecuteCommandResponseAmadeusAPICommandRS() {
        return new ExecuteCommandResponse.AmadeusAPICommandRS();
    }

    /**
     * Create an instance of {@link SearchCarVendor }
     * 
     */
    public SearchCarVendor createSearchCarVendor() {
        return new SearchCarVendor();
    }

    /**
     * Create an instance of {@link OTAVehAvailVendorRQ }
     * 
     */
    public OTAVehAvailVendorRQ createOTAVehAvailVendorRQ() {
        return new OTAVehAvailVendorRQ();
    }

    /**
     * Create an instance of {@link GetAncillaryInfoResponse }
     * 
     */
    public GetAncillaryInfoResponse createGetAncillaryInfoResponse() {
        return new GetAncillaryInfoResponse();
    }

    /**
     * Create an instance of {@link AncillaryInfoRS }
     * 
     */
    public AncillaryInfoRS createAncillaryInfoRS() {
        return new AncillaryInfoRS();
    }

    /**
     * Create an instance of {@link BookInsurance }
     * 
     */
    public BookInsurance createBookInsurance() {
        return new BookInsurance();
    }

    /**
     * Create an instance of {@link OTAInsuranceBookRQ }
     * 
     */
    public OTAInsuranceBookRQ createOTAInsuranceBookRQ() {
        return new OTAInsuranceBookRQ();
    }

    /**
     * Create an instance of {@link GetBaggageInfo }
     * 
     */
    public GetBaggageInfo createGetBaggageInfo() {
        return new GetBaggageInfo();
    }

    /**
     * Create an instance of {@link BaggageInfoRQ }
     * 
     */
    public BaggageInfoRQ createBaggageInfoRQ() {
        return new BaggageInfoRQ();
    }

    /**
     * Create an instance of {@link SearchFlightCalendarResponse.OTAAirLowFareSearchRS }
     * 
     */
    public SearchFlightCalendarResponse.OTAAirLowFareSearchRS createSearchFlightCalendarResponseOTAAirLowFareSearchRS() {
        return new SearchFlightCalendarResponse.OTAAirLowFareSearchRS();
    }

    /**
     * Create an instance of {@link GetNextFlightResultsResponse.OTAAirLowFareSearchRS }
     * 
     */
    public GetNextFlightResultsResponse.OTAAirLowFareSearchRS createGetNextFlightResultsResponseOTAAirLowFareSearchRS() {
        return new GetNextFlightResultsResponse.OTAAirLowFareSearchRS();
    }

    /**
     * Create an instance of {@link Ping.OTAPingRQ }
     * 
     */
    public Ping.OTAPingRQ createPingOTAPingRQ() {
        return new Ping.OTAPingRQ();
    }

    /**
     * Create an instance of {@link GetPNRPrice }
     * 
     */
    public GetPNRPrice createGetPNRPrice() {
        return new GetPNRPrice();
    }

    /**
     * Create an instance of {@link GetCarPNRResponse }
     * 
     */
    public GetCarPNRResponse createGetCarPNRResponse() {
        return new GetCarPNRResponse();
    }

    /**
     * Create an instance of {@link OTAVehResRS }
     * 
     */
    public OTAVehResRS createOTAVehResRS() {
        return new OTAVehResRS();
    }

    /**
     * Create an instance of {@link CurrencyConversionResponse }
     * 
     */
    public CurrencyConversionResponse createCurrencyConversionResponse() {
        return new CurrencyConversionResponse();
    }

    /**
     * Create an instance of {@link OTACurrencyConversionRS }
     * 
     */
    public OTACurrencyConversionRS createOTACurrencyConversionRS() {
        return new OTACurrencyConversionRS();
    }

    /**
     * Create an instance of {@link SearchHotelResponse }
     * 
     */
    public SearchHotelResponse createSearchHotelResponse() {
        return new SearchHotelResponse();
    }

    /**
     * Create an instance of {@link SearchFlightTimeTableResponse.OTAAirScheduleRS }
     * 
     */
    public SearchFlightTimeTableResponse.OTAAirScheduleRS createSearchFlightTimeTableResponseOTAAirScheduleRS() {
        return new SearchFlightTimeTableResponse.OTAAirScheduleRS();
    }

    /**
     * Create an instance of {@link GetServiceFeeV2 }
     * 
     */
    public GetServiceFeeV2 createGetServiceFeeV2() {
        return new GetServiceFeeV2();
    }

    /**
     * Create an instance of {@link GetCompatibleLowestFaresForSunExpress }
     * 
     */
    public GetCompatibleLowestFaresForSunExpress createGetCompatibleLowestFaresForSunExpress() {
        return new GetCompatibleLowestFaresForSunExpress();
    }

    /**
     * Create an instance of {@link FlightOptionRQ }
     * 
     */
    public FlightOptionRQ createFlightOptionRQ() {
        return new FlightOptionRQ();
    }

    /**
     * Create an instance of {@link GetAPISRules }
     * 
     */
    public GetAPISRules createGetAPISRules() {
        return new GetAPISRules();
    }

    /**
     * Create an instance of {@link APISRulesRQ }
     * 
     */
    public APISRulesRQ createAPISRulesRQ() {
        return new APISRulesRQ();
    }

    /**
     * Create an instance of {@link GetFlightFareFamilies }
     * 
     */
    public GetFlightFareFamilies createGetFlightFareFamilies() {
        return new GetFlightFareFamilies();
    }

    /**
     * Create an instance of {@link FareFamilyInfoRQ }
     * 
     */
    public FareFamilyInfoRQ createFareFamilyInfoRQ() {
        return new FareFamilyInfoRQ();
    }

    /**
     * Create an instance of {@link GetRequiredParametersForLCC }
     * 
     */
    public GetRequiredParametersForLCC createGetRequiredParametersForLCC() {
        return new GetRequiredParametersForLCC();
    }

    /**
     * Create an instance of {@link RequiredParametersRQ }
     * 
     */
    public RequiredParametersRQ createRequiredParametersRQ() {
        return new RequiredParametersRQ();
    }

    /**
     * Create an instance of {@link SearchFlightResponse.OTAAirLowFareSearchRS }
     * 
     */
    public SearchFlightResponse.OTAAirLowFareSearchRS createSearchFlightResponseOTAAirLowFareSearchRS() {
        return new SearchFlightResponse.OTAAirLowFareSearchRS();
    }

    /**
     * Create an instance of {@link GetCarCompanyLocationsResponse }
     * 
     */
    public GetCarCompanyLocationsResponse createGetCarCompanyLocationsResponse() {
        return new GetCarCompanyLocationsResponse();
    }

    /**
     * Create an instance of {@link OTAVehLocSearchRS }
     * 
     */
    public OTAVehLocSearchRS createOTAVehLocSearchRS() {
        return new OTAVehLocSearchRS();
    }

    /**
     * Create an instance of {@link GetNextFlightResults }
     * 
     */
    public GetNextFlightResults createGetNextFlightResults() {
        return new GetNextFlightResults();
    }

    /**
     * Create an instance of {@link BookCarResponse }
     * 
     */
    public BookCarResponse createBookCarResponse() {
        return new BookCarResponse();
    }

    /**
     * Create an instance of {@link GetSeatMap }
     * 
     */
    public GetSeatMap createGetSeatMap() {
        return new GetSeatMap();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRQ }
     * 
     */
    public OTAAirSeatMapRQ createOTAAirSeatMapRQ() {
        return new OTAAirSeatMapRQ();
    }

    /**
     * Create an instance of {@link GetCarRulesResponse }
     * 
     */
    public GetCarRulesResponse createGetCarRulesResponse() {
        return new GetCarRulesResponse();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRS }
     * 
     */
    public OTAVehRateRuleRS createOTAVehRateRuleRS() {
        return new OTAVehRateRuleRS();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetCancelPolicyTextResponse }
     * 
     */
    public GetCancelPolicyTextResponse createGetCancelPolicyTextResponse() {
        return new GetCancelPolicyTextResponse();
    }

    /**
     * Create an instance of {@link BookHotel }
     * 
     */
    public BookHotel createBookHotel() {
        return new BookHotel();
    }

    /**
     * Create an instance of {@link OTAHotelResRQ }
     * 
     */
    public OTAHotelResRQ createOTAHotelResRQ() {
        return new OTAHotelResRQ();
    }

    /**
     * Create an instance of {@link GetHotelPNRResponse }
     * 
     */
    public GetHotelPNRResponse createGetHotelPNRResponse() {
        return new GetHotelPNRResponse();
    }

    /**
     * Create an instance of {@link SearchInsurancePlans }
     * 
     */
    public SearchInsurancePlans createSearchInsurancePlans() {
        return new SearchInsurancePlans();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRQ }
     * 
     */
    public OTAInsurancePlanSearchRQ createOTAInsurancePlanSearchRQ() {
        return new OTAInsurancePlanSearchRQ();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link ArrayOfRowDetailsTypeAirSeat }
     * 
     */
    public ArrayOfRowDetailsTypeAirSeat createArrayOfRowDetailsTypeAirSeat() {
        return new ArrayOfRowDetailsTypeAirSeat();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentFormType }
     * 
     */
    public ArrayOfPaymentFormType createArrayOfPaymentFormType() {
        return new ArrayOfPaymentFormType();
    }

    /**
     * Create an instance of {@link VehicleMatchedLocationType }
     * 
     */
    public VehicleMatchedLocationType createVehicleMatchedLocationType() {
        return new VehicleMatchedLocationType();
    }

    /**
     * Create an instance of {@link SeatingPrefType }
     * 
     */
    public SeatingPrefType createSeatingPrefType() {
        return new SeatingPrefType();
    }

    /**
     * Create an instance of {@link DeliveryFeeType }
     * 
     */
    public DeliveryFeeType createDeliveryFeeType() {
        return new DeliveryFeeType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref }
     * 
     */
    public VehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref createVehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref() {
        return new VehicleReservationRQCoreTypeSpecialEquipPrefsSpecialEquipPref();
    }

    /**
     * Create an instance of {@link OperatingAirlineType }
     * 
     */
    public OperatingAirlineType createOperatingAirlineType() {
        return new OperatingAirlineType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreTypeTotalCharge }
     * 
     */
    public VehicleReservationRQCoreTypeTotalCharge createVehicleReservationRQCoreTypeTotalCharge() {
        return new VehicleReservationRQCoreTypeTotalCharge();
    }

    /**
     * Create an instance of {@link OperationSchedulesType }
     * 
     */
    public OperationSchedulesType createOperationSchedulesType() {
        return new OperationSchedulesType();
    }

    /**
     * Create an instance of {@link ArrayOfIndCoverageReqsTypePreexistingCondition }
     * 
     */
    public ArrayOfIndCoverageReqsTypePreexistingCondition createArrayOfIndCoverageReqsTypePreexistingCondition() {
        return new ArrayOfIndCoverageReqsTypePreexistingCondition();
    }

    /**
     * Create an instance of {@link ArrayOfTaxInfo }
     * 
     */
    public ArrayOfTaxInfo createArrayOfTaxInfo() {
        return new ArrayOfTaxInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPassengerSpecialRequest }
     * 
     */
    public ArrayOfPassengerSpecialRequest createArrayOfPassengerSpecialRequest() {
        return new ArrayOfPassengerSpecialRequest();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleLocationInformationType }
     * 
     */
    public ArrayOfVehicleLocationInformationType createArrayOfVehicleLocationInformationType() {
        return new ArrayOfVehicleLocationInformationType();
    }

    /**
     * Create an instance of {@link AirTaxType }
     * 
     */
    public AirTaxType createAirTaxType() {
        return new AirTaxType();
    }

    /**
     * Create an instance of {@link ArrayOfFeeType }
     * 
     */
    public ArrayOfFeeType createArrayOfFeeType() {
        return new ArrayOfFeeType();
    }

    /**
     * Create an instance of {@link MiniRulesPriceText }
     * 
     */
    public MiniRulesPriceText createMiniRulesPriceText() {
        return new MiniRulesPriceText();
    }

    /**
     * Create an instance of {@link LCCBaggageFee }
     * 
     */
    public LCCBaggageFee createLCCBaggageFee() {
        return new LCCBaggageFee();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsTypeShuttle }
     * 
     */
    public VehicleLocationAdditionalDetailsTypeShuttle createVehicleLocationAdditionalDetailsTypeShuttle() {
        return new VehicleLocationAdditionalDetailsTypeShuttle();
    }

    /**
     * Create an instance of {@link ResCommonDetailType }
     * 
     */
    public ResCommonDetailType createResCommonDetailType() {
        return new ResCommonDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfCoveragePricedType }
     * 
     */
    public ArrayOfCoveragePricedType createArrayOfCoveragePricedType() {
        return new ArrayOfCoveragePricedType();
    }

    /**
     * Create an instance of {@link PaymentRulesType }
     * 
     */
    public PaymentRulesType createPaymentRulesType() {
        return new PaymentRulesType();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalTypePrimary }
     * 
     */
    public CustomerPrimaryAdditionalTypePrimary createCustomerPrimaryAdditionalTypePrimary() {
        return new CustomerPrimaryAdditionalTypePrimary();
    }

    /**
     * Create an instance of {@link DistribPrefType }
     * 
     */
    public DistribPrefType createDistribPrefType() {
        return new DistribPrefType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoTypeReference }
     * 
     */
    public VehicleReservationRQAdditionalInfoTypeReference createVehicleReservationRQAdditionalInfoTypeReference() {
        return new VehicleReservationRQAdditionalInfoTypeReference();
    }

    /**
     * Create an instance of {@link RoomAmenityPrefType }
     * 
     */
    public RoomAmenityPrefType createRoomAmenityPrefType() {
        return new RoomAmenityPrefType();
    }

    /**
     * Create an instance of {@link PassengerInfo }
     * 
     */
    public PassengerInfo createPassengerInfo() {
        return new PassengerInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAirTaxType }
     * 
     */
    public ArrayOfAirTaxType createArrayOfAirTaxType() {
        return new ArrayOfAirTaxType();
    }

    /**
     * Create an instance of {@link RuleLink }
     * 
     */
    public RuleLink createRuleLink() {
        return new RuleLink();
    }

    /**
     * Create an instance of {@link ImageItemType }
     * 
     */
    public ImageItemType createImageItemType() {
        return new ImageItemType();
    }

    /**
     * Create an instance of {@link VehicleRentalRateTypeRateGuarantee }
     * 
     */
    public VehicleRentalRateTypeRateGuarantee createVehicleRentalRateTypeRateGuarantee() {
        return new VehicleRentalRateTypeRateGuarantee();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreTypeReference }
     * 
     */
    public VehicleAvailCoreTypeReference createVehicleAvailCoreTypeReference() {
        return new VehicleAvailCoreTypeReference();
    }

    /**
     * Create an instance of {@link VehicleReservationType }
     * 
     */
    public VehicleReservationType createVehicleReservationType() {
        return new VehicleReservationType();
    }

    /**
     * Create an instance of {@link OSIelement }
     * 
     */
    public OSIelement createOSIelement() {
        return new OSIelement();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleVendorAvailabilityType }
     * 
     */
    public ArrayOfVehicleVendorAvailabilityType createArrayOfVehicleVendorAvailabilityType() {
        return new ArrayOfVehicleVendorAvailabilityType();
    }

    /**
     * Create an instance of {@link FarebasisChangesParameter }
     * 
     */
    public FarebasisChangesParameter createFarebasisChangesParameter() {
        return new FarebasisChangesParameter();
    }

    /**
     * Create an instance of {@link VendorMessageType }
     * 
     */
    public VendorMessageType createVendorMessageType() {
        return new VendorMessageType();
    }

    /**
     * Create an instance of {@link OSIElementChange }
     * 
     */
    public OSIElementChange createOSIElementChange() {
        return new OSIElementChange();
    }

    /**
     * Create an instance of {@link CabinAvailabilityTypeMeal }
     * 
     */
    public CabinAvailabilityTypeMeal createCabinAvailabilityTypeMeal() {
        return new CabinAvailabilityTypeMeal();
    }

    /**
     * Create an instance of {@link ArrayOfFlightTermsAndCondition }
     * 
     */
    public ArrayOfFlightTermsAndCondition createArrayOfFlightTermsAndCondition() {
        return new ArrayOfFlightTermsAndCondition();
    }

    /**
     * Create an instance of {@link VehicleAvailVendorInfoType }
     * 
     */
    public VehicleAvailVendorInfoType createVehicleAvailVendorInfoType() {
        return new VehicleAvailVendorInfoType();
    }

    /**
     * Create an instance of {@link DocumentDetails }
     * 
     */
    public DocumentDetails createDocumentDetails() {
        return new DocumentDetails();
    }

    /**
     * Create an instance of {@link ArrayOfInsCoverageDetailTypeCoveredTrip }
     * 
     */
    public ArrayOfInsCoverageDetailTypeCoveredTrip createArrayOfInsCoverageDetailTypeCoveredTrip() {
        return new ArrayOfInsCoverageDetailTypeCoveredTrip();
    }

    /**
     * Create an instance of {@link InsCoverageDetailTypeCoveredTrip }
     * 
     */
    public InsCoverageDetailTypeCoveredTrip createInsCoverageDetailTypeCoveredTrip() {
        return new InsCoverageDetailTypeCoveredTrip();
    }

    /**
     * Create an instance of {@link OriginDestinationCombinationType }
     * 
     */
    public OriginDestinationCombinationType createOriginDestinationCombinationType() {
        return new OriginDestinationCombinationType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreTypeVendorPrefs }
     * 
     */
    public VehicleAvailRQCoreTypeVendorPrefs createVehicleAvailRQCoreTypeVendorPrefs() {
        return new VehicleAvailRQCoreTypeVendorPrefs();
    }

    /**
     * Create an instance of {@link AncillaryCatalogueItemType }
     * 
     */
    public AncillaryCatalogueItemType createAncillaryCatalogueItemType() {
        return new AncillaryCatalogueItemType();
    }

    /**
     * Create an instance of {@link AncillaryServiceFeeType }
     * 
     */
    public AncillaryServiceFeeType createAncillaryServiceFeeType() {
        return new AncillaryServiceFeeType();
    }

    /**
     * Create an instance of {@link EquipmentTypePref }
     * 
     */
    public EquipmentTypePref createEquipmentTypePref() {
        return new EquipmentTypePref();
    }

    /**
     * Create an instance of {@link ArrayOfOSIelement }
     * 
     */
    public ArrayOfOSIelement createArrayOfOSIelement() {
        return new ArrayOfOSIelement();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRSSeatMapResponsesSeatMapResponse }
     * 
     */
    public OTAAirSeatMapRSSeatMapResponsesSeatMapResponse createOTAAirSeatMapRSSeatMapResponsesSeatMapResponse() {
        return new OTAAirSeatMapRSSeatMapResponsesSeatMapResponse();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation }
     * 
     */
    public OTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation createOTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation() {
        return new OTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation();
    }

    /**
     * Create an instance of {@link NameValueTypeItem }
     * 
     */
    public NameValueTypeItem createNameValueTypeItem() {
        return new NameValueTypeItem();
    }

    /**
     * Create an instance of {@link LCCRequiredParameter }
     * 
     */
    public LCCRequiredParameter createLCCRequiredParameter() {
        return new LCCRequiredParameter();
    }

    /**
     * Create an instance of {@link IndCoverageReqsTypeLuggageItemItemDeclaredValue }
     * 
     */
    public IndCoverageReqsTypeLuggageItemItemDeclaredValue createIndCoverageReqsTypeLuggageItemItemDeclaredValue() {
        return new IndCoverageReqsTypeLuggageItemItemDeclaredValue();
    }

    /**
     * Create an instance of {@link VehicleAvailAdditionalInfoType }
     * 
     */
    public VehicleAvailAdditionalInfoType createVehicleAvailAdditionalInfoType() {
        return new VehicleAvailAdditionalInfoType();
    }

    /**
     * Create an instance of {@link PlanCostType }
     * 
     */
    public PlanCostType createPlanCostType() {
        return new PlanCostType();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking }
     * 
     */
    public VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking createVehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking() {
        return new VehicleVendorAvailabilityTypeVehAvailsVehAvailAdvanceBooking();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     * 
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation createArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation() {
        return new ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation();
    }

    /**
     * Create an instance of {@link SpecRequestPrefType }
     * 
     */
    public SpecRequestPrefType createSpecRequestPrefType() {
        return new SpecRequestPrefType();
    }

    /**
     * Create an instance of {@link ArrayOfValidationError }
     * 
     */
    public ArrayOfValidationError createArrayOfValidationError() {
        return new ArrayOfValidationError();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRSSeatMapResponsesAirTraveler }
     * 
     */
    public OTAAirSeatMapRSSeatMapResponsesAirTraveler createOTAAirSeatMapRSSeatMapResponsesAirTraveler() {
        return new OTAAirSeatMapRSSeatMapResponsesAirTraveler();
    }

    /**
     * Create an instance of {@link InsCoverageDetailType }
     * 
     */
    public InsCoverageDetailType createInsCoverageDetailType() {
        return new InsCoverageDetailType();
    }

    /**
     * Create an instance of {@link ArrayOfCoverageLimitType }
     * 
     */
    public ArrayOfCoverageLimitType createArrayOfCoverageLimitType() {
        return new ArrayOfCoverageLimitType();
    }

    /**
     * Create an instance of {@link VehicleLocationInformationType }
     * 
     */
    public VehicleLocationInformationType createVehicleLocationInformationType() {
        return new VehicleLocationInformationType();
    }

    /**
     * Create an instance of {@link ArrayOfQueueSetting }
     * 
     */
    public ArrayOfQueueSetting createArrayOfQueueSetting() {
        return new ArrayOfQueueSetting();
    }

    /**
     * Create an instance of {@link MonetaryRuleType }
     * 
     */
    public MonetaryRuleType createMonetaryRuleType() {
        return new MonetaryRuleType();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityTypeVehAvailsVehAvail }
     * 
     */
    public VehicleVendorAvailabilityTypeVehAvailsVehAvail createVehicleVendorAvailabilityTypeVehAvailsVehAvail() {
        return new VehicleVendorAvailabilityTypeVehAvailsVehAvail();
    }

    /**
     * Create an instance of {@link AncillaryTicketCouponType }
     * 
     */
    public AncillaryTicketCouponType createAncillaryTicketCouponType() {
        return new AncillaryTicketCouponType();
    }

    /**
     * Create an instance of {@link OTAAirScheduleRSOriginDestinationOptions }
     * 
     */
    public OTAAirScheduleRSOriginDestinationOptions createOTAAirScheduleRSOriginDestinationOptions() {
        return new OTAAirScheduleRSOriginDestinationOptions();
    }

    /**
     * Create an instance of {@link LocationOpeningHour }
     * 
     */
    public LocationOpeningHour createLocationOpeningHour() {
        return new LocationOpeningHour();
    }

    /**
     * Create an instance of {@link CertificationType }
     * 
     */
    public CertificationType createCertificationType() {
        return new CertificationType();
    }

    /**
     * Create an instance of {@link HotelExtraFeeType }
     * 
     */
    public HotelExtraFeeType createHotelExtraFeeType() {
        return new HotelExtraFeeType();
    }

    /**
     * Create an instance of {@link VehicleLocationDetailsTypeTelephone }
     * 
     */
    public VehicleLocationDetailsTypeTelephone createVehicleLocationDetailsTypeTelephone() {
        return new VehicleLocationDetailsTypeTelephone();
    }

    /**
     * Create an instance of {@link ArrayOfAdditionalDetailType }
     * 
     */
    public ArrayOfAdditionalDetailType createArrayOfAdditionalDetailType() {
        return new ArrayOfAdditionalDetailType();
    }

    /**
     * Create an instance of {@link OTAAirScheduleRSAirItinerariesType }
     * 
     */
    public OTAAirScheduleRSAirItinerariesType createOTAAirScheduleRSAirItinerariesType() {
        return new OTAAirScheduleRSAirItinerariesType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoTypeCoveragePref }
     * 
     */
    public VehicleReservationRQAdditionalInfoTypeCoveragePref createVehicleReservationRQAdditionalInfoTypeCoveragePref() {
        return new VehicleReservationRQAdditionalInfoTypeCoveragePref();
    }

    /**
     * Create an instance of {@link VehicleTourInfoType }
     * 
     */
    public VehicleTourInfoType createVehicleTourInfoType() {
        return new VehicleTourInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfFlayerCardForSeatMap }
     * 
     */
    public ArrayOfFlayerCardForSeatMap createArrayOfFlayerCardForSeatMap() {
        return new ArrayOfFlayerCardForSeatMap();
    }

    /**
     * Create an instance of {@link OTAVehResRQVehResRQCore }
     * 
     */
    public OTAVehResRQVehResRQCore createOTAVehResRQVehResRQCore() {
        return new OTAVehResRQVehResRQCore();
    }

    /**
     * Create an instance of {@link RelatedTravelerPrefType }
     * 
     */
    public RelatedTravelerPrefType createRelatedTravelerPrefType() {
        return new RelatedTravelerPrefType();
    }

    /**
     * Create an instance of {@link DBBaseEntity }
     * 
     */
    public DBBaseEntity createDBBaseEntity() {
        return new DBBaseEntity();
    }

    /**
     * Create an instance of {@link ArrayOfMonetaryRuleType }
     * 
     */
    public ArrayOfMonetaryRuleType createArrayOfMonetaryRuleType() {
        return new ArrayOfMonetaryRuleType();
    }

    /**
     * Create an instance of {@link OTAInsuranceBookRSPlanForBookRSPolicyDetail }
     * 
     */
    public OTAInsuranceBookRSPlanForBookRSPolicyDetail createOTAInsuranceBookRSPlanForBookRSPolicyDetail() {
        return new OTAInsuranceBookRSPlanForBookRSPolicyDetail();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link LoyaltyProgramType }
     * 
     */
    public LoyaltyProgramType createLoyaltyProgramType() {
        return new LoyaltyProgramType();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link ArrayOfCommunicationHint }
     * 
     */
    public ArrayOfCommunicationHint createArrayOfCommunicationHint() {
        return new ArrayOfCommunicationHint();
    }

    /**
     * Create an instance of {@link FareFamily }
     * 
     */
    public FareFamily createFareFamily() {
        return new FareFamily();
    }

    /**
     * Create an instance of {@link ArrayOfOTAInsurancePlanSearchRQSearchTripInfoCoveredTrip }
     * 
     */
    public ArrayOfOTAInsurancePlanSearchRQSearchTripInfoCoveredTrip createArrayOfOTAInsurancePlanSearchRQSearchTripInfoCoveredTrip() {
        return new ArrayOfOTAInsurancePlanSearchRQSearchTripInfoCoveredTrip();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRQSearchTripInfoTotalTripCost }
     * 
     */
    public OTAInsurancePlanSearchRQSearchTripInfoTotalTripCost createOTAInsurancePlanSearchRQSearchTripInfoTotalTripCost() {
        return new OTAInsurancePlanSearchRQSearchTripInfoTotalTripCost();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo }
     * 
     */
    public OTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo createOTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo() {
        return new OTAAirSeatMapRSSeatMapResponsesSeatMapResponseFlightSegmentInfo();
    }

    /**
     * Create an instance of {@link AncillaryChangeParameter }
     * 
     */
    public AncillaryChangeParameter createAncillaryChangeParameter() {
        return new AncillaryChangeParameter();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRQAirTraveler }
     * 
     */
    public OTAAirSeatMapRQAirTraveler createOTAAirSeatMapRQAirTraveler() {
        return new OTAAirSeatMapRQAirTraveler();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRQSearchFlightInfo }
     * 
     */
    public OTAInsurancePlanSearchRQSearchFlightInfo createOTAInsurancePlanSearchRQSearchFlightInfo() {
        return new OTAInsurancePlanSearchRQSearchFlightInfo();
    }

    /**
     * Create an instance of {@link ArrayOfChangeDetail }
     * 
     */
    public ArrayOfChangeDetail createArrayOfChangeDetail() {
        return new ArrayOfChangeDetail();
    }

    /**
     * Create an instance of {@link VehicleAvailRSCoreType }
     * 
     */
    public VehicleAvailRSCoreType createVehicleAvailRSCoreType() {
        return new VehicleAvailRSCoreType();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRules }
     * 
     */
    public OTAVehRateRuleRSRateRules createOTAVehRateRuleRSRateRules() {
        return new OTAVehRateRuleRSRateRules();
    }

    /**
     * Create an instance of {@link QueueSetting }
     * 
     */
    public QueueSetting createQueueSetting() {
        return new QueueSetting();
    }

    /**
     * Create an instance of {@link TotalType }
     * 
     */
    public TotalType createTotalType() {
        return new TotalType();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     * 
     */
    public VehicleLocationAdditionalDetailsTypeOneWayDropLocation createVehicleLocationAdditionalDetailsTypeOneWayDropLocation() {
        return new VehicleLocationAdditionalDetailsTypeOneWayDropLocation();
    }

    /**
     * Create an instance of {@link CarExtraFeeType }
     * 
     */
    public CarExtraFeeType createCarExtraFeeType() {
        return new CarExtraFeeType();
    }

    /**
     * Create an instance of {@link OffLocationServiceTypeTelephone }
     * 
     */
    public OffLocationServiceTypeTelephone createOffLocationServiceTypeTelephone() {
        return new OffLocationServiceTypeTelephone();
    }

    /**
     * Create an instance of {@link GenericItem }
     * 
     */
    public GenericItem createGenericItem() {
        return new GenericItem();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleAvailRQCoreTypeVehPref }
     * 
     */
    public ArrayOfVehicleAvailRQCoreTypeVehPref createArrayOfVehicleAvailRQCoreTypeVehPref() {
        return new ArrayOfVehicleAvailRQCoreTypeVehPref();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoTypeRentalPaymentPref }
     * 
     */
    public VehicleReservationRQAdditionalInfoTypeRentalPaymentPref createVehicleReservationRQAdditionalInfoTypeRentalPaymentPref() {
        return new VehicleReservationRQAdditionalInfoTypeRentalPaymentPref();
    }

    /**
     * Create an instance of {@link FailbackIndicator }
     * 
     */
    public FailbackIndicator createFailbackIndicator() {
        return new FailbackIndicator();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreType }
     * 
     */
    public VehicleRentalCoreType createVehicleRentalCoreType() {
        return new VehicleRentalCoreType();
    }

    /**
     * Create an instance of {@link VehiclePrefType }
     * 
     */
    public VehiclePrefType createVehiclePrefType() {
        return new VehiclePrefType();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRQRentalInfoCustLoyalty }
     * 
     */
    public OTAVehRateRuleRQRentalInfoCustLoyalty createOTAVehRateRuleRQRentalInfoCustLoyalty() {
        return new OTAVehRateRuleRQRentalInfoCustLoyalty();
    }

    /**
     * Create an instance of {@link PlanCostTypeBasePremium }
     * 
     */
    public PlanCostTypeBasePremium createPlanCostTypeBasePremium() {
        return new PlanCostTypeBasePremium();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRQRentalInfo }
     * 
     */
    public OTAVehRateRuleRQRentalInfo createOTAVehRateRuleRQRentalInfo() {
        return new OTAVehRateRuleRQRentalInfo();
    }

    /**
     * Create an instance of {@link FormattedTextType }
     * 
     */
    public FormattedTextType createFormattedTextType() {
        return new FormattedTextType();
    }

    /**
     * Create an instance of {@link ArrayOfOTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation }
     * 
     */
    public ArrayOfOTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation createArrayOfOTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation() {
        return new ArrayOfOTAAirSeatMapRQSeatMapRequestSeatDetailsResBookDesignation();
    }

    /**
     * Create an instance of {@link ArrayOfRuleInfos }
     * 
     */
    public ArrayOfRuleInfos createArrayOfRuleInfos() {
        return new ArrayOfRuleInfos();
    }

    /**
     * Create an instance of {@link InsCoverageDetailTypeTotalTripQuantity }
     * 
     */
    public InsCoverageDetailTypeTotalTripQuantity createInsCoverageDetailTypeTotalTripQuantity() {
        return new InsCoverageDetailTypeTotalTripQuantity();
    }

    /**
     * Create an instance of {@link IndCoverageReqsTypeIndTripCost }
     * 
     */
    public IndCoverageReqsTypeIndTripCost createIndCoverageReqsTypeIndTripCost() {
        return new IndCoverageReqsTypeIndTripCost();
    }

    /**
     * Create an instance of {@link CoveragePricedType }
     * 
     */
    public CoveragePricedType createCoveragePricedType() {
        return new CoveragePricedType();
    }

    /**
     * Create an instance of {@link CoverageLimitTypeDeductible }
     * 
     */
    public CoverageLimitTypeDeductible createCoverageLimitTypeDeductible() {
        return new CoverageLimitTypeDeductible();
    }

    /**
     * Create an instance of {@link SeatRequestType }
     * 
     */
    public SeatRequestType createSeatRequestType() {
        return new SeatRequestType();
    }

    /**
     * Create an instance of {@link ArrayOfPNRRemarkChange }
     * 
     */
    public ArrayOfPNRRemarkChange createArrayOfPNRRemarkChange() {
        return new ArrayOfPNRRemarkChange();
    }

    /**
     * Create an instance of {@link VehicleChargeType }
     * 
     */
    public VehicleChargeType createVehicleChargeType() {
        return new VehicleChargeType();
    }

    /**
     * Create an instance of {@link IndCoverageReqsTypePreexistingCondition }
     * 
     */
    public IndCoverageReqsTypePreexistingCondition createIndCoverageReqsTypePreexistingCondition() {
        return new IndCoverageReqsTypePreexistingCondition();
    }

    /**
     * Create an instance of {@link MiniRulesPriceMessages }
     * 
     */
    public MiniRulesPriceMessages createMiniRulesPriceMessages() {
        return new MiniRulesPriceMessages();
    }

    /**
     * Create an instance of {@link PassengerDetailChanges }
     * 
     */
    public PassengerDetailChanges createPassengerDetailChanges() {
        return new PassengerDetailChanges();
    }

    /**
     * Create an instance of {@link CabinClassType }
     * 
     */
    public CabinClassType createCabinClassType() {
        return new CabinClassType();
    }

    /**
     * Create an instance of {@link LoyaltyPrefType }
     * 
     */
    public LoyaltyPrefType createLoyaltyPrefType() {
        return new LoyaltyPrefType();
    }

    /**
     * Create an instance of {@link TicketingInfoType }
     * 
     */
    public TicketingInfoType createTicketingInfoType() {
        return new TicketingInfoType();
    }

    /**
     * Create an instance of {@link PNRRemarkInfo }
     * 
     */
    public PNRRemarkInfo createPNRRemarkInfo() {
        return new PNRRemarkInfo();
    }

    /**
     * Create an instance of {@link wsimport.lib.epower.Document }
     * 
     */
    public wsimport.lib.epower.Document createDocument() {
        return new wsimport.lib.epower.Document();
    }

    /**
     * Create an instance of {@link AgreementsType }
     * 
     */
    public AgreementsType createAgreementsType() {
        return new AgreementsType();
    }

    /**
     * Create an instance of {@link VehicleRentalRateTypeRateDistance }
     * 
     */
    public VehicleRentalRateTypeRateDistance createVehicleRentalRateTypeRateDistance() {
        return new VehicleRentalRateTypeRateDistance();
    }

    /**
     * Create an instance of {@link BookingToBeCancelled }
     * 
     */
    public BookingToBeCancelled createBookingToBeCancelled() {
        return new BookingToBeCancelled();
    }

    /**
     * Create an instance of {@link ValidationError }
     * 
     */
    public ValidationError createValidationError() {
        return new ValidationError();
    }

    /**
     * Create an instance of {@link ParagraphTypeListItem }
     * 
     */
    public ParagraphTypeListItem createParagraphTypeListItem() {
        return new ParagraphTypeListItem();
    }

    /**
     * Create an instance of {@link AncillaryTicketFOPType }
     * 
     */
    public AncillaryTicketFOPType createAncillaryTicketFOPType() {
        return new AncillaryTicketFOPType();
    }

    /**
     * Create an instance of {@link ArrayOfRoomAmenityPrefType }
     * 
     */
    public ArrayOfRoomAmenityPrefType createArrayOfRoomAmenityPrefType() {
        return new ArrayOfRoomAmenityPrefType();
    }

    /**
     * Create an instance of {@link VehicleChargeTypeTaxAmount }
     * 
     */
    public VehicleChargeTypeTaxAmount createVehicleChargeTypeTaxAmount() {
        return new VehicleChargeTypeTaxAmount();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePaymentsAcceptablePayment }
     * 
     */
    public OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePaymentsAcceptablePayment createOTAVehRateRuleRSRateRulesPaymentRulesAcceptablePaymentsAcceptablePayment() {
        return new OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePaymentsAcceptablePayment();
    }

    /**
     * Create an instance of {@link VehicleArrivalDetailsType }
     * 
     */
    public VehicleArrivalDetailsType createVehicleArrivalDetailsType() {
        return new VehicleArrivalDetailsType();
    }

    /**
     * Create an instance of {@link TripFeaturesType }
     * 
     */
    public TripFeaturesType createTripFeaturesType() {
        return new TripFeaturesType();
    }

    /**
     * Create an instance of {@link OtherSrvcPrefType }
     * 
     */
    public OtherSrvcPrefType createOtherSrvcPrefType() {
        return new OtherSrvcPrefType();
    }

    /**
     * Create an instance of {@link IndCoverageReqsTypeLuggageItemLuggagePremium }
     * 
     */
    public IndCoverageReqsTypeLuggageItemLuggagePremium createIndCoverageReqsTypeLuggageItemLuggagePremium() {
        return new IndCoverageReqsTypeLuggageItemLuggagePremium();
    }

    /**
     * Create an instance of {@link ArrayOfSourceType }
     * 
     */
    public ArrayOfSourceType createArrayOfSourceType() {
        return new ArrayOfSourceType();
    }

    /**
     * Create an instance of {@link ArrayOfFareFamilyDescription }
     * 
     */
    public ArrayOfFareFamilyDescription createArrayOfFareFamilyDescription() {
        return new ArrayOfFareFamilyDescription();
    }

    /**
     * Create an instance of {@link TravelerInformationType }
     * 
     */
    public TravelerInformationType createTravelerInformationType() {
        return new TravelerInformationType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref }
     * 
     */
    public ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref createArrayOfVehicleAvailRQCoreTypeSpecialEquipPref() {
        return new ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref }
     * 
     */
    public ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref createArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref() {
        return new ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref();
    }

    /**
     * Create an instance of {@link RequiredParameter }
     * 
     */
    public RequiredParameter createRequiredParameter() {
        return new RequiredParameter();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link AncillaryTicketCouponDetailType }
     * 
     */
    public AncillaryTicketCouponDetailType createAncillaryTicketCouponDetailType() {
        return new AncillaryTicketCouponDetailType();
    }

    /**
     * Create an instance of {@link RecreationSrvcPrefType }
     * 
     */
    public RecreationSrvcPrefType createRecreationSrvcPrefType() {
        return new RecreationSrvcPrefType();
    }

    /**
     * Create an instance of {@link ArrayOfFormattedTextType }
     * 
     */
    public ArrayOfFormattedTextType createArrayOfFormattedTextType() {
        return new ArrayOfFormattedTextType();
    }

    /**
     * Create an instance of {@link ArrayOfLCCCheckInOption }
     * 
     */
    public ArrayOfLCCCheckInOption createArrayOfLCCCheckInOption() {
        return new ArrayOfLCCCheckInOption();
    }

    /**
     * Create an instance of {@link VehicleResRSAdditionalInfoType }
     * 
     */
    public VehicleResRSAdditionalInfoType createVehicleResRSAdditionalInfoType() {
        return new VehicleResRSAdditionalInfoType();
    }

    /**
     * Create an instance of {@link OTAAirRulesRQRuleReqInfoSubSection }
     * 
     */
    public OTAAirRulesRQRuleReqInfoSubSection createOTAAirRulesRQRuleReqInfoSubSection() {
        return new OTAAirRulesRQRuleReqInfoSubSection();
    }

    /**
     * Create an instance of {@link CoveredTravelerTypeCitizenCountryName }
     * 
     */
    public CoveredTravelerTypeCitizenCountryName createCoveredTravelerTypeCitizenCountryName() {
        return new CoveredTravelerTypeCitizenCountryName();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSVehRentalCore }
     * 
     */
    public OTAVehRateRuleRSVehRentalCore createOTAVehRateRuleRSVehRentalCore() {
        return new OTAVehRateRuleRSVehRentalCore();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link EmployeeInfoType }
     * 
     */
    public EmployeeInfoType createEmployeeInfoType() {
        return new EmployeeInfoType();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreType }
     * 
     */
    public VehicleSegmentCoreType createVehicleSegmentCoreType() {
        return new VehicleSegmentCoreType();
    }

    /**
     * Create an instance of {@link OperationScheduleType }
     * 
     */
    public OperationScheduleType createOperationScheduleType() {
        return new OperationScheduleType();
    }

    /**
     * Create an instance of {@link SeatMapDetailsType }
     * 
     */
    public SeatMapDetailsType createSeatMapDetailsType() {
        return new SeatMapDetailsType();
    }

    /**
     * Create an instance of {@link CommunicationDetails }
     * 
     */
    public CommunicationDetails createCommunicationDetails() {
        return new CommunicationDetails();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRQAirTravelerCustLoyalty }
     * 
     */
    public OTAAirSeatMapRQAirTravelerCustLoyalty createOTAAirSeatMapRQAirTravelerCustLoyalty() {
        return new OTAAirSeatMapRQAirTravelerCustLoyalty();
    }

    /**
     * Create an instance of {@link ArrayOfFareFamily }
     * 
     */
    public ArrayOfFareFamily createArrayOfFareFamily() {
        return new ArrayOfFareFamily();
    }

    /**
     * Create an instance of {@link ArrayOfWarningType1 }
     * 
     */
    public ArrayOfWarningType1 createArrayOfWarningType1() {
        return new ArrayOfWarningType1();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSLocationDetails }
     * 
     */
    public OTAVehRateRuleRSLocationDetails createOTAVehRateRuleRSLocationDetails() {
        return new OTAVehRateRuleRSLocationDetails();
    }

    /**
     * Create an instance of {@link TicketingInfoRSType }
     * 
     */
    public TicketingInfoRSType createTicketingInfoRSType() {
        return new TicketingInfoRSType();
    }

    /**
     * Create an instance of {@link ArrayOfOTAVehRateRuleRQRentalInfoSpecialEquipPref }
     * 
     */
    public ArrayOfOTAVehRateRuleRQRentalInfoSpecialEquipPref createArrayOfOTAVehRateRuleRQRentalInfoSpecialEquipPref() {
        return new ArrayOfOTAVehRateRuleRQRentalInfoSpecialEquipPref();
    }

    /**
     * Create an instance of {@link PriceMessageInfoType }
     * 
     */
    public PriceMessageInfoType createPriceMessageInfoType() {
        return new PriceMessageInfoType();
    }

    /**
     * Create an instance of {@link BedTypePrefType }
     * 
     */
    public BedTypePrefType createBedTypePrefType() {
        return new BedTypePrefType();
    }

    /**
     * Create an instance of {@link VehicleReservationTypeVehSegmentCore }
     * 
     */
    public VehicleReservationTypeVehSegmentCore createVehicleReservationTypeVehSegmentCore() {
        return new VehicleReservationTypeVehSegmentCore();
    }

    /**
     * Create an instance of {@link AirlineDiversityType }
     * 
     */
    public AirlineDiversityType createAirlineDiversityType() {
        return new AirlineDiversityType();
    }

    /**
     * Create an instance of {@link OTAAirScheduleRQFlightTypePref }
     * 
     */
    public OTAAirScheduleRQFlightTypePref createOTAAirScheduleRQFlightTypePref() {
        return new OTAAirScheduleRQFlightTypePref();
    }

    /**
     * Create an instance of {@link BookingFeeType }
     * 
     */
    public BookingFeeType createBookingFeeType() {
        return new BookingFeeType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreTypeVendorPrefsVendorPref }
     * 
     */
    public VehicleAvailRQCoreTypeVendorPrefsVendorPref createVehicleAvailRQCoreTypeVendorPrefsVendorPref() {
        return new VehicleAvailRQCoreTypeVendorPrefsVendorPref();
    }

    /**
     * Create an instance of {@link AncillaryTicketFareInfoType }
     * 
     */
    public AncillaryTicketFareInfoType createAncillaryTicketFareInfoType() {
        return new AncillaryTicketFareInfoType();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesPickupReturnRulesEarliestPickup }
     * 
     */
    public OTAVehRateRuleRSRateRulesPickupReturnRulesEarliestPickup createOTAVehRateRuleRSRateRulesPickupReturnRulesEarliestPickup() {
        return new OTAVehRateRuleRSRateRulesPickupReturnRulesEarliestPickup();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link InsCoverageDetailTypeTotalTripCost }
     * 
     */
    public InsCoverageDetailTypeTotalTripCost createInsCoverageDetailTypeTotalTripCost() {
        return new InsCoverageDetailTypeTotalTripCost();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSPricedCoverages }
     * 
     */
    public OTAVehRateRuleRSPricedCoverages createOTAVehRateRuleRSPricedCoverages() {
        return new OTAVehRateRuleRSPricedCoverages();
    }

    /**
     * Create an instance of {@link InsurancePrefType }
     * 
     */
    public InsurancePrefType createInsurancePrefType() {
        return new InsurancePrefType();
    }

    /**
     * Create an instance of {@link ArrayOfLCCRequiredParameter }
     * 
     */
    public ArrayOfLCCRequiredParameter createArrayOfLCCRequiredParameter() {
        return new ArrayOfLCCRequiredParameter();
    }

    /**
     * Create an instance of {@link CoveredTravelerTypeCoveredPerson }
     * 
     */
    public CoveredTravelerTypeCoveredPerson createCoveredTravelerTypeCoveredPerson() {
        return new CoveredTravelerTypeCoveredPerson();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityTypeVehAvails }
     * 
     */
    public VehicleVendorAvailabilityTypeVehAvails createVehicleVendorAvailabilityTypeVehAvails() {
        return new VehicleVendorAvailabilityTypeVehAvails();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link BoundedAffiliationsType }
     * 
     */
    public BoundedAffiliationsType createBoundedAffiliationsType() {
        return new BoundedAffiliationsType();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlan }
     * 
     */
    public OTAInsurancePlanSearchRSAvailablePlansAvailablePlan createOTAInsurancePlanSearchRSAvailablePlansAvailablePlan() {
        return new OTAInsurancePlanSearchRSAvailablePlansAvailablePlan();
    }

    /**
     * Create an instance of {@link ArrayOfOrganization }
     * 
     */
    public ArrayOfOrganization createArrayOfOrganization() {
        return new ArrayOfOrganization();
    }

    /**
     * Create an instance of {@link PlanRestrictionTypePlanRestriction }
     * 
     */
    public PlanRestrictionTypePlanRestriction createPlanRestrictionTypePlanRestriction() {
        return new PlanRestrictionTypePlanRestriction();
    }

    /**
     * Create an instance of {@link PropertyTypePrefType }
     * 
     */
    public PropertyTypePrefType createPropertyTypePrefType() {
        return new PropertyTypePrefType();
    }

    /**
     * Create an instance of {@link FailbackParameter }
     * 
     */
    public FailbackParameter createFailbackParameter() {
        return new FailbackParameter();
    }

    /**
     * Create an instance of {@link URLType }
     * 
     */
    public URLType createURLType() {
        return new URLType();
    }

    /**
     * Create an instance of {@link OTAAirScheduleRSAirItineraryType }
     * 
     */
    public OTAAirScheduleRSAirItineraryType createOTAAirScheduleRSAirItineraryType() {
        return new OTAAirScheduleRSAirItineraryType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link HotelPrefType }
     * 
     */
    public HotelPrefType createHotelPrefType() {
        return new HotelPrefType();
    }

    /**
     * Create an instance of {@link FreeBaggageAllowanceTypes }
     * 
     */
    public FreeBaggageAllowanceTypes createFreeBaggageAllowanceTypes() {
        return new FreeBaggageAllowanceTypes();
    }

    /**
     * Create an instance of {@link PassengerDB }
     * 
     */
    public PassengerDB createPassengerDB() {
        return new PassengerDB();
    }

    /**
     * Create an instance of {@link ArrayOfAirFeeType }
     * 
     */
    public ArrayOfAirFeeType createArrayOfAirFeeType() {
        return new ArrayOfAirFeeType();
    }

    /**
     * Create an instance of {@link CancelPenaltiesType }
     * 
     */
    public CancelPenaltiesType createCancelPenaltiesType() {
        return new CancelPenaltiesType();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreTypeTotalCharge }
     * 
     */
    public VehicleAvailCoreTypeTotalCharge createVehicleAvailCoreTypeTotalCharge() {
        return new VehicleAvailCoreTypeTotalCharge();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link ETicketInfo }
     * 
     */
    public ETicketInfo createETicketInfo() {
        return new ETicketInfo();
    }

    /**
     * Create an instance of {@link CoverageLimitType }
     * 
     */
    public CoverageLimitType createCoverageLimitType() {
        return new CoverageLimitType();
    }

    /**
     * Create an instance of {@link ServiceFeeInfoRQFlightInfo }
     * 
     */
    public ServiceFeeInfoRQFlightInfo createServiceFeeInfoRQFlightInfo() {
        return new ServiceFeeInfoRQFlightInfo();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRQSeatMapRequestSeatDetails }
     * 
     */
    public OTAAirSeatMapRQSeatMapRequestSeatDetails createOTAAirSeatMapRQSeatMapRequestSeatDetails() {
        return new OTAAirSeatMapRQSeatMapRequestSeatDetails();
    }

    /**
     * Create an instance of {@link ETicketItineraryInfo }
     * 
     */
    public ETicketItineraryInfo createETicketItineraryInfo() {
        return new ETicketItineraryInfo();
    }

    /**
     * Create an instance of {@link RoomStayCandidateType }
     * 
     */
    public RoomStayCandidateType createRoomStayCandidateType() {
        return new RoomStayCandidateType();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRSAvailablePlans }
     * 
     */
    public OTAInsurancePlanSearchRSAvailablePlans createOTAInsurancePlanSearchRSAvailablePlans() {
        return new OTAInsurancePlanSearchRSAvailablePlans();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreType }
     * 
     */
    public VehicleAvailCoreType createVehicleAvailCoreType() {
        return new VehicleAvailCoreType();
    }

    /**
     * Create an instance of {@link AdditionalGuestAmountType }
     * 
     */
    public AdditionalGuestAmountType createAdditionalGuestAmountType() {
        return new AdditionalGuestAmountType();
    }

    /**
     * Create an instance of {@link ServiceFeeType }
     * 
     */
    public ServiceFeeType createServiceFeeType() {
        return new ServiceFeeType();
    }

    /**
     * Create an instance of {@link PassengerDetails }
     * 
     */
    public PassengerDetails createPassengerDetails() {
        return new PassengerDetails();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesRateDeposit }
     * 
     */
    public OTAVehRateRuleRSRateRulesRateDeposit createOTAVehRateRuleRSRateRulesRateDeposit() {
        return new OTAVehRateRuleRSRateRulesRateDeposit();
    }

    /**
     * Create an instance of {@link RowDetailsType }
     * 
     */
    public RowDetailsType createRowDetailsType() {
        return new RowDetailsType();
    }

    /**
     * Create an instance of {@link PetInfoPrefType }
     * 
     */
    public PetInfoPrefType createPetInfoPrefType() {
        return new PetInfoPrefType();
    }

    /**
     * Create an instance of {@link SeatTakenParameter }
     * 
     */
    public SeatTakenParameter createSeatTakenParameter() {
        return new SeatTakenParameter();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRQCoveragePreference }
     * 
     */
    public OTAInsurancePlanSearchRQCoveragePreference createOTAInsurancePlanSearchRQCoveragePreference() {
        return new OTAInsurancePlanSearchRQCoveragePreference();
    }

    /**
     * Create an instance of {@link ColumnDetailsType }
     * 
     */
    public ColumnDetailsType createColumnDetailsType() {
        return new ColumnDetailsType();
    }

    /**
     * Create an instance of {@link InsuranceType }
     * 
     */
    public InsuranceType createInsuranceType() {
        return new InsuranceType();
    }

    /**
     * Create an instance of {@link RoomLocationPrefType }
     * 
     */
    public RoomLocationPrefType createRoomLocationPrefType() {
        return new RoomLocationPrefType();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRQSearchTravInfo }
     * 
     */
    public OTAInsurancePlanSearchRQSearchTravInfo createOTAInsurancePlanSearchRQSearchTravInfo() {
        return new OTAInsurancePlanSearchRQSearchTravInfo();
    }

    /**
     * Create an instance of {@link AdditionalDetailType }
     * 
     */
    public AdditionalDetailType createAdditionalDetailType() {
        return new AdditionalDetailType();
    }

    /**
     * Create an instance of {@link CCOBFeeType }
     * 
     */
    public CCOBFeeType createCCOBFeeType() {
        return new CCOBFeeType();
    }

    /**
     * Create an instance of {@link ServiceFeesType }
     * 
     */
    public ServiceFeesType createServiceFeesType() {
        return new ServiceFeesType();
    }

    /**
     * Create an instance of {@link ArrayOfOriginDestinationCombinationType }
     * 
     */
    public ArrayOfOriginDestinationCombinationType createArrayOfOriginDestinationCombinationType() {
        return new ArrayOfOriginDestinationCombinationType();
    }

    /**
     * Create an instance of {@link PNRListItemType }
     * 
     */
    public PNRListItemType createPNRListItemType() {
        return new PNRListItemType();
    }

    /**
     * Create an instance of {@link InsuranceCustomerType }
     * 
     */
    public InsuranceCustomerType createInsuranceCustomerType() {
        return new InsuranceCustomerType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreTypeRateQualifier }
     * 
     */
    public VehicleAvailRQCoreTypeRateQualifier createVehicleAvailRQCoreTypeRateQualifier() {
        return new VehicleAvailRQCoreTypeRateQualifier();
    }

    /**
     * Create an instance of {@link PassengerTypeQuantityType }
     * 
     */
    public PassengerTypeQuantityType createPassengerTypeQuantityType() {
        return new PassengerTypeQuantityType();
    }

    /**
     * Create an instance of {@link ArrayOfFrequentFlyerCardsWithPassengerForSeatMap }
     * 
     */
    public ArrayOfFrequentFlyerCardsWithPassengerForSeatMap createArrayOfFrequentFlyerCardsWithPassengerForSeatMap() {
        return new ArrayOfFrequentFlyerCardsWithPassengerForSeatMap();
    }

    /**
     * Create an instance of {@link ArrayOfSSRRequiredParameterRQ }
     * 
     */
    public ArrayOfSSRRequiredParameterRQ createArrayOfSSRRequiredParameterRQ() {
        return new ArrayOfSSRRequiredParameterRQ();
    }

    /**
     * Create an instance of {@link ArrayOfWarningType }
     * 
     */
    public ArrayOfWarningType createArrayOfWarningType() {
        return new ArrayOfWarningType();
    }

    /**
     * Create an instance of {@link VehicleEquipmentType }
     * 
     */
    public VehicleEquipmentType createVehicleEquipmentType() {
        return new VehicleEquipmentType();
    }

    /**
     * Create an instance of {@link FormattedTextSubSectionType }
     * 
     */
    public FormattedTextSubSectionType createFormattedTextSubSectionType() {
        return new FormattedTextSubSectionType();
    }

    /**
     * Create an instance of {@link TravelArrangerType }
     * 
     */
    public TravelArrangerType createTravelArrangerType() {
        return new TravelArrangerType();
    }

    /**
     * Create an instance of {@link ScheduleChangeParameter }
     * 
     */
    public ScheduleChangeParameter createScheduleChangeParameter() {
        return new ScheduleChangeParameter();
    }

    /**
     * Create an instance of {@link DocumentHint }
     * 
     */
    public DocumentHint createDocumentHint() {
        return new DocumentHint();
    }

    /**
     * Create an instance of {@link SearchTravelerTypeCitizenCountryName }
     * 
     */
    public SearchTravelerTypeCitizenCountryName createSearchTravelerTypeCitizenCountryName() {
        return new SearchTravelerTypeCitizenCountryName();
    }

    /**
     * Create an instance of {@link QueSetting }
     * 
     */
    public QueSetting createQueSetting() {
        return new QueSetting();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsType }
     * 
     */
    public VehicleLocationAdditionalDetailsType createVehicleLocationAdditionalDetailsType() {
        return new VehicleLocationAdditionalDetailsType();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePayments }
     * 
     */
    public OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePayments createOTAVehRateRuleRSRateRulesPaymentRulesAcceptablePayments() {
        return new OTAVehRateRuleRSRateRulesPaymentRulesAcceptablePayments();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleChargePurposeType }
     * 
     */
    public ArrayOfVehicleChargePurposeType createArrayOfVehicleChargePurposeType() {
        return new ArrayOfVehicleChargePurposeType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreTypeRateDistance }
     * 
     */
    public VehicleReservationRQCoreTypeRateDistance createVehicleReservationRQCoreTypeRateDistance() {
        return new VehicleReservationRQCoreTypeRateDistance();
    }

    /**
     * Create an instance of {@link CommissionInfoType }
     * 
     */
    public CommissionInfoType createCommissionInfoType() {
        return new CommissionInfoType();
    }

    /**
     * Create an instance of {@link HotelPriceChangeInfo }
     * 
     */
    public HotelPriceChangeInfo createHotelPriceChangeInfo() {
        return new HotelPriceChangeInfo();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesCancelPenaltyInfo }
     * 
     */
    public OTAVehRateRuleRSRateRulesCancelPenaltyInfo createOTAVehRateRuleRSRateRulesCancelPenaltyInfo() {
        return new OTAVehRateRuleRSRateRulesCancelPenaltyInfo();
    }

    /**
     * Create an instance of {@link CorporateSetting }
     * 
     */
    public CorporateSetting createCorporateSetting() {
        return new CorporateSetting();
    }

    /**
     * Create an instance of {@link RelatedMember }
     * 
     */
    public RelatedMember createRelatedMember() {
        return new RelatedMember();
    }

    /**
     * Create an instance of {@link ArrayOfOTAAirSeatMapRQSeatMapRequest }
     * 
     */
    public ArrayOfOTAAirSeatMapRQSeatMapRequest createArrayOfOTAAirSeatMapRQSeatMapRequest() {
        return new ArrayOfOTAAirSeatMapRQSeatMapRequest();
    }

    /**
     * Create an instance of {@link TPAExtensionsType }
     * 
     */
    public TPAExtensionsType createTPAExtensionsType() {
        return new TPAExtensionsType();
    }

    /**
     * Create an instance of {@link EmployerType }
     * 
     */
    public EmployerType createEmployerType() {
        return new EmployerType();
    }

    /**
     * Create an instance of {@link PropertyClassPrefType }
     * 
     */
    public PropertyClassPrefType createPropertyClassPrefType() {
        return new PropertyClassPrefType();
    }

    /**
     * Create an instance of {@link PassengerSpecialRequest }
     * 
     */
    public PassengerSpecialRequest createPassengerSpecialRequest() {
        return new PassengerSpecialRequest();
    }

    /**
     * Create an instance of {@link ArrayOfPassengerDB }
     * 
     */
    public ArrayOfPassengerDB createArrayOfPassengerDB() {
        return new ArrayOfPassengerDB();
    }

    /**
     * Create an instance of {@link IndCoverageReqsTypeLuggageItem }
     * 
     */
    public IndCoverageReqsTypeLuggageItem createIndCoverageReqsTypeLuggageItem() {
        return new IndCoverageReqsTypeLuggageItem();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreTypeSpecialEquipPrefs }
     * 
     */
    public VehicleReservationRQCoreTypeSpecialEquipPrefs createVehicleReservationRQCoreTypeSpecialEquipPrefs() {
        return new VehicleReservationRQCoreTypeSpecialEquipPrefs();
    }

    /**
     * Create an instance of {@link CoverageDetailsType }
     * 
     */
    public CoverageDetailsType createCoverageDetailsType() {
        return new CoverageDetailsType();
    }

    /**
     * Create an instance of {@link APISRuleDoca }
     * 
     */
    public APISRuleDoca createAPISRuleDoca() {
        return new APISRuleDoca();
    }

    /**
     * Create an instance of {@link AffiliationsType }
     * 
     */
    public AffiliationsType createAffiliationsType() {
        return new AffiliationsType();
    }

    /**
     * Create an instance of {@link ArrayOfCommunication }
     * 
     */
    public ArrayOfCommunication createArrayOfCommunication() {
        return new ArrayOfCommunication();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link TransportationsType }
     * 
     */
    public TransportationsType createTransportationsType() {
        return new TransportationsType();
    }

    /**
     * Create an instance of {@link APISRuleDoco }
     * 
     */
    public APISRuleDoco createAPISRuleDoco() {
        return new APISRuleDoco();
    }

    /**
     * Create an instance of {@link MiniRules }
     * 
     */
    public MiniRules createMiniRules() {
        return new MiniRules();
    }

    /**
     * Create an instance of {@link VehicleAvailRQAdditionalInfoType }
     * 
     */
    public VehicleAvailRQAdditionalInfoType createVehicleAvailRQAdditionalInfoType() {
        return new VehicleAvailRQAdditionalInfoType();
    }

    /**
     * Create an instance of {@link InsCoverageType }
     * 
     */
    public InsCoverageType createInsCoverageType() {
        return new InsCoverageType();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalTypeAdditional }
     * 
     */
    public CustomerPrimaryAdditionalTypeAdditional createCustomerPrimaryAdditionalTypeAdditional() {
        return new CustomerPrimaryAdditionalTypeAdditional();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesAdvanceBooking }
     * 
     */
    public OTAVehRateRuleRSRateRulesAdvanceBooking createOTAVehRateRuleRSRateRulesAdvanceBooking() {
        return new OTAVehRateRuleRSRateRulesAdvanceBooking();
    }

    /**
     * Create an instance of {@link TimeDurationType }
     * 
     */
    public TimeDurationType createTimeDurationType() {
        return new TimeDurationType();
    }

    /**
     * Create an instance of {@link APISRuleDocs }
     * 
     */
    public APISRuleDocs createAPISRuleDocs() {
        return new APISRuleDocs();
    }

    /**
     * Create an instance of {@link VehicleChargePurposeType }
     * 
     */
    public VehicleChargePurposeType createVehicleChargePurposeType() {
        return new VehicleChargePurposeType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQAdditionalInfoType }
     * 
     */
    public VehicleReservationRQAdditionalInfoType createVehicleReservationRQAdditionalInfoType() {
        return new VehicleReservationRQAdditionalInfoType();
    }

    /**
     * Create an instance of {@link IndCoverageReqsType }
     * 
     */
    public IndCoverageReqsType createIndCoverageReqsType() {
        return new IndCoverageReqsType();
    }

    /**
     * Create an instance of {@link BusinessSrvcPrefType }
     * 
     */
    public BusinessSrvcPrefType createBusinessSrvcPrefType() {
        return new BusinessSrvcPrefType();
    }

    /**
     * Create an instance of {@link ArrayOfTripFeaturesTypeDestination }
     * 
     */
    public ArrayOfTripFeaturesTypeDestination createArrayOfTripFeaturesTypeDestination() {
        return new ArrayOfTripFeaturesTypeDestination();
    }

    /**
     * Create an instance of {@link OTAInsuranceBookRQPlanForBookRQ }
     * 
     */
    public OTAInsuranceBookRQPlanForBookRQ createOTAInsuranceBookRQPlanForBookRQ() {
        return new OTAInsuranceBookRQPlanForBookRQ();
    }

    /**
     * Create an instance of {@link OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOption }
     * 
     */
    public OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOption createOTAAirScheduleRSOriginDestinationOptionsOriginDestinationOption() {
        return new OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOption();
    }

    /**
     * Create an instance of {@link ArrayOfLCCSupportedCard }
     * 
     */
    public ArrayOfLCCSupportedCard createArrayOfLCCSupportedCard() {
        return new ArrayOfLCCSupportedCard();
    }

    /**
     * Create an instance of {@link OTAVehResRQVehResRQInfo }
     * 
     */
    public OTAVehResRQVehResRQInfo createOTAVehResRQVehResRQInfo() {
        return new OTAVehResRQVehResRQInfo();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link ArrayOfString2 }
     * 
     */
    public ArrayOfString2 createArrayOfString2() {
        return new ArrayOfString2();
    }

    /**
     * Create an instance of {@link WrittenConfInstType }
     * 
     */
    public WrittenConfInstType createWrittenConfInstType() {
        return new WrittenConfInstType();
    }

    /**
     * Create an instance of {@link ArrayOfString3 }
     * 
     */
    public ArrayOfString3 createArrayOfString3() {
        return new ArrayOfString3();
    }

    /**
     * Create an instance of {@link VehicleAvailRSAdditionalInfoType }
     * 
     */
    public VehicleAvailRSAdditionalInfoType createVehicleAvailRSAdditionalInfoType() {
        return new VehicleAvailRSAdditionalInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfString4 }
     * 
     */
    public ArrayOfString4 createArrayOfString4() {
        return new ArrayOfString4();
    }

    /**
     * Create an instance of {@link ArrayOfString5 }
     * 
     */
    public ArrayOfString5 createArrayOfString5() {
        return new ArrayOfString5();
    }

    /**
     * Create an instance of {@link HotelReservationsType }
     * 
     */
    public HotelReservationsType createHotelReservationsType() {
        return new HotelReservationsType();
    }

    /**
     * Create an instance of {@link SpecialServiceRequestType }
     * 
     */
    public SpecialServiceRequestType createSpecialServiceRequestType() {
        return new SpecialServiceRequestType();
    }

    /**
     * Create an instance of {@link SSRRequiredParameterRQ }
     * 
     */
    public SSRRequiredParameterRQ createSSRRequiredParameterRQ() {
        return new SSRRequiredParameterRQ();
    }

    /**
     * Create an instance of {@link ArrayOfPNRRemarkInfo }
     * 
     */
    public ArrayOfPNRRemarkInfo createArrayOfPNRRemarkInfo() {
        return new ArrayOfPNRRemarkInfo();
    }

    /**
     * Create an instance of {@link IndCoverageReqsTypeFlightAccidentAmount }
     * 
     */
    public IndCoverageReqsTypeFlightAccidentAmount createIndCoverageReqsTypeFlightAccidentAmount() {
        return new IndCoverageReqsTypeFlightAccidentAmount();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRemarkType }
     * 
     */
    public ArrayOfSpecialRemarkType createArrayOfSpecialRemarkType() {
        return new ArrayOfSpecialRemarkType();
    }

    /**
     * Create an instance of {@link ArrayOfDocument }
     * 
     */
    public ArrayOfDocument createArrayOfDocument() {
        return new ArrayOfDocument();
    }

    /**
     * Create an instance of {@link VehicleResRSCoreType }
     * 
     */
    public VehicleResRSCoreType createVehicleResRSCoreType() {
        return new VehicleResRSCoreType();
    }

    /**
     * Create an instance of {@link BookingPriceInfoType }
     * 
     */
    public BookingPriceInfoType createBookingPriceInfoType() {
        return new BookingPriceInfoType();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreTypeReturnLocation }
     * 
     */
    public VehicleRentalCoreTypeReturnLocation createVehicleRentalCoreTypeReturnLocation() {
        return new VehicleRentalCoreTypeReturnLocation();
    }

    /**
     * Create an instance of {@link RuleInfosDetails }
     * 
     */
    public RuleInfosDetails createRuleInfosDetails() {
        return new RuleInfosDetails();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesCancelPenaltyInfoDeadline }
     * 
     */
    public OTAVehRateRuleRSRateRulesCancelPenaltyInfoDeadline createOTAVehRateRuleRSRateRulesCancelPenaltyInfoDeadline() {
        return new OTAVehRateRuleRSRateRulesCancelPenaltyInfoDeadline();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRQSearchTripInfoCoveredTrip }
     * 
     */
    public OTAInsurancePlanSearchRQSearchTripInfoCoveredTrip createOTAInsurancePlanSearchRQSearchTripInfoCoveredTrip() {
        return new OTAInsurancePlanSearchRQSearchTripInfoCoveredTrip();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link CustomerPrimaryAdditionalType }
     * 
     */
    public CustomerPrimaryAdditionalType createCustomerPrimaryAdditionalType() {
        return new CustomerPrimaryAdditionalType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleChargeTypeTaxAmount }
     * 
     */
    public ArrayOfVehicleChargeTypeTaxAmount createArrayOfVehicleChargeTypeTaxAmount() {
        return new ArrayOfVehicleChargeTypeTaxAmount();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionsType }
     * 
     */
    public MultimediaDescriptionsType createMultimediaDescriptionsType() {
        return new MultimediaDescriptionsType();
    }

    /**
     * Create an instance of {@link GenericFlightRQ }
     * 
     */
    public GenericFlightRQ createGenericFlightRQ() {
        return new GenericFlightRQ();
    }

    /**
     * Create an instance of {@link ArrayOfUniqueIDType }
     * 
     */
    public ArrayOfUniqueIDType createArrayOfUniqueIDType() {
        return new ArrayOfUniqueIDType();
    }

    /**
     * Create an instance of {@link ArrayOfPassengerFlyerCard }
     * 
     */
    public ArrayOfPassengerFlyerCard createArrayOfPassengerFlyerCard() {
        return new ArrayOfPassengerFlyerCard();
    }

    /**
     * Create an instance of {@link VehicleAvailRQAdditionalInfoTypeCoveragePref }
     * 
     */
    public VehicleAvailRQAdditionalInfoTypeCoveragePref createVehicleAvailRQAdditionalInfoTypeCoveragePref() {
        return new VehicleAvailRQAdditionalInfoTypeCoveragePref();
    }

    /**
     * Create an instance of {@link SearchTravelerType }
     * 
     */
    public SearchTravelerType createSearchTravelerType() {
        return new SearchTravelerType();
    }

    /**
     * Create an instance of {@link StreetNmbrType }
     * 
     */
    public StreetNmbrType createStreetNmbrType() {
        return new StreetNmbrType();
    }

    /**
     * Create an instance of {@link OTAVehLocSearchRSVehMatchedLocs }
     * 
     */
    public OTAVehLocSearchRSVehMatchedLocs createOTAVehLocSearchRSVehMatchedLocs() {
        return new OTAVehLocSearchRSVehMatchedLocs();
    }

    /**
     * Create an instance of {@link AncillaryEticketInfoType }
     * 
     */
    public AncillaryEticketInfoType createAncillaryEticketInfoType() {
        return new AncillaryEticketInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfRateQualifierTypeRateComment }
     * 
     */
    public ArrayOfRateQualifierTypeRateComment createArrayOfRateQualifierTypeRateComment() {
        return new ArrayOfRateQualifierTypeRateComment();
    }

    /**
     * Create an instance of {@link VehicleChargeTypeCalculation }
     * 
     */
    public VehicleChargeTypeCalculation createVehicleChargeTypeCalculation() {
        return new VehicleChargeTypeCalculation();
    }

    /**
     * Create an instance of {@link ArrayOfSearchTravelerType }
     * 
     */
    public ArrayOfSearchTravelerType createArrayOfSearchTravelerType() {
        return new ArrayOfSearchTravelerType();
    }

    /**
     * Create an instance of {@link AncillaryTicketRemarkType }
     * 
     */
    public AncillaryTicketRemarkType createAncillaryTicketRemarkType() {
        return new AncillaryTicketRemarkType();
    }

    /**
     * Create an instance of {@link OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment }
     * 
     */
    public OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment createOTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment() {
        return new OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegment();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRQRentalInfoSpecialEquipPref }
     * 
     */
    public OTAVehRateRuleRQRentalInfoSpecialEquipPref createOTAVehRateRuleRQRentalInfoSpecialEquipPref() {
        return new OTAVehRateRuleRQRentalInfoSpecialEquipPref();
    }

    /**
     * Create an instance of {@link CrossBoarderSearchSetting }
     * 
     */
    public CrossBoarderSearchSetting createCrossBoarderSearchSetting() {
        return new CrossBoarderSearchSetting();
    }

    /**
     * Create an instance of {@link RelatedTravelerType }
     * 
     */
    public RelatedTravelerType createRelatedTravelerType() {
        return new RelatedTravelerType();
    }

    /**
     * Create an instance of {@link TicketDistribPrefType }
     * 
     */
    public TicketDistribPrefType createTicketDistribPrefType() {
        return new TicketDistribPrefType();
    }

    /**
     * Create an instance of {@link OTAInsuranceBookRSPlanForBookRS }
     * 
     */
    public OTAInsuranceBookRSPlanForBookRS createOTAInsuranceBookRSPlanForBookRS() {
        return new OTAInsuranceBookRSPlanForBookRS();
    }

    /**
     * Create an instance of {@link FreeBaggageAllowancesTypes }
     * 
     */
    public FreeBaggageAllowancesTypes createFreeBaggageAllowancesTypes() {
        return new FreeBaggageAllowancesTypes();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredParameter }
     * 
     */
    public ArrayOfRequiredParameter createArrayOfRequiredParameter() {
        return new ArrayOfRequiredParameter();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreType }
     * 
     */
    public VehicleReservationRQCoreType createVehicleReservationRQCoreType() {
        return new VehicleReservationRQCoreType();
    }

    /**
     * Create an instance of {@link AddressDB }
     * 
     */
    public AddressDB createAddressDB() {
        return new AddressDB();
    }

    /**
     * Create an instance of {@link CoveredTravelerTypeBeneficiaryName }
     * 
     */
    public CoveredTravelerTypeBeneficiaryName createCoveredTravelerTypeBeneficiaryName() {
        return new CoveredTravelerTypeBeneficiaryName();
    }

    /**
     * Create an instance of {@link Corporate }
     * 
     */
    public Corporate createCorporate() {
        return new Corporate();
    }

    /**
     * Create an instance of {@link CabinAvailabilityTypeBaggageAllowance }
     * 
     */
    public CabinAvailabilityTypeBaggageAllowance createCabinAvailabilityTypeBaggageAllowance() {
        return new CabinAvailabilityTypeBaggageAllowance();
    }

    /**
     * Create an instance of {@link CompanyNamePrefType }
     * 
     */
    public CompanyNamePrefType createCompanyNamePrefType() {
        return new CompanyNamePrefType();
    }

    /**
     * Create an instance of {@link VehicleRentalRateTypeRateRestrictions }
     * 
     */
    public VehicleRentalRateTypeRateRestrictions createVehicleRentalRateTypeRateRestrictions() {
        return new VehicleRentalRateTypeRateRestrictions();
    }

    /**
     * Create an instance of {@link CompanyNameType }
     * 
     */
    public CompanyNameType createCompanyNameType() {
        return new CompanyNameType();
    }

    /**
     * Create an instance of {@link ArrayOfOTAAirSeatMapRQAirTraveler }
     * 
     */
    public ArrayOfOTAAirSeatMapRQAirTraveler createArrayOfOTAAirSeatMapRQAirTraveler() {
        return new ArrayOfOTAAirSeatMapRQAirTraveler();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreTypeDriverType }
     * 
     */
    public VehicleAvailRQCoreTypeDriverType createVehicleAvailRQCoreTypeDriverType() {
        return new VehicleAvailRQCoreTypeDriverType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link AddressInfoType }
     * 
     */
    public AddressInfoType createAddressInfoType() {
        return new AddressInfoType();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreTypeVendorLocation }
     * 
     */
    public VehicleAvailCoreTypeVendorLocation createVehicleAvailCoreTypeVendorLocation() {
        return new VehicleAvailCoreTypeVendorLocation();
    }

    /**
     * Create an instance of {@link PNRListType }
     * 
     */
    public PNRListType createPNRListType() {
        return new PNRListType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
     * 
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo createArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo() {
        return new ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link AirItineraryType }
     * 
     */
    public AirItineraryType createAirItineraryType() {
        return new AirItineraryType();
    }

    /**
     * Create an instance of {@link VehicleRentalRateTypePickupReturnRule }
     * 
     */
    public VehicleRentalRateTypePickupReturnRule createVehicleRentalRateTypePickupReturnRule() {
        return new VehicleRentalRateTypePickupReturnRule();
    }

    /**
     * Create an instance of {@link RateQualifierType }
     * 
     */
    public RateQualifierType createRateQualifierType() {
        return new RateQualifierType();
    }

    /**
     * Create an instance of {@link StateProvType }
     * 
     */
    public StateProvType createStateProvType() {
        return new StateProvType();
    }

    /**
     * Create an instance of {@link ArrayOfRowDetailsType }
     * 
     */
    public ArrayOfRowDetailsType createArrayOfRowDetailsType() {
        return new ArrayOfRowDetailsType();
    }

    /**
     * Create an instance of {@link VehicleTypeVehIdentity }
     * 
     */
    public VehicleTypeVehIdentity createVehicleTypeVehIdentity() {
        return new VehicleTypeVehIdentity();
    }

    /**
     * Create an instance of {@link wsimport.lib.epower.FareInfo }
     * 
     */
    public wsimport.lib.epower.FareInfo createFareInfo() {
        return new wsimport.lib.epower.FareInfo();
    }

    /**
     * Create an instance of {@link TaxInfo }
     * 
     */
    public TaxInfo createTaxInfo() {
        return new TaxInfo();
    }

    /**
     * Create an instance of {@link TravelDateTimeType }
     * 
     */
    public TravelDateTimeType createTravelDateTimeType() {
        return new TravelDateTimeType();
    }

    /**
     * Create an instance of {@link CoveredTravelerTypeBeneficiary }
     * 
     */
    public CoveredTravelerTypeBeneficiary createCoveredTravelerTypeBeneficiary() {
        return new CoveredTravelerTypeBeneficiary();
    }

    /**
     * Create an instance of {@link APISRules }
     * 
     */
    public APISRules createAPISRules() {
        return new APISRules();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreTypeQueue }
     * 
     */
    public VehicleReservationRQCoreTypeQueue createVehicleReservationRQCoreTypeQueue() {
        return new VehicleReservationRQCoreTypeQueue();
    }

    /**
     * Create an instance of {@link ArrayOfMiniRulesPriceMessages }
     * 
     */
    public ArrayOfMiniRulesPriceMessages createArrayOfMiniRulesPriceMessages() {
        return new ArrayOfMiniRulesPriceMessages();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleChargePurposeType1 }
     * 
     */
    public ArrayOfVehicleChargePurposeType1 createArrayOfVehicleChargePurposeType1() {
        return new ArrayOfVehicleChargePurposeType1();
    }

    /**
     * Create an instance of {@link AddressHint }
     * 
     */
    public AddressHint createAddressHint() {
        return new AddressHint();
    }

    /**
     * Create an instance of {@link RoomTypeType }
     * 
     */
    public RoomTypeType createRoomTypeType() {
        return new RoomTypeType();
    }

    /**
     * Create an instance of {@link ExpandedParametersType }
     * 
     */
    public ExpandedParametersType createExpandedParametersType() {
        return new ExpandedParametersType();
    }

    /**
     * Create an instance of {@link OtherExtraCostType }
     * 
     */
    public OtherExtraCostType createOtherExtraCostType() {
        return new OtherExtraCostType();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRSSeatMapResponses }
     * 
     */
    public OTAAirSeatMapRSSeatMapResponses createOTAAirSeatMapRSSeatMapResponses() {
        return new OTAAirSeatMapRSSeatMapResponses();
    }

    /**
     * Create an instance of {@link PersonalSrvcPrefType }
     * 
     */
    public PersonalSrvcPrefType createPersonalSrvcPrefType() {
        return new PersonalSrvcPrefType();
    }

    /**
     * Create an instance of {@link VehicleEquipmentPricedType }
     * 
     */
    public VehicleEquipmentPricedType createVehicleEquipmentPricedType() {
        return new VehicleEquipmentPricedType();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesPickupReturnRulesLatestPickup }
     * 
     */
    public OTAVehRateRuleRSRateRulesPickupReturnRulesLatestPickup createOTAVehRateRuleRSRateRulesPickupReturnRulesLatestPickup() {
        return new OTAVehRateRuleRSRateRulesPickupReturnRulesLatestPickup();
    }

    /**
     * Create an instance of {@link AirFeeType }
     * 
     */
    public AirFeeType createAirFeeType() {
        return new AirFeeType();
    }

    /**
     * Create an instance of {@link ArrayOfETicketItineraryInfo }
     * 
     */
    public ArrayOfETicketItineraryInfo createArrayOfETicketItineraryInfo() {
        return new ArrayOfETicketItineraryInfo();
    }

    /**
     * Create an instance of {@link ResGlobalInfoType }
     * 
     */
    public ResGlobalInfoType createResGlobalInfoType() {
        return new ResGlobalInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfOTAInsurancePlanSearchRQCoveragePreference }
     * 
     */
    public ArrayOfOTAInsurancePlanSearchRQCoveragePreference createArrayOfOTAInsurancePlanSearchRQCoveragePreference() {
        return new ArrayOfOTAInsurancePlanSearchRQCoveragePreference();
    }

    /**
     * Create an instance of {@link RowDetailsTypeAirRowCharacteristics }
     * 
     */
    public RowDetailsTypeAirRowCharacteristics createRowDetailsTypeAirRowCharacteristics() {
        return new RowDetailsTypeAirRowCharacteristics();
    }

    /**
     * Create an instance of {@link LCCSupportedCard }
     * 
     */
    public LCCSupportedCard createLCCSupportedCard() {
        return new LCCSupportedCard();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSTotalCharge }
     * 
     */
    public OTAVehRateRuleRSTotalCharge createOTAVehRateRuleRSTotalCharge() {
        return new OTAVehRateRuleRSTotalCharge();
    }

    /**
     * Create an instance of {@link VehicleChargeTypeMinMax }
     * 
     */
    public VehicleChargeTypeMinMax createVehicleChargeTypeMinMax() {
        return new VehicleChargeTypeMinMax();
    }

    /**
     * Create an instance of {@link ArrayOfRoomTypeType }
     * 
     */
    public ArrayOfRoomTypeType createArrayOfRoomTypeType() {
        return new ArrayOfRoomTypeType();
    }

    /**
     * Create an instance of {@link FareRuleResponseInfoType }
     * 
     */
    public FareRuleResponseInfoType createFareRuleResponseInfoType() {
        return new FareRuleResponseInfoType();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRSSeatMapResponsesAirTravelerTravelerRefNumber }
     * 
     */
    public OTAAirSeatMapRSSeatMapResponsesAirTravelerTravelerRefNumber createOTAAirSeatMapRSSeatMapResponsesAirTravelerTravelerRefNumber() {
        return new OTAAirSeatMapRSSeatMapResponsesAirTravelerTravelerRefNumber();
    }

    /**
     * Create an instance of {@link FormattedTextTextType }
     * 
     */
    public FormattedTextTextType createFormattedTextTextType() {
        return new FormattedTextTextType();
    }

    /**
     * Create an instance of {@link PaymentFeeType }
     * 
     */
    public PaymentFeeType createPaymentFeeType() {
        return new PaymentFeeType();
    }

    /**
     * Create an instance of {@link ArrayOfFeeType1 }
     * 
     */
    public ArrayOfFeeType1 createArrayOfFeeType1() {
        return new ArrayOfFeeType1();
    }

    /**
     * Create an instance of {@link FlightInfo }
     * 
     */
    public FlightInfo createFlightInfo() {
        return new FlightInfo();
    }

    /**
     * Create an instance of {@link ColumnDetailsTypeAirColumnCharacteristics }
     * 
     */
    public ColumnDetailsTypeAirColumnCharacteristics createColumnDetailsTypeAirColumnCharacteristics() {
        return new ColumnDetailsTypeAirColumnCharacteristics();
    }

    /**
     * Create an instance of {@link VehicleVendorAvailabilityType }
     * 
     */
    public VehicleVendorAvailabilityType createVehicleVendorAvailabilityType() {
        return new VehicleVendorAvailabilityType();
    }

    /**
     * Create an instance of {@link OffLocationServiceType }
     * 
     */
    public OffLocationServiceType createOffLocationServiceType() {
        return new OffLocationServiceType();
    }

    /**
     * Create an instance of {@link FrequentFlyerCardType }
     * 
     */
    public FrequentFlyerCardType createFrequentFlyerCardType() {
        return new FrequentFlyerCardType();
    }

    /**
     * Create an instance of {@link PassengerFlyerCard }
     * 
     */
    public PassengerFlyerCard createPassengerFlyerCard() {
        return new PassengerFlyerCard();
    }

    /**
     * Create an instance of {@link ArrayOfETicketInfo }
     * 
     */
    public ArrayOfETicketInfo createArrayOfETicketInfo() {
        return new ArrayOfETicketInfo();
    }

    /**
     * Create an instance of {@link PropertyAmenityPrefType }
     * 
     */
    public PropertyAmenityPrefType createPropertyAmenityPrefType() {
        return new PropertyAmenityPrefType();
    }

    /**
     * Create an instance of {@link AncillaryFeeType }
     * 
     */
    public AncillaryFeeType createAncillaryFeeType() {
        return new AncillaryFeeType();
    }

    /**
     * Create an instance of {@link PhysChallFeaturePrefType }
     * 
     */
    public PhysChallFeaturePrefType createPhysChallFeaturePrefType() {
        return new PhysChallFeaturePrefType();
    }

    /**
     * Create an instance of {@link MiniRuleResponseInfoType }
     * 
     */
    public MiniRuleResponseInfoType createMiniRuleResponseInfoType() {
        return new MiniRuleResponseInfoType();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRequestChange }
     * 
     */
    public ArrayOfSpecialRequestChange createArrayOfSpecialRequestChange() {
        return new ArrayOfSpecialRequestChange();
    }

    /**
     * Create an instance of {@link TaxesType }
     * 
     */
    public TaxesType createTaxesType() {
        return new TaxesType();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRentalRate }
     * 
     */
    public OTAVehRateRuleRSRentalRate createOTAVehRateRuleRSRentalRate() {
        return new OTAVehRateRuleRSRentalRate();
    }

    /**
     * Create an instance of {@link VehicleWhereAtFacilityType }
     * 
     */
    public VehicleWhereAtFacilityType createVehicleWhereAtFacilityType() {
        return new VehicleWhereAtFacilityType();
    }

    /**
     * Create an instance of {@link ArrayOfLCCBaggageFee }
     * 
     */
    public ArrayOfLCCBaggageFee createArrayOfLCCBaggageFee() {
        return new ArrayOfLCCBaggageFee();
    }

    /**
     * Create an instance of {@link InterestPrefType }
     * 
     */
    public InterestPrefType createInterestPrefType() {
        return new InterestPrefType();
    }

    /**
     * Create an instance of {@link ArrayOfPTCFareBreakdownType }
     * 
     */
    public ArrayOfPTCFareBreakdownType createArrayOfPTCFareBreakdownType() {
        return new ArrayOfPTCFareBreakdownType();
    }

    /**
     * Create an instance of {@link SpecialRequestChange }
     * 
     */
    public SpecialRequestChange createSpecialRequestChange() {
        return new SpecialRequestChange();
    }

    /**
     * Create an instance of {@link OTAVehResRSVehResRSCore }
     * 
     */
    public OTAVehResRSVehResRSCore createOTAVehResRSVehResRSCore() {
        return new OTAVehResRSVehResRSCore();
    }

    /**
     * Create an instance of {@link AmountPercentType }
     * 
     */
    public AmountPercentType createAmountPercentType() {
        return new AmountPercentType();
    }

    /**
     * Create an instance of {@link FareRuleResponseInfoTypeFareRuleInfo }
     * 
     */
    public FareRuleResponseInfoTypeFareRuleInfo createFareRuleResponseInfoTypeFareRuleInfo() {
        return new FareRuleResponseInfoTypeFareRuleInfo();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSPricedEquips }
     * 
     */
    public OTAVehRateRuleRSPricedEquips createOTAVehRateRuleRSPricedEquips() {
        return new OTAVehRateRuleRSPricedEquips();
    }

    /**
     * Create an instance of {@link OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentTrafficRestrictionInfo }
     * 
     */
    public OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentTrafficRestrictionInfo createOTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentTrafficRestrictionInfo() {
        return new OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentTrafficRestrictionInfo();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRQSeatMapRequestSeatDetailsCabinClass }
     * 
     */
    public OTAAirSeatMapRQSeatMapRequestSeatDetailsCabinClass createOTAAirSeatMapRQSeatMapRequestSeatDetailsCabinClass() {
        return new OTAAirSeatMapRQSeatMapRequestSeatDetailsCabinClass();
    }

    /**
     * Create an instance of {@link ArrayOfNameValueTypeItem }
     * 
     */
    public ArrayOfNameValueTypeItem createArrayOfNameValueTypeItem() {
        return new ArrayOfNameValueTypeItem();
    }

    /**
     * Create an instance of {@link TDESValue }
     * 
     */
    public TDESValue createTDESValue() {
        return new TDESValue();
    }

    /**
     * Create an instance of {@link VendorMessagesType }
     * 
     */
    public VendorMessagesType createVendorMessagesType() {
        return new VendorMessagesType();
    }

    /**
     * Create an instance of {@link VehicleSegmentAdditionalInfoType }
     * 
     */
    public VehicleSegmentAdditionalInfoType createVehicleSegmentAdditionalInfoType() {
        return new VehicleSegmentAdditionalInfoType();
    }

    /**
     * Create an instance of {@link AncillaryServiceFeesType }
     * 
     */
    public AncillaryServiceFeesType createAncillaryServiceFeesType() {
        return new AncillaryServiceFeesType();
    }

    /**
     * Create an instance of {@link VehicleLocationDetailsType }
     * 
     */
    public VehicleLocationDetailsType createVehicleLocationDetailsType() {
        return new VehicleLocationDetailsType();
    }

    /**
     * Create an instance of {@link RuleInfos }
     * 
     */
    public RuleInfos createRuleInfos() {
        return new RuleInfos();
    }

    /**
     * Create an instance of {@link TimeInstantType }
     * 
     */
    public TimeInstantType createTimeInstantType() {
        return new TimeInstantType();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRQSeatMapRequest }
     * 
     */
    public OTAAirSeatMapRQSeatMapRequest createOTAAirSeatMapRQSeatMapRequest() {
        return new OTAAirSeatMapRQSeatMapRequest();
    }

    /**
     * Create an instance of {@link Communication }
     * 
     */
    public Communication createCommunication() {
        return new Communication();
    }

    /**
     * Create an instance of {@link AncillaryFareType }
     * 
     */
    public AncillaryFareType createAncillaryFareType() {
        return new AncillaryFareType();
    }

    /**
     * Create an instance of {@link wsimport.lib.epower.ProfileType }
     * 
     */
    public wsimport.lib.epower.ProfileType createProfileType() {
        return new wsimport.lib.epower.ProfileType();
    }

    /**
     * Create an instance of {@link ArrayOfCorporateSetting }
     * 
     */
    public ArrayOfCorporateSetting createArrayOfCorporateSetting() {
        return new ArrayOfCorporateSetting();
    }

    /**
     * Create an instance of {@link ArrayOfColumnDetailsType }
     * 
     */
    public ArrayOfColumnDetailsType createArrayOfColumnDetailsType() {
        return new ArrayOfColumnDetailsType();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail }
     * 
     */
    public OTAInsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail createOTAInsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail() {
        return new OTAInsurancePlanSearchRSAvailablePlansAvailablePlanProviderDetail();
    }

    /**
     * Create an instance of {@link AddressDetails }
     * 
     */
    public AddressDetails createAddressDetails() {
        return new AddressDetails();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesCancelPenaltyInfoPenaltyFee }
     * 
     */
    public OTAVehRateRuleRSRateRulesCancelPenaltyInfoPenaltyFee createOTAVehRateRuleRSRateRulesCancelPenaltyInfoPenaltyFee() {
        return new OTAVehRateRuleRSRateRulesCancelPenaltyInfoPenaltyFee();
    }

    /**
     * Create an instance of {@link MarketingCabinType }
     * 
     */
    public MarketingCabinType createMarketingCabinType() {
        return new MarketingCabinType();
    }

    /**
     * Create an instance of {@link ArrayOfVendorMessageType }
     * 
     */
    public ArrayOfVendorMessageType createArrayOfVendorMessageType() {
        return new ArrayOfVendorMessageType();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link AncillaryProductType }
     * 
     */
    public AncillaryProductType createAncillaryProductType() {
        return new AncillaryProductType();
    }

    /**
     * Create an instance of {@link AirlineOBFeeType }
     * 
     */
    public AirlineOBFeeType createAirlineOBFeeType() {
        return new AirlineOBFeeType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleVendorAddressType }
     * 
     */
    public ArrayOfVehicleVendorAddressType createArrayOfVehicleVendorAddressType() {
        return new ArrayOfVehicleVendorAddressType();
    }

    /**
     * Create an instance of {@link OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentBookingClass }
     * 
     */
    public OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentBookingClass createOTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentBookingClass() {
        return new OTAAirScheduleRSOriginDestinationOptionsOriginDestinationOptionFlightSegmentBookingClass();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRQSearchTripInfo }
     * 
     */
    public OTAInsurancePlanSearchRQSearchTripInfo createOTAInsurancePlanSearchRQSearchTripInfo() {
        return new OTAInsurancePlanSearchRQSearchTripInfo();
    }

    /**
     * Create an instance of {@link MultimediaDescriptionType }
     * 
     */
    public MultimediaDescriptionType createMultimediaDescriptionType() {
        return new MultimediaDescriptionType();
    }

    /**
     * Create an instance of {@link EquipmentType }
     * 
     */
    public EquipmentType createEquipmentType() {
        return new EquipmentType();
    }

    /**
     * Create an instance of {@link FareRuleResponseInfoTypeAdvisoryInfo }
     * 
     */
    public FareRuleResponseInfoTypeAdvisoryInfo createFareRuleResponseInfoTypeAdvisoryInfo() {
        return new FareRuleResponseInfoTypeAdvisoryInfo();
    }

    /**
     * Create an instance of {@link ArrayOfFreeBaggageAllowanceTypes }
     * 
     */
    public ArrayOfFreeBaggageAllowanceTypes createArrayOfFreeBaggageAllowanceTypes() {
        return new ArrayOfFreeBaggageAllowanceTypes();
    }

    /**
     * Create an instance of {@link VehicleTypeVehMakeModel }
     * 
     */
    public VehicleTypeVehMakeModel createVehicleTypeVehMakeModel() {
        return new VehicleTypeVehMakeModel();
    }

    /**
     * Create an instance of {@link ArrayOfAddressHint }
     * 
     */
    public ArrayOfAddressHint createArrayOfAddressHint() {
        return new ArrayOfAddressHint();
    }

    /**
     * Create an instance of {@link ServiceFeeInfoRQHotelInfo }
     * 
     */
    public ServiceFeeInfoRQHotelInfo createServiceFeeInfoRQHotelInfo() {
        return new ServiceFeeInfoRQHotelInfo();
    }

    /**
     * Create an instance of {@link ArrayOfProfileType }
     * 
     */
    public ArrayOfProfileType createArrayOfProfileType() {
        return new ArrayOfProfileType();
    }

    /**
     * Create an instance of {@link ArrayOfCoveredTravelerType }
     * 
     */
    public ArrayOfCoveredTravelerType createArrayOfCoveredTravelerType() {
        return new ArrayOfCoveredTravelerType();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreTypeVendor }
     * 
     */
    public VehicleAvailCoreTypeVendor createVehicleAvailCoreTypeVendor() {
        return new VehicleAvailCoreTypeVendor();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentDetailType }
     * 
     */
    public ArrayOfPaymentDetailType createArrayOfPaymentDetailType() {
        return new ArrayOfPaymentDetailType();
    }

    /**
     * Create an instance of {@link PNRRemarkChange }
     * 
     */
    public PNRRemarkChange createPNRRemarkChange() {
        return new PNRRemarkChange();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreTypeVehPref }
     * 
     */
    public VehicleAvailRQCoreTypeVehPref createVehicleAvailRQCoreTypeVehPref() {
        return new VehicleAvailRQCoreTypeVehPref();
    }

    /**
     * Create an instance of {@link ServiceFeeInfoRQInsuranceInfo }
     * 
     */
    public ServiceFeeInfoRQInsuranceInfo createServiceFeeInfoRQInsuranceInfo() {
        return new ServiceFeeInfoRQInsuranceInfo();
    }

    /**
     * Create an instance of {@link VehicleAvailCoreTypeDropOffLocation }
     * 
     */
    public VehicleAvailCoreTypeDropOffLocation createVehicleAvailCoreTypeDropOffLocation() {
        return new VehicleAvailCoreTypeDropOffLocation();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link InsuranceExtraFeeType }
     * 
     */
    public InsuranceExtraFeeType createInsuranceExtraFeeType() {
        return new InsuranceExtraFeeType();
    }

    /**
     * Create an instance of {@link OTAAirRulesRQRuleReqInfo }
     * 
     */
    public OTAAirRulesRQRuleReqInfo createOTAAirRulesRQRuleReqInfo() {
        return new OTAAirRulesRQRuleReqInfo();
    }

    /**
     * Create an instance of {@link AncillaryProductsType }
     * 
     */
    public AncillaryProductsType createAncillaryProductsType() {
        return new AncillaryProductsType();
    }

    /**
     * Create an instance of {@link FrequentFlyerCardsWithPassengerForSeatMap }
     * 
     */
    public FrequentFlyerCardsWithPassengerForSeatMap createFrequentFlyerCardsWithPassengerForSeatMap() {
        return new FrequentFlyerCardsWithPassengerForSeatMap();
    }

    /**
     * Create an instance of {@link FareFamilyDescription }
     * 
     */
    public FareFamilyDescription createFareFamilyDescription() {
        return new FareFamilyDescription();
    }

    /**
     * Create an instance of {@link ArrayOfMiniRulesPriceText }
     * 
     */
    public ArrayOfMiniRulesPriceText createArrayOfMiniRulesPriceText() {
        return new ArrayOfMiniRulesPriceText();
    }

    /**
     * Create an instance of {@link VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
     * 
     */
    public VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo createVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo() {
        return new VehicleLocationAdditionalDetailsTypeShuttleShuttleInfo();
    }

    /**
     * Create an instance of {@link VehicleVendorAddressType }
     * 
     */
    public VehicleVendorAddressType createVehicleVendorAddressType() {
        return new VehicleVendorAddressType();
    }

    /**
     * Create an instance of {@link AvailableDate }
     * 
     */
    public AvailableDate createAvailableDate() {
        return new AvailableDate();
    }

    /**
     * Create an instance of {@link CoverageLimitTypePolicyLimit }
     * 
     */
    public CoverageLimitTypePolicyLimit createCoverageLimitTypePolicyLimit() {
        return new CoverageLimitTypePolicyLimit();
    }

    /**
     * Create an instance of {@link UniqueIDType }
     * 
     */
    public UniqueIDType createUniqueIDType() {
        return new UniqueIDType();
    }

    /**
     * Create an instance of {@link FareRuleResponseInfoTypeRoutingInfo }
     * 
     */
    public FareRuleResponseInfoTypeRoutingInfo createFareRuleResponseInfoTypeRoutingInfo() {
        return new FareRuleResponseInfoTypeRoutingInfo();
    }

    /**
     * Create an instance of {@link FlightTermsAndCondition }
     * 
     */
    public FlightTermsAndCondition createFlightTermsAndCondition() {
        return new FlightTermsAndCondition();
    }

    /**
     * Create an instance of {@link SecurityFeaturePrefType }
     * 
     */
    public SecurityFeaturePrefType createSecurityFeaturePrefType() {
        return new SecurityFeaturePrefType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreTypeRateRange }
     * 
     */
    public VehicleAvailRQCoreTypeRateRange createVehicleAvailRQCoreTypeRateRange() {
        return new VehicleAvailRQCoreTypeRateRange();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRQRentalInfoRateQualifier }
     * 
     */
    public OTAVehRateRuleRQRentalInfoRateQualifier createOTAVehRateRuleRQRentalInfoRateQualifier() {
        return new OTAVehRateRuleRQRentalInfoRateQualifier();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link PropertyNamePrefType }
     * 
     */
    public PropertyNamePrefType createPropertyNamePrefType() {
        return new PropertyNamePrefType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreType }
     * 
     */
    public VehicleAvailRQCoreType createVehicleAvailRQCoreType() {
        return new VehicleAvailRQCoreType();
    }

    /**
     * Create an instance of {@link OTAVehAvailRateRQVehAvailRQCore }
     * 
     */
    public OTAVehAvailRateRQVehAvailRQCore createOTAVehAvailRateRQVehAvailRQCore() {
        return new OTAVehAvailRateRQVehAvailRQCore();
    }

    /**
     * Create an instance of {@link CommonPrefType }
     * 
     */
    public CommonPrefType createCommonPrefType() {
        return new CommonPrefType();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSVehicle }
     * 
     */
    public OTAVehRateRuleRSVehicle createOTAVehRateRuleRSVehicle() {
        return new OTAVehRateRuleRSVehicle();
    }

    /**
     * Create an instance of {@link OffLocationServiceCoreTypeAddress }
     * 
     */
    public OffLocationServiceCoreTypeAddress createOffLocationServiceCoreTypeAddress() {
        return new OffLocationServiceCoreTypeAddress();
    }

    /**
     * Create an instance of {@link ArrayOfOTAAirSeatMapRSSeatMapResponsesAirTraveler }
     * 
     */
    public ArrayOfOTAAirSeatMapRSSeatMapResponsesAirTraveler createArrayOfOTAAirSeatMapRSSeatMapResponsesAirTraveler() {
        return new ArrayOfOTAAirSeatMapRSSeatMapResponsesAirTraveler();
    }

    /**
     * Create an instance of {@link RadiusItem }
     * 
     */
    public RadiusItem createRadiusItem() {
        return new RadiusItem();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail }
     * 
     */
    public OTAInsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail createOTAInsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail() {
        return new OTAInsurancePlanSearchRSAvailablePlansAvailablePlanPlanDetail();
    }

    /**
     * Create an instance of {@link OffLocationServiceCoreType }
     * 
     */
    public OffLocationServiceCoreType createOffLocationServiceCoreType() {
        return new OffLocationServiceCoreType();
    }

    /**
     * Create an instance of {@link CoverageType }
     * 
     */
    public CoverageType createCoverageType() {
        return new CoverageType();
    }

    /**
     * Create an instance of {@link LCCCheckInOption }
     * 
     */
    public LCCCheckInOption createLCCCheckInOption() {
        return new LCCCheckInOption();
    }

    /**
     * Create an instance of {@link ArrayOfHotelSearchCriterionType }
     * 
     */
    public ArrayOfHotelSearchCriterionType createArrayOfHotelSearchCriterionType() {
        return new ArrayOfHotelSearchCriterionType();
    }

    /**
     * Create an instance of {@link BankAcctType }
     * 
     */
    public BankAcctType createBankAcctType() {
        return new BankAcctType();
    }

    /**
     * Create an instance of {@link FoodSrvcPrefType }
     * 
     */
    public FoodSrvcPrefType createFoodSrvcPrefType() {
        return new FoodSrvcPrefType();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentHint }
     * 
     */
    public ArrayOfDocumentHint createArrayOfDocumentHint() {
        return new ArrayOfDocumentHint();
    }

    /**
     * Create an instance of {@link VehicleRentalRateType }
     * 
     */
    public VehicleRentalRateType createVehicleRentalRateType() {
        return new VehicleRentalRateType();
    }

    /**
     * Create an instance of {@link ArrayOfUser }
     * 
     */
    public ArrayOfUser createArrayOfUser() {
        return new ArrayOfUser();
    }

    /**
     * Create an instance of {@link LCCOtherFee }
     * 
     */
    public LCCOtherFee createLCCOtherFee() {
        return new LCCOtherFee();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleEquipmentPricedType }
     * 
     */
    public ArrayOfVehicleEquipmentPricedType createArrayOfVehicleEquipmentPricedType() {
        return new ArrayOfVehicleEquipmentPricedType();
    }

    /**
     * Create an instance of {@link TripFeaturesTypeDestination }
     * 
     */
    public TripFeaturesTypeDestination createTripFeaturesTypeDestination() {
        return new TripFeaturesTypeDestination();
    }

    /**
     * Create an instance of {@link VehicleSegmentCoreTypeTotalCharge }
     * 
     */
    public VehicleSegmentCoreTypeTotalCharge createVehicleSegmentCoreTypeTotalCharge() {
        return new VehicleSegmentCoreTypeTotalCharge();
    }

    /**
     * Create an instance of {@link FareRuleResponseInfoTypeRouting }
     * 
     */
    public FareRuleResponseInfoTypeRouting createFareRuleResponseInfoTypeRouting() {
        return new FareRuleResponseInfoTypeRouting();
    }

    /**
     * Create an instance of {@link FlayerCardForSeatMap }
     * 
     */
    public FlayerCardForSeatMap createFlayerCardForSeatMap() {
        return new FlayerCardForSeatMap();
    }

    /**
     * Create an instance of {@link ArrayOfPlanRestrictionTypePlanRestriction }
     * 
     */
    public ArrayOfPlanRestrictionTypePlanRestriction createArrayOfPlanRestrictionTypePlanRestriction() {
        return new ArrayOfPlanRestrictionTypePlanRestriction();
    }

    /**
     * Create an instance of {@link OTAInsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail }
     * 
     */
    public OTAInsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail createOTAInsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail() {
        return new OTAInsurancePlanSearchRSAvailablePlansAvailablePlanUnderwriterDetail();
    }

    /**
     * Create an instance of {@link ArrayOfFreeTextType }
     * 
     */
    public ArrayOfFreeTextType createArrayOfFreeTextType() {
        return new ArrayOfFreeTextType();
    }

    /**
     * Create an instance of {@link CabinAvailabilityType }
     * 
     */
    public CabinAvailabilityType createCabinAvailabilityType() {
        return new CabinAvailabilityType();
    }

    /**
     * Create an instance of {@link VehicleAvailRQCoreTypeSpecialEquipPref }
     * 
     */
    public VehicleAvailRQCoreTypeSpecialEquipPref createVehicleAvailRQCoreTypeSpecialEquipPref() {
        return new VehicleAvailRQCoreTypeSpecialEquipPref();
    }

    /**
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link PaymentFormPrefType }
     * 
     */
    public PaymentFormPrefType createPaymentFormPrefType() {
        return new PaymentFormPrefType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link MealPrefType }
     * 
     */
    public MealPrefType createMealPrefType() {
        return new MealPrefType();
    }

    /**
     * Create an instance of {@link InsurancePlan }
     * 
     */
    public InsurancePlan createInsurancePlan() {
        return new InsurancePlan();
    }

    /**
     * Create an instance of {@link VehicleRentalCoreTypePickUpLocation }
     * 
     */
    public VehicleRentalCoreTypePickUpLocation createVehicleRentalCoreTypePickUpLocation() {
        return new VehicleRentalCoreTypePickUpLocation();
    }

    /**
     * Create an instance of {@link FailbackFlightRules }
     * 
     */
    public FailbackFlightRules createFailbackFlightRules() {
        return new FailbackFlightRules();
    }

    /**
     * Create an instance of {@link AirportPrefType }
     * 
     */
    public AirportPrefType createAirportPrefType() {
        return new AirportPrefType();
    }

    /**
     * Create an instance of {@link AddressPrefType }
     * 
     */
    public AddressPrefType createAddressPrefType() {
        return new AddressPrefType();
    }

    /**
     * Create an instance of {@link ArrayOfAncillaryCatalogueItemType }
     * 
     */
    public ArrayOfAncillaryCatalogueItemType createArrayOfAncillaryCatalogueItemType() {
        return new ArrayOfAncillaryCatalogueItemType();
    }

    /**
     * Create an instance of {@link ArrayOfDateTime }
     * 
     */
    public ArrayOfDateTime createArrayOfDateTime() {
        return new ArrayOfDateTime();
    }

    /**
     * Create an instance of {@link RateQualifierTypeRateComment }
     * 
     */
    public RateQualifierTypeRateComment createRateQualifierTypeRateComment() {
        return new RateQualifierTypeRateComment();
    }

    /**
     * Create an instance of {@link OffLocationServicePricedType }
     * 
     */
    public OffLocationServicePricedType createOffLocationServicePricedType() {
        return new OffLocationServicePricedType();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesPaymentRules }
     * 
     */
    public OTAVehRateRuleRSRateRulesPaymentRules createOTAVehRateRuleRSRateRulesPaymentRules() {
        return new OTAVehRateRuleRSRateRulesPaymentRules();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRQAirTravelerTravelerRefNumber }
     * 
     */
    public OTAAirSeatMapRQAirTravelerTravelerRefNumber createOTAAirSeatMapRQAirTravelerTravelerRefNumber() {
        return new OTAAirSeatMapRQAirTravelerTravelerRefNumber();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStayCandidateType }
     * 
     */
    public ArrayOfRoomStayCandidateType createArrayOfRoomStayCandidateType() {
        return new ArrayOfRoomStayCandidateType();
    }

    /**
     * Create an instance of {@link AncillaryFaresType }
     * 
     */
    public AncillaryFaresType createAncillaryFaresType() {
        return new AncillaryFaresType();
    }

    /**
     * Create an instance of {@link TravelerInfoSummaryType }
     * 
     */
    public TravelerInfoSummaryType createTravelerInfoSummaryType() {
        return new TravelerInfoSummaryType();
    }

    /**
     * Create an instance of {@link VideoItemType }
     * 
     */
    public VideoItemType createVideoItemType() {
        return new VideoItemType();
    }

    /**
     * Create an instance of {@link RowDetailsTypeAirSeat }
     * 
     */
    public RowDetailsTypeAirSeat createRowDetailsTypeAirSeat() {
        return new RowDetailsTypeAirSeat();
    }

    /**
     * Create an instance of {@link ArrayOfOSIElementChange }
     * 
     */
    public ArrayOfOSIElementChange createArrayOfOSIElementChange() {
        return new ArrayOfOSIElementChange();
    }

    /**
     * Create an instance of {@link ServiceFeeInfoRQCarInfo }
     * 
     */
    public ServiceFeeInfoRQCarInfo createServiceFeeInfoRQCarInfo() {
        return new ServiceFeeInfoRQCarInfo();
    }

    /**
     * Create an instance of {@link ArrayOfCompanyNameType }
     * 
     */
    public ArrayOfCompanyNameType createArrayOfCompanyNameType() {
        return new ArrayOfCompanyNameType();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanType }
     * 
     */
    public ArrayOfRatePlanType createArrayOfRatePlanType() {
        return new ArrayOfRatePlanType();
    }

    /**
     * Create an instance of {@link CommunicationHint }
     * 
     */
    public CommunicationHint createCommunicationHint() {
        return new CommunicationHint();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesPickupReturnRulesLatestReturn }
     * 
     */
    public OTAVehRateRuleRSRateRulesPickupReturnRulesLatestReturn createOTAVehRateRuleRSRateRulesPickupReturnRulesLatestReturn() {
        return new OTAVehRateRuleRSRateRulesPickupReturnRulesLatestReturn();
    }

    /**
     * Create an instance of {@link OTAAirSeatMapRSSeatMapResponsesAirTravelerCustLoyalty }
     * 
     */
    public OTAAirSeatMapRSSeatMapResponsesAirTravelerCustLoyalty createOTAAirSeatMapRSSeatMapResponsesAirTravelerCustLoyalty() {
        return new OTAAirSeatMapRSSeatMapResponsesAirTravelerCustLoyalty();
    }

    /**
     * Create an instance of {@link CancelRuleType }
     * 
     */
    public CancelRuleType createCancelRuleType() {
        return new CancelRuleType();
    }

    /**
     * Create an instance of {@link MediaEntertainPrefType }
     * 
     */
    public MediaEntertainPrefType createMediaEntertainPrefType() {
        return new MediaEntertainPrefType();
    }

    /**
     * Create an instance of {@link RelativePositionType }
     * 
     */
    public RelativePositionType createRelativePositionType() {
        return new RelativePositionType();
    }

    /**
     * Create an instance of {@link AirItineraryPricingInfoType }
     * 
     */
    public AirItineraryPricingInfoType createAirItineraryPricingInfoType() {
        return new AirItineraryPricingInfoType();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleChargeTypeTaxAmount1 }
     * 
     */
    public ArrayOfVehicleChargeTypeTaxAmount1 createArrayOfVehicleChargeTypeTaxAmount1() {
        return new ArrayOfVehicleChargeTypeTaxAmount1();
    }

    /**
     * Create an instance of {@link AncillaryCatalogueItemsType }
     * 
     */
    public AncillaryCatalogueItemsType createAncillaryCatalogueItemsType() {
        return new AncillaryCatalogueItemsType();
    }

    /**
     * Create an instance of {@link ArrayOfLCCOtherFee }
     * 
     */
    public ArrayOfLCCOtherFee createArrayOfLCCOtherFee() {
        return new ArrayOfLCCOtherFee();
    }

    /**
     * Create an instance of {@link NamePrefType }
     * 
     */
    public NamePrefType createNamePrefType() {
        return new NamePrefType();
    }

    /**
     * Create an instance of {@link VehicleReservationRQCoreTypeDriverType }
     * 
     */
    public VehicleReservationRQCoreTypeDriverType createVehicleReservationRQCoreTypeDriverType() {
        return new VehicleReservationRQCoreTypeDriverType();
    }

    /**
     * Create an instance of {@link SpecialReqDetailsType }
     * 
     */
    public SpecialReqDetailsType createSpecialReqDetailsType() {
        return new SpecialReqDetailsType();
    }

    /**
     * Create an instance of {@link PropertyLocationPrefType }
     * 
     */
    public PropertyLocationPrefType createPropertyLocationPrefType() {
        return new PropertyLocationPrefType();
    }

    /**
     * Create an instance of {@link ArrayOfAddressDB }
     * 
     */
    public ArrayOfAddressDB createArrayOfAddressDB() {
        return new ArrayOfAddressDB();
    }

    /**
     * Create an instance of {@link NameValueItem }
     * 
     */
    public NameValueItem createNameValueItem() {
        return new NameValueItem();
    }

    /**
     * Create an instance of {@link ArrayOfIndCoverageReqsTypeLuggageItem }
     * 
     */
    public ArrayOfIndCoverageReqsTypeLuggageItem createArrayOfIndCoverageReqsTypeLuggageItem() {
        return new ArrayOfIndCoverageReqsTypeLuggageItem();
    }

    /**
     * Create an instance of {@link VehicleSpecialReqPrefType }
     * 
     */
    public VehicleSpecialReqPrefType createVehicleSpecialReqPrefType() {
        return new VehicleSpecialReqPrefType();
    }

    /**
     * Create an instance of {@link CountryNameType }
     * 
     */
    public CountryNameType createCountryNameType() {
        return new CountryNameType();
    }

    /**
     * Create an instance of {@link CoverageLimitTypeIndividualLimit }
     * 
     */
    public CoverageLimitTypeIndividualLimit createCoverageLimitTypeIndividualLimit() {
        return new CoverageLimitTypeIndividualLimit();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref }
     * 
     */
    public ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref createArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref() {
        return new ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesPickupReturnRules }
     * 
     */
    public OTAVehRateRuleRSRateRulesPickupReturnRules createOTAVehRateRuleRSRateRulesPickupReturnRules() {
        return new OTAVehRateRuleRSRateRulesPickupReturnRules();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSRateRulesRateGuarantee }
     * 
     */
    public OTAVehRateRuleRSRateRulesRateGuarantee createOTAVehRateRuleRSRateRulesRateGuarantee() {
        return new OTAVehRateRuleRSRateRulesRateGuarantee();
    }

    /**
     * Create an instance of {@link OTAVehRateRuleRSFees }
     * 
     */
    public OTAVehRateRuleRSFees createOTAVehRateRuleRSFees() {
        return new OTAVehRateRuleRSFees();
    }

    /**
     * Create an instance of {@link ArrayOfTextItemsTypeTextItem.TextItemsTypeTextItem }
     * 
     */
    public ArrayOfTextItemsTypeTextItem.TextItemsTypeTextItem createArrayOfTextItemsTypeTextItemTextItemsTypeTextItem() {
        return new ArrayOfTextItemsTypeTextItem.TextItemsTypeTextItem();
    }

    /**
     * Create an instance of {@link TextDescriptionType.Description }
     * 
     */
    public TextDescriptionType.Description createTextDescriptionTypeDescription() {
        return new TextDescriptionType.Description();
    }

    /**
     * Create an instance of {@link AccessesType.Access }
     * 
     */
    public AccessesType.Access createAccessesTypeAccess() {
        return new AccessesType.Access();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Position }
     * 
     */
    public BasicPropertyInfoType.Position createBasicPropertyInfoTypePosition() {
        return new BasicPropertyInfoType.Position();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Award }
     * 
     */
    public BasicPropertyInfoType.Award createBasicPropertyInfoTypeAward() {
        return new BasicPropertyInfoType.Award();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.HotelAmenity }
     * 
     */
    public BasicPropertyInfoType.HotelAmenity createBasicPropertyInfoTypeHotelAmenity() {
        return new BasicPropertyInfoType.HotelAmenity();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Recreation }
     * 
     */
    public BasicPropertyInfoType.Recreation createBasicPropertyInfoTypeRecreation() {
        return new BasicPropertyInfoType.Recreation();
    }

    /**
     * Create an instance of {@link BasicPropertyInfoType.Service }
     * 
     */
    public BasicPropertyInfoType.Service createBasicPropertyInfoTypeService() {
        return new BasicPropertyInfoType.Service();
    }

    /**
     * Create an instance of {@link ArrayOfRoutingHopTypeRoutingHop.RoutingHop }
     * 
     */
    public ArrayOfRoutingHopTypeRoutingHop.RoutingHop createArrayOfRoutingHopTypeRoutingHopRoutingHop() {
        return new ArrayOfRoutingHopTypeRoutingHop.RoutingHop();
    }

    /**
     * Create an instance of {@link VideoDescriptionType.VideoFormat }
     * 
     */
    public VideoDescriptionType.VideoFormat createVideoDescriptionTypeVideoFormat() {
        return new VideoDescriptionType.VideoFormat();
    }

    /**
     * Create an instance of {@link AirlinePrefType.FareRestrictPref }
     * 
     */
    public AirlinePrefType.FareRestrictPref createAirlinePrefTypeFareRestrictPref() {
        return new AirlinePrefType.FareRestrictPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.FlightTypePref }
     * 
     */
    public AirlinePrefType.FlightTypePref createAirlinePrefTypeFlightTypePref() {
        return new AirlinePrefType.FlightTypePref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.CabinPref }
     * 
     */
    public AirlinePrefType.CabinPref createAirlinePrefTypeCabinPref() {
        return new AirlinePrefType.CabinPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.SeatPref }
     * 
     */
    public AirlinePrefType.SeatPref createAirlinePrefTypeSeatPref() {
        return new AirlinePrefType.SeatPref();
    }

    /**
     * Create an instance of {@link AirlinePrefType.SSRPref }
     * 
     */
    public AirlinePrefType.SSRPref createAirlinePrefTypeSSRPref() {
        return new AirlinePrefType.SSRPref();
    }

    /**
     * Create an instance of {@link ArrayOfProfilesTypeProfileInfo1 .ProfilesTypeProfileInfo }
     * 
     */
    public ArrayOfProfilesTypeProfileInfo1 .ProfilesTypeProfileInfo createArrayOfProfilesTypeProfileInfo1ProfilesTypeProfileInfo() {
        return new ArrayOfProfilesTypeProfileInfo1 .ProfilesTypeProfileInfo();
    }

    /**
     * Create an instance of {@link AddressType.StreetNmbr }
     * 
     */
    public AddressType.StreetNmbr createAddressTypeStreetNmbr() {
        return new AddressType.StreetNmbr();
    }

    /**
     * Create an instance of {@link AddressType.BldgRoom }
     * 
     */
    public AddressType.BldgRoom createAddressTypeBldgRoom() {
        return new AddressType.BldgRoom();
    }

    /**
     * Create an instance of {@link TransportInfoType.TransportInfo }
     * 
     */
    public TransportInfoType.TransportInfo createTransportInfoTypeTransportInfo() {
        return new TransportInfoType.TransportInfo();
    }

    /**
     * Create an instance of {@link CustomerType.Telephone }
     * 
     */
    public CustomerType.Telephone createCustomerTypeTelephone() {
        return new CustomerType.Telephone();
    }

    /**
     * Create an instance of {@link CustomerType.Address }
     * 
     */
    public CustomerType.Address createCustomerTypeAddress() {
        return new CustomerType.Address();
    }

    /**
     * Create an instance of {@link CustomerType.CitizenCountryName }
     * 
     */
    public CustomerType.CitizenCountryName createCustomerTypeCitizenCountryName() {
        return new CustomerType.CitizenCountryName();
    }

    /**
     * Create an instance of {@link CustomerType.CustLoyalty }
     * 
     */
    public CustomerType.CustLoyalty createCustomerTypeCustLoyalty() {
        return new CustomerType.CustLoyalty();
    }

    /**
     * Create an instance of {@link PaymentFormType.MiscChargeOrder }
     * 
     */
    public PaymentFormType.MiscChargeOrder createPaymentFormTypeMiscChargeOrder() {
        return new PaymentFormType.MiscChargeOrder();
    }

    /**
     * Create an instance of {@link PaymentFormType.Cash }
     * 
     */
    public PaymentFormType.Cash createPaymentFormTypeCash() {
        return new PaymentFormType.Cash();
    }

    /**
     * Create an instance of {@link PaymentFormType.Voucher }
     * 
     */
    public PaymentFormType.Voucher createPaymentFormTypeVoucher() {
        return new PaymentFormType.Voucher();
    }

    /**
     * Create an instance of {@link PaymentFormType.LoyaltyRedemption.LoyaltyCertificate }
     * 
     */
    public PaymentFormType.LoyaltyRedemption.LoyaltyCertificate createPaymentFormTypeLoyaltyRedemptionLoyaltyCertificate() {
        return new PaymentFormType.LoyaltyRedemption.LoyaltyCertificate();
    }

    /**
     * Create an instance of {@link VehicleCoreType.VehType }
     * 
     */
    public VehicleCoreType.VehType createVehicleCoreTypeVehType() {
        return new VehicleCoreType.VehType();
    }

    /**
     * Create an instance of {@link RoomRateType.Availability }
     * 
     */
    public RoomRateType.Availability createRoomRateTypeAvailability() {
        return new RoomRateType.Availability();
    }

    /**
     * Create an instance of {@link RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction }
     * 
     */
    public RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction createRoomStayTypeRoomRatesRoomRateAdvanceBookingRestriction() {
        return new RoomStayType.RoomRates.RoomRate.AdvanceBookingRestriction();
    }

    /**
     * Create an instance of {@link FareInfoType.FareReference }
     * 
     */
    public FareInfoType.FareReference createFareInfoTypeFareReference() {
        return new FareInfoType.FareReference();
    }

    /**
     * Create an instance of {@link FareInfoType.RuleInfo }
     * 
     */
    public FareInfoType.RuleInfo createFareInfoTypeRuleInfo() {
        return new FareInfoType.RuleInfo();
    }

    /**
     * Create an instance of {@link FareInfoType.Date }
     * 
     */
    public FareInfoType.Date createFareInfoTypeDate() {
        return new FareInfoType.Date();
    }

    /**
     * Create an instance of {@link FareInfoType.DiscountPricing }
     * 
     */
    public FareInfoType.DiscountPricing createFareInfoTypeDiscountPricing() {
        return new FareInfoType.DiscountPricing();
    }

    /**
     * Create an instance of {@link FareInfoType.City }
     * 
     */
    public FareInfoType.City createFareInfoTypeCity() {
        return new FareInfoType.City();
    }

    /**
     * Create an instance of {@link FareInfoType.Airport }
     * 
     */
    public FareInfoType.Airport createFareInfoTypeAirport() {
        return new FareInfoType.Airport();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.Date }
     * 
     */
    public FareInfoType.FareInfo.Date createFareInfoTypeFareInfoDate() {
        return new FareInfoType.FareInfo.Date();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.Fare }
     * 
     */
    public FareInfoType.FareInfo.Fare createFareInfoTypeFareInfoFare() {
        return new FareInfoType.FareInfo.Fare();
    }

    /**
     * Create an instance of {@link FareInfoType.FareInfo.PTC }
     * 
     */
    public FareInfoType.FareInfo.PTC createFareInfoTypeFareInfoPTC() {
        return new FareInfoType.FareInfo.PTC();
    }

    /**
     * Create an instance of {@link RuleInfoType.ChargesRules }
     * 
     */
    public RuleInfoType.ChargesRules createRuleInfoTypeChargesRules() {
        return new RuleInfoType.ChargesRules();
    }

    /**
     * Create an instance of {@link RuleInfoType.ResTicketingRules.AdvResTicketing }
     * 
     */
    public RuleInfoType.ResTicketingRules.AdvResTicketing createRuleInfoTypeResTicketingRulesAdvResTicketing() {
        return new RuleInfoType.ResTicketingRules.AdvResTicketing();
    }

    /**
     * Create an instance of {@link AdvResTicketingType.AdvReservation }
     * 
     */
    public AdvResTicketingType.AdvReservation createAdvResTicketingTypeAdvReservation() {
        return new AdvResTicketingType.AdvReservation();
    }

    /**
     * Create an instance of {@link AdvResTicketingType.AdvTicketing }
     * 
     */
    public AdvResTicketingType.AdvTicketing createAdvResTicketingTypeAdvTicketing() {
        return new AdvResTicketingType.AdvTicketing();
    }

    /**
     * Create an instance of {@link SpecialRemarkType.TravelerRefNumber }
     * 
     */
    public SpecialRemarkType.TravelerRefNumber createSpecialRemarkTypeTravelerRefNumber() {
        return new SpecialRemarkType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link SpecialRemarkType.FlightRefNumber }
     * 
     */
    public SpecialRemarkType.FlightRefNumber createSpecialRemarkTypeFlightRefNumber() {
        return new SpecialRemarkType.FlightRefNumber();
    }

    /**
     * Create an instance of {@link ImageDescriptionType.ImageFormat }
     * 
     */
    public ImageDescriptionType.ImageFormat createImageDescriptionTypeImageFormat() {
        return new ImageDescriptionType.ImageFormat();
    }

    /**
     * Create an instance of {@link ImageDescriptionType.Description }
     * 
     */
    public ImageDescriptionType.Description createImageDescriptionTypeDescription() {
        return new ImageDescriptionType.Description();
    }

    /**
     * Create an instance of {@link ArrayOfAirItineraryPricingInfoTypeFareInfo.FareInfo }
     * 
     */
    public ArrayOfAirItineraryPricingInfoTypeFareInfo.FareInfo createArrayOfAirItineraryPricingInfoTypeFareInfoFareInfo() {
        return new ArrayOfAirItineraryPricingInfoTypeFareInfo.FareInfo();
    }

    /**
     * Create an instance of {@link SourceType.RequestorID }
     * 
     */
    public SourceType.RequestorID createSourceTypeRequestorID() {
        return new SourceType.RequestorID();
    }

    /**
     * Create an instance of {@link SourceType.Position }
     * 
     */
    public SourceType.Position createSourceTypePosition() {
        return new SourceType.Position();
    }

    /**
     * Create an instance of {@link SourceType.BookingChannel }
     * 
     */
    public SourceType.BookingChannel createSourceTypeBookingChannel() {
        return new SourceType.BookingChannel();
    }

    /**
     * Create an instance of {@link ArrayOfProfilesTypeProfileInfo.ProfileInfo }
     * 
     */
    public ArrayOfProfilesTypeProfileInfo.ProfileInfo createArrayOfProfilesTypeProfileInfoProfileInfo() {
        return new ArrayOfProfilesTypeProfileInfo.ProfileInfo();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType.DepartureAirport }
     * 
     */
    public FlightSegmentBaseType.DepartureAirport createFlightSegmentBaseTypeDepartureAirport() {
        return new FlightSegmentBaseType.DepartureAirport();
    }

    /**
     * Create an instance of {@link FlightSegmentBaseType.ArrivalAirport }
     * 
     */
    public FlightSegmentBaseType.ArrivalAirport createFlightSegmentBaseTypeArrivalAirport() {
        return new FlightSegmentBaseType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link FlightSegmentType.MarketingAirline }
     * 
     */
    public FlightSegmentType.MarketingAirline createFlightSegmentTypeMarketingAirline() {
        return new FlightSegmentType.MarketingAirline();
    }

    /**
     * Create an instance of {@link BookFlightSegmentType.StopLocation }
     * 
     */
    public BookFlightSegmentType.StopLocation createBookFlightSegmentTypeStopLocation() {
        return new BookFlightSegmentType.StopLocation();
    }

    /**
     * Create an instance of {@link LengthsOfStayType.LengthOfStay.LOSPattern }
     * 
     */
    public LengthsOfStayType.LengthOfStay.LOSPattern createLengthsOfStayTypeLengthOfStayLOSPattern() {
        return new LengthsOfStayType.LengthOfStay.LOSPattern();
    }

    /**
     * Create an instance of {@link ArrayOfFreeBaggageSegmentItem.Baggage }
     * 
     */
    public ArrayOfFreeBaggageSegmentItem.Baggage createArrayOfFreeBaggageSegmentItemBaggage() {
        return new ArrayOfFreeBaggageSegmentItem.Baggage();
    }

    /**
     * Create an instance of {@link ArrayOfRoomRateTypeFeature.Feature }
     * 
     */
    public ArrayOfRoomRateTypeFeature.Feature createArrayOfRoomRateTypeFeatureFeature() {
        return new ArrayOfRoomRateTypeFeature.Feature();
    }

    /**
     * Create an instance of {@link CommissionType.CommissionableAmount }
     * 
     */
    public CommissionType.CommissionableAmount createCommissionTypeCommissionableAmount() {
        return new CommissionType.CommissionableAmount();
    }

    /**
     * Create an instance of {@link CommissionType.PrepaidAmount }
     * 
     */
    public CommissionType.PrepaidAmount createCommissionTypePrepaidAmount() {
        return new CommissionType.PrepaidAmount();
    }

    /**
     * Create an instance of {@link CommissionType.FlatCommission }
     * 
     */
    public CommissionType.FlatCommission createCommissionTypeFlatCommission() {
        return new CommissionType.FlatCommission();
    }

    /**
     * Create an instance of {@link CommissionType.CommissionPayableAmount }
     * 
     */
    public CommissionType.CommissionPayableAmount createCommissionTypeCommissionPayableAmount() {
        return new CommissionType.CommissionPayableAmount();
    }

    /**
     * Create an instance of {@link ArrayOfOperationScheduleTypeOperationTime.OperationTime }
     * 
     */
    public ArrayOfOperationScheduleTypeOperationTime.OperationTime createArrayOfOperationScheduleTypeOperationTimeOperationTime() {
        return new ArrayOfOperationScheduleTypeOperationTime.OperationTime();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.AvailableDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.AvailableDaysOfWeek createDOWRestrictionsTypeAvailableDaysOfWeek() {
        return new DOWRestrictionsType.AvailableDaysOfWeek();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.ArrivalDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.ArrivalDaysOfWeek createDOWRestrictionsTypeArrivalDaysOfWeek() {
        return new DOWRestrictionsType.ArrivalDaysOfWeek();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.DepartureDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.DepartureDaysOfWeek createDOWRestrictionsTypeDepartureDaysOfWeek() {
        return new DOWRestrictionsType.DepartureDaysOfWeek();
    }

    /**
     * Create an instance of {@link DOWRestrictionsType.RequiredDaysOfWeek }
     * 
     */
    public DOWRestrictionsType.RequiredDaysOfWeek createDOWRestrictionsTypeRequiredDaysOfWeek() {
        return new DOWRestrictionsType.RequiredDaysOfWeek();
    }

    /**
     * Create an instance of {@link ArrayOfBasicPropertyInfoTypeContactNumber.ContactNumber }
     * 
     */
    public ArrayOfBasicPropertyInfoTypeContactNumber.ContactNumber createArrayOfBasicPropertyInfoTypeContactNumberContactNumber() {
        return new ArrayOfBasicPropertyInfoTypeContactNumber.ContactNumber();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee createArrayOfBookingRulesTypeBookingRuleAcceptableGuaranteeAcceptableGuarantee() {
        return new ArrayOfBookingRulesTypeBookingRuleAcceptableGuarantee.AcceptableGuarantee();
    }

    /**
     * Create an instance of {@link GuaranteeType.Deadline }
     * 
     */
    public GuaranteeType.Deadline createGuaranteeTypeDeadline() {
        return new GuaranteeType.Deadline();
    }

    /**
     * Create an instance of {@link FlightLegType.DepartureAirport }
     * 
     */
    public FlightLegType.DepartureAirport createFlightLegTypeDepartureAirport() {
        return new FlightLegType.DepartureAirport();
    }

    /**
     * Create an instance of {@link FlightLegType.ArrivalAirport }
     * 
     */
    public FlightLegType.ArrivalAirport createFlightLegTypeArrivalAirport() {
        return new FlightLegType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.SearchValueMatch }
     * 
     */
    public PropertyValueMatchType.SearchValueMatch createPropertyValueMatchTypeSearchValueMatch() {
        return new PropertyValueMatchType.SearchValueMatch();
    }

    /**
     * Create an instance of {@link PropertyValueMatchType.RateRange }
     * 
     */
    public PropertyValueMatchType.RateRange createPropertyValueMatchTypeRateRange() {
        return new PropertyValueMatchType.RateRange();
    }

    /**
     * Create an instance of {@link ArrayOfServicesTypeService1 .ServicesTypeService }
     * 
     */
    public ArrayOfServicesTypeService1 .ServicesTypeService createArrayOfServicesTypeService1ServicesTypeService() {
        return new ArrayOfServicesTypeService1 .ServicesTypeService();
    }

    /**
     * Create an instance of {@link GuestCountType.GuestCount }
     * 
     */
    public GuestCountType.GuestCount createGuestCountTypeGuestCount() {
        return new GuestCountType.GuestCount();
    }

    /**
     * Create an instance of {@link HotelReservationType.HotelStay }
     * 
     */
    public HotelReservationType.HotelStay createHotelReservationTypeHotelStay() {
        return new HotelReservationType.HotelStay();
    }

    /**
     * Create an instance of {@link HotelReservationType.Areas }
     * 
     */
    public HotelReservationType.Areas createHotelReservationTypeAreas() {
        return new HotelReservationType.Areas();
    }

    /**
     * Create an instance of {@link HotelReservationType.Queue }
     * 
     */
    public HotelReservationType.Queue createHotelReservationTypeQueue() {
        return new HotelReservationType.Queue();
    }

    /**
     * Create an instance of {@link ArrayOfVideoItemsTypeVideoItem.VideoItemsTypeVideoItem }
     * 
     */
    public ArrayOfVideoItemsTypeVideoItem.VideoItemsTypeVideoItem createArrayOfVideoItemsTypeVideoItemVideoItemsTypeVideoItem() {
        return new ArrayOfVideoItemsTypeVideoItem.VideoItemsTypeVideoItem();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus createArrayOfBookingRulesTypeBookingRuleBookingRuleRestrictionStatus() {
        return new ArrayOfBookingRulesTypeBookingRule.BookingRule.RestrictionStatus();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge createArrayOfBookingRulesTypeBookingRuleBookingRuleCheckoutCharge() {
        return new ArrayOfBookingRulesTypeBookingRule.BookingRule.CheckoutCharge();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes createArrayOfViewershipsTypeViewershipViewershipViewershipCodes() {
        return new ArrayOfViewershipsTypeViewership.Viewership.ViewershipCodes();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode createArrayOfViewershipsTypeViewershipViewershipBookingChannelCodesBookingChannelCode() {
        return new ArrayOfViewershipsTypeViewership.Viewership.BookingChannelCodes.BookingChannelCode();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode createArrayOfViewershipsTypeViewershipViewershipLocationCodesLocationCode() {
        return new ArrayOfViewershipsTypeViewership.Viewership.LocationCodes.LocationCode();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode }
     * 
     */
    public ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode createArrayOfViewershipsTypeViewershipViewershipSystemCodesSystemCode() {
        return new ArrayOfViewershipsTypeViewership.Viewership.SystemCodes.SystemCode();
    }

    /**
     * Create an instance of {@link AirTravelerType.LCCParameters }
     * 
     */
    public AirTravelerType.LCCParameters createAirTravelerTypeLCCParameters() {
        return new AirTravelerType.LCCParameters();
    }

    /**
     * Create an instance of {@link AirTravelerType.ProfileRef }
     * 
     */
    public AirTravelerType.ProfileRef createAirTravelerTypeProfileRef() {
        return new AirTravelerType.ProfileRef();
    }

    /**
     * Create an instance of {@link AirTravelerType.Telephone }
     * 
     */
    public AirTravelerType.Telephone createAirTravelerTypeTelephone() {
        return new AirTravelerType.Telephone();
    }

    /**
     * Create an instance of {@link AirTravelerType.Email }
     * 
     */
    public AirTravelerType.Email createAirTravelerTypeEmail() {
        return new AirTravelerType.Email();
    }

    /**
     * Create an instance of {@link AirTravelerType.Address }
     * 
     */
    public AirTravelerType.Address createAirTravelerTypeAddress() {
        return new AirTravelerType.Address();
    }

    /**
     * Create an instance of {@link AirTravelerType.CustLoyalty }
     * 
     */
    public AirTravelerType.CustLoyalty createAirTravelerTypeCustLoyalty() {
        return new AirTravelerType.CustLoyalty();
    }

    /**
     * Create an instance of {@link AirTravelerType.Document }
     * 
     */
    public AirTravelerType.Document createAirTravelerTypeDocument() {
        return new AirTravelerType.Document();
    }

    /**
     * Create an instance of {@link AirTravelerType.TravelerRefNumber }
     * 
     */
    public AirTravelerType.TravelerRefNumber createAirTravelerTypeTravelerRefNumber() {
        return new AirTravelerType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link FailbackRS.FlightSegment }
     * 
     */
    public FailbackRS.FlightSegment createFailbackRSFlightSegment() {
        return new FailbackRS.FlightSegment();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialReqDetailsTypeSeatRequest.SeatRequest }
     * 
     */
    public ArrayOfSpecialReqDetailsTypeSeatRequest.SeatRequest createArrayOfSpecialReqDetailsTypeSeatRequestSeatRequest() {
        return new ArrayOfSpecialReqDetailsTypeSeatRequest.SeatRequest();
    }

    /**
     * Create an instance of {@link ArrayOfPTCFareBreakdownTypeTicketDesignator.TicketDesignator }
     * 
     */
    public ArrayOfPTCFareBreakdownTypeTicketDesignator.TicketDesignator createArrayOfPTCFareBreakdownTypeTicketDesignatorTicketDesignator() {
        return new ArrayOfPTCFareBreakdownTypeTicketDesignator.TicketDesignator();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRQAdditionalInfoType.Telephone }
     * 
     */
    public VehicleRetrieveResRQAdditionalInfoType.Telephone createVehicleRetrieveResRQAdditionalInfoTypeTelephone() {
        return new VehicleRetrieveResRQAdditionalInfoType.Telephone();
    }

    /**
     * Create an instance of {@link CoveredTravelerType.Telephone }
     * 
     */
    public CoveredTravelerType.Telephone createCoveredTravelerTypeTelephone() {
        return new CoveredTravelerType.Telephone();
    }

    /**
     * Create an instance of {@link ArrayOfConnectionTypeConnectionLocation.ConnectionLocation }
     * 
     */
    public ArrayOfConnectionTypeConnectionLocation.ConnectionLocation createArrayOfConnectionTypeConnectionLocationConnectionLocation() {
        return new ArrayOfConnectionTypeConnectionLocation.ConnectionLocation();
    }

    /**
     * Create an instance of {@link ArrayOfRoomStayTypeRoomRatesRoomRateRestriction.Restriction }
     * 
     */
    public ArrayOfRoomStayTypeRoomRatesRoomRateRestriction.Restriction createArrayOfRoomStayTypeRoomRatesRoomRateRestrictionRestriction() {
        return new ArrayOfRoomStayTypeRoomRatesRoomRateRestriction.Restriction();
    }

    /**
     * Create an instance of {@link ArrayOfServicesTypeService.Service }
     * 
     */
    public ArrayOfServicesTypeService.Service createArrayOfServicesTypeServiceService() {
        return new ArrayOfServicesTypeService.Service();
    }

    /**
     * Create an instance of {@link ArrayOfFreeBaggageLegendItem.Baggage }
     * 
     */
    public ArrayOfFreeBaggageLegendItem.Baggage createArrayOfFreeBaggageLegendItemBaggage() {
        return new ArrayOfFreeBaggageLegendItem.Baggage();
    }

    /**
     * Create an instance of {@link ArrayOfImageItemsTypeImageItem.ImageItemsTypeImageItem }
     * 
     */
    public ArrayOfImageItemsTypeImageItem.ImageItemsTypeImageItem createArrayOfImageItemsTypeImageItemImageItemsTypeImageItem() {
        return new ArrayOfImageItemsTypeImageItem.ImageItemsTypeImageItem();
    }

    /**
     * Create an instance of {@link ArrayOfRateTypeRate.Rate }
     * 
     */
    public ArrayOfRateTypeRate.Rate createArrayOfRateTypeRateRate() {
        return new ArrayOfRateTypeRate.Rate();
    }

    /**
     * Create an instance of {@link AmountType.AdditionalGuestAmounts }
     * 
     */
    public AmountType.AdditionalGuestAmounts createAmountTypeAdditionalGuestAmounts() {
        return new AmountType.AdditionalGuestAmounts();
    }

    /**
     * Create an instance of {@link AmountType.Discount }
     * 
     */
    public AmountType.Discount createAmountTypeDiscount() {
        return new AmountType.Discount();
    }

    /**
     * Create an instance of {@link AmountType.AdvanceBookingRestriction }
     * 
     */
    public AmountType.AdvanceBookingRestriction createAmountTypeAdvanceBookingRestriction() {
        return new AmountType.AdvanceBookingRestriction();
    }

    /**
     * Create an instance of {@link AmountType.AdditionalCharges.AdditionalCharge }
     * 
     */
    public AmountType.AdditionalCharges.AdditionalCharge createAmountTypeAdditionalChargesAdditionalCharge() {
        return new AmountType.AdditionalCharges.AdditionalCharge();
    }

    /**
     * Create an instance of {@link ArrayOfAreasTypeArea.AreasTypeArea }
     * 
     */
    public ArrayOfAreasTypeArea.AreasTypeArea createArrayOfAreasTypeAreaAreasTypeArea() {
        return new ArrayOfAreasTypeArea.AreasTypeArea();
    }

    /**
     * Create an instance of {@link AirReservationType.Fulfillment }
     * 
     */
    public AirReservationType.Fulfillment createAirReservationTypeFulfillment() {
        return new AirReservationType.Fulfillment();
    }

    /**
     * Create an instance of {@link AirReservationType.PricingOverview.PricingIndicator }
     * 
     */
    public AirReservationType.PricingOverview.PricingIndicator createAirReservationTypePricingOverviewPricingIndicator() {
        return new AirReservationType.PricingOverview.PricingIndicator();
    }

    /**
     * Create an instance of {@link AirReservationType.PricingOverview.Account }
     * 
     */
    public AirReservationType.PricingOverview.Account createAirReservationTypePricingOverviewAccount() {
        return new AirReservationType.PricingOverview.Account();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Position }
     * 
     */
    public ItemSearchCriterionType.Position createItemSearchCriterionTypePosition() {
        return new ItemSearchCriterionType.Position();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Address }
     * 
     */
    public ItemSearchCriterionType.Address createItemSearchCriterionTypeAddress() {
        return new ItemSearchCriterionType.Address();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Telephone }
     * 
     */
    public ItemSearchCriterionType.Telephone createItemSearchCriterionTypeTelephone() {
        return new ItemSearchCriterionType.Telephone();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.RefPoint }
     * 
     */
    public ItemSearchCriterionType.RefPoint createItemSearchCriterionTypeRefPoint() {
        return new ItemSearchCriterionType.RefPoint();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.CodeRef }
     * 
     */
    public ItemSearchCriterionType.CodeRef createItemSearchCriterionTypeCodeRef() {
        return new ItemSearchCriterionType.CodeRef();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.HotelRef }
     * 
     */
    public ItemSearchCriterionType.HotelRef createItemSearchCriterionTypeHotelRef() {
        return new ItemSearchCriterionType.HotelRef();
    }

    /**
     * Create an instance of {@link ItemSearchCriterionType.Radius }
     * 
     */
    public ItemSearchCriterionType.Radius createItemSearchCriterionTypeRadius() {
        return new ItemSearchCriterionType.Radius();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.HotelAmenity }
     * 
     */
    public HotelSearchCriterionType.HotelAmenity createHotelSearchCriterionTypeHotelAmenity() {
        return new HotelSearchCriterionType.HotelAmenity();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Award }
     * 
     */
    public HotelSearchCriterionType.Award createHotelSearchCriterionTypeAward() {
        return new HotelSearchCriterionType.Award();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Recreation }
     * 
     */
    public HotelSearchCriterionType.Recreation createHotelSearchCriterionTypeRecreation() {
        return new HotelSearchCriterionType.Recreation();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Service }
     * 
     */
    public HotelSearchCriterionType.Service createHotelSearchCriterionTypeService() {
        return new HotelSearchCriterionType.Service();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.Transportation }
     * 
     */
    public HotelSearchCriterionType.Transportation createHotelSearchCriterionTypeTransportation() {
        return new HotelSearchCriterionType.Transportation();
    }

    /**
     * Create an instance of {@link HotelSearchCriterionType.RateRange }
     * 
     */
    public HotelSearchCriterionType.RateRange createHotelSearchCriterionTypeRateRange() {
        return new HotelSearchCriterionType.RateRange();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.TravelerRefNumber }
     * 
     */
    public PTCFareBreakdownType.TravelerRefNumber createPTCFareBreakdownTypeTravelerRefNumber() {
        return new PTCFareBreakdownType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.FareInfo }
     * 
     */
    public PTCFareBreakdownType.FareInfo createPTCFareBreakdownTypeFareInfo() {
        return new PTCFareBreakdownType.FareInfo();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg }
     * 
     */
    public PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg createPTCFareBreakdownTypePricingUnitFareComponentFlightLeg() {
        return new PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg();
    }

    /**
     * Create an instance of {@link PTCFareBreakdownType.Endorsements.Endorsement }
     * 
     */
    public PTCFareBreakdownType.Endorsements.Endorsement createPTCFareBreakdownTypeEndorsementsEndorsement() {
        return new PTCFareBreakdownType.Endorsements.Endorsement();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Deadline }
     * 
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Deadline createArrayOfRequiredPaymentsTypeGuaranteePaymentGuaranteePaymentDeadline() {
        return new ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Deadline();
    }

    /**
     * Create an instance of {@link ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address }
     * 
     */
    public ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address createArrayOfRequiredPaymentsTypeGuaranteePaymentGuaranteePaymentAddress() {
        return new ArrayOfRequiredPaymentsTypeGuaranteePayment.GuaranteePayment.Address();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.NegotiatedFareCode }
     * 
     */
    public PriceRequestInformationType.NegotiatedFareCode createPriceRequestInformationTypeNegotiatedFareCode() {
        return new PriceRequestInformationType.NegotiatedFareCode();
    }

    /**
     * Create an instance of {@link PriceRequestInformationType.RebookOption }
     * 
     */
    public PriceRequestInformationType.RebookOption createPriceRequestInformationTypeRebookOption() {
        return new PriceRequestInformationType.RebookOption();
    }

    /**
     * Create an instance of {@link OtherServiceInfoType.TravelerRefNumber }
     * 
     */
    public OtherServiceInfoType.TravelerRefNumber createOtherServiceInfoTypeTravelerRefNumber() {
        return new OtherServiceInfoType.TravelerRefNumber();
    }

    /**
     * Create an instance of {@link ArrayOfBookFlightSegmentTypeBookingClassAvail.BookingClassAvail }
     * 
     */
    public ArrayOfBookFlightSegmentTypeBookingClassAvail.BookingClassAvail createArrayOfBookFlightSegmentTypeBookingClassAvailBookingClassAvail() {
        return new ArrayOfBookFlightSegmentTypeBookingClassAvail.BookingClassAvail();
    }

    /**
     * Create an instance of {@link VerificationType.PersonName }
     * 
     */
    public VerificationType.PersonName createVerificationTypePersonName() {
        return new VerificationType.PersonName();
    }

    /**
     * Create an instance of {@link VerificationType.TelephoneInfo }
     * 
     */
    public VerificationType.TelephoneInfo createVerificationTypeTelephoneInfo() {
        return new VerificationType.TelephoneInfo();
    }

    /**
     * Create an instance of {@link VerificationType.CustLoyalty }
     * 
     */
    public VerificationType.CustLoyalty createVerificationTypeCustLoyalty() {
        return new VerificationType.CustLoyalty();
    }

    /**
     * Create an instance of {@link VerificationType.ReservationTimeSpan }
     * 
     */
    public VerificationType.ReservationTimeSpan createVerificationTypeReservationTimeSpan() {
        return new VerificationType.ReservationTimeSpan();
    }

    /**
     * Create an instance of {@link VerificationType.AssociatedQuantity }
     * 
     */
    public VerificationType.AssociatedQuantity createVerificationTypeAssociatedQuantity() {
        return new VerificationType.AssociatedQuantity();
    }

    /**
     * Create an instance of {@link VerificationType.StartLocation }
     * 
     */
    public VerificationType.StartLocation createVerificationTypeStartLocation() {
        return new VerificationType.StartLocation();
    }

    /**
     * Create an instance of {@link VerificationType.EndLocation }
     * 
     */
    public VerificationType.EndLocation createVerificationTypeEndLocation() {
        return new VerificationType.EndLocation();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType.OriginLocation }
     * 
     */
    public OriginDestinationInformationType.OriginLocation createOriginDestinationInformationTypeOriginLocation() {
        return new OriginDestinationInformationType.OriginLocation();
    }

    /**
     * Create an instance of {@link OriginDestinationInformationType.DestinationLocation }
     * 
     */
    public OriginDestinationInformationType.DestinationLocation createOriginDestinationInformationTypeDestinationLocation() {
        return new OriginDestinationInformationType.DestinationLocation();
    }

    /**
     * Create an instance of {@link TravelerInfoType.AirTraveler.Comment }
     * 
     */
    public TravelerInfoType.AirTraveler.Comment createTravelerInfoTypeAirTravelerComment() {
        return new TravelerInfoType.AirTraveler.Comment();
    }

    /**
     * Create an instance of {@link TravelerInfoType.AirTraveler.ETicketURLs }
     * 
     */
    public TravelerInfoType.AirTraveler.ETicketURLs createTravelerInfoTypeAirTravelerETicketURLs() {
        return new TravelerInfoType.AirTraveler.ETicketURLs();
    }

    /**
     * Create an instance of {@link ContactPersonType.Telephone }
     * 
     */
    public ContactPersonType.Telephone createContactPersonTypeTelephone() {
        return new ContactPersonType.Telephone();
    }

    /**
     * Create an instance of {@link OrganizationType.OrgMemberName }
     * 
     */
    public OrganizationType.OrgMemberName createOrganizationTypeOrgMemberName() {
        return new OrganizationType.OrgMemberName();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewershipDistributorType.DistributorType }
     * 
     */
    public ArrayOfViewershipsTypeViewershipDistributorType.DistributorType createArrayOfViewershipsTypeViewershipDistributorTypeDistributorType() {
        return new ArrayOfViewershipsTypeViewershipDistributorType.DistributorType();
    }

    /**
     * Create an instance of {@link ArrayOfOriginDestinationInformationTypeDestinationLocation.DestinationLocation }
     * 
     */
    public ArrayOfOriginDestinationInformationTypeDestinationLocation.DestinationLocation createArrayOfOriginDestinationInformationTypeDestinationLocationDestinationLocation() {
        return new ArrayOfOriginDestinationInformationTypeDestinationLocation.DestinationLocation();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef.HotelRef }
     * 
     */
    public ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef.HotelRef createArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRefHotelRef() {
        return new ArrayOfRatePlanCandidatesTypeRatePlanCandidateHotelRef.HotelRef();
    }

    /**
     * Create an instance of {@link FareType.BaseFare }
     * 
     */
    public FareType.BaseFare createFareTypeBaseFare() {
        return new FareType.BaseFare();
    }

    /**
     * Create an instance of {@link FareType.MarkupFare }
     * 
     */
    public FareType.MarkupFare createFareTypeMarkupFare() {
        return new FareType.MarkupFare();
    }

    /**
     * Create an instance of {@link FareType.EquivFare }
     * 
     */
    public FareType.EquivFare createFareTypeEquivFare() {
        return new FareType.EquivFare();
    }

    /**
     * Create an instance of {@link FareType.TotalFare }
     * 
     */
    public FareType.TotalFare createFareTypeTotalFare() {
        return new FareType.TotalFare();
    }

    /**
     * Create an instance of {@link FareType.TotalAmountInTicketingCurrency }
     * 
     */
    public FareType.TotalAmountInTicketingCurrency createFareTypeTotalAmountInTicketingCurrency() {
        return new FareType.TotalAmountInTicketingCurrency();
    }

    /**
     * Create an instance of {@link FareType.FareConstruction }
     * 
     */
    public FareType.FareConstruction createFareTypeFareConstruction() {
        return new FareType.FareConstruction();
    }

    /**
     * Create an instance of {@link FareType.UnstructuredFareCalc }
     * 
     */
    public FareType.UnstructuredFareCalc createFareTypeUnstructuredFareCalc() {
        return new FareType.UnstructuredFareCalc();
    }

    /**
     * Create an instance of {@link DateTimeSpanType.EndDateWindow }
     * 
     */
    public DateTimeSpanType.EndDateWindow createDateTimeSpanTypeEndDateWindow() {
        return new DateTimeSpanType.EndDateWindow();
    }

    /**
     * Create an instance of {@link DateTimeSpanType.StartDateWindow }
     * 
     */
    public DateTimeSpanType.StartDateWindow createDateTimeSpanTypeStartDateWindow() {
        return new DateTimeSpanType.StartDateWindow();
    }

    /**
     * Create an instance of {@link OriginDestinationOptionType.FlightSegment }
     * 
     */
    public OriginDestinationOptionType.FlightSegment createOriginDestinationOptionTypeFlightSegment() {
        return new OriginDestinationOptionType.FlightSegment();
    }

    /**
     * Create an instance of {@link PaymentDetailType.PaymentAmount }
     * 
     */
    public PaymentDetailType.PaymentAmount createPaymentDetailTypePaymentAmount() {
        return new PaymentDetailType.PaymentAmount();
    }

    /**
     * Create an instance of {@link ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay.Reference }
     * 
     */
    public ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay.Reference createArrayOfOTAHotelAvailRSRoomStaysRoomStayRoomStayReference() {
        return new ArrayOfOTAHotelAvailRSRoomStaysRoomStay.RoomStay.Reference();
    }

    /**
     * Create an instance of {@link ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption }
     * 
     */
    public ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption createArrayOfAirItineraryTypeOriginDestinationOptionOriginDestinationOption() {
        return new ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption();
    }

    /**
     * Create an instance of {@link ArrayOfLastTicketingDateData.LastTicketingDateData }
     * 
     */
    public ArrayOfLastTicketingDateData.LastTicketingDateData createArrayOfLastTicketingDateDataLastTicketingDateData() {
        return new ArrayOfLastTicketingDateData.LastTicketingDateData();
    }

    /**
     * Create an instance of {@link ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule }
     * 
     */
    public ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule createArrayOfBookingRulesTypeBookingRuleAdditionalRuleAdditionalRule() {
        return new ArrayOfBookingRulesTypeBookingRuleAdditionalRule.AdditionalRule();
    }

    /**
     * Create an instance of {@link ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID }
     * 
     */
    public ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID createArrayOfHotelReservationIDsTypeHotelReservationIDHotelReservationID() {
        return new ArrayOfHotelReservationIDsTypeHotelReservationID.HotelReservationID();
    }

    /**
     * Create an instance of {@link PricedItineraryType.TicketingInfo.DeliveryInfo }
     * 
     */
    public PricedItineraryType.TicketingInfo.DeliveryInfo createPricedItineraryTypeTicketingInfoDeliveryInfo() {
        return new PricedItineraryType.TicketingInfo.DeliveryInfo();
    }

    /**
     * Create an instance of {@link SpecificFlightInfoType.BookingClassPref }
     * 
     */
    public SpecificFlightInfoType.BookingClassPref createSpecificFlightInfoTypeBookingClassPref() {
        return new SpecificFlightInfoType.BookingClassPref();
    }

    /**
     * Create an instance of {@link VoluntaryChangesType.Penalty }
     * 
     */
    public VoluntaryChangesType.Penalty createVoluntaryChangesTypePenalty() {
        return new VoluntaryChangesType.Penalty();
    }

    /**
     * Create an instance of {@link PhonePrefType.Telephone }
     * 
     */
    public PhonePrefType.Telephone createPhonePrefTypeTelephone() {
        return new PhonePrefType.Telephone();
    }

    /**
     * Create an instance of {@link ArrayOfTransportationTypeTransportation.Transportation }
     * 
     */
    public ArrayOfTransportationTypeTransportation.Transportation createArrayOfTransportationTypeTransportationTransportation() {
        return new ArrayOfTransportationTypeTransportation.Transportation();
    }

    /**
     * Create an instance of {@link ArrayOfMembershipTypeMembership.Membership }
     * 
     */
    public ArrayOfMembershipTypeMembership.Membership createArrayOfMembershipTypeMembershipMembership() {
        return new ArrayOfMembershipTypeMembership.Membership();
    }

    /**
     * Create an instance of {@link StayRestrictionsType.MinimumStay }
     * 
     */
    public StayRestrictionsType.MinimumStay createStayRestrictionsTypeMinimumStay() {
        return new StayRestrictionsType.MinimumStay();
    }

    /**
     * Create an instance of {@link StayRestrictionsType.MaximumStay }
     * 
     */
    public StayRestrictionsType.MaximumStay createStayRestrictionsTypeMaximumStay() {
        return new StayRestrictionsType.MaximumStay();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded }
     * 
     */
    public ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded createArrayOfRatePlanCandidatesTypeRatePlanCandidateRatePlanCandidateMealsIncluded() {
        return new ArrayOfRatePlanCandidatesTypeRatePlanCandidate.RatePlanCandidate.MealsIncluded();
    }

    /**
     * Create an instance of {@link HotelSearchCriteriaType.Criterion }
     * 
     */
    public HotelSearchCriteriaType.Criterion createHotelSearchCriteriaTypeCriterion() {
        return new HotelSearchCriteriaType.Criterion();
    }

    /**
     * Create an instance of {@link PreferencesType.PrefCollection }
     * 
     */
    public PreferencesType.PrefCollection createPreferencesTypePrefCollection() {
        return new PreferencesType.PrefCollection();
    }

    /**
     * Create an instance of {@link ArrayOfPropertiesTypeProperty.PropertiesTypeProperty }
     * 
     */
    public ArrayOfPropertiesTypeProperty.PropertiesTypeProperty createArrayOfPropertiesTypePropertyPropertiesTypeProperty() {
        return new ArrayOfPropertiesTypeProperty.PropertiesTypeProperty();
    }

    /**
     * Create an instance of {@link RatePlanType.RatePlanInclusion }
     * 
     */
    public RatePlanType.RatePlanInclusion createRatePlanTypeRatePlanInclusion() {
        return new RatePlanType.RatePlanInclusion();
    }

    /**
     * Create an instance of {@link RatePlanType.MealsIncluded }
     * 
     */
    public RatePlanType.MealsIncluded createRatePlanTypeMealsIncluded() {
        return new RatePlanType.MealsIncluded();
    }

    /**
     * Create an instance of {@link RatePlanType.RestrictionStatus }
     * 
     */
    public RatePlanType.RestrictionStatus createRatePlanTypeRestrictionStatus() {
        return new RatePlanType.RestrictionStatus();
    }

    /**
     * Create an instance of {@link ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted }
     * 
     */
    public ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted createArrayOfGuaranteeTypeGuaranteeAcceptedGuaranteeAccepted() {
        return new ArrayOfGuaranteeTypeGuaranteeAccepted.GuaranteeAccepted();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardIssuerName }
     * 
     */
    public PaymentCardType.CardIssuerName createPaymentCardTypeCardIssuerName() {
        return new PaymentCardType.CardIssuerName();
    }

    /**
     * Create an instance of {@link CancelPenaltyType.Deadline }
     * 
     */
    public CancelPenaltyType.Deadline createCancelPenaltyTypeDeadline() {
        return new CancelPenaltyType.Deadline();
    }

    /**
     * Create an instance of {@link ArrayOfResGuestsTypeResGuestProfileRPH.ProfileRPH }
     * 
     */
    public ArrayOfResGuestsTypeResGuestProfileRPH.ProfileRPH createArrayOfResGuestsTypeResGuestProfileRPHProfileRPH() {
        return new ArrayOfResGuestsTypeResGuestProfileRPH.ProfileRPH();
    }

    /**
     * Create an instance of {@link ArrayOfOriginDestinationInformationTypeOriginLocation.OriginLocation }
     * 
     */
    public ArrayOfOriginDestinationInformationTypeOriginLocation.OriginLocation createArrayOfOriginDestinationInformationTypeOriginLocationOriginLocation() {
        return new ArrayOfOriginDestinationInformationTypeOriginLocation.OriginLocation();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialReqDetailsTypeSpecialServiceRequest.SpecialServiceRequest }
     * 
     */
    public ArrayOfSpecialReqDetailsTypeSpecialServiceRequest.SpecialServiceRequest createArrayOfSpecialReqDetailsTypeSpecialServiceRequestSpecialServiceRequest() {
        return new ArrayOfSpecialReqDetailsTypeSpecialServiceRequest.SpecialServiceRequest();
    }

    /**
     * Create an instance of {@link AllianceConsortiumType.AllianceMember }
     * 
     */
    public AllianceConsortiumType.AllianceMember createAllianceConsortiumTypeAllianceMember() {
        return new AllianceConsortiumType.AllianceMember();
    }

    /**
     * Create an instance of {@link ArrayOfAirReservationTypeQueue.Queue }
     * 
     */
    public ArrayOfAirReservationTypeQueue.Queue createArrayOfAirReservationTypeQueueQueue() {
        return new ArrayOfAirReservationTypeQueue.Queue();
    }

    /**
     * Create an instance of {@link ChangeDetail.Document }
     * 
     */
    public ChangeDetail.Document createChangeDetailDocument() {
        return new ChangeDetail.Document();
    }

    /**
     * Create an instance of {@link DirectBillType.CompanyName }
     * 
     */
    public DirectBillType.CompanyName createDirectBillTypeCompanyName() {
        return new DirectBillType.CompanyName();
    }

    /**
     * Create an instance of {@link ArrayOfPropertyValueMatchTypeAmenity.Amenity }
     * 
     */
    public ArrayOfPropertyValueMatchTypeAmenity.Amenity createArrayOfPropertyValueMatchTypeAmenityAmenity() {
        return new ArrayOfPropertyValueMatchTypeAmenity.Amenity();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialReqDetailsTypeSpecialRemark.SpecialRemark }
     * 
     */
    public ArrayOfSpecialReqDetailsTypeSpecialRemark.SpecialRemark createArrayOfSpecialReqDetailsTypeSpecialRemarkSpecialRemark() {
        return new ArrayOfSpecialReqDetailsTypeSpecialRemark.SpecialRemark();
    }

    /**
     * Create an instance of {@link ArrayOfCommentTypeComment.Comment }
     * 
     */
    public ArrayOfCommentTypeComment.Comment createArrayOfCommentTypeCommentComment() {
        return new ArrayOfCommentTypeComment.Comment();
    }

    /**
     * Create an instance of {@link ArrayOfResGuestsTypeResGuest.ResGuest }
     * 
     */
    public ArrayOfResGuestsTypeResGuest.ResGuest createArrayOfResGuestsTypeResGuestResGuest() {
        return new ArrayOfResGuestsTypeResGuest.ResGuest();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRemarkTypeAuthorizedViewer.AuthorizedViewer }
     * 
     */
    public ArrayOfSpecialRemarkTypeAuthorizedViewer.AuthorizedViewer createArrayOfSpecialRemarkTypeAuthorizedViewerAuthorizedViewer() {
        return new ArrayOfSpecialRemarkTypeAuthorizedViewer.AuthorizedViewer();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialReqDetailsTypeRemark.Remark }
     * 
     */
    public ArrayOfSpecialReqDetailsTypeRemark.Remark createArrayOfSpecialReqDetailsTypeRemarkRemark() {
        return new ArrayOfSpecialReqDetailsTypeRemark.Remark();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.VendorPref }
     * 
     */
    public AirSearchPrefsType.VendorPref createAirSearchPrefsTypeVendorPref() {
        return new AirSearchPrefsType.VendorPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.FlightTypePref }
     * 
     */
    public AirSearchPrefsType.FlightTypePref createAirSearchPrefsTypeFlightTypePref() {
        return new AirSearchPrefsType.FlightTypePref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.FareRestrictPref }
     * 
     */
    public AirSearchPrefsType.FareRestrictPref createAirSearchPrefsTypeFareRestrictPref() {
        return new AirSearchPrefsType.FareRestrictPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.CabinPref }
     * 
     */
    public AirSearchPrefsType.CabinPref createAirSearchPrefsTypeCabinPref() {
        return new AirSearchPrefsType.CabinPref();
    }

    /**
     * Create an instance of {@link AirSearchPrefsType.TicketDistribPref }
     * 
     */
    public AirSearchPrefsType.TicketDistribPref createAirSearchPrefsTypeTicketDistribPref() {
        return new AirSearchPrefsType.TicketDistribPref();
    }

    /**
     * Create an instance of {@link TravelClubType.ClubMemberName }
     * 
     */
    public TravelClubType.ClubMemberName createTravelClubTypeClubMemberName() {
        return new TravelClubType.ClubMemberName();
    }

    /**
     * Create an instance of {@link CompanyInfoType.TelephoneInfo }
     * 
     */
    public CompanyInfoType.TelephoneInfo createCompanyInfoTypeTelephoneInfo() {
        return new CompanyInfoType.TelephoneInfo();
    }

    /**
     * Create an instance of {@link VehicleRetrieveResRQCoreType.CustLoyalty }
     * 
     */
    public VehicleRetrieveResRQCoreType.CustLoyalty createVehicleRetrieveResRQCoreTypeCustLoyalty() {
        return new VehicleRetrieveResRQCoreType.CustLoyalty();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest }
     * 
     */
    public ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest createArrayOfSpecialRequestTypeSpecialRequestSpecialRequest() {
        return new ArrayOfSpecialRequestTypeSpecialRequest.SpecialRequest();
    }

    /**
     * Create an instance of {@link ArrayOfViewershipsTypeViewershipProfileType.ProfileType }
     * 
     */
    public ArrayOfViewershipsTypeViewershipProfileType.ProfileType createArrayOfViewershipsTypeViewershipProfileTypeProfileType() {
        return new ArrayOfViewershipsTypeViewershipProfileType.ProfileType();
    }

    /**
     * Create an instance of {@link ArrayOfConnectedOperatingAirline.ConnectedOperatingAirline }
     * 
     */
    public ArrayOfConnectedOperatingAirline.ConnectedOperatingAirline createArrayOfConnectedOperatingAirlineConnectedOperatingAirline() {
        return new ArrayOfConnectedOperatingAirline.ConnectedOperatingAirline();
    }

    /**
     * Create an instance of {@link ArrayOfServiceRPHsTypeServiceRPH.ServiceRPH }
     * 
     */
    public ArrayOfServiceRPHsTypeServiceRPH.ServiceRPH createArrayOfServiceRPHsTypeServiceRPHServiceRPH() {
        return new ArrayOfServiceRPHsTypeServiceRPH.ServiceRPH();
    }

    /**
     * Create an instance of {@link PricedItinerariesType.PricedItinerary }
     * 
     */
    public PricedItinerariesType.PricedItinerary createPricedItinerariesTypePricedItinerary() {
        return new PricedItinerariesType.PricedItinerary();
    }

    /**
     * Create an instance of {@link PricedItinerariesType.PricedItineraryForOWC }
     * 
     */
    public PricedItinerariesType.PricedItineraryForOWC createPricedItinerariesTypePricedItineraryForOWC() {
        return new PricedItinerariesType.PricedItineraryForOWC();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.LoyaltyPref }
     * 
     */
    public VehicleProfileRentalPrefType.LoyaltyPref createVehicleProfileRentalPrefTypeLoyaltyPref() {
        return new VehicleProfileRentalPrefType.LoyaltyPref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.PaymentFormPref }
     * 
     */
    public VehicleProfileRentalPrefType.PaymentFormPref createVehicleProfileRentalPrefTypePaymentFormPref() {
        return new VehicleProfileRentalPrefType.PaymentFormPref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.CoveragePref }
     * 
     */
    public VehicleProfileRentalPrefType.CoveragePref createVehicleProfileRentalPrefTypeCoveragePref() {
        return new VehicleProfileRentalPrefType.CoveragePref();
    }

    /**
     * Create an instance of {@link VehicleProfileRentalPrefType.SpecialEquipPref }
     * 
     */
    public VehicleProfileRentalPrefType.SpecialEquipPref createVehicleProfileRentalPrefTypeSpecialEquipPref() {
        return new VehicleProfileRentalPrefType.SpecialEquipPref();
    }

    /**
     * Create an instance of {@link ArrayOfResGuestRPHsTypeResGuestRPH.ResGuestRPH }
     * 
     */
    public ArrayOfResGuestRPHsTypeResGuestRPH.ResGuestRPH createArrayOfResGuestRPHsTypeResGuestRPHResGuestRPH() {
        return new ArrayOfResGuestRPHsTypeResGuestRPH.ResGuestRPH();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialReqDetailsTypeOtherServiceInformation.OtherServiceInformation }
     * 
     */
    public ArrayOfSpecialReqDetailsTypeOtherServiceInformation.OtherServiceInformation createArrayOfSpecialReqDetailsTypeOtherServiceInformationOtherServiceInformation() {
        return new ArrayOfSpecialReqDetailsTypeOtherServiceInformation.OtherServiceInformation();
    }

    /**
     * Create an instance of {@link ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability.Restriction }
     * 
     */
    public ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability.Restriction createArrayOfOTAHotelAvailRSHotelStaysHotelStayOTAHotelAvailRSHotelStaysHotelStayAvailabilityRestriction() {
        return new ArrayOfOTAHotelAvailRSHotelStaysHotelStay.OTAHotelAvailRSHotelStaysHotelStay.Availability.Restriction();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.VehicleReadRequest }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.VehicleReadRequest createGetPNROTAReadRQReadRequestsVehicleReadRequest() {
        return new GetPNR.OTAReadRQ.ReadRequests.VehicleReadRequest();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.PkgReadRequest }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.PkgReadRequest createGetPNROTAReadRQReadRequestsPkgReadRequest() {
        return new GetPNR.OTAReadRQ.ReadRequests.PkgReadRequest();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.ReadRequest }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.ReadRequest createGetPNROTAReadRQReadRequestsReadRequest() {
        return new GetPNR.OTAReadRQ.ReadRequests.ReadRequest();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest createGetPNROTAReadRQReadRequestsGlobalReservationReadRequest() {
        return new GetPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing createGetPNROTAReadRQReadRequestsCruiseReadRequestSelectedSailing() {
        return new GetPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership createGetPNROTAReadRQReadRequestsGolfReadRequestMembership() {
        return new GetPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone createGetPNROTAReadRQReadRequestsAirReadRequestTelephone() {
        return new GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty createGetPNROTAReadRQReadRequestsAirReadRequestCustLoyalty() {
        return new GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue createGetPNROTAReadRQReadRequestsAirReadRequestQueueInfoQueue() {
        return new GetPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport createGetPNROTAReadRQReadRequestsHotelReadRequestAirport() {
        return new GetPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport();
    }

    /**
     * Create an instance of {@link GetPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID }
     * 
     */
    public GetPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID createGetPNROTAReadRQReadRequestsHotelReadRequestUserID() {
        return new GetPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ.Queue }
     * 
     */
    public BookFlight.OTAAirBookRQ.Queue createBookFlightOTAAirBookRQQueue() {
        return new BookFlight.OTAAirBookRQ.Queue();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ.Ticketing.TicketingVendor }
     * 
     */
    public BookFlight.OTAAirBookRQ.Ticketing.TicketingVendor createBookFlightOTAAirBookRQTicketingTicketingVendor() {
        return new BookFlight.OTAAirBookRQ.Ticketing.TicketingVendor();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ.Ticketing.PricingSystem }
     * 
     */
    public BookFlight.OTAAirBookRQ.Ticketing.PricingSystem createBookFlightOTAAirBookRQTicketingPricingSystem() {
        return new BookFlight.OTAAirBookRQ.Ticketing.PricingSystem();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ.Fulfillment.Receipt }
     * 
     */
    public BookFlight.OTAAirBookRQ.Fulfillment.Receipt createBookFlightOTAAirBookRQFulfillmentReceipt() {
        return new BookFlight.OTAAirBookRQ.Fulfillment.Receipt();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ.Fulfillment.PaymentText }
     * 
     */
    public BookFlight.OTAAirBookRQ.Fulfillment.PaymentText createBookFlightOTAAirBookRQFulfillmentPaymentText() {
        return new BookFlight.OTAAirBookRQ.Fulfillment.PaymentText();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ.Fulfillment.LCCUserLogin }
     * 
     */
    public BookFlight.OTAAirBookRQ.Fulfillment.LCCUserLogin createBookFlightOTAAirBookRQFulfillmentLCCUserLogin() {
        return new BookFlight.OTAAirBookRQ.Fulfillment.LCCUserLogin();
    }

    /**
     * Create an instance of {@link BookFlight.OTAAirBookRQ.PriceInfo.PricingPref }
     * 
     */
    public BookFlight.OTAAirBookRQ.PriceInfo.PricingPref createBookFlightOTAAirBookRQPriceInfoPricingPref() {
        return new BookFlight.OTAAirBookRQ.PriceInfo.PricingPref();
    }

    /**
     * Create an instance of {@link GetRequiredParametersForLCCResponse.RequiredParametersRS.RequiredParametersData }
     * 
     */
    public GetRequiredParametersForLCCResponse.RequiredParametersRS.RequiredParametersData createGetRequiredParametersForLCCResponseRequiredParametersRSRequiredParametersData() {
        return new GetRequiredParametersForLCCResponse.RequiredParametersRS.RequiredParametersData();
    }

    /**
     * Create an instance of {@link SearchFlightCalendar.OTAAirLowFareSearchRQ.ProcessingInfo }
     * 
     */
    public SearchFlightCalendar.OTAAirLowFareSearchRQ.ProcessingInfo createSearchFlightCalendarOTAAirLowFareSearchRQProcessingInfo() {
        return new SearchFlightCalendar.OTAAirLowFareSearchRQ.ProcessingInfo();
    }

    /**
     * Create an instance of {@link SearchFlightCalendar.OTAAirLowFareSearchRQ.TravelPreferences }
     * 
     */
    public SearchFlightCalendar.OTAAirLowFareSearchRQ.TravelPreferences createSearchFlightCalendarOTAAirLowFareSearchRQTravelPreferences() {
        return new SearchFlightCalendar.OTAAirLowFareSearchRQ.TravelPreferences();
    }

    /**
     * Create an instance of {@link SearchFlightCalendar.OTAAirLowFareSearchRQ.TravelerInfoSummary }
     * 
     */
    public SearchFlightCalendar.OTAAirLowFareSearchRQ.TravelerInfoSummary createSearchFlightCalendarOTAAirLowFareSearchRQTravelerInfoSummary() {
        return new SearchFlightCalendar.OTAAirLowFareSearchRQ.TravelerInfoSummary();
    }

    /**
     * Create an instance of {@link SearchFlightCalendar.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection }
     * 
     */
    public SearchFlightCalendar.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection createSearchFlightCalendarOTAAirLowFareSearchRQAdvanceSearchInfoMaxLayoverPerConnection() {
        return new SearchFlightCalendar.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection();
    }

    /**
     * Create an instance of {@link SearchFlightCalendar.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo }
     * 
     */
    public SearchFlightCalendar.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo createSearchFlightCalendarOTAAirLowFareSearchRQOriginDestinationInformationAlternateLocationInfo() {
        return new SearchFlightCalendar.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo();
    }

    /**
     * Create an instance of {@link SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference }
     * 
     */
    public SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference createSearchHotelRoomsResponseOTAHotelAvailRSRoomStaysRoomStayReference() {
        return new SearchHotelRoomsResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.VehicleReadRequest }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.VehicleReadRequest createGetCarPNROTAReadRQReadRequestsVehicleReadRequest() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.VehicleReadRequest();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.PkgReadRequest }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.PkgReadRequest createGetCarPNROTAReadRQReadRequestsPkgReadRequest() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.PkgReadRequest();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.ReadRequest }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.ReadRequest createGetCarPNROTAReadRQReadRequestsReadRequest() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.ReadRequest();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest createGetCarPNROTAReadRQReadRequestsGlobalReservationReadRequest() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing createGetCarPNROTAReadRQReadRequestsCruiseReadRequestSelectedSailing() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership createGetCarPNROTAReadRQReadRequestsGolfReadRequestMembership() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone createGetCarPNROTAReadRQReadRequestsAirReadRequestTelephone() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty createGetCarPNROTAReadRQReadRequestsAirReadRequestCustLoyalty() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue createGetCarPNROTAReadRQReadRequestsAirReadRequestQueueInfoQueue() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport createGetCarPNROTAReadRQReadRequestsHotelReadRequestAirport() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport();
    }

    /**
     * Create an instance of {@link GetCarPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID }
     * 
     */
    public GetCarPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID createGetCarPNROTAReadRQReadRequestsHotelReadRequestUserID() {
        return new GetCarPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID();
    }

    /**
     * Create an instance of {@link BookResponse.BookBasketRS.AirReservation }
     * 
     */
    public BookResponse.BookBasketRS.AirReservation createBookResponseBookBasketRSAirReservation() {
        return new BookResponse.BookBasketRS.AirReservation();
    }

    /**
     * Create an instance of {@link BookResponse.BookBasketRS.FullFilment }
     * 
     */
    public BookResponse.BookBasketRS.FullFilment createBookResponseBookBasketRSFullFilment() {
        return new BookResponse.BookBasketRS.FullFilment();
    }

    /**
     * Create an instance of {@link CreateTicketResponse.OTAAirBookRS.AirReservation }
     * 
     */
    public CreateTicketResponse.OTAAirBookRS.AirReservation createCreateTicketResponseOTAAirBookRSAirReservation() {
        return new CreateTicketResponse.OTAAirBookRS.AirReservation();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.VehicleReadRequest }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.VehicleReadRequest createGetBasketPNROTAReadRQReadRequestsVehicleReadRequest() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.VehicleReadRequest();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.PkgReadRequest }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.PkgReadRequest createGetBasketPNROTAReadRQReadRequestsPkgReadRequest() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.PkgReadRequest();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.ReadRequest }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.ReadRequest createGetBasketPNROTAReadRQReadRequestsReadRequest() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.ReadRequest();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest createGetBasketPNROTAReadRQReadRequestsGlobalReservationReadRequest() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing createGetBasketPNROTAReadRQReadRequestsCruiseReadRequestSelectedSailing() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership createGetBasketPNROTAReadRQReadRequestsGolfReadRequestMembership() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone createGetBasketPNROTAReadRQReadRequestsAirReadRequestTelephone() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty createGetBasketPNROTAReadRQReadRequestsAirReadRequestCustLoyalty() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue createGetBasketPNROTAReadRQReadRequestsAirReadRequestQueueInfoQueue() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport createGetBasketPNROTAReadRQReadRequestsHotelReadRequestAirport() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport();
    }

    /**
     * Create an instance of {@link GetBasketPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID }
     * 
     */
    public GetBasketPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID createGetBasketPNROTAReadRQReadRequestsHotelReadRequestUserID() {
        return new GetBasketPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID();
    }

    /**
     * Create an instance of {@link GetPNRResponse.OTAAirBookRS.AirReservation }
     * 
     */
    public GetPNRResponse.OTAAirBookRS.AirReservation createGetPNRResponseOTAAirBookRSAirReservation() {
        return new GetPNRResponse.OTAAirBookRS.AirReservation();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.VehicleReadRequest }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.VehicleReadRequest createGetHotelPNROTAReadRQReadRequestsVehicleReadRequest() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.VehicleReadRequest();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.PkgReadRequest }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.PkgReadRequest createGetHotelPNROTAReadRQReadRequestsPkgReadRequest() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.PkgReadRequest();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.ReadRequest }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.ReadRequest createGetHotelPNROTAReadRQReadRequestsReadRequest() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.ReadRequest();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest createGetHotelPNROTAReadRQReadRequestsGlobalReservationReadRequest() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.GlobalReservationReadRequest();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing createGetHotelPNROTAReadRQReadRequestsCruiseReadRequestSelectedSailing() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.CruiseReadRequest.SelectedSailing();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership createGetHotelPNROTAReadRQReadRequestsGolfReadRequestMembership() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.GolfReadRequest.Membership();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone createGetHotelPNROTAReadRQReadRequestsAirReadRequestTelephone() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.Telephone();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty createGetHotelPNROTAReadRQReadRequestsAirReadRequestCustLoyalty() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.CustLoyalty();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue createGetHotelPNROTAReadRQReadRequestsAirReadRequestQueueInfoQueue() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.AirReadRequest.QueueInfo.Queue();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport createGetHotelPNROTAReadRQReadRequestsHotelReadRequestAirport() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.Airport();
    }

    /**
     * Create an instance of {@link GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID }
     * 
     */
    public GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID createGetHotelPNROTAReadRQReadRequestsHotelReadRequestUserID() {
        return new GetHotelPNR.OTAReadRQ.ReadRequests.HotelReadRequest.UserID();
    }

    /**
     * Create an instance of {@link GetBasketPNRResponse.OTAAirBookRS.AirReservation }
     * 
     */
    public GetBasketPNRResponse.OTAAirBookRS.AirReservation createGetBasketPNRResponseOTAAirBookRSAirReservation() {
        return new GetBasketPNRResponse.OTAAirBookRS.AirReservation();
    }

    /**
     * Create an instance of {@link GetBasketPNRResponse.OTAAirBookRS.FullFilment }
     * 
     */
    public GetBasketPNRResponse.OTAAirBookRS.FullFilment createGetBasketPNRResponseOTAAirBookRSFullFilment() {
        return new GetBasketPNRResponse.OTAAirBookRS.FullFilment();
    }

    /**
     * Create an instance of {@link BookFlightResponse.OTAAirBookRS.AirReservation }
     * 
     */
    public BookFlightResponse.OTAAirBookRS.AirReservation createBookFlightResponseOTAAirBookRSAirReservation() {
        return new BookFlightResponse.OTAAirBookRS.AirReservation();
    }

    /**
     * Create an instance of {@link EditPNRResponse.EditPnrRS.AirReservation }
     * 
     */
    public EditPNRResponse.EditPnrRS.AirReservation createEditPNRResponseEditPnrRSAirReservation() {
        return new EditPNRResponse.EditPnrRS.AirReservation();
    }

    /**
     * Create an instance of {@link Cancel.OTACancelRQ.UniqueID }
     * 
     */
    public Cancel.OTACancelRQ.UniqueID createCancelOTACancelRQUniqueID() {
        return new Cancel.OTACancelRQ.UniqueID();
    }

    /**
     * Create an instance of {@link Cancel.OTACancelRQ.Segment }
     * 
     */
    public Cancel.OTACancelRQ.Segment createCancelOTACancelRQSegment() {
        return new Cancel.OTACancelRQ.Segment();
    }

    /**
     * Create an instance of {@link Cancel.OTACancelRQ.CancellationOverrides }
     * 
     */
    public Cancel.OTACancelRQ.CancellationOverrides createCancelOTACancelRQCancellationOverrides() {
        return new Cancel.OTACancelRQ.CancellationOverrides();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ.Queue }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ.Queue createBookFlightWithRecommendationOTAAirBookRQQueue() {
        return new BookFlightWithRecommendation.OTAAirBookRQ.Queue();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.TicketingVendor }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.TicketingVendor createBookFlightWithRecommendationOTAAirBookRQTicketingTicketingVendor() {
        return new BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.TicketingVendor();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.PricingSystem }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.PricingSystem createBookFlightWithRecommendationOTAAirBookRQTicketingPricingSystem() {
        return new BookFlightWithRecommendation.OTAAirBookRQ.Ticketing.PricingSystem();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.Receipt }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.Receipt createBookFlightWithRecommendationOTAAirBookRQFulfillmentReceipt() {
        return new BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.Receipt();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.PaymentText }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.PaymentText createBookFlightWithRecommendationOTAAirBookRQFulfillmentPaymentText() {
        return new BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.PaymentText();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.LCCUserLogin }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.LCCUserLogin createBookFlightWithRecommendationOTAAirBookRQFulfillmentLCCUserLogin() {
        return new BookFlightWithRecommendation.OTAAirBookRQ.Fulfillment.LCCUserLogin();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo.PricingPref }
     * 
     */
    public BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo.PricingPref createBookFlightWithRecommendationOTAAirBookRQPriceInfoPricingPref() {
        return new BookFlightWithRecommendation.OTAAirBookRQ.PriceInfo.PricingPref();
    }

    /**
     * Create an instance of {@link GetPNRPriceResponse.OTAAirBookRS.AirReservation }
     * 
     */
    public GetPNRPriceResponse.OTAAirBookRS.AirReservation createGetPNRPriceResponseOTAAirBookRSAirReservation() {
        return new GetPNRPriceResponse.OTAAirBookRS.AirReservation();
    }

    /**
     * Create an instance of {@link BookFlightWithRecommendationResponse.OTAAirBookRS.AirReservation }
     * 
     */
    public BookFlightWithRecommendationResponse.OTAAirBookRS.AirReservation createBookFlightWithRecommendationResponseOTAAirBookRSAirReservation() {
        return new BookFlightWithRecommendationResponse.OTAAirBookRS.AirReservation();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ.Queue }
     * 
     */
    public CreateTicket.OTAAirBookRQ.Queue createCreateTicketOTAAirBookRQQueue() {
        return new CreateTicket.OTAAirBookRQ.Queue();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ.Ticketing.TicketingVendor }
     * 
     */
    public CreateTicket.OTAAirBookRQ.Ticketing.TicketingVendor createCreateTicketOTAAirBookRQTicketingTicketingVendor() {
        return new CreateTicket.OTAAirBookRQ.Ticketing.TicketingVendor();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ.Ticketing.PricingSystem }
     * 
     */
    public CreateTicket.OTAAirBookRQ.Ticketing.PricingSystem createCreateTicketOTAAirBookRQTicketingPricingSystem() {
        return new CreateTicket.OTAAirBookRQ.Ticketing.PricingSystem();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ.Fulfillment.Receipt }
     * 
     */
    public CreateTicket.OTAAirBookRQ.Fulfillment.Receipt createCreateTicketOTAAirBookRQFulfillmentReceipt() {
        return new CreateTicket.OTAAirBookRQ.Fulfillment.Receipt();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ.Fulfillment.PaymentText }
     * 
     */
    public CreateTicket.OTAAirBookRQ.Fulfillment.PaymentText createCreateTicketOTAAirBookRQFulfillmentPaymentText() {
        return new CreateTicket.OTAAirBookRQ.Fulfillment.PaymentText();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ.Fulfillment.LCCUserLogin }
     * 
     */
    public CreateTicket.OTAAirBookRQ.Fulfillment.LCCUserLogin createCreateTicketOTAAirBookRQFulfillmentLCCUserLogin() {
        return new CreateTicket.OTAAirBookRQ.Fulfillment.LCCUserLogin();
    }

    /**
     * Create an instance of {@link CreateTicket.OTAAirBookRQ.PriceInfo.PricingPref }
     * 
     */
    public CreateTicket.OTAAirBookRQ.PriceInfo.PricingPref createCreateTicketOTAAirBookRQPriceInfoPricingPref() {
        return new CreateTicket.OTAAirBookRQ.PriceInfo.PricingPref();
    }

    /**
     * Create an instance of {@link CancelResponse.OTACancelRS.OTAAirBookRS.AirReservation }
     * 
     */
    public CancelResponse.OTACancelRS.OTAAirBookRS.AirReservation createCancelResponseOTACancelRSOTAAirBookRSAirReservation() {
        return new CancelResponse.OTACancelRS.OTAAirBookRS.AirReservation();
    }

    /**
     * Create an instance of {@link Book.BookBasketRQ.FlightReservation }
     * 
     */
    public Book.BookBasketRQ.FlightReservation createBookBookBasketRQFlightReservation() {
        return new Book.BookBasketRQ.FlightReservation();
    }

    /**
     * Create an instance of {@link Book.BookBasketRQ.HotelReservation }
     * 
     */
    public Book.BookBasketRQ.HotelReservation createBookBookBasketRQHotelReservation() {
        return new Book.BookBasketRQ.HotelReservation();
    }

    /**
     * Create an instance of {@link Book.BookBasketRQ.CarReservation }
     * 
     */
    public Book.BookBasketRQ.CarReservation createBookBookBasketRQCarReservation() {
        return new Book.BookBasketRQ.CarReservation();
    }

    /**
     * Create an instance of {@link Book.BookBasketRQ.InsuranceReservation }
     * 
     */
    public Book.BookBasketRQ.InsuranceReservation createBookBookBasketRQInsuranceReservation() {
        return new Book.BookBasketRQ.InsuranceReservation();
    }

    /**
     * Create an instance of {@link Book.BookBasketRQ.Fulfillment.Receipt }
     * 
     */
    public Book.BookBasketRQ.Fulfillment.Receipt createBookBookBasketRQFulfillmentReceipt() {
        return new Book.BookBasketRQ.Fulfillment.Receipt();
    }

    /**
     * Create an instance of {@link Book.BookBasketRQ.Fulfillment.PaymentText }
     * 
     */
    public Book.BookBasketRQ.Fulfillment.PaymentText createBookBookBasketRQFulfillmentPaymentText() {
        return new Book.BookBasketRQ.Fulfillment.PaymentText();
    }

    /**
     * Create an instance of {@link Book.BookBasketRQ.Fulfillment.LCCUserLogin }
     * 
     */
    public Book.BookBasketRQ.Fulfillment.LCCUserLogin createBookBookBasketRQFulfillmentLCCUserLogin() {
        return new Book.BookBasketRQ.Fulfillment.LCCUserLogin();
    }

    /**
     * Create an instance of {@link GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference }
     * 
     */
    public GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference createGetHotelRoomRulesResponseOTAHotelAvailRSRoomStaysRoomStayReference() {
        return new GetHotelRoomRulesResponse.OTAHotelAvailRS.RoomStays.RoomStay.Reference();
    }

    /**
     * Create an instance of {@link SearchFlight.OTAAirLowFareSearchRQ.ProcessingInfo }
     * 
     */
    public SearchFlight.OTAAirLowFareSearchRQ.ProcessingInfo createSearchFlightOTAAirLowFareSearchRQProcessingInfo() {
        return new SearchFlight.OTAAirLowFareSearchRQ.ProcessingInfo();
    }

    /**
     * Create an instance of {@link SearchFlight.OTAAirLowFareSearchRQ.TravelPreferences }
     * 
     */
    public SearchFlight.OTAAirLowFareSearchRQ.TravelPreferences createSearchFlightOTAAirLowFareSearchRQTravelPreferences() {
        return new SearchFlight.OTAAirLowFareSearchRQ.TravelPreferences();
    }

    /**
     * Create an instance of {@link SearchFlight.OTAAirLowFareSearchRQ.TravelerInfoSummary }
     * 
     */
    public SearchFlight.OTAAirLowFareSearchRQ.TravelerInfoSummary createSearchFlightOTAAirLowFareSearchRQTravelerInfoSummary() {
        return new SearchFlight.OTAAirLowFareSearchRQ.TravelerInfoSummary();
    }

    /**
     * Create an instance of {@link SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection }
     * 
     */
    public SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection createSearchFlightOTAAirLowFareSearchRQAdvanceSearchInfoMaxLayoverPerConnection() {
        return new SearchFlight.OTAAirLowFareSearchRQ.AdvanceSearchInfo.MaxLayoverPerConnection();
    }

    /**
     * Create an instance of {@link SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo }
     * 
     */
    public SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo createSearchFlightOTAAirLowFareSearchRQOriginDestinationInformationAlternateLocationInfo() {
        return new SearchFlight.OTAAirLowFareSearchRQ.OriginDestinationInformation.AlternateLocationInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationSoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epowerv5.amadeus.com.tr/WS", name = "AuthenticationSoapHeader")
    public JAXBElement<AuthenticationSoapHeader> createAuthenticationSoapHeader(AuthenticationSoapHeader value) {
        return new JAXBElement<AuthenticationSoapHeader>(_AuthenticationSoapHeader_QNAME, AuthenticationSoapHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epowerv5.amadeus.com.tr/WS", name = "TicketingDate", scope = ETicketInfo.class)
    public JAXBElement<XMLGregorianCalendar> createETicketInfoTicketingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ETicketInfoTicketingDate_QNAME, XMLGregorianCalendar.class, ETicketInfo.class, value);
    }

}
