package flight.converter.amadeus.epower

import java.time.LocalDateTime
import java.util

import wsimport.lib.epower.{AirItineraryType, ArrayOfAirItineraryTypeOriginDestinationOption, OriginDestinationCombinationType}
import wsimport.lib.epower.ArrayOfAirItineraryTypeOriginDestinationOption.OriginDestinationOption
import wsimport.lib.epower.PricedItinerariesType._

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.collection.immutable


/*
  * Igbalajobi Jamiu for ota-ws-integrate
  * 19/12/2018 11:44 PM
  */

object ResultUngrouping {

  def apply(result: List[PricedItinerary]): List[PricedItinerary] = {
    val newResult = new util.LinkedList[(List[OriginDestinationOption], PricedItinerary)]()
    for (pricedItinerary: PricedItinerary <- result) {
      for (originDestinationCombination <- pricedItinerary.getAirItinerary.getOriginDestinationCombinations.getOriginDestinationCombination) {
        val newItm = originDestinationCombination.getIndexList.split(";").zipWithIndex.flatMap { tuple =>
          val (refNumber, direction) = tuple
          pricedItinerary.getAirItinerary.getOriginDestinationOptions.getOriginDestinationOption.filter(a => (a.getRefNumber.toString equals refNumber) && (a.getDirectionId == direction)).toList
        }.toList.sortBy(_.getDirectionId)
        newResult.add((newItm, pricedItinerary))
      }
    }
    newResult.toList.map { item =>
      val pricedItinerary = item._2
      val airItineraryType = pricedItinerary.getAirItinerary
      val arrayOfAirItineraryTypeOriginDestinationOption = new ArrayOfAirItineraryTypeOriginDestinationOption
      arrayOfAirItineraryTypeOriginDestinationOption.setOriginDestinationOption(item._1)
      airItineraryType.setOriginDestinationOptions(arrayOfAirItineraryTypeOriginDestinationOption)
      pricedItinerary.setAirItinerary(airItineraryType)
      pricedItinerary
    }
  }

}

