package flight.converter.amadeus.epower

import java.math.BigInteger
import java.time.ZoneId
import java.util.Date

import flight.converter.Converter
import flight.dto.entity.{Airlines, _}
import flight.dto.utils.AirlineGetter
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
import utils.StringUtil
import org.apache.commons.codec.digest.DigestUtils

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object EPowerAmadeusFareRuleConverter extends Converter[GetFlightRules, FareRuleResponse] with EPowerHeader {

  override def toSupplier(baseDto: AnyRef): GetFlightRules = {
    val flightInfoRequest = baseDto.asInstanceOf[FlightInfoRequest]
    val checkETicket = new GetFlightRules
    checkETicket.setSessionId(flightInfoRequest.itineraryWSResponse.getSessionId)
    val otaAirBookRQ = new OTAAirRulesRQ
    val pricedItineraryWSResponseInterface = flightInfoRequest.itineraryWSResponse
    otaAirBookRQ.setRecommendationID(pricedItineraryWSResponseInterface.getSequenceNumber.toInt)
    otaAirBookRQ.setCombinationID(pricedItineraryWSResponseInterface.getSelectedCombinationId.toInt)
    otaAirBookRQ.setIsOneWayCombinable(pricedItineraryWSResponseInterface.getOneWayCombinable)
    otaAirBookRQ.setMiniRuleEnabled(if (flightInfoRequest.minimumRule) 1 else 0)
    otaAirBookRQ.setPriceMessageEnabled(1)
    otaAirBookRQ.setFlightRuleEnabled(1)
    otaAirBookRQ.setPassengerType(PassengerCode.ADULT.value())
    checkETicket.setOTAAirRulesRQ(otaAirBookRQ)
    println(StringUtil.classToXmlString(checkETicket))
    checkETicket
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): FareRuleResponse = {
    val flightInfoRequest = request.asInstanceOf[FlightInfoRequest]
    val getFlightRulesResponse = response.asInstanceOf[GetFlightRulesResponse]
    var fareRuleResponse = FareRuleResponse()
    val objects = getFlightRulesResponse.getOTAAirRulesRS.getErrorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo.filter(a => Seq(classOf[PriceMessageInfoType], classOf[MiniRuleResponseInfoType], classOf[FareRuleResponseInfoType]).contains(a.getClass))

    val fareRuleResponseInfoType: FareRuleResponseInfoType = objects.find(_.getClass equals classOf[FareRuleResponseInfoType]).get.asInstanceOf[FareRuleResponseInfoType]
    val priceMessageInfoType: PriceMessageInfoType = objects.find(_.getClass equals classOf[PriceMessageInfoType]).get.asInstanceOf[PriceMessageInfoType]

    FareRuleResponse(
      flightInfoRequest = flightInfoRequest,
      pricedMessageInfo = priceMessageInfoType.getPriceMessageInfo.getMiniRulesPriceMessages.flatMap(_.getText.getMiniRulesPriceText).map(item => PricedMessageInfo(item.getPriceDataList, item.getPriceMessageValue)).toList,
      fareRules = fareRuleResponseInfoType.getFareRuleInfo.map(fareRuleInfo => FareRule(
        referenceCode = fareRuleInfo.getFareReference.head.getValue,
        filingAirline = fareRuleInfo.getFilingAirline.getCode,
        marketingAirline = fareRuleInfo.getMarketingAirline.head.getCode,
        departureAirport = fareRuleInfo.getDepartureAirport.getLocationCode,
        arrivingAirport = fareRuleInfo.getArrivalAirport.getLocationCode,
        fareSectionRule = fareRuleInfo.getFareRules.getSubSection.map { section =>
          FareSectionRule(title = section.getSubTitle, code = section.getSubCode, description = section.getParagraph.map(_.getTextOrImageOrListItem.head.asInstanceOf[FormattedTextTextType].getValue).mkString("-----"))
        }.toList
      )).toList
    )

    //    getFlightRulesResponse.getOTAAirRulesRS.getErrorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo.foreach { anyRef =>
    //      anyRef.getClass match {
    ////        case w@WarningsType => FareRuleResponse()
    ////        case w@RuleLink => FareRuleResponse()
    ////        case w@ErrorsType => FareRuleResponse()
    //        case objectz@PriceMessageInfoType | MiniRuleResponseInfoType | FareRuleResponseInfoType | SuccessType => if (!objectz.isInstanceOf[ErrorsType]) {
    //          val pricedMessageInfo = objectz.asInstanceOf[PriceMessageInfoType].getPriceMessageInfo.getMiniRulesPriceMessages.flatMap(_.getText.getMiniRulesPriceText).map(item => PricedMessageInfo(item.getPriceDataList, item.getPriceMessageValue.replace("{0}", item.getPriceDataList))).toList
    //          val fareRuleInfo: FareRuleResponseInfoType = getFlightRulesResponse.getOTAAirRulesRS.getErrorsOrPriceMessageInfoTypeOrMiniRuleResponseInfo.last.asInstanceOf[FareRuleResponseInfoType]
    //          fareRuleInfo.getFareRuleInfo.map { item =>
    //            FareRule(referenceCode = item.getFareReference.head.getValue, filingAirline = item.getFilingAirline.getCode, marketingAirline = item.getMarketingAirline.head.getCode, departureAirport = item.getDepartureAirport.getCodeContext,
    //              arrivingAirport = item.getArrivalAirport.getCodeContext, fareSectionRule = item.getFareRules.getSubSection.map(section => FareSectionRule(section.getSubTitle, section.getSubCode, section.getParagraph.head.getText)).toList)
    //          }
    //
    //        }
    //      }
    //    }
  }

}

