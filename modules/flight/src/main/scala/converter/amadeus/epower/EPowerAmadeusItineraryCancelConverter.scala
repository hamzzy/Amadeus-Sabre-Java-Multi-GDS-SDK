package flight.converter.amadeus.epower

import flight.converter.Converter
import flight.dto.entity.{FlightSearchRequest, FlightSearchResponse, PNRDetails, PNRRequest}
import wsimport.lib.epower.Cancel.OTACancelRQ
import wsimport.lib.epower.VerificationType.PersonName
import wsimport.lib.epower._
import dto.BookingStatus
import utils.StringUtil

import scala.collection.JavaConversions._

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object EPowerAmadeusItineraryCancelConverter extends Converter[Cancel, PNRDetails] with EPowerHeader {

  override def toSupplier(baseDto: AnyRef): Cancel = {
    val cancelRequest = baseDto.asInstanceOf[PNRRequest]
    val cancel = new Cancel

    val otaCancelRQ = new OTACancelRQ
    otaCancelRQ.setCancelType(TransactionActionType.COMMIT)
    val uniqueID = new UniqueIDType
    uniqueID.setType("F")
    uniqueID.setIDContext(cancelRequest.pnrRef)
    otaCancelRQ.setBookingReferenceID(uniqueID)
    val verificationType = new VerificationType
    val personName = new PersonName
    personName.setSurname(cancelRequest.surname)
    verificationType.setPersonName(personName)
    otaCancelRQ.getVerification.add(verificationType)
    cancel.setOTACancelRQ(otaCancelRQ)
//    println(utils.StringUtil.classToXmlString(cancel))
    cancel
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRDetails = {
    val pnrDetails = new PNRDetails()
    val otaCancelRS = response.asInstanceOf[CancelResponse]
//    println(utils.StringUtil.classToXmlString(otaCancelRS))
    val status = otaCancelRS.getOTACancelRS.getStatus.value()
    if (status.equalsIgnoreCase("Committed")) {
      pnrDetails.setStatus(BookingStatus.CANCELLED)
    }
    pnrDetails
  }
}
