package flight.converter.crane.pojo

import dto.enums.Supplier
import utils.SupplierConfigManager


case class CraneHeader(username: String,
                       password: String,
                       clientIp: String,
                       preferredCurrency: String,
                       language: String,
                       endpointUrl: String,
                       mcoNumber: Option[String] = None
                      )

object CraneHeaderBuilder {
  lazy val config = SupplierConfigManager.getSupplierInfo(Supplier.CRANE)

  def createInstance: CraneHeader = CraneHeader(
    username = config("supplier.username").configValue,
    password = config("supplier.password").configValue,
    clientIp = config("supplier.clientIp").configValue,
    preferredCurrency = config("supplier.currency").configValue,
    language = config("supplier.language").configValue,
    endpointUrl = config("supplier.endpointUrl").configValue,
    mcoNumber = Option(config("supplier.mcoNumber").configValue)
  )

}