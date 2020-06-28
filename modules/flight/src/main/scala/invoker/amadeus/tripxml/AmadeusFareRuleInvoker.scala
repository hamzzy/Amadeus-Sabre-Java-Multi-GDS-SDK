package flight.invoker.amadeus.tripxml

import flight.invoker.Invoker
import wsimport.lib.amadeus.wsairrules.{OTAAirRulesRQ, OTAAirRulesRS, WsAirRules}

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 5:07 PM.
  */
object AmadeusFareRuleInvoker extends Invoker[OTAAirRulesRS] {

  override def invokeAsync(value: AnyRef)(implicit executionContext: ExecutionContext): Future[OTAAirRulesRS] = Future {
    invoke(value)
  }

  override def invoke(value: AnyRef): OTAAirRulesRS = {
    val oTAAirRulesRQ = value.asInstanceOf[OTAAirRulesRQ]
    new WsAirRules()
      .getWsAirRulesSoap
      .wmAirRules(oTAAirRulesRQ)
  }
}
