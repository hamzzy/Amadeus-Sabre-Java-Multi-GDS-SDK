package flight.dto.entity

import java.time.LocalDateTime

import dto.entity.enums._

case class  Passenger(namePrefix: String = "",
                     givenName: String = "",
                     surname: String  = "",
                     middleName: Option[String] = None,
                     gender: Gender = Gender.UNKNOWN,
                     birthDate: LocalDateTime = LocalDateTime.now(),
                     phoneLocationType: String = "HOME",
                     telephones: List[Telephone] = Nil,
                     contactNamePrefix: String = "",
                     contactFirstName: String = "",
                     contactLastName: String = "",
                     contactEmail: String = "",
                     contactPhone: String = "",
                     countryAccessCode: String = "",
                     code: PassengerCode = PassengerCode.ADULT,
                     rph: String = "",
                     emails: List[String] = Nil,
                     eTicketRef: Option[String] = None,
                     docInfo: Option[PassportDocInfo] = None
                    ) extends BaseDto {

}

sealed case class PassportDocInfo(passportNo: String, issueCountryCode: String, passportExpDate: String)