package flight.converter

import flight.dto.entity.{BaseDto, _}

/**
  * Created by Igbalajobi Jamiu O. on 25/11/2016 1:08 AM.
  */
trait Converter[A, B] {

  def toSupplier(baseDto: AnyRef): A

  def fromSupplier(response: AnyRef, request: AnyRef): B

}
