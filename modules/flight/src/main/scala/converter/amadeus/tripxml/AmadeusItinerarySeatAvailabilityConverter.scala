package flight.converter.amadeus.tripxml

import dto.BookingStatus
import flight.converter.Converter
import flight.dto.entity.{BookingRequest, SeatAvailabilityStatus}
import utils.StringUtil
import wsimport.lib.amadeus.wsairseatmap._

import scala.collection.JavaConverters._
import scala.collection.JavaConversions._

object AmadeusItinerarySeatAvailabilityConverter extends Converter[OTAAirSeatMapRQ, SeatAvailabilityStatus] {

  override def toSupplier(baseDto: AnyRef): OTAAirSeatMapRQ = {
    val bookingRequest = baseDto.asInstanceOf[BookingRequest]
    val oTAAirSeatMapRQ = new OTAAirSeatMapRQ
    oTAAirSeatMapRQ.setPOS(POSBuilder.createInstance())
    val seatMapRequests = bookingRequest.itineraryWSResponse.airItineraryWSResponse.originDestinationWSResponses.flatMap(_.getFlightSegmentWSResponses).map { segment =>
      val seatMapRequest = new SeatMapRequest
      val flightSegmentInfo = new FlightSegmentInfo
      flightSegmentInfo.setDepartureDateTime(segment.getDepartureDateTime)
      flightSegmentInfo.setFlightNumber(segment.getFlightNumber)

      val departureAirport = new DepartureAirport
      departureAirport.setLocationCode(segment.getDepartureAirportCode)
      flightSegmentInfo.setDepartureAirport(departureAirport)

      val arrivalAirport = new ArrivalAirport
      arrivalAirport.setLocationCode(segment.getArrivalAirportCode)
      flightSegmentInfo.setArrivalAirport(arrivalAirport)

      val marketingAirline = new MarketingAirline
      marketingAirline.setCode(segment.getMarketingAirlineCode)
      flightSegmentInfo.setMarketingAirline(marketingAirline)

      seatMapRequest.setFlightSegmentInfo(flightSegmentInfo)

      val seatDetails = new SeatDetails
      val cabinClass = new CabinClass
      cabinClass.setCabinType(CabinClassCabinType.fromValue(segment.getCabin))
      seatDetails.getCabinClass.add(cabinClass)

      val arrayOfResBookDesignation = new ArrayOfResBookDesignation
      val resBookDesignations = new ResBookDesignation
      resBookDesignations.setResBookDesigCode(segment.getResBookDesigCode)
      arrayOfResBookDesignation.getResBookDesignation.add(resBookDesignations)
      seatDetails.setResBookDesignations(arrayOfResBookDesignation)

      seatMapRequest.setSeatDetails(seatDetails)
      seatMapRequest
    }
    val arrayOfSeatMap = new ArrayOfSeatMapRequest
    arrayOfSeatMap.getSeatMapRequest.addAll(seatMapRequests.asJava)
    oTAAirSeatMapRQ.setSeatMapRequests(arrayOfSeatMap)
    println(StringUtil.classToXmlString(oTAAirSeatMapRQ))
    oTAAirSeatMapRQ
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): SeatAvailabilityStatus = {
    val oTAAirSeatMapRS = response.asInstanceOf[OTAAirSeatMapRS]
    val status = if (oTAAirSeatMapRS.getSuccess != null) BookingStatus.AVAILABLE else BookingStatus.UNAVAILABLE
    SeatAvailabilityStatus(
      status = status,
      isAvailable = status.equals(BookingStatus.AVAILABLE),
      bookingRequest = request.asInstanceOf[BookingRequest]
    )
  }

}
