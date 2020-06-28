package flight.converter.amadeus.tripxml

import flight.converter.Converter
import flight.dto.entity.{PNRDetails, PNRRequest}
import wsimport.lib.amadeus.pnr.cancel.{OTACancelRQ, OTACancelRS, WsPNRCancel}

import scala.collection.JavaConverters._
import scala.collection.JavaConversions._

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:04 PM.
  */
object AmadeusCancelBookingConverter extends Converter[OTACancelRQ, PNRDetails] {

  override def toSupplier(baseDto: AnyRef): OTACancelRQ = {
    val request = baseDto.asInstanceOf[PNRRequest]
    val pnrRef = request.pnrRef
    val wsPnrCancel = new WsPNRCancel()
    wsPnrCancel.getWsPNRCancelSoap
    val otaCancelRQ = new OTACancelRQ
    otaCancelRQ.setPOS(wsimport.lib.amadeus.pnr.cancel.POSBuilder.createInstance())
    val uniqueID = new wsimport.lib.amadeus.pnr.cancel.UniqueID()
    uniqueID.setID(pnrRef)
    otaCancelRQ.getUniqueID.add(uniqueID)
    otaCancelRQ
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRDetails = {
    val pnrDetails = new PNRDetails()
    val otaCancelRS = response.asInstanceOf[OTACancelRS]
    pnrDetails.setResponse(otaCancelRS.getStatus)
    Option(otaCancelRS.getErrors) match {
      case Some(_) => pnrDetails.setErrors(otaCancelRS.getErrors.getError.asScala.toList.map(_.getMessage))
        pnrDetails.setStatus(dto.BookingStatus.FAILED)
      case _ => pnrDetails.setStatus(dto.BookingStatus.CANCELLED)
    }
    pnrDetails
  }

}
