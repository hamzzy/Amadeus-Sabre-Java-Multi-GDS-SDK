package flight.converter.amadeus.tripxml

import java.util.Date

import dto.enums.Supplier
import flight.converter.Converter
import flight.dto.entity.VoidTicketResponse
import utils.SupplierConfigManager

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:04 PM.
  */
object AmadeusVoidTicketConverter extends Converter[String, VoidTicketResponse] {

  override def toSupplier(baseDto: AnyRef): String = {
    val request = baseDto.asInstanceOf[Seq[String]]
    val supplierCredential = SupplierConfigManager.getSupplierInfo(Supplier.AMADEUS)
    <TT_VoidTicketRQ Version="1.0">
      <POS>
        <Source PseudoCityCode={supplierCredential("pseudoCityCode").configValue}>
          <RequestorID Type={supplierCredential("requestor.type").configValue} ID={supplierCredential("requestor.id").configValue}/>
        </Source>
        <TPA_Extensions>
          <Provider>
            <Name>{supplierCredential("name").configValue}</Name>
            <System>{supplierCredential("system.mode").configValue}</System>
            <Userid>{supplierCredential("provider.userID").configValue}</Userid>
            <Password>{supplierCredential("provider.password").configValue}</Password>
          </Provider>
        </TPA_Extensions>
      </POS>
      <Tickets>
        {
          request.map { ticket =>
            <TicketNumber>{ticket}</TicketNumber>
          }
        }
      </Tickets>
    </TT_VoidTicketRQ>
  }.toString()

  override def fromSupplier(response: AnyRef, request: AnyRef): VoidTicketResponse = {

    VoidTicketResponse("", Nil, new Date())
  }

}
