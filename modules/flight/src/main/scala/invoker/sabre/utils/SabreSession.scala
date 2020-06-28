package flight.invoker.sabre.utils

import flight.invoker.sabre.client.{SabreXMLLogger, SoapUtils}

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Igbalajobi Jamiu O. on 26/02/2017 2:16 AM.
  */
trait SabreSession extends SoapUtils with SabreXMLRequestUtils with SabreXMLLogger {

  def session(implicit ex: ExecutionContext) = {
    val response = toNode(soapRequest(SabreXMLRequestUtils.sessionCreateXmlRequest.toString(), ENDPOINT_URL))
    logXml(response, SESSION_RS_LOGFILE)
    (response \\ "BinarySecurityToken").text
  }
}
