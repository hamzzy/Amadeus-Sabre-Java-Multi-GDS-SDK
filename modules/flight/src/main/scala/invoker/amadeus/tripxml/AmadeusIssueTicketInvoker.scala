package flight.invoker.amadeus.tripxml

import flight.invoker.Invoker
import wsimport.lib.amadeus.pnr.issue.{TTIssueTicketRQ, TTIssueTicketRS, WsIssueTicket}

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:28 PM.
  */
object AmadeusIssueTicketInvoker extends Invoker[TTIssueTicketRS] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[TTIssueTicketRS] = Future {
    invoke(value)
  }

  override def invoke(value: AnyRef): TTIssueTicketRS = {
    val tTIssueTicketRQ = value.asInstanceOf[TTIssueTicketRQ]
    new WsIssueTicket()
      .getWsIssueTicketSoap
      .wmIssueTicket(tTIssueTicketRQ)
  }
}
