package flight.converter.amadeus.epower

import wsimport.lib.epower.{AuthenticationSoapHeader, ObjectFactory}
import dto.enums.Supplier
import utils.SupplierConfigManager

/**
  * Created by Igbalajobi Jamiu O. on 10/25/17.
  */
trait EPowerHeader {

  lazy val supplierConfigs = SupplierConfigManager.getSupplierInfo(Supplier.EPOWER_AMADEUS)

  object ConstKey {
    val E_USERNAME = "supplier.username"
    val E_PASSWORD = "supplier.password"
    val E_CLIENTID = "supplier.clientid"
    val E_WSDL_URL = "supplier.wsdlurl"
    val E_CURRENCY = "supplier.currency"
    val E_RESULT_PER_QUERY = "supplier.resultperquery"
    val E_EFT_RESULT_PER_QUERY = "supplier.eftresultperquery"
  }

  import ConstKey._
  def getAuthenticationHeader: AuthenticationSoapHeader = {
    val authenticationSoapHeader = new AuthenticationSoapHeader
    authenticationSoapHeader.setWSUserName(supplierConfigs(E_USERNAME).configValue)
    authenticationSoapHeader.setWSPassword(supplierConfigs(E_PASSWORD).configValue)
    authenticationSoapHeader.setWSCultureInfo(supplierConfigs(E_CLIENTID).configValue)
    authenticationSoapHeader
  }
}
