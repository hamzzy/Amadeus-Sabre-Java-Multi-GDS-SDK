package flight.converter.amadeus.tripxml

import dto.enums.Supplier
import flight.converter.Converter
import flight.dto.entity.{PNRIssueTicketRequest, PNRIssueTicketResponse}
import utils.SupplierConfigManager
import wsimport.lib.amadeus.pnr.issue._

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:04 PM.
  */
object AmadeusIssueTicketConverter extends Converter[TTIssueTicketRQ, PNRIssueTicketResponse] {

  override def toSupplier(baseDto: AnyRef): TTIssueTicketRQ = {
    val request = baseDto.asInstanceOf[PNRIssueTicketRequest]
    val supplierCredential = SupplierConfigManager.getSupplierInfo(Supplier.AMADEUS)
    val tTIssueTicketRQ = new TTIssueTicketRQ
    tTIssueTicketRQ.setPOS(createPOS())
    val pnrID = new UniqueID
    pnrID.setID(request.pnrRef)
    tTIssueTicketRQ.setUniqueID(pnrID)
    val ticketing = new Ticketing
    if (request.ticketType.isDefined) ticketing.setTicketType(request.ticketType.get)
    if(request.issueMCO) ticketing.setIssueMCO(request.issueMCO)
    val fulfilment = new Fulfillment
    val arrayOfPaymentDetails = new ArrayOfPaymentDetail
    val paymentDetail = new PaymentDetail
//    paymentDetail.setMiscChargeOrder()
    arrayOfPaymentDetails.getPaymentDetail.add(paymentDetail)
    fulfilment.setPaymentDetails(arrayOfPaymentDetails)
//    tTIssueTicketRQ.getFulfillment.getPaymentDetails.getPaymentDetail.get(0).getMiscChargeOrder

    tTIssueTicketRQ.setTicketing(ticketing)
    tTIssueTicketRQ.setFulfillment(fulfilment)
//    println(StringUtil.classToXmlString(tTIssueTicketRQ))
    tTIssueTicketRQ
  }

  private[this] def createPOS(supplierId: String = dto.enums.Supplier.AMADEUS): POS = {
    val config = SupplierConfigManager.getSupplierInfo(supplierId)
    val pos = new POS
    val source = new Source
    source.setPseudoCityCode(config("pseudoCityCode").configValue)
    val requestorID = new RequestorID
    requestorID.setType(config("requestor.type").configValue)
    requestorID.setID(config("requestor.id").configValue)
    source.setRequestorID(requestorID)

    val tpaExtension = new TPAExtensions
    val provider = new Provider
    provider.setName(config("name").configValue)
    provider.setSystem(config("system.mode").configValue)
    provider.setUserid(config("requestor.id").configValue)
    provider.setPassword(config("provider.password").configValue)
    tpaExtension.setProvider(provider)
    pos.setSource(source)
    pos.setTPAExtensions(tpaExtension)
    pos
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRIssueTicketResponse = {
    val tTIssueTicketRS = response.asInstanceOf[TTIssueTicketRS]
//    println(StringUtil.classToXmlString(tTIssueTicketRS))
    val status = if (tTIssueTicketRS.getErrors != null && tTIssueTicketRS.getErrors.getError.size() > 0) "failed" else "success"
    PNRIssueTicketResponse(status)
  }

}
