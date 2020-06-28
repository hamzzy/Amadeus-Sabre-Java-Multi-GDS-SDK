package flight.http.impl

import com.google.inject.ImplementedBy
import flight.dto.entity._
import flight.dto.utils.AirportCityGetter
import flightdto.entity.PNRTransferResponse

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by
  * Igbalajobi Jamiu O. on 15/05/2016 9:36 AM.
  */
@ImplementedBy(classOf[FlightServicesImpl])
trait FlightServicesAPI {

  /*
   * Get Airline
   */
  def getAirline(code: String): Option[Airlines]

  /*
   * Get Airports by specifying any search keyword
   */
  def searchAirports(param: String): Seq[Airports]

  /*
   * Get Airports by specifying IATA airport code
   */
  def getAirports(code: String): Seq[Airports]

  /*
   * Get Exchange rate available by the airline.
   */
  def getGDSExchangeRateAsync(exchangeRateRequest: ExchangeRateRequest)(implicit executionContext: ExecutionContext): Future[ExchangeRateResponse]
  def getGDSExchangeRate(exchangeRateRequest: ExchangeRateRequest): ExchangeRateResponse

  /*
   * Search `lowfare` flights.
   *
   */
  def searchFlightAsync(flightSearchRequest: FlightSearchRequest)(implicit exec: ExecutionContext): Future[FlightSearchResponse]
  def searchFlight(flightSearchRequest: FlightSearchRequest): FlightSearchResponse

  /*
   * Search `lowfare` flights.
   * API can also return a +/- flexible dates.
   *
   */
  def searchFlightMatrixAsync(flightSearchRequest: FlightSearchRequest)(implicit exec: ExecutionContext): Future[FlightSearchResponse]
  def searchFlightMatrix(flightSearchRequest: FlightSearchRequest): FlightSearchResponse

  /* Get flight information from the Implemented API.
   * Information about the selected flight will be displayed to the user.
   */
  def getFlightRulesAsync(flightInfoRequest: FlightInfoRequest)(implicit exec: ExecutionContext): Future[FareRuleResponse]
  def getFlightRules(flightInfoRequest: FlightInfoRequest): FareRuleResponse

  /* Get APIS of a specific flight information
   *
   */
  def getAPISRulesAsync(flightInfoRequest: FlightInfoRequest)(implicit exec: ExecutionContext): Future[APIFieldInfo]
  def getAPISRules(flightInfoRequest: FlightInfoRequest):APIFieldInfo

  /*
   * Check Customer selected flight itinerary. Confirm if booking is available.
   * This also check for price changes and others.
   */
  def checkAvailabilityAsync(flightAvailabilityRequest: FlightAvailabilityRequest)(implicit exec: ExecutionContext): Future[SeatAvailabilityStatus]
  def checkAvailability(flightAvailabilityRequest: FlightAvailabilityRequest): SeatAvailabilityStatus

  /*
   * Return the PNR Details for the booking Itinerary.
   */
  def createPNRAsync(bookingRequest: BookingRequest)(implicit exec: ExecutionContext): Future[PNRDetails]
  def createPNR(bookingRequest: BookingRequest): PNRDetails

  /*
   * Issue Booking PNR
   * API Issue a PNR. Information retrieve is valid such that customer
   * can fly with the airline
   */
  def issuePNRAsync(issueRequest: PNRIssueTicketRequest)(implicit exec: ExecutionContext): Future[PNRIssueTicketResponse]
  def issuePNR(issueRequest: PNRIssueTicketRequest): PNRIssueTicketResponse

  /*
   * Void Booking PNR
   * API void a ticket. The void can be successful if only the ticketed has been 'issuedPNR'
   */
  def voidPNRAsync(supplierId: String, ticketNumbers: Seq[String])(implicit exec: ExecutionContext): Future[VoidTicketResponse]
  def voidPNR(supplierId: String, ticketNumbers: Seq[String]): VoidTicketResponse

  /*
   * Cancel Generated PNRs.
   * The API Cancel the Flight Reservation on the GDS.
   */
  def cancelPNRAsync(pnrRefId: PNRRequest)(implicit exec: ExecutionContext): Future[PNRDetails]
  def cancelPNR(pnrRefId: PNRRequest): PNRDetails

  /*
   * Retrieve PNR information
   * Query the GDS to retrieve booking PNR information
   */
  def readPNRAsync(pnrRefId: PNRRequest)(implicit exec: ExecutionContext): Future[PNRInfoResponse]
  def readPNR(pnrRefId: PNRRequest): PNRInfoResponse

  /*
   * Sign-out the Session/TokenID created by the WS API of the GDS.
   */
  def closeSessionAsync(sessionId: String, supplier: String)(implicit exec: ExecutionContext): Future[Boolean]
  def closeSession(sessionId: String, supplier: String): Boolean

  /*
   * The Transfer Ownership method allows users to change the ownership
   * of a reservation (PNR) from one pseudo city code to another.
   */
//  def pnrTransferOwnership(supplier: PNRTransferRequest)(implicit exec: ExecutionContext): Future[PNRTransferResponse]
}
