package flight.dto.entity

case class PNRInfoResponse(fareRules: List[FareRule] = Nil,
                           craneTicketNo: String = "",
                           pricedMessageInfo: List[PricedMessageInfo] = Nil,
                           originDestinationWSResponses: AirItineraryWSResponse = null,
                           pricingInfoWSResponse: PricingInfoWSResponse = null,
                           travelerInfo: List[TravelerInfo] = Nil,
                           xmlResponse: String = "",
                           status: Option[String] = None,
                           pnrRemark: List[PnrRemark] = Nil,
                           hasError: Boolean = false,
                           error: List[Error] = Nil
                          ) extends BaseDto
final case class FareRule(referenceCode: String, filingAirline: String, marketingAirline: String, departureAirport: String, arrivingAirport: String, fareSectionRule: List[FareSectionRule])
final case class FareSectionRule(title: String,  code: String, description: String)
final case class PricedMessageInfo(dataList: String, description: String)
final case class PnrRemark (typez: String = "", category: String = "", description: String = "") extends BaseDto
final case class TravelerInfo(eTicketNumber: String, passenger: Passenger)