package flight.http.impl

import flight.dto.entity.ExchangeRateResponse
import javax.inject.{Inject, Singleton}
import dto.enums.Supplier
import flight.dto.entity._
import flight.dto.utils.{AirlineGetter, AirportCityGetter}

import scala.concurrent.{ExecutionContext, Future}
import flight.dto.utils.AirportCityGetter.Implicit._
import flight.dto.utils.AirlineGetter.Implicit._

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 3:26 PM.
  */
@Singleton
class FlightServicesImpl @Inject()(converterServices: FlightConverterService, invokerServices: FlightInvokerService) extends FlightServicesAPI {

  import flight.dto.utils.AirportCityGetter.Implicit.File._

  override def getAirline(code: String): Option[Airlines] = AirlineGetter.getAirlineByCode(code)

  override def searchAirports(param: String): Seq[Airports] = AirportCityGetter.getAirportsByCityCode(param)

  override def getAirports(code: String): Seq[Airports] = AirportCityGetter.getAirportsByCityCode(code)

  override def getGDSExchangeRate(exchangeRateRequest: ExchangeRateRequest): ExchangeRateResponse = {
    val converterObj = converterServices.getGDSExchangeRateInstance(exchangeRateRequest.supplier)
    val invokerObj = invokerServices.getGDSExchangeRateInstance(supplierId = exchangeRateRequest.supplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(exchangeRateRequest))
    converterObj.fromSupplier(invoked, exchangeRateRequest)
  }

  override def getGDSExchangeRateAsync(exchangeRateRequest: ExchangeRateRequest)(implicit executionContext: ExecutionContext): Future[ExchangeRateResponse] = for {
    converterObj <- Future(converterServices.getGDSExchangeRateInstance(exchangeRateRequest.supplier))
    invokerObj <- Future(invokerServices.getGDSExchangeRateInstance(supplierId = exchangeRateRequest.supplier))
    invoked <- invokerObj.invokeAsync(converterObj.toSupplier(exchangeRateRequest))
    result <- Future(converterObj.fromSupplier(invoked, exchangeRateRequest))
  } yield result

  override def searchFlight(flightSearchRequest: FlightSearchRequest): FlightSearchResponse = {
    val converterObj = converterServices.getSearchInstance(flightSearchRequest.supplier)
    val invokerObj = invokerServices.getSearchInstance(supplierId = flightSearchRequest.supplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(flightSearchRequest))
    converterObj.fromSupplier(invoked, flightSearchRequest)
  }

  override def searchFlightAsync(flightSearchRequest: FlightSearchRequest)(implicit exec: ExecutionContext): Future[FlightSearchResponse] = for {
    converterObj <- Future(converterServices.getSearchInstance(flightSearchRequest.supplier))
    invokerObj <- Future(invokerServices.getSearchInstance(supplierId = flightSearchRequest.supplier))
    result <- invokerObj.invokeAsync(converterObj.toSupplier(flightSearchRequest)).map(httpResponse => converterObj.fromSupplier(httpResponse, flightSearchRequest))
  } yield result

  override def searchFlightMatrix(flightSearchRequest: FlightSearchRequest): FlightSearchResponse = {
    val converterObj = converterServices.getSearchMatrixInstance(flightSearchRequest.supplier)
    val invokerObj = invokerServices.getSearchMatrixInstance(supplierId = flightSearchRequest.supplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(flightSearchRequest))
    converterObj.fromSupplier(invoked, flightSearchRequest)
  }

  override def searchFlightMatrixAsync(flightSearchRequest: FlightSearchRequest)(implicit exec: ExecutionContext): Future[FlightSearchResponse] = for {
    converterObj <- Future(converterServices.getSearchMatrixInstance(flightSearchRequest.supplier))
    invokerObj <- Future(invokerServices.getSearchMatrixInstance(supplierId = flightSearchRequest.supplier))
    result <- invokerObj.invokeAsync(converterObj.toSupplier(flightSearchRequest)).map(httpResponse => converterObj.fromSupplier(httpResponse, flightSearchRequest))
  } yield result

