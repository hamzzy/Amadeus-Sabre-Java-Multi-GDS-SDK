package flight.converter.crane.pojo

case class CraneBookFlight(craneHeader: CraneHeader,
                           travellers: List[CraneTravellerPNR],
                           infantTraveller: Option[List[CraneTravellerInfantPNR]],
                           contactInfo: CraneContactInfo,
                           segments: List[CraneSegment])

case class CraneSegment(cabin: String,
                        resBookDesigCode:String,
                        resBookDesigQuantity: String,
                        craneFareInfo: CraneFareInfo,
                        flightSegmentXML: String)
case class CraneContactInfo(email: String, firstName: String, title: String, lastName: String, countryCode: String, phone: String)
case class CraneTravellerPNR(title: String, firstName: String, middleName: Option[String], lastName: String, dob: String, gender: String, ageCategory: String, attacheInfant: Boolean, seatCount: String = "1")
case class CraneTravellerInfantPNR(firstName: String, lastName: String, dob: String, seatCount: String = "1")
case class CraneAvailabilityFlight(segments: List[CraneSegment] = Nil)
case class CraneFareInfo(cabinClassCode: String = "", fareGroupName: String = "", fareReferenceCode:String = "", fareReferenceID: String = "", fareReferenceName: String = "", flightSegmentSequence: String = "",resBookDesigCode: String = "")