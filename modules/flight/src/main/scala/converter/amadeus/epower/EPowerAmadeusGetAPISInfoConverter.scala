package flight.converter.amadeus.epower

import java.math.BigInteger
import java.time.ZoneId
import java.util.Date

import flight.converter.Converter
import flight.dto.entity.{Airlines, _}
import flight.dto.utils.{AirlineGetter}
import wsimport.lib.epower.ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption
import wsimport.lib.epower.BookFlight.OTAAirBookRQ
import wsimport.lib.epower.BookResponse.BookBasketRS.FullFilment
import wsimport.lib.epower.Cancel.OTACancelRQ
import wsimport.lib.epower.TravelerInfoType.AirTraveler
import wsimport.lib.epower.VerificationType.PersonName
import wsimport.lib.epower._
import org.apache.commons.lang3.text.WordUtils

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import wsimport.lib.epower.TicketType
import dto.BookingStatus
import dto.entity.enums.{Gender, PassengerCode}
import org.apache.commons.codec.digest.DigestUtils

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object EPowerAmadeusGetAPISInfoConverter extends Converter[GetAPISRules, APIFieldInfo] with EPowerHeader {

  override def toSupplier(baseDto: AnyRef): GetAPISRules = {
    val flightInfoRequest = baseDto.asInstanceOf[FlightInfoRequest]
    val checkETicket = new GetAPISRules
    checkETicket.setSessionId(flightInfoRequest.itineraryWSResponse.getSessionId)
    val otaAirBookRQ = new APISRulesRQ
    val pricedItineraryWSResponseInterface = flightInfoRequest.itineraryWSResponse
    otaAirBookRQ.setRecommendationID(pricedItineraryWSResponseInterface.getSequenceNumber.toInt)
    otaAirBookRQ.setCombinationID(pricedItineraryWSResponseInterface.getSelectedCombinationId.toInt)
    checkETicket.setAPISRulesRQ(otaAirBookRQ)
    checkETicket
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): APIFieldInfo = {
    val flightInfoRequest = request.asInstanceOf[FlightInfoRequest]
    val getFlightRulesResponse = response.asInstanceOf[GetAPISRulesResponse]
//    getFlightRulesResponse.getOTAAirRulesRS.getErrorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo.foreach { anyRef =>
//      anyRef.getClass match {
//        case ErrorsType =>
//        case WarningsType =>
//        case RuleLink =>
//        case objectz @ PriceMessageInfoType | MiniRuleResponseInfoType | FareRuleResponseInfoType | SuccessType =>
//      }
//
//    }
    APIFieldInfo()
  }

}
