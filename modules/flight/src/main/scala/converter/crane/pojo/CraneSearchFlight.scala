package flight.converter.crane.pojo

import flight.dto.entity.BaseDto

case class CraneSearchFlight(craneHeader: CraneHeader,
                             originDestinations: Vector[CraneOriginDestination],
                             travellers: CraneTraveller,
                             preferredCabin: Option[String] = Some(CraneCabin.ECONOMY)
                            ) extends BaseDto {
  lazy val tripType = originDestinations.size match {
    case 1 => "ONE_WAY"
    case 2 => "ROUND_TRIP"
    case _ => "MULTI_DESTINATION"
  }
}

sealed case class CraneOriginDestination(origin: String, destination: String, departingDate: String)

sealed case class CraneTraveller(adultCount: Int, childCount: Int = 0, infantCount: Int = 0)

object CraneCabin {
  val ECONOMY = "ECONOMY"
  val BUSINESS = "BUSINESS"
}