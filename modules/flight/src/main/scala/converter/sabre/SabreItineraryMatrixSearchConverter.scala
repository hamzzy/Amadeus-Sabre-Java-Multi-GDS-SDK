package flight.converter.sabre

import dto.enums._
import flight.converter.Converter
import flight.converter.sabre.SabreItinerarySearchConverter.toPricingItineraryWSResponse
import flight.dto.entity.{FlightSearchRequest, FlightSearchResponse, _}
import flight.invoker.sabre.client.BFMAltDateClient
import utils.StringUtil
import wsimport.lib.sabre.bfm.altdate.{OTAAirLowFareSearchRQ, OTAAirLowFareSearchRS}

import scala.xml.{Elem, XML}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 5:59 PM.
  */

object SabreItineraryMatrixSearchConverter extends BFMAltDateClient with Converter[OTAAirLowFareSearchRQ, FlightSearchResponse] {

  override def toSupplier(baseDto: AnyRef): OTAAirLowFareSearchRQ = {
    val searchRequest = baseDto.asInstanceOf[FlightSearchRequest]
    val oTAAirLowFareSearchRQ = getOTAAirLowFareSearchRQ(searchRequest)
    oTAAirLowFareSearchRQ
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): FlightSearchResponse = {
    val flightSearchRequest = request.asInstanceOf[FlightSearchRequest]
    val itineraries = XML.loadString(StringUtil.classToXmlString(response.asInstanceOf[OTAAirLowFareSearchRS])) \ "PricedItineraries" \\ "PricedItinerary" map { pricedItinerary => toPricingItineraryWSResponse(pricedItinerary, flightSearchRequest)}
    FlightSearchResponse(
      flightSearchRequest = flightSearchRequest,
      pricedItineraryWSResponses = itineraries.toList
    )
  }

}
