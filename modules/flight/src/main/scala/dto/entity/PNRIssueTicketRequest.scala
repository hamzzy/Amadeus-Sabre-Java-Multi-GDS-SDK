package flight.dto.entity

case class PNRIssueTicketRequest(supplier: String = "",
                                 pnrRef: String = "",
                                 supplierFallbackRef: Option[String] = None,
                                 supplierSessionId: Option[String] = None,
                                 ticketType: Option[String] = Some("eTicket"), //
                                 issueMCO: Boolean = false, // (Amadeus TTP/ET/TTM entry)
                                 sendAmadeusMail: Boolean = false, // Send Amadeus Format Booking Email
                                 travellers: Seq[Passenger] = Nil,
                                 amount: BigDecimal = BigDecimal(.0)
                                )