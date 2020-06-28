package flight.dto.entity

import dto.SearchRequestHeader
import dto.entity.enums.PassengerCode
import flight.dto.entity.enums._

case class FlightSearchRequest(originDestinationRequests: List[OriginDestinationRequest] = Nil,
                               passengerTypes: List[PassengerType] = Nil,
                               tripType: TripType = null,
                               preferredCabin: CabinClass = CabinClass.ECONOMY,
                               cabinPrefLevel: CabinPrefLevel = null,
                               preferredAirline: List[String] = Nil,
                               excludedAirlines: List[String] = Nil,
                               flightType: FlightType = null,
                               isDirectFlight: Boolean = false,
                               flexibleDate: Boolean = false,
                               refundable: Boolean = false,
                               ticketPolicy: TicketPolicy = null,
                               salesCategory: String = "",
                               ticketLocale: String = "",
                               priceSource: String = "Published", //Published, Private or Both
//                               dealCodes: List[(String, String)] = Nil,
                               users: Option[Long] = None,
                               supplier: String = "",
                               tabHash: String = "",
                               sessionId: String = "",
                               searchRequestHeader: SearchRequestHeader = SearchRequestHeader()
                              ) extends BaseDto {
  val adultCount: Int = passengerTypes.filter(a => a.code.equals(PassengerCode.ADULT)).map(_.quantity).sum
  val childCount: Int = passengerTypes.filter(a => a.code.equals(PassengerCode.CHILD)).map(_.quantity).sum
  val infantCount: Int = passengerTypes.filter(a => a.code.equals(PassengerCode.INFANT)).map(_.quantity).sum
  lazy val seatCount: Int = passengerTypes.filterNot(_.code.equals(PassengerCode.INFANT)).map(_.quantity).sum
  def isPassportRequired: Boolean = {
    val passportRequiredCountries = Seq("US", "CA")
    val destinationCountries = (originDestinationRequests.map(_.destination.countryCode) ::: originDestinationRequests.map(_.origin.countryCode)).distinct
//    passportRequiredCountries.zip(destinationCountries).filter(x => x._1 == 1 && x._2 == 0)
    val count = destinationCountries.foldLeft(0)((acc, p) => if(passportRequiredCountries.contains(p)) acc + 1 else acc)
    count > 0
  }
}
