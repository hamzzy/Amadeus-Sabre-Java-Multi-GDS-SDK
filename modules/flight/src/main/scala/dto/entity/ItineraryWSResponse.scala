package flight.dto.entity

import java.util.Objects

import flight.dto.entity.enums._
import javax.xml.datatype.XMLGregorianCalendar

import scala.beans.BeanProperty

class ItineraryWSResponse extends BaseDto {
  @BeanProperty var airItineraryWSResponse: AirItineraryWSResponse = new AirItineraryWSResponse
  @BeanProperty var pricingInfoWSResponse: PricingInfoWSResponse = new PricingInfoWSResponse
  @BeanProperty var owcPricesInfoWSResponses: List[PricingInfoWSResponse] = Nil
  @BeanProperty var owcPricesInfoWSResponsesOptions: List[OWCPriceInfo] = Nil
  @BeanProperty var ticketingInfoWSResponse:TicketingInfoWSResponse = TicketingInfoWSResponse()
  @BeanProperty var scheduleChangePref:Seq[Map[String, Map[String, String]]] = Seq.empty
  @BeanProperty var airline: Airlines = Airlines()
  @BeanProperty var airlineCode: String = EMPTY_STRING
  /*
   * Use by crane
   */
  @BeanProperty var resBookDesigCode: String = EMPTY_STRING
  @BeanProperty var resBookDesigQuantity: String = EMPTY_STRING

  @BeanProperty var direction = 0
  @BeanProperty var cabin: String = EMPTY_STRING
  @BeanProperty var cacheIndex: Integer = 0
  @BeanProperty var supplier: String = EMPTY_STRING
  @BeanProperty var ticketPolicy: TicketPolicy = TicketPolicy.SITI
  @BeanProperty var salesCategory: String = EMPTY_STRING
  @BeanProperty var ticketLocale: String = EMPTY_STRING
  @BeanProperty var oneWayCombinable = false
  @BeanProperty var searchRequest:FlightSearchRequest = FlightSearchRequest()
  @BeanProperty var ref: String = EMPTY_STRING
  @BeanProperty var sessionId: String = EMPTY_STRING
  @BeanProperty var sequenceNumber: String = EMPTY_STRING
  @BeanProperty var selectedCombinationId: String = EMPTY_STRING

  override def toString: String = "ItineraryWSResponse{airItineraryWSResponse=" + this.airItineraryWSResponse + ", pricingInfoWSResponse=" + this.pricingInfoWSResponse + ", ticketingInfoWSResponse=" + this.ticketingInfoWSResponse + '}'
  override def equals(`object`: Any): Boolean = if (`object` == null || !`object`.getClass.isInstance(classOf[ItineraryWSResponse])) false
  else {
    val obj = `object`.asInstanceOf[ItineraryWSResponse]
    Objects.equals(this.airItineraryWSResponse, obj.getAirItineraryWSResponse) && Objects.equals(this.pricingInfoWSResponse, obj.getPricingInfoWSResponse) && Objects.equals(this.ticketingInfoWSResponse, obj.getTicketingInfoWSResponse)
  }
  override def hashCode: Int = Objects.hash(Array[AnyRef](this.airItineraryWSResponse, this.pricingInfoWSResponse, this.ticketingInfoWSResponse))
}

case class OWCPriceInfo(cabin: String, pricingInfoWSResponse: PricingInfoWSResponse)