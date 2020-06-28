package flight.dto.entity

import flight.dto.entity.enums.PhoneUseType

case class Telephone(phoneNumber: String = "",
                     phoneUseType: PhoneUseType = PhoneUseType.HOME,
                     locationCode: String = "",
                     countryAccessCode: String = "") extends BaseDto