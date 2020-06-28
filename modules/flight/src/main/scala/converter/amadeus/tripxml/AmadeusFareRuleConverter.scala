package flight.converter.amadeus.tripxml

import java.util.GregorianCalendar

import flight.converter.Converter
import flight.dto.entity.{FareRuleResponse, FlightInfoRequest}
import utils.StringUtil
import javax.xml.datatype.XMLGregorianCalendar
import wsimport.lib.amadeus.wsairrules._

object AmadeusFareRuleConverter extends Converter[OTAAirRulesRQ, FareRuleResponse] {

  override def toSupplier(baseDto: AnyRef): OTAAirRulesRQ = {
    val flightInfoRequest = baseDto.asInstanceOf[FlightInfoRequest]
    val pos: POS = POSBuilder.createInstance
    val oTAAirRulesRQ = new OTAAirRulesRQ
    oTAAirRulesRQ.setPOS(pos)
    val ruleReqInfos = flightInfoRequest.itineraryWSResponse.airItineraryWSResponse.originDestinationWSResponses.map { originDestination =>
      val ruleReqInfo = new RuleReqInfo

      val departingAirport = new DepartureAirport
      departingAirport.setLocationCode(originDestination.getOriginAirportCode)
      departingAirport.setCodeContext("IATA")
      ruleReqInfo.setDepartureAirport(departingAirport)

      val arrivalAirport = new ArrivalAirport
      arrivalAirport.setLocationCode(originDestination.getDestinationAirportCode)
      arrivalAirport.setCodeContext("IATA")
      ruleReqInfo.setArrivalAirport(arrivalAirport)

      ruleReqInfo.setDepartureDate(originDestination.getDepartureDateTime)
      val filingAirline = new FilingAirline
      filingAirline.setCode(originDestination.getMarketingAirlineCode)
      ruleReqInfo.setFilingAirline(filingAirline)
      ruleReqInfo
    }
    oTAAirRulesRQ.setRuleReqInfo(ruleReqInfos.head)
    println(StringUtil.classToXmlString(oTAAirRulesRQ))
    oTAAirRulesRQ
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): FareRuleResponse = {
    val oTAAirRulesRS = response.asInstanceOf[OTAAirRulesRS]

    FareRuleResponse()
  }

  implicit private def gregorianToString(date: String): XMLGregorianCalendar = {
    val cal = new GregorianCalendar
    import javax.xml.datatype.DatatypeFactory
    DatatypeFactory.newInstance.newXMLGregorianCalendar(cal)
  }

}
