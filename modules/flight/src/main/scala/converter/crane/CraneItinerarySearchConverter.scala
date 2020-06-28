package flight.converter.crane

import java.util.{Objects, UUID}

import com.google.common.base.Strings
import com.typesafe.config.ConfigFactory
import flight.converter.Converter
import flight.converter.crane.pojo._
import flight.dto.entity.{Airlines, Airports, Baggage, ItineraryWSResponse, _}
import flight.dto.utils.{AirlineGetter, AirportCityGetter, AirportDAO}
import services.ExecutorTrait

import scala.util.Try
import scala.xml.{Node, NodeSeq, XML}

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object CraneItinerarySearchConverter extends Converter[CraneSearchFlight, FlightSearchResponse] with ExecutorTrait {

  override def toSupplier(baseDto: AnyRef): CraneSearchFlight = {
    val craneHeader: CraneHeader = CraneHeaderBuilder.createInstance
    val flight = baseDto.asInstanceOf[FlightSearchRequest]
    CraneSearchFlight(
      craneHeader = craneHeader,
      originDestinations = flight.originDestinationRequests.toVector.map(od => CraneOriginDestination(origin = od.origin.airCode, destination = od.destination.airCode, departingDate = od.departureDateTime)),
      travellers = CraneTraveller(adultCount = flight.adultCount, childCount = flight.childCount, infantCount = flight.infantCount)
    )
  }


  override def fromSupplier(response: AnyRef, request: AnyRef): FlightSearchResponse = {
    import AirportCityGetter.Implicit.File._
    implicit val allAirports: Map[String, Airports] = AirportCityGetter.allAirportsMap
    FlightSearchResponse(
      flightSearchRequest = request.asInstanceOf[FlightSearchRequest],
      connectionItineraryResponses = createItineraryResponse(response.asInstanceOf[String], request.asInstanceOf[FlightSearchRequest])
    )
  }

  private[this] def createItineraryResponse(resp: String, requ: FlightSearchRequest)(implicit airports: Map[String, Airports]): List[ConnectionFlightItineraryResponse] = {
    val xml = XML.loadString(resp)
    (xml \ "Body" \ "GetAvailabilityResponse" \ "Availability" \ "availabilityResultList" \\ "availabilityRouteList").zipWithIndex.map { tuple =>
      val (node, index) = tuple
      ConnectionFlightItineraryResponse(
        departure = airports.getOrElse((node \ "routeInfo" \\ "locationCodeList") (index) \ "locationCode" text, Airports()),
        arrival = airports.getOrElse((node \ "routeInfo" \\ "locationCodeList") (index) \ "locationCode" text, Airports()),
        itineraryWSResponse = (node \ "availabilityByDateList" \\ "originDestinationOptionList").toList.map { originDestinationOptionList =>
          val fareInfoXML = node \ "fareComponentGroupList" \ "fareComponentList" \ "passengerFareInfoList" \ "fareInfoList"

          val airItineraryWSResponse = createAirItineraryWSResponse(originDestinationOptionList)
          val itineraryWSResponse = new ItineraryWSResponse
          itineraryWSResponse.setAirItineraryWSResponse(airItineraryWSResponse)
          itineraryWSResponse.setAirline(airItineraryWSResponse.originDestinationWSResponses.head.getMarketingAirline)
          itineraryWSResponse.setAirlineCode(airItineraryWSResponse.originDestinationWSResponses.head.getMarketingAirlineCode)
          itineraryWSResponse.setTicketLocale(requ.ticketLocale)
          itineraryWSResponse.setCabin(airItineraryWSResponse.originDestinationWSResponses.head.getCabin)
          //          itineraryWSResponse.setResBookDesigCode(airItineraryWSResponse.originDestinationWSResponses.head.getResBookDesigCode)
          //          itineraryWSResponse.setResBookDesigQuantity(airItineraryWSResponse.originDestinationWSResponses.head.getSeatAvailable)
          val sessionId = s"${fareInfoXML \ "cabinClassCode" text}|${fareInfoXML \ "fareGroupName" text}|${fareInfoXML \ "fareReferenceCode" text}|${fareInfoXML \ "fareReferenceID" text}|${fareInfoXML \ "fareReferenceName" text}|${fareInfoXML \ "flightSegmentSequence" text}|${fareInfoXML \ "resBookDesigCode" text}"
          itineraryWSResponse.setSessionId(sessionId)
          val items = createPricingInfoWSResponse(originDestinationOptionList).sortWith((a, b) => a.totalFare < b.totalFare)
          itineraryWSResponse.setOwcPricesInfoWSResponses(items)


          var map = List[OWCPriceInfo]()
          if (items.exists(a => a.cabin.equals("ECONOMY") && !a.getResBookDesigQuantity.equals("0"))) map ::= items.find(a => a.cabin.equals("ECONOMY") && !a.getResBookDesigQuantity.equals("0")).map(a => OWCPriceInfo(a.cabin, a)).get
          if (items.exists(a => a.cabin.equals("BUSINESS") && !a.getResBookDesigQuantity.equals("0"))) map ::= items.find(a => a.cabin.equals("BUSINESS") && !a.getResBookDesigQuantity.equals("0")).map(a => OWCPriceInfo(a.cabin, a)).get
          itineraryWSResponse.setOwcPricesInfoWSResponsesOptions(map)

          itineraryWSResponse.setOwcPricesInfoWSResponses(items)
          itineraryWSResponse.setRef(s"${UUID.randomUUID().toString}${requ.tabHash}")
          itineraryWSResponse
        }
      )
    }.toList
  }

  private[this] def createPricingInfoWSResponse(node: Node): List[PricingInfoWSResponse] = {
    (node \ "fareComponentGroupList" \\ "fareComponentList").zipWithIndex.map { tuple =>
      val (item, index) = tuple
      val pricingInfoXML = item \ "pricingOverview"
      val pricingInfoWSResponse = new PricingInfoWSResponse

      val serviceMU = ConfigFactory.load().getDouble("crane.supplier.serviceMU")
      pricingInfoWSResponse.setBaseFare(BaseFare(amount = BigDecimal((pricingInfoXML \ "totalBaseFare" \\ "value" head) text).doubleValue() + serviceMU, currencyCode = pricingInfoXML \ "totalBaseFare" \ "currency" \ "code" text))
      pricingInfoWSResponse.setGdsBaseFare(BigDecimal((pricingInfoXML \ "totalBaseFare" \\ "value" head) text))
      pricingInfoWSResponse.setOldGdsBaseFare(BigDecimal((pricingInfoXML \ "totalBaseFare" \\ "value" head) text))
      pricingInfoWSResponse.setSubCharges(BigDecimal((pricingInfoXML \ "totalSurcharge" \\ "value" head) text))

      val taxes = List(
        TaxFare(amount = BigDecimal((pricingInfoXML \ "totalTax" \\ "value" head) text).doubleValue(), currency = pricingInfoXML \ "totalTax" \ "currency" \ "code" text),
        TaxFare(amount = BigDecimal((pricingInfoXML \ "equivTotalAmountList" \\ "value" head) text).doubleValue(), currency = pricingInfoXML \ "equivTotalAmountList" \ "currency" \ "code" text),
        TaxFare(amount = BigDecimal((pricingInfoXML \ "totalOtherFee" \\ "value" head) text).doubleValue(), currency = pricingInfoXML \ "totalOtherFee" \ "currency" \ "code" text),
        TaxFare(amount = BigDecimal((pricingInfoXML \ "totalServiceCharge" \\ "value" head) text).doubleValue(), currency = pricingInfoXML \ "totalServiceCharge" \ "currency" \ "code" text)
      )
      pricingInfoWSResponse.setTotalTax(taxes)

      pricingInfoWSResponse.setGdsTaxFare(taxes.map(_.amount).sum)
      pricingInfoWSResponse.setOldGdsTaxFare(taxes.map(_.amount).sum)
      val totalAmount = BigDecimal((pricingInfoXML \ "totalAmount" \\ "value").head text).doubleValue() + serviceMU
      pricingInfoWSResponse.setTotalFare(totalAmount)
      pricingInfoWSResponse.setCurrencyCode(pricingInfoXML \ "totalAmount" \ "currency" \ "code" text)
      (item \ "passengerFareInfoList" \\ "fareInfoList").headOption match {
        case Some(fareInfoListXML) => {
//          println((node \ "fareComponentGroupList" \ "boundList" \ "availFlightSegmentList" \\ "bookingClassList").size)
//          println(index)
          val bookingClassList = Try((node \ "fareComponentGroupList" \ "boundList" \ "availFlightSegmentList" \\ "bookingClassList") (index)).getOrElse((node \ "fareComponentGroupList" \ "boundList" \ "availFlightSegmentList" \\ "bookingClassList").last)
          pricingInfoWSResponse.setRef(s"${UUID.randomUUID().toString}")
          pricingInfoWSResponse.setCabin(bookingClassList \ "cabin" text)
          pricingInfoWSResponse.setResBookDesigQuantity(bookingClassList \ "resBookDesigQuantity" text)
          pricingInfoWSResponse.setResBookDesigCode(fareInfoListXML \ "resBookDesigCode" text)
          pricingInfoWSResponse.setCabinClassCode(fareInfoListXML \ "cabinClassCode" text)
          pricingInfoWSResponse.setFareGroupName(fareInfoListXML \ "fareGroupName" text)
          pricingInfoWSResponse.setFareReferenceCode(fareInfoListXML \ "fareReferenceCode" text)
          pricingInfoWSResponse.setFareReferenceID(fareInfoListXML \ "fareReferenceID" text)
          pricingInfoWSResponse.setFareReferenceName(fareInfoListXML \ "fareReferenceName" text)
          pricingInfoWSResponse.setFlightSegmentSequence(fareInfoListXML \ "flightSegmentSequence" text)
        }
        case _ =>
      }
      pricingInfoWSResponse
    }.toList
  }

  private[this] def createAirItineraryWSResponse(node: Node)(implicit airports: Map[String, Airports]): AirItineraryWSResponse = AirItineraryWSResponse(
    originDestinationWSResponses = createOriginDestinationWSResponse(node),
    directionIndicator = (node \ "fareComponentGroupList" \ "boundList" \ "boundCode") text
  )


  private[this] def createOriginDestinationWSResponse(segmentNode: Node)(implicit airports: Map[String, Airports]): List[OriginDestinationWSResponse] = segmentNode.toList.map { node =>
    val node = (segmentNode \ "fareComponentGroupList" \\ "boundList").flatMap(_ \ "availFlightSegmentList" \ "flightSegment")
    val originDestinationWSResponse = new OriginDestinationWSResponse()
    originDestinationWSResponse.setSegmentsXml(node.toString())
    originDestinationWSResponse.setFlightNote(Option(node \ "remark" text).getOrElse(node \ "airline" \ "companyFullName" text))
    originDestinationWSResponse.setFlightNumber(node \ "flightNumber" text)
    originDestinationWSResponse.setEquipmentName(node \ "equipment" \ "airEquipType" text)

    (segmentNode \ "fareComponentGroupList" \ "boundList" \ "availFlightSegmentList" \\ "bookingClassList").headOption match {
      case Some(x) =>
        originDestinationWSResponse.setCabin(x \ "cabin" text)
        originDestinationWSResponse.setSeatAvailable(x \ "resBookDesigQuantity" text)
        originDestinationWSResponse.setResBookDesigCode(x \ "resBookDesigCode" text)
      case _ =>
    }
    originDestinationWSResponse.setDepartureDateTime(node \ "departureDateTime" text)
    originDestinationWSResponse.setArrivalDateTime(node \ "arrivalDateTime" text)
    originDestinationWSResponse.setMarketingAirline(Airlines(airlineCode = node \ "airline" \ "code" text, name = node \ "airline" \ "companyFullName" text))

    originDestinationWSResponse.setOriginAirport(airports.getOrElse((node \ "departureAirport" \ "locationCode").text, Airports()).airportName)
    originDestinationWSResponse.setOriginAirportTbl(airports.getOrElse((node \ "departureAirport" \ "locationCode").text, Airports()))
    originDestinationWSResponse.setOriginAirportCode((node \ "departureAirport" \ "locationCode").text)

    originDestinationWSResponse.setDestinationAirport(airports.getOrElse((node \ "arrivalAirport" \ "locationCode").text, Airports()).airportName)
    originDestinationWSResponse.setDestinationAirportTbl(airports.getOrElse((node \ "arrivalAirport" \ "locationCode").text, Airports()))
    originDestinationWSResponse.setDestinationAirportCode((node \ "arrivalAirport" \ "locationCode").text)

    originDestinationWSResponse.setFlightSegmentWSResponses(createFlightSegmentWSResponse(node))

    //    originDestinationWSResponse.setDirectionId(directionId)
    originDestinationWSResponse
  }

  private def createFlightSegmentWSResponse(xml: NodeSeq)(implicit airports: Map[String, Airports]): List[FlightSegmentWSResponse] = xml.toList.zipWithIndex.map { tuple =>
    val (node, index) = tuple
    val flightSegmentWSResponse = new FlightSegmentWSResponse
    flightSegmentWSResponse.setFlightNumber(node \ "flightNumber" text)
    flightSegmentWSResponse.setDepartureAirport(airports.getOrElse((node \ "departureAirport" \ "locationCode").text, Airports()).airportName)
    flightSegmentWSResponse.setDepartureAirportTbl(airports.getOrElse((node \ "departureAirport" \ "locationCode").text, Airports()))
    flightSegmentWSResponse.setDepartureAirportCode((node \ "departureAirport" \ "locationCode").text)

    flightSegmentWSResponse.setArrivalAirport(airports.getOrElse((node \ "arrivalAirport" \ "locationCode").text, Airports()).airportName)
    flightSegmentWSResponse.setArrivalAirportTbl(airports.getOrElse((node \ "arrivalAirport" \ "locationCode").text, Airports()))
    flightSegmentWSResponse.setArrivalAirportCode((node \ "arrivalAirport" \ "locationCode").text)

    flightSegmentWSResponse.setRPH((index + 1).toString)
    flightSegmentWSResponse.setDepartureTimeZone(node \ "departureDateTimeUTC" text)
    flightSegmentWSResponse.setArrivalTimeZone(node \ "arrivalDateTimeUTC" text)

    flightSegmentWSResponse.setDepartureDateTime(node \ "departureDateTime" text)
    flightSegmentWSResponse.setArrivalDateTime(node \ "arrivalDateTime" text)
    flightSegmentWSResponse.setStopQuantity((node \ "stopQuantity").text toInt)

    flightSegmentWSResponse.setETicketEligible(!(node \ "ticketType").text.equals("PAPER"))
    flightSegmentWSResponse.setDuration(node \ "journeyDuration" text)
    flightSegmentWSResponse.setSector(node \ "sector" text)
    flightSegmentWSResponse.setFlightSegmentId(node \ "flightSegmentID" text)

    flightSegmentWSResponse.setAirEquipType(node \ "equipment" \ "airEquipType" text)

    flightSegmentWSResponse
  }
}
