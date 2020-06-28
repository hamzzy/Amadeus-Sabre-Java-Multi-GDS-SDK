package flight.dto.entity

case class PNRIssueTicketResponse(status: String = "",
                                  craneTicketNo: String = "",
                                  sessionId: String = "", //E-Power SessionID
                                  originDestinationWSResponses: Vector[OriginDestinationWSResponse] = Vector.empty,
                                  passengers: Vector[Passenger] = Vector.empty,
                                  pnrRef: String = "",
                                  priceChargeRequired: Boolean = false,
                                  priceChargeFallback: Option[String] = None,
                                  errors: Vector[Error] = Vector.empty
                                 )