package flight.converter.amadeus.restapi

//import com.amadeus.Amadeus
import dto.enums.Supplier
import utils.SupplierConfigManager

trait AmadeusSession {

  lazy val supplierConfigs = SupplierConfigManager.getSupplierInfo(Supplier.AMADEUS_RESTAPI)
//
//  lazy val amadeus: Amadeus = Amadeus
//    .builder(supplierConfigs("apiKey").configValue, supplierConfigs("apiSecret").configValue)
//    .build()

}
