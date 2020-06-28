package flight.converter.amadeus.tripxml

import flight.converter.Converter
import flight.dto.entity.{FlightSearchRequest, FlightSearchResponse, ItineraryWSResponse}
import flight.dto.utils.AirlineGetter
import flight.dto.utils.AirlineGetter.Implicit.airlineXML
import flight.invoker.amadeus.utils.{LowFareMatrixRSObjectParser, LowFareMatrixSoapUtils}
import wsimport.lib.amadeus.lowfarematrix.{OTAAirLowFareSearchMatrixRS, WmLowFareMatrixXmlResponse, WsLowFareMatrix}

import scala.collection.JavaConverters._
import scala.collection.JavaConversions._

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 5:59 PM.
  */

object AmadeusItineraryMatrixSearchConverter extends Converter[WmLowFareMatrixXmlResponse, FlightSearchResponse] {

  override def toSupplier(baseDto: AnyRef): WmLowFareMatrixXmlResponse = {
    val flightRequest = baseDto.asInstanceOf[FlightSearchRequest]
    val wmLowFareMatrix: String = new WsLowFareMatrix().getWsLowFareMatrixSoap()
      .wmLowFareMatrixXml(LowFareMatrixSoapUtils.lowFareMatrixSoapMessage(flightRequest).toString())
    val matrixXMLResp = new WmLowFareMatrixXmlResponse()
    matrixXMLResp.setWmLowFareMatrixXmlResult(wmLowFareMatrix)
    println(wmLowFareMatrix)
    matrixXMLResp
  }



  //TODO fix FlightSearchRequest to be passed to the api flight response
  override def fromSupplier(response: AnyRef, request: AnyRef): FlightSearchResponse = {
    val searchMatrixRS = response.asInstanceOf[OTAAirLowFareSearchMatrixRS]
    val searchRequest = request.asInstanceOf[FlightSearchRequest]
    var index = 0
    val itineraryWsResponse: List[ItineraryWSResponse] = {
      val allAirlines = AirlineGetter.allAirlines
      searchMatrixRS.getPricedItineraries.getPricedItinerary.asScala.toList.map { pricedIitinerary =>
        val item = new ItineraryWSResponse()
        item.setSupplier(searchRequest.supplier)
        item.setAirItineraryWSResponse(LowFareMatrixRSObjectParser.createAirItineraryWSResponse(pricedIitinerary.getAirItinerary))
        item.setPricingInfoWSResponse(LowFareMatrixRSObjectParser.createPricingInfoWSResponse(pricedIitinerary.getAirItineraryPricingInfo))
        item.setTicketingInfoWSResponse(LowFareMatrixRSObjectParser.createTicketingInfoWSResponse(pricedIitinerary.getAirItinerary.getOriginDestinationOptions.getOriginDestinationOption.get(0).getFlightSegment.get(0)))
        item.setCacheIndex(index)
        item.setSearchRequest(searchRequest)
        item.setTicketLocale(searchRequest.ticketLocale)
        item.setSalesCategory(searchRequest.salesCategory)
        item.setTicketPolicy(searchRequest.ticketPolicy)
        item.setAirline(allAirlines.find(a => a.airlineCode.equalsIgnoreCase(pricedIitinerary.getAirItinerary.getOriginDestinationOptions.getOriginDestinationOption.head.getFlightSegment.head.getMarketingAirline.getValue)).orNull)
        item.setAirlineCode(pricedIitinerary.getAirItinerary.getOriginDestinationOptions.getOriginDestinationOption.get(0).getFlightSegment.head.getMarketingAirline.getCode)
        index += 1
        item
      }
    }
    FlightSearchResponse(
      pricedItineraryWSResponses = itineraryWsResponse,
      flightSearchRequest = searchRequest
    )
  }

}
