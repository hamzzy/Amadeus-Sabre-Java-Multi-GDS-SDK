package flight.dto.entity

import java.time.LocalDateTime
import flight.dto.entity.enums.TicketType

case class TicketingInfoWSResponse(ticketTimeLimit: LocalDateTime = LocalDateTime.now(),
                                   ticketType: TicketType = TicketType.E_TICKET,
                                   eTicketEligibility: String = "",
                                   ticketRules: List[TicketRule] = Nil) extends BaseDto