  override def getFlightRules(flightInfoRequest: FlightInfoRequest): FareRuleResponse = {
    val converterObj = converterServices.getFareRulesInstance(flightInfoRequest.itineraryWSResponse.getSupplier)
    val invokerObj = invokerServices.getFareRulesInstance(supplierId = flightInfoRequest.itineraryWSResponse.getSupplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(flightInfoRequest))
    converterObj.fromSupplier(invoked, flightInfoRequest)
  }

  override def getFlightRulesAsync(flightInfoRequest: FlightInfoRequest)(implicit exec: ExecutionContext): Future[FareRuleResponse] = for {
    converterObj <- Future(converterServices.getFareRulesInstance(flightInfoRequest.itineraryWSResponse.getSupplier))
    invokerObj <- Future(invokerServices.getFareRulesInstance(supplierId = flightInfoRequest.itineraryWSResponse.getSupplier))
    invoked <- invokerObj.invokeAsync(converterObj.toSupplier(flightInfoRequest))
    converted <- Future.successful(converterObj.fromSupplier(invoked, flightInfoRequest))
  } yield converted

  override def getAPISRules(flightInfoRequest: FlightInfoRequest): APIFieldInfo = {
    val converterObj = converterServices.getAPISInfoInstance(flightInfoRequest.itineraryWSResponse.getSupplier)
    val invokerObj = invokerServices.getAPISInfoInstance(supplierId = flightInfoRequest.itineraryWSResponse.getSupplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(flightInfoRequest))
    converterObj.fromSupplier(invoked, flightInfoRequest)
  }

  override def getAPISRulesAsync(flightInfoRequest: FlightInfoRequest)(implicit exec: ExecutionContext): Future[APIFieldInfo] = for {
    converterObj <- Future(converterServices.getAPISInfoInstance(flightInfoRequest.itineraryWSResponse.getSupplier))
    invokerObj <- Future(invokerServices.getAPISInfoInstance(supplierId = flightInfoRequest.itineraryWSResponse.getSupplier))
    invoked <- invokerObj.invokeAsync(converterObj.toSupplier(flightInfoRequest))
    converted <- Future.successful(converterObj.fromSupplier(invoked, flightInfoRequest))
  } yield converted

  override def checkAvailability(flightAvailabilityRequest: FlightAvailabilityRequest): SeatAvailabilityStatus = {
    val converterObj = converterServices.getAvailabilityInstance(flightAvailabilityRequest.bookingRequest.getSupplier)
    val invokerObj = invokerServices.getAvailabilityInstance(supplierId = flightAvailabilityRequest.bookingRequest.getSupplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(flightAvailabilityRequest.bookingRequest))
    converterObj.fromSupplier(invoked, flightAvailabilityRequest.bookingRequest)
  }

  override def checkAvailabilityAsync(flightAvailabilityRequest: FlightAvailabilityRequest)(implicit exec: ExecutionContext): Future[SeatAvailabilityStatus] = for {
    converterObj <- Future(converterServices.getAvailabilityInstance(flightAvailabilityRequest.bookingRequest.getSupplier))
    invokerObj <- Future(invokerServices.getAvailabilityInstance(supplierId = flightAvailabilityRequest.bookingRequest.getSupplier))
    invoked <- invokerObj.invokeAsync(converterObj.toSupplier(flightAvailabilityRequest.bookingRequest))
    converted <- Future.successful(converterObj.fromSupplier(invoked, flightAvailabilityRequest.bookingRequest))
  } yield converted

  override def createPNR(bookingRequest: BookingRequest): PNRDetails = {
    val converterObj = converterServices.getBookingInstance(bookingRequest.getSupplier)
    val invokerObj = invokerServices.getBookingInstance(supplierId = bookingRequest.getSupplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(bookingRequest))
    converterObj.fromSupplier(invoked, bookingRequest)
  }

  override def createPNRAsync(bookingRequest: BookingRequest)(implicit exec: ExecutionContext): Future[PNRDetails] = for {
    converterObj <- Future(converterServices.getBookingInstance(bookingRequest.getSupplier))
    invokerObj <- Future(invokerServices.getBookingInstance(supplierId = bookingRequest.getSupplier))
    result <- invokerObj.invokeAsync(converterObj.toSupplier(bookingRequest)).map(httpResponse => converterObj.fromSupplier(httpResponse, bookingRequest))
  } yield result

