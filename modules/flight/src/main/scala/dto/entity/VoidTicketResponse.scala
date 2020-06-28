package flight.dto.entity

import java.util.Date

case class VoidTicketResponse(status: String = "", tickets: List[VoidTicket] =Nil, cancelTime: Date = new Date())