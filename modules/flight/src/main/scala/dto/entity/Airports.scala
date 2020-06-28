package flight.dto.entity


case class Airports(id: Option[Long] = None,
                    airCode: String = "",
                    airportName: String = "",
                    countryName: String = "",
                    countryCode: String = "",
                    cityCode: String = "",
                    city: String = "",
                    state: String = "",
                    typeCode: String = ""
                   ) extends BaseDto {}