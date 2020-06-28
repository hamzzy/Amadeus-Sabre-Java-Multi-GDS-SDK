package flight.converter.amadeus.epower

import java.util.Objects

import dto.entity.enums.PassengerCode
import flight.converter.Converter
import flight.dto.entity._
import flight.dto.utils.{AirlineGetter, AirportCityGetter}
import utils._
import utils.StringUtil
import wsimport.lib.epower.VerificationType.PersonName
import wsimport.lib.epower._
import wsimport.lib.epower.GetPNR.OTAReadRQ
import wsimport.lib.epower.GetPNR.OTAReadRQ.ReadRequests.ReadRequest

import scala.collection.JavaConversions._


/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object EPowerAmadeusReadPNRConverter extends Converter[GetPNR, PNRInfoResponse] with EPowerHeader {

  override def toSupplier(baseDto: AnyRef): GetPNR = {
    val pnrRequest = baseDto.asInstanceOf[PNRRequest]
    val getPnr = new GetPNR
    val otaReadRQ = new OTAReadRQ
    val uniqueIdType = new UniqueIDType
    uniqueIdType.setType("Flight")
    uniqueIdType.setIDContext(pnrRequest.pnrRef)
    otaReadRQ.setBookingReferenceID(uniqueIdType)

    val airReadRequest = new ReadRequest
    val person = new PersonName
    person.setSurname(pnrRequest.surname)
    val verificationType = new VerificationType
    verificationType.setPersonName(person)
    airReadRequest.setVerification(verificationType)

    val readRQ = new OTAReadRQ.ReadRequests
    readRQ.getHotelReadRequestOrVehicleReadRequestOrAirReadRequest.add(airReadRequest)
    otaReadRQ.setReadRequests(readRQ)
    getPnr.setOTAReadRQ(otaReadRQ)
    println(StringUtil.classToXmlString(getPnr))
    getPnr
  }

  import AirlineGetter.Implicit._
  import AirportCityGetter.Implicit._

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRInfoResponse = {
    import File._
    implicit val allAirports: Map[String, Airports] = AirportCityGetter.allAirportsMap
    implicit val allAirlines: Map[String, Airlines] = AirlineGetter.allAirlinesMap

    val pnrResponse = response.asInstanceOf[GetPNRResponse]
    println(StringUtil.classToXmlString(pnrResponse))
    if(!Objects.isNull(pnrResponse.getOTAAirBookRS.getAirReservation)) {
      val fareRule = pnrResponse.getOTAAirBookRS.getAirReservation.getFlightRulePenalties.headOption match {
        case Some(rule) => rule.getFareRuleInfo.map { penalty => FareRule(referenceCode = penalty.getFareReference.head.getValue, filingAirline = penalty.getFilingAirline.getCode, marketingAirline = penalty.getMarketingAirline.head.getCode, departureAirport = penalty.getDepartureAirport.getLocationCode, arrivingAirport = penalty.getArrivalAirport.getLocationCode, fareSectionRule = penalty.getFareRules.getSubSection.map(section => FareSectionRule(title = section.getSubTitle, code = section.getSubCode, description = section.getParagraph.head.getText)).toList) }.toList
        case _ => Nil
      }
      pnrResponse.getOTAAirBookRS.getErrorsOrSuccessOrWarnings.map {
        case error: ErrorsType => PNRInfoResponse(error = error.getError.map(er => Error(code = er.getCode, message = er.getShortText)).toList)
        case success: SuccessType => PNRInfoResponse(
          fareRules = fareRule,
          originDestinationWSResponses = EPowerAmadeusItinerarySearchConverter.createAirItineraryWSResponse(pnrResponse.getOTAAirBookRS.getAirReservation.getAirItinerary, Nil),
          pricingInfoWSResponse = {
            val wsprice = pnrResponse.getOTAAirBookRS.getAirReservation.getPriceInfo
            val pricingInfoWSResponse = new PricingInfoWSResponse
            pricingInfoWSResponse.setGdsBaseFare(wsprice.getItinTotalFare.getBaseFare.getAmount)
            pricingInfoWSResponse.setGdsTotalFare(wsprice.getItinTotalFare.getTotalFare.getAmount)
            val fareBreakdown = wsprice.getPTCFareBreakdowns.getPTCFareBreakdown.map(ptcFareBreakDown => FareBreakDown(
              passengerType = PassengerType(code = PassengerCode.fromValue(ptcFareBreakDown.getPassengerTypeQuantity.getCode), quantity = ptcFareBreakDown.getPassengerTypeQuantity.getQuantity),
              passengerFare = PassengerFare(baseFare = ptcFareBreakDown.getPassengerFare.getBaseFare.getAmount,
                totalFare = ptcFareBreakDown.getPassengerFare.getTotalFare.getAmount,
                totalTax = BigDecimal(ptcFareBreakDown.getPassengerFare.getTaxes.getTax.map(_.getAmount.doubleValue()).sum)
              ),
              quantity = ptcFareBreakDown.getPassengerTypeQuantity.getQuantity,
              ptcFareBreakDown.getTicketDesignators.getTicketDesignator.map(
                ticketingDesignator => TicketingRule(code = ticketingDesignator.getTicketDesignatorCode, description = ticketingDesignator.getTicketDesignatorExtension)
              ).toList
            ))
            pricingInfoWSResponse.setPassengerFare(fareBreakdown.toList)
            pricingInfoWSResponse
          },
          pnrRemark = pnrResponse.getOTAAirBookRS.getAirReservation.getPNRRemarks.getPNRRemark.toList.map(pnrRemark => PnrRemark(typez = pnrRemark.getRemarkType, description = pnrRemark.getNote, category = pnrRemark.getRemarkCategory)),
          travelerInfo = if(!pnrResponse.getOTAAirBookRS.isCancel) pnrResponse.getOTAAirBookRS.getAirReservation.getTravelerInfo.getAirTraveler.toList.map(airTraveller => TravelerInfo(eTicketNumber = airTraveller.getETicketDocuments.getETicketInfo.headOption.map(_.getTicketNumber).getOrElse(airTraveller.getETicketNumber.replaceAll(";", "         ")), passenger = Passenger(
            namePrefix = airTraveller.getPersonName.getNamePrefix.headOption.getOrElse(""),
            givenName = airTraveller.getPersonName.getGivenName.headOption.getOrElse(""),
            surname = airTraveller.getPersonName.getSurname,
            middleName = airTraveller.getPersonName.getMiddleName.headOption,
            gender = null,
            emails = airTraveller.getEmail.map(_.getValue).toList,
            code = PassengerCode.fromValue(airTraveller.getPassengerTypeCode)
          ))) else Nil,
          xmlResponse = utils.StringUtil.classToXmlString(pnrResponse),
          status = {
            if (pnrResponse.getOTAAirBookRS.isCancel) Some(dto.BookingStatus.CANCELLED) else if(pnrResponse.getOTAAirBookRS.getAirReservation.getTravelerInfo.getAirTraveler.head.getETicketNumber != null) Some(dto.BookingStatus.TICKET_ISSUED) else Some(dto.BookingStatus.SUCCESS)
          }
        )
        case _: WarningsType => PNRInfoResponse()
      }.head
    } else PNRInfoResponse(hasError = true, error = pnrResponse.getOTAAirBookRS.getErrorsOrSuccessOrWarnings.flatMap(_.asInstanceOf[ErrorsType].getError).map(a => Error(message = a.getShortText)).toList)
  }
}
