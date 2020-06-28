package flight.converter.sabre

import flight.converter.Converter
import flight.dto.entity._

/**
  * Created by Igbalajobi Jamiu O. on 15/02/2017 10:42 PM.
  */
object SabreReadItineraryConverter extends Converter[String, PNRDetails] {

  override def toSupplier(baseDto: AnyRef): String = ???

  override def fromSupplier(response: AnyRef, request: AnyRef): PNRDetails = ???

}
