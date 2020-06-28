package flight.converter.amadeus.epower

import flight.converter.Converter
import scala.xml.XML

/**
  * Created by Igbalajobi Jamiu O. on 10/24/17.
  */
object EPowerAmadeusSignOutConverter extends Converter[String, Boolean] with EPowerHeader {

  override def toSupplier(baseDto: AnyRef): String = {
    baseDto.asInstanceOf[String]
  }

  override def fromSupplier(response: AnyRef, request: AnyRef): Boolean = {
    true
  }
}
