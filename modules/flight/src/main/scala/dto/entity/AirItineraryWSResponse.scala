package flight.dto.entity

case class AirItineraryWSResponse(originDestinationWSResponses: List[OriginDestinationWSResponse] = Nil,
                                  originDestinationCombinations: List[OriginDestinationCombinations] = Nil,
                                  directionIndicator: String = ""
                                 ) extends BaseDto {
}
