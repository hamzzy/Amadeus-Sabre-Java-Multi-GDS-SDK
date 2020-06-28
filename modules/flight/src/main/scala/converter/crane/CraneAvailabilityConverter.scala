package flight.converter.crane

import java.math.BigInteger
import java.time.ZoneId
import java.util.Date

import flight.converter.Converter
import flight.dto.entity.{Airlines, _}

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import dto.BookingStatus
import dto.entity.enums.{Gender, PassengerCode}
import flight.converter.crane.pojo.CraneAvailabilityFlight

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object CraneAvailabilityConverter extends Converter[CraneAvailabilityFlight, SeatAvailabilityStatus] {

  override def toSupplier(baseDto: AnyRef): CraneAvailabilityFlight = {
    val bookingRequest = baseDto.asInstanceOf[BookingRequest]

    CraneAvailabilityFlight()
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): SeatAvailabilityStatus = {
    val bookingRequest = request.asInstanceOf[BookingRequest]
    val otaBookRS = response.asInstanceOf[String]
//    pnrDetails.setResponseXml(StringUtil.classToXmlString(otaBookRS))
//    pnrDetails.setBookingRequest(bookingRequest)
//    pnrDetails.setGdsPlainResponse(otaBookRS)

    SeatAvailabilityStatus(isAvailable = true, status = "", bookingRequest = bookingRequest)
  }


}
