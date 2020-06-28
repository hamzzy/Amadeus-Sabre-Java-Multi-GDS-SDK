package flight.dto.entity

case class OriginDestinationCombinations(validatingAirlineCode: String = "",
                                         forceEticketing: Boolean,
                                         indexList: String = "",
                                         combinationId: String = "",
                                         eTicketEligible: String = "",
                                         serviceFeeAmount: BigDecimal = BigDecimal(.0)) extends BaseDto