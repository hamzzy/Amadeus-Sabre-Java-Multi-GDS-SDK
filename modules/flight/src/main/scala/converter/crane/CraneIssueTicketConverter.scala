package flight.converter.crane

import java.math.BigInteger
import java.time.ZoneId
import java.util.{Date, Objects}

import com.google.common.base.Strings
import flight.converter.Converter
import flight.dto.entity.{Airlines, _}
import wsimport.lib.epower.BookFlight.OTAAirBookRQ
import wsimport.lib.epower.TravelerInfoType.AirTraveler
import wsimport.lib.epower._

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import wsimport.lib.epower.TicketType
import dto.BookingStatus
import dto.entity.enums.{Gender, PassengerCode}
import flight.converter.crane.pojo._

import scala.util.Random
import scala.xml.XML

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object CraneIssueTicketConverter extends Converter[CraneIssueTicket, PNRIssueTicketResponse] {

  override def toSupplier(baseDto: AnyRef): CraneIssueTicket = {
    val issueTicketRequest = baseDto.asInstanceOf[PNRIssueTicketRequest]
    val craneHeader: CraneHeader = CraneHeaderBuilder.createInstance
    CraneIssueTicket(
      craneHeader = craneHeader,
      pnrRef = issueTicketRequest.pnrRef,
      amount = issueTicketRequest.amount
    )
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRIssueTicketResponse = {
    val otaBookRS = response.asInstanceOf[String]
    println(otaBookRS)
    val ticketNo = (XML.loadString(otaBookRS) \ "Body" \ "TicketReservationResponse" \ "AirTicketReservationResponse" \ "airBookingList" \ "ticketInfo" \ "ticketItemList" \ "conjunctiveTicketList" \ "ticketNumber").text
    PNRIssueTicketResponse(
      status = dto.BookingStatus.TICKET_ISSUED,
      craneTicketNo = ticketNo
    )
  }

}