  override def issuePNR(issueRequest: PNRIssueTicketRequest): PNRIssueTicketResponse = {
    val converterObj = converterServices.getIssueTicketInstance(issueRequest.supplier)
    val invokerObj = invokerServices.getIssueTicketInstance(issueRequest.supplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(issueRequest))
    converterObj.fromSupplier(invoked, issueRequest)
  }

  override def issuePNRAsync(issueRequest: PNRIssueTicketRequest)(implicit exec: ExecutionContext): Future[PNRIssueTicketResponse] = for {
    converterObj <- Future(converterServices.getIssueTicketInstance(issueRequest.supplier))
    invokerObj <- Future(invokerServices.getIssueTicketInstance(issueRequest.supplier))
    invoked <- invokerObj.invokeAsync(converterObj.toSupplier(issueRequest))
    result <- Future.successful(converterObj.fromSupplier(invoked, issueRequest))
  } yield result

  override def voidPNR(supplier: String, ticketNumbers: Seq[String]): VoidTicketResponse = {
    val converterObj = converterServices.getVoidTicketInstance(supplier)
    val invokerObj = invokerServices.getVoidTicketInstance(supplierId = supplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(ticketNumbers))
    converterObj.fromSupplier(invoked, ticketNumbers)
  }

  override def voidPNRAsync(supplier: String, ticketNumbers: Seq[String])(implicit exec: ExecutionContext): Future[VoidTicketResponse] = for {
    converterObj <- Future(converterServices.getVoidTicketInstance(supplier))
    invokerObj <- Future(invokerServices.getVoidTicketInstance(supplierId = supplier))
    invoked <- invokerObj.invokeAsync(converterObj.toSupplier(ticketNumbers))
    result <- Future.successful(converterObj.fromSupplier(invoked, ticketNumbers))
  } yield result

  override def cancelPNR(cancelRequest: PNRRequest): PNRDetails = {
    val converterObj = (converterServices.getCancelInstance(cancelRequest.supplier))
    val invokerObj = (invokerServices.getCancelInstance(supplierId = cancelRequest.supplier))
    val invoked = invokerObj.invoke(converterObj.toSupplier(cancelRequest))
    (converterObj.fromSupplier(invoked, cancelRequest))
  }

  override def cancelPNRAsync(cancelRequest: PNRRequest)(implicit exec: ExecutionContext): Future[PNRDetails] = for {
    converterObj <- Future(converterServices.getCancelInstance(cancelRequest.supplier))
    invokerObj <- Future(invokerServices.getCancelInstance(supplierId = cancelRequest.supplier))
    invoked <- invokerObj.invokeAsync(converterObj.toSupplier(cancelRequest))
    converted <- Future.successful(converterObj.fromSupplier(invoked, cancelRequest))
  } yield converted

  override def readPNR(request: PNRRequest): PNRInfoResponse = {
    val converterObj = converterServices.getReadPNRInstance(request.supplier)
    val invokerObj = invokerServices.getReadPNRInstance(supplierId = request.supplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(request))
    converterObj.fromSupplier(invoked, request)
  }

  override def readPNRAsync(request: PNRRequest)(implicit exec: ExecutionContext): Future[PNRInfoResponse] = for {
    converterObj <- Future(converterServices.getReadPNRInstance(request.supplier))
    invokerObj <- Future(invokerServices.getReadPNRInstance(supplierId = request.supplier))
    invoked <- invokerObj.invokeAsync(converterObj.toSupplier(request))
    converted <- Future.successful(converterObj.fromSupplier(invoked, request))
  } yield converted

  override def closeSession(sessionId: String, supplier: String): Boolean = {
    val converterObj = converterServices.getCloseSession(supplier)
    val invokerObj = invokerServices.getCloseSession(supplierId = supplier)
    val invoked = invokerObj.invoke(converterObj.toSupplier(sessionId))
    converterObj.fromSupplier(invoked, sessionId)
  }

  override def closeSessionAsync(sessionId: String, supplier: String)(implicit exec: ExecutionContext): Future[Boolean] = for {
    converterObj <- Future(converterServices.getCloseSession(supplier))
    invokerObj <- Future(invokerServices.getCloseSession(supplierId = supplier))
    invoked <- invokerObj.invokeAsync(converterObj.toSupplier(sessionId))
    converted <- Future.successful(converterObj.fromSupplier(invoked, sessionId))
  } yield converted

}
