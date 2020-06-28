package flight.dto.entity

case class VoidTicket(ticketNumber: String = "", status: String = "", authCode: Option[String] = None)