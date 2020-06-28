package flight.converter.amadeus.restapi

import java.text.{DecimalFormat, SimpleDateFormat}
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util
import java.util.{Calendar, GregorianCalendar, Locale, TimeZone}

import dto.entity.enums.PassengerCode
import javax.xml.datatype.{DatatypeConstants, DatatypeFactory, XMLGregorianCalendar}
import flight.converter.Converter
import flight.dto.entity.{Airlines, Airports, Baggage, _}
import flight.dto.entity.enums._
import flight.dto.utils._
import utils.StringUtil

import scala.collection.JavaConversions._

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object AmadeusItinerarySearchConverter extends Converter[Object, FlightSearchResponse] with AmadeusSession {

  override def toSupplier(baseDto: AnyRef): Object = {
    val flight = baseDto.asInstanceOf[FlightSearchRequest]

    ???
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): FlightSearchResponse = {
    //    val from = System.currentTimeMillis()
    val searchRS = response.asInstanceOf[String]
    val searchRequest = request.asInstanceOf[FlightSearchRequest]

    ???
  }

}
