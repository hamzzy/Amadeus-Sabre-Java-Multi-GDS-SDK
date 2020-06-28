package flight.dto.entity

case class TicketRule(departureDate: String = "",
                      referenceCode: String = "",
                      filingAirline: String = "",
                      departureAirport: String = "",
                      arrivalAirport: String = "",
                      message: String = ""
                     ) extends BaseDto