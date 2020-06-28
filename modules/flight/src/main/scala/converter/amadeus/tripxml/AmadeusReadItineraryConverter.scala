package flight.converter.amadeus.tripxml

import flight.converter.Converter
import flight.dto.entity.{PNRInfoResponse, PNRRequest}
import wsimport.lib.amadeus.pnr.read._

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:42 PM.
  */
object AmadeusReadItineraryConverter extends Converter[OTAReadRQ, PNRInfoResponse] {

  override def toSupplier(baseDto: AnyRef): OTAReadRQ = {
    val pnrRef = baseDto.asInstanceOf[PNRRequest]
    val wsPnrRead = new WsPNRRead()
    wsPnrRead.getWsPNRReadSoap
    val otaReadRq = new OTAReadRQ
    otaReadRq.setPOS(POSBuilder.createInstance())
    val uniqueID = new UniqueIDRQ()
    uniqueID.setID(pnrRef.pnrRef)
    otaReadRq.setUniqueID(uniqueID)
    otaReadRq
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRInfoResponse = {
    val otaReadRS = response.asInstanceOf[OTATravelItineraryRS]
    val itineraries = otaReadRS.getTravelItinerary

    PNRInfoResponse()
  }



//  if (itinerary != null) {
//    pnrDetails.setStatus("Success");
//    pnrDetails.setItineraryRef(itinerary.getItineraryRef().getID());
//
//    /*
//     * Get the passengers Info
//     */
//    itinerary.getCustomerInfos().getCustomerInfo().forEach(customerInfoRS -> {
//      Passenger passenger = new Passenger();
//      passenger.setCode(PassengerCode.fromValue(customerInfoRS.getCustomer().getPersonName().getNameType().trim().toUpperCase()));
//      String names[] = customerInfoRS.getCustomer().getPersonName().getGivenName().split(" ");
//      String firstName = names[0];
//      passenger.setNamePrefix(names.length > 1 ? names[1] : "");
//      passenger.setGivenName(firstName);
//      passenger.setSurname(customerInfoRS.getCustomer().getPersonName().getSurname());
//      passenger.setRPH(customerInfoRS.getRPH());
//      pnrDetails.getPassengers().add(passenger);
//    });
//
//    /*
//     * Get flight Itinerary info
//     */
//    ItineraryWSResponse itineraryWSResponse = new ItineraryWSResponse();
//    OriginDestinationWSResponse originDestination = new OriginDestinationWSResponse();
//    itinerary.getItineraryInfo().getReservationItems().getItem().forEach(item -> {
//      item.getAir().forEach(airItinerary -> {
//        AirItineraryWSResponse airItineraryWSResponse = new AirItineraryWSResponse();
//        FlightSegmentWSResponse segmentWSResponse = new FlightSegmentWSResponse();
//        segmentWSResponse.setDepartureDateTime(airItinerary.getDepartureDateTime());
//        segmentWSResponse.setArrivalDateTime(airItinerary.getArrivalDateTime());
//        segmentWSResponse.setFlightNumber(airItinerary.getFlightNumber());
//        segmentWSResponse.setStopQuantity(airItinerary.getStopQuantity());
//        segmentWSResponse.setResBookDesigCode(airItinerary.getResBookDesigCode());
//        segmentWSResponse.setMealCode(airItinerary.getMealCode());
//        segmentWSResponse.setOriginDestinationType(airItinerary.getOrginDestType().value());
//
//        //TODO parse flight from jaxb serialize to object
//        //                    segmentWSResponse.setDepartureAirportCode(airItinerary.getContent().get(0).);
//        originDestination.getFlightSegmentWSResponses().add(segmentWSResponse);
//        airItineraryWSResponse.getOriginDestinationWSResponses().add(originDestination);
//        itineraryWSResponse.setAirItineraryWSResponse(airItineraryWSResponse);
//      });
//    });
//
//    /*
//     * NUC, Tax and Total Fare Display and Fare Breakdown by Passengers
//     */
//    itinerary.getItineraryInfo().getReservationItems().getItemPricing().forEach(a -> {
//      AirFareInfo itemPricing = a.getAirFareInfo();
//
//      PricingInfoWSResponse pricingInfoWSResponse = new PricingInfoWSResponse();
//      double baseFare = itemPricing.getItinTotalFare().getBaseFare().getDecimalPlaces() >= 2 ? itemPricing.getItinTotalFare().getBaseFare().getAmount() / 100 : itemPricing.getItinTotalFare().getBaseFare().getAmount();
//      double taxFare = itemPricing.getItinTotalFare().getTaxes().getDecimalPlaces() >= 2 ? itemPricing.getItinTotalFare().getTaxes().getAmount() / 100 : itemPricing.getItinTotalFare().getTaxes().getAmount();
//      pricingInfoWSResponse.setBaseFare(new BaseFare(baseFare, itemPricing.getItinTotalFare().getBaseFare().getCurrencyCode()));
//      pricingInfoWSResponse.getTotalTax().add(new TaxFare(taxFare, itemPricing.getItinTotalFare().getTaxes().getCurrencyCode()));
//      pricingInfoWSResponse.setTotalFare(itemPricing.getItinTotalFare().getTotalFare().getAmount());
//      pricingInfoWSResponse.setGdsEquivCurrency(itemPricing.getItinTotalFare().getEquivFare().getCurrencyCode());
//      pricingInfoWSResponse.setGdsEquivBaseFare(itemPricing.getItinTotalFare().getEquivFare().getDecimalPlaces() >= 2 ? itemPricing.getItinTotalFare().getEquivFare().getAmount() / 100 : itemPricing.getItinTotalFare().getEquivFare().getAmount());
//      itineraryWSResponse.setPricingInfoWSResponse(pricingInfoWSResponse);
//      itemPricing.getPTCFareBreakdowns().getPTCFareBreakdown().forEach(ptcFareBreakdownRS -> {
//        Integer passengerQuantity = ptcFareBreakdownRS.getPassengerTypeQuantity().getQuantity();
//        PassengerCode passengerCode = PassengerCode.fromValue(ptcFareBreakdownRS.getPassengerTypeQuantity().getCode().trim().toUpperCase());
//        PassengerFare passengerFare = new PassengerFare(ptcFareBreakdownRS.getPassengerFare().getBaseFare().getAmount(), ptcFareBreakdownRS.getPassengerFare().getTaxes().getAmount(), ptcFareBreakdownRS.getPassengerFare().getTotalFare().getAmount());
//        FareBreakDown fare = new FareBreakDown(new PassengerType(passengerCode, passengerQuantity), passengerFare, passengerQuantity);
//        itineraryWSResponse.getPricingInfoWSResponse().getFareBreakDowns().add(fare);
//      });
//    });
//
//    String ticketType = itinerary.getItineraryInfo().getTicketing().getTicketType().value();
//    String ticketTimeLimit = itinerary.getItineraryInfo().getTicketing().getTicketTimeLimit();
//
//
//    //            itineraryWSResponse.setTicketingInfo(new TicketingInfoWSResponse(ticketTimeLimit, ticketType));
//
//    pnrDetails.setItineraryWSResponse(itineraryWSResponse);
//  } else
//    pnrDetails.setStatus("Failed");
//
//  //        pnrDetails.setResponseXML_JSON("" + play.libs.Json.toJson(itinerary));
//  return pnrDetails;

}
