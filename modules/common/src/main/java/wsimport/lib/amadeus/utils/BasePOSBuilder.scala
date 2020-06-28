package wsimport.lib.amadeus.utils

import dto.enums.Supplier
import utils.{SupplierConfig, SupplierConfigManager}

object BasePOSBuilder {
  lazy val config: Map[String, SupplierConfig] = SupplierConfigManager.getSupplierInfo(Supplier.AMADEUS)
  lazy val NAME: String = config("name").configValue
  lazy val PCC: String = config("pseudoCityCode").configValue
  lazy val SYSTEM: String = config("system.mode").configValue
  lazy val USERNAME: String = config("provider.userID").configValue
  lazy val PASSWORD: String = config("provider.password").configValue
  lazy val DEFAULT_CURRENCY: String = config("currency.naira").configValue
  lazy val REQUESTOR_ID: String = config("requestor.id").configValue
  lazy val REQUESTOR_TYPE: String = config("requestor.type").configValue
  lazy val MATRIX_ENDPOINT_URL: String = config("lowfarematrix.endpoint").configValue
}
