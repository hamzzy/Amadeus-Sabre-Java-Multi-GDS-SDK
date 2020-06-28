package flight.converter.amadeus.epower

import java.math.BigInteger
import java.time.ZoneId
import java.util.Date

import flight.converter.Converter
import flight.dto.entity.{Airlines, _}
import flight.dto.utils.{AirlineGetter, CabinGetterJava}
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
object EPowerAmadeusAvailabilityItineraryConverter extends Converter[CheckETicket, SeatAvailabilityStatus] with EPowerHeader {

  override def toSupplier(baseDto: AnyRef): CheckETicket = {
    val bookingRequest = baseDto.asInstanceOf[BookingRequest]
    val checkETicket = new CheckETicket
    checkETicket.setSessionId(bookingRequest.getItineraryWSResponse.getSessionId)
    val otaAirBookRQ = new OTAAirCheckETicketRQ
    val pricedItineraryWSResponseInterface = bookingRequest.getItineraryWSResponse
    otaAirBookRQ.setRecommendationID(pricedItineraryWSResponseInterface.getSequenceNumber.toInt)
    otaAirBookRQ.setCombinationID(pricedItineraryWSResponseInterface.getSelectedCombinationId.toInt)
    val isOneWayCombineable = true
    otaAirBookRQ.setIsOneWayCombinable(isOneWayCombineable)
    checkETicket.setOTAAirCheckETicketRQ(otaAirBookRQ)
    checkETicket
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): SeatAvailabilityStatus = {
    val checkETicketResponse = response.asInstanceOf[CheckETicketResponse]
    val status = if (checkETicketResponse.getOTAAirCheckETicketRS.getErrorsOrSuccess.head.isInstanceOf[SuccessType]) BookingStatus.AVAILABLE else BookingStatus.UNAVAILABLE
    SeatAvailabilityStatus(
      status = status,
      isAvailable = status.equals(BookingStatus.AVAILABLE),
      bookingRequest = request.asInstanceOf[BookingRequest]
    )
  }

}